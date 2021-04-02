
package com.pages.Sandbox;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.codoid.products.exception.FilloException;

public class GW_BillingCenter_Resuables extends GW_Utils_SeleniumWebDriver implements GW_BillingCenter_PO {

	LinkedHashMap<String, String> lhm_Data;

	public GW_BillingCenter_Resuables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
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
	}

	public String getHeader_PolicyIssuanceWizard2() {
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

		try {

			lhm_Data = getDataFromSheet_Fillo("Account", "BillPlan1");

			// ------> Verifying the page -
			Assert.assertEquals(getHeader_Accounts(), "Accounts");
			gwAutomate(Actions_Button, "click", "");
			gwAutomate(NewAccount_Button, "click", "");
			// ------> Verifying the page -
			Assert.assertEquals(getHeader_NewAccount(), "New Account");

			gwAutomate(AccountNumber, "", "");
			strAccountName = lhm_Data.get("TD_AccountName");
			gwAutomate(AccountName, "sendkeys", strAccountName);
			// gwAutomate(ParentAccount, "sendkeys", "");
			gwAutomate(AccountType, "selectByVisibleText", lhm_Data.get("TD_AccountType"));
			gwAutomate(BillingPlan, "selectByVisibleText", lhm_Data.get("TD_BillingPlan"));
			gwAutomate(DelinquencyPlan, "selectByVisibleText", lhm_Data.get("TD_DelinquencyPlan"));
			gwAutomate(SendInvoicesBy, "selectByVisibleText", lhm_Data.get("TD_SendInvoicesBy"));

			gwAutomate(AddExistingContact_Button, "click", "");

			gwAutomate(CompanyName, "sendkeys", lhm_Data.get("TD_CompanyName"));
			gwAutomate(Search_Button, "click", "");

			gwAutomate(WrightConstruction_Select, "click", "");
			gwAutomate(WrightConstruction_Edit, "click", "");

			gwAutomate(PrimaryPayer, "click", "");

			gwAutomate(OK_Button, "click", "");

			gwAutomate(CreateAccount_Button, "click", "");
			
			
			oExtentTest.log(Status.PASS, "CreateAccount is succesful");
			oExtentTest.addScreenCaptureFromPath(GW_Utils_Log.getScreenShoFt(driver));

		} catch (FilloException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void bc_NewPolicy() {

		try {

			lhm_Data = getDataFromSheet_Fillo("Policy", "PaymentPlan1");
			bc_NewPolicy_PolicyIssuanceWizard_Step1();
			bc_NewPolicy_PolicyIssuanceWizard_Step2();
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}

	public void bc_NewPolicy_PolicyIssuanceWizard_Step1() {

		try {

			lhm_Data = getDataFromSheet_Fillo("Policy", "PaymentPlan1");
			gwAutomate(Actions_Button, "click", "");
			gwAutomate(NewPolicy_Button, "click", "");

			Assert.assertEquals(getHeader_PolicyIssuanceWizard1(), "Policy Issuance Wizard - Step 1 of 2");

			gwAutomate(PolicyNumber, "sendkeys", strPolicyNumber);
			gwAutomate(BillingMethod, "selectByVisibleText", lhm_Data.get("TD_BillingMethod"));
			gwAutomate(PaymentPlan, "selectByVisibleText", lhm_Data.get("TD_PaymentPlan"));

			gwAutomate(AddExistingContact_Button, "click", "");

			gwAutomate(CompanyName, "sendkeys", lhm_Data.get("TD_CompanyName"));
			gwAutomate(Search_Button, "click", "");

			gwAutomate(WrightConstruction_Select, "click", "");

			gwAutomate(Next_Button, "click", "");
		} catch (FilloException e) {
			e.printStackTrace();
		}
	}

	public void bc_NewPolicy_PolicyIssuanceWizard_Step2() {

		try {

			lhm_Data = getDataFromSheet_Fillo("Policy", "PaymentPlan1");
			Assert.assertEquals(getHeader_PolicyIssuanceWizard2(), "Policy Issuance Wizard - Step 2 of 2");

			/// gwAutomate(OK_Button, "click", "");

			gwAutomate(PolicyAddCharges_Button, "click", "");

			gwAutomate(PolicyAddChargesType, "selectByVisibleText", lhm_Data.get("TD_ChargesType"));
			gwAutomate(PolicyAddChargesAmount, "clear", "");
			gwAutomate(PolicyAddChargesAmount, "sendkeys", lhm_Data.get("TD_ChargesAmount"));

			gwAutomate(PolicyFinish_Button, "click", "");
			gwAutomate(PolicyFinish_Button, "click", "");

		} catch (FilloException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void bc_AccountSummary() {

		try {

			lhm_Data = getDataFromSheet_Fillo("AcctSummary", "AcctSumry1");
			Assert.assertEquals(getText_Element(AccountName_InfoBar), strAccountName);
			System.out.println(getText_Element(AccountNumber_InfoBar));
			Assert.assertEquals(getText_Element(AS_AccountName), strAccountName);
			Assert.assertEquals(getText_Element(AS_PayoffAmount), lhm_Data.get("TD_PayoffAmount"));
			Assert.assertEquals(getText_Element(AS_PolicyNumber), strPolicyNumber + "-1");
			Assert.assertEquals(getText_Element(AS_TotalValue), lhm_Data.get("TD_TotalValue"));
		} catch (FilloException e) {
			e.printStackTrace();
		}
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

		try {

			lhm_Data = getDataFromSheet_Fillo("Invoice", "InvoiceValues1");
			bc_MenuNavigation_AccountSummary("Invoice");
			Assert.assertEquals(getText_Element(InvoiceHeader), "Invoices");
			//Assert.assertEquals(getSize_ElementsList(InvoiceDetails), Integer.parseInt(lhm_Data.get("TD_InoiveEMI")));

		} catch (FilloException e) {
			e.printStackTrace();
		}
	}

}
