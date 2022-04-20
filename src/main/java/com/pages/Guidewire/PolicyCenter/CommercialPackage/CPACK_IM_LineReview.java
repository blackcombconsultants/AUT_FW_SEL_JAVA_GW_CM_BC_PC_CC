package com.pages.Guidewire.PolicyCenter.CommercialPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CPACK_IM_LineReview extends SeleniumWebDriver_Commands {

	public CPACK_IM_LineReview(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}
	private static By LineReview_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");

	/*
	 * Primary Named Insured
	 */
	private static By LR_PrimaryNamedInsured = By.xpath("//div[contains(@id,'PrimaryNamedInsured')]//div[@class='gw-value']");
	private static By LR_Address             = By.xpath("//div[contains(@id,'AddressSummary')]//div[@class='gw-value']");
	private static By LR_County              = By.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	private static By LR_AddressType         = By.xpath("//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType') and contains(@class,'gw-ValueWidget')]//div[@class='gw-label']");
	private static By LR_AddressDescription  = By.xpath("//div[contains(@id,'AddressDescription') and contains(@class,'gw-ValueWidget')]//div[@class='gw-value-readonly-wrapper']");
	private static By LR_DateQuoteNeeded     = By.xpath("//div[contains(@id,'CPPLineReviewSummaryDV-DateQuoteNeeded')]//div[@class='gw-value-readonly-wrapper']");
	private static By LR_Line                = By.xpath("//div[contains(@id,'CPPLineReviewSummaryDV-PolicyLine')]//div[@class='gw-value-readonly-wrapper']");
	private static By LR_EffectiveDate       = By.xpath("//div[contains(@id,'CPPLineReviewSummaryDV-EffectiveDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By LR_ExpirationDate      = By.xpath("//div[contains(@id,'CPPLineReviewSummaryDV-ExpirationDate_Input')]//div[@class='gw-value-readonly-wrapper']");
	private static By LR_Product             = By.xpath("//div[contains(@id,'CPPLineReviewSummaryDV-Product')]//div[@class='gw-value-readonly-wrapper']");
	/*****
	 * Policy Details
	 */
	private static By PR_PolicyDetails       = By.xpath("//div[contains(@id,'PolicyLineSummaryPanelSet')]//div[@class='gw-TitleBar--title' and text()='Policy Details']");
	private static By PR_PolicyType          = By.xpath("//div[contains(@id,'HOPCoveragePartType')]//div[@class='gw-value']");
	private static By PR_CoverageForm        = By.xpath("//div[contains(@id,'HOPCoverageForm')]//div[@class='gw-value']");

	public static void LR_PrimaryInsured() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("lineReview_IM", strTestCaseName);

			GuidewireAutomate_Validation("screen Header", LineReview_Header, "equals", "Line Review");

			GuidewireAutomate_Validation("Primary Named Insured", LR_PrimaryNamedInsured, "equals", strAccountName);
			GuidewireAutomate_Validation("County", LR_County, "equals", lhm_TestCase_Table_Data.get("PR_County"));

			// GuidewireAutomate_Validation("PR Address", PR_Address, "equals", "Address");
			GuidewireAutomate_Validation("Address Type", LR_AddressType, "contains", lhm_TestCase_Table_Data.get("PR_AddressType"));
			// GuidewireAutomate_Validation("Address Description", PR_AddressDescription, "equals",
			// lhm_TestCase_Table_Data.get("PR_AddressDescription"));
			GuidewireAutomate_Validation("Date Quote Needed", LR_DateQuoteNeeded, "equals", lhm_TestCase_Table_Data.get("PR_DateQuoteNeeded"));
			GuidewireAutomate_Validation("Line", LR_Line, "equals", lhm_TestCase_Table_Data.get("LR_Line"));

			GuidewireAutomate_Validation("Product", LR_Product, "equals", lhm_TestCase_Table_Data.get("PR_Product"));
			GuidewireAutomate_Validation("Effective Date", LR_EffectiveDate, "equals", lhm_TestCase_Table_Data.get("PR_EffectiveDate"));
			GuidewireAutomate_Validation("Expiration Date", LR_ExpirationDate, "equals", lhm_TestCase_Table_Data.get("PR_ExpirationDate"));
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void LR_policyDetails() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("lineReview", strTestCaseName);

			GuidewireAutomate_Validation("Policy Details", PR_PolicyDetails, "equals", "Policy Details");
			GuidewireAutomate_Validation("Policy Type", PR_PolicyType, "equals", lhm_TestCase_Table_Data.get("PR_PolicyType"));
			GuidewireAutomate_Validation("Coverage Form", PR_CoverageForm, "equals", lhm_TestCase_Table_Data.get("PR_CoverageForm"));

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

}
