package com.blessing.qa.generic;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.SecureRandom;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

		 public static void WaitForElementPresent(WebElement element, int time) throws Exception {


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
		
		public static void ReadData() throws IOException{
			String fileSepr = System.getProperty("file.separator");
	        String excelFilepath = System.getProperty("user.dir") + fileSepr + "Rquirement_Bulk.xlsx";
	        System.out.println("excelFilepath" +excelFilepath);
			FileInputStream fs = new FileInputStream(excelFilepath);
		    XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheetAt(6);
			System.out.println(sheet.getRow(1).getCell(0));
		    System.out.println(sheet.getRow(1).getCell(1));
			
	}
}

