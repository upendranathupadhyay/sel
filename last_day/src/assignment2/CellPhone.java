package assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CellPhone {

	private WebDriver driver;
	
	@FindBy(xpath="html/body/div[5]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[1]/a[1]")
	private WebElement grid;
	
	@FindBy(id="'products-orderby")
	private WebElement orderDropDown;
	
	@FindBy(xpath=".//*[@id='products-orderby']/option[4]")
	private WebElement lowToHigh;
	
	@FindBy(xpath="html/body/div[5]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div[3]/div[2]/input[1]")
	private WebElement mobile;
	
	@FindBy(xpath=".//*[@id='bar-notification']/p/a")
	private WebElement shoppingCart;
	
	public CellPhone(WebDriver driver)
	{
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	public void clickOnGrid()
	{
		click(grid);
	}
	
	public void click(WebElement element)
	{
		 element.click();
	}
	
	public void  findMinPrice()
	{ 
		/*Select option = new Select(orderDropDown);
		option.selectByIndex(3);*/
		
		click(lowToHigh);
		click(mobile);
	}
	public Cart clickShoppinCart()
	{
		click(shoppingCart);
		return new Cart(driver);
	}
}
