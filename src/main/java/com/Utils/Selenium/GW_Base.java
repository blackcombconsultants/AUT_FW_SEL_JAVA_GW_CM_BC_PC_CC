package com.Utils.Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GW_Base {

	public static WebDriver            driver;
	public static WebDriver            driver_ThirdPartyTool;
	public static EventFiringWebDriver efDriver;
	public static JavascriptExecutor   oJavascriptExecutor;
	public static WebDriverWait        oWebDriverWait;

	public static ExtentHtmlReporter  oExtentHtmlReporter;
	public static ExtentSparkReporter oExtentSparkReporter;
	public static ExtentReports       oExtentReports;
	public static ExtentTest          oExtentTest;

	public static Properties       oProperties;
	public static File             oFile;
	public static FileInputStream  oFileInputStream;
	public static FileOutputStream oFileOutputStream;
	public static XSSFWorkbook     oXSSFWorkbook;

	public static String pUserdir      = System.getProperty("user.dir");
	public static String gstr_Hostname = System.getProperty("hostname");
	public static String gstr_Username = System.getProperty("user.name");
	public static String gstr_OSname   = System.getProperty("os.name");
	public static String gstr_Userhome = System.getProperty("user.home");

	public static String pConfigproperties = pUserdir + "/src/main/resources/Config.Properties";
	public static String pUploads          = pUserdir + "/src/test/resources/Uploads/";
	public static String pDownloads        = pUserdir + "/src/test/resources/Downloads/";

	public static String pProcessKill = "C:/Program Files/Google/Chrome/Application/chrome.exe";

	public static String pScreenshots;
	public static String pExtentReport_TodayFile;
	public static String pExtentReport_APPLICATIONFile;
	public static String pExtentReport_indexFile;

	public static SimpleDateFormat sdf_ddMMMMyyyy       = new SimpleDateFormat("ddMMMMyyyy");
	public static SimpleDateFormat sdf_ddMMMMyyyyHHmmss = new SimpleDateFormat("ddMMMMyyyy HHmmss");
	public static SimpleDateFormat sdf_yyyyMMMMdd       = new SimpleDateFormat("yyyyMMMMdd");
	public static SimpleDateFormat sdf_yyyyMMMMddHHmmss = new SimpleDateFormat("yyyyMMMMdd HHmmss");
	public static SimpleDateFormat sdf_ddMMMyyyy_GW1    = new SimpleDateFormat("MM/dd/yyyy");

	public static String strCurrentDate_ddMMMMyyyy       = sdf_ddMMMMyyyy.format(new Date());
	public static String strCurrentDate_ddMMMMyyyyHHmmss = sdf_ddMMMMyyyyHHmmss.format(new Date());
	public static String strCurrentDate_yyyyMMMMdd       = sdf_yyyyMMMMdd.format(new Date());
	public static String strCurrentDate_yyyyMMMMddHHmmss = sdf_yyyyMMMMddHHmmss.format(new Date());

	/*
	 * Test Data File path
	 */


	public static String pTestDataFilePath;
	public static String pTestDataFile_PolicyCenter         = pUserdir + "/testdata/PolicyCenter.xlsx";
	public static String pTestDataFile_Smartcomm          = pUserdir + "/testdata/Smartcomm.xlsx";
	public static String pTestDataFile_ContactManager     = pUserdir + "/testdata/ContactManager.xlsx";
	public static String pTestDataFile_ClaimsCenter       = pUserdir + "/testdata/ClaimsCenter.xlsx";
	public static String pTestDataFile_BillingCenter      = pUserdir + "/testdata/BillingCenter.xlsx";
	public static String pTestDataFile_PersonalAuto       = pUserdir + "/testdata/PersonalAuto.xlsx";
	public static String pTestDataFile_CommercialAuto     = pUserdir + "/testdata/CommercialAuto.xlsx";
	public static String pTestDataFile_PersonalUmbrella   = pUserdir + "/testdata/PersonalUmbrella.xlsx";
	public static String pTestDataFile_CommercialUmbrella = pUserdir + "/testdata/CommercialUmbrella.xlsx";
	public static String pTestDataFile_PersonalPackage    = pUserdir + "/testdata/PersonalPackage.xlsx";
	public static String pTestDataFile_CommercialPackage  = pUserdir + "/testdata/CommercialPackage.xlsx";
	public static String pTestDataFile_PersonalProperty   = pUserdir + "/testdata/PersonalProperty.xlsx";
	public static String pTestDataFile_CommercialProperty = pUserdir + "/testdata/CommercialProperty.xlsx";
	public static String pTestDataFile_HomeOwners         = pUserdir + "/testdata/HomeOwners.xlsx";
	public static String pTestDataFile_BusinessOwners     = pUserdir + "/testdata/BusinessOwners.xlsx";
	public static String pTestDataFile_PersonalTravel     = pUserdir + "/testdata/PersonalTravel.xlsx";
	public static String pTestDataFile_BusinessTravel     = pUserdir + "/testdata/BusinessTravel.xlsx";
	public static String pTestDataFile_GeneralLiability   = pUserdir + "/testdata/GeneralLiability.xlsx";
	public static String pTestDataFile_InlandMarine       = pUserdir + "/testdata/InlandMarine.xlsx";
	public static String pTestDataFile_WorkerCompensation = pUserdir + "/testdata/WorkerCompensation.xlsx";
	public static String pTestDataFile_Cyber              = pUserdir + "/testdata/Cyber.xlsx";
	public static String pTestDataFile_Crime              = pUserdir + "/testdata/Crime.xlsx";
	public static String pTestDataFile_Farm               = pUserdir + "/testdata/Farm.xlsx";

	public static String pFile_TestBreakTracker = pUserdir + "/testdata/TestBreakTracker.xlsx";

	public static LinkedHashMap<String, String> lhm_TestCase_Data       = new LinkedHashMap<String, String>();
	public static LinkedHashMap<String, String> lhm_TestCase_Table_Data = new LinkedHashMap<String, String>();
	public static String                        strTestCaseName         = null;
	public static String                        strSheetName            = null;
	public static String                        strClassName            = null;
	public static String                        strMethodName           = null;

	public static String url;
	public static String StrBROWSER;
	public static String StrENVIRONMENT;
	public static String StrINTERFACE;
	public static String gwAPPLICATION;
	public static String gwCOUNTRY;
	public static String gwSTATE;

	/*
	 * Guidewire
	 */
	public static String strURL_ContactManager;
	public static String strURL_BillingCenter;
	public static String strURL_PolicyCenter;
	public static String strURL_ClaimsCenter;

	public static String strJob;
	public static String strWorkflow;
	public static String strLOB;
	public static String strEffectiveDate;
	public static String strAccountName;
	public static String strAccountNumber;
	public static String strSubmissionNumber;
	public static String strUnderwriter;
	public static String strAmount;
	public static String strPremium;
	public static String strFetchValue;

	public static String strPolicyNumber;
	public static String strClaimsNumber;

}
