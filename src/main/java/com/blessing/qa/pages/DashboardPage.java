package com.blessing.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blessing.qa.base.BasePage;

public class DashboardPage extends BasePage {

	/*
	 * @FindBy(xpath="(//span[contains(text(),'rekha ram')])[2]") WebElement
	 * homePageText;
	 */
	
	public DashboardPage() throws IOException {
	PageFactory.initElements(driver, this);
	}
	
	public void homePageTitle() {
		String title=driver.getTitle();
		System.out.println("The title is"+title);
		//String textOnHomePage=homePageText.getText();
		//System.out.println("The text on HomePage"+textOnHomePage);
	}

}
