package S15Sorted;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filters {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASHRITH\\eclipse-workspace\\ITLearn2020\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement> veggis = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> filterList =veggis.stream().filter(s->s.getText().contains("Rice"))
		.collect(Collectors.toList());
		
		
		Assert.assertEquals(veggis.size(),filterList.size());

	}

}
