package practiceTestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicDropdownTest {
	WebDriver driver;
	
	
	@Test
	public void dynamicDropdown(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anowa\\Downloads\\chromedriver_win32\\chromedriver.exe");    	
		driver = new ChromeDriver(); 
      	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");   
    	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);  		
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    	
    	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();
    	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Testing");
    	 List<WebElement> lists = driver.findElements(By.xpath("//*[@class='erkvQe']//li"));
    	 int a = lists.size();
    	 System.out.println("total dropdown list "+a);
    	 for (int i =0; i<=a; i++){
    		 if(lists.get(i).getText().contains(" internet speed")){
    			 System.out.println("it exist in dropdown no "+i);    			
    			//*[@class='erkvQe']//li[9]/descendant::span
    			//*[@class='erkvQe']//li[9]/descendant::div[@class='sbtc']
    			 String beforetxt = "//*[@class='erkvQe']//li[";
    			 String aftertxt = "]/descendant::span";
    			// String aftertxt = "]/descendant::div[@class='sbtc']";
    			 int k = i+1;
    			 String custXpath = beforetxt+k+aftertxt;
    			 System.out.println(custXpath);    			 
    			 driver.findElement(By.xpath(custXpath)).click();
    			 break;
    		 }
    	 }
    	
    	//*[@class='erkvQe']//li
    	//driver.findElement(By.id("q")).sendKeys("Testing");
	}

}
