package firstProjectAutomationJulay;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MySecondTest {

	WebDriver driver = new ChromeDriver();	
	
	
	@BeforeTest
	public void mySetupp() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/inventory.html");
			Thread.sleep(1000);
	}
	
	
	@Test
	
	public void  ATest() throws InterruptedException 
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(1000);
		

	}
	
	  @Test 
	  public void addToCart() throws InterruptedException
	  {
		
		 // List<WebElement> elements = driver.findElements(By.xpath("//button"));    
		//  for(WebElement element : elements)
			//  driver.findElement(By.xpath("//button")).click();
		 // driver.findElements(By.className("//button")).toArray();

		  
		  
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
			Thread.sleep(1000);
		
	  }  
	  
	  @Test
	  public void removeElements() throws InterruptedException
	  
	  {
	   
		  driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
					  Thread.sleep(1000);
					  
			driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
		     
	  }
	
	
}
