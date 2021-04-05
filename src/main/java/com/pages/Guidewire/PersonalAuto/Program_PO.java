package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface Program_PO {

	/*
	 * Personal Auto New Submission
	 */
	final By NewSubmissions_PALob_Button = By.xpath(
			"//div[@id=\"NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-8-addSubmission\"]");
	final By PAuto_NewSubmission_Offering = By
			.xpath("//select[contains(@name,'SubmissionWizard-OfferingScreen-OfferingSelection')]");
	final By Qualification_CurrentlyInsured = By.xpath("//select[contains(@name,\'PreQualQuestion')]");
	final By DriverScreen_AddDriver_Button = By.xpath("//div[contains(@id,'AddDriver')]");
	final By Add_ExistingDriver = By.xpath("//div[contains(@id,'AddExistingContact')]");
	final By License_No = By.xpath("//input[contains(@name,'LicenseNumber')]");
	final By License_State = By.xpath("//select[contains(@name,'LicenseState')]");
	final By Roles_Tab = By.xpath("//div[contains(@id,'RolesCardTab')]");
	final By Year_First_Licensed = By.xpath("//input[contains(@name,'yearlicensed')]");
	final By No_of_Accidents_Policy_Level = By.xpath("//tr[contains(@id,'PolicyContactRolePanelSet-11')]//td[2]");
	final By No_of_Accidents_Account_Level = By.xpath("//tr[contains(@id,'PolicyContactRolePanelSet-11')]//td[3]");
	final By No_of_Violations_Policy_Level = By.xpath("//tr[contains(@id,'PolicyContactRolePanelSet-15')]//td[2]");
	final By No_of_Violations_Account_Level = By.xpath("//tr[contains(@id,'PolicyContactRolePanelSet-15')]//td[3]");
	final By Create_Vehicle = By.xpath(
			"//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel_tb-Add']");
	final By VIN = By.xpath("//input[contains(@name, 'VehicleDV-Vin_DV')]");
	final By Add_Driver_to_Vehicles_Button = By.xpath("//div[contains(@id,'DriverPctLV_tb-AddDriver')]");
	final By Cost_New = By.xpath("//input[contains(@name,'VehicleDV-CostNew_DV')]");

}
