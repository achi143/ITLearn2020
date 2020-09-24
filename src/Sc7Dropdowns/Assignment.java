package Sc7Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASHRITH\\eclipse-workspace\\ITLearn2020\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("FromTag")).sendKeys("hdd");

		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='list'] a"));

		for (WebElement option : options) {

			if (option.getText().equalsIgnoreCase("Hyderabad, Pakistan - Hyderabad Airport (HDD)")) {

				option.click();
				break;

			}

			Select s = new Select(driver.findElement(By.id("Adults")));

			s.selectByIndex(5);

			Select s2 = new Select(driver.findElement(By.id("Childrens")));

			s2.selectByValue("3");

			driver.findElement(By.id("DepartDate")).click();

			driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
			
			driver.findElement(By.xpath("//a[@title='More search options']")).click();
			
			driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
			
			


/*
			driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");



			driver.findElement(By.id("SearchBtn")).click();

			//validate error message

			System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
*/


		}

	}

}
