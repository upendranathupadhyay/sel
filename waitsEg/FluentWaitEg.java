package waitsEg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWaitEg {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://www.makemytrip.com");
		driver.findElement(By.cssSelector("a[data-code='F']")).click();
		driver.findElement(By.id("one_way_button1")).click();
		driver.findElement(By.id("from_typeahead1")).clear();
		driver.findElement(By.id("from_typeahead1")).sendKeys(
				"Pune, India (PNQ)");
		driver.findElement(By.id("to_typeahead1")).clear();
		driver.findElement(By.id("to_typeahead1")).sendKeys(
				"New Delhi, India (DEL)");
		driver.findElement(By.id("start_date_sec")).click();

		WebElement element = driver.findElement(By
				.xpath(".//*[@id='ui-datepicker-div']"));
		List<WebElement> columns = element.findElements(By.tagName("td"));

		String date = "20";
		for (WebElement cell : columns) {

			if (cell.getText().equals(date)) {

				cell.findElement(By.linkText(date)).click();
				break;

			}

		}

		driver.findElement(By.id("flights_submit")).click();

		FluentWait<WebDriver> waitF = new FluentWait<WebDriver>(driver)
				.withTimeout(1, TimeUnit.SECONDS)
				.pollingEvery(100, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement modifySearch = waitF
				.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {

						WebElement modifySearch = driver.findElement(By
								.xpath(".//*[@class='pull-right modify_search_toggle ng-scope']"));
						return modifySearch;

					}
				});

		modifySearch.click();
	}

}
