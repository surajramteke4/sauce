package com.SauceDemo.POMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMHomepage 
{
	private WebDriver driver;
	private Select s;
	private Actions act;
	//logoutmenubutton
	@FindBy (xpath = "//button[@id='react-burger-menu-btn']")
	WebElement menu;
	
	public void menubutton()
	{
		menu.click();
	}
	
	//logoutbutton
	@FindBy (xpath = "//a[@id='logout_sidebar_link']")
	WebElement logoutbutton;
	
	public void logout()
	{
		logoutbutton.click();
	}
	
	
	//filter tab
	@FindBy (xpath ="//select[@class='product_sort_container']")
	WebElement filter;
	
	public void filtertabmethod()
	{
		filter.click();
//		Select s = new Select(filter);
		s.selectByVisibleText("Price (high to low)");
	}
	
	//filter text
	public String textFilter()
	{
		String acutaltextonfilter = s.getFirstSelectedOption().getText();
		return acutaltextonfilter;
	}
	
	
	
	
	
	
	
	
	//add cart bat
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
	WebElement BagpackCart;
	
	public void BagAddtoCart()
	{
		BagpackCart.click();
	}
	
	//cart text for validation
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement addtocarttext;
	
	public String AddtoCartText()
	{
		String actualaddtocarttext = addtocarttext.getText();
		return actualaddtocarttext;
	}
	
	//mouse actions
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement BikeLight;
	
	public void getBikeLightToCart() throws InterruptedException
	{

		act.moveToElement(BikeLight).perform();
		Thread.sleep(3000);
		act.click(BikeLight).perform();
	}
	
	//to select all products from cart
	@FindBy(xpath = "//button[text()='Add to cart']")
	List<WebElement> addalltheproducts;
	
	public void selectallproducts()
	{
		for(WebElement a : addalltheproducts )
		{
			a.click();
		}
	}
	//add to cart button text
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement AddToCartButton;
	
	public String AddToCartButtonClick()
	{
		
		String CartDetails = AddToCartButton.getText();
		return CartDetails;
	}
	
	
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement CartButtonClick;
	public void ClickCartButton()
	{
		CartButtonClick.click();
	}
	

	
	
	
	
	
	
	
	
	
	
	//constructor of POM class
	public POMHomepage(WebDriver driver)
	{
		this.driver  = driver;
		PageFactory.initElements(driver,this);
		s = new Select(filter);
		act = new Actions(driver);
	}
	
	
}

