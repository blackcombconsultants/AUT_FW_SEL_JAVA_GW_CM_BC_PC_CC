package com.pages.Guidewire.PersonalAuto;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Coverages extends SeleniumWebDriver_Commands implements PersonalAuto_Coverages_PO {

	
	LinkedHashMap<String, String> lhm_Data;
	public PersonalAuto_Coverages(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void pac_CoveragesAppliedtoallvehicles() throws Throwable {
		lhm_Data = getDataFromSheet_Fillo("PA_Coverages",strTestCaseName);
	 //------->Verify the Page Name
	 GuidewireAutomate_Validation("PA_Coverages_Screen_titlebar", PA_Coverages_Screen_titlebar, "equals", "PA Coverages");
	 //--------> selecting AutoLiabilityPackage
	 GuidewireAutomate("PA Coverages Auto Liability Package" ,PA_Coverages_Auto_Liability_Package, "selectByVisibleText",lhm_Data.get("AutoLiabilityPackage"));
	 //-------->selecting the Medical Limit
	 GuidewireAutomate("Medical Limit" ,PA_Coverages_Medical_Limit,"selectByVisibleText",lhm_Data.get("Medical Limit"));
     		
		
	}

	

	

}
