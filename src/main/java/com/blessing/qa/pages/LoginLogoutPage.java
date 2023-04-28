package com.blessing.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.blessing.qa.base.BasePage;

public class LoginLogoutPage extends BasePage {

	
	@FindBy(id="user-name")
	WebElement userid;

	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement megamenubtn;
	
	
	@FindBy(id="logout_sidebar_link")
	WebElement logout;
	
	
	
	public LoginLogoutPage() throws IOException {
		PageFactory.initElements(driver, this);

	}

	public void Login(String useridIs,String password) {
		userid.sendKeys("standard_user");
		pwd.sendKeys("secret_sauce");
		loginButton.click();
		megamenubtn.click();
		//logout.click();
		
	}
	
}
