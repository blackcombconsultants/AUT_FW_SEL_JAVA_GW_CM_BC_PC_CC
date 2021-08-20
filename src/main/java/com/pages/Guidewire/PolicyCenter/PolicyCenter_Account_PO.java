package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;

public interface PolicyCenter_Account_PO {

	/*
	 * search account information
	 */

	final By SA_CompanyName = By.xpath("//input[contains(@name,'GlobalContactNameInputSet-Name')]");
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

	final By CA_OrganizationType = By.xpath("//select[contains(@name,'CreateAccountDV-OrgType')]");
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

	final By OrganizationName = By.xpath("//input[contains(@name,'SearchDV-Organization')]");
	final By OrganizationDescription = By.xpath("//input[contains(@name,'SearchDV-Description')]");

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
	 * 
	 * Modules
	 * 
	 * void pc_SearchAccountInformation(String strAccountName) throws Throwable;
	 * 
	 * void createPersonAccount() throws Throwable;
	 * 
	 * void createCompanyAccount() throws Throwable;
	 */

}
