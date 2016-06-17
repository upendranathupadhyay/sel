package com.prac;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class DragDrop {
	private WebDriver driver;
	
	/*@Before
	public void start()
	{
		FirefoxProfile profile=new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		driver=new FirefoxDriver(profile);
	}*/
	
	/*@Test
	public void DragDropEx1()
	{
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions builder=new Actions(driver);
		Action dragdrop=builder.clickAndHold(drag).moveToElement(drop).release(drop).build();
		dragdrop.perform();
	}*/
	
	   /*@Test
	   public void DragDropEx2() throws InterruptedException
	   {
			driver.get("http://marcojakob.github.io/dart-dnd/nested-elements/web/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			
			WebElement drag = driver.findElement(By.xpath("html/body/div[1]/div[1]/p"));
			WebElement drop1 = driver.findElement(By.tagName("textarea"));
			WebElement drop2 = driver.findElement(By.tagName("button"));
			WebElement drop3 = driver.findElement(By.cssSelector(".container .dropzone .inner"));
			Actions builder=new Actions(driver);
			
			Action dragdrop=builder.clickAndHold(drag).moveToElement(drop1).release(drop1).build();
			dragdrop.perform();
			Thread.sleep(3000);
			Action action1 = builder.dragAndDrop(drag, drop2).build();
			action1.perform();
			Thread.sleep(3000);
			Action action2 = builder.dragAndDrop(drag, drop3).build();
			action2.perform();
	   }*/
	
	 /*@Test
	  public void DragDropEx3()
	  {
	   driver.get("http://www.ehow.com/");
	   Actions builder = new Actions(driver);
	   Action action = builder.moveToElement(driver.findElement(By.xpath(".//*[@id='Header']/section/div/div[1]/span/label")))
			   .click(driver.findElement(By.xpath(".//*[@id='Header']/section/div/div[1]/span/div/div[1]/ul[1]/li[2]/a"))).build();
	   action.perform();
	  }*/
	
	 @Test
	  public void Profile()
	  {
		 FirefoxProfile fp=new FirefoxProfile();
		 fp.setPreference("browser.download.folderList", 2);
		 fp.setPreference("browser.download.dir", "D:\\");
		 fp.setPreference("intl.accept_languages", "hi");
		
		 DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		 capabilities.setCapability(FirefoxDriver.PROFILE, fp);
		 
		 driver=new FirefoxDriver(capabilities);
		 driver.get("https://www.google.co.in/");
	
	  }
	
	 /* @Test
	  public void Profile1() throws IOException
	  {
		  ProfilesIni profile = new ProfilesIni();
		  FirefoxProfile myprofile=profile.getProfile("firefoxInstance");
		  driver = new FirefoxDriver(myprofile);
		  driver.get("https://www.eHow.com/");
	  }*/
}
