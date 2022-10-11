package com.SauceDemo.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.SauceDemo.POMClass.POMLoginPage;
import com.SauceDemo.POMClass.POMlogoutPage;
import com.utilities.TestBaseClass;

public class TestCase__LogoutFunction extends TestBaseClass
{	
	
		@Test
		public void LogoutFunctionality()
		{
		
		String givenUrl = "https://www.saucedemo.com/inventory.html";
		
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, givenUrl);
		
		}	
		
}
	
	


