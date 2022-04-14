package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class BillingCenter_Contacts extends SeleniumWebDriver_Commands implements BillingCenter_Contacts_PO {

	public BillingCenter_Contacts(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void C_ContactInfo_Verify() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_BillingCenter("Contacts");
		GuidewireAutomate_Validation("Screen Header", Contacts_Header, "equals", "Contacts");

		GuidewireAutomate_Validation("CI Type", Contacts_CI_Type, "equals", lhm_TestCase_Table_Data.get("TD_Type"));
		GuidewireAutomate_Validation("CI Name", Contacts_CI_Name, "equals", lhm_TestCase_Table_Data.get("TD_Name"));
		GuidewireAutomate_Validation("CI_Email", Contacts_CI_Email, "contains", lhm_TestCase_Table_Data.get("TD_Email"));
	}

	public static void C_ContactInfo_Edit() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_BillingCenter("Contacts");
		GuidewireAutomate_Validation("Screen Header", Contacts_Header, "equals", "Contacts");
		GuidewireAutomate("Edit Button", Contacts_EditButton, "click", "");

		GuidewireAutomate("CI Address1", Contats_CI_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_Address1"));
		GuidewireAutomate("CI Address2", Contacts_CI_Address2, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_Address2"));
		GuidewireAutomate("CI State", Contacts_CI_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_State"));

	}

}
