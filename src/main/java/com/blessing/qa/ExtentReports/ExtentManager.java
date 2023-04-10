package com.blessing.qa.ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {
    private static ExtentReports extent;
    private static String reportFileName = "Test-Automation-Report.html";
    private static String fileSeparator = System.getProperty("file.separator");
    private static String reportFilepath = System.getProperty("user.dir") + fileSeparator + "test-output" + fileSeparator + "html-report" + fileSeparator;
    private static String reportFileLocation =  reportFilepath + fileSeparator + reportFileName;

    public static ExtentReports getInstance() {
        if (extent == null)
            createInstance();
        return extent;
    }

    private static ExtentReports createInstance() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportFileLocation);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        return extent;
    }
}
