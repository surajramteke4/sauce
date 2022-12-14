package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginPage 
{

	WebDriver driver;
	
	//username
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;
	
	public void SendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	
	//password
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	public void SendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement loginbutton;
	
	public void LoginButton()
	{
		loginbutton.click();
	}
	
	
	
	public POMLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
	
	
	
	
	
}
