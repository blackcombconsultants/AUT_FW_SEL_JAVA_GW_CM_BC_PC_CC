package com.pages.Guidewire.CommercialAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class CA_Quote extends SeleniumWebDriver_Commands {
	public CA_Quote(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By Quote_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");

	private static By QU_SubmissionNumber = By
			.xpath("//div[contains(@id,'JobNumber')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_PolicyPeriod = By
			.xpath("//div[contains(@id,'PolicyPeriod')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_PrimaryNamedInsured = By
			.xpath("//div[contains(@id,'Insured')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_Address = By
			.xpath("//div[contains(@id,'AddressSummary')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_County = By
			.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_AddressType = By.xpath(
			"//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	private static By QU_AddressDescription = By.xpath(
			"//div[contains(@id,'PolicyAddressDisplayInputSet-AddressDescription')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_UnderwritingCompany = By
			.xpath("//div[contains(@id,'UWCompany')]//div[@class='gw-value-readonly-wrapper']");

	private static By QU_TotalPremium = By
			.xpath("//div[contains(@id,'Quote_SummaryDV-TotalPremium')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_Taxes = By
			.xpath("//div[contains(@id,'Quote_SummaryDV-Taxes')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_TotalCost = By
			.xpath("//div[contains(@id,'Quote_SummaryDV-TotalCost')]//div[@class='gw-value-readonly-wrapper']");

	public static void quoteDetails() throws Throwable {
		try {
		
		  lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Quote", strTestCaseName);
		 

		  GuidewireAutomate_Validation("Screen Header", Quote_Header, "equals", "Quote");
			
		  GuidewireAutomate_Validation("SubmissionNumber", QU_SubmissionNumber,"equals", strSubmissionNumber);
		//GuidewireAutomate_Validation("PolicyPeriod", QU_PolicyPeriod, "contains", lhm_TestCase_Table_Data.get("QU_PolicyPeriod"));
			 
		  GuidewireAutomate_Validation("PrimaryNamedInsured", QU_PrimaryNamedInsured, "equals", strAccountName);
		  GuidewireAutomate_Validation("Address",  QU_Address, "contains", lhm_TestCase_Table_Data.get("QU_Address"));
		  GuidewireAutomate_Validation("County", QU_County, "equals", lhm_TestCase_Table_Data.get("QU_County"));		  
		  GuidewireAutomate_Validation("Address Type", QU_AddressType, "equals",lhm_TestCase_Table_Data.get("QU_AddressType"));
		  GuidewireAutomate_Validation("Address Description", QU_AddressDescription, "contains",lhm_TestCase_Table_Data.get("QU_AddressDescription"));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		
		
		}
	}

	public static void policyPremium_PremiumSubtotalandTaxes() throws Throwable {
		try {
		GuidewireAutomate_Validation("TotalPremium ", QU_TotalPremium, "Contains",
				lhm_TestCase_Table_Data.get("QU_TotalPremium"));

		GuidewireAutomate_Validation("Taxes", QU_Taxes, "Contains", lhm_TestCase_Table_Data.get("QU_Taxes"));
		GuidewireAutomate_Validation("QU_TotalCost", QU_TotalCost, "Contains",
				lhm_TestCase_Table_Data.get("QU_TotalCost"));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		
		
		}
	}
}
