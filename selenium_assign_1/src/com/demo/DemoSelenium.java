package com.demo;

import java.net.MalformedURLException;
import java.net.URL;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;


public class DemoSelenium {
	
	public  WebDriver driver;
	
    @Test
	public void create() throws MalformedURLException
	{
    	DesiredCapabilities capabilities=DesiredCapabilities.chrome();
    	URL url = new URL("http","localhost",4444,"/wd/hub");
    	capabilities.setJavascriptEnabled(true);
    	WebDriver driver=new RemoteWebDriver(url,capabilities);
    	
    	driver.get("http://www.calculator.net/");
    	driver.findElement(By.xpath(".//*[@id='hcalc']/table/tbody/tr/td[2]/div[3]/a")).click();
    	
    	 driver.findElement(By.xpath(".//*[@id='content']/ul[1]/li[3]/a")).click();
         
         
    	
    	
    	driver.manage().window().maximize();
    	
    	
    	
    	
    	
  
	}
}
