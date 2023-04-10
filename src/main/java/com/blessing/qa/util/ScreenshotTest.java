package com.blessing.qa.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.utils.FileUtil;

public class ScreenshotTest {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adarsh.kumar2\\Desktop\\Batch22\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://vyupdesh-env.eba-yziyjms4.us-east-1.elasticbeanstalk.com/");
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("./screenshots/screen.png"));
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		File file1=sc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file1,  new File("./screenshots/sc1.png") );
		
		File file2=sc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file2,  new File("./screenshots/sc2.png") );
	}

}
