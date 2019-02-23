package practiceTestNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.ExcelUtil;



public class DataProviderTest {
	By firstNme = By.id("txtFirstName");
	By lastNme = By.id("txtLastName");
	By address1 = By.name("address1");
	By address2 = By.id("txtAddress2");
	By zip = By.id("txtZipPostalCode");
	By country = By.xpath("//*[@id='selCountry']");
	By phone = By.xpath("//*[@id='txtphone1']");
	By cancelBtn = By.xpath("//*[@id='btnCancel']");
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp (){		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anowa\\Downloads\\chromedriver_win32\\chromedriver.exe");    	
		driver = new ChromeDriver(); 
		driver.get("https://www.qvc.com/webapp/wcs/stores/servlet/UserRegistrationForm?storeId=10251&catalogId=10151&langId=-1&krypto=GkgPP8ajkNE8TVe7kigdgwQS%2BNEQVSjqy3oi2k5kRg4%3D&ddkey=https%3AOrderStatus");   
    	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);  		
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
      	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
	}
	@DataProvider
	public Iterator<Object[]> getTestData (){
		ArrayList<Object[]> testData= ExcelUtil.getDataFromExcel();
		return testData.iterator();
	}

	@Test(dataProvider ="getTestData")
	public void ebayPage(String firstNm, String lastNm, String adress1, String adress2, String zipC, String cntry, String phn){		
		driver.findElement(firstNme).clear();
		driver.findElement(firstNme).sendKeys(firstNm);
		
		driver.findElement(lastNme).clear();
		driver.findElement(lastNme).sendKeys(lastNm);
		
		driver.findElement(address1).clear();
		driver.findElement(address1).sendKeys(adress1);
		
		driver.findElement(address2).clear();
		driver.findElement(address2).sendKeys(adress2);		
		
		driver.findElement(zip).clear();
		driver.findElement(zip).sendKeys(zipC);
		
		
		driver.findElement(country).sendKeys(cntry);
		//driver.findElement(country).clear();
		
		driver.findElement(phone).clear();
		driver.findElement(phone).sendKeys(phn);
		
		driver.findElement(cancelBtn).click();
		
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){			
		driver.quit();
	}
}
