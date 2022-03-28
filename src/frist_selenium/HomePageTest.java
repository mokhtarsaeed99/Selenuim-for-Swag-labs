package frist_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
	WebDriver driver ;

	@BeforeMethod 
	public void FristSteps()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\mokhtar\\programs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement UsernameText = driver.findElement(By.id("user-name"));
		WebElement PasswordText = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		UsernameText.sendKeys("standard_user");
		PasswordText.sendKeys("secret_sauce");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginButton.click();
	}
	@AfterMethod
	public void LastStep()
	{ 
		driver.quit();
	}
	
	@Test(priority = 1)
	public void clickOnProduct()
	{
		WebElement ProductImg = driver.findElement(By.className("inventory_item_img"));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ProductImg.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement addtocart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addtocart.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement AllProduct = driver.findElement(By.id("back-to-products"));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AllProduct.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expectedresult = "https://www.saucedemo.com/inventory.html";
		String actualresult = driver.getCurrentUrl();
		Assert.assertEquals(actualresult, expectedresult);
		
	}
	
}
