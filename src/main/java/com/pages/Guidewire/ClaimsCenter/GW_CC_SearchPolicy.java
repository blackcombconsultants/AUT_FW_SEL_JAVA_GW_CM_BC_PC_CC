package com.pages.Guidewire.ClaimsCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class GW_CC_SearchPolicy extends SeleniumWebDriver_Commands implements SearchPolicy_PO {
	LinkedHashMap<String, String> lhm_Data;

	public GW_CC_SearchPolicy(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	/*
	 * --------------------------------------------------------------
	 * getClaimInformationHeader
	 * --------------------------------------------------------------
	 */ public String getHeader_NewClaim() throws Throwable {
		return getText_Element(policy_screen_tittlebar);

	}

	@Override
	public void fnol_Search_Exitsing_Policy() throws Throwable {

		lhm_Data = getDataFromSheet_Fillo("policySearch", "Scenario 1");
		// ------> Verifying the page -
		 GuidewireAutomate_Validation("policy screen", policy_screen_tittlebar, "equals", "Step 1: Search or Create Policy");
		//Assert.assertEquals(getHeader_NewClaim(), "Step 1: Search or Create Policy");
		GuidewireAutomate("PolicyNumber", PolicyNumber, "sendkeys", lhm_Data.get("Policy Number"));
		GuidewireAutomate("Search", Search, "click", "");
		GuidewireAutomate("LossDate", LossDate, "sendkeys", lhm_Data.get("Loss Date"));

		GuidewireAutomate("next", next, "click", "");

	}

}
