package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;

public interface GW_PolicyCenter_PO {

	final By Next_Button = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Next')]");
	final By Account_Tab_Dropdown = By.xpath("//div[@id='TabBar-AccountTab']//div[3]");
	final By Account_Tab_Search = By.xpath("//input[@name='TabBar-AccountTab-AccountTab_AccountNumberSearchItem']");
	final By Account_Tab_Search_Button = By
			.xpath("//div[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem_Button']");
	final By Account_Actions_Menu = By.xpath("//div[@id='AccountFile-AccountFileMenuActions']");
	final By Account_Actions_NewSubmission = By.xpath(
			"//div[@id=\"AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create-AccountFileMenuActions_NewSubmission\"]");
	final By Quote_New_Submission = By.xpath("//div[contains(@id,'QuoteTypeToolbarButtonSet-Quote')]");
	final By Payment_Screen_Billing_Method = By.xpath("//div[contains(@id,'BillingPanel-BillingMethod')]");
	final By Payment_Schedule_Monthly_Schedule = By.xpath("//div[contains(@id,'5-InstallmentPlan_radio')]");
	final By Bind_Options_Button = By.xpath("//div[contains(@id,'BindOptions')]");
	final By Bind_Options_Issue_Policy = By
			.xpath("//div[contains(@id,'BindOptions')]//div[3]//div[contains(@id,'BindAndIssue')]");
	/*
	 * search account information
	 */

	final By companyname = By.xpath("//div[text()='Company Name']/following-sibling::div//input");
	final By companynameexactmatch = By
			.xpath("//div[text()='Company name is an exact match']/following-sibling::div//input");
	final By firstname = By.xpath("//div[text()='First name']/following-sibling::div//input");
	final By lastname = By.xpath("//div[text()='Last name']/following-sibling::div//input");
	final By firstnameexactmatch = By
			.xpath("//div[text()='First name is an exact match']/following-sibling::div//input");
	final By lastnameexactmatch = By.xpath("//div[text()='Last name is an exact match']/following-sibling::div//input");

	final By Country = By.xpath("//select[contains(@name,'GlobalAddressInputSet-Country')]");
	final By City = By.xpath("//input[contains(@name,'GlobalAddressInputSet-City')]");
	final By County = By.xpath("//input[contains(@name,'GlobalAddressInputSet-County')]");
	final By State_input = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By ZipCode = By.xpath("//input[contains(@name,'GlobalAddressInputSet-PostalCode')]");

	/*
	 * create account information
	 */

	final By homephone = By.xpath("//input[contains(@name,'HomePhone')]");
	final By workphone = By
			.xpath("//div[contains(text(),'Work Phone')]/following-sibling::div//input[contains(@name,'Phone')]");
	final By officephone = By
			.xpath("//div[contains(text(),'Office Phone')]/following-sibling::div//input[contains(@name,'Phone')]");
	final By mobilephone = By.xpath("//input[contains(@name,'CellPhone')]");
	final By primaryphone = By.xpath("//select[contains(@name,'PrimaryPhone')]");

	final By primaryEmail = By.xpath("//input[contains(@name,'EmailAddress1')]");
	final By secondaryEmail = By.xpath("//input[contains(@name,'EmailAddress2')]");
	final By faxphone = By.xpath("//input[contains(@name,'FaxPhone')]");
	final By address1 = By.xpath("//input[contains(@name,'AddressLine1')]");
	final By address2 = By.xpath("//input[contains(@name,'AddressLine2')]");
	final By address3 = By.xpath("//input[contains(@name,'AddressLine3')]");
	final By addresstype = By.xpath("//select[contains(@name,'AddressType')]");
	final By description = By.xpath("//input[contains(@name,'AddressDescription')]");

	final By officialID = By.xpath("//input[contains(@name,'OfficialIDDV_Input')]");

	final By Organization = By.xpath("//input[contains(@name,'Producer')]");
	final By OrganizationName = By.xpath("//input[contains(@name,'SearchDV-Organization')]");
	final By OrganizationDescription = By.xpath("//input[contains(@name,'SearchDV-Description')]");

	final By OS_Search = By.xpath("//div[contains(@id,'Producer-SelectOrganization')]");
	final By OS_Organizations_Header = By.xpath("//div[contains(@id,'title-toolbar')]//div[text()='Organizations']");
	final By OS_OrganizationName = By.xpath("//input[contains(@name,'GlobalContactNameInputSet-Name')]");
	final By OS_OrganizationType = By.xpath("//select[contains(@name,'SearchDV-Type')]");
	final By OS_ProducerTier = By.xpath("//select[contains(@name,'SearchDV-Tier')]");
	final By OS_ProducerCode = By.xpath("//input[contains(@name,'SearchDV-ProducerCode')]");
	final By OS_Policy = By.xpath("//input[contains(@name,'SearchDV-PolicyNumber')]");
	final By OS_Account = By.xpath("//input[contains(@name,'SearchDV-AccountNumber')]");

	final By ProducerCode = By.xpath("//select[contains(@name,'ProducerCode')]");
	final By ProducerCod_Searche = By.xpath("//input[contains(@name,'SearchDV-Code')]");
	final By ProducerDescription = By.xpath("//input[contains(@name,'SearchDV-Description')]");
	final By ParentProducerCode = By.xpath("//input[contains(@name,'SearchDV-ParentCode')]");
	final By ProducerStatus = By.xpath("//div[contains(text(),'Active')]");

	final By accountnickname = By.xpath("//input[contains(@name,'Nickname')]");
	final By industrycode = By.xpath("//input[contains(@name,'IndustryCode')]");
	final By Status = By.xpath("//input[contains(@name,'SearchDV-Status')]");
	final By BranchCode = By.xpath("//input[contains(@name,'SearchDV-BranchCode')]");
	final By AvailableToUser = By.xpath("//input[contains(@name,'SearchDV-User')]");
	final By SearchForMissingPreferredUnderwriter = By.xpath("//input[contains(@name,'SearchDV-MissingPrefUW')]");
	final By PreferredUnderwriter = By.xpath("//input[@type='checkbox' and contains(@name,'SearchDV-PrefUW')]");

	final By Search_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By Reset_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Reset')]");

	final By SearchAccountResults_Msg = By.xpath("//div[@id='NewAccount-NewAccountScreen-_msgs-0']");
	final By SearchResults = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']");
	final By Select_SearchResult = By.xpath("//div[contains(@id,'SearchResultsLV-0')]/div[@role='button']");
	
	/*
	 * NewAccount
	 */
	final By CreateNewAccount_Button = By.xpath("//div[@id='NewAccount-NewAccountScreen-NewAccountButton']");

	final By CNA_Person_Button = By
			.xpath("//div[@id='NewAccount-NewAccountScreen-NewAccountButton-NewAccount_Person']");
	final By CNA_Company_Button = By.xpath("//div[text()='Company']");
	final By CNA_FromAddressBook_Button = By.xpath("//div[text()='From Address Book']");

	final By Update_Button = By.xpath("//div[contains(@id,'Update')]");

	String strReplace = null;

	final By QuoteType = By.xpath("//select[contains(@name,'ProductSettingsDV-QuoteType')]");
	final By DefaultBaseState = By.xpath("//select[contains(@name,'ProductSettingsDV-DefaultBaseState')]");
	final By DefaultEffectiveDate = By.xpath("//input[contains(@name,'DefaultPPEffDate-QuoteType')]");

	/*
	 * select LOB Xpath
	 */
	final By LobBusinessowners = By.xpath(
			"//div[text()='Businessowners']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobCommercialAuto = By.xpath(
			"//div[text()='Commercial Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobPersonalAuto = By.xpath(
			"//div[text()='Personal Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobCommercialPackage = By.xpath(
			"//div[text()='Commercial Package']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobCommercialProperty = By.xpath(
			"//div[text()='Commercial Property']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobGeneralLiability = By.xpath(
			"//div[text()='General Liability']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobInlandMarine = By.xpath(
			"//div[text()='Inland Marine']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	// final By WorkersCompensation=By.xpath("//div[text()='Workers'
	// Compensation']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection')
	// and text()='Select']");

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

	void pc_SearchAccountInformation(String strAccountName)throws Throwable;

	void pc_CreatePersonAccount() throws Throwable;

	void pc_CreateCompanyAccount() throws Throwable;

}
