package practiceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollBarTest {
	@Test
	public void ScrollBar() {	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\anowa\\Downloads\\chromedriver_win32\\chromedriver.exe"); 	
	WebDriver driver = new ChromeDriver(); 	// Start browser	 
	driver.manage().window().maximize(); // Maximize browser	 
	driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html"); // Pass application URL
	
	JavascriptExecutor je = (JavascriptExecutor) driver;	// Create instance of Javascript executor
	WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));	//Identify the WebElement which will appear after scrolling down
	je.executeScript("arguments[0].scrollIntoView(true);",element); // now execute query which actually will scroll until that element is not appeared on page.
	System.out.println(element.getText());	// Extract the text and verify
	
	
	/*
	 * /
	 Highlight //flashing = 
	 Scroll =  					js.executeScript("arguments[0].scrollIntoView(true);",element);
	 draw border =				js.executeScript("arguments[0].style.border = '3px solid red'", element);
	 alert = 					js.executeScript("alert("+message+"')"); 
	 click element = 			js.executeScript("arguments[0].click", element);
	 refresh page = 			js.executeScript("history.go(0)");
	 get title = String title = js.executeScript("return document.title;").toString();
	  
	 
	 */
	
	
	
	
	
	
	
	 
	}
	 
	
}


