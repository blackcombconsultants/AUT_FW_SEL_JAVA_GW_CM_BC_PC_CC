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

			oExtentTest = oExtentReports.createTest(result.getMethod().getMethodName());
			driver = a.getDriver();
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
			oExtentTest
					.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));
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
		Selenium_Utils_File oGetFile = new Selenium_Utils_File();

		try {

			StrBrowser = oGetFile.getValue_PropertiesFile(pConfigproperties, "Browser");

			strGW_Application = oGetFile.getValue_PropertiesFile(pConfigproperties, "GW_Application");

			switch (strGW_Application) {
			case "BillingCenter":
				url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_BillingCenter");
				pTestDataFilePath = pUserdir + "\\testdata\\BillingCenter.xlsx";
				pScreenshots = pUserdir + "\\test-output\\Screenshots\\BillingCenter\\";
				pExtentReport_indexFile = pUserdir + "\\test-output\\extentreports\\BillingCenter\\index.html";
				pExtentReport_TodayFile = pUserdir + "\\test-output\\extentreports\\BillingCenter\\ExtentReport_"
						+ strCurrentDate_ddMMMMyyyy + ".html";
				break;
			case "PolicyCenter":
				url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_PolicyCenter");
				pTestDataFilePath = pUserdir + "\\testdata\\PolicyCenter.xlsx";
				pScreenshots = pUserdir + "\\test-output\\Screenshots\\PolicyCenter\\";
				pExtentReport_indexFile = pUserdir + "\\test-output\\extentreports\\PolicyCenter\\index.html";
				pExtentReport_TodayFile = pUserdir + "\\test-output\\extentreports\\PolicyCenter\\ExtentReport_"
						+ strCurrentDate_ddMMMMyyyy + ".html";
				break;
			case "ClaimsCenter":
				url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_ClaimsCenter");
				pTestDataFilePath = pUserdir + "\\testdata\\ClaimsCenter.xlsx";
				pScreenshots = pUserdir + "\\test-output\\Screenshots\\ClaimsCenter\\";
				pExtentReport_indexFile = pUserdir + "\\test-output\\extentreports\\ClaimsCenter\\index.html";
				pExtentReport_TodayFile = pUserdir + "\\test-output\\extentreports\\ClaimsCenter\\ExtentReport_"
						+ strCurrentDate_ddMMMMyyyy + ".html";
				break;
			case "ContactManagement":
				url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_ContactManagement");
				pTestDataFilePath = pUserdir + "\\testdata\\ContactManagement.xlsx";
				pScreenshots = pUserdir + "\\test-output\\Screenshots\\ContactManagement\\";
				pExtentReport_indexFile = pUserdir + "\\test-output\\extentreports\\ContactManagement\\index.html";
				pExtentReport_TodayFile = pUserdir + "\\test-output\\extentreports\\ContactManagement\\ExtentReport_"
						+ strCurrentDate_ddMMMMyyyy + ".html";
				break;
			}
			oExtentReports = Selenium_Reporting.getExtentReports();

		} catch (Throwable e) {
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
