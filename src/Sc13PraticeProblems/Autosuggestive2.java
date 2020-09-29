package Sc13PraticeProblems;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.getProperty("webDriver.chrome.driver",
				"C:\\Users\\ASHRITH\\eclipse-workspace\\ITLearn2020\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		
		WebElement scope=driver.findElement(By.id("fromcity"));
		scope.click();
		scope.sendKeys("MUM");
		Thread.sleep(3000);
		scope.sendKeys(Keys.ENTER);
		
		WebElement dest=driver.findElement(By.id("toCity"));
		dest.click();
		dest.sendKeys("hyd");
		Thread.sleep(3000);
		dest.sendKeys(Keys.ARROW_DOWN);
		dest.sendKeys(Keys.ENTER);

	}

}
