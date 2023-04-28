package com.blessing.qa.test.UI;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.blessing.qa.pages.KhetriyaKaryalayListHomePage;

public class UpdeshListTest extends TestBase {


		public UpdeshListTest() throws IOException {
			super();
		}
		@Test
		public void Karyal1() {
			KhetriyaKaryalayListHomePage spi=PageFactory.initElements(driver,KhetriyaKaryalayListHomePage.class);
		}
}
