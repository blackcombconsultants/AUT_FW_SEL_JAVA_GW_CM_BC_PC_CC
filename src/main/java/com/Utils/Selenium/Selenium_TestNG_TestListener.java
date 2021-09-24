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
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;

public class Selenium_TestNG_TestListener extends GW_Base implements ITestListener {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public void onTestStart(ITestResult result) {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("onTestStart");
		System.out.println("-------------------------------------------------------------------------");

		try {

			strTestCaseName = result.getMethod().getMethodName();
			System.out.println("strTestCaseName " + strTestCaseName);

			oExtentTest = oExtentReports.createTest(strTestCaseName);

			if (!StrINTERFACE.equalsIgnoreCase("API")) {
				GW_GetDriver oDriver = new GW_GetDriver();
				driver = oDriver.getDriver();
			}

			GW_CM_PC_BC_CC_Login loginScreen = new GW_CM_PC_BC_CC_Login(driver, oExtentTest);

			/*
			 * lhm_TestCase_Table_Data =
			 * oDB.getData_MSExcel_WorkSheet_Fillo("Login", strTestCaseName);
			 * lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			 */
		} catch (Throwable e) {
			e.printStackTrace();

		}

	}

	public void onTestSuccess(ITestResult result) {
		oExtentTest.log(Status.PASS, MarkupHelper.createLabel(result.getMethod().getMethodName() + " Test Case PASSED", ExtentColor.GREEN));

	}

	public void onTestFailure(ITestResult result) {
		oExtentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getMethod().getMethodName() + " Test Case Failed", ExtentColor.RED));
		oExtentTest.log(Status.FAIL, result.getThrowable());
		try {
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		oExtentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getMethod().getMethodName() + " Test Case skipped", ExtentColor.ORANGE));

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Started");
	}

	public void onStart(ITestContext context) {

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("onStart");
		System.out.println("-------------------------------------------------------------------------");

		try {

			Selenium_Utils_File oGetFile = new Selenium_Utils_File();
			/*
			 * StrBrowser = oGetFile.getValue_PropertiesFile(pConfigproperties,
			 * "Browser"); StrEnvironment =
			 * oGetFile.getValue_PropertiesFile(pConfigproperties,
			 * "Environment"); strGW_Application =
			 * oGetFile.getValue_PropertiesFile(pConfigproperties,
			 * "GW_Application");
			 */
			StrBROWSER     = System.getProperty("BROWSER");
			StrENVIRONMENT = System.getProperty("ENVIRONMENT");
			gwAPPLICATION  = System.getProperty("gwAPPLICATION");
			gwCOUNTRY      = System.getProperty("gwCOUNTRY");
			gwSTATE        = System.getProperty("gwSTATE");
			StrINTERFACE   = System.getProperty("INTERFACE");

			String ptestoutput = pUserdir + "\\test-output\\" + gwAPPLICATION + "\\";
			pTestDataFilePath             = pUserdir + "\\testdata\\" + gwAPPLICATION + ".xlsx";
			pScreenshots                  = pUserdir + "\\test-output\\" + "Screenshots\\";
			pExtentReport_indexFile       = ptestoutput + "extentreports\\index.html";
			pExtentReport_APPLICATIONFile = ptestoutput + "extentreports\\" + gwAPPLICATION + ".html";
			pExtentReport_TodayFile       = ptestoutput + "extentreports\\" + "ExtentReport_" + gwAPPLICATION + "_" + strCurrentDate_ddMMMMyyyy + ".html";

			switch (gwAPPLICATION) {
				case "PersonalAuto" :
					url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_PolicyCenter");
					break;
				case "PC_GeneralLiability" :
					url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_PolicyCenter");
					break;
				case "BillingCenter" :
					url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_BillingCenter");
					break;
				case "PolicyCenter" :
					url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_PolicyCenter");
					break;
				case "ClaimsCenter" :
					url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_ClaimsCenter");
					break;
				case "ContactManagement" :
					url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_ContactManagement");
					break;
				case "RESTapi" :
					url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_ContactManagement");
					break;
				case "Mobile" :
					url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_ContactManagement");
					break;
				default :
					throw new IOException("No support for gwAPPLICATION : " + gwAPPLICATION);
			}
			oExtentReports = Selenium_Reporting.getExtentReports();

		} catch (Throwable e) {
			e.printStackTrace();

		}

	}

	public void onFinish(ITestContext context) {
		try {

			oExtentReports.flush();

			FileUtils.copyFile(new File(pExtentReport_indexFile), new File(pExtentReport_APPLICATIONFile), true);
			FileUtils.copyFile(new File(pExtentReport_indexFile), new File(pExtentReport_TodayFile), true);
			new ProcessBuilder("C:\\Program Files\\Mozilla Firefox\\firefox.exe", pExtentReport_TodayFile).start();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
