package com.blessing.qa.test.UI;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.blessing.qa.base.BasePage;
import com.blessing.qa.pages.LoginLogoutPage;

public class TestBase extends BasePage {
	LoginLogoutPage loglog;
	public TestBase() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException{
		String browserName=prop.getProperty("browser");
		System.out.println("the browser is"+browserName);
		String url=prop.getProperty("url");
		initialization(browserName,url);
		LoginLogoutPage login=PageFactory.initElements(driver, LoginLogoutPage.class);
		String userid=prop.getProperty("userid");
		String password=prop.getProperty("pwd");
		login.Login(userid,password);		
		Thread.sleep(1000);
		}
	
	
	@AfterMethod
	public void tearDown() throws IOException, InterruptedException{
		LoginLogoutPage login=PageFactory.initElements(driver, LoginLogoutPage.class);
		driver.quit();
	}
}
