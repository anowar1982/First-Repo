package practiceTestNG;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utility.CustomListener;
import com.utility.VerificationUtil;


@Listeners(CustomListener.class)
public class GoogleTest {	
	By logot = By.id("hplogo"); //By.xpath("//*[@id='hplogo']"); // By.id("hplogo");
	By mailLink = By.linkText("Gmail");
	By ImageLink = By.linkText("Images");
	
	WebDriver driver;
	SoftAssert assertion = new SoftAssert();
	
	@BeforeMethod
	public void setUp (){		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anowa\\Downloads\\chromedriver_win32\\chromedriver.exe");    	
		driver = new ChromeDriver(); 
		driver.get("https://www.google.com");   
    	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);  		
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
      	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
	}

	@Test(priority=1, groups = "display")
	public void googleTitleTest(){
		String tile = driver.getTitle();
		//assertion.assertEquals(tile, "Google123");		
		VerificationUtil.areEqual(tile, "Google123");		
	}
	
	@Test(dependsOnMethods ="ImageLinkTest", groups = "display")
	public void googleLogoTest(){
		boolean logo = driver.findElement(logot).isDisplayed();		
		assertion.assertEquals(logo, true);
	}
	
	@Test(priority=3, groups = "linktest", invocationCount=3)
	public void MailLinkTest(){
		boolean mail= driver.findElement(mailLink).isDisplayed();
		assertion.assertTrue(mail);		
	}
	
	@Test(groups = "linktest", dependsOnMethods ="MailLinkTest")
	public void ImageLinkTest(){
		boolean Img= driver.findElement(ImageLink).isDisplayed();
		assertion.assertTrue(Img);		
	}
	
	@AfterMethod
	public void tearDown(){			
		driver.close();
	}	
	@AfterTest
	public void afterTest(){
		assertion.assertAll();
	}
}
