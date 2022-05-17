package com.pages.Guidewire.PolicyCenter.CommercialProperty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CP_PolicyReview extends SeleniumWebDriver_Commands {

	public CP_PolicyReview(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}
	private static By PolicyReviewHeader         = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By PrimaryNamedInsuredSection = By.xpath("//div[contains(@id,'PrimaryNamedInsured_Input')]//div[@class='gw-label gw-boldLabel']");
	private static By PrimaryNamedInsured        = By.xpath("//div[contains(@id,'PrimaryNamedInsured_Input')]//div[@class='gw-value-readonly-wrapper']");
	private static By Address                    = By.xpath("//div[contains(@id,'AddressSummary')]//div[@class='gw-value-readonly-wrapper']");
	private static By AddressSection             = By.xpath("//div[contains(@id,'AddressSummary_Input')]//div[@class='gw-label']");
	private static By County                     = By.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	private static By AddressType                = By.xpath("//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType') and contains(@class,'gw-ValueWidget')]//div[@class='gw-label']");
	private static By AddressDescription         = By.xpath("//div[contains(@id,'AddressDescription')]//div[@class='gw-value-readonly-wrapper']");
	private static By DateQuoteNeeded            = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-DateQuoteNeeded')]//div[@class='gw-value-readonly-wrapper']");
	private static By ProductSection             = By.xpath("//div[contains(@id,'Product_Input')]//div[@class='gw-label gw-boldLabel']");
	private static By Product                    = By.xpath("//div[contains(@id,'Product_Input')]//div[@class='gw-value-readonly-wrapper']");
	private static By EffectiveDateSection       = By.xpath("//div[contains(@id,'EffectiveDate_Input')]//div[@class='gw-label gw-boldLabel']");
	private static By EffectiveDate              = By.xpath("//div[contains(@id,'EffectiveDate_Input')]//div[@class='gw-value-readonly-wrapper']");
	private static By ExpirationDateSection      = By.xpath("//div[contains(@id,'ExpirationDate_Input')]//div[@class='gw-label gw-boldLabel']");
	private static By ExpirationDate             = By.xpath("//div[contains(@id,'ExpirationDate_Input')]//div[@class='gw-value-readonly-wrapper']");
	private static By PolicyDetailsHeader        = By.xpath("//div[contains(@id,'PolicyLineSummaryPanelSet')]//div[@class='gw-TitleBar--title' and text()='Policy Details']");

	private static By DetailsTab    = By.xpath("//div[contains(@id,'CPBlanket-BlanketDetailsTab')]//div[@role='tab']");
	private static By BlanketNumber = By.xpath("//div[contains(@id,'CPBlanket-BlanketNum')]//div[@class='gw-value-readonly-wrapper']");
	private static By BlanketType   = By.xpath("//div[contains(@id,'CPBlanket-BlanketType')]//div[@class='gw-RangeValue']");
	private static By GroupType     = By.xpath("//div[contains(@id,'CPBlanket-BlanketGroupType')]//div[@class='gw-RangeValue']");
	private static By Description   = By.xpath("//div[contains(@id,'CPBlanket-Description')]//div[@class='gw-value-readonly-wrapper']");
	private static By Location      = By.xpath("//div[contains(@id,'CPBlanket-BlanketLocation')]//div[@class='gw-value-readonly-wrapper']");
	private static By Limit         = By.xpath("//div[contains(@id,'CPBlanket-CPBlanketCovLimit')]//div[@class='gw-value-readonly-wrapper']");
	private static By Deductible    = By.xpath("//div[contains(@id,'CPBlanket-CPBlanketCovDeductible')]//div[@class='gw-RangeValue']");
	private static By Coinsurance   = By.xpath("//div[contains(@id,'CPBlanket-CPBlanketCovCoinsurance')]//div[@class='gw-RangeValue']");

	public static void PolicyReview() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("PolicyReview", strTestCaseName);

			GuidewireAutomate_Validation("Policy Review Header", PolicyReviewHeader, "equals", "Policy Review");
			GuidewireAutomate_Validation("Primary Named Insured Section", PrimaryNamedInsuredSection, "equals", "Primary Named Insured");
			GuidewireAutomate_Validation("Primary Named Insured", PrimaryNamedInsured, "equals", strAccountName);
			GuidewireAutomate_Validation("Policy Address", Address, "contains", lhm_TestCase_Table_Data.get("CP_Address"));
			GuidewireAutomate_Validation("County", County, "equals", lhm_TestCase_Table_Data.get("CP_County"));
			GuidewireAutomate_Validation("Address Type", AddressType, "equals", lhm_TestCase_Table_Data.get("CP_AddressType"));
			GuidewireAutomate_Validation("Address Description", AddressDescription, "contains", lhm_TestCase_Table_Data.get("CP_AddressDescription"));
			GuidewireAutomate_Validation("DateQuoteNeeded", DateQuoteNeeded, "equals", lhm_TestCase_Table_Data.get("CP_DateQuoteNeeded"));
			GuidewireAutomate_Validation("Product Section", ProductSection, "equals", "Product");
			GuidewireAutomate_Validation("Product", Product, "equals", lhm_TestCase_Table_Data.get("CP_Product"));
			GuidewireAutomate_Validation("Effective Date Section", EffectiveDateSection, "equals", "Effective Date");
			GuidewireAutomate_Validation("Effective Date", EffectiveDate, "equals", lhm_TestCase_Table_Data.get("CP_EffectiveDate"));
			GuidewireAutomate_Validation("Expiration Date Section", ExpirationDateSection, "equals", "Expiration Date");
			GuidewireAutomate_Validation("Expiration Date", ExpirationDate, "equals", lhm_TestCase_Table_Data.get("CP_ExpirationeDate"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void PolicyDetails() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("PolicyReview", strTestCaseName);

			GuidewireAutomate_Validation("Policy Details Header", PolicyDetailsHeader, "equals", "Policy Details");
			GuidewireAutomate("Details Tab", DetailsTab, "moveToElement", "moveToElement");
			GuidewireAutomate_Validation("Details Tab", DetailsTab, "equals", "Details");

			GuidewireAutomate_Validation("Blanket Number", BlanketNumber, "equals", lhm_TestCase_Table_Data.get("BlanketNumber"));
			GuidewireAutomate_Validation("Blanket Type", BlanketType, "equals", lhm_TestCase_Table_Data.get("BlanketType"));
			GuidewireAutomate_Validation("Group Type", GroupType, "equals", lhm_TestCase_Table_Data.get("GroupType"));
			GuidewireAutomate_Validation("Description", Description, "equals", lhm_TestCase_Table_Data.get("Description"));
			GuidewireAutomate_Validation("Location", Location, "contains", lhm_TestCase_Table_Data.get("Location"));
			GuidewireAutomate_Validation("Limit", Limit, "equals", lhm_TestCase_Table_Data.get("Limit"));
			GuidewireAutomate_Validation("Deductible", Deductible, "equals", lhm_TestCase_Table_Data.get("Deductible"));
			GuidewireAutomate_Validation("Coinsurance", Coinsurance, "equals", lhm_TestCase_Table_Data.get("Coinsurance"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

}
