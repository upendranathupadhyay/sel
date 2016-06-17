package com.popup;

import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutoItScriptAutantication {

	private WebDriver driver;
	@Test
	public void TestCommerce() throws InterruptedException, IOException
	{
		
				String []param1=new String[]{"D:/new selenium/selenium_script/Auth.exe","Windows Security","aakashsh","abc@123"};
				Runtime.getRuntime().exec(param1);
				System.setProperty("webdriver.ie.driver","D:/Selenium & Other Jars/IEDriverServer.exe");
				driver =new InternetExplorerDriver();
				driver.get("http://cybagemis.cybage.com/");
	}
	
	
	
}
