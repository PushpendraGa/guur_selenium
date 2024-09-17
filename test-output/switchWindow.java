package PageClass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchWindow {

	public static void main(String[] args) {

		String path = "C:\\Repo\\Pushpendra\\NewProject\\Driver\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"blinkingText\"]")).click();

		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentid = it.next();
		String child = it.next();
		driver.switchTo().window(child);

		String username = driver.findElement(By.cssSelector(".im-para.red")).getText().split("with")[0].split("at")[1]
				.trim();
		driver.switchTo().window(parentid);

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys("Push@gmail.com");

	}
}
