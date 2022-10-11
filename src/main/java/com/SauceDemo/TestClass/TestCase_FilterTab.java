package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.POMHomepage;
import com.SauceDemo.POMClass.POMLoginPage;
import com.utilities.GetScreenshots;
import com.utilities.TestBaseClass;

public class TestCase_FilterTab extends TestBaseClass 
{
	
		
		@Test
		public void CheckFilter()
		{
		POMHomepage hp = new POMHomepage(driver);
		
		hp.filtertabmethod();
		
		System.out.println("now we applied filter on the tab");
		
		String givenTextonFilter = "Price (high to low)";
		
		String acutalTextonFilter = hp.textFilter();
		
		Assert.assertEquals(acutalTextonFilter, givenTextonFilter);
		
		
		}
	

}
