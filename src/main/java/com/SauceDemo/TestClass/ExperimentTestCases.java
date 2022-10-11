package com.SauceDemo.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.POMHomepage;
import com.utilities.TestBaseClass;

public class ExperimentTestCases extends TestBaseClass 
{
	@Test
	public void loginFuncationality() throws InterruptedException
	{
	String givenTitle ="Swag Labs";
	String actualTitle = driver.getTitle();
	
//	if(givenTitle.equals(actualTitle))
//	{
//		System.out.println("we got the right title");
//		System.out.println("test case passed");
//	}
//	else
//	{
//		System.out.println("test case failed");
//	}
	System.out.println("end of the program");
	
	Assert.assertEquals(actualTitle, givenTitle);
	
	
	}
	
	

	@Test(timeOut = 200)
	public void LogoutFunctionality()
	{
	
	String givenUrl = "https://www.saucedemo.com/";
	String actualUrl = driver.getCurrentUrl();
	if(givenUrl.equals(actualUrl))
	{
		System.out.println("we got the right url");
		System.out.println("test case passsed");
	}
	else
	{
		System.out.println("test case failed");
	}
	}
	
	@Test(priority = 0)
	public void SelectAllProduct()
	{
	POMHomepage hp = new POMHomepage(driver);
	hp.selectallproducts();
	
	String GivenProuctinCart = "6";
	String ActualCart = hp.AddToCartButtonClick();
	
	if(GivenProuctinCart.equals(ActualCart))
	{
		System.out.println("test case passed");
	}
	else
	{
		System.out.println("test case failed");
	}
	
	
	
	}	
	
	
	
	@Test(priority = 1)
	public void CheckFilter()
	{
	POMHomepage hp = new POMHomepage(driver);
	
	hp.filtertabmethod();
	
	System.out.println("now we applied filter on the tab");
	
	String givenTextonFilter = "Price (high to low)";
	
	String acutalTextonFilter = hp.textFilter();
	if(givenTextonFilter.equals(acutalTextonFilter)) 
	{
		System.out.println("text case pass");
	}
	else
	{
		System.out.println("test case failed");
	}
	
	}

	
	
	

}
