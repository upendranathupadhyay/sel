package com.demo2;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Demo2 
{
	public  WebDriver driver;
	
	@Test
	public void testCase() throws MalformedURLException
	{
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		URL url = new URL("http","localhost",4444,"/wd/hub");
		capabilities.setJavascriptEnabled(true);
		WebDriver driver=new RemoteWebDriver(url,capabilities);
		driver.get("http://www.cleartrip.com/");
		
		driver.findElement(By.xpath(".//*[@id='Home']/div/aside[1]/nav/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.id("Tags")).sendKeys("Hawa Mahal, Jaipur");
		//driver.findElement(By.xpath(".//*[@id='ui-id-355']")).click();
		
		driver.findElement(By.xpath(".//*[@id='CheckInDate']")).sendKeys("Tue, 7 Jun, 2016");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[2]/td[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='CheckOutDate']")).sendKeys("Wed, 8 Jun, 2016");
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[2]/td[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='travellersOnhome']/option[1]")).click();
		driver.findElement(By.id("SearchHotelsButton")).click();
		//driver.findElement(By.id("CheckInDate"));
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a"));
		
	}
}
