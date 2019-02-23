package practiceTestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountOfLinks {
WebDriver driver;
	
	@Test
	public void element_count(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anowa\\Downloads\\chromedriver_win32\\chromedriver.exe");    	
		driver = new ChromeDriver(); 
      	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
		driver.get("https://www.ixl.com/math/grade-2");   
    	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);  		
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    	int a = driver.findElements(By.tagName("a")).size();
    	System.out.println("total links on the page "+a);
    	
    	List<WebElement> lst= driver.findElements(By.tagName("a"));    	
    	for(int i = 0; i<a; i++){
    		System.out.println(lst.get(i).getText());
    	}
    
    	
    
	}
}
