package assignment1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {

	private WebDriver driver;
	
	@Before
	public void start()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.cybage.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void TestDemo()
	{
		HomePage homePage = new HomePage(driver);
		System.out.println("BEFORE CLICK WORLDWIDE->"+time());
		WorldWideLocationPage page=homePage.clickWorld();
		System.out.println("AFTER CLICK WORLDWIDE->"+time());
		page.clickGermany();
		System.out.println("AFTER CLICK GERMANY->"+time());
	}
	
	public String time()
	{
		String time=new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		return time;
	}
	
	@After
	public void end()
	{
		driver.quit();
	}
}
