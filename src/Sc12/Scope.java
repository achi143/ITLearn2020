package Sc12;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// give me the count of the links on the page

		System.getProperty("webDriver.chrome.driver",
				"C:\\Users\\ASHRITH\\eclipse-workspace\\ITLearn2020\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");

		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size()); // this is the limiting webelement scope

		WebElement fotterdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(fotterdriver.findElements(By.tagName("a")).size());

		WebElement Columdriver = fotterdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(Columdriver.findElements(By.tagName("a")).size());

		// click on each link in the colum and check if pages are opening

		for (int i = 1; i < Columdriver.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			Columdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);

			Thread.sleep(5000);
		}

		Set<String> Title = driver.getWindowHandles();
		Iterator<String> it = Title.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());

			System.out.println(driver.getTitle());
		}
	}

}
