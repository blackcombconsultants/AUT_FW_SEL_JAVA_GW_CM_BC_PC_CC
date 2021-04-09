package com.pages.Guidewire.ClaimsCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.codoid.products.exception.FilloException;

public class GW_CC_AddClaimInformation extends SeleniumWebDriver_Commands implements AddClaimInformation_PO {

	LinkedHashMap<String, String> lhm_Data;

	public GW_CC_AddClaimInformation(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void addClaimInfo() throws Throwable {

		lhm_Data = getDataFromSheet_Fillo("addClaimInfo", "Scenario 1");
		GuidewireAutomate_Validation("addClaimInfoScreen", addClaimInfo_screen_tittlebar, "equals", "Step 3 of 5: Add claim information");
		GuidewireAutomate("description", description, "sendkeys",lhm_Data.get("Description"));
		GuidewireAutomate("losscause", losscause, "selectByVisibleText",lhm_Data.get("Loss Cause"));
		GuidewireAutomate("location", location, "selectByIndex",lhm_Data.get("Location"));
		GuidewireAutomate("next",next,"click","");

	}

	@Override
	public void services() throws Throwable {
		
		GuidewireAutomate_Validation("servicesScreen_titlebar",services_screen_tittlebar, "equals", "Step 4 of 5: Services");
		GuidewireAutomate("next",next,"click","");
		
	}

	@Override
	public void saveandAssign() throws Throwable {
		GuidewireAutomate_Validation("saveandassignscreen_titlebar",saveandassign_screen_tittlebar, "equals", "Step 5 of 5: Save and Assign Claim");
		GuidewireAutomate("finish",finish,"click","");
	} 
	
	
	
	
	
	

}