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
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Drivers;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Forms;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Payments;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyInfo;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyReview;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Qualification;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Quote;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Reusable;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_RiskAnalysis;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Vehicles;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Account;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Bound;

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

			/*
			 * PolicyCenter
			 */
			GW_CM_PC_BC_CC_Login loginScreen = new GW_CM_PC_BC_CC_Login(driver, oExtentTest);
			/*
			 * GW_CM_PC_BC_CC_TabNavigation navigate = new
			 * GW_CM_PC_BC_CC_TabNavigation(driver, oExtentTest);
			 * 
			 * PolicyCenter_Account account = new PolicyCenter_Account(driver, oExtentTest);
			 * PolicyCenter_AccountSummary accountSummary = new
			 * PolicyCenter_AccountSummary(driver, oExtentTest); PolicyCenter_PolicySummary
			 * policySummary = new PolicyCenter_PolicySummary(driver, oExtentTest);
			 * PolicyCenter_Resuables policycenter = new PolicyCenter_Resuables(driver,
			 * oExtentTest); PolicyCenter_SubmissionBound submissionbound = new
			 * PolicyCenter_SubmissionBound(driver, oExtentTest);
			 * 
			 * Personal Auto
			 * 
			 * PersonalAuto_Reusable personalauto = new PersonalAuto_Reusable(driver,
			 * oExtentTest); PersonalAuto_Qualification qualification = new
			 * PersonalAuto_Qualification(driver, oExtentTest); PersonalAuto_PolicyInfo
			 * policyinfo = new PersonalAuto_PolicyInfo(driver, oExtentTest);
			 * PersonalAuto_Drivers padriver = new PersonalAuto_Drivers(driver,
			 * oExtentTest); PersonalAuto_Vehicles pavehicle = new
			 * PersonalAuto_Vehicles(driver, oExtentTest); PersonalAuto_Coverages coverages
			 * = new PersonalAuto_Coverages(driver, oExtentTest); PersonalAuto_RiskAnalysis
			 * riskanalysis = new PersonalAuto_RiskAnalysis(driver, oExtentTest);
			 * PersonalAuto_PolicyReview policyreview = new
			 * PersonalAuto_PolicyReview(driver, oExtentTest); PersonalAuto_Quote quote =
			 * new PersonalAuto_Quote(driver, oExtentTest); PersonalAuto_Forms forms = new
			 * PersonalAuto_Forms(driver, oExtentTest); PersonalAuto_Payments payments = new
			 * PersonalAuto_Payments(driver, oExtentTest);
			 */
			/*
			 * lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("Login",
			 * strTestCaseName); lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			 */
		} catch (Throwable e) {
			e.printStackTrace();

		}

	}

	public void onTestSuccess(ITestResult result) {
		oExtentTest.log(Status.PASS,
				MarkupHelper.createLabel(result.getMethod().getMethodName() + " Test Case PASSED", ExtentColor.GREEN));

	}

	public void onTestFailure(ITestResult result) {
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

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("onStart");
		System.out.println("-------------------------------------------------------------------------");

		try {

			Selenium_Utils_File oGetFile = new Selenium_Utils_File();
			/*
			 * StrBrowser = oGetFile.getValue_PropertiesFile(pConfigproperties, "Browser");
			 * StrEnvironment = oGetFile.getValue_PropertiesFile(pConfigproperties,
			 * "Environment"); strGW_Application =
			 * oGetFile.getValue_PropertiesFile(pConfigproperties, "GW_Application");
			 */
			StrBROWSER = System.getProperty("BROWSER");
			StrENVIRONMENT = System.getProperty("ENVIRONMENT");
			StrINTERFACE = System.getProperty("INTERFACE");
			gwAPPLICATION = System.getProperty("gwAPPLICATION");
			gwCOUNTRY = System.getProperty("gwCOUNTRY");
			gwSTATE = System.getProperty("gwSTATE");

			System.out.println("System.getProperty gwbrowser = " + StrBROWSER);
			System.out.println("System.getProperty gwenv = " + StrENVIRONMENT);
			System.out.println("System.getProperty gwApplication = " + gwAPPLICATION);

			switch (gwAPPLICATION) {
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
			case "PersonalAuto":
				url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_PolicyCenter");
				pTestDataFilePath = pUserdir + "\\testdata\\PC_PersonalAuto.xlsx";
				pScreenshots = pUserdir + "\\test-output\\Screenshots\\PersonalAuto\\";
				pExtentReport_indexFile = pUserdir + "\\test-output\\extentreports\\PersonalAuto\\index.html";
				pExtentReport_TodayFile = pUserdir + "\\test-output\\extentreports\\PersonalAuto\\ExtentReport_"
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
			case "RESTful":
				url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_PolicyCenter");
				pTestDataFilePath = pUserdir + "\\testdata\\RESTful.xlsx";
				pScreenshots = pUserdir + "\\test-output\\Screenshots\\RESTful\\";
				pExtentReport_indexFile = pUserdir + "\\test-output\\extentreports\\RESTful\\index.html";
				pExtentReport_TodayFile = pUserdir + "\\test-output\\extentreports\\RESTful\\ExtentReport_"
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
