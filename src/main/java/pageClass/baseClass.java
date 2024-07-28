package pageClass;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.xpath("//div[@class=\"card-body\"]/h5[text()='Elements']"));

		js.executeScript("arguments[0].scrollIntoView();", element);
		
		

		System.out.println(element.isDisplayed());

		element.click();
		
//		Actions act = new Actions(driver);
//		act.moveToElement(element).build().perform();
//		
//		System.out.println("nme");

		WebElement textbox = driver.findElement(By.xpath("//span[text()=\"Text Box\"]"));

		textbox.click();

		WebElement fullname =   driver.findElement(By.id("userName"));
		WebElement fullemail = driver.findElement(By.id("userEmail"));
		WebElement cAddress = driver.findElement(By.id("currentAddress"));
		WebElement paddres = driver.findElement(By.id("permanentAddress"));
		WebElement submit = driver.findElement(By.id("submit"));

		fullname.sendKeys("pushpendra kumar gaur");
		fullemail.sendKeys("pkg201297@gmail.com");
		cAddress.sendKeys("village post aulina bulandshahr");
		paddres.sendKeys("greater Noida sec 36");

		submit.click();

		WebElement name = driver.findElement(By.id("name"));
		String expected = name.getText();
		WebElement actual = fullname;
		
		assertEquals(actual, expected);
		
		System.out.println("name");
		
	

		Thread.sleep(5000);
		driver.close();

	}

}
