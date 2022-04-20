package com.pages.Guidewire.PolicyCenter.GeneralLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class GL_Exposures extends SeleniumWebDriver_Commands {

	public GL_Exposures(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By Exposures_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Exposures']");
	// ExposureValuesbylocation
	private static By EVL_Add            = By.xpath("//div[contains(@id,'ExposureUnitsLV_tb-Add')]//div[@role='button']");
	private static By EVL_EffectiveDate  = By.xpath("//div[contains(@id,'GL_ExposureUnitsLV-0-EffectiveDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By EVL_ExperationDate = By.xpath("//div[contains(@id,'GL_ExposureUnitsLV-0-ExpirationDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By EVL_LocationName   = By.xpath("//select[contains(@name,'GL_ExposureUnitsLV-0-Location')]");

	// ClassCode
	private static By EVL_ClassCode = By.xpath("//div[contains(@id,'ClassCode-SelectClassCode')]/span");
	// Class Code Search
	private static By ClassCodeSearch_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Class Code Search']");

	private static By CCS_Code   = By.xpath("//input[contains(@name,'GLClassCodeSearchDV-Code')]");
	private static By CCS_Search = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	private static By CCS_Select = By.xpath("//div[contains(@id,'ClassCodeSearchResultsLV-0-_Select')]/div[@role='button']");

	private static By EVL_Description = By.xpath("//div[contains(@id,'GL_ExposureUnitsLV-0-ClassCodeDescription')]//div[@class='gw-value-readonly-wrapper']");
	private static By EVL_Basics      = By.xpath("//input[contains(@name,'GL_ExposureUnitsLV-0-BasisAmount')]");
	private static By EVL_BasicType   = By.xpath("//div[contains(@id,'ClassCodeUnits')]//div[@class='gw-value-readonly-wrapper']");

	public static void ExposureValuesbylocation_Add() throws Throwable {
		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Exposures", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Exposures_Header, "equals", "Exposures");
			GuidewireAutomate("Add", EVL_Add, "click", "click");
			GuidewireAutomate_Validation("EffectiveDate", EVL_EffectiveDate, "equals", lhm_TestCase_Table_Data.get("EVL_EffectiveDate"));
			GuidewireAutomate_Validation("ExperationDate", EVL_ExperationDate, "equals", lhm_TestCase_Table_Data.get("EVL_ExperationDate"));
			GuidewireAutomate("LocationName", EVL_LocationName, "selectByIndex", "1");
			ClassCode_Search();
			getStaleElement("Description", EVL_Description);
			GuidewireAutomate_Validation("Description", EVL_Description, "equals", lhm_TestCase_Table_Data.get("EVL_Description"));
			GuidewireAutomate("Basics", EVL_Basics, "clearANDsendKeys", lhm_TestCase_Table_Data.get("EVL_Basics"));
			GuidewireAutomate_Validation("BasicType", EVL_BasicType, "equals", lhm_TestCase_Table_Data.get("EVL_BasicType"));

		} catch (Exception e) {

		}
	}

	public static void ClassCode_Search() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Exposures", strTestCaseName);
			getStaleElement("ClassCode", EVL_ClassCode);
			GuidewireAutomate("ClassCode", EVL_ClassCode, "click", "click");
			GuidewireAutomate_Validation("Screen Header", ClassCodeSearch_Header, "equals", "Class Code Search");
			GuidewireAutomate("Code", CCS_Code, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CCS_Code"));
			GuidewireAutomate("Search", CCS_Search, "click", "click");
			Thread.sleep(2000);
			GuidewireAutomate("Select", CCS_Select, "click", "click");

		} catch (Exception e) {

		}
	}

}
