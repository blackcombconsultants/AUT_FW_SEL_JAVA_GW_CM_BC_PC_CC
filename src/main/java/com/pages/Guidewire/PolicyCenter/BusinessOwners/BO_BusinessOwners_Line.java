package com.pages.Guidewire.PolicyCenter.BusinessOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class BO_BusinessOwners_Line extends SeleniumWebDriver_Commands {

	public BO_BusinessOwners_Line(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By BOLine_Header = By.xpath("//div[contains(@id,'BOPScreen-ttlBar')]");
	/*
	 * CoveragesTab
	 */
	private static By IncludedCoverages_CoveragesTab = By.xpath("//div[contains(@id,'BOPScreen-BOP_IncludedCardTab')]");

	private static By BO_SmallBusinessType = By.xpath("//select[contains(@name,'SmallBusinessType')]");
	/***
	 * Property Coverage
	 */
	private static By BO_PropertyCoverage  = By.xpath("//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Property Coverage')]");
	private static By BO_BlanketType       = By.xpath("//select[contains(@name,'BlanketType')]");
	// private static By BO_OptionalCoveragesDeductible = By.xpath("//select[contains(@name,'BlanketType')]");
	private static By BO_PropertyOptionalDeductible  = By.xpath("//select[contains(@name,'CovPatternInputGroup-3-CovTermInputSet-OptionTermInput')]");
	private static By BO_CauseOfLoss                 = By.xpath("//select[contains(@name,'CovPatternInputGroup-4-CovTermInputSet-TypekeyTermInput')]");
	/********
	 * Other Included Coverages
	 */
	private static By BO_OtherIncludedCoverages      = By.xpath("//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Other Included Coverages')]");
	private static By BO_EmployeeDishonesty_Checkbox = By.xpath("//input[contains(@name,'BOPLineOtherIncludedDV-0-CoverageInputSet-CovPatternInputGroup-_checkbox')]");

	private static By BO_EmployeeDishonestyLimit        = By.xpath("//select[contains(@name,'CovPatternInputGroup-0-CovTermInputSet-OptionTermInput')]");
	private static By BO_NumberofCoveredEmployees       = By.xpath("//input[contains(@name,'CovPatternInputGroup-1-CovTermInputSet-CovTermDirectInputSet-DirectTermInput')]");
	private static By BO_NumberofCoveredLocations       = By.xpath("//input[contains(@name,'CovPatternInputGroup-2-CovTermInputSet-CovTermDirectInputSet-DirectTermInput')]");
	private static By BO_HiredAuto_Checkbox             = By.xpath("//input[contains(@name,'BOPLineOtherIncludedDV-1-CoverageInputSet-CovPatternInputGroup-_checkbox')]");
	private static By BO_NonownedAutoLiability_Checkbox = By.xpath("//input[contains(@name,'BOPLineOtherIncludedDV-2-CoverageInputSet-CovPatternInputGroup-_checkbox')]");

	/**
	 * Liability Coverages
	 */
	private static By BO_LiabilityCoverages       = By.xpath("//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Liability Coverages')]");
	private static By BO_SpecialCoveragesPackages = By.xpath("//select[contains(@name,'CovPatternInputGroup-0-CovTermInputSet-TypekeyTermInput')]");
	/*****
	 * Additional Coverages
	 */
	private static By AdditionalCard_Tab          = By.xpath("//div[contains(@id,'BOPScreen-BOP_AdditionalCardTab')]//div[@role='tab']");
	private static By BO_AlaskaAttorneyFeesLimit  = By.xpath("//input[contains(@name,'DirectTermInput')]");

	public static void Businessowners() throws Throwable {

		try {
			lhm_TestCase_Table_Data = BO_Resuables.getData_BusinessOwners("businessOwners");

			GuidewireAutomate_Validation("Screen Header", BOLine_Header, "equals", "Businessowners Line");
			GuidewireAutomate("Coverages tab", IncludedCoverages_CoveragesTab, "clickAndwait", "click");
			GuidewireAutomate("SmallBusinessType", BO_SmallBusinessType, "selectByVisibleText", lhm_TestCase_Table_Data.get("BO_SmallBusinessType"));
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void PropertyCoverage() throws Throwable {

		try {
			lhm_TestCase_Table_Data = BO_Resuables.getData_BusinessOwners("businessOwners");

			GuidewireAutomate_Validation("Property Coverage", BO_PropertyCoverage, "equals", "Property Coverage");
			GuidewireAutomate("Blanket Type", BO_BlanketType, "selectByVisibleText", lhm_TestCase_Table_Data.get("BO_BlanketType"));
			// GuidewireAutomate("Optional Coverages Deductible", BO_OptionalCoveragesDeductible, "selectByVisibleText",
			// lhm_TestCase_Table_Data.get("BO_OptionalCoveragesDeductible"));
			GuidewireAutomate("Property Optional Deductible", BO_PropertyOptionalDeductible, "selectByVisibleText", lhm_TestCase_Table_Data.get("BO_PropertyOptionalDeductible"));
			GuidewireAutomate("Cause Of Loss", BO_CauseOfLoss, "selectByVisibleText", lhm_TestCase_Table_Data.get("BO_CauseOfLoss"));
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void OtherIncludedCoverages() throws Throwable {

		try {
			lhm_TestCase_Table_Data = BO_Resuables.getData_BusinessOwners("businessOwners");

			GuidewireAutomate_Validation("OtherIncludedCoverages", BO_OtherIncludedCoverages, "equals", "Other Included Coverages");
			GuidewireAutomate("Employee Dishonesty", BO_EmployeeDishonesty_Checkbox, "click", "click");

			GuidewireAutomate("Employee Dishonesty Limit", BO_EmployeeDishonestyLimit, "selectByVisibleText", lhm_TestCase_Table_Data.get("BO_EmployeeDishonestyLimit"));
			GuidewireAutomate("Number of Covered Employees", BO_NumberofCoveredEmployees, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BO_NumberofCoveredEmployees"));
			GuidewireAutomate("Number of Covered Locations", BO_NumberofCoveredLocations, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BO_NumberofCoveredLocations"));
			GuidewireAutomate("Hired Auto", BO_HiredAuto_Checkbox, "clickAndwait", "click");
			GuidewireAutomate("Nonowned Auto Liability", BO_NonownedAutoLiability_Checkbox, "clickAndwait", "click");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void LiabilityCoverages() throws Throwable {

		try {
			lhm_TestCase_Table_Data = BO_Resuables.getData_BusinessOwners("businessOwners");

			GuidewireAutomate_Validation("Liability Coverages", BO_LiabilityCoverages, "equals", "Liability Coverages");

			GuidewireAutomate("Special Coverages Packages", BO_SpecialCoveragesPackages, "selectByVisibleText", lhm_TestCase_Table_Data.get("BO_SpecialCoveragesPackages"));
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void AdditionalCoveragesTab() throws Throwable {

		try {
			lhm_TestCase_Table_Data = BO_Resuables.getData_BusinessOwners("businessOwners");

			GuidewireAutomate("AdditionalCardTab", AdditionalCard_Tab, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate("Alaska Attorney Fees Limit", BO_AlaskaAttorneyFeesLimit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BO_AlaskaAttorneyFeesLimit"));
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

}
