package assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cart {

private WebDriver driver;
	
	@FindBy(xpath="html/body/div[5]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[3]/a")
	private WebElement productVerify;
	
	@FindBy(xpath="html/body/div[5]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[1]/input")
	private WebElement checkBox;
	
	@FindBy(xpath="html/body/div[5]/div[3]/div/div/div/div[2]/div/form/div[2]/div[1]/input[1]")
	private WebElement update;
	
	@FindBy(xpath="html/body/div[5]/div[3]/div/div/div/div[2]/div/div")
	private WebElement message;
	
	public Cart(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	public void verify(WebElement element,String mess)
	{
		Assert.assertEquals(getProductName(element), mess);
	}
	
	public String getProductName(WebElement element)
	{
		return element.getText();
	}
	public void verifyProductName()
	{
		verify(productVerify,"HTC One Mini Blue");
	}
	public void clickRemoveandUpadate()
	{
		checkBox.click();
		update.click();
	}
	public void verifyMessage()
	{
		verify(message,"Your Shopping Cart is empty!");
	}
}
