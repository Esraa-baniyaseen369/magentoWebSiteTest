package firstProjectAutomationJulay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwaglabProject {
	WebDriver driver = new ChromeDriver();

	@BeforeTest()
	public void mySetup() {
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void loginTest() throws InterruptedException {

		String UserName = "standard_user";
		String Password = "secret_sauce";

		WebElement UserNameInput = driver.findElement(By.id("user-name"));
		WebElement PasswordInput = driver.findElement(By.id("password"));
		WebElement LoginButtun = driver.findElement(By.id("login-button"));

		UserNameInput.sendKeys(UserName);
		Thread.sleep(500);
		PasswordInput.sendKeys(Password);
		Thread.sleep(500);
		LoginButtun.click();

	}

	@Test(priority = 2)
	public void addtoCartAllItems() throws InterruptedException {

		List<WebElement> AddtocartButtuns = driver.findElements(By.className("btn"));

		for (int i = 0; i < AddtocartButtuns.size(); i++) {
			AddtocartButtuns.get(i).click();
			Thread.sleep(500);
			if (i == 3)
				break;
		}
		Thread.sleep(1000);

	}

	@Test(priority = 3)
	public void removeElements() throws InterruptedException

	{
		List<WebElement> removeElements = driver.findElements(By.className("btn"));

		for (int i = 3; i < removeElements.size(); i--) {
			removeElements.get(i).click();
			Thread.sleep(500);
			if (i == 0)
				break;
		
		}

	}

}
