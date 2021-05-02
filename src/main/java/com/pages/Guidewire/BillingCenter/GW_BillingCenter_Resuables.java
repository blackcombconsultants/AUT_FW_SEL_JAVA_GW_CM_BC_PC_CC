
package com.pages.Guidewire.BillingCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Reporting_Utils;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;

public class GW_BillingCenter_Resuables extends SeleniumWebDriver_Commands implements GW_BillingCenter_PO {

	LinkedHashMap<String, String> lhm_Data;

	public GW_BillingCenter_Resuables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	/*
	 * --------------------------------------------------------------
	 * getAccountInformationHeader
	 * --------------------------------------------------------------
	 */ public String getHeader_Accounts() throws Throwable {
		return getText_Element(Accounts);
	}

	/*
	 * --------------------------------------------------------------
	 * getAccountInformationHeader
	 * --------------------------------------------------------------
	 */ public String getHeader_NewAccount() throws Throwable {
		return getText_Element(NewAccount);

	}

	/*
	 * --------------------------------------------------------------
	 * getAccountInformationHeader
	 * --------------------------------------------------------------
	 */ public String getHeader_AccountSummary() throws Throwable {
		return getText_Element(AccountSummary);
	}

	/*
	 * --------------------------------------------------------------
	 * getHeader_PolicyIssuanceWizard
	 * --------------------------------------------------------------
	 */ public String getHeader_PolicyIssuanceWizard1() throws Throwable {
		return getText_Element(PolicyIssuanceWizard1);
	}

	public String getHeader_PolicyIssuanceWizard2() throws Throwable {
		return getText_Element(PolicyIssuanceWizard2);
	}

	/*
	 * --------------------------------------------------------------
	 * searchResultsMessage
	 * --------------------------------------------------------------
	 */
	// checking search result message
	public String gettext_SearchAccountResultsMessage() throws Throwable {
		return getText_Element(SearchAccountResults_Msg);
	}


	/*
	 * --------------------------------------------------------------
	 * searchAccountInformation
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

		GuidewireAutomate("Search", Search_Button, "click", "");

	}

	/*
	 * -------------------------------------------------------------- bc_NewAccount
	 * --------------------------------------------------------------
	 */
	@Override
	public void bc_NewAccount() throws Throwable {

		lhm_Data = getDataFromSheet_Fillo("Account", "BillPlan1");

		GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("NewAccount");

		// ------> Verifying the page -
		Assert.assertEquals(getHeader_NewAccount(), "New Account");
		// GuidewireAutomate("AccountNumber", AccountNumber, "", "");
		strAccountName = lhm_Data.get("TD_AccountName");
		GuidewireAutomate("AccountName", AccountName, "sendKeys", strAccountName);
		// GuidewireAutomate(ParentAccount, "sendKeys", "");
		GuidewireAutomate("AccountType", AccountType, "selectByVisibleText", lhm_Data.get("TD_AccountType"));
		GuidewireAutomate("BillingPlan", BillingPlan, "selectByVisibleText", lhm_Data.get("TD_BillingPlan"));
		GuidewireAutomate("DelinquencyPlan", DelinquencyPlan, "selectByVisibleText",
				lhm_Data.get("TD_DelinquencyPlan"));
		GuidewireAutomate("SendInvoicesBy", SendInvoicesBy, "selectByVisibleText", lhm_Data.get("TD_SendInvoicesBy"));

		GuidewireAutomate("AddExistingContact", AddExistingContact_Button, "click", "");

		GuidewireAutomate("CompanyName", CompanyName, "sendKeys", lhm_Data.get("TD_CompanyName"));
		GuidewireAutomate("Search", Search_Button, "click", "");

		GuidewireAutomate("Select", WrightConstruction_Select, "click", "");
		GuidewireAutomate("Edit", WrightConstruction_Edit, "click", "");

		GuidewireAutomate("PrimaryPayer", PrimaryPayer, "click", "");

		GuidewireAutomate("OK", OK_Button, "click", "");

		// getText_ElementWait(AccountNumber);

		GuidewireAutomate("CreateAccount", CreateAccount_Button, "click", "");

		oExtentTest.log(Status.PASS, "CreateAccount is succesful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));

		// ------> Verifying the page -
		Assert.assertEquals(getHeader_AccountSummary(), "Account Summary");
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.PASS, "Expectd = " + getHeader_AccountSummary() + " 		Actual = " + "Account Summary");

	}

	@Override
	public void bc_NewPolicy() throws Throwable {
		lhm_Data = getDataFromSheet_Fillo("Policy", "PaymentPlan1");
		bc_NewPolicy_PolicyIssuanceWizard_Step1();
		bc_NewPolicy_PolicyIssuanceWizard_Step2();
	}

	public void bc_NewPolicy_PolicyIssuanceWizard_Step1() throws Throwable {

		lhm_Data = getDataFromSheet_Fillo("Policy", "PaymentPlan1");

		GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("NewPolicy");

		// Policy Issuance Wizard - Step 1 of 2
		Assert.assertEquals(getHeader_PolicyIssuanceWizard1(), "Policy Issuance Wizard - Step 1 of 2");

		GuidewireAutomate("PolicyNumber", PolicyNumber, "sendKeys", strPolicyNumber);
		GuidewireAutomate("BillingMethod", BillingMethod, "selectByVisibleText", lhm_Data.get("TD_BillingMethod"));
		GuidewireAutomate("PaymentPlan", PaymentPlan, "selectByVisibleText", lhm_Data.get("TD_PaymentPlan"));

		GuidewireAutomate("AddExistingContac", AddExistingContact_Button, "click", "");

		GuidewireAutomate("CompanyName", CompanyName, "sendKeys", lhm_Data.get("TD_CompanyName"));
		GuidewireAutomate("Search", Search_Button, "click", "");

		GuidewireAutomate("Select", WrightConstruction_Select, "click", "");

		GuidewireAutomate("Next", Next_Button, "click", "");
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "PolicyIssuanceWizard_Step1 is succesful");

	}

	public void bc_NewPolicy_PolicyIssuanceWizard_Step2() throws Throwable {
		lhm_Data = getDataFromSheet_Fillo("Policy", "PaymentPlan1");
		Assert.assertEquals(getHeader_PolicyIssuanceWizard2(), "Policy Issuance Wizard - Step 2 of 2");

		/// GuidewireAutomate(OK_Button, "click", "");

		GuidewireAutomate("AddCharges", PolicyAddCharges_Button, "click", "");

		GuidewireAutomate("ChargesType", PolicyAddChargesType, "selectByVisibleText", lhm_Data.get("TD_ChargesType"));
		GuidewireAutomate("ChargesAmount", PolicyAddChargesAmount, "clear", "");
		GuidewireAutomate("ChargesAmount", PolicyAddChargesAmount, "sendKeys", lhm_Data.get("TD_ChargesAmount"));

		GuidewireAutomate("Finish", PolicyFinish_Button, "click", "");
		GuidewireAutomate("Finish", PolicyFinish_Button, "click", "");
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "NewPolicy_PolicyIssuanceWizard_Step2 is succesful");

	}

	@Override
	public void bc_AccountSummary() throws Throwable {

		lhm_Data = getDataFromSheet_Fillo("AcctSummary", "AcctSumry1");
		Assert.assertEquals(getText_Element(AccountName_InfoBar), strAccountName);
		System.out.println(getText_Element(AccountNumber_InfoBar));
		getText_ElementWait(AccountNumber_InfoBar);
		Assert.assertEquals(getText_Element(AS_AccountName), strAccountName);
		Assert.assertEquals(getText_Element(AS_PayoffAmount), lhm_Data.get("TD_PayoffAmount"));
		Assert.assertEquals(getText_Element(AS_PolicyNumber), strPolicyNumber + "-1");
		Assert.assertEquals(getText_Element(AS_TotalValue), lhm_Data.get("TD_TotalValue"));
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "AccountSummary is succesful");
	}

	@Override
	public void bc_AccountSummary_Invoices() throws Throwable {
		lhm_Data = getDataFromSheet_Fillo("Invoice", "InvoiceValues1");
		GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Invoice");
		// Assert.assertEquals(getSize_ElementsList(InvoiceDetails),
		// Integer.parseInt(lhm_Data.get("TD_InoiveEMI")));
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Invoices verification is succesful");

	}

}
