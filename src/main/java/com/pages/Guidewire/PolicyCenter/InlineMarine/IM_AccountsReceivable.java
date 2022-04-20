package com.pages.Guidewire.PolicyCenter.InlineMarine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class IM_AccountsReceivable extends SeleniumWebDriver_Commands {

	public IM_AccountsReceivable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By AccountsReceivable_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Accounts Receivable']");

	// AccountsReceivable-Part Level Information

	private static By AR_PLI_Reporting      = By.xpath("//input[contains(@id,'IMARPartLevelInformationDV-reporting_1')]");
	private static By AR_PLI_BusinessClass  = By.xpath("//select[contains(@name,'businessClass')]");
	private static By AR_PLI_CoinsurancePct = By.xpath("//select[contains(@name,'coinsurance')]");

	// Part Level Information -Off Premises Property
	private static By PLI_OPP             = By.xpath("//input[contains(@name,'CovPatternInputGroup-_checkbox')]");
	private static By PLI_OPP_Description = By.xpath("//input[contains(@name,'CovTermInputSet-StringTermInput')]");
	private static By PLI_OPP_Limit       = By.xpath("//input[contains(@name,'CovTermDirectInputSet-DirectTermInput')]");

	// AccountsReceivableCoverages
	private static By ARC_Add               = By.xpath("//div[contains(@id,'IMARItemDV-Add')]/div[@role='button']");
	private static By ARC_Location_Building = By.xpath("//select[contains(@name,'buildingcell')]");
	private static By ARC_ReceptacleType    = By.xpath("//select[contains(@name,'containercell')]");
	private static By ARC_PercentDuplicated = By.xpath("//select[contains(@name,'duplicatedCell')]");
	private static By ARC_Limit             = By.xpath("//input[contains(@name,'ARLlimitCell')]");

	public static void PartLevelInformation() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("accountsReceivable", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", AccountsReceivable_Header, "equals", "Accounts Receivable");
			GuidewireAutomate("Reporting", AR_PLI_Reporting, "click", "click");
			GuidewireAutomate("BusinessClass", AR_PLI_BusinessClass, "selectByVisibleText", lhm_TestCase_Table_Data.get("AR_PLI_BusinessClass"));
			GuidewireAutomate("CoinsurancePct", AR_PLI_CoinsurancePct, "selectByVisibleText", lhm_TestCase_Table_Data.get("AR_PLI_CoinsurancePct"));

		} catch (Exception e) {

		}
	}

	public static void PLI_OffPremisesProperty() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("accountsReceivable", strTestCaseName);
			GuidewireAutomate("CBC_Vehicle", PLI_OPP, "click", "click");
			GuidewireAutomate("Description", PLI_OPP_Description, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PLI_OPP_Description"));
			GuidewireAutomate("Limit", PLI_OPP_Limit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PLI_OPP_Limit"));

		} catch (Exception e) {

		}
	}

	public static void AccountsReceivableCoverages_Add() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("accountsReceivable", strTestCaseName);
			GuidewireAutomate("Add", ARC_Add, "click", "click");
			GuidewireAutomate("Location/Building", ARC_Location_Building, "selectByIndex", "1");
			GuidewireAutomate("ReceptacleType", ARC_ReceptacleType, "selectByVisibleText", lhm_TestCase_Table_Data.get("ARC_ReceptacleType"));
			GuidewireAutomate("PercentDuplicated", ARC_PercentDuplicated, "selectByVisibleText", lhm_TestCase_Table_Data.get("ARC_PercentDuplicated"));
			GuidewireAutomate("Limit", ARC_Limit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ARC_Limit"));

		} catch (Exception e) {

		}
	}
}
