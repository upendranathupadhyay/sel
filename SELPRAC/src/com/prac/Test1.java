package com.prac;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test1 
{
	@Test
	public void testCase() throws MalformedURLException
	{
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		URL url = new URL("http","localhost",4444,"/wd/hub");
		capabilities.setJavascriptEnabled(true);
		WebDriver driver=new RemoteWebDriver(url,capabilities);
		//open website
		driver.get("http://www.makemytrip.com/");
		//open tab of hotel
		driver.findElement(By.cssSelector("#widget_row div[1] div div[2] ul li[4] a span[1]")).click();
		//driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div[1]/div[2]/ul/li[3]/a/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='from_city_data_box']")).click();
		driver.findElement(By.id("from_city_data_box")).sendKeys("Koregaon Park, Pune"+Keys.RETURN);
		
		driver.findElement(By.xpath(".//*[@id='nightAnchor']/div")).click();
		driver.findElement(By.xpath(".//*[@id='nightAnchor']/div/p[2]")).click();
		
		driver.findElement(By.xpath(".//*[@id='roomDiv_1']/div/div/div[2]/div/div/a[2]")).click();
		driver.findElement(By.xpath(".//*[@id='hotels_submit']")).click();
		

	}
}
