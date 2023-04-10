package com.blessing.qa.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blessing.qa.base.BasePage;

public class KhetriyaKaryalayListHomePage extends BasePage {

	public KhetriyaKaryalayListHomePage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[text()='Kshetriya Karyalay List']")
	WebElement kshetriyaKaryalayListMenu;

	@FindBy(xpath = "//a[text()='(//a[@class='btn btn-primary'])[1]']")
	WebElement kshetriyaKaryalayListHomePage;
	@FindBy(xpath ="//a[@class='nav-link px-3 active'])[4]")
	WebElement updeshtaListPage;
	public void kshetriyaKaryalayListMenuClick() {
		kshetriyaKaryalayListMenu.click();
	}
	public String kshetriyaKaryalayListMenu() {
		kshetriyaKaryalayListMenu.click();

		Set<String> handles = driver.getWindowHandles();

		String parentWindow = driver.getWindowHandle();
		System.out.println("parent" + parentWindow);

		Iterator<String> itr = handles.iterator();
		String parent = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		System.out.println("child" + childWindow);
		System.out.println("switched to child window successfully");
		String spiceShuttleHomePageText = kshetriyaKaryalayListHomePage.getText();
		driver.switchTo().window(parent);
		return spiceShuttleHomePageText;
	}

}
