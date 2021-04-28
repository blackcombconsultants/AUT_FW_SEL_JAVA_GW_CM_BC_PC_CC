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
import com.pages.Guidewire.GW_LoginCM_PC_BC_CC;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Drivers;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Forms;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_NewSubmission_Reusable;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Payments;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyInfo;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyReview;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Quote;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_RiskAnalysis;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Submission;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Vehicles;
import com.pages.Guidewire.PolicyCenter.GW_PolicyCenter_Resuables;

public class Selenium_TestNG_TestListener extends GW_Base implements ITestListener {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public void onTestStart(ITestResult result) {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("onTestStart");
		System.out.println("-------------------------------------------------------------------------");

		try {

			GW_GetDriver oDriver = new GW_GetDriver();
			Selenium_Utils_Executables oExe = new Selenium_Utils_Executables();

			strTestCaseName = result.getMethod().getMethodName();
			System.out.println("strTestCaseName " + strTestCaseName);

			oExtentTest = oExtentReports.createTest(strTestCaseName);

			driver = oDriver.getDriver();
	

			

			/*
			 * Creating object reference for the New submission_Bind only
			 */
			GW_LoginCM_PC_BC_CC loginScreen = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
			GW_TabNavigation_CM_PC_BC_CC navigate = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);
			GW_PolicyCenter_Resuables policycenter = new GW_PolicyCenter_Resuables(driver, oExtentTest);

			/*
			 * Personal Auto
			 */
			PersonalAuto_NewSubmission_Reusable personalauto = new PersonalAuto_NewSubmission_Reusable(driver, oExtentTest);
			PersonalAuto_PolicyInfo policyinfo = new PersonalAuto_PolicyInfo(driver, oExtentTest);
			PersonalAuto_Drivers padriver = new PersonalAuto_Drivers(driver, oExtentTest);
			PersonalAuto_Vehicles pavehicle = new PersonalAuto_Vehicles(driver, oExtentTest);
			PersonalAuto_Coverages coverages = new PersonalAuto_Coverages(driver, oExtentTest);
			PersonalAuto_RiskAnalysis riskanalysis = new PersonalAuto_RiskAnalysis(driver, oExtentTest);
			PersonalAuto_PolicyReview policyreview = new PersonalAuto_PolicyReview(driver, oExtentTest);
			PersonalAuto_Quote quote = new PersonalAuto_Quote(driver, oExtentTest);
			PersonalAuto_Forms forms = new PersonalAuto_Forms(driver, oExtentTest);
			PersonalAuto_Payments payments = new PersonalAuto_Payments(driver, oExtentTest);
			PersonalAuto_Submission submissionbound = new PersonalAuto_Submission(driver, oExtentTest);

			
			
			/*
			 * lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("Login",
			 * strTestCaseName); lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			 */			
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
			StrBrowser = System.getProperty("gwbrowser");
			StrEnvironment = System.getProperty("gwenv");
			strGW_Application = System.getProperty("gwApplication");
			strGW_Country = System.getProperty("gwCountry");
			strGW_State = System.getProperty("gwState");

			System.out.println("System.getProperty gwbrowser = " + StrBrowser);
			System.out.println("System.getProperty gwenv = " + StrEnvironment);
			System.out.println("System.getProperty gwApplication = " + strGW_Application);

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
