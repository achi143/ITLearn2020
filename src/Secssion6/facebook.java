package Secssion6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHRITH\\eclipse-workspace\\ITLearn2020\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("asnfbsjfb@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hsbsdhfv");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String title =driver.getTitle();
		
		System.out.println(title);

	}

}
