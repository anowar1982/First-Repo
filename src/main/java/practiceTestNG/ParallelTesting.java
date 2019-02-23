package practiceTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utility.VerificationUtil;

import cucumber.api.java.eo.Do;

public class ParallelTesting {	
	By logot = By.id("hplogo"); //By.xpath("//*[@id='hplogo']"); // By.id("hplogo");
	By mailLink = By.linkText("Gmail");
	By ImageLink = By.linkText("Images");
	
	WebDriver driver;
	SoftAssert assertion = new SoftAssert();
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp (String browser){	
		System.out.println("browser name" +browser);
		if(browser.equalsIgnoreCase("chrome")){		
		System.out.println("@BeforeMethod thread no "+Thread.currentThread().getId());		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anowa\\Downloads\\all drivers\\chromedriver_win32\\chromedriver.exe");    	
		driver = new ChromeDriver(); 
		driver.get("https://www.google.com");   
    	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);  		
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
      	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		} 
		else if(browser.equalsIgnoreCase("ie")){		
			System.out.println("browser name" +browser);
		System.out.println("@BeforeMethod thread no "+Thread.currentThread().getId());		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\anowa\\Downloads\\all drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");    	
		driver = new InternetExplorerDriver(); 
		driver.get("https://www.google.com");   
	    driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);  		
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();			
			
		}
    		
    	
	}

	@Test(threadPoolSize = 3)
	public void googleTitleTest(){
		System.out.println("googleTitleTest thread no "+Thread.currentThread().getId());		
		String tile = driver.getTitle();
		//assertion.assertEquals(tile, "Google123");		
		VerificationUtil.areEqual(tile, "Google");		
	}
	
	@Test()
	public void googleLogoTest(){
		System.out.println("googleLogoTest thread no "+Thread.currentThread().getId());
		boolean logo = driver.findElement(logot).isDisplayed();		
		assertion.assertEquals(logo, true);
	}
	
	@Test()
	public void MailLinkTest(){
		System.out.println("MailLinkTest thread no "+Thread.currentThread().getId());
		boolean mail= driver.findElement(mailLink).isDisplayed();
		assertion.assertTrue(mail);		
	}
	
	@Test()
	public void ImageLinkTest(){
		System.out.println("ImageLinkTest thread no "+Thread.currentThread().getId());
		boolean Img= driver.findElement(ImageLink).isDisplayed();
		assertion.assertTrue(Img);				
	}
	
	@AfterMethod
	public void tearDown(){	
		
		//driver.close();
		System.out.println("@AfterMethod thread no "+Thread.currentThread().getId());
	}	
	@AfterTest()
	public void afterTest(){
		System.out.println("@AfterTest thread no "+Thread.currentThread().getId());
		//driver.close();
		//driver.notifyAll();
		do{
		driver.quit();
		}while (driver!=null);
		assertion.assertAll();
		     
	}


}
