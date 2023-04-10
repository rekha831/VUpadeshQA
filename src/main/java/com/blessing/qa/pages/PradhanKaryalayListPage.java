package com.blessing.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blessing.qa.base.BasePage;
import com.blessing.qa.generic.GenericMethods;

public class PradhanKaryalayListPage extends BasePage {

	public PradhanKaryalayListPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='dropdown-item']")
	WebElement PradhanKaryalayListMenu ;
	
	@FindBy(xpath="(//span[contains(text(),'Pradhan Karyalay List')])[1]")
	WebElement pradhanKaryalayText;
	
	public void pradhanKaryalay() {
		PradhanKaryalayListMenu.click();
		GenericMethods genMethods=PageFactory.initElements(driver, GenericMethods.class);
		
	}

	

}