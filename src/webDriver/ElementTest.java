package webDriver;

import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTest {

	public static void main(String[] args) {

		String actualTitle = "";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualText = "";
		String expectedText = "Login Successfully failed";
		HSSFSheet sheet;

		// drivers of browser
		// Java Jar file

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaWorkSpaceNew-Selenium1Jan2021\\1stday\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		actualTitle = driver.getTitle();

		System.out.println("Actual Title: " + actualTitle);

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");

		}
		// login
		driver.findElement(By.name("userName")).sendKeys("Username");
		driver.findElement(By.name("password")).sendKeys("username");
		driver.findElement(By.name("submit")).click();
		// validation
		actualText = driver.findElement(By.xpath("//h3[contains(text(), 'Login Successfully')]")).getText();
		
		
//		driver.close();
//		driver.navigate().refresh();
//		driver.navigate().back();
//		driver.navigate().forward();

		if (actualText.contentEquals(expectedText)) {
			System.out.println("Login Successfully - Passed");
		} else {
			System.out.println("Login Successfully - Failed");

		}

	}

}
