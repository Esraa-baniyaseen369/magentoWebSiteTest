package firstProjectAutomationJulay;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTest {
	  
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	  public void mySetup ()  {
		
		driver.get("https://www.google.co.uk/");
      //driver.get("https://www.saucedemo.com/inventory.html");
	    driver.manage().window().maximize();
		
	  }
	
	  @Test
	    public void myFirstTest () throws InterruptedException {
		  
		  driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("ISTQB exam");
		  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		  driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3/span")).click();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  


		  
	  } 
	  
	  

}
