package frist_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CeckOutTestPage {

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
	}
	@AfterMethod
	public void LastStep()
	{
		driver.quit();
	}
	@Test
	public void CheckInfo()
	{
		WebElement Fname = driver.findElement(By.id("first-name"));
		Fname.sendKeys("Testing");
		WebElement Lname = driver.findElement(By.id("last-name"));
		Lname.sendKeys("ITI");
		WebElement Pcode = driver.findElement(By.id("postal-code"));
		Pcode.sendKeys("1234567890");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("continue")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("finish")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("back-to-products")).click();
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
