package practiceTestNG;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuit(){
		System.out.println("@BeforeSuite--1");
	}
	@BeforeTest
	public void beforeTestMethod(){
		System.out.println("@BeforeTest--2");
	}	
	@BeforeClass
	public void beforeClassMethod(){
		System.out.println("@BeforeClass--3");
	}
	@BeforeMethod
	public void beforeMethod (){
		System.out.println("@BeforeMethod--4");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anowa\\Downloads\\chromedriver_win32\\chromedriver.exe");    	
		driver = new ChromeDriver(); 
	}
	@Test
	public void test1(){
		System.out.println("@Test--5");
	}
	@Test
	public void test2(){
		System.out.println("@Test--6");
	}
	@Test
	public void test3(){
		System.out.println("@Test--7");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("@AfterMethod--8");
		driver.close();
	}
	@AfterClass()
	public void afterClass(){
		System.out.println("@AfterClass--9");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("@AfterTest--10");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("@AfterSuite--11");
	}
}
