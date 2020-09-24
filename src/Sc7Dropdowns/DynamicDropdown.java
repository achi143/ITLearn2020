package Sc7Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASHRITH\\eclipse-workspace\\ITLearn2020\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://spicejet.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTNR"))
		
		// and we can also write the xpath with the parent-child relationship
		// bt selecting the parent of the and followed by the child
		
		//xpath("ctl00_mainContent_ddl_originStation1_CTXT")//a[@value='MAA']
		
		// we can provide both through the index and the parent child relationship
		
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

	}

}
