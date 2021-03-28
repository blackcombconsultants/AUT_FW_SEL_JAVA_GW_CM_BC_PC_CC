package com.pages.Sandbox;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BillingCenter_Resuables extends WebDriverUtils implements IBillingCenter {

	SimpleDateFormat formatter = new SimpleDateFormat("ddMMMMyyyy HHmmss");

	
	public WebDriver driver;
	public String strAccountName = "Automation9";;
	public String strPolicyNumber = formatter.format(new Date());

	public String strAccountNumber;
	public String strAmount = "1000";

	
	public BillingCenter_Resuables(WebDriver driver) {
		super(driver);
	}

	/*
	 * --------------------------------------------------------------
	 * getAccountInformationHeader
	 * --------------------------------------------------------------
	 */ public String getHeader_Accounts() {
		return getText_Element(Accounts);
	}

	/*
	 * --------------------------------------------------------------
	 * getAccountInformationHeader
	 * --------------------------------------------------------------
	 */ public String getHeader_NewAccount() {
		return getText_Element(NewAccount);
		
	}

	/*
	 * --------------------------------------------------------------
	 * getAccountInformationHeader
	 * --------------------------------------------------------------
	 */ public String getHeader_AccountSummary() {
		return getText_Element(AccountSummary);
	}

	/*
	 * --------------------------------------------------------------
	 * getHeader_PolicyIssuanceWizard
	 * --------------------------------------------------------------
	 */ public String getHeader_PolicyIssuanceWizard1() {
			return getText_Element(PolicyIssuanceWizard1);
		}public String getHeader_PolicyIssuanceWizard2() {
			return getText_Element(PolicyIssuanceWizard2);
		}

	/*
	 * --------------------------------------------------------------
	 * searchResultsMessage
	 * --------------------------------------------------------------
	 */
	// checking search result message
	public String gettext_SearchAccountResultsMessage() {
		return getText_Element(SearchAccountResults_Msg);
	}

	/*
	 * --------------------------------------------------------------
	 * searchAccountInformation
	 * --------------------------------------------------------------
	 */

	public void bc_SearchAccountInformation() {

		gwAutomate(CompanyName, "sendkeys", "QA Automation2");
		gwAutomate(firstname, "sendkeys", "QA");
		gwAutomate(lastname, "sendkeys", "Automation2");
		gwAutomate(firstnameexactmatch, "sendkeys", "");
		gwAutomate(lastnameexactmatch, "sendkeys", "");

		gwAutomate(Country, "sendkeys", "");
		gwAutomate(City, "sendkeys", "");
		gwAutomate(County, "sendkeys", "");
		gwAutomate(State, "sendkeys", "");
		gwAutomate(ZipCode, "sendkeys", "");

		gwAutomate(Search_Button, "click", "");

	}

	/*
	 * -------------------------------------------------------------- bc_NewAccount
	 * --------------------------------------------------------------
	 */
	@Override
	public void bc_NewAccount() {

		// ------> Verifying the page -
		Assert.assertEquals(getHeader_Accounts(), "Accounts");
		gwAutomate(Actions_Button, "click", "");
		gwAutomate(NewAccount_Button, "click", "");
		// ------> Verifying the page -
		Assert.assertEquals(getHeader_NewAccount(), "New Account");

		gwAutomate(AccountNumber, "", "");
		gwAutomate(AccountName, "sendkeys", strAccountName);
		// gwAutomate(ParentAccount, "sendkeys", "");
		gwAutomate(AccountType, "selectByVisibleText", "Insured");
		gwAutomate(BillingPlan, "selectByVisibleText", "QA1BILLINGPLAN01");
		gwAutomate(DelinquencyPlan, "selectByVisibleText", "Equity-Based Delinquency Plan");
		gwAutomate(SendInvoicesBy, "selectByVisibleText", "Email");

		gwAutomate(AddExistingContact_Button, "click", "");

		gwAutomate(CompanyName, "sendkeys", "Wright Construction");
		gwAutomate(Search_Button, "click", "");

		gwAutomate(WrightConstruction_Select, "click", "");
		gwAutomate(WrightConstruction_Edit, "click", "");

		gwAutomate(PrimaryPayer, "click", "");

		gwAutomate(OK_Button, "click", "");

		gwAutomate(CreateAccount_Button, "click", "");

	}

	@Override
	public void bc_NewPolicy() {
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMMMyyyy HHmmss");
		strPolicyNumber = formatter.format(new Date());
		
		bc_NewPolicy_PolicyIssuanceWizard_Step1();
		bc_NewPolicy_PolicyIssuanceWizard_Step2();

	}

	public void bc_NewPolicy_PolicyIssuanceWizard_Step1() {

		gwAutomate(Actions_Button, "click", "");
		gwAutomate(NewPolicy_Button, "click", "");

		Assert.assertEquals(getHeader_PolicyIssuanceWizard1(), "Policy Issuance Wizard - Step 1 of 2");

		gwAutomate(PolicyNumber, "sendkeys", strPolicyNumber);
		gwAutomate(BillingMethod, "selectByVisibleText", "Direct Bill");
		gwAutomate(PaymentPlan, "selectByVisibleText", "B Monthly 10% Down, Max 11 installments");

		gwAutomate(AddExistingContact_Button, "click", "");

		gwAutomate(CompanyName, "sendkeys", "Wright Construction");
		gwAutomate(Search_Button, "click", "");

		gwAutomate(WrightConstruction_Select, "click", "");

		gwAutomate(Next_Button, "click", "");

	}

	public void bc_NewPolicy_PolicyIssuanceWizard_Step2() {
		Assert.assertEquals(getHeader_PolicyIssuanceWizard2(), "Policy Issuance Wizard - Step 2 of 2");

		///gwAutomate(OK_Button, "click", "");

		gwAutomate(PolicyAddCharges_Button, "click", "");

		gwAutomate(PolicyAddChargesType, "selectByVisibleText", "Premium");
		gwAutomate(PolicyAddChargesAmount, "clear", strAmount);
		gwAutomate(PolicyAddChargesAmount, "sendkeys", strAmount);

		gwAutomate(PolicyFinish_Button, "click", "");
		gwAutomate(PolicyFinish_Button, "click", "");

	}

	@Override
	public void bc_AccountSummary() {

		Assert.assertEquals(getText_Element(AccountName_InfoBar), strAccountName);
		System.out.println(getText_Element(AccountNumber_InfoBar));
		Assert.assertEquals(getText_Element(AS_AccountName), strAccountName);
		Assert.assertEquals(getText_Element(AS_PayoffAmount), "$1,000.00");
		Assert.assertEquals(getText_Element(AS_PolicyNumber), strPolicyNumber+"-1");
		Assert.assertEquals(getText_Element(AS_TotalValue), "$1,000.00");
	}

	@Override
	public void bc_MenuNavigation_AccountSummary(String strMenuOption) {
		switch (strMenuOption) {
		case "History":
			gwAutomate(AS_HistoryLink, "click", "Null");
			break;
		case "Invoice":
			gwAutomate(AS_InvoicesLink, "click", "Null");
			break;
		case "x":
		case "y":
		case "z":

		default:
			break;
		}
	}

	@Override
	public void bc_AccountSummary_Invoices() {
		bc_MenuNavigation_AccountSummary("Invoice");
		Assert.assertEquals(getText_Element(InvoiceHeader), "Invoices");
		Assert.assertEquals(getSize_ElementsList(InvoiceDetails), 11);

	}

}
