package com.popup;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.webdriven.commands.Click;


public class Scroller {

	
	private WebDriver driver;
	
	/*@Test
	public void TestCommerce() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium & Other Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://www.ehow.com");
		
		Actions builder = new Actions(driver);
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,4300)");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(".//*[@id='Footer']/div[1]/div/div/div[3]/div/div[2]/ul/li[3]/a"));
		
		builder.moveToElement(element).build().perform();
		
		element.click();
		
		
		HandleWindow("eHow (@eHow) | Twitter");
		
		HandleWindow("eHow | How to - Discover the expert in you! | eHow");
		
	}
	
	public void HandleWindow(String s)
	{
		Set<String> windows = driver.getWindowHandles();
		for(String window : windows)
		{
			driver.switchTo().window(window);
			if(driver.getTitle().contains(s))
			{
				System.out.println(driver.getTitle());
				break;
			}
		}
		return;
	}
	*/
	
	@Test
	public void runCssSelector() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium & Other Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com/");
		driver.findElement(By.cssSelector("li[class$='hide_us'] a span[class='tab_txt']")).click();
		
		driver.findElement(By.cssSelector("a#one_way_button")).click();
		
/*		driver.findElement(By.cssSelector("input#flightDeparture_1")).sendKeys("Jaipur, India (JAI)");
		driver.findElement(By.cssSelector("input#flightDeparture_1")).click();*/
		driver.findElement(By.cssSelector("input#flightDeparture_1")).sendKeys( "Jaipur, India (JAI)"+Keys.TAB+ "Pune, India (PNQ)"+Keys.ENTER +Keys.TAB + "Pune, India (PNQ)"+Keys.TAB +Keys.TAB+Keys.TAB +Keys.TAB+Keys.ENTER);
		
		//driver.findElement(By.cssSelector("td[class$='current-day'] a")).click();
		
		//driver.findElement(By.cssSelector("")).click();
		

		
		
		//driver.findElement(By.cssSelector("span[class='twitter-typeahead'] input[class='typeahead-dep-city input-md form-control field-transparent tt-input']")).sendKeys("Faizabad");
		
		
	}
	
	
	
}
