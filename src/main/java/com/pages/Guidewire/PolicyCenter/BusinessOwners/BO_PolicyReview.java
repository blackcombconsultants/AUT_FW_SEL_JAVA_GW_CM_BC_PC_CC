package com.pages.Guidewire.PolicyCenter.BusinessOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class BO_PolicyReview extends SeleniumWebDriver_Commands {

	public BO_PolicyReview(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}
	private static By PolicyReview_Header = By.xpath("//div[contains(@id,'PolicyReviewScreen-ttlBar')]//div[@role='heading']");

	/*
	 * Primary Named Insured
	 */
	private static By PR_PrimaryNamedInsured = By.xpath("//div[contains(@id,'PrimaryNamedInsured')]//div[@class='gw-value']");
	private static By PR_Address             = By.xpath("//div[contains(@id,'AddressSummary')]//div[@class='gw-value']");
	private static By PR_County              = By.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_AddressType         = By.xpath("//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType') and contains(@class,'gw-ValueWidget')]//div[@class='gw-label']");
	private static By PR_AddressDescription  = By.xpath("//div[contains(@id,'AddressDescription') and contains(@class,'gw-ValueWidget')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_DateQuoteNeeded     = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-DateQuoteNeeded')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_EffectiveDate       = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-EffectiveDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_ExpirationDate      = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-ExpirationDate_Input')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_Product             = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-Product')]//div[@class='gw-value-readonly-wrapper']");
	/*****
	 * Policy Details
	 */
	private static By PR_PolicyDetails       = By.xpath("//div[contains(@id,'PolicyLineSummaryPanelSet')]//div[@class='gw-TitleBar--title' and text()='Policy Details']");
	private static By PR_PolicyType          = By.xpath("//div[contains(@id,'HOPCoveragePartType')]//div[@class='gw-value']");
	private static By PR_CoverageForm        = By.xpath("//div[contains(@id,'HOPCoverageForm')]//div[@class='gw-value']");
	private static By PR_PolicyChange        = By.xpath("//div[contains(@id,'DiffTreePanelLV-value2Header_inner')]//div[@class='gw-label']");
	private static By PR_PolicyInfo          = By.xpath("//div[contains(@id,'DiffTreePanelSet-DiffTreePanelLV-0-item')]//div[@class='gw-value-readonly-wrapper']");
	private static By PR_PolicyAddress       = By.xpath("//div[contains(@id,'DiffTreePanelSet-DiffTreePanelLV-0-0-item')]//div[@class='gw-value-readonly-wrapper']");

	public static void PR_PrimaryInsured() throws Throwable {

		try {

			lhm_TestCase_Table_Data = BO_Resuables.getData_BusinessOwners("policyReview");

			GuidewireAutomate_Validation("screen Header", PolicyReview_Header, "equals", "Policy Review");

			GuidewireAutomate_Validation("Primary Named Insured", PR_PrimaryNamedInsured, "equals", strAccountName);
			GuidewireAutomate_Validation("County", PR_County, "equals", lhm_TestCase_Table_Data.get("PR_County"));

			// GuidewireAutomate_Validation("PR Address", PR_Address, "equals", "Address");
			GuidewireAutomate_Validation("Address Type", PR_AddressType, "contains", lhm_TestCase_Table_Data.get("PR_AddressType"));
			// GuidewireAutomate_Validation("Address Description", PR_AddressDescription, "equals",
			// lhm_TestCase_Table_Data.get("PR_AddressDescription"));
			GuidewireAutomate_Validation("Date Quote Needed", PR_DateQuoteNeeded, "equals", lhm_TestCase_Table_Data.get("PR_DateQuoteNeeded"));

			GuidewireAutomate_Validation("Product", PR_Product, "equals", lhm_TestCase_Table_Data.get("PR_Product"));
			GuidewireAutomate_Validation("Effective Date", PR_EffectiveDate, "equals", lhm_TestCase_Table_Data.get("PR_EffectiveDate"));
			GuidewireAutomate_Validation("Expiration Date", PR_ExpirationDate, "equals", lhm_TestCase_Table_Data.get("PR_ExpirationDate"));
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void PR_policyDetails() throws Throwable {

		try {

			lhm_TestCase_Table_Data = BO_Resuables.getData_BusinessOwners("policyReview");

			GuidewireAutomate_Validation("Policy Details", PR_PolicyDetails, "equals", "Policy Details");
			GuidewireAutomate_Validation("Policy Type", PR_PolicyType, "equals", lhm_TestCase_Table_Data.get("PR_PolicyType"));
			GuidewireAutomate_Validation("Coverage Form", PR_CoverageForm, "equals", lhm_TestCase_Table_Data.get("PR_CoverageForm"));

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit Date : 29-March-2022
	 */
	public static void Verify_PolicyChange() throws Throwable {

		try {

			GuidewireAutomate_waitForElement(PolicyReview_Header, "visibilityOfElementLocated", "");
			GuidewireAutomate_Validation("Screen Header", PolicyReview_Header, "equals", "Policy Review");
			GuidewireAutomate_Validation("Policy Change Element", PR_PolicyChange, "contains", "Policy Change");
			GuidewireAutomate_Validation("Policy Info", PR_PolicyInfo, "contains", "Policy");
			GuidewireAutomate_Validation("Policy Address", PR_PolicyAddress, "contains", "Policy");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

}
