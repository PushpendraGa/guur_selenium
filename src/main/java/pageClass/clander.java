package pageClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clander {

	public static void main(String[] args) {
		String Expecteddate = "12";
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		while (true) 
		{
			
	String calenderMonth = 	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	
	String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	
	
	if (calenderMonth.equalsIgnoreCase("April") && calenderYear.equalsIgnoreCase("2030")) 
	{
		
		List<WebElement>  daylist = driver.findElements(By.xpath("//a[@class=\"ui-state-default\"]"));
		
		//a[@class="ui-state-default"]
		//table/tbody/tr/td
		
		for (WebElement e : daylist) {
			
			
			String calenderDay = e.getText();
			
			if (calenderDay.equals(Expecteddate)) {
				
				e.click();  		
		        break;
		
	}
			}
		
	break;
	}
	
	
	else {

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	}
	
		
		
		}
}

}
