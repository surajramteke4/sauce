package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GetScreenshots 
{

	public static void TakeScreenshot(WebDriver driver,String Screenshotname) throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
		String date = d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File salefile = ts.getScreenshotAs(OutputType.FILE);
		File myfile = new File("./Screenshot//SauceDemoMven" + Screenshotname + date + ".jpg");
		FileHandler.copy(salefile, myfile);
				
	}
	
	
	
	
	
	
	
	
	
	
}

