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

		GuidewireAutomate("description", description, "sendkeys", lhm_Data.get("Description"));
		GuidewireAutomate("dateOfEmployerNotified", dateOfEmployerNotified, "sendkeys",
				lhm_Data.get("Date Employer Notified"));
		GuidewireAutomate("locationlistbox", location, "selectByVisibleText", lhm_Data.get("Location"));
		GuidewireAutomate("injuryDescription", injuryDescription, "sendkeys", lhm_Data.get("Injury Description"));
		GuidewireAutomate("injury", injury, "click", "");
		GuidewireAutomate("causeOfInjury", causeOfInjury, "selectByVisibleText",
				lhm_Data.get("Cause of Injury / Source"));
		GuidewireAutomate("detailedInjury", detailedInjury, "selectByVisibleText",
				lhm_Data.get("Detailed Injury Type"));
		GuidewireAutomate("medicalAttention", medicalAttention, "click", "");
		GuidewireAutomate("areaOfBody", areaOfBody, "selectByVisibleText", lhm_Data.get("Area of Body"));
		GuidewireAutomate("bodyPart", bodyPart, "selectByVisibleText", lhm_Data.get("Body Part"));
		GuidewireAutomate("ppdPercentage", ppdPercentage, "sendkeys", lhm_Data.get("PPD Percentage"));
		GuidewireAutomate("lostTimeFromWork", lostTimeFromWork, "click", "");
		GuidewireAutomate("testClickTop", testClickTop, "click", "");
		GuidewireAutomate("next", next, "click", "");

	}

}