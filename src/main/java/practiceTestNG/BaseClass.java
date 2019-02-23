package practiceTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public BaseClass() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\anowa\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	
	public void failed(String TestMethod){
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File ("E:/Work/mavenProjectFive/ScreenShots/ "+TestMethod+"_.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
