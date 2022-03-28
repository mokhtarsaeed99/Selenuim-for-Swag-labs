package frist_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Invalid_Login {
	WebDriver driver;
	
	@BeforeMethod
	public void FristSteps()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\mokhtar\\programs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
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
	@Test(priority = 1)
	public void InvalidName()
	{
		WebElement UsernameText = driver.findElement(By.id("user-name"));
		WebElement PasswordText = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		UsernameText.sendKeys("testing");
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
		String expectedresult = "https://www.saucedemo.com/inventory.html";
		String actualresult = driver.getCurrentUrl();
		System.out.println(actualresult);
		Assert.assertEquals(actualresult, expectedresult);	
		
	}
	@Test(priority = 2)
	public void Invalidpass()
	{
		WebElement UsernameText = driver.findElement(By.id("user-name"));
		WebElement PasswordText = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		UsernameText.sendKeys("standard_user");
		PasswordText.sendKeys("123");
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
		String expectedresult = "https://www.saucedemo.com/inventory.html";
		String actualresult = driver.getCurrentUrl();
		System.out.println(actualresult);
		Assert.assertEquals(actualresult, expectedresult);
		
		
	}
	@Test(priority = 2)
	public void Invalidpass_and_username()
	{
		WebElement UsernameText = driver.findElement(By.id("user-name"));
		WebElement PasswordText = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		UsernameText.sendKeys("testing");
		PasswordText.sendKeys("123");
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
		String expectedresult = "https://www.saucedemo.com/inventory.html";
		String actualresult = driver.getCurrentUrl();
		System.out.println(actualresult);
		Assert.assertEquals(actualresult, expectedresult);
		
		
	}
}
