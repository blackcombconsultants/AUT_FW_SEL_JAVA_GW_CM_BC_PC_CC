package com.pages.Guidewire.PolicyCenter.PersonalAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class PA_Quote extends SeleniumWebDriver_Commands {

	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PA_Quote(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	/*
	 * Policy details
	 */

	private static By QU_SubmissionNumber    = By.xpath("//div[contains(@id,'SubmissionNumber')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_PolicyNumber        = By.xpath("//div[contains(@id,'PolicyNumber')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_AccountNumber       = By.xpath("//div[contains(@id,'AccountNumber')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_PolicyPeriod        = By.xpath("//div[contains(@id,'PolicyPeriod')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_PrimaryNamedInsured = By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_Address             = By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressSummary')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_County              = By.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_AddressType         = By.xpath("//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	private static By QU_AddressDescription  = By.xpath("//div[contains(@id,'PolicyAddressDisplayInputSet-AddressDescription')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_UnderwritingCompany = By.xpath("//div[contains(@id,'UWCompany')]//div[@class='gw-value-readonly-wrapper']");

	private static By QU_TransactionffectiveDate = By.xpath("//div[contains(@id,'Quote_SummaryDV-transaction')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_TransactionDescription  = By.xpath("//div[contains(@id,'Quote_SummaryDV-TransactionDescription')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_TotalPremium            = By.xpath("//div[contains(@id,'Quote_SummaryDV-TotalPremium')]//div[@class='gw-value-readonly-wrapper']");

	private static By QU_TaxesSurcharges = By.xpath("//div[contains(@id,'Quote_SummaryDV-Taxes')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_Total_Cost      = By.xpath("//div[contains(@id,'Quote_SummaryDV-TotalCost')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_ChangeinCost    = By.xpath("//div[contains(@id,'Quote_SummaryDV-ChangeInCost')]//div[@class='gw-value-readonly-wrapper']");

	// --->Policy Premium Xpaths
	private static By QU_PolicyPremium_Tab = By.xpath("//div[contains(@id,'SubmissionWizard_Quote_CumulativeCardTab')]//div[@class='gw-label']");

	private static By QU_PP_Garage1  = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Garage 1']");
	private static By QU_PP_Vehicle1 = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Vehicle 1']");

	private static By QU_PP_V_Year  = By.xpath("//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Year_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_PP_V_Make  = By.xpath("//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Make_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_PP_V_Model = By.xpath("//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Model_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_PP_V_VIN   = By.xpath("//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Vin_Cell')]//div[@class='gw-value-readonly-wrapper']");
	/*
	 * Coverages - Dynamic
	 */

	// ----->Premium amount xpaths

	private static By QU_PolicyPremium_title                                  = By.xpath("//div[contains(@id,'RatingCumulDetailsPanelSet-0-2')]/div[1]");
	private static By QU_Liability_Bodily_Injury_and_Property_Damage_Coverage = By.xpath("//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-0-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_Medical_Payments_Coverage                            = By.xpath("//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-1-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_Uninsured_Motorist_Bodily_Injury_Coverage            = By.xpath("//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-2-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_Uninsured_Motorist_Property_Damage_Coverage          = By.xpath("//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-3-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_Comprehensive_Coverage                               = By.xpath("//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-4-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_Collision_Coverage                                   = By.xpath("//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-5-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_Towing_and_Labor_Coverage                            = By.xpath("//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-6-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_Rental_Reimbursement_Coverage                        = By.xpath("//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-7-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");

	private static By QU_PP_Coverage_Subtotal = By.xpath("//td[contains(@id,'VehicleSubTotal')]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * Premium Subtotal and Taxes
	 */
	private static By QU_PP_PremiumSubtotalandTaxes = By.xpath("//div[@role='heading' and text()='Premium Subtotal and Taxes']");

	private static By QU_PP_PST_PremiumSubtotal = By.xpath("//td[contains(@id,'subTotalLV-SubTotal_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By QU_PP_PST_AKTax           = By.xpath("//td[contains(@id,'subTotalLV-0-Amount')]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * 
	 * Modules
	 * 
	 * void quoteDetails() throws Throwable;
	 * 
	 * void policyPremium_Garage1() throws Throwable;
	 * 
	 * void policyPremium_Vehicle1() throws Throwable;
	 * 
	 * void policyPremium_PremiumSubtotalandTaxes() throws Throwable;
	 * 
	 * void costChangeDetail() throws Throwable;
	 */

	public static void quoteDetails() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("quote");

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Quote_Header, "equals", "Quote");

		GuidewireAutomate_Validation("PrimaryNamedInsured", QU_PrimaryNamedInsured, "equals", strAccountName);
		GuidewireAutomate_Validation("Address", QU_Address, "contains", lhm_TestCase_Table_Data.get("QU_Address"));
		GuidewireAutomate_Validation("Address Type", QU_AddressType, "equals", lhm_TestCase_Table_Data.get("QU_AddressType"));
	}
	public static void viewQuoteDetails() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("quote");

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Quote_Header, "Contains", "Quote");

		GuidewireAutomate_Validation("PrimaryNamedInsured", QU_PrimaryNamedInsured, "equals", strAccountName);
		GuidewireAutomate_Validation("Address", QU_Address, "contains", lhm_TestCase_Table_Data.get("QU_Address"));
		GuidewireAutomate_Validation("Address Type", QU_AddressType, "equals", lhm_TestCase_Table_Data.get("QU_AddressType"));
	}

	public static void policyPremium_Garage1() throws Throwable {
		GuidewireAutomate_Validation("Garage 1", QU_PP_Garage1, "equals", "Garage 1");

	}

	public static void policyPremium_Vehicle1() throws Throwable {

		GuidewireAutomate_Validation("Vehicle 1", QU_PP_Vehicle1, "equals", "Vehicle 1");

		/*
		 * GuidewireAutomate_Validation("Model Year", QU_PP_V_Year, "equals", lhm_TestCase_Table_Data.get("QU_PP_V_Year"));
		 * GuidewireAutomate_Validation("Make", QU_PP_V_Make, "equals", lhm_TestCase_Table_Data.get("QU_PP_V_Make"));
		 * GuidewireAutomate_Validation("Model", QU_PP_V_Model, "equals", lhm_TestCase_Table_Data.get("QU_PP_V_Model"));
		 */

		// GuidewireAutomate_Validation("VIN", QU_PP_V_VIN, "contains",
		// lhm_TestCase_Table_Data.get("QU_PP_V_VIN").substring(1, 10));

		/*
		 * Liability - Bodily Injury and Property Damage Coverage
		 */
		String strLBIPDC = lhm_TestCase_Table_Data.get("QU_PP_V_Liability_BodilyInjuryPropertyDamageCoverage");
		if (!strLBIPDC.isEmpty()) {
			if (strLBIPDC.contains("refer")) {
				strLBIPDC = lhm_TestCase_Data.get("asdsadsa");
			}

			By QU_PP_V_Liability_BodilyInjuryPropertyDamageCoverage = By
					.xpath("//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Description_Cell')]//div[contains(@id,'Description')]//div[@class='gw-value-readonly-wrapper' and text()='" + strLBIPDC + "']");
			GuidewireAutomate_Validation("Liability - Bodily Injury and Property Damage Coverage", QU_PP_V_Liability_BodilyInjuryPropertyDamageCoverage, "equals", strLBIPDC);

			By QU_PP_V_LBIPDC_Premium = By.xpath("//div[contains(@id,'Description')]//div[@class='gw-value-readonly-wrapper' and text()='" + strLBIPDC
					+ "']/ancestor::td[contains(@id,'Description_Cell')]/following-sibling::td[contains(@id,'TxAmount_Cell')]//div[contains(@id,'TxAmount')]//div[@class='gw-value-readonly-wrapper']");
			GuidewireAutomate_Validation("Premium", QU_PP_V_LBIPDC_Premium, "fetch", lhm_TestCase_Table_Data.get("QU_PP_V_LBIPDC_Premium"));

		}

		GuidewireAutomate_Validation("Sub total", QU_PP_Coverage_Subtotal, "fetch", lhm_TestCase_Table_Data.get("QU_PP_Coverage_Subtotal"));

	}

	public static void policyPremium_PremiumSubtotalandTaxes() throws Throwable {
		GuidewireAutomate_Validation("Premium Subtotal and Taxes", QU_PP_PremiumSubtotalandTaxes, "equals", "Premium Subtotal and Taxes");

		GuidewireAutomate_Validation("Premium Subtotal", QU_PP_PST_PremiumSubtotal, "fetch", lhm_TestCase_Table_Data.get("QU_PP_PST_PremiumSubtotal"));
		GuidewireAutomate_Validation("AK Tax", QU_PP_PST_AKTax, "fetch", lhm_TestCase_Table_Data.get("QU_PP_PST_AKTax"));

	}

}
