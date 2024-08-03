package pageClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/upload-download");

		driver.findElement(By.xpath("//li[@id=\"item-7\"]/span[text()=\"Upload and Download\"]")).click();
		Thread.sleep(2000);
		WebElement file = driver.findElement(By.id("uploadFile"));
		Actions ob = new Actions(driver);
		ob.moveToElement(file).perform();
		
	}
}
