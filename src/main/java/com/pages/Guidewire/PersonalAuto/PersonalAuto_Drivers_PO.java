package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Drivers_PO {

	final By Drivers_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title']");

	/*
	 * 
	 */
	final By DR_DriversDetails_Add_Button = By.xpath("//div[contains(@id,'DriversLV_tb-Add')]/div[@role='button']");
	final By DR_DriversDetails_Add_NewPerson = By.xpath(
			"//div[contains(@id,'DriversListDetailPanel-DriversLV_tb-AddDriver') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	final By DR_DriversDetails_Add_FromAddressBook = By.xpath(
			"//div[contains(@id,'DriversListDetailPanel-DriversLV_tb-AddDriver') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='From Address Book']");
	final By DR_DriversDetails_Add_ExistingDriver = By.xpath(
			"//div[contains(@id,'DriversListDetailPanel-DriversLV_tb-AddDriver') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Existing Driver']");

	final By DR_DriversDetails_Remove_Button = By
			.xpath("//div[contains(@id,'DriversLV_tb-Remove')]/div[@role='button']");

	final By DR_DriversDetails_RetrieveMVR_Button = By
			.xpath("//div[contains(@id,'DriversLV_tb-RetrieveMVRButton')]/div[@role='button']");

	/*
	 * DriversDetails
	 */
	final By DR_DriversDetails_TableHeader = By
			.xpath("//tr[contains(@id,'DriversListDetailPanel-DriversLV') and contains(@class,'gw-header-row')]");

	final By DR_DriversDetails_Select = By.xpath(
			"//td[contains(@class,'gw-impl-cell--CB')]/div[@class='gw-cell-inner']/div[contains(@id,'Checkbox')]/input[contains(@name,'Checkbox')]");

	final By DR_DriversDetails_LicenseNumber = By.xpath(
			"//td[contains(@id,'LicenseNumber_Cell') and contains(@class,'gw-CellWidget')]//div[@class='gw-value-readonly-wrapper' and text()='224242424']");

	final By DR_DriversDetails_MVRStatus = By.xpath(
			"//td[contains(@id,'MVRStatus_Cell')]//div[@class='gw-value-readonlDR_DR_DriversDetails_text()='Received']");

	final By DR_DriversDetails_StatusDate = By
			.xpath("//td[contains(@id,'StatusDate')]//div[@class='gw-value-readonly-wrapper' and text()='04/18/2021']");

	/*
	 * ContactDetails
	 */

	final By DR_Tab_ContatDetails = By.xpath("//div[contains(@id,'DriverDetailsCV-PolicyContactDetailCardTab')]");

	final By DR_CD_Person = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Person']");
	final By DR_CD_P_FirstName = By
			.xpath("//input[contains(@name,'PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName')]");
	final By DR_CD_P_LastName = By
			.xpath("//input[contains(@name,'PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName')]");

	final By DR_CD_Address = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Address']");
	final By DR_CD_A_Address1 = By.xpath(
			"//input[contains(@name,'AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1')]");

	final By DR_CD_DateofBirth = By.xpath("//input[contains(@name,'DateOfBirth')]");
	final By DR_CD_LicenseNumber = By.xpath("//input[contains(@name,'LicenseInputSet-LicenseNumber')]");
	final By DR_CD_LicenseState = By.xpath("//select[contains(@name,'LicenseInputSet-LicenseState')]");

	final By DR_CD_OfficialIDs = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Official IDs']");
	final By DR_CD_OI_SSN = By.xpath("//input[contains(@name,'OfficialIDDV_Input')]");

	/*
	 * Roles
	 */

	final By DR_Tab_Roles = By.xpath("//div[contains(@id,'DriverDetailsCV-RolesCardTab')]");

	final By DR_R_PrimaryNamedInsured = By.xpath(
			"//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Primary Named Insured']");
	final By DR_R_Driver = By.xpath(
			"//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Driver']");
	final By DR_R_D_DateCompletedTrainingClass = By.xpath(
			"//input[contains(@name,'PolicyContactRolePanelSet-PolicyDriverInfoDV-datecompletedtrainingclass')]");
	final By DR_R_D_YearFirstLicensed = By
			.xpath("//input[contains(@name,'PolicyContactRolePanelSet-PolicyDriverInfoDV-yearlicensed')]");

	final By DR_R_D_ExcludedYes = By.xpath("//input[contains(@id,'ExcludedDriver_0')]");
	final By DR_R_D_ExcludedNo = By.xpath("//input[contains(@id,'ExcludedDriver_1')]");
	final By DR_R_D_DoNotOrderMVR = By.xpath("//input[contains(@name,'DoNotOrderMVR')]");

	final By DR_R_AccidentViolationSummary = By
			.xpath("//div[contains(@class,'gw-boldLabel') and text()='Accident/Violation Summary']");
	final By DR_R_AVS_NumberOfAccidents_PolicyLevel = By
			.xpath("//select[contains(@name,'PolicyContactRolePanelSet-PolicyDriverNumberOfAccidents')]");
	final By DR_R_AVS_NumberOfAccidents_AccountLevel = By
			.xpath("//select[contains(@name,'PolicyContactRolePanelSet-DriverNumberOfAccidents')]");
	final By DR_R_AVS_NumberOfViolations_PolicyLevel = By
			.xpath("//select[contains(@name,'PolicyContactRolePanelSet-PolicyDriverNumberOfViolations')]");
	final By DR_R_AVS_NumberOfViolations_AccountLevel = By
			.xpath("//select[contains(@name,'PolicyContactRolePanelSet-DriverNumberOfViolations')]");

	/*
	 * Address
	 */

	final By DR_Tab_Addresses = By.xpath("//div[contains(@id,'AddressDetailCardTab')]/div[@role='tab']");
	final By DR_A_CurrentlyPolicyAddress = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='This is currently the policy address']");

	final By DR_A_AD_Address1 = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine1')]");

	/*
	 * MVRDetail
	 */

	final By DR_Tab_MotorVehicleRecord = By.xpath("//div[contains(@id,'MVRDetailCardTab')]/div[@role='tab']");

	/*
	 * Modules
	 */
	void driver_ContatDetails(String TestingType) throws Throwable;

	void driver_Roles(String TestingType) throws Throwable;

	void driver_Addresses(String TestingType) throws Throwable;

	void driver_MotorVehicleRecord(String TestingType) throws Throwable;

	void driver_Add_NewPerson() throws Throwable;

	void driver_Add_FromAddressBook() throws Throwable;

	void driver_Add_ExistingDriver() throws Throwable;

	void driver_Edit_ExistingDriver() throws Throwable;

	void driver_Remove() throws Throwable;

	void driver_RetrieveMVR() throws Throwable;

}
