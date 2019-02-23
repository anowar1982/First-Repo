package practiceTestNG;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.utility.CustomListener;

@Listeners(CustomListener.class)
public class ScreenShotTest extends BaseClass {

	@BeforeMethod
	public void LunchUrl(){
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleTest(){		
		Assert.assertEquals("Google123", driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
