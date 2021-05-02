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

		lhm_Data = getDataFromSheet_Fillo("basicInfo",strTestCaseName);
		GuidewireAutomate_Validation("basicInfo", basicInfo_screen_tittlebar, "equals", "Step 2 of 5: Basic information");
		GuidewireAutomate("basicInfoName", basicInfoName, "click", "");
		GuidewireAutomate("clickNewPerson", clickNewPerson, "click", "");
		GuidewireAutomate("firstName", firstName, "sendKeys", lhm_Data.get("First Name"));
		GuidewireAutomate("lastName", lastName, "sendKeys", lhm_Data.get("Last Name"));
		GuidewireAutomate("workPhone", workPhone, "sendKeys", lhm_Data.get("Work_phone"));
		GuidewireAutomate("address1", address1, "sendKeys", lhm_Data.get("Address1"));
		GuidewireAutomate("city", city, "sendKeys", lhm_Data.get("City"));
		GuidewireAutomate("state", state, "sendKeys", lhm_Data.get("State"));
		GuidewireAutomate("zipCode", zipCode, "clear", "");
		GuidewireAutomate("zipCode", zipCode, "sendKeys", lhm_Data.get("Zipcode"));
		GuidewireAutomate("testClick", testClick, "click", "");
		GuidewireAutomate("update", update, "click", "");
		GuidewireAutomate("relationShipToInsured", relationShipToInsured, "selectByVisibleText",lhm_Data.get("Relationship to Insured"));
		GuidewireAutomate("insuredWorkersName", insuredWorkersName, "selectByVisibleText",lhm_Data.get("InsuredName"));
		GuidewireAutomate("involvedVehicleCheckBox",involvedVehicleCheckBox, "click", "");
		GuidewireAutomate("next", next, "click", "");
		

	}

}
