package practiceTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utility.ClickElement;

public class NotClickableElementTest {
	WebDriver driver;
	@Test
	public void NotClickableElement() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anowa\\Downloads\\chromedriver_win32\\chromedriver.exe");    	
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.src=ym&lang=&done=https%3A%2F%2Fmail.yahoo.com%2F");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("login-username")).sendKeys("Anowar");
		ClickElement.clickByID(driver, "persistent");
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys("ullah");
		driver.findElement(By.xpath("//label[@for='persistent']")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys("Anowar");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("persistent"))).build().perform();
		act.moveToElement(driver.findElement(By.id("persistent"))).doubleClick();
		
		
	}

}
