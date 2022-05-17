package com.pages.Guidewire.PolicyCenter.HomeOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class HO_PolicyReview extends SeleniumWebDriver_Commands {

	public HO_PolicyReview(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By PolicyReview_Header = By.xpath("//div[contains(@id,'PolicyReviewScreen-ttlBar')]");

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
	/*****
	 * SectionI
	 */
	private static By PR_SectionI            = By.xpath("//div[contains(@id,'SectionICoverageLV')]//div[@class='gw-VerbatimWidget--inner' and text()='Section I Coverages']");
	private static By PR_DwellingCoverageA   = By.xpath("//div[contains(@id,'Description')]//div[@class='gw-value-readonly-wrapper' and text()='Coverage A - Dwelling Coverage']");
	private static By PR_DwellingCoverageB   = By.xpath("//div[contains(@id,'Description')]//div[@class='gw-value-readonly-wrapper' and text()='Coverage B - Other Structures Coverage']");
	private static By PR_DwellingCoverageC   = By.xpath("//div[contains(@id,'Description')]//div[@class='gw-value-readonly-wrapper' and text()='Coverage C - Personal Property Coverage']");
	private static By PR_DwellingCoverageD   = By.xpath("//div[contains(@id,'Description')]//div[@class='gw-value-readonly-wrapper' and text()='Coverage D - Loss of Use Coverage']");
	private static By PR_DwellingCoverageI   = By.xpath("//div[contains(@id,'Description')]//div[@class='gw-value-readonly-wrapper' and text()='Section I Deductibles Coverage']");
	/*****
	 * SectionII
	 */
	private static By PR_SectionII           = By.xpath("//div[contains(@id,'SectionIICoverageLV')]//div[@class='gw-VerbatimWidget--inner' and text()='Section II Coverages']");
	private static By PR_DwellingCoverageE   = By.xpath("//div[contains(@id,'Description')]//div[@class='gw-value-readonly-wrapper' and text()='Coverage E - Personal Liability Coverage']");
	private static By PR_DwellingCoverageF   = By.xpath("//div[contains(@id,'Description')]//div[@class='gw-value-readonly-wrapper' and text()='Coverage F - Medical Payments To Others Coverage']");
	private static By PR_AdditionalCoverages = By.xpath("//div[contains(@id,'AdditionalCoverageLV')]//div[@class='gw-VerbatimWidget--inner' and text()='Additional Coverages']");
	private static By PR_OptionalCoverages   = By.xpath("//div[contains(@id,'OptionalCoverageLV')]//div[@class='gw-VerbatimWidget--inner' and text()='Optional Coverages']");
	private static By PR_PolicyConditions    = By.xpath("//div[contains(@id,'ConditionSummaryLV')]//div[@class='gw-VerbatimWidget--inner' and text()='Policy Conditions']");
	private static By PR_Modifiers           = By.xpath("//div[contains(@id,'HOPModifierSummaryLV')]//div[@class='gw-VerbatimWidget--inner' and text()='Modifiers']");

	public static void PR_PrimaryInsured() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyReview", strTestCaseName);

			GuidewireAutomate_Validation("screen Header", PolicyReview_Header, "equals", "Policy Review");

			GuidewireAutomate_Validation("Primary Named Insured", PR_PrimaryNamedInsured, "equals", strAccountName);
			GuidewireAutomate_Validation("County", PR_County, "equals", lhm_TestCase_Table_Data.get("PR_County"));

			// GuidewireAutomate_Validation("PR Address", PR_Address, "equals", "Address");
			GuidewireAutomate_Validation("Address Type", PR_AddressType, "contains", lhm_TestCase_Table_Data.get("PR_AddressType"));
			GuidewireAutomate_Validation("Address Description", PR_AddressDescription, "equals", lhm_TestCase_Table_Data.get("PR_AddressDescription"));
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

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyReview", strTestCaseName);

			GuidewireAutomate_Validation("Policy Details", PR_PolicyDetails, "equals", "Policy Details");
			GuidewireAutomate_Validation("Policy Type", PR_PolicyType, "equals", lhm_TestCase_Table_Data.get("PR_PolicyType"));
			GuidewireAutomate_Validation("Coverage Form", PR_CoverageForm, "equals", lhm_TestCase_Table_Data.get("PR_CoverageForm"));

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void PR_SectionICoverages() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyReview", strTestCaseName);

			GuidewireAutomate_Validation("Section I Coverages", PR_SectionI, "equals", "Section I Coverages");

			GuidewireAutomate_Validation("Coverage A Dwelling Coverage", PR_DwellingCoverageA, "equals", "Coverage A - Dwelling Coverage ");
			GuidewireAutomate_Validation("Coverage B Other Structures Coverage", PR_DwellingCoverageB, "equals", "Coverage B - Other Structures Coverage");
			GuidewireAutomate_Validation("Coverage C  Personal Property Coverage", PR_DwellingCoverageC, "equals", "Coverage C - Personal Property Coverage");
			GuidewireAutomate_Validation("Coverage D  Loss of Use Coverage", PR_DwellingCoverageD, "equals", "Coverage D - Loss of Use Coverage");
			GuidewireAutomate_Validation("Section I Deductibles Coverage", PR_DwellingCoverageI, "equals", "Section I Deductibles Coverage");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void PR_SectionIICoverages() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyReview", strTestCaseName);

			GuidewireAutomate_Validation("Section II Coverages", PR_SectionII, "equals", "Section II Coverages");

			GuidewireAutomate_Validation("Coverage E - Personal Liability Coverage", PR_DwellingCoverageE, "equals", "Coverage E - Personal Liability Coverage");
			GuidewireAutomate_Validation("Coverage F - Medical Payments To Others Coverage", PR_DwellingCoverageF, "equals", "Coverage F - Medical Payments To Others Coverage");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void PR_additionalCoverage() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyReview", strTestCaseName);

			GuidewireAutomate_Validation("Additional Coverages", PR_AdditionalCoverages, "equals", "Additional Coverages");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void PR_optionalCoverage() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyReview", strTestCaseName);

			GuidewireAutomate_Validation("Optional Coverages", PR_OptionalCoverages, "equals", "Optional Coverages");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void PR_PolicyConditions() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyReview", strTestCaseName);

			GuidewireAutomate_Validation("Policy Conditions", PR_PolicyConditions, "equals", "Policy Conditions");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void PR_Modifiers() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyReview", strTestCaseName);

			GuidewireAutomate_Validation("Modifiers", PR_Modifiers, "equals", "Modifiers");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
}
