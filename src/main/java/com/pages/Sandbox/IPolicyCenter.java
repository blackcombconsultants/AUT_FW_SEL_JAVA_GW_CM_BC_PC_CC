package com.pages.Sandbox;

import org.openqa.selenium.By;

public interface IPolicyCenter {

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
	
	final By Country = By.xpath("//input[contains(@name,'GlobalAddressInputSet-Country')]");
	final By City = By.xpath("//input[contains(@name,'GlobalAddressInputSet-City')]");
	final By County = By.xpath("//input[contains(@name,'GlobalAddressInputSet-County')]");
	final By State = By.xpath("//input[contains(@name,'GlobalAddressInputSet-State')]");
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
	final By OrganizationType = By.xpath("//select[contains(@name,'SearchDV-Type')]");

	final By ProducerCode = By.xpath("//input[contains(@name,'SearchDV-Code')]");
	final By ProducerDescription = By.xpath("//input[contains(@name,'SearchDV-Description')]");
	final By ParentProducerCode = By.xpath("//input[contains(@name,'SearchDV-ParentCode')]");
	final By ProducerStatus = By.xpath("//div[contains(text(),'Active')]");
	final By ProducerTier = By.xpath("//input[contains(@name,'SearchDV-Tier')]");
	final By Policy = By.xpath("//input[contains(@name,'SearchDV-PolicyNumber')]");
	final By Account = By.xpath("//input[contains(@name,'SearchDV-AccountNumber')]");

	
	final By accountnickname = By.xpath("//input[contains(@name,'Nickname')]");
	final By industrycode = By.xpath("//input[contains(@name,'IndustryCode')]");
	final By Status = By.xpath("//input[contains(@name,'SearchDV-Status')]");
	final By BranchCode = By.xpath("//input[contains(@name,'SearchDV-BranchCode')]");
	final By AvailableToUser = By.xpath("//input[contains(@name,'SearchDV-User')]");
	final By SearchForMissingPreferredUnderwriter = By
			.xpath("//input[contains(@name,'SearchDV-MissingPrefUW')]");
	final By PreferredUnderwriter = By.xpath("//input[@type='checkbox' and contains(@name,'SearchDV-PrefUW')]");

	final By Search_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By Reset_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Reset')]");

	final By SearchAccountResults_Msg = By.xpath("//div[@id='NewAccount-NewAccountScreen-_msgs-0']");
	final By SearchResults = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']");

	/*
	 * NewAccount
	 */
	final By CreateNewAccount_Button = By.xpath("//div[@id='NewAccount-NewAccountScreen-NewAccountButton']");

	final By CNA_Person_Button = By
			.xpath("//div[@id='NewAccount-NewAccountScreen-NewAccountButton-NewAccount_Person']");
	final By CNA_Company_Button = By.xpath("//div[text()='Company']");
	final By CNA_FromAddressBook_Button = By.xpath("//div[text()='From Address Book']");

	/*
	 * EnterAccountInformation:
	 */
	final By EnterAccountInformation = By
			.xpath("//div[contains(@id,'NewAccountScreen-ttlBar')]//div[text()='Enter Account Information']");

	final By Update_Button = By.xpath("//div[contains(@id,'Update']");

	/*
	 * AccountSummaryHeader:
	 */
	final By AccountSummary = By
			.xpath("//div[contains(@id,'AccountFile_Summary-ttlBar')]//div[contains(text(),'Account Summary')]");

	void pc_SearchAccountInformation();

	void pc_CreatePersonAccount();

	void pc_CreateCompanyAccount();

}
