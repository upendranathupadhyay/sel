package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;
	
	@FindBy(xpath=".//*[@id='WebPartWPQ1']/div[1]/ul/li[4]/a")
	private WebElement worldwideButton;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WorldWideLocationPage clickWorld()
	{
		worldwideButton.click();
		return new WorldWideLocationPage(driver);
	}
}
