package com.blessing.qa.test.UI;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.blessing.qa.pages.KhetriyaKaryalayListHomePage;

public class UpdeshtaListTest extends TestBase {
public UpdeshtaListTest() throws IOException {
		super();
	} 
@Test
public void Karyal1() {
	KhetriyaKaryalayListHomePage spi=PageFactory.initElements(driver,KhetriyaKaryalayListHomePage.class);
	//String shuttleHomeText=spi.kshetriyaKaryalayListMenu();
	//Assert.assertEquals(shuttleHomeText, "DESTINATION EXPERIENCES","shuttleHomeText not matching");
	//Reporter.log("shuttleHomeText verified succesfully");
}
}
