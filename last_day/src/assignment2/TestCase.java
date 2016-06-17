package assignment2;

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
		driver.get("http://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void TestDemo()
	{
		HomePage homePage=new HomePage(driver);
		CellPhone cellPhone = homePage.clickonCellphone();
		cellPhone.clickOnGrid();
		cellPhone.findMinPrice();
		Cart cart = cellPhone.clickShoppinCart();
		cart.verifyProductName();
		cart.clickRemoveandUpadate();
		cart.verifyMessage();
	}
	
	@After
	public void end()
	{
		driver.quit();
	}
	
	public String time()
	{
		String time=new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		return time;
	}
	
}
