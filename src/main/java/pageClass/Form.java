package pageClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Form {

	public static void main(String[] args) throws InterruptedException {

		String Expecteddate = "12";
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement form = driver.findElement(By.xpath("//div[@class=\"card-body\"]/h5[text()='Forms']"));

		js.executeScript("arguments[0].scrollIntoView();", form);

		form.click();

		driver.findElement(By.xpath("//span[text()=\"Practice Form\"]")).click();

		Thread.sleep(5000);
		WebElement name = driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
		String studentName = "pushpendra";
		name.sendKeys(studentName);
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("gaur");
		WebElement mail = driver.findElement(By.id("userEmail"));
		mail.sendKeys("pkg123@gmail.com");
		WebElement gender = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		js.executeScript("arguments[0].scrollIntoView();", gender);
		gender.click();
		WebElement Number = driver.findElement(By.id("userNumber"));
		Number.sendKeys("8279652505");

		WebElement dateBox = driver.findElement(By.id("dateOfBirthInput"));

		dateBox.click();

		 while (true) 
		 {
	            String monthName = driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]")).getText().trim();
	            
	            System.out.println(monthName);
	            
	            String yearName = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).getText().trim();

	            
	            
	            System.out.println(yearName);
	            
	            if (monthName.equalsIgnoreCase("June") && yearName.equalsIgnoreCase("2028") ) 
	            {
	            	System.out.println("p");
	            	
	            	List<WebElement> dayList = driver.findElements(By.xpath("//div[@tabindex=\"-1\"]"));
	            	
	            	
	            	for (WebElement e : dayList) 
	            	{
	            		
	            		String calenderDay = e.getText();
	            		
	            		
	            		
	            		if (calenderDay.equals(Expecteddate)) 
	            		{
							
	            			e.click();
	            			
	            			
	            			
						      }
	            		break;
	            		}
						
	            	break;
	            	
	            }
					         else {
	                driver.findElement(By.xpath("//button[text()='Next Month']")).click();
	            }
		 }
	        

	Thread.sleep(1000);

	driver.findElement(By.xpath("//label[text()=\"Sports\"]")).click();driver.findElement(By.xpath("//label[text()=\"Reading\"]")).click();
	// driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Admin\\Desktop\\resume.txt");

	driver.findElement(By.id("currentAddress")).sendKeys("village post aulina bulandshahr");

	driver.findElement(By.id("submit")).click();
//		
//		String actualtext = studentName;
//		String axepectedtext = driver.findElement(By.xpath("//td[text()=\"pushpendra gaur\"]")).getText();
//		
//		assertEquals(actualtext, axepectedtext);

	WebElement update = driver.findElement(By.xpath("//div[@class=\"modal-body\"]"));
	String updatedata = update.getText();

	System.out.println(updatedata);

	System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

	System.out.println(driver.findElement(By.id("example-modal-sizes-title-lg")).getText());

}}
