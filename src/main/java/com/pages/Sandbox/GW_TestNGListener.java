package com.pages.Sandbox;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class GW_TestNGListener extends GW_Base implements ITestListener {

	public void onTestStart(ITestResult result) {
		// creating test name
		oExtentTest = oExtentReports.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		// creating pass status
		oExtentTest.log(Status.PASS,
				MarkupHelper.createLabel(result.getMethod().getMethodName() + " Test Case PASSED", ExtentColor.GREEN));

	}

	public void onTestFailure(ITestResult result) {
		// creating fail status
		oExtentTest.log(Status.FAIL,
				MarkupHelper.createLabel(result.getMethod().getMethodName() + " Test Case Failed", ExtentColor.RED));
		oExtentTest.log(Status.FAIL, result.getThrowable());

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyy HH-mm-ss");
		// get current date
		Date date = new Date();
		String actualDate = format.format(date);
		String screenShotPath = System.getProperty("user.dir") + "\\Screenshots\\ExtentReport_" + actualDate + ".jpeg";

		File dest = new File(screenShotPath);
		try {
			FileUtils.copyFile(source, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// test.addScreenCaptureFromPath(screenShotPath, "Test case failure
		// screenshot");
		try {
			oExtentTest.addScreenCaptureFromPath(screenShotPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		oExtentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getMethod().getMethodName() + " Test Case skipped",
				ExtentColor.ORANGE));

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// setup method called
		try {
			GW_Selenium_Reporting r = new GW_Selenium_Reporting();
			oExtentReports = r.getReport();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void onFinish(ITestContext context) {
		oExtentReports.flush();

	}

}
