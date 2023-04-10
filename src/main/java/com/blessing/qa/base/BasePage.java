package com.blessing.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage {

	public static Properties prop;
	public static WebDriver driver;
	public String propertiesPath=System.getProperty("user.dir");
	public BasePage() throws IOException{
		prop = new Properties();
		
		System.out.println("the path is:"+propertiesPath);
		
		FileInputStream file = new FileInputStream(propertiesPath+"/src/main/java/com/qa/blessing/config/configuration.properties");
	prop.load(file);
	}
	public WebDriver initialization(String browserName,String URL) {
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",propertiesPath+"/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.out.println("we do not support this browser");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
	}
}
