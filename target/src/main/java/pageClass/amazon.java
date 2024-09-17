package pageClass;



	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

	public class amazon  {
	    public static void main(String[] args) {
	        // Path to your ChromeDriver
	        
	    	WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();

	        try {
	            // Open Amazon and search for the product
	            driver.get("https://www.amazon.in/");
	            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
	            driver.findElement(By.id("nav-search-submit-button")).click();

	            // Extract all items and their prices
	            List<WebElement> items = driver.findElements(By.cssSelector(".s-main-slot .s-result-item"));
	            
	            System.out.println(items);
	            double minPrice = Double.MAX_VALUE;
	            WebElement cheapestItem = null;

	            for (WebElement item : items) {
	                try {
	                    String priceString = item.findElement(By.cssSelector(".a-price-whole")).getText().replace(",", "");
	                    double price = Double.parseDouble(priceString);

	                    if (price < minPrice) {
	                        minPrice = price;
	                        cheapestItem = item;
	                    }
	                } catch (Exception e) {
	                    // Handle items without prices or any parsing errors
	                    continue;
	                }
	            }

	            // If a cheapest item is found, proceed to book it
	            if (cheapestItem != null) {
	                cheapestItem.findElement(By.cssSelector(".a-link-normal.a-text-normal")).click();

	                // Assuming you are logged in and have COD enabled
	                driver.findElement(By.id("buy-now-button")).click();
	                
	                // Proceed to checkout and place order
	                driver.findElement(By.name("placeYourOrder1")).click();
	            } else {
	                System.out.println("No items found.");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}


