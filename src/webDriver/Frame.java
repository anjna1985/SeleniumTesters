package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		String alertMessage ="";
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaWorkSpaceNew-Selenium1Jan2021\\1stday\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
//      Frame
//		driver.get("https://demo.guru99.com/selenium/deprecated.html");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.switchTo().frame("classFrame");
//		driver.findElement(By.linkText("Deprecated")).click();
		
// 		Alert
//		driver.get("http://output.jsbin.com/usidix/1");
//		driver.findElement(By.xpath("//input[@value='Go!']")).click();
//		Thread.sleep(5000);
//		alertMessage = driver.switchTo().alert().getText();
//		driver.switchTo().alert().accept();
//		System.out.println(alertMessage);
		
//		Drop-Down
//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		System.out.println(driver.getCurrentUrl());
//		Select s1 = new Select(driver.findElement(By.xpath("//select[@name='country']")));
//		//s1.selectByVisibleText("ANGOLA");
//		s1.selectByIndex(1);
//		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
//		if (dropdown.isEnabled()) {
//			System.out.println("Enabled");
//		} else {
//			System.out.println("Disabled");
//		}
		
		
//		
		
		//driver.close();
		
	}

}
