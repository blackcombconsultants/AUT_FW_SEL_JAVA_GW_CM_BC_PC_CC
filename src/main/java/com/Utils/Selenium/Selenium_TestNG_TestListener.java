package com.Utils.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Selenium_TestNG_TestListener extends GW_Base implements ITestListener {

	public void onTestStart(ITestResult result) {
		try {
			GW_GetDriver a = new GW_GetDriver();
			Selenium_Utils_Executables se = new Selenium_Utils_Executables();
			Selenium_Utils_File f = new Selenium_Utils_File();
			
			oExtentTest = oExtentReports.createTest(result.getMethod().getMethodName());
			driver = a.getDriver();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}

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
		try {
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		oExtentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getMethod().getMethodName() + " Test Case skipped",
				ExtentColor.ORANGE));

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Started");
	}

	public void onStart(ITestContext context) {
		System.out.println("onStart");

		try {
			oExtentReports = Selenium_Reporting.getExtentReports();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void onFinish(ITestContext context) {
		try {

			oExtentReports.flush();

			FileUtils.copyFile(new File(pExtentReport_indexFile), new File(pExtentReport_TodayFile), true);
			new ProcessBuilder("C:\\Program Files\\Mozilla Firefox\\firefox.exe", pExtentReport_indexFile).start();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
