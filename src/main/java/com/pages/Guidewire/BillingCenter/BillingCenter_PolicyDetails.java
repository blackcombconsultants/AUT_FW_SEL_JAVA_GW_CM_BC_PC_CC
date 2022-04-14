package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class BillingCenter_PolicyDetails extends SeleniumWebDriver_Commands implements BillingCenter_PolicyDetails_PO {

	public BillingCenter_PolicyDetails(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}
	
	public static void PD_PolicyBasics_Verify() throws Throwable
	{
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_BillingCenter("PolicyDetails");
		
		GuidewireAutomate_Validation("Screen Header",PolicyDetails_Header, "equals","Policy Details");
		
		GuidewireAutomate_Validation("Policy Number", PD_PB_PolicyNumber, "equals",lhm_TestCase_Table_Data.get("TD_PolicyNumber"));
		GuidewireAutomate_Validation("Assigned Risk",PD_PB_AssignedRisk , "equals", lhm_TestCase_Table_Data.get("TD_AssignedRisk"));
		GuidewireAutomate_Validation("Expiration Date",PD_PB_ExpirationDate , "equals", lhm_TestCase_Table_Data.get("TD_ExpirationDate"));
		GuidewireAutomate_Validation("Closure Status",PD_PB_ClosureStatus , "equals", lhm_TestCase_Table_Data.get("TD_ClosureStatus"));
		GuidewireAutomate_Validation("Require Final Audit",PD_PB_RequireFinalAudit , "equals", lhm_TestCase_Table_Data.get("TD_RequireFinalAudit"));
		GuidewireAutomate_Validation("Cancellation Status",PD_PB_CancellationStatus , "equals", lhm_TestCase_Table_Data.get("TD_CancellationStatus"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}
	
	public static void PD_Charges_Verify() throws Throwable
	{
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_BillingCenter("PolicyDetails");
		
		GuidewireAutomate_Validation("Premium Charges", PD_C_PremiumCharges, "equals",lhm_TestCase_Table_Data.get("TD_PremiumCharges"));
		GuidewireAutomate_Validation("Charges Total",PD_C_Total , "equals", lhm_TestCase_Table_Data.get("TD_Total"));
	}

}

