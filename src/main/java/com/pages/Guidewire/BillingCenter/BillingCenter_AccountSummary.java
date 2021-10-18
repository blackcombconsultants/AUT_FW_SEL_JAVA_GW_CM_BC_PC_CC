package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class BillingCenter_AccountSummary extends SeleniumWebDriver_Commands implements BillingCenter_AccountSummary_PO {

	public BillingCenter_AccountSummary(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void AccountSummary() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("AcctSummary", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", AS_Header, "equals", "Account Summary");
		GuidewireAutomate_Validation("AccountName", AS_Overview_AccountName, "equals", lhm_TestCase_Table_Data.get("TD_AccountName"));
		GuidewireAutomate_Validation("PrimaryContact", AS_Overview_PrimaryContact, "equals", lhm_TestCase_Table_Data.get("TD_PrimaryContact"));
		GuidewireAutomate_Validation("Currency", AS_Overview_Currency, "fetch", lhm_TestCase_Table_Data.get("TD_Currency"));
		

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}
	public static void AccountSummary_Financials() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("AcctSummary", strTestCaseName);

		GuidewireAutomate_Validation("Total Unapplied", AS_Financials_DefaultUnapplied, "fetch", lhm_TestCase_Table_Data.get("TD_Unapplied"));
		GuidewireAutomate_Validation("Pay off Amount", AS_Financials_PayoffAmount, "fetch", lhm_TestCase_Table_Data.get("TD_PayoffAmount"));
		GuidewireAutomate_Validation("TotalValue", AS_PolicyPeriodsTotalValue, "fetch", lhm_TestCase_Table_Data.get("TD_TotalValue"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

}
