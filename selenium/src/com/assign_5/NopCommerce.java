package com.assign_5;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce {

	@Test
	public void TestCommerce()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium & Other Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.nopcommerce.com");
		//Print all element under footer of customer Service tag
		String value=driver.findElement(By.xpath("html/body/div[5]/div[4]/div[1]/div[2]/ul")).getText();
		System.out.println(value);
		//driver.findElement(By.cssSelector("[class $='footer-block customer-service'] .list li[5] a")).click();
		driver.findElement(By.xpath("html/body/div[5]/div[4]/div[1]/div[2]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("html/body/div[5]/div[1]/div[2]/div[1]/a/img")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
		driver.findElement(By.xpath(".//*[@id='small-search-box-form']/input[2]")).click();
		driver.findElement(By.xpath("html/body/div[5]/div[3]/div/div[1]/div[2]/div[2]/ul/li[2]/a")).click();
		driver.get("http://demo.nopcommerce.com/electronics");
		
	}
	
	
}
