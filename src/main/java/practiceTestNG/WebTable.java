package practiceTestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.velocity.runtime.directive.Foreach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	WebDriver driver;
	
	@Test
	public void webTableTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anowa\\Downloads\\chromedriver_win32\\chromedriver.exe");    	
		driver = new ChromeDriver(); 
		driver.get("https://www.w3schools.com/html/html_tables.asp");   
    	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);  		
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
      	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	int a =driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")).size();
    	System.out.println("total row is "+a);
    	
    	//*[@id="customers"]/tbody/tr[2]/td[1]
    	String befortext = "//*[@id='customers']/tbody/tr[";
    	String aftertext = "]/td[1]";
    	for (int i =2; i<=a; i++){
    		String xpath = befortext+i+aftertext;
    		System.out.println(driver.findElement(By.xpath(xpath)).getText());    		
    	}
    	  
    	
    	 
	}

}
