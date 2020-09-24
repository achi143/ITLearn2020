package Secssion6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASHRITH\\eclipse-workspace\\ITLearn2020\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/?locale=in");

		driver.findElement(By.cssSelector("#username")).sendKeys("vgsh");

		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("sbf4783u");

		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
		
		driver.close();

		/*
		 * All the css selectors
		 * 
		  * customized css selector [name='pw'] we can also write with out the tagname
		 * a[title*='Sign in'] this is used for the regular expression $("") by this we
		 * can check the in the console tagName[attribute='value'] -CSS 
		 * tagName#id- CSS
		 * tagname.classname- CSS 
		 * regular expression tagName[Atrribute*='value'] - Css regular expression 
		 * 
		 */
	}

}
