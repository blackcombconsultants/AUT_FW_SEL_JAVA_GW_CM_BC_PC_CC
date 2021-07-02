package com.pages.Guidewire.ClaimsCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.codoid.products.exception.FilloException;

public class ClaimCenter_AddClaimInformation extends SeleniumWebDriver_Commands implements ClaimCenter_AddClaimInformation_PO {

	LinkedHashMap<String, String> lhm_Data;

	public ClaimCenter_AddClaimInformation(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}


	public static void addClaimInfo() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("addClaimInfo",
				strTestCaseName);
		GuidewireAutomate_Validation("addClaimInfoScreen", addClaimInfo_Header, "equals", "Step 3 of 5: Add claim information");
		GuidewireAutomate("WhatHappened", ADI_WhatHappened, "sendKeys",lhm_TestCase_Table_Data.get("WhatHappened"));
		GuidewireAutomate("losscause", ADI_LossCause, "selectByVisibleText",lhm_TestCase_Table_Data.get("LossCause"));
		GuidewireAutomate("location", ADI_location, "selectByVisibleText",lhm_TestCase_Table_Data.get("Location"));
		GuidewireAutomate("State", ADI_State, "selectByVisibleText",lhm_TestCase_Table_Data.get("State"));

	}
	


}