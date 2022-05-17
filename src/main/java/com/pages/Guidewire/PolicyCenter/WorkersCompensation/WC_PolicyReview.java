package com.pages.Guidewire.PolicyCenter.WorkersCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Reusable;

public class WC_PolicyReview extends SeleniumWebDriver_Commands {

	public WC_PolicyReview(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By Tab_Differences  = By.xpath("//div[contains(@id,'DiffsTab')]");
	private static By Tab_PolicyReview = By.xpath("//div[contains(@id,'RewriteWizard_DifferencesScreen-PolicyReviewTab')]");


	/*
	 * Primary Named Insured
	 */

	private static By PR_PrimaryNamedInsured = By.xpath("//div[contains(@id,'ReviewSummaryDV-PrimaryNamedInsured')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_Address             = By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressSummary')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_County              = By.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_AddressType         = By.xpath("//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType') and contains(@class,'gw-ValueWidget')]//div[@class='gw-label']");
	private static By PR_AddressDescription  = By.xpath("//div[contains(@id,'AddressDescription') and contains(@class,'gw-ValueWidget')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_DateQuoteNeeded     = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-DateQuoteNeeded')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_EffectiveDate       = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-EffectiveDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_ExpirationDate      = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-ExpirationDate_Input')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_Product             = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-Product')]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * Personal Auto Line
	 */
	private static By PR_PersonalAutoLine = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Personal Auto Line']");

	/*
	 * Policy Level Coverages
	 */

	private static By PR_PAL_PolicyLevelCoverages = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Policy Level Coverages']");

	private static By PR_PAL_PLC_AutoLiabilityPackage = By.xpath("//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Description_Cell')]//div[@class='gw-value-readonly-wrapper' and text()='Auto Liability Package']");

	private static By PR_PAL_PLC_AutoLiabilityPackage_Value = By
			.xpath("//div[@class='gw-value-readonly-wrapper' and text()='Auto Liability Package']/ancestor::td[contains(@id,'Description_Cell')]/following-sibling::td//div[@class='gw-value-readonly-wrapper']");

	private static By PR_PAL_PLC_MedicalLimit = By.xpath("//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Description_Cell')]//div[@class='gw-value-readonly-wrapper' and text()='Medical Limit']");

	private static By PR_PAL_PLC_MedicalLimit_Value = By.xpath("//div[@class='gw-value-readonly-wrapper' and text()='Medical Limit']/ancestor::td[contains(@id,'Description_Cell')]/following-sibling::td//div[@class='gw-value-readonly-wrapper']");

	/*
	 * Vehicle Level Coverages
	 */

	private static By PR_PAL_VehicleLevelCoverages = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Vehicle Level Coverages']");
	private static By PR_PAL_VLC_Garage1           = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Garage 1']");
	private static By PR_PAL_VLC_Vehicle1          = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Vehicle 1']");

	private static By PR_PAL_VLC_V_Year = By.xpath("//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Year_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_PAL_VLC_V_VIN  = By.xpath("//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Vin_Cell')]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * PrimaryDrivers
	 */
	private static By PR_PAL_VLC_PrimaryDriver = By.xpath("//div[@class='gw-VerbatimWidget--inner' and contains(text(),'Primary Driver')]");

	/*
	 * AssignedDrivers
	 */
	private static By PR_PAL_VLC_AssignedDrivers = By.xpath("//div[@class='gw-VerbatimWidget--inner' and text()='Assigned Drivers']");
	private static By PR_PAL_VLC_AD_Driver       = By.xpath("//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Driver_Cell')]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * VehicleRateModifiers
	 */
	private static By PR_PAL_VLC_V_VehicleRateModifiers       = By.xpath("//div[@class='gw-VerbatimWidget--inner' and text()='Vehicle Rate Modifiers']");
	private static By PR_PAL_VLC_V_VRM_AntiLockBrakesDiscount = By.xpath("//td[contains(@id,'VehicleModifierCell_Cell')]//div[contains(@id,'PolicyLineSummaryPanelSet-0-0-ModIterator-0-BooleanModifier')]");
	private static By PR_PAL_VLC_V_VRM_PassiveRestraintSystem = By.xpath("//td[contains(@id,'VehicleModifierCell_Cell')]//div[contains(@id,'PolicyLineSummaryPanelSet-0-0-ModIterator-1-TypeKeyModifier')]");
	private static By PR_PAL_VLC_V_VRM_AntiTheftDiscount      = By.xpath("//td[contains(@id,'VehicleModifierCell_Cell')]//div[contains(@id,'PolicyLineSummaryPanelSet-0-0-ModIterator-2')]//div[contains(@id,'ModIterator-2-TypeKeyModifier')]");

	/*
	 * VehicleCoverages
	 */
	private static By PR_PAL_VLC_V_VehicleCoverages = By.xpath("//div[@class='gw-VerbatimWidget--inner' and text()='Vehicle Coverages']");

	private static By PR_PAL_VLC_V_VC_ComprehensiveDeductible = By.xpath("//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Description_Cell')]//div[@class='gw-value-readonly-wrapper' and text()='Comprehensive Deductible']");

	private static By PR_PAL_VLC_V_VC_ComprehensiveDeductible_Value = By
			.xpath("//div[@class='gw-value-readonly-wrapper' and text()='Comprehensive Deductible']/ancestor::td[contains(@id,'Description_Cell')]/following-sibling::td//div[@class='gw-value-readonly-wrapper']");

	private static By PR_PAL_VLC_V_VC_TowingandLaborLimit = By.xpath("//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Description_Cell')]//div[@class='gw-value-readonly-wrapper' and text()='Towing and Labor Limit']");

	private static By PR_PAL_VLC_V_VC_TowingandLaborLimit_Value = By
			.xpath("//div[@class='gw-value-readonly-wrapper' and text()='Towing and Labor Limit']/ancestor::td[contains(@id,'Description_Cell')]/following-sibling::td//div[@class='gw-value-readonly-wrapper']");

	/*
	 * Exclusions
	 */
	private static By PR_PAL_ExclusionsConditions = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Exclusions and Conditions']");

	/*
	 * 
	 * 
	 * void policyDetails() throws Throwable;
	 * 
	 * void policyLevelCoverages() throws Throwable;
	 * 
	 * void vehicleLevelCoverages() throws Throwable;
	 */

	public static void clickTab_PolicyReview(String Tabname) throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.PolicyReview_Header, "equals", "Policy Review");

		if (Tabname.equalsIgnoreCase("Differences")) {
			GuidewireAutomate("Search", Tab_Differences, "clickAndwait", "click");
		} else if (Tabname.equalsIgnoreCase("Policy Review")) {
			GuidewireAutomate("Search", Tab_PolicyReview, "clickAndwait", "click");
		}

	}

	public static void policyDetails() throws Throwable {

		// Fetch data
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("policyReview");

		// Validating Risk Analysis screen
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.PolicyReview_Header, "equals", "Policy Review");

		GuidewireAutomate_Validation("Primary Named Insured", PR_PrimaryNamedInsured, "equals", strAccountName);
		GuidewireAutomate_Validation("County", PR_County, "equals", lhm_TestCase_Table_Data.get("PR_County"));
		GuidewireAutomate_Validation("Address Type", PR_AddressType, "contains", lhm_TestCase_Table_Data.get("PR_AddressType"));

		GuidewireAutomate_Validation("Product", PR_Product, "equals", lhm_TestCase_Table_Data.get("PR_Product"));
		GuidewireAutomate_Validation("Effective Date", PR_EffectiveDate, "equals", lhm_TestCase_Table_Data.get("PR_EffectiveDate"));
		GuidewireAutomate_Validation("Expiration Date", PR_ExpirationDate, "equals", lhm_TestCase_Table_Data.get("PR_ExpirationDate"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void policyLevelCoverages() throws Throwable {

		// Fetch data
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("policyReview");

		GuidewireAutomate_Validation("Personal Auto Line", PR_PersonalAutoLine, "equals", "Personal Auto Line");

		GuidewireAutomate_Validation("Policy Level Coverages", PR_PAL_PolicyLevelCoverages, "equals", "Policy Level Coverages");
		GuidewireAutomate_Validation("Coverage - Auto Liability Package", PR_PAL_PLC_AutoLiabilityPackage, "equals", lhm_TestCase_Table_Data.get("PR_PAL_PLC_AutoLiabilityPackage"));
		GuidewireAutomate_Validation("Auto Liability Package Value", PR_PAL_PLC_AutoLiabilityPackage_Value, "equals", lhm_TestCase_Table_Data.get("PR_PAL_PLC_AutoLiabilityPackage_Value"));
		GuidewireAutomate_Validation("Coverage - Medical Limit Coverage", PR_PAL_PLC_MedicalLimit, "equals", lhm_TestCase_Table_Data.get("PR_PAL_PLC_MedicalLimit"));
		GuidewireAutomate_Validation("Medical Limit Coverage Value", PR_PAL_PLC_MedicalLimit_Value, "equals", lhm_TestCase_Table_Data.get("PR_PAL_PLC_MedicalLimit_Value"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void vehicleLevelCoverages() throws Throwable {

		// Fetch data
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("policyReview");

		GuidewireAutomate_Validation("Vehicle Level Coverages", PR_PAL_VehicleLevelCoverages, "equals", "Vehicle Level Coverages");
		GuidewireAutomate_Validation("Garage 1", PR_PAL_VLC_Garage1, "equals", "Garage 1");

		GuidewireAutomate_Validation("Vehicle 1", PR_PAL_VLC_Vehicle1, "equals", "Vehicle 1");
		/*
		 * GuidewireAutomate_Validation("Year", PR_PAL_VLC_V_Year, "equals", lhm_TestCase_Table_Data.get("PR_PAL_VLC_V_Year"));
		 */
		// GuidewireAutomate_Validation("VIN", PR_PAL_VLC_V_VIN, "contains",
		// lhm_TestCase_Table_Data.get("PR_PAL_VLC_V_VIN"));

		GuidewireAutomate_Validation("Primary Drivers", PR_PAL_VLC_PrimaryDriver, "contains", strAccountName);

		GuidewireAutomate_Validation("Assigned Drivers", PR_PAL_VLC_AssignedDrivers, "equals", "Assigned Drivers");
		GuidewireAutomate_Validation("Driver", PR_PAL_VLC_AD_Driver, "equals", strAccountName);

		GuidewireAutomate_Validation("Vehicle Rate Modifiers", PR_PAL_VLC_V_VehicleRateModifiers, "equals", "Vehicle Rate Modifiers");

		/*
		 * GuidewireAutomate_Validation("Anti Lock Brakes Discount", PR_PAL_VLC_V_VRM_AntiLockBrakesDiscount, "equals",
		 * lhm_TestCase_Table_Data.get("PR_PAL_VLC_V_VRM_AntiLockBrakesDiscount" )); GuidewireAutomate_Validation("Anti Theft Discount",
		 * PR_PAL_VLC_V_VRM_AntiTheftDiscount, "equals", lhm_TestCase_Table_Data.get("PR_PAL_VLC_V_VRM_AntiTheftDiscount"));
		 */

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void vehicleLevelCoverages_VehicleCoverages() throws Throwable {

		// Fetch data
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("policyReview");

		GuidewireAutomate_Validation("Vehicle Coverages", PR_PAL_VLC_V_VehicleCoverages, "equals", "Vehicle Coverages");

		GuidewireAutomate_Validation("Comprehensive Deductible", PR_PAL_VLC_V_VC_ComprehensiveDeductible, "equals", lhm_TestCase_Table_Data.get("PR_PAL_VLC_V_VC_ComprehensiveDeductible"));
		/*
		 * GuidewireAutomate_Validation("ComprehensiveDeductible Value", PR_PAL_VLC_V_VC_ComprehensiveDeductible_Value, "equals",
		 * lhm_TestCase_Table_Data.get( "PR_PAL_VLC_V_VC_ComprehensiveDeductible_Value")) ;
		 */
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void exclusionsAndConditions() throws Throwable {

		// Fetch data
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("policyReview");

		GuidewireAutomate_Validation("Exclusions and Conditions", PR_PAL_ExclusionsConditions, "equals", "Exclusions and Conditions");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

}
