package com.utilities;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClass.POMLoginPage;
import com.SauceDemo.POMClass.POMlogoutPage;

public class TestBaseClass 
{	
	
	Logger log = Logger.getLogger("SauceDemoMven");
	public WebDriver driver;
	@Parameters("browserName")
	@BeforeClass
	public void BeforeClassMethod(String browserName) throws IOException
	{
		
	if(browserName.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver",
				"./DriverFiles\\chromedriver.exe"); //brower initialize
		
	 driver = new ChromeDriver(); // upcasting
	}
	else
	{
		System.setProperty("webdriver.gecko.driver",
				"./DriverFiles\\geckodriver.exe"); //brower initialize
		
	 driver = new FirefoxDriver(); // upcasting
	}
	PropertyConfigurator.configure("log4j.properties");
	driver.manage().window().maximize(); // method chaining 
	driver.get("https://www.saucedemo.com/"); //method of webdriver
	GetScreenshots.TakeScreenshot(driver, "suraj");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	log.info("sauce demo site got opened");
	
	}
	

	@BeforeMethod
	public void setUp()
	{


	POMLoginPage x = new POMLoginPage(driver);
	
	x.SendUsername();
	log.info("entered username");
	x.SendPassword();
	log.info("entered password");
	x.LoginButton();
	log.info("clicked on the login button");
	}
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException 
	{
		POMlogoutPage y = new POMlogoutPage(driver);
		
		y.menubutton();
		log.info("clicked on the menu button");
		y.logout();
		log.info("clicked on the logout button");
		
		


	}	
		
		
		@AfterClass
		public void AfterClassMethod() throws InterruptedException
		{
			Thread.sleep(5000);
			
			log.info("end of the program");
		
			driver.quit();
			
		}
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
}
