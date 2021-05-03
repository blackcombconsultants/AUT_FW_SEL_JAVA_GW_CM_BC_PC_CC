package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Vehicles_PO {

	final By VehicleDetails = By
			.xpath("//div[contains(@class,'gw-panelRefWidget--titleArea')]//div[@class='gw-TitleBar--title']");

	final By CreateVehicle_Button = By
			.xpath("//div[contains(@id,'VehiclesListDetailPanel_tb-Add')]//div[@class='gw-label']");
	final By RemoveVehicle_Button = By
			.xpath("//div[contains(@id,'VehiclesListDetailPanel_tb-Remove')]//div[@class='gw-label']");

	final By TableRowCellHeader = By
			.xpath("//tr[contains(@class,'gw-row gw-header-row')]/td[contains(@class,'gw-HeaderCellWidget')]");
	final By TableRowCellSmartHeader = By
			.xpath("//tr[contains(@class,'gw-row gw-isSmartHeader')]/td[contains(@class,'gw-CellWidget')]");
	final By TableRowCellValue = By.xpath("//tr[contains(@class,'gw-RowWidget')]/td[contains(@class,'gw-CellWidget')]");
	final By TableStandardRowCellValue = By
			.xpath("//tr[contains(@class,'gw-row gw-standard-row')]/td[contains(@class,'gw-CellWidget')]");
	final By VehicleDetails_Select = By.xpath(
			"//td[contains(@class,'gw-impl-cell--CB')]/div[@class='gw-cell-inner']/div[contains(@id,'Checkbox')]/input[contains(@name,'Checkbox')]");

	final By VehicleDetails_Vin = By.xpath(
			"div[@class='gw-value-readonly-wrapper' and text()='1FM5K7D81FGA12355']/ancestor::td[contains(@id,'Vin_Cell')]");

	/*
	 * Vehicle Details
	 */

	final By VE_Tab_VehicleDetails = By.xpath("//div[contains(@id,'VehiclesDetailsCV-VehicleDetailCardTab')]");

	final By VE_VD_BasicVehicleInformation = By.xpath(
			"//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Basic Vehicle Information']");

	final By VE_VD_BVI_VehicleType = By
			.xpath("//select[contains(@name,'VehiclesDetailsCV-PersonalAuto_VehicleDV-Type_DV')]");
	final By VE_VD_BVI_VIN = By.xpath("//input[contains(@name,'VehiclesDetailsCV-PersonalAuto_VehicleDV-Vin_DV')]");
	final By VE_VD_BVI_BodyType = By
			.xpath("//select[contains(@name, 'VehiclesDetailsCV-PersonalAuto_VehicleDV-BodyType_DV')]");
	final By VE_VD_BVI_LicenseState = By
			.xpath("//select[contains(@name, 'VehiclesDetailsCV-PersonalAuto_VehicleDV-LicenseState_DV')]");

	final By VE_VD_BVI_CostNew = By
			.xpath("//input[contains(@name,'VehiclesDetailsCV-PersonalAuto_VehicleDV-CostNew_DV')]");
	final By VE_VD_BVI_StatedValue = By.xpath("//input[contains(@name,'PersonalAuto_VehicleDV-StatedValue_DV')]");

	final By VE_VD_BVI_AnnualMileage = By.xpath("//input[contains(@name,'PersonalAuto_VehicleDV-annualmiles_DV')]");
	final By VE_VD_BVI_PrimaryUse = By.xpath("//select[contains(@name,'PersonalAuto_VehicleDV-primaryuse_DV')]");
	final By VE_VD_BVI_AntiTheftDiscount = By
			.xpath("//select[contains(@name,'PAVehicleModifiersInputSet-2-TypeKeyModifier')]");

	final By VE_VD_BVI_VehicleRateModifiers = By.xpath(
			"//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Vehicle Rate Modifiers']");

	final By VE_VD_BVI_VRM_AntiLockBrakesDiscount_No = By
			.xpath("//input[contains(@id,'PAVehicleModifiersInputSet-0-BooleanModifier_1')]");
	final By VE_VD_BVI_VRM_PassiveRestraintSystem = By
			.xpath("//select[contains(@name,'PAVehicleModifiersInputSet-1-TypeKeyModifier')]");
	final By VE_VD_BVI_VRM_AntiTheftDiscount = By
			.xpath("//select[contains(@name,'PAVehicleModifiersInputSet-2-TypeKeyModifier')]");

	final By VE_AssignDriverstoVehicles = By.xpath(
			"//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Assign Drivers to Vehicles']");

	final By VE_ADV_Percentageeachdriverusethisvehicle = By.xpath(
			"//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='What percentage does each driver use this vehicle?']");

	final By VE_ADV_Add_Button = By
			.xpath("//div[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-Add')]/div[@role='button']");
	final By VE_AssignDrivers_Remove_Button = By.xpath(
			"//div[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-Remove')]/div[@role='button']");
	final By VE_AssignDrivers_Add_DriverName = By.xpath(
			"//div[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']/div[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver')]//div[@class='gw-label']");

	final By VE_ADV_Add_Select = By.xpath(
			"//tr[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV') and contains(@class,'gw-standard-row')]/td[contains(@class,'gw-impl-cell--CB')]//div[contains(@id,'_Checkbox') and contains(@class,'gw-IteratorEntryCheckBoxWidget')]/input[@type='checkbox']");

	final By VE_ADV_Driver = By.xpath(
			"//tr[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Driver_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Driver') and contains(@class,'gw-actionValue')]//div[contains(@id,'Driver_button')]");

	final By VE_ADV_Percentage = By.xpath(
			"//tr[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Percentage_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Percentage') and contains(@class,'gw-editable')]//input[contains(@name,'Percentage')]");

	/*
	 * Additional Interest
	 */

	final By VE_Tab_AdditionalInterest = By.xpath("//div[contains(@id,'VehiclesDetailsCV-AdditionalInterestCardTab')]");

	final By VE_AI_PersonalVehicleAdditionalInterests = By.xpath(
			"//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Personal Vehicle Additional Interests']");

	final By VE_AI_PVAI_Add_Button = By.xpath("//div[contains(@id,'AdditionalInterestLV_tb-Add')]/div[@role='button']");
	final By VE_AI_PVAI_Remove_Button = By
			.xpath("//div[contains(@id,'AdditionalInterestLV_tb-Remove')]/div[@role='button']");

	final By VE_AI_PVAI_Add_NewCompany = By.xpath(
			"//div[contains(@id,'AdditionalInterestLV_tb-AddContactsButton') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Company']");
	final By VE_AI_PVAI_Add_NewPerson = By.xpath(
			"//div[contains(@id,'AdditionalInterestLV_tb-AddContactsButton') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	final By VE_AI_PVAI_Add_FromAddressBook = By.xpath(
			"//div[contains(@id,'AdditionalInterestLV_tb-AddContactsButton') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='From Address Book']");
	final By VE_AI_PVAI_Add_ExistingAdditionalInterest = By.xpath(
			"//div[contains(@id,'AdditionalInterestLV_tb-AddContactsButton') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Existing Additional Interest']");

	final By VE_AI_PVAI_Select = By.xpath(
			"//tr[contains(@id,'AdditionalInterestLV') and contains(@class,'gw-standard-row')]/td[contains(@class,'gw-impl-cell--CB')]//div[contains(@id,'_Checkbox') and contains(@class,'gw-IteratorEntryCheckBoxWidget')]/input[@type='checkbox']");

	final By VE_AI_PVAI_Name = By.xpath(
			"//tr[contains(@id,'AdditionalInterestLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Name_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Name') and contains(@class,'gw-actionValue')]//div[contains(@id,'Name_button')]");

	final By VE_AI_PVAI_IntrestType = By.xpath(
			"//tr[contains(@id,'AdditionalInterestLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Type_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Type') and contains(@class,'gw-editable')]//select[contains(@name,'Type')]");

	final By VE_AI_PVAI_CertificateReq = By.xpath(
			"//tr[contains(@id,'AdditionalInterestLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'CertRequired_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'CertRequired') and contains(@class,'gw-editable')]//input[contains(@id,'CertRequired_0')]");

	final By VE_AI_PVAI_ContractNo = By.xpath(
			"//tr[contains(@id,'AdditionalInterestLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'ContractNumber_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'ContractNumber') and contains(@class,'gw-editable')]//input[contains(@name,'ContractNumber')]");

	/*
	 * Modules
	 * 
	 * void createVehicles() throws Throwable;
	 * 
	 * void vehicle_Edit() throws Throwable;
	 * 
	 * void vehicle_Remove() throws Throwable;
	 * 
	 * void assignDriver() throws Throwable;
	 * 
	 * void additionalInterest_Add_NewCompany() throws Throwable;
	 * 
	 * void additionalInterest_Add_NewPerson() throws Throwable;
	 * 
	 * void additionalInterest_Add_FromAddressBook() throws Throwable;
	 * 
	 * void additionalInterest_Add_ExistingAdditionalInterest() throws Throwable;
	 * 
	 * void garage_NewLocation() throws Throwable;
	 * 
	 * void garage_EditLocation() throws Throwable;
	 */
}
