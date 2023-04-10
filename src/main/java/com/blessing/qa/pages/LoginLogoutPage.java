package com.blessing.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blessing.qa.base.BasePage;

public class LoginLogoutPage extends BasePage {

	
	@FindBy(name="username")
	WebElement userid;

	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle ms-2']")
	WebElement logoutBtnMenu;
	
	@FindBy(xpath="//a[@class='dropdown-item']")
	WebElement logoutBtn;
	
	public LoginLogoutPage() throws IOException {
		PageFactory.initElements(driver, this);

	}
public void Login(String useridIs,String password) {
		userid.sendKeys(useridIs);
		pwd.sendKeys(password);
		submitButton.click();	
	}
	public void LogOut() throws InterruptedException {
		Thread.sleep(5000);
		logoutBtnMenu.click();
		logoutBtn.click();
	}
}
