package com.pages.Guidewire.CommercialAuto;

import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CA_PolicyReview extends SeleniumWebDriver_Commands {

	public CA_PolicyReview(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

private static By PolicyReviewHeader  = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
private static By PrimaryNamedInsuredSection = By.xpath("//div[contains(@id,'PrimaryNamedInsured_Input')]//div[@class='gw-label gw-boldLabel']");
private static By PrimaryNamedInsured = By.xpath("//div[contains(@id,'PrimaryNamedInsured_Input')]//div[@class='gw-value-readonly-wrapper']");
private static By Address = By.xpath("//div[contains(@id,'AddressSummary')]//div[@class='gw-value-readonly-wrapper']");
private static By AddressSection = By.xpath("//div[contains(@id,'AddressSummary_Input')]//div[@class='gw-label']");
public static By County = By.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
public static By AddressType = By.xpath("//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType') and contains(@class,'gw-ValueWidget')]//div[@class='gw-label']");
public static By DateQuoteNeeded = By.xpath("//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-DateQuoteNeeded')]//div[@class='gw-value-readonly-wrapper']");
private static By ProductSection = By.xpath("//div[contains(@id,'Product_Input')]//div[@class='gw-label gw-boldLabel']");
private static By Product = By.xpath("//div[contains(@id,'Product_Input')]//div[@class='gw-value-readonly-wrapper']");
private static By EffectiveDateSection = By.xpath("//div[contains(@id,'EffectiveDate_Input')]//div[@class='gw-label gw-boldLabel']");
private static By EffectiveDate = By.xpath("//div[contains(@id,'EffectiveDate_Input')]//div[@class='gw-value-readonly-wrapper']");
private static By ExpirationDateSection = By.xpath("//div[contains(@id,'ExpirationDate_Input')]//div[@class='gw-label gw-boldLabel']");
private static By ExpirationDate = By.xpath("//div[contains(@id,'ExpirationDate_Input')]//div[@class='gw-value-readonly-wrapper']");
private static By PolicyDetailsHeader = By.xpath("//div[contains(@id,'PolicyLineSummaryPanelSet')]//div[@class='gw-TitleBar--title' and text()='Policy Details']");
private static By PolicyDetailsLineLevelCoverages = By.xpath("//div[contains(@id,'PolicyLineSummaryPanelSet')]//div[@class='gw-label gw-boldLabel' and text()='Line-Level Coverages']");
private static By PolicyDetailsStartCoverage = By.xpath("//div[contains(@id,'CoverageSummaryLV-0-1-term')]//div[@class='gw-value-readonly-wrapper']");
private static By PolicyDetailsEndCoverage = By.xpath("//div[contains(@id,'CoverageSummaryLV-0-2-term')]//div[@class='gw-value-readonly-wrapper']");
private	static By Tab_Differences  = By.xpath("//div[contains(@id,'DiffsTab')]");
private	static By Tab_PolicyReview = By.xpath("//div[contains(@id,'RewriteWizard_DifferencesScreen-PolicyReviewTab')]");

//validate policychange in policyreview

 private static By ExistingPolicyName = By.xpath("//div[contains(@id,'value1Header')]//div[@class='gw-label']");
private static By PolicyInfo  = By.xpath("//div[contains(@id,'DiffTreePanelLV-0-item')]//div[@class='gw-value-readonly-wrapper']");

	public static void clickTab_PolicyReview(String Tabname) throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.PolicyReview_Header, "equals", "Policy Review");

		if (Tabname.equalsIgnoreCase("Differences")) {
			GuidewireAutomate("Search", Tab_Differences, "clickAndwait", "click");
		} else if (Tabname.equalsIgnoreCase("Policy Review")) {
			GuidewireAutomate("Search", Tab_PolicyReview, "clickAndwait", "click");
		}

	}

public static void PolicyReview() throws Throwable {
	
	try {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("PolicyReview");
		
		GuidewireAutomate_Validation("Policy Review Header", PolicyReviewHeader, "equals", "Policy Review");
		GuidewireAutomate_Validation("Primary Named Insured Section", PrimaryNamedInsuredSection, "equals", "Primary Named Insured");	
		GuidewireAutomate_Validation("Primary Named Insured", PrimaryNamedInsured, "equals", strAccountName);
		GuidewireAutomate_Validation("Policy Address",Address, "contains",lhm_TestCase_Table_Data.get("CA_Address"));
		GuidewireAutomate_Validation("County", County, "equals", lhm_TestCase_Table_Data.get("CA_County"));
		GuidewireAutomate_Validation("Address Type", AddressType, "equals",lhm_TestCase_Table_Data.get("CA_AddressType"));
		GuidewireAutomate_Validation("DateQuoteNeeded", DateQuoteNeeded, "equals",lhm_TestCase_Table_Data.get("CA_DateQuoteNeeded"));
		GuidewireAutomate_Validation("Product Section", ProductSection, "equals", "Product");	
		GuidewireAutomate_Validation("Product", Product, "equals", lhm_TestCase_Table_Data.get("CA_Product"));
		GuidewireAutomate_Validation("Effective Date Section", EffectiveDateSection, "equals", "Effective Date");	
		GuidewireAutomate_Validation("Effective Date", EffectiveDate, "equals", lhm_TestCase_Table_Data.get("CA_EffectiveDate"));
		GuidewireAutomate_Validation("Expiration Date Section", ExpirationDateSection, "equals", "Expiration Date");	
		GuidewireAutomate_Validation("Expiration Date", ExpirationDate, "equals", lhm_TestCase_Table_Data.get("CA_ExpirationeDate"));
		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}

public static void PolicyDetails() throws Throwable {
	
	try {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("PolicyReview");
		
		GuidewireAutomate_Validation("Policy Details Header", PolicyDetailsHeader, "equals", "Policy Details");
		GuidewireAutomate_Validation("Line Level Coverages Section", PolicyDetailsLineLevelCoverages, "equals", "Line-Level Coverages");
		//GuidewireAutomate_Validation("Start Coverage", PolicyDetailsStartCoverage, "equals", lhm_TestCase_Table_Data.get("CA_EffectiveDate"));
		//GuidewireAutomate_Validation("End Coverage", PolicyDetailsEndCoverage, "equals", lhm_TestCase_Table_Data.get("CA_ExpirationeDate"));
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}
public static void PolicyReviewPolicyChangeValidation() throws Throwable {

         GuidewireAutomate_Validation("ExistingPolicy",ExistingPolicyName,"equals","Existing Policy");
		 GuidewireAutomate_Validation("Policyinfo",PolicyInfo,"equals","Policy Info");



}

	
}
