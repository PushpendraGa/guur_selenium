package pageClass;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testinfBaba {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.testingbaba.com/old/newdemo.html");

		driver.findElement(By.xpath("//h2[@class=\"mb-0\"]/button[@data-target=\"#elements\"]")).click();

		driver.findElement(By.xpath("//div[@class=\"card-body\"]/div[@id=\"v-pills-tab\"]/a[text()=\"text box\"]"))
				.click();

		WebElement fullname = driver.findElement(By.id("fullname1"));

		String addname = "ankit123";

		fullname.sendKeys(addname);

		driver.findElement(By.id("fullemail1")).sendKeys("pkgaur567@gmail.com");

		driver.findElement(By.id("fulladdresh1")).sendKeys("village post aulina bulandshahr");

		driver.findElement(By.id("paddresh1")).sendKeys("village post aulina bulandshahr");

		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-6 mt-5']//label[@id='fullname']"));

		String expectedString = ele.getText();
		
		System.out.println(expectedString);

		assertEquals(addname, expectedString);
		
		System.out.println("pushpendra kumar gaur");

		Thread.sleep(5000);
		 driver.quit();

	}

}
