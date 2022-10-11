package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMCartPage 

{
	public WebDriver driver;
	
	//checkoutbutton
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkoutbutton;
	
	public void ClickOnCheckoutButton()
	{
		checkoutbutton.click();
	}
	
	//RemoveButtonCart
	@FindBy(xpath = "(//button[text()='Remove'])[2]")
	WebElement RemoveCart;
	
	public void ClickonRemoveButtononCart()
	{
		RemoveCart.click();
	}
	
	
	
	
	
	
	public POMCartPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	

}
