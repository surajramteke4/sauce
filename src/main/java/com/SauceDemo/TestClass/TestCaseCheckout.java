package com.SauceDemo.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.SauceDemo.POMClass.POMCartPage;
import com.SauceDemo.POMClass.POMHomepage;
import com.SauceDemo.POMClass.POMLoginPage;
import com.utilities.TestBaseClass;

public class TestCaseCheckout
{	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver",
			"E:\\driver 106\\chromedriver.exe"); //brower initialize
	
	 driver = new ChromeDriver(); // upcasting
	
	driver.manage().window().maximize(); // method chaining 

	driver.get("https://www.saucedemo.com/"); //method of webdriver
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	System.out.println("sauce demo site got opened");
	

	POMLoginPage x = new POMLoginPage(driver);
	
	x.SendUsername();
	System.out.println("we have entered the username here");
	x.SendPassword();
	System.out.println("we have entered the password here");
	x.LoginButton();
	System.out.println("we have clicked on the login button");
	System.out.println("we are on the homepage of the sauce demo site");
	}
	
	

	@Test
	public void CheckOutPage()
	{
		POMHomepage hp = new POMHomepage(driver);
		hp.selectallproducts();
	hp.ClickCartButton();
		
		POMCartPage cp = new POMCartPage(driver);
		
		
		cp.ClickOnCheckoutButton();
			
		String givenurl = "https://www.saucedemo.com/cart.html";
		String acutalUrl = driver.getCurrentUrl();
		
		SoftAssert soft = new  SoftAssert();
		soft.assertEquals(acutalUrl, givenurl);
			
		
	}
	
	
	
	
	
	
	
	
}
