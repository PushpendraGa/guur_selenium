package pageClass;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.*;

public class baseClass {

	public WebDriver driver;

	@BeforeTest
	public void lounchBroswer() {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

	public void actioClass() {

		Actions action = new Actions(driver);

	}

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:\\Users\\Admin\\eclipse-workspace\\gaur\\Screenshot\\fullpage.png");
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	

	@AfterClass
	public void closeBroswer() {

		driver.close();
	}

}
