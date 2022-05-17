package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class BC_AccountSummary extends SeleniumWebDriver_Commands {

	static By AS_Header = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-ttlBar']//div[ @class='gw-TitleBar--title']");

	/*
	 * search account information
	 */
	private static By NewAccount_Header                = By.xpath("//div[@id='NewAccount-NewAccountScreen-ttlBar']//div[ @class='gw-TitleBar--title' and text()='New Account']");
	private static By SearchforAccounts_Header         = By.xpath("//div[@id='AccountSearchPopup-AccountSearchScreen-ttlBar']//div[ @class='gw-TitleBar--title' and text()='Search for Accounts']");
	private static By PolicyIssuanceWizardStep1_Header = By.xpath("//div[@id='NewPolicyWizard-NewPolicyWizardSummaryStepScreen-ttlBar']//div[ @class='gw-TitleBar--title']");
	private static By PolicyIssuanceWizardStep2_Header = By.xpath("//div[@id='NewPolicyWizard-NewPolicyWizardChargeStepScreen-ttlBar']//div[ @class='gw-TitleBar--title']");
	private static By AccountSummary_Header            = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-ttlBar']//div[ @class='gw-TitleBar--title']");
	private static By AccountNumber                    = By.xpath("//input[contains(@name,'AccountNumberCriterion')]");
	private static By AccountName                      = By.xpath("//input[contains(@name,'AccountName')]");
	private static By ServiceTier                      = By.xpath("//select[contains(@name,'NewAccountDV-CustomerServiceTier')]");
	private static By SecurityZone                     = By.xpath("//select[contains(@name,'NewAccountDV-SecurityZone')]");
	private static By AccountType                      = By.xpath("//select[contains(@name,'NewAccountDV-AccountTypeInput')]");
	private static By BillingPlan                      = By.xpath("//select[contains(@name,'NewAccountDV-BillingPlan')]");
	private static By DelinquencyPlan                  = By.xpath("//select[contains(@name,'NewAccountDV-DelinquencyPlan')]");
	private static By SendInvoicesBy                   = By.xpath("//select[contains(@name,'NewAccountDV-SendInvoicesBy')]");

	private static By CompanyName           = By.xpath("//input[contains(@name,'GlobalContactNameInputSet-Name')]");
	private static By companynameexactmatch = By.xpath("//div[text()='Company name is an exact match']/following-sibling::div//input");
	private static By firstname             = By.xpath("//div[text()='First name']/following-sibling::div//input");
	private static By lastname              = By.xpath("//div[text()='Last name']/following-sibling::div//input");
	private static By firstnameexactmatch   = By.xpath("//div[text()='First name is an exact match']/following-sibling::div//input");
	private static By lastnameexactmatch    = By.xpath("//div[text()='Last name is an exact match']/following-sibling::div//input");

	private static By Country = By.xpath("//input[contains(@name,'GlobalAddressInputSet-Country')]");
	private static By City    = By.xpath("//input[contains(@name,'GlobalAddressInputSet-City')]");
	private static By County  = By.xpath("//input[contains(@name,'GlobalAddressInputSet-County')]");
	private static By State   = By.xpath("//input[contains(@name,'GlobalAddressInputSet-State')]");
	private static By ZipCode = By.xpath("//input[contains(@name,'GlobalAddressInputSet-PostalCode')]");

	/*
	 * create account information
	 */

	private static By homephone    = By.xpath("//input[contains(@name,'HomePhone')]");
	private static By workphone    = By.xpath("//div[contains(text(),'Work Phone')]/following-sibling::div//input[contains(@name,'Phone')]");
	private static By officephone  = By.xpath("//div[contains(text(),'Office Phone')]/following-sibling::div//input[contains(@name,'Phone')]");
	private static By mobilephone  = By.xpath("//input[contains(@name,'CellPhone')]");
	private static By primaryphone = By.xpath("//select[contains(@name,'PrimaryPhone')]");

	private static By primaryEmail   = By.xpath("//input[contains(@name,'EmailAddress1')]");
	private static By secondaryEmail = By.xpath("//input[contains(@name,'EmailAddress2')]");
	private static By faxphone       = By.xpath("//input[contains(@name,'FaxPhone')]");
	private static By address1       = By.xpath("//input[contains(@name,'AddressLine1')]");
	private static By address2       = By.xpath("//input[contains(@name,'AddressLine2')]");
	private static By address3       = By.xpath("//input[contains(@name,'AddressLine3')]");
	private static By addresstype    = By.xpath("//select[contains(@name,'AddressType')]");
	private static By description    = By.xpath("//input[contains(@name,'AddressDescription')]");


	/*
	 * private static By officialID = By.xpath("//input[contains(@name,'OfficialIDDV_Input')]");
	 * 
	 * private static By Organization = By.xpath("//input[contains(@name,'Producer')]"); private static By OrganizationName =
	 * By.xpath("//input[contains(@name,'SearchDV-Organization')]"); private static By OrganizationDescription =
	 * By.xpath("//input[contains(@name,'SearchDV-Description')]"); private static By OrganizationType =
	 * By.xpath("//select[contains(@name,'SearchDV-Type')]");
	 * 
	 * private static By ProducerCode = By.xpath("//input[contains(@name,'SearchDV-Code')]"); private static By ProducerDescription =
	 * By.xpath("//input[contains(@name,'SearchDV-Description')]"); private static By ParentProducerCode =
	 * By.xpath("//input[contains(@name,'SearchDV-ParentCode')]"); private static By ProducerStatus = By.xpath("//div[contains(text(),'Active')]");
	 * final By ProducerTier = By.xpath("//input[contains(@name,'SearchDV-Tier')]");
	 */
	private static By PolicyNumber               = By.xpath("//input[contains(@name,'NewPolicyDV-PolicyNumber')]");
	private static By Account                    = By.xpath("//input[contains(@name,'SearchDV-AccountNumberCriterion')]");
	private static By AccountName2               = By.xpath("//input[contains(@name,'SearchDV-AccountNameCriterion')]");
	private static By accountnickname            = By.xpath("//input[contains(@name,'Nickname')]");
	private static By AccountSegment             = By.xpath("//select[contains(@name,'SearchDV-AccountSegmentCriterion')]");
	private static By AccountStatus              = By.xpath("//select[contains(@name,'SearchDV-DelinquencyStatusCriterion')]");
	private static By ParentAccount_SearchButton = By.xpath("//div[contains(@id,'ParentAccount-AccountPicker')]//span[contains(@class,'gw-font-icon')]");

	private static By ParentAccount = By.xpath("//div[@id='NewAccount-NewAccountScreen-NewAccountButton']");

	/*
	 * EnterAccountInformation:
	 */
	private static By EnterAccountInformation = By.xpath("//div[contains(@id,'NewAccountScreen-ttlBar')]//div[text()='Enter Account Information']");

	private static By AddExistingContact_Button = By.xpath("//div[contains(@id,'ContactsLV_tb-addExistingContact')]");

	private static By WrightConstruction_Select = By.xpath("//div[text()='Wright Construction']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]");

	private static By WrightConstruction_Edit = By.xpath("//div[text()='Wright Construction']/ancestor::td[contains(@id,'ContactName_Cell')]/preceding-sibling::td[contains(@id,'Edit')]//div[contains(@id,'Edit')]");

	private static By PrimaryPayer = By.xpath("//input[contains(@id,'PrimaryPayer_0')]");

	private static By CreateAccount_Button = By.id("NewAccount-NewAccountScreen-Update");

	private static By BillingMethod = By.xpath("//select[contains(@name,'NewPolicyDV-BillingMethod')]");
	private static By PaymentPlan   = By.xpath("//select[contains(@name,'NewPolicyDV-PaymentPlan')]");

	private static By PolicyAddCharges_Button    = By.xpath("//div[contains(@id,'PolicyAddChargesLV_tb-Add')]");
	private static By PolicyAddChargesType       = By.xpath("//select[contains(@name,'PolicyAddChargesLV-0-Type')]");
	private static By PolicyAddChargesAmount     = By.xpath("//input[contains(@name,'PolicyAddChargesLV-0-Amount')]");
	private static By PolicyFinish_Button        = By.xpath("//div[@id='NewPolicyWizard-Finish']//div[contains(text(),'inish')]");
	private static By PolicyRemoveCharges_Button = By.xpath("//div[contains(@id,'PolicyAddChargesLV_tb-Remove')]");

	/*
	 * AccountSummaryHeader:
	 */
	private static By Accounts = By.xpath("//div[contains(@id,'Screen-ttlBar')]//div[contains(text(),'Accounts')]");

	private static By NewAccount = By.xpath("//div[contains(@id,'Screen-ttlBar')]//div[contains(text(),'New Account')]");

	private static By AccountName_InfoBar   = By.xpath("//div[@id='AccountGroup-AccountInfoBar-AccountName']/div[@class='gw-label gw-infoValue']");
	private static By AccountNumber_InfoBar = By.xpath("//div[@id='AccountGroup-AccountInfoBar-AccountNumber']/div[@class='gw-label gw-infoValue']");

	private static By AccountSummary = By.xpath("//div[contains(@id,'Screen-ttlBar')]//div[contains(text(),'Account Summary')]");

	private static By PolicyIssuanceWizard1 = By.xpath("//div[contains(@id,'Screen-ttlBar')]//div[contains(text(),'Policy Issuance Wizard - Step 1 of 2')]");
	private static By PolicyIssuanceWizard2 = By.xpath("//div[contains(@id,'Screen-ttlBar')]//div[contains(text(),'Policy Issuance Wizard - Step 2 of 2')]");

	private static By AS_AccountName    = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-Name']//div[@class='gw-ActionValueWidget']");
	private static By AS_PrimaryContact = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-PrimaryContact']//div[@class='gw-ActionValueWidget']");
	private static By AS_Currency       = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-Currency']//div[@class='gw-label']");
	private static By AS_PayoffAmount   = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-PayoffAmount']//div[@class='gw-value-readonly-wrapper']");
	private static By AS_PolicyNumber   = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']//td[contains(@id,'PolicyNumber_Cell')]");
	private static By AS_TotalValue     = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']//td[contains(@id,'TotalValue_Cell')]");

	private static By InvoiceDetails = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']//tr[contains(@id,'DetailPanel-AccountInvoicesLV') and contains(@class,'listDetail')]");

	private static By UpdateButton = By.xpath("//div[contains(@id,'Update')]");

	/*
	 * AS Overview
	 */

	private static By AS_Overview_AccountName       = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-Name']//div[@class='gw-ActionValueWidget']");
	private static By AS_Overview_AccountSince      = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-AccountSinceValue']");
	private static By AS_Overview_PrimaryContact    = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-PrimaryContact']//div[@class='gw-ActionValueWidget']");
	private static By AS_Overview_Address           = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-Address']//div[@class='gw-value-readonly-wrapper']");
	private static By AS_Overview_PhoneEmail        = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-Phone']//div[@class='gw-value-readonly-wrapper']");
	private static By AS_Overview_Delinquencies     = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-description']");
	private static By AS_Overview_Currency          = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-Currency']//div[@class='gw-label']");
	private static By AS_Overview_SendInvoicesBy    = By.xpath("//div[contains(@id,'SendInvoicesBy')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	private static By AS_Overview_PaymentInstrument = By.xpath("//div[contains(@id,'PaymentMethod')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");

	/*
	 * AS Financials
	 */
	private static By AS_Financials_NextInvoiceDue      = By.xpath("//div[contains(@id,'NextInvoiceDue_button')]");
	private static By AS_Financials_LastPaymentReceived = By.xpath("//div[contains(@id,'LastPaymentReceived_button')]");
	private static By AS_Financials_DefaultUnapplied    = By.xpath("//div[contains(@id,'TotalUnappliedAmount_button')]");
	private static By AS_Financials_PayoffAmount        = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-PayoffAmount']//div[@class='gw-value-readonly-wrapper']");
	private static By AS_Financials_PlannedInvoices     = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-NumPlannedInvoices_button']");

	/*
	 * AS PolicyPeriods
	 */
	private static By AS_PolicyPeriods_EffectiveDate  = By.xpath("//td[contains(@id,'PolicyPerEffDate_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By AS_PolicyPeriods_ExpirationDate = By.xpath("");
	private static By AS_PolicyPeriods_PolicyNumber   = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']//td[contains(@id,'PolicyNumber_Cell')]");
	private static By AS_PolicyPeriodsTotalValue      = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']//td[contains(@id,'TotalValue_Cell')]");

	// Divya
	private static By PremiumCost = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']//td[contains(@id,'TotalValue_Cell')]");

	public BC_AccountSummary(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void AccountSummary() throws Throwable {
		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("AcctSummary");

		GuidewireAutomate_Validation("Screen Header", AS_Header, "equals", "Account Summary");
		GuidewireAutomate_Validation("AccountName", AS_Overview_AccountName, "equals", lhm_TestCase_Table_Data.get("TD_AccountName"));
		GuidewireAutomate_Validation("PrimaryContact", AS_Overview_PrimaryContact, "equals", lhm_TestCase_Table_Data.get("TD_PrimaryContact"));
		GuidewireAutomate_Validation("Currency", AS_Overview_Currency, "fetch", lhm_TestCase_Table_Data.get("TD_Currency"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}
	public static void AccountSummary_Financials() throws Throwable {
		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("AcctSummary");

		GuidewireAutomate_Validation("Total Unapplied", AS_Financials_DefaultUnapplied, "fetch", lhm_TestCase_Table_Data.get("TD_Unapplied"));
		GuidewireAutomate_Validation("Pay off Amount", AS_Financials_PayoffAmount, "fetch", lhm_TestCase_Table_Data.get("TD_PayoffAmount"));
		GuidewireAutomate_Validation("TotalValue", AS_PolicyPeriodsTotalValue, "fetch", lhm_TestCase_Table_Data.get("TD_TotalValue"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void AccountSummary_CommissionsValidation() throws Throwable {
		// String PremiumCost = getText_Element(abc);
		// String PremiumFinal = String

	}

	public void bc_AccountSummary() throws Throwable {

		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("Policy");
		GuidewireAutomate_Validation("AccountName", AS_AccountName, "equals", lhm_TestCase_Table_Data.get("TD_AccountName"));
		GuidewireAutomate_Validation("PrimaryContact", AS_PrimaryContact, "equals", lhm_TestCase_Table_Data.get("TD_PrimaryContact"));
		GuidewireAutomate_Validation("Currency", AS_Currency, "equals", lhm_TestCase_Table_Data.get("TD_Currency"));
		GuidewireAutomate_Validation("PayoffAmount", AS_PayoffAmount, "equals", lhm_TestCase_Table_Data.get("TD_PayoffAmount"));
		GuidewireAutomate_Validation("TotalValue", AS_TotalValue, "equals", lhm_TestCase_Table_Data.get("TD_TotalValue"));

		// Assert.assertEquals(getText_Element(AccountName_InfoBar),
		// strAccountName);
		// System.out.println(getText_Element(AccountNumber_InfoBar));
		// getText_ElementWait(AccountNumber_InfoBar);
		// Assert.assertEquals(getText_Element(AS_AccountName), strAccountName);
		// Assert.assertEquals(getText_Element(AS_PayoffAmount),
		// lhm_Data.get("TD_PayoffAmount"));
		// Assert.assertEquals(getText_Element(AS_PolicyNumber), strPolicyNumber +
		// "-1");
		// Assert.assertEquals(getText_Element(AS_TotalValue),
		// lhm_Data.get("TD_TotalValue"));
		// oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		// oExtentTest.log(Status.INFO, "AccountSummary is succesful");
		//

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public void bc_AccountSummary_Invoices() throws Throwable {
		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("Invoice");

		BC_Resuables.bcMenuNavigation("Invoice");
		// Assert.assertEquals(getSize_ElementsList(InvoiceDetails),
		// Integer.parseInt(lhm_Data.get("TD_InoiveEMI")));
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Invoices verification is succesful");

	}

	/*
	 * -------------------------------------------------------------- searchAccountInformation
	 * --------------------------------------------------------------
	 */

	public void bc_SearchAccountInformation() throws Throwable {

		GuidewireAutomate("CompanyName", CompanyName, "sendKeys", "QA Automation2");
		GuidewireAutomate("firstname", firstname, "sendKeys", "QA");
		GuidewireAutomate("lastname", lastname, "sendKeys", "Automation2");
		GuidewireAutomate("firstnameexactmatch", firstnameexactmatch, "sendKeys", "");
		GuidewireAutomate("lastnameexactmatch", lastnameexactmatch, "sendKeys", "");

		GuidewireAutomate("Country", Country, "sendKeys", "");
		GuidewireAutomate("City", City, "sendKeys", "");
		GuidewireAutomate("County", County, "sendKeys", "");
		GuidewireAutomate("State", State, "sendKeys", "");
		GuidewireAutomate("ZipCode", ZipCode, "sendKeys", "");

		BC_Resuables.clickButton("Search");

	}

	/*
	 * -------------------------------------------------------------- bc_NewAccount --------------------------------------------------------------
	 */
	public void bc_NewAccount() throws Throwable {

		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("Account");

		// ------> Verifying the page -
		GuidewireAutomate_Validation("Screen Header", NewAccount_Header, "equals", "New Account");
		// GuidewireAutomate("AccountNumber", AccountNumber, "", "");
		strAccountName = lhm_TestCase_Table_Data.get("TD_AccountName");
		GuidewireAutomate("AccountName", AccountName, "sendKeys", strAccountName);

		// GuidewireAutomate(ParentAccount, "sendKeys", "");
		GuidewireAutomate("Account Type", AccountType, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_AccountType"));
		GuidewireAutomate("ServiceTier", ServiceTier, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_ServiceTier"));
		GuidewireAutomate("SecurityZone", SecurityZone, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_SecurityZone"));

		GuidewireAutomate("BillingPlan", BillingPlan, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_BillingPlan"));
		GuidewireAutomate("DelinquencyPlan", DelinquencyPlan, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_DelinquencyPlan"));
		GuidewireAutomate("SendInvoicesBy", SendInvoicesBy, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_SendInvoicesBy"));

		GuidewireAutomate("AddExistingContact", AddExistingContact_Button, "clickAndwait", "click");

		GuidewireAutomate("CompanyName", CompanyName, "sendKeys", lhm_TestCase_Table_Data.get("TD_CompanyName"));
		BC_Resuables.clickButton("Search");

		GuidewireAutomate("Select", WrightConstruction_Select, "clickAndwait", "click");
		GuidewireAutomate("Edit", WrightConstruction_Edit, "clickAndwait", "click");

		GuidewireAutomate("PrimaryPayer", PrimaryPayer, "clickAndwait", "click");

		BC_Resuables.clickButton("OK");

		// getText_ElementWait(AccountNumber);

		GuidewireAutomate("CreateAccount", CreateAccount_Button, "clickAndwait", "click");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public void bc_SearchParentAccount() throws Throwable {
		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("Account");

		// ------> Verifying the page
		GuidewireAutomate("Search Button", ParentAccount_SearchButton, "clickAndwait", "click");

		GuidewireAutomate_Validation("Screen Header", SearchforAccounts_Header, "equals", "Search for Accounts");
		GuidewireAutomate("Account Number", AccountNumber, "sendKeys", lhm_TestCase_Table_Data.get("TD_SearchAccountNumber"));
		BC_Resuables.clickButton("Search");
		BC_Resuables.clickButton("Select");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public void bc_NewPolicy() throws Throwable {
		bc_NewPolicy_PolicyIssuanceWizard_Step1();
		bc_NewPolicy_PolicyIssuanceWizard_Step2();
	}

	public void bc_NewPolicy_PolicyIssuanceWizard_Step1() throws Throwable {

		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("Policy");

		// Policy Issuance Wizard - Step 1 of 2

		GuidewireAutomate_Validation("Screen Header", PolicyIssuanceWizardStep1_Header, "equals", "Policy Issuance Wizard - Step 1 of 2");
		// GuidewireAutomate("PolicyNumber", PolicyNumber, "sendKeys",
		// strPolicyNumber);
		GuidewireAutomate("Policy Number", PolicyNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_PolicyNumber"));

		GuidewireAutomate("BillingMethod", BillingMethod, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_BillingMethod"));
		GuidewireAutomate("PaymentPlan", PaymentPlan, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_PaymentPlan"));

		GuidewireAutomate("AddExistingContac", AddExistingContact_Button, "clickAndwait", "click");

		GuidewireAutomate("CompanyName", CompanyName, "sendKeys", lhm_TestCase_Table_Data.get("TD_CompanyName"));
		BC_Resuables.clickButton("Search");

		BC_Resuables.clickButton("Select");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public void bc_NewPolicy_PolicyIssuanceWizard_Step2() throws Throwable {
		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("Policy");

		GuidewireAutomate_Validation("Screen Header", PolicyIssuanceWizardStep2_Header, "equals", "Policy Issuance Wizard - Step 2 of 2");

		/// GuidewireAutomate(OK_Button, "clickAndwait", "click");

		GuidewireAutomate("AddCharges", PolicyAddCharges_Button, "clickAndwait", "click");

		GuidewireAutomate("ChargesType", PolicyAddChargesType, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_ChargesType"));

		GuidewireAutomate("ChargesAmount", PolicyAddChargesAmount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_ChargesAmount"));

		GuidewireAutomate("Finish", PolicyFinish_Button, "clickAndwait", "click");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}
}
