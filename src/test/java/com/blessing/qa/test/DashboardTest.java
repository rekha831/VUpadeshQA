package com.blessing.qa.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.blessing.qa.pages.DashboardPage;
import com.blessing.qa.pages.PradhanKaryalayListPage;
import com.blessing.qa.pages.KhetriyaKaryalayListHomePage;

public class DashboardTest extends TestBase {


	public DashboardTest() throws IOException {
		super();
	}

	@Test
	public void homePageTest() throws IOException {
		DashboardPage hme = PageFactory.initElements(driver, DashboardPage.class);
		hme.homePageTitle();
		System.out.println();
	}	
	
	@Test
	public void Karyal1() {
		KhetriyaKaryalayListHomePage spi=PageFactory.initElements(driver,KhetriyaKaryalayListHomePage.class);
		String KhetriyaKaryalayListText=spi.kshetriyaKaryalayListMenu();
		Assert.assertEquals(KhetriyaKaryalayListText, "UPDESH","shuttleHomeText not matching");
		Reporter.log("KhetriyaKaryalayListText verified succesfully");
	}

	

}
