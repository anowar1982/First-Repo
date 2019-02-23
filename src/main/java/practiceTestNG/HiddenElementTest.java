package practiceTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenElementTest {
	WebDriver driver;
	
	@Test(priority=1)
	public void hiddenElementOne(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anowa\\Downloads\\chromedriver_win32\\chromedriver.exe");    	
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		// way One
		 List<WebElement> element = driver.findElements(By.xpath("//input[@id='male']"));
		int lists = element.size();
		for (int i = 0; i<lists; i++){
			WebElement element2 = element.get(i);
			int location = element2.getLocation().x;
			if(location!=0){
				element2.click();
				break;
			}
			
					
		}
		
		//way Two
		 List<WebElement> code = driver.findElements(By.xpath("//input[@type='radio' and @name='lang']"));
		int count2 = code.size();
		for(int i =0; i<count2; i++){
			String text = code.get(i).getAttribute("value");
			System.out.println("text is "+text);
			if (text.equalsIgnoreCase("Ruby")){
				code.get(i).click();
				break;
			}
		}
		
		
		
	}

}
