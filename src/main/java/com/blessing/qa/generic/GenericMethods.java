package com.blessing.qa.generic;
	import java.io.IOException;
	import java.security.SecureRandom;
	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.Reporter;

	import com.blessing.qa.base.BasePage;

	public class GenericMethods extends BasePage{
		public static WebDriver driver;

		public GenericMethods() throws IOException {
			super();

		}

		 public static void WaitForElementPresent1(WebElement element, int time) throws Exception {


				WebDriverWait newWait = new WebDriverWait(driver, time);
				newWait.until(ExpectedConditions.visibilityOf(element));


			}
		//Verify Title
		public void verifyTitle(String etitle,int time)
	    {
	           try{
	                 WebDriverWait Wait = new WebDriverWait(driver,200);
	         Wait.until(ExpectedConditions.titleIs(etitle));
	         Reporter.log("title is matching: "+etitle,true);

	              }
	           catch(Exception e){
	                 Reporter.log("title is not matching; Expected title is  "+etitle,true);
	                 Assert.fail();

	           }
	    }


	    public void selectByText(WebElement element,String text)
	    {
	    	Select sel=new Select(element);
	    	sel.selectByVisibleText(text);
	    }

	    

		public static String generateRandomInteger(int len) {
			String AB = "0123456789";
			SecureRandom rnd = new SecureRandom();

			StringBuilder sb = new StringBuilder(len);
			for (int i = 0; i < len; i++)
				sb.append(AB.charAt(rnd.nextInt(AB.length())));
			return sb.toString();
		}
}

