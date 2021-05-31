package com.pages.Guidewire.ClaimsCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class ClaimCenter_BasicInformation extends SeleniumWebDriver_Commands implements ClaimCenter_BasicInformation_PO {
	LinkedHashMap<String, String> lhm_Data;

	public ClaimCenter_BasicInformation(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void basicInfo() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("basicInfo",
				strTestCaseName);
		 GuidewireAutomate_Validation("Screen Header", basicInfo_Header, "equals", "Step 2 of 5: Basic information");
		 GuidewireAutomate("Name", BI_RB_Name, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_Name"));
		 GuidewireAutomate("InvolvedVehicles", BI_IV_CheckBox, "click", "");
	

		
	}

}
