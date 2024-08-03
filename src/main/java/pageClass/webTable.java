package pageClass;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.testingbaba.com/old/newdemo.html");

		driver.findElement(By.xpath("//h2[@class=\"mb-0\"]/button[@data-target=\"#elements\"]")).click();

		driver.findElement(By.xpath("//div[@class=\"card-body\"]/div/a[text()=\"web tables\"]")).click();

		driver.switchTo().frame(1);

		WebElement name = driver.findElement(By.xpath("/html/body/div/form/div[1]/input"));

		String Exepectedname = "pushpendrap";

		name.sendKeys(Exepectedname);
		
		

		driver.findElement(By.xpath("/html/body/div/form/div[2]/input")).sendKeys("pkg201297@gmail.com");

		driver.findElement(By.xpath("/html/body/div/form/button")).click();

		List<WebElement> listOfuser = driver
				.findElements(By.xpath("//table[@class=\"table table-bordered data-table\"]/tbody/tr/td[1]"));

		for (int i = 0; i < listOfuser.size(); i++) {

			String actulaString = listOfuser.get(i).getText();
			
			
			if (actulaString.equalsIgnoreCase(Exepectedname)) {
				
				
				assertEquals(actulaString, Exepectedname);
				
				System.out.println("push");
				
				
			}

		}

	}

}
