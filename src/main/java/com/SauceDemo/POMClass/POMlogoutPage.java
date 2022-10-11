package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMlogoutPage
{
	WebDriver driver;
	
	@FindBy (xpath = "//button[@id='react-burger-menu-btn']")
	WebElement menu;
	
	public void menubutton()
	{
		menu.click();
	}
	
	@FindBy (xpath = "//a[@id='logout_sidebar_link']")
	WebElement logoutbutton;
	
	public void logout()
	{
		logoutbutton.click();
	}
	
	public POMlogoutPage(WebDriver driver)
	{
		this.driver  = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	

}
