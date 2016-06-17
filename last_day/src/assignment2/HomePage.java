package assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;
	
	@FindBy(xpath="html/body/div[5]/div[2]/ul[1]/li[2]/a")
	private WebElement electronics;
	
	@FindBy(xpath="html/body/div[5]/div[2]/ul[1]/li[2]/ul/li[2]/a")
	private WebElement cellPhone;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	  public void moveElement(WebElement element)
	  {
		  Actions builder = new Actions(driver);
		  Action action = builder.moveToElement(element).build();
		  action.perform();
	  }
	  
	  public CellPhone click()
	  {
		  cellPhone.click();
		  return new CellPhone(driver);
	  }
	  
	  public CellPhone clickonCellphone()
	  {
		  moveElement(electronics);
		  return click();
	  }
}
