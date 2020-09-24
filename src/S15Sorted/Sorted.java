package S15Sorted;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sorted {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASHRITH\\eclipse-workspace\\ITLearn2020\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();

		// click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all webelements into list

		List<WebElement> elementslist = driver.findElements(By.xpath("//tr/td[1]"));

		// capture text all webelements into new(orignal)list

		List<String> originalList = elementslist.stream().map(s -> s.getText().collect(Collectors.toList());

		// sort on the original list of step3 -> sorted list

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// compare original list vs sorted list

		Assert.assertTrue(originalList.equals(sortedList));

		List<String> price;

		do {

			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

			price = rows.stream().filter(s -> s.getText().contains("Rice"))

					.map(s -> getpricevegg(s)).collect(Collectors.toList());

			price.forEach(a -> System.out.println(a));

			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (price.size() < 1);

	}

	private static String getpricevegg(WebElement s) {
		// TODO Auto-generated method stub

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
