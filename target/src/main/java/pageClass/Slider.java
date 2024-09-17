package pageClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.testingbaba.com/old/newdemo.html");

		driver.findElement(By.xpath("//button[normalize-space()='Widgets']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='slider']")).click();

		WebElement slider = driver.findElement(By.xpath("//input[@id='range-slider']"));

		Actions action = new Actions(driver);

		action.dragAndDropBy(slider, 300, 0);

		Thread.sleep(2000);

		action.perform();

	}

}
