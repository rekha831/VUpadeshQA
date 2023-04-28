package com.blessing.qa.test.UI;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.blessing.qa.pages.KhetriyaKaryalayListHomePage;

public class KhetriyaKaryalayListHomePageTest extends TestBase {


	public KhetriyaKaryalayListHomePageTest() throws IOException {
		super();
	} 
	@Test
	public void Karyal1() {
		KhetriyaKaryalayListHomePage spi=PageFactory.initElements(driver,KhetriyaKaryalayListHomePage.class);
		spi.kshetriyaKaryalayListMenuClick();
		Reporter.log("karyalaylist succesfully validated");
	}
}
	
