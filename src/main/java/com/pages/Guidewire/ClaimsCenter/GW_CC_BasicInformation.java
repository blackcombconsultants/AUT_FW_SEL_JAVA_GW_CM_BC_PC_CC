package com.pages.Guidewire.ClaimsCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class GW_CC_BasicInformation extends SeleniumWebDriver_Commands implements BasicInformation_PO {
	LinkedHashMap<String, String> lhm_Data;

	public GW_CC_BasicInformation(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void basicInfo() throws Throwable {

		lhm_Data = getDataFromSheet_Fillo("basicInfo", "PrimaryKey");
		GuidewireAutomate("basicInfoName", basicInfoName, "click", "");
		GuidewireAutomate("clickNewPerson", clickNewPerson, "click", "");
		GuidewireAutomate("firstName", firstName, "sendkeys", lhm_Data.get("First Name"));
		GuidewireAutomate("lastName", lastName, "sendkeys", lhm_Data.get("Last Name"));
		GuidewireAutomate("workPhone", workPhone, "sendkeys", lhm_Data.get("Work_phone"));
		GuidewireAutomate("address1", address1, "sendkeys", lhm_Data.get("Address1"));
		GuidewireAutomate("city", city, "sendkeys", lhm_Data.get("City"));
		GuidewireAutomate("state", state, "sendkeys", lhm_Data.get("State"));
		GuidewireAutomate("zipCode", zipCode, "clear", "");
		GuidewireAutomate("zipCode", zipCode, "sendkeys", lhm_Data.get("Zipcode"));
		GuidewireAutomate("testClick", testClick, "click", "");
		GuidewireAutomate("update", update, "click", "");

	}

}
