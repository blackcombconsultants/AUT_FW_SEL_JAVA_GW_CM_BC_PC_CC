package com.pages.Guidewire.PolicyCenter.InlineMarine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class IM_PolicyReview extends SeleniumWebDriver_Commands {

	public IM_PolicyReview(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	// Primary Named Insured
	public static By PR_PrimaryNamedInsured = By.xpath("//div[contains(@id,'ReviewSummaryDV-PrimaryNamedInsured')]//div[@class='gw-value-readonly-wrapper']");
	public static By PR_Address             = By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressSummary')]//div[@class='gw-value-readonly-wrapper']");
	public static By PR_County              = By.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	public static By PR_AddressType         = By.xpath("//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType') and contains(@class,'gw-ValueWidget')]//div[@class='gw-label']");
	public static By PR_AddressDescription  = By.xpath("//div[contains(@id,'AddressDescription') and contains(@class,'gw-ValueWidget')]//div[@class='gw-value-readonly-wrapper']");
	public static By PR_DateQuoteNeeded     = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-DateQuoteNeeded')]//div[@class='gw-value-readonly-wrapper']");
	public static By PR_EffectiveDate       = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-EffectiveDate')]//div[@class='gw-value-readonly-wrapper']");
	public static By PR_ExpirationDate      = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-ExpirationDate_Input')]//div[@class='gw-value-readonly-wrapper']");
	public static By PR_Product             = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-Product')]//div[@class='gw-value-readonly-wrapper']");

	// Policy Details
	public static By  PolicyDetails   = By.xpath("//div[contains(@id,'PolicyLineSummaryPanelSet')]//div[@class='gw-TitleBar--title' and text()='Policy Details']");
	private static By PD_LocationName = By.xpath("//div[contains(@id,'PolicyLineSummaryPanelSet-glExposuresLV-0-EULoc')]//div[@class='gw-value-readonly-wrapper']");
	private static By PD_ClassCode    = By.xpath("//div[contains(@id,'PolicyLineSummaryPanelSet-glExposuresLV-0-EUClass')]//div[@class='gw-value-readonly-wrapper']");
	private static By PD_Description  = By.xpath("//div[contains(@id,'PolicyLineSummaryPanelSet-glExposuresLV-0-ClassCodeDescription')]//div[@class='gw-value-readonly-wrapper']");

	// Line-Level Coverages
	private static By LineLevelCoverages = By.xpath("//div[contains(@id,'PolicyLineSummaryPanelSet-LineDV')]//div[@class='gw-label gw-boldLabel' and text()='Line-Level Coverages']");
	// Policy Conditions
	private static By PolicyConditions = By.xpath("//div[contains(@id,'PolicyLineSummaryPanelSet-LineDV')]//div[@class='gw-label gw-boldLabel' and text()='Policy Conditions']");

	public static void PrimaryNamedInsured() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyReview", strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.PolicyReview_Header, "equals", "Policy Review");

			GuidewireAutomate_Validation("Primary Named Insured", PR_PrimaryNamedInsured, "equals", strAccountName);
			// GuidewireAutomate_Validation("Address", PR_Address, "contains",
			// lhm_TestCase_Table_Data.get("PR_Address"));
			GuidewireAutomate_Validation("County", PR_County, "equals", lhm_TestCase_Table_Data.get("PR_County"));
			GuidewireAutomate_Validation("Address Type", PR_AddressType, "equals", lhm_TestCase_Table_Data.get("PR_AddressType"));
			GuidewireAutomate_Validation("DateQuoteNeeded", PR_DateQuoteNeeded, "equals", lhm_TestCase_Table_Data.get("PR_DateQuoteNeeded"));

			GuidewireAutomate_Validation("Product", PR_Product, "equals", lhm_TestCase_Table_Data.get("PR_Product"));
			GuidewireAutomate_Validation("Effective Date", PR_EffectiveDate, "equals", lhm_TestCase_Table_Data.get("PR_EffectiveDate"));
			GuidewireAutomate_Validation("Expiration Date", PR_ExpirationDate, "equals", lhm_TestCase_Table_Data.get("PR_ExpirationDate"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {

		}
	}

}
