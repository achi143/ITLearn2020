package Sc12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// give me the count of the links on the page

		System.getProperty("webDriver.chrome.driver",
				"C:\\Users\\ASHRITH\\eclipse-workspace\\ITLearn2020\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        
       WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
       
       Select s = new Select(dropdown);
       
       s.selectByVisibleText(opt);
       
       driver.findElement(By.name("enter-name")).sendKeys(opt);   
       
       driver.findElement(By.id("alertbtn")).click();
       
       String text =driver.switchTo().alert().getText();
       
       if(text.contains(opt))
       {
    	   System.out.println("mess succ");
       
       
		}else
		{
			System.out.println("not suce");
		}
		
		
	}

}
