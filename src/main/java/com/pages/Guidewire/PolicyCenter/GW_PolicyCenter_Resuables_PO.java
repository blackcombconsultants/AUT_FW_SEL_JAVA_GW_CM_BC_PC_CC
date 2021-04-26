package com.pages.Guidewire.PolicyCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.By;

public interface GW_PolicyCenter_Resuables_PO {

	/*
	 * Headers
	 */


	final By InfoBar_Job = By.xpath("//div[contains(@id,'InfoBar-JobLabel')]//div[@class='gw-label']");
	final By InfoBar_Workflow = By
			.xpath("//div[contains(@id,'InfoBar-Workflow')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_LOB = By.xpath("//div[contains(@id,'InfoBar-LOBLabel')]//div[@class='gw-label']");
	final By InfoBar_EffectiveDate = By.xpath("//div[contains(@id,'InfoBar-EffectiveDate')]//div[@class='gw-label']");
	final By InfoBar_AccountName = By
			.xpath("//div[contains(@id,'InfoBar-AccountName')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_AccountNumber = By
			.xpath("//div[contains(@id,'InfoBar-AccountNumber')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_PolicyNumber = By
			.xpath("//div[contains(@id,'InfoBar-PolicyNumber')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_Underwriter = By
			.xpath("//div[contains(@id,'InfoBar-Underwriter')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_EditLock = By
			.xpath("//div[contains(@id,'InfoBar-EditLock')]//div[@class='gw-label gw-infoValue']");

	final By CreateAccount_Header = By
			.xpath("//div[@class='gw-TitleBar--title' and contains(text(),'Create account')]");
	final By Organizations_Header = By.xpath("//div[contains(@id,'title-toolbar')]//div[text()='Organizations']");
	final By Producer_Header = By.xpath("//div[contains(@id,'title-toolbar')]//div[text()='Producer']");

	final By Screen_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title']");
	final By Error_Header = By.xpath(
			"//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]//div[@class='gw-subGroupLabel gw-text']");
	final By Error_Message = By.xpath(
			"//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]//div[@class='gw-WebMessage']//div[@class='gw-message']");
	final By AllError_Message = By.xpath(
			"//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]//div[@class='gw-WebMessage']//div[@class='gw-message']");

	final By SearchAccountResults_Msg = By.xpath("//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]/div[contains(@class,'sub-group')]");
	final By SearchResults = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']");
	final By Select_Button = By.xpath("//div[contains(@id,'SearchResultsLV-0')]/div[@role='button']");

	/*
	 * Tool Bar Buttons
	 */
	final By Search_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By Reset_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Reset')]");

	final By Update_Button = By.xpath("//div[contains(@id,'Update')]");
	final By OK_Button = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='OK']");
	final By Cancel_Button = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");

	final By Back_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Back']");
	final By Next_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Next']");

	final By Quote_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Next']");
	final By ReleaseLock_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Quote')]/div[@role='button']");
	final By EditPolicyTransaction_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'EditPolicy')]/div[@role='button']");
	final By SaveDraft_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Draft')]/div[@role='button']");
	final By Versions_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Versions')]/div[@role='button']");
	final By Start_MultiVersion_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'Versions-NewVersion')]/div[@role='menuitem']");
	final By Start_SideBySide_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'Versions-SideBySide')]/div[@role='menuitem']");
	final By BindOptions_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions')]/div[@role='button']");
	final By BindOptions_BindOnly_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-BindOnly')]/div[@role='menuitem']");
	final By Bindoptions_IssuePolicy_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-BindAndIssue')]/div[@role='menuitem']");
	final By CloseOptions_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions')]/div[@role='button']");
	final By CloseOptions_WithdrawTransaction_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-WithdrawJob')]/div[@role='menuitem']");
	final By CloseOptions_Decline_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-Decline')]/div[@role='menuitem']");
	final By CloseOptions_NotTaken_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-NotTakenJob')]/div[@role='menuitem']");
	final By PrintQuote_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'CreateSubmissionQuote')]/div[@role='button']");

	final By WithdrawTransaction_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions')]");

	/*
	 * search account information
	 */

	final By SA_CompanyName = By.xpath("//div[text()='Company Name']/following-sibling::div//input");
	final By SA_CompanyNameExactMatch = By.xpath(
			"//div[text()='Company name is an exact match']/following-sibling::div//input[@type='checkbox' and contains(@name,'CompanyNameExact')]");

	final By SA_FirstName = By.xpath(
			"//div[text()='First name']/following-sibling::div//input[contains(@name,'GlobalPersonNameInputSet-FirstName')]");
	final By SA_LastName = By.xpath(
			"//div[text()='Last name']/following-sibling::div//input[contains(@name,'GlobalPersonNameInputSet-LastName')]");
	final By SA_FirstNameExactMatch = By.xpath(
			"//div[text()='First name is an exact match']/following-sibling::div//input[@type='checkbox' and contains(@name,'FirstNameExact')]");
	final By SA_LastNameExactMatch = By.xpath(
			"//div[text()='Last name is an exact match']/following-sibling::div//input[@type='checkbox' and contains(@name,'LastNameExact')]");

	final By GW_Country = By.xpath("//select[contains(@name,'GlobalAddressInputSet-Country')]");
	final By GW_City = By.xpath("//input[contains(@name,'GlobalAddressInputSet-City')]");
	final By GW_County = By.xpath("//input[contains(@name,'GlobalAddressInputSet-County')]");
	final By GW_State = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By GW_ZipCode = By.xpath("//input[contains(@name,'GlobalAddressInputSet-PostalCode')]");

	/*
	 * NewAccount
	 */
	final By SA_CreateNewAccount_Button = By.xpath("//div[@id='NewAccount-NewAccountScreen-NewAccountButton']");
	final By SA_CNA_Person_Button = By
			.xpath("//div[@id='NewAccount-NewAccountScreen-NewAccountButton-NewAccount_Person']");
	final By SA_CNA_Company_Button = By.xpath("//div[text()='Company']");
	final By SA_CNA_FromAddressBook_Button = By.xpath("//div[text()='From Address Book']");

	/*
	 * create account information
	 */

	final By CA_PleaseConfirmAccountInformation = By.xpath(
			"//div[contains(@class,'gw-VerbatimWidget--inner') and text()='Please confirm account information']");

	final By CA_OfficePhone = By
			.xpath("//div[contains(text(),'Office Phone')]/following-sibling::div//input[contains(@name,'Phone')]");

	final By CA_HomePhone = By
			.xpath("//div[contains(text(),'Home Phone')]/following-sibling::div//input[contains(@name,'HomePhone')]");
	final By CA_WorkPhone = By
			.xpath("//div[contains(text(),'Work Phone')]/following-sibling::div//input[contains(@name,'Phone')]");
	final By CA_MobilePhone = By
			.xpath("//div[contains(text(),'Mobile Phone')]/following-sibling::div//input[contains(@name,'CellPhone')]");
	final By CA_FaxPhone = By
			.xpath("//div[contains(text(),'Fax')]/following-sibling::div//input[contains(@name,'FaxPhone')]");
	final By CA_PrimaryPhone = By.xpath("//select[contains(@name,'PrimaryPhone')]");
	final By CA_PrimaryEmail = By.xpath("//input[contains(@name,'EmailAddress1')]");
	final By CA_SecondaryEmail = By.xpath("//input[contains(@name,'EmailAddress2')]");

	/*
	 * Address
	 */
	final By CA_Address = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Address']");
	final By CA_A_Address1 = By.xpath("//input[contains(@name,'AddressLine1')]");
	final By CA_A_Address2 = By.xpath("//input[contains(@name,'AddressLine2')]");
	final By CA_A_Address3 = By.xpath("//input[contains(@name,'AddressLine3')]");
	final By CA_A_Addresstype = By.xpath("//select[contains(@name,'AddressType')]");
	final By CA_A_Description = By.xpath("//input[contains(@name,'AddressDescription')]");
	
	final By CA_OrganizationType = By.xpath("//select[contains(@name,'PrimaryLanguage')]");
	final By CA_DescriptionofBusiness = By.xpath("//input[contains(@name,'Nickname')]");

	/*
	 * OfficialID
	 */
	final By CA_OfficialID = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Official IDs']");
	final By CA_OID_SSN_FEIN = By.xpath("//input[contains(@name,'OfficialIDDV_Input')]");
	
	final By CA_AccountNickname = By.xpath("//input[contains(@name,'Nickname')]");
	final By CA_PreferredLanguage = By.xpath("//select[contains(@name,'PrimaryLanguage')]");
	final By CA_IndustryCode = By.xpath("//input[contains(@name,'IndustryCode')]");

	/*
	 * Select Producer
	 */
	final By PC_SelectProducer = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Select Producer']");
	final By PC_ProductOffers = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Product Offers']");

	final By CA_SP_Organization = By.xpath("//input[contains(@name,'Producer')]");
	final By CA_SP_OrganizationSearch_Button = By.xpath("//div[contains(@id,'Producer-SelectOrganization')]");
	final By CA_SP_ProducerCode = By.xpath("//select[contains(@name,'ProducerCode')]");

	/*
	 * Organizations
	 */
	final By OS_OrganizationName = By.xpath("//input[contains(@name,'SearchDV-GlobalContactNameInputSet-Name')]");
	final By OS_OrganizationType = By.xpath("//select[contains(@name,'SearchDV-Type')]");
	final By OS_ProducerStatus = By.xpath("//select[contains(@name,'SearchDV-Tier')]");
	final By OS_ProducerTier = By.xpath("//select[contains(@name,'SearchDV-Tier')]");
	final By OS_ProducerCode = By.xpath("//input[contains(@name,'SearchDV-ProducerCode')]");
	final By OS_Policy = By.xpath("//input[contains(@name,'SearchDV-PolicyNumber')]");
	final By OS_Account = By.xpath("//input[contains(@name,'SearchDV-AccountNumber')]");

	/*
	 * Industry Code
	 */
	final By IndustryCode_Search_Button = By.xpath("//div[contains(@id,'IndustryCode-SelectIndustryCode')]");
	final By IS_Code = By.xpath("//input[contains(@name,'SearchDV-Code')]");
	final By IS_Classification = By.xpath("//input[contains(@name,'SearchDV-Classification')]");
	
	
	final By ProducerCode = By.xpath("//select[contains(@name,'ProducerCode')]");
	final By ProducerCode_Search = By.xpath("//input[contains(@name,'SearchDV-Code')]");
	final By ProducerDescription = By.xpath("//input[contains(@name,'SearchDV-Description')]");
	final By ParentProducerCode = By.xpath("//input[contains(@name,'SearchDV-ParentCode')]");
	final By ProducerStatus = By.xpath("//div[contains(text(),'Active')]");

	final By Status = By.xpath("//input[contains(@name,'SearchDV-Status')]");
	final By BranchCode = By.xpath("//input[contains(@name,'SearchDV-BranchCode')]");
	final By AvailableToUser = By.xpath("//input[contains(@name,'SearchDV-User')]");
	final By SearchForMissingPreferredUnderwriter = By.xpath("//input[contains(@name,'SearchDV-MissingPrefUW')]");
	final By PreferredUnderwriter = By.xpath("//input[@type='checkbox' and contains(@name,'SearchDV-PrefUW')]");

	/*
	 * New Submissions
	 */
		
	final By NS_PO_SingleorMultiplePolicies = By.xpath("//input[contains(@name,'ProductSettingsDV-CreateSingle')]");
	final By NS_PO_QuoteType = By.xpath("//select[contains(@name,'ProductSettingsDV-QuoteType')]");
	final By NS_PO_DefaultBaseState = By.xpath("//select[contains(@name,'ProductSettingsDV-DefaultBaseState')]");
	final By NS_PO_DefaultEffectiveDate = By.xpath("//input[contains(@name,'DefaultPPEffDate-QuoteType')]");

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

	final By Account_Tab_Dropdown = By.xpath("//div[@id='TabBar-AccountTab']//div[3]");
	final By Account_Tab_Search = By.xpath("//input[@name='TabBar-AccountTab-AccountTab_AccountNumberSearchItem']");
	final By Account_Tab_Search_Button = By
			.xpath("//div[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem_Button']");
	final By Account_Actions_Menu = By.xpath("//div[@id='AccountFile-AccountFileMenuActions']");
	final By Account_Actions_NewSubmission = By.xpath(
			"//div[@id=\"AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create-AccountFileMenuActions_NewSubmission\"]");

	
	final By OrganizationName = By.xpath("//input[contains(@name,'SearchDV-Organization')]");
	final By OrganizationDescription = By.xpath("//input[contains(@name,'SearchDV-Description')]");

	

	/*
	 * Modules
	 */
	String infoBar(String strLabel) throws Throwable;

	void pc_SearchAccountInformation(String strAccountName) throws Throwable;

	void createPersonAccount() throws Throwable;

	void createCompanyAccount() throws Throwable;

	void organizations(LinkedHashMap<String, String> lhm_TestCase_Table_Data) throws Throwable;

	void industryCodeSearch(LinkedHashMap<String, String> lhm_TestCase_Table_Data) throws Throwable;
	void producer(LinkedHashMap<String, String> lhm_TestCase_Table_Data) throws Throwable;

	void select_SearchResult(LinkedHashMap<String, String> lhm_TestCase_Table_Data) throws Throwable;

	void newSubmissions() throws Throwable;

}
