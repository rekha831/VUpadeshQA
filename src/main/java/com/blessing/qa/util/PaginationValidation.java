package com.blessing.qa.util;
//import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.WebDriver;
	public class PaginationValidation {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\adarsh.kumar2\\Desktop\\Batch22\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("http://vyupdesh-env.eba-yziyjms4.us-east-1.elasticbeanstalk.com/");
	//Thread.sleep(3000);
	WebElement userid = driver.findElement(By.xpath("//input[@id='username']"));
	userid.sendKeys("admin");
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("admin");
	WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
	submitButton.click();
	
	driver.manage().window().maximize();
	WebElement developers_dropdown = driver.findElement(By.xpath("//select[@name='example_length']"));
	Select objSelect = new Select(developers_dropdown);
	objSelect.selectByIndex(3);
	Thread.sleep(1000);
    WebElement textval100 = driver.findElement(By.xpath("//div[@class='col-sm-12 col-md-5']"));
    Thread.sleep(1000);
	Boolean b =textval100.getText().contains("100");
	Thread.sleep(1000);
	if(b==true) {
		System.out.println("100 validation done");
	}
	objSelect.selectByIndex(2);
	Thread.sleep(1000);
    WebElement textval50 = driver.findElement(By.xpath("//div[@class='col-sm-12 col-md-5']"));
    Thread.sleep(1000);
	Boolean b1 =textval50.getText().contains("50");
	 if(b1==true) {
		System.out.println("50 validation done");
	}
	 
	 objSelect.selectByIndex(1);
		Thread.sleep(1000);
	WebElement textval25 = driver.findElement(By.xpath("//div[@class='col-sm-12 col-md-5']"));
	Thread.sleep(1000);
		Boolean b2 =textval50.getText().contains("25");
		 if(b2==true) {
			System.out.println("25 validation done");
		}
	else{
		System.out.println("all pagination validation done");
	}
		
	
	}
	}
