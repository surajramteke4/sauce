package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.POMHomepage;
import com.SauceDemo.POMClass.POMLoginPage;
import com.utilities.GetScreenshots;
import com.utilities.TestBaseClass;

public class TestCase_LoginFunctionality extends TestBaseClass
{		
		@Test
		public void loginFuncationality() throws InterruptedException
		{
		String givenTitle ="Swag Labs";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(givenTitle, actualTitle);
		
		String givenurl = "https://www.saucedemo.com/inventory.html";
		String actualurl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualurl, givenurl);
		
		}
		
		
	
	}
	
	

