package com.pracpom;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TEST_POM 
{
	private WebDriver driver;
	@FindBy(xpath="html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/div/input")
	 WebElement search;
	  @FindBy(xpath="html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/ul")
	  WebElement verify;
	@Before
	public void start()
	{
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.get("https://www.google.co.in");
    	driver.manage().window().maximize();
    	
	}
	@Test
	public void operation()
	{
		   PageFactory.initElements(driver, this);

			search.sendKeys("Hercules");
			search.click();
			System.out.println(verify.getText());
		
	}

}
