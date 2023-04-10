package com.blessing.qa.test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.blessing.qa.base.BasePage;
import com.blessing.qa.pages.KhetriyaKaryalayListHomePage;
import com.blessing.qa.pages.LoginLogoutPage;

public class LoginPageTest extends BasePage {

	LoginLogoutPage loglog;

	public LoginPageTest() throws IOException {
		super();
		
	}
	
	@BeforeClass
	public void setUp() throws IOException, InterruptedException{
		String browserName=prop.getProperty("browser");
	
		System.out.println("the browser is"+browserName);
		String url=prop.getProperty("url");
		initialization(browserName,url);
		loglog = new LoginLogoutPage();
		String userid=prop.getProperty("userid");
		String password=prop.getProperty("pwd");
		loglog.Login(userid,password);
		Thread.sleep(1000);
	}
	@Test
	public void Test1() {
		
		LoginLogoutPage loginPage=PageFactory.initElements(driver, LoginLogoutPage.class);
		//loginPage.Login("rekhakathayat94@gmail.com", "Rekha@2407");
		
		System.out.println("..........this is first Test........");
	}
	
	@Test
	public void Karyal1() {
		KhetriyaKaryalayListHomePage spi=PageFactory.initElements(driver,KhetriyaKaryalayListHomePage.class);
		String kshetriyaKaryalayListMenuText=spi.kshetriyaKaryalayListMenu();
		//Assert.assertEquals(shuttleHomeText, "DESTINATION EXPERIENCES","shuttleHomeText not matching");
		Reporter.log("shuttleHomeText verified succesfully");
	}
	@AfterClass
	public void tearDown() throws IOException, InterruptedException{
		loglog = new LoginLogoutPage();
		loglog.LogOut();
		driver.quit();
	}
}
