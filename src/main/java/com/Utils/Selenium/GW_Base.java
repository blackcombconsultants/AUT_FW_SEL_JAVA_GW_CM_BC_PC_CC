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

	public static SimpleDateFormat sdf_ddMMMMyyyy = new SimpleDateFormat("ddMMMMyyyy");
	public static SimpleDateFormat sdf_ddMMMMyyyyHHmmss = new SimpleDateFormat("ddMMMMyyyy HHmmss");
	public static SimpleDateFormat sdf_ddMMMyyyy_GW1 = new SimpleDateFormat("MM/dd/yyyy");

	public static String strCurrentDate_ddMMMMyyyy = sdf_ddMMMMyyyy.format(new Date());
	public static String strCurrentDate_ddMMMMyyyyHHmmss = sdf_ddMMMMyyyyHHmmss.format(new Date());

	public static WebDriver driver;
	public static WebDriver driver_ThirdPartyTool;
	public static EventFiringWebDriver efDriver;
	public static JavascriptExecutor oJavascriptExecutor;
	public static WebDriverWait oWebDriverWait;

	public static ExtentHtmlReporter oExtentHtmlReporter;
	public static ExtentSparkReporter oExtentSparkReporter;
	public static ExtentReports oExtentReports;
	public static ExtentTest oExtentTest;

	public static Properties oProperties;
	public static File oFile;
	public static FileInputStream oFileInputStream;
	public static FileOutputStream oFileOutputStream;
	public static XSSFWorkbook oXSSFWorkbook;

	public static String pUserdir = System.getProperty("user.dir");
	public static String gstr_Hostname = System.getProperty("hostname");
	public static String gstr_Username = System.getProperty("user.name");
	public static String gstr_OSname = System.getProperty("os.name");
	public static String gstr_Userhome = System.getProperty("user.home");

	public static String pConfigproperties = pUserdir + "/src/main/resources/Config.Properties";

	public static String pScreenshots;
	public static String pExtentReport_TodayFile;
	public static String pExtentReport_indexFile;
	public static String pTestDataFilePath;
	public static String pFile_TestBreakTracker = pUserdir + "\\testdata\\TestBreakTracker.xlsx";

	public static LinkedHashMap<String, String> lhm_TestCase_Data = new LinkedHashMap<String, String>();
	public static LinkedHashMap<String, String> lhm_TestCase_Table_Data = new LinkedHashMap<String, String>();
	public static String strTestCaseName=null;

	public static String url;
	public static String StrBrowser;
	public static String StrEnvironment;
	public static String strGW_Application;
	public static String strGW_Country;
	public static String strGW_State;

	public static String strJob;
	public static String strWorkflow;
	public static String strLOB;
	public static String strEffectiveDate;
	public static String strAccountName;
	public static String strAccountNumber;
	public static String strPolicyNumber;
	public static String strAmount;

}
