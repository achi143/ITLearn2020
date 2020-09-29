package Sc13PraticeProblems;

import java.nio.charset.MalformedInputException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExcercises {

	public static void main(String[] args) {

		System.getProperty("webDriver.chrome.driver",
				"C:\\Users\\ASHRITH\\eclipse-workspace\\ITLearn2020\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/30369/rr-vs-kxip-9th-match-indian-premier-league-2020");

		int sum = 0;

		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));

		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();

		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();

		for (int i = 0; i < count - 2; i++) {

			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();

			int valueinteger = Integer.parseInt(value);

			sum = sum + valueinteger;
		}

		// System.out.println(sum);

		String Extres = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();

		int extresvalues = Integer.parseInt(Extres);

		int Totalsumvalues = sum + extresvalues;

		System.out.println(Totalsumvalues);

		String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();

		int ActualTotalValues = Integer.parseInt(ActualTotal);

		if (ActualTotalValues == Totalsumvalues) {
			System.out.println("count matches");
		} else {
			System.out.println("count mismatch");
		}
	}
}
