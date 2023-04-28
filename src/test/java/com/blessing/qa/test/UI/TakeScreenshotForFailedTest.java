package com.blessing.qa.test.UI;
import java.io.IOException;


import org.testng.annotations.Test;
//@Listeners(CustomListereners.class)

public class TakeScreenshotForFailedTest extends TestBase{
	
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
		//int i=1/0;
		System.out.println("this is test1");
	}
	@Test
	public void Test3() {
		//int i=1/0;
		System.out.println("this is test1");
	}
	@Test
	public void Test4() {
	//	int i=1/0;
		System.out.println("this is test1");
	}
	@Test
	public void Test5() {
		//int i=1/0;
		System.out.println("this is test1");
	}

	 
	}