package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_PolicyReview extends SeleniumWebDriver_Commands implements PersonalAuto_PolicyReview_PO {

	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_PolicyReview(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void pr_policyDetails() throws Throwable {
		
		//Fetch data
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyReview", strTestCaseName);
		
		// Validating Risk Analysis screen
		GuidewireAutomate_Validation("Screen Header", PersonalAuto_NewSubmission_ReusablePO.Screen_Header, "equals",
				"Policy Review");

		GuidewireAutomate_Validation("Primary Named Insured", PR_PrimaryNamedInsured, "equals",
				lhm_TestCase_Table_Data.get("PR_PrimaryNamedInsured"));
		GuidewireAutomate_Validation("County", PR_County, "equals", lhm_TestCase_Table_Data.get("PR_County"));
		GuidewireAutomate_Validation("Address Type", PR_AddressType, "equals",
				lhm_TestCase_Table_Data.get("PR_AddressType"));
		GuidewireAutomate_Validation("Address Description", PR_AddressDescription, "equals",
				lhm_TestCase_Table_Data.get("PR_AddressDescription"));
		GuidewireAutomate_Validation("Date Quote Needed", PR_DateQuoteNeeded, "equals",
				lhm_TestCase_Table_Data.get("PR_DateQuoteNeeded"));
		
		GuidewireAutomate_Validation("Product", PR_Product, "equals", lhm_TestCase_Table_Data.get("PR_Product"));
		GuidewireAutomate_Validation("Effective Date", PR_EffectiveDate, "equals",
				lhm_TestCase_Table_Data.get("PR_EffectiveDate"));
		GuidewireAutomate_Validation("Expiration Date", PR_ExpirationDate, "equals",
				lhm_TestCase_Table_Data.get("PR_ExpirationDate"));

	}

	@Override
	public void pr_PolicyLevelCoverages() throws Throwable {

		//Fetch data
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyReview", strTestCaseName);

		GuidewireAutomate_Validation("Personal Auto Line", PR_PersonalAutoLine, "equals","Personal Auto Line");
		
		GuidewireAutomate_Validation("Policy Level Coverages", PR_PAL_PolicyLevelCoverages, "equals","Policy Level Coverages");
		GuidewireAutomate_Validation("Coverage - Auto Liability Package", PR_PAL_PLC_AutoLiabilityPackage, "equals",lhm_TestCase_Table_Data.get("PR_PAL_PLC_AutoLiabilityPackage"));
		GuidewireAutomate_Validation("Auto Liability Package Value", PR_PAL_PLC_AutoLiabilityPackage_Value, "equals",lhm_TestCase_Table_Data.get("PR_PAL_PLC_AutoLiabilityPackage_Value"));
		GuidewireAutomate_Validation("Coverage - Medical Limit Coverage", PR_PAL_PLC_MedicalLimit, "equals",lhm_TestCase_Table_Data.get("PR_PAL_PLC_MedicalLimit"));
		GuidewireAutomate_Validation("Medical Limit Coverage Value", PR_PAL_PLC_MedicalLimit_Value, "equals",lhm_TestCase_Table_Data.get("PR_PAL_PLC_MedicalLimit_Value"));


	}

	@Override
	public void pr_VehicleLevelCoverages() throws Throwable {
		
		//Fetch data
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyReview", strTestCaseName);

		GuidewireAutomate_Validation("Vehicle Level Coverages", PR_PAL_VehicleLevelCoverages, "equals","Vehicle Level Coverages");
		GuidewireAutomate_Validation("Garage 1", PR_PAL_VLC_Garage1, "equals","Garage 1");
		
		GuidewireAutomate_Validation("Vehicle 1", PR_PAL_VLC_Vehicle1, "equals","Vehicle 1");
		GuidewireAutomate_Validation("Year", PR_PAL_VLC_V_Year, "equals",lhm_TestCase_Table_Data.get("PR_PAL_VLC_V_Year"));
		GuidewireAutomate_Validation("VIN", PR_PAL_VLC_V_VIN, "equals",lhm_TestCase_Table_Data.get("PR_PAL_VLC_V_VIN"));

		GuidewireAutomate_Validation("Primary Drivers", PR_PAL_VLC_PrimaryDriver, "equals",lhm_TestCase_Table_Data.get("PR_PAL_VLC_PrimaryDrivers"));
		
		GuidewireAutomate_Validation("Assigned Drivers", PR_PAL_VLC_AssignedDrivers, "equals","Assigned Drivers");
		GuidewireAutomate_Validation("Driver", PR_PAL_VLC_AD_Driver, "equals",lhm_TestCase_Table_Data.get("PR_PAL_VLC_AD_Driver"));

		GuidewireAutomate_Validation("Vehicle Rate Modifiers", PR_PAL_VLC_V_VehicleRateModifiers, "equals","Vehicle Rate Modifiers");
		GuidewireAutomate_Validation("Anti Lock Brakes Discount", PR_PAL_VLC_V_VRM_AntiLockBrakesDiscount, "equals",lhm_TestCase_Table_Data.get("PR_PAL_VLC_V_VRM_AntiLockBrakesDiscount"));
		GuidewireAutomate_Validation("Anti Theft Discount", PR_PAL_VLC_V_VRM_AntiTheftDiscount, "equals",lhm_TestCase_Table_Data.get("PR_PAL_VLC_V_VRM_AntiTheftDiscount"));

		GuidewireAutomate_Validation("Vehicle Coverages", PR_PAL_VLC_V_VehicleCoverages, "equals","Vehicle Coverages");
		GuidewireAutomate_Validation("Comprehensive Deductible", PR_PAL_VLC_V_VC_ComprehensiveDeductible, "equals",lhm_TestCase_Table_Data.get("PR_PAL_VLC_V_VC_ComprehensiveDeductible"));
		GuidewireAutomate_Validation("ComprehensiveDeductible Value", PR_PAL_VLC_V_VC_ComprehensiveDeductible_Value, "equals",lhm_TestCase_Table_Data.get("PR_PAL_VLC_V_VC_ComprehensiveDeductible_Value"));
		GuidewireAutomate_Validation("Towingand Labor Limit", PR_PAL_VLC_V_VC_TowingandLaborLimit, "equals",lhm_TestCase_Table_Data.get("PR_PAL_VLC_V_VC_TowingandLaborLimit"));
		GuidewireAutomate_Validation("Towingand Labor Limit Value", PR_PAL_VLC_V_VC_TowingandLaborLimit_Value, "equals",lhm_TestCase_Table_Data.get("PR_PAL_VLC_V_VC_TowingandLaborLimit_Value"));


	}
}
