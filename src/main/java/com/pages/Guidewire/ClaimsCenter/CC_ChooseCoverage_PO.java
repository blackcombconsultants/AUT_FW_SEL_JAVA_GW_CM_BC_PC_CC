package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface CC_ChooseCoverage_PO {

	// New Exposure Page
	final By NewExposureHeader = By.xpath(
			"//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'New Exposure')]");
	final By ExposureTitle = By.xpath("//div[contains(@id,'NewExposureScreen-NewExposureDV')]//div[text()='Exposure']");
	final By NewExposureUpdateButton = By
			.xpath("//div[contains(@id,'NewExposure-NewExposureScreen-Update')]//div[@role='button']");
	// New Exposure Page
	final By ExposureHeader = By.xpath(
			"//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Exposures']");

	// New Exposure Page for Edit Incident Vehicle
	final By EditIncidentClaimantTitle = By.xpath(
			"//div[contains(@id,'NewExposureDV') and @role='group']//div[text()='Claimant' and @class='gw-label gw-boldLabel']");
	final By EditIncidentClaimant = By.xpath("//select[contains(@name,'Claimant_Picker')]");

	final By EditIncident_IncidentOverviewTitle = By
			.xpath("//div[contains(@id,'NewExposureDV') and @role='group']//div[text()='Incident Overview']");
	final By EditIncident_VehicleEditButton = By
			.xpath("//div[contains(@id,'IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	final By EditIncident_VehicleNewIncident = By
			.xpath("//div[contains(@id,'NewIncidentMenuItem')]//div[@role='menuitem']");
	final By EditIncident_VehicleEditIncident = By
			.xpath("//div[contains(@id,'EditIncidentMenuItem')]//div[@role='menuitem']");

	// Edit Vehicle Incident Page
	final By EditVehicleIncidentHeader = By
			.xpath("//div[contains(@id,'IncidentScreen')]//div[@role='heading' and @class='gw-TitleBar--title']");
	final By InvolvedVehicleTitle = By
			.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Involved Vehicle']");

	final By DriverOfInvolvedVehicleTitle = By.xpath(
			"//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Driver of Involved Vehicle']");
	final By DriverName = By.xpath("//select[contains(@name,'VehicleIncidentDV-Driver_Picker')]");

	final By LoanInformationTitle = By
			.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Loan Information']");
	final By ServicesToPerformTitle = By
			.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Services to Perform']");
	final By DamageDescriptionTitle = By
			.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Damage Description']");
	final By DamageDescription = By.xpath(
			"//div[contains(@id,'VehicleIncidentDV-Description')]//textarea[contains(@name,'VehicleIncidentDV-Description')]");
	final By DetailsTitle = By
			.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Details']");
	final By DetailsLossOccurred = By.xpath("//select[contains(@name,'VehicleIncidentDV-LossOccured')]");

	final By EditIncident_OkButton = By.xpath("//div[contains(@id,'IncidentScreen-Update')]//div[@role='button']");

	// New Exposure Page for New Incident Injury

	final By NewIncident_InjuryIncidentOverviewTitle = By
			.xpath("//div[contains(@id,'NewExposureDV')]//div[text()='Injury Incident Overview']");
	final By NewIncident_InjuryEditButton = By
			.xpath("//div[contains(@id,'IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	final By NewIncident_InjuryNewIncident = By
			.xpath("//div[contains(@id,'NewIncidentMenuItem')]//div[@role='menuitem']");

	// New Injury Incident Page
	final By NewInjuryIncident_InjuryDetailsTitle = By
			.xpath("//div[contains(@id,'NewInjuryIncidentScreen-InjuryIncidentDV')]//div[text()='Injury Details']");
	final By NewInjuryIncident_InjuredPerson = By.xpath("//select[contains(@name,'InjuryIncidentDV-Injured_Picker')]");
	final By NewInjuryIncident_LossParty = By.xpath("//select[contains(@name,'InjuryIncidentInputSet-LossParty')]");
	final By NewInjuryIncident_DescribeInjuries = By.xpath(
			"//div[contains(@id,'InjuryIncidentInputSet-InjuryDescription')]//textarea[contains(@name,'InjuryIncidentInputSet-InjuryDescription')]");
	final By NewInjuryIncident_OkButton = By
			.xpath("//div[contains(@id,'NewInjuryIncidentScreen-Update')]//div[@role='button']");

	final By NewInjuryIncident_AddButton = By.xpath(
			"//div[contains(@id,'InjuryIncidentInputSet-EditableBodyPartDetailsLV_tb-Add')]//div[@role='button']");

	final By NewInjuryIncident_AreaOfBody = By.xpath("//select[contains(@name,'PrimaryBodyPart')]");
	final By NewInjuryIncident_BodyPart = By.xpath("//select[contains(@name,'DetailedBodyPart')]");
	final By NewInjuryIncident_PPDPercenrage = By.xpath("//input[contains(@name,'PermamentImpairmentPercentage')]");

	// New Exposure Page for Edit Property
	final By PropertyEdit_ClaimantTitle = By.xpath(
			"//div[contains(@id,'NewExposureDV-NewClaimPropertyDamageDV-4') and @role='group']//div[text()='Claimant']");
	final By PropertyEdit_Claimant = By.xpath("//select[contains(@name,'Claimant_Picker')]");
	final By PropertyEdit_IncidentOverviewTitle = By.xpath(
			"//div[contains(@id,'NewExposureDV-NewClaimPropertyDamageDV') and @role='group']//div[text()='Incident Overview']");
	final By PropertyEdit_PropertyNameEditButton = By
			.xpath("//div[contains(@id,'Incident-Property_IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	final By PropertyEdit_NewIncident = By
			.xpath("//div[contains(@id,'NewClaimPropertyDamageDV_NewIncidentMenuItem')]//div[@role='menuitem']");

	// New Property Incident
	final By NewPropertyIncident_DetailsTitle = By
			.xpath("//div[contains(@id,'Vehicle_DetailsCardTab')]//div[text()='Details']");
	final By NewPropertyIncident_DamageTitle = By
			.xpath("//div[contains(@id,'FixedPropertyIncidentDV')]//div[text()='Damage']");
	final By NewPropertyIncident_PropertyDescription = By
			.xpath("//div[contains(@id,'PropertyDescription')]//input[contains(@name,'PropertyDescription')]");
	final By NewPropertyIncident_DamageDescription = By
			.xpath("//div[contains(@id,'Description')]//textarea[contains(@name,'Description')]");
	final By NewPropertyIncident_PropertyTitle = By
			.xpath("//div[contains(@id,'FixedPropertyIncidentDV')]//div[text()='Property']");
	final By NewPropertyIncident_Owner = By.xpath("//select[contains(@name,'FixedPropertyIncidentDV-Owner')]");
	final By NewPropertyIncident_PropertyName = By
			.xpath("//select[contains(@name,'CCAddressInputSet-globalAddressContainer-Address_Picker')]");
	final By NewPropertyIncident_State = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By NewPropertyIncident_OkButton = By
			.xpath("//div[contains(@id,'NewFixedPropertyIncidentScreen-Update')]//div[@role='button']");
	final By NewPropertyIncident_Address = By.xpath("//input[contains(@name,'AddressLine1')]");
	final By NewPropertyIncident_Country = By.xpath("//select[contains(@name,'GlobalAddressInputSet-Country')]");
	// New Vehicle Incident
	final By NewVehicleIncident_Header = By
			.xpath("//div[contains(@id,'IncidentScreen')]//div[@class='gw-TitleBar--title']");
	final By NewVehicleIncident_DetailsTitle = By
			.xpath("//div[contains(@id,'Vehicle_DetailsCardTab')]//div[text()='Details']");
	final By NewVehicleIncident_SelectVehicle = By
			.xpath("//select[contains(@name,'VehicleIncidentDV-Vehicle_Picker')]");
	final By NewVehicleIncident_Year = By.xpath("//input[contains(@name,'VehicleIncidentDV-Vehicle_Year')]");
	final By NewVehicleIncident_Make = By.xpath("//input[contains(@name,'VehicleIncidentDV-Vehicle_Make')]");
	final By NewVehicleIncident_Model = By.xpath("//input[contains(@name,'VehicleIncidentDV-Vehicle_Model')]");
	final By Incident_OkButton = By.xpath("//div[contains(@id,'IncidentScreen-Update')]//div[@role='button']");

	// New Exposure PIP
	final By PIPNewExposure_ClaimantTitle = By
			.xpath("//div[contains(@id,'NewExposureDV-NewPIPSummaryDV-4') and @role='group']//div[text()='Claimant']");
	final By PIPNewExposure_Claimant = By.xpath("//select[contains(@name,'PIPDamages_Claimant')]");
	final By PIPNewExposure_InjuryIncidentOverviewTitle = By.xpath(
			"//div[contains(@id,'NewPIPSummaryDV-BIDamageInputSet') and @role='group']//div[text()='Injury Incident Overview']");
	final By PIPNewExposure_InjuryEditButton = By
			.xpath("//div[contains(@id,'Incident-Injury_IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	final By PIPNewExposure_InjuryNewIncident = By
			.xpath("//div[contains(@id,'NewIncidentMenuItem')]//div[@role='menuitem']");

	// New Exposure Rental Car Loss of Use
	final By NewExposureLocation = By.xpath("//select[contains(@name,'globalAddressContainer-Address_Picker')]");

	// Towing and labor Edit vehicle incident
	final By TowingAndLabor_ClaimantTitle = By
			.xpath("//div[contains(@id,'NewClaimTowOnlyDV-4') and @role='group']//div[text()='Claimant']");
	final By TowingAndLabor_IncidentOverview = By.xpath(
			"//div[contains(@id,'NewExposureDV-NewClaimTowOnlyDV') and @role='group']//div[text()='Incident Overview']");

	// validate Error Message
	final By ValidationResults_Header = By
			.xpath("//div[contains(@id,'wsTabBar')]//div[@class='gw-label' and text()='Validation Results']");
	final By ValidationResults_WarningTitle = By
			.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[text()='Warnings:']");
	final By ValidationResults_Warning_First = By.xpath(
			"//div[contains(@id,'WebMessageWorksheetScreen')]//div[contains(text(),'($2,500.00) exceeds the exposure')]");
	final By ValidationResults_Warning_Second = By.xpath(
			"//div[contains(@id,'WebMessageWorksheetScreen')]//div[contains(text(),'incident limit of $450.00')]");
	final By ValidationResults_ClearButton = By
			.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");

}
