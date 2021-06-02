package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class BillingCenter_AccountDetails extends SeleniumWebDriver_Commands implements BillingCenter_AccountDetails_PO {

	public BillingCenter_AccountDetails(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}
	
	public static void AD_AccountBasics_Verify() throws Throwable
	{
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("AcctDetails",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", AD_Header, "equals",
				"Account Details");
		
	
		GuidewireAutomate_Validation("Account Name", AD_AB_AccountName, "equals",
				lhm_TestCase_Table_Data.get("TD_AccountName"));
		GuidewireAutomate_Validation("AccountType", AD_AB_AccountType, "equals",
				lhm_TestCase_Table_Data.get("TD_AccountType"));
//		GuidewireAutomate_Validation("Creation Date", AD_AB_CreationDate, "equals",
//				lhm_TestCase_Table_Data.get("TD_CreationDate"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}
	
	public static void AD_AccountBasics_Edit() throws Throwable
	{
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("AcctSummary",
			strTestCaseName);
		GuidewireAutomate("ServiceTier", AD_AB_ServiceTier, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_ServiceTier"));
		GuidewireAutomate("SecurityZone", AD_AB_SecurityZone, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_SecurityZone"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}
	
	public static void AD_ContactInfo_Verify() throws Throwable
	{
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("AcctSummary",
			strTestCaseName);
		GuidewireAutomate_Validation("Primary Contact", AD_CI_PrimaryContact, "equals",
				lhm_TestCase_Table_Data.get("TD_PrimaryContact"));
		GuidewireAutomate_Validation("Email", AD_CI_Email, "equals",
				lhm_TestCase_Table_Data.get("TD_Email"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}
	
	public static void AD_AccountTotals_Verify() throws Throwable
	{ 
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("AcctSummary",
				strTestCaseName);
		
		GuidewireAutomate_Validation("Total Unbilled", AD_AT_TotalUnbilled, "equals",
				lhm_TestCase_Table_Data.get("TD_TotalUnbilled"));
		
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}


}
