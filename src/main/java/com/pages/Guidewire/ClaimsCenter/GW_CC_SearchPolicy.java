package com.pages.Guidewire.ClaimsCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class GW_CC_SearchPolicy extends SeleniumWebDriver_Commands implements SearchPolicy_PO {
	LinkedHashMap<String, String> lhm_Data;

	public GW_CC_SearchPolicy(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void searchPolicy() throws Throwable {

		lhm_Data = getDataFromSheet_Fillo("policySearch", "Scenario 1");
		GuidewireAutomate("PolicyNumber", PolicyNumber, "sendkeys", lhm_Data.get("Policy Number"));
		GuidewireAutomate("LossDate", LossDate, "sendkeys", lhm_Data.get("Loss Date"));
		GuidewireAutomate("Search", Search, "click", "");
		GuidewireAutomate("tabClick", tabClick, "click", "");
		GuidewireAutomate("next", next, "click", "");

	}

}
