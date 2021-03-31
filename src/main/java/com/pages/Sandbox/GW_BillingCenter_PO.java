package com.pages.Sandbox;

import org.openqa.selenium.By;

public interface GW_BillingCenter_PO {

	/*
	 * search account information
	 */

	final By Actions_Button = By.xpath("//div[@id='gw-west-panel--top-section']/div[contains(@id,'MenuActions')]");
	final By NewAccount_Button = By.id("AccountsGroup-AccountsMenuActions-AccountsMenuActions_NewAccount");
	final By NewPolicy_Button = By.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_NewPolicy");

	final By AccountNumber = By.xpath("//input[contains(@name,'NewAccountDV-AccountNumber')]");
	final By AccountName = By.xpath("//input[contains(@name,'NewAccountDV-AccountName')]");
	final By AccountType = By.xpath("//select[contains(@name,'NewAccountDV-AccountTypeInput')]");
	final By BillingPlan = By.xpath("//select[contains(@name,'NewAccountDV-BillingPlan')]");
	final By DelinquencyPlan = By.xpath("//select[contains(@name,'NewAccountDV-DelinquencyPlan')]");
	final By SendInvoicesBy = By.xpath("//select[contains(@name,'NewAccountDV-SendInvoicesBy')]");

	final By CompanyName = By.xpath("//input[contains(@name,'GlobalContactNameInputSet-Name')]");
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
	/*
	 * final By officialID =
	 * By.xpath("//input[contains(@name,'OfficialIDDV_Input')]");
	 * 
	 * final By Organization = By.xpath("//input[contains(@name,'Producer')]");
	 * final By OrganizationName =
	 * By.xpath("//input[contains(@name,'SearchDV-Organization')]"); final By
	 * OrganizationDescription =
	 * By.xpath("//input[contains(@name,'SearchDV-Description')]"); final By
	 * OrganizationType = By.xpath("//select[contains(@name,'SearchDV-Type')]");
	 * 
	 * final By ProducerCode = By.xpath("//input[contains(@name,'SearchDV-Code')]");
	 * final By ProducerDescription =
	 * By.xpath("//input[contains(@name,'SearchDV-Description')]"); final By
	 * ParentProducerCode =
	 * By.xpath("//input[contains(@name,'SearchDV-ParentCode')]"); final By
	 * ProducerStatus = By.xpath("//div[contains(text(),'Active')]"); final By
	 * ProducerTier = By.xpath("//input[contains(@name,'SearchDV-Tier')]");
	 */
	final By PolicyNumber = By.xpath("//input[contains(@name,'NewPolicyDV-PolicyNumber')]");
	final By Account = By.xpath("//input[contains(@name,'SearchDV-AccountNumberCriterion')]");
	final By AccountName2 = By.xpath("//input[contains(@name,'SearchDV-AccountNameCriterion')]");
	final By accountnickname = By.xpath("//input[contains(@name,'Nickname')]");
	final By AccountSegment = By.xpath("//select[contains(@name,'SearchDV-AccountSegmentCriterion')]");
	final By AccountStatus = By.xpath("//select[contains(@name,'SearchDV-DelinquencyStatusCriterion')]");

	final By Search_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By Reset_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Reset')]");

	final By SearchAccountResults_Msg = By.xpath("//div[@id='NewAccount-NewAccountScreen-_msgs-0']");
	final By SearchResults = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']");

	final By ParentAccount = By.xpath("//div[@id='NewAccount-NewAccountScreen-NewAccountButton']");

	/*
	 * EnterAccountInformation:
	 */
	final By EnterAccountInformation = By
			.xpath("//div[contains(@id,'NewAccountScreen-ttlBar')]//div[text()='Enter Account Information']");

	final By Update_Button = By.xpath("//div[contains(@id,'Update']");
	final By AddExistingContact_Button = By.xpath("//div[contains(@id,'ContactsLV_tb-addExistingContact')]");

	final By WrightConstruction_Select = By.xpath(
			"//div[text()='Wright Construction']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]");

	final By WrightConstruction_Edit = By.xpath(
			"//div[text()='Wright Construction']/ancestor::td[contains(@id,'ContactName_Cell')]/preceding-sibling::td[contains(@id,'Edit')]//div[contains(@id,'Edit')]");

	final By PrimaryPayer = By.xpath("//input[contains(@id,'PrimaryPayer_0')]");

	final By OK_Button = By.id("AccountContactDetailPopup-NewAccountContactScreen-Update");
	final By CreateAccount_Button = By.id("NewAccount-NewAccountScreen-Update");

	final By BillingMethod = By.xpath("//select[contains(@name,'NewPolicyDV-BillingMethod')]");
	final By PaymentPlan = By.xpath("//select[contains(@name,'NewPolicyDV-PaymentPlan')]");

	final By Next_Button = By.id("NewPolicyWizard-Next");
	
	final By PolicyAddCharges_Button = By.xpath("//div[contains(@id,'PolicyAddChargesLV_tb-Add')]");
	final By PolicyAddChargesType = By.xpath("//select[contains(@name,'PolicyAddChargesLV-0-Type')]");
	final By PolicyAddChargesAmount = By.xpath("//input[contains(@name,'PolicyAddChargesLV-0-Amount')]");
	final By PolicyFinish_Button = By.xpath("//div[@id='NewPolicyWizard-Finish']//div[contains(text(),'inish')]");
	final By PolicyRemoveCharges_Button = By.xpath("//div[contains(@id,'PolicyAddChargesLV_tb-Remove')]");

	/*
	 * AccountSummaryHeader:
	 */
	final By Accounts = By.xpath("//div[contains(@id,'Screen-ttlBar')]//div[contains(text(),'Accounts')]");

	final By NewAccount = By.xpath("//div[contains(@id,'Screen-ttlBar')]//div[contains(text(),'New Account')]");

	final By AccountName_InfoBar = By
			.xpath("//div[@id='AccountGroup-AccountInfoBar-AccountName']/div[@class='gw-label gw-infoValue']");
	final By AccountNumber_InfoBar = By
			.xpath("//div[@id='AccountGroup-AccountInfoBar-AccountNumber']/div[@class='gw-label gw-infoValue']");

	final By AccountSummary = By.xpath("//div[contains(@id,'Screen-ttlBar')]//div[contains(text(),'Account Summary')]");

	final By PolicyIssuanceWizard1 = By.xpath(
			"//div[contains(@id,'Screen-ttlBar')]//div[contains(text(),'Policy Issuance Wizard - Step 1 of 2')]");
	final By PolicyIssuanceWizard2 = By.xpath(
			"//div[contains(@id,'Screen-ttlBar')]//div[contains(text(),'Policy Issuance Wizard - Step 2 of 2')]");

	final By AS_AccountName = By.id("AccountSummary-AccountSummaryScreen-Name");
	final By AS_PayoffAmount = By.id("AccountSummary-AccountSummaryScreen-PayoffAmount");
	final By AS_PolicyNumber = By
			.xpath("//table[@class='gw-ListViewWidget--table gw-table']//td[contains(@id,'PolicyNumber_Cell')]");
	final By AS_TotalValue = By
			.xpath("//table[@class='gw-ListViewWidget--table gw-table']//td[contains(@id,'TotalValue_Cell')]");

	final By AS_HistoryLink = By.id("AccountGroup-MenuLinks-AccountGroup_AccountDetailHistory");
	final By AS_InvoicesLink = By.id("AccountGroup-MenuLinks-AccountGroup_AccountDetailInvoices");

	final By InvoiceHeader = By.xpath("//div[contains(@id,'Screen-ttlBar')]//div[contains(text(),'Invoice')]");

	final By InvoiceDetails = By.xpath(
			"//table[@class='gw-ListViewWidget--table gw-table']//tr[contains(@id,'DetailPanel-AccountInvoicesLV') and contains(@class,'listDetail')]");

	void bc_SearchAccountInformation();

	void bc_NewAccount();

	void bc_NewPolicy();

	void bc_AccountSummary();

	void bc_MenuNavigation_AccountSummary(String strMenuOption);

	void bc_AccountSummary_Invoices();

}
