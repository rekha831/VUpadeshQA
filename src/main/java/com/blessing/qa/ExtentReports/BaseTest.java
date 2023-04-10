package com.blessing.qa.ExtentReports;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {

    protected WebDriver driver;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeSuite
    public void setUp() {
        // Setting up Extent report
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();
        String reportName = "Extent_Report_" + dtf.format(now) + ".html";
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/" + reportName);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        htmlReporter.config().setDocumentTitle("Automation Test Results");
        htmlReporter.config().setReportName("Test Results");
        htmlReporter.config().setTheme(Theme.STANDARD);
        extent.setSystemInfo("Hostname", "Localhost");
        extent.setSystemInfo("OS", "Windows 10");
        extent.setSystemInfo("Browser", "Chrome");
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = getScreenshot(driver, result.getName());
            Markup markUp = MarkupHelper.createLabel("Test Case Failed", ExtentColor.RED);
            test.log(Status.FAIL, markUp);
            test.fail(result.getThrowable());
            test.addScreenCaptureFromPath(screenshotPath);
        } else if (result.getStatus() == ITestResult.SKIP) {
            Markup markUp = MarkupHelper.createLabel("Test Case Skipped", ExtentColor.YELLOW);
            test.log(Status.SKIP, markUp);
        } else {
            Markup markUp = MarkupHelper.createLabel("Test Case Passed", ExtentColor.GREEN);
            test.log(Status.PASS, markUp);
        }
        extent.flush();
    }
    @Test
    public void test1() {
    	System.out.println("this is my extent Test");
    }

    @AfterSuite
    public void tearDownSuite() {
        extent.flush();
    }
    
    public String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        String dateName = LocalDateTime.now().toString().replaceAll(":", "-");
        String fileName = screenshotName + "_" + dateName + ".png";
        String destination = System.getProperty("user.dir") + "/screenshots/" + fileName;
        String screenshotPath = "./screenshots/" + fileName;
        try {
            // Capture screenshot and save it to the specified destination
        	FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new java.io.File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return screenshotPath;
    }
}
