package com.blessing.qa.test.UI;

import org.testng.annotations.Test;

import com.blessing.qa.util.RetryAnalyzer;


public class RetryTestExample  {
	
	@Test()
	public void Test1() {
		System.out.println("This is first Test");
		int i=1/0;
		System.out.println("test1" +i);
	}
	
	@Test
	public void Test2() {
		System.out.println("This is third");
		int i=1/0;
		System.out.println("test3" +i);
		
	}
	

}
