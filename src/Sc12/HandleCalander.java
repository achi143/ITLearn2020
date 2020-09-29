package Sc12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.getProperty("webDriver.chrome.driver",
				"C:\\Users\\ASHRITH\\eclipse-workspace\\ITLearn2020\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");

		// April 14
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.className("day"));

		int count = driver.findElements(By.className("day")).size();
		
		for (int i = 0; i < count; i++) {

			String text = driver.findElements(By.className("day")).get(i).getText();

			if (text.equalsIgnoreCase("29")) {

				driver.findElements(By.className("day")).get(i).click();
				break;

			}
		}

	}

}
