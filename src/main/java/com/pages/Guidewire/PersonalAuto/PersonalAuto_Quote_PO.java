package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Quote_PO {
	// ----->Quoute Details Xpaths
	final By PA_Quote_Screen_titlebar = By.xpath("//div[contains(@id,'QuoteScreen-ttlBar')]//div[1]/div");
	final By PA_Quote_Submission_Number = By.xpath(
			"//div[contains(@id,'QuoteScreen-Quote_SummaryDV-JobNumber_Input')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Policy_Period = By.xpath(
			"//div[contains(@id,'QuoteScreen-Quote_SummaryDV-PolicyPeriod_Input')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Primary_Named_Insured = By
			.xpath("//div[contains(@id,'Quote_SummaryDV-Insured_Input')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Address = By.xpath(
			"//div[contains(@id,'GlobalAddressInputSet-AddressSummary_Input')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_County = By.xpath(
			"//div[contains(@id,'GlobalAddressInputSet-County_Input')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Address_Type = By.xpath(
			"//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	final By PA_Quote_Address_Description = By.xpath(
			"//div[contains(@id,'PolicyAddressDisplayInputSet-AddressDescription_Input')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Underwriting_Company = By
			.xpath("//div[contains(@id,'Quote_SummaryDV-UWCompany_Input')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Total_Premium = By.xpath(
			"//div[contains(@id,'Quote_SummaryDV-TotalPremium_Input')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Taxes_Surcharges = By
			.xpath("//div[contains(@id,'Quote_SummaryDV-Taxes_Input')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Total_Cost = By
			.xpath("//div[contains(@id,'Quote_SummaryDV-TotalCost_Input')]//div[@class='gw-value-readonly-wrapper']");

	// --->Policy Premium Xpaths
	final By PA_Quote_Policy_Premium_tab = By
			.xpath("//div[contains(@id,'SubmissionWizard_Quote_CumulativeCardTab')]//div[@class='gw-label']");
	final By PA_Quote_Model_Year = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-vehicleLV-5')]//td[1]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Make = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-vehicleLV-5')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Model = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-vehicleLV-5')]//td[3]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_VIN = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-vehicleLV-5')]//td[4]//div[@class='gw-value-readonly-wrapper']");

	// ------>quote buttons Xpaths
	final By PA_Quote_Back_Button = By.xpath("//div[@id='SubmissionWizard-Prev']/div");
	final By PA_Quote_Next_Button = By.xpath("//div[@id='SubmissionWizard-Next']/div");
	final By PA_Quote_Release_Lock_Button = By.xpath("//div[contains(@id,'JobWizardToolbarButtonSet-Unlock')]/div");
	final By PA_Quote_Edit_Policy_Transaction = By
			.xpath("//div[contains(@id,'JobWizardToolbarButtonSet-EditPolicy')]/div");
	final By PA_Quote_Save_Draft = By.xpath("//div[contains(@id,'JobWizardToolbarButtonSet-Draft')]/div");
	final By PA_Quote_Versions = By.xpath(
			"//div[contains(@id,'JobWizardToolbarButtonSet-Versions')]//div[@class='gw-action--expand-button gw-no-pointer']");
	final By PA_Quote_Start_MultiVersion = By
			.xpath("//div[contains(@id,'JobWizardToolbarButtonSet-Versions-NewVersion')]");
	final By PA_Quote_Start_Slide_by_Slide = By
			.xpath("//div[contains(@id,'JobWizardToolbarButtonSet-Versions-SideBySide')]");
	final By PA_Quote_Bind_Options = By.xpath(
			"//div[contains(@id,'JobWizardToolbarButtonSet-BindOptions')]//div[@class='gw-action--expand-button gw-no-pointer']");
	final By PA_Quote_Bind_Only = By.xpath("//div[contains(@id,'JobWizardToolbarButtonSet-BindOptions-BindOnly')]");
	final By PA_Quote_Issue_Policy = By
			.xpath("//div[contains(@id,'JobWizardToolbarButtonSet-BindOptions-BindAndIssue')]");

	// ----->Premium amount xpaths

	final By PA_Quote_PolicyPremium_title = By.xpath("//div[contains(@id,'RatingCumulDetailsPanelSet-0-2')]/div[1]");
	final By PA_Quote_Liability_Bodily_Injury_and_Property_Damage_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-0-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Medical_Payments_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-1-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Uninsured_Motorist_Bodily_Injury_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-2-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Uninsured_Motorist_Property_Damage_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-3-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Comprehensive_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-4-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Collision_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-5-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Towing_and_Labor_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-6-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Rental_Reimbursement_Coverage = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-7-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Subtotal = By.xpath(
			"//td[contains(@id,'RatingCumulDetailsPanelSet-0-0-costLV-VehicleSubTotal_Cell')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Premium_Subtotal = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-subTotalLV-1')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_AK_Tax = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-subTotalLV-0-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");

	void pa_QuoteScreen_Validate() throws Throwable;

	void Quote_Details(String testingType) throws Throwable;

	void Quote_Vehicles_Validate(String testingType) throws Throwable;

	void Quote_Premium_Validate(String testingType) throws Throwable;

}
