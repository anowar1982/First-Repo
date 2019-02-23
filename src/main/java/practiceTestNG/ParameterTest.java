package practiceTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParameterTest {
	By userName = By.id("USER");
	By passWord = By.xpath("//*[@id='PASSWORD']");
	
	WebDriver driver;
	SoftAssert assertion = new SoftAssert();
	
	@Test
	@Parameters({"browser"})
	public void driverSetUp (String browser){	
		if(browser.equals("Chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\anowa\\Downloads\\chromedriver_win32\\chromedriver.exe");    	
				driver = new ChromeDriver(); 
		}	
		else {
			System.out.println("driver is not give");
		}
	}
	
	@Test(dependsOnMethods="driverSetUp")
	@Parameters({"Env","url"})
	public void lunchUrl(String Env, String url){
		if(Env.equals("QA")){
			driver.get(url);   
	    	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);  		
	    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	      	driver.manage().window().maximize();
	    	driver.manage().deleteAllCookies();	
		}		
	}
	
	@Test(dependsOnMethods="lunchUrl")	
	@Parameters({"Uid","Pwd"})
	public void logIn(String Uid, String Pwd){		
			driver.findElement(userName).clear();	
			driver.findElement(userName).sendKeys(Uid);	
			driver.findElement(passWord).clear();	
			driver.findElement(passWord).sendKeys(Pwd);				
	}
	
	
	
	@Test(dependsOnMethods="logIn")	
	public void close(){		
			driver.close();  	
	}

}
