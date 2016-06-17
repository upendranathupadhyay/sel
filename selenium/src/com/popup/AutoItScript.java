package com.popup;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutoItScript {

private WebDriver driver;
	
	@Test
	public void TestCommerce() throws InterruptedException, IOException
	{
		/*String[] Param = new String[]{"D:\\new selenium\\selenium_script\\first.exe" , "Windows Security" , "aakashsh", "Jaimatadi2@"};
		Runtime.getRuntime().exec(Param);
		System.setProperty("webdriver.ie.driver","D:/Selenium & Other Jars/IEDriverServer.exe");
		driver =new InternetExplorerDriver();
		driver.get("http://cybagemis.cybage.com/Framework/Iframe.aspx");
		*/
		
		//Run Script
				String []param1=new String[]{"D:/new selenium/selenium_script/fileupload.exe","Open"};
				Runtime.getRuntime().exec(param1);
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium & Other Jars\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://cybintranet:8085/HomePage_Applications/Submit%20a%20photo.aspx");
				driver.findElement(By.id("flupWeddingImage")).click();
				
			    Thread.sleep(5000);
			    System.out.println(driver.findElement(By.id("flupWeddingImage")).getAttribute("value"));
		
	}
	
	
}
