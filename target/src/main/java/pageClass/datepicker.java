package pageClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.get("https://jqueryui.com/datepicker/");

	        driver.switchTo().frame(0);

	        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	        
	        while (true) {
	            String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	            String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	            
	            if (month.equals("January") && year.equals("2030")) {
	                driver.findElement(By.xpath("//a[text()='2']")).click();
	                break;
	            } else {
	                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	            }
	        }

	        Thread.sleep(2000);
	        driver.quit();
	    

		}}
