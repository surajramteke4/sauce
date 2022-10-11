package com.SauceDemo.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.POMHomepage;
import com.SauceDemo.POMClass.POMLoginPage;
import com.utilities.TestBaseClass;

public class TestCase__ToValidateADDtoCart extends TestBaseClass 
{
 
	
		@Test
		public void SelectAllProduct()
		{
		POMHomepage hp = new POMHomepage(driver);
		hp.selectallproducts();
		
		String GivenProuctinCart = "6";
		String ActualCart = hp.AddToCartButtonClick();
		
		Assert.assertEquals(ActualCart, GivenProuctinCart);
		
		
		
		}	
		
	}

	

