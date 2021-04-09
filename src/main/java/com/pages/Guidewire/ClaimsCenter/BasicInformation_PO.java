package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface BasicInformation_PO {

	final By basicInfoName = By
			.id("FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name-ReportedBy_NameMenuIcon");
	final By basicInfo_screen_tittlebar=By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-ttlBar");
	final By clickNewPerson = By.id(
			"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem");
	final By firstName = By.name(
			"NewContactPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-FirstName");
	final By lastName = By.name(
			"NewContactPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-LastName");
	final By workPhone = By.name(
			"NewContactPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-Work-GlobalPhoneInputSet-NationalSubscriberNumber");
	final By primaryphone = By
			.name("NewContactPopup-ContactDetailScreen-ContactBasicsDV-PersonContactInfoInputSet-PrimaryPhone");
	final By address1 = By.name(
			"NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1");
	final By city = By.name(
			"NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City");
	final By state = By.name(
			"NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State");
	final By zipCode = By.name(
			"NewContactPopup-ContactDetailScreen-ContactBasicsDV-PrimaryAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode");
	final By testClick = By.id("NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb");
	final By update = By.xpath(
			"//*[@id='NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-CustomUpdateButton']/div/div[2]");
	final By relationShipToInsured = By
			.name("FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-Claim_ReportedByType");
	final By insuredWorkersName = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name");
	final By involvedVehicleCheckBox=By.xpath("//div[contains(@id,'InsuredVehicleInputGroup-_checkbox')]");
	final By next = By.id("FNOLWizard-Next");
	final By dupButton = By
			.id("NewClaimDuplicatesWorksheet-NewClaimDuplicatesScreen-NewClaimDuplicatesWorksheet_CloseButton");

	void basicInfo() throws Throwable;
}
