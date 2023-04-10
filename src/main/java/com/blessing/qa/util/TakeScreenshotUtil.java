package com.blessing.qa.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotUtil{
	
	 public static WebDriver driver;
	 
	 public void screenshotOnFailere(String methName) {
		
			TakesScreenshot ts=(TakesScreenshot)driver;
			 
			File source=ts.getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(source, new File("./screenshots/"+"failure_"+methName+""+".png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	 }
	
	

}
