package com.popup;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	private WebDriver driver;
	
	@Test
	public void TestCommerce() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium & Other Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.co.in/");
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('hello world')");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
}
