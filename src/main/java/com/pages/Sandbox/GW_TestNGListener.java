package com.pages.Sandbox;

import java.io.File;
import java.io.IOException;
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
		try {
			oExtentTest = oExtentReports.createTest(result.getMethod().getMethodName());

		} catch (Exception e) {
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
			oExtentReports = GW_Selenium_Reporting.getReport();
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
