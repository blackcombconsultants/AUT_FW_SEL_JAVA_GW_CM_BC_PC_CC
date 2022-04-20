package com.Utils.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
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
			 * lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("Login", strTestCaseName);
			 * lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			 */
		} catch (Throwable e) {
			e.printStackTrace();

		}

	}

	public void onTestSuccess(ITestResult result) {
		driver.quit();
		try {
			Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("searchValues", "Test", "PASS");
		} catch (Throwable e) {
			e.printStackTrace();
		}

		oExtentTest.log(Status.PASS, MarkupHelper.createLabel(result.getMethod().getMethodName() + " Test Case PASSED", ExtentColor.GREEN));

	}

	public void onTestFailure(ITestResult result) {

		try {

			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));

			driver.quit();

			JiraPolicy jiraPolicy    = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
			boolean    isTicketReady = jiraPolicy.logTicketReady();
			if (isTicketReady) {
				// raise jira ticket:
				System.out.println("is ticket ready for JIRA: " + isTicketReady);

				JiraServiceProvider jiraSp       = new JiraServiceProvider("https://ravikumar243.atlassian.net", "agowda@blackcombconsultants.com", "vYsl3rt7Co3o0uqQz6TBB53D", "AT");
				String              issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName() + "got failed due to some assertion or exception";
				System.out.println("issueSummary" + issueSummary);
				String issueDescription = result.getThrowable().getMessage() + "\n";
				System.out.println("issueDescription" + issueDescription);
				issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));

				jiraSp.createJiraTicket("Bug", issueSummary, issueDescription, "Akash Gowda");
			}

			oExtentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getMethod().getMethodName() + " Test Case Failed", ExtentColor.RED));
			oExtentTest.log(Status.FAIL, result.getThrowable());

			try {
				Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("searchValues", "Test", "FAIL");
			} catch (Throwable e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		oExtentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getMethod().getMethodName() + " Test Case skipped", ExtentColor.ORANGE));

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	public void onStart(ITestContext context) {

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("onStart");
		System.out.println("-------------------------------------------------------------------------");

		try {

			Selenium_Utils_File oGetFile = new Selenium_Utils_File();
			/*
			 * StrBrowser = oGetFile.getValue_PropertiesFile(pConfigproperties, "Browser"); StrEnvironment =
			 * oGetFile.getValue_PropertiesFile(pConfigproperties, "Environment"); strGW_Application =
			 * oGetFile.getValue_PropertiesFile(pConfigproperties, "GW_Application");
			 */
			StrBROWSER     = System.getProperty("BROWSER");
			StrENVIRONMENT = System.getProperty("ENVIRONMENT");
			gwAPPLICATION  = System.getProperty("gwAPPLICATION");
			gwCOUNTRY      = System.getProperty("gwCOUNTRY");
			gwSTATE        = System.getProperty("gwSTATE");
			StrINTERFACE   = System.getProperty("INTERFACE");

			/*
			 * Get URL StrENVIRONMENT = DEV/QA/UAT/PROD/QATT
			 */
			url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_PolicyCenter");
			switch (StrENVIRONMENT) {
				case "DEV" :
					url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_PC_QA");
					break;

				default :
					throw new IOException("No support for ENVIRONMENT : " + StrENVIRONMENT);
			}

			strURL_PolicyCenter   = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_PC_" + StrENVIRONMENT);
			strURL_BillingCenter  = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_BC_" + StrENVIRONMENT);
			strURL_ClaimsCenter   = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_CC_" + StrENVIRONMENT);
			strURL_ContactManager = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_CM_" + StrENVIRONMENT);

			/*
			 * Get TestDataFile
			 */
			pTestDataFilePath = pUserdir + "/testdata/" + gwAPPLICATION + ".xlsx";

			/*
			 * ExtentReports
			 */
			String ptestoutput = pUserdir + "/test-output/" + gwAPPLICATION + "/";
			pScreenshots                  = pUserdir + "/test-output/" + "Screenshots/";
			pExtentReport_indexFile       = ptestoutput + "extentreports/index.html";
			pExtentReport_APPLICATIONFile = ptestoutput + "extentreports/" + gwAPPLICATION + ".html";
			pExtentReport_TodayFile       = ptestoutput + "extentreports/" + strCurrentDate_yyyyMMMMdd + "/" + "ExtentReport_" + gwAPPLICATION + "_" + strCurrentDate_yyyyMMMMddHHmmss + ".html";

			/*
			 * adjusting the path for Windows OS
			 */
			char backslash    = ((char) 92);
			char forwardslash = ((char) 47);
			if (gstr_OSname.toUpperCase().contains("WIN")) {
				ptestoutput                   = ptestoutput.replace(forwardslash, backslash);
				pScreenshots                  = pScreenshots.replace(forwardslash, backslash);
				pExtentReport_indexFile       = pExtentReport_indexFile.replace(forwardslash, backslash);
				pExtentReport_APPLICATIONFile = pExtentReport_APPLICATIONFile.replace(forwardslash, backslash);
				pExtentReport_TodayFile       = pExtentReport_TodayFile.replace(forwardslash, backslash);
				pTestDataFilePath             = pTestDataFilePath.replace(forwardslash, backslash);
				pUploads                      = pUploads.replace(forwardslash, backslash);
				pDownloads                    = pDownloads.replace(forwardslash, backslash);
				pProcessKill                  = pProcessKill.replace(forwardslash, backslash);

			} else if (gstr_OSname.contains("Linux")) {
			} else {
			}

			System.out.println("OS=" + gstr_OSname);
			System.out.println("Username=" + gstr_Username);
			System.out.println("Hostname=" + gstr_Hostname);
			System.out.println("ENVIRONMENT=" + StrENVIRONMENT);
			System.out.println("Automation report=" + pExtentReport_APPLICATIONFile);
			System.out.println("TestData FilePath=" + pTestDataFilePath);

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
			if (gstr_OSname.toUpperCase().contains("WINDOW")) {
				new ProcessBuilder(pProcessKill, pExtentReport_TodayFile).start();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
