package com.blessing.qa.util;

import java.io.File;
import java.io.IOException;
import java.sql.Savepoint;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomListereners.class)
public class TakeScreenshotForFailedTest {
	
	public TakeScreenshotForFailedTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Test
	public void Test1() {
		System.out.println("this is test1");
		//int i=1/0;
	}
	@Test
	public void Test2() {
	//	int i=1/0;
		System.out.println("this is test2");
	}

	 
	}