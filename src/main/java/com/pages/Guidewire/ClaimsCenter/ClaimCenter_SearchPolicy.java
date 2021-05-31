package com.pages.Guidewire.ClaimsCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class ClaimCenter_SearchPolicy extends SeleniumWebDriver_Commands implements ClaimCenter_SearchPolicy_PO {
	LinkedHashMap<String, String> lhm_Data;

	public ClaimCenter_SearchPolicy(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	
	
	public static void fnol_Search_Exitsing_Policy() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("SearchPolicy",
				strTestCaseName);
		// ------> Verifying the page -
		 GuidewireAutomate_Validation("Screen Header", SP_Header, "equals", "Step 1: Search or Create Policy");
		GuidewireAutomate("Policy Number", SP_FP_PolicyNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_PolicyNumber"));
		GuidewireAutomate("Search", SP_FP_Search, "click", "");
		GuidewireAutomate("LossDate", SP_FP_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_LossDate"));

  }

}
