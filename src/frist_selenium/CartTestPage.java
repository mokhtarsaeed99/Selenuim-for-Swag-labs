package frist_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTestPage {

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
	@Test
	public void Cart()
	{
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
		WebElement cart = driver.findElement(By.className("shopping_cart_link"));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cart.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement check = driver.findElement(By.id("checkout"));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		check.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expectedresult = "https://www.saucedemo.com/checkout-step-one.html";
		String actualresult = driver.getCurrentUrl();
		Assert.assertEquals(actualresult, expectedresult);
		
	}
}
