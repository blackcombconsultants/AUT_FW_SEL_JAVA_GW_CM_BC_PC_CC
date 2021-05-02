package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Quote_PO {

	/*
	 * Policy details
	 */

	final By QU_SubmissionNumber = By
			.xpath("//div[contains(@id,'SubmissionNumber')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_PolicyNumber = By.xpath("//div[contains(@id,'PolicyNumber')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_AccountNumber = By
			.xpath("//div[contains(@id,'AccountNumber')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_PolicyPeriod = By.xpath("//div[contains(@id,'PolicyPeriod')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_PrimaryNamedInsured = By
			.xpath("//div[contains(@id,'Insured')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_Address = By.xpath(
			"//div[contains(@id,'GlobalAddressInputSet-AddressSummary')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_County = By
			.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_AddressType = By.xpath(
			"//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	final By QU_AddressDescription = By.xpath(
			"//div[contains(@id,'PolicyAddressDisplayInputSet-AddressDescription')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_UnderwritingCompany = By
			.xpath("//div[contains(@id,'UWCompany')]//div[@class='gw-value-readonly-wrapper']");

	final By QU_TransactionffectiveDate = By
			.xpath("//div[contains(@id,'Quote_SummaryDV-transaction')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_TransactionDescription = By.xpath(
			"//div[contains(@id,'Quote_SummaryDV-TransactionDescription')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_TotalPremium = By
			.xpath("//div[contains(@id,'Quote_SummaryDV-TotalPremium')]//div[@class='gw-value-readonly-wrapper']");

	final By QU_TaxesSurcharges = By
			.xpath("//div[contains(@id,'Quote_SummaryDV-Taxes')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_Total_Cost = By
			.xpath("//div[contains(@id,'Quote_SummaryDV-TotalCost')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_ChangeinCost = By
			.xpath("//div[contains(@id,'Quote_SummaryDV-ChangeInCost')]//div[@class='gw-value-readonly-wrapper']");

	// --->Policy Premium Xpaths
	final By QU_PolicyPremium_Tab = By
			.xpath("//div[contains(@id,'SubmissionWizard_Quote_CumulativeCardTab')]//div[@class='gw-label']");

	final By QU_PP_Garage1 = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Garage 1']");
	final By QU_PP_Vehicle1 = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Vehicle 1']");

	final By QU_PP_V_Year = By.xpath(
			"//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Year_Cell')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_PP_V_Make = By.xpath(
			"//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Make_Cell')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_PP_V_Model = By.xpath(
			"//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Model_Cell')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_PP_V_VIN = By.xpath(
			"//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Vin_Cell')]//div[@class='gw-value-readonly-wrapper']");
	/*
	 * Coverages - Dynamic
	 */

	// ----->Premium amount xpaths

	final By QU_PolicyPremium_title = By.xpath("//div[contains(@id,'RatingCumulDetailsPanelSet-0-2')]/div[1]");
	final By QU_Liability_Bodily_Injury_and_Property_Damage_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-0-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By QU_Medical_Payments_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-1-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By QU_Uninsured_Motorist_Bodily_Injury_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-2-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By QU_Uninsured_Motorist_Property_Damage_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-3-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By QU_Comprehensive_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-4-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By QU_Collision_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-5-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By QU_Towing_and_Labor_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-6-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By QU_Rental_Reimbursement_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-7-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");

	final By QU_PP_Coverage_Subtotal = By.xpath(
			"//td[contains(@id,'VehicleSubTotal')]//div[@class='gw-value-readonly-wrapper']");

	
	/*
	 * Premium Subtotal and Taxes
	 */
	final By QU_PP_PremiumSubtotalandTaxes = By.xpath("//div[@role='heading' and text()='Premium Subtotal and Taxes']");

	final By QU_PP_PST_PremiumSubtotal = By.xpath(
			"//td[contains(@id,'subTotalLV-SubTotal_Cell')]//div[@class='gw-value-readonly-wrapper']");
	final By QU_PP_PST_AKTax = By.xpath(
			"//td[contains(@id,'subTotalLV-0-Amount')]//div[@class='gw-value-readonly-wrapper']");

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

}
