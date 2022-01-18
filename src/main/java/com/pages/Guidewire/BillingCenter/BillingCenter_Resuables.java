
package com.pages.Guidewire.BillingCenter;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.Tab_Menu_Navigation;

public class BillingCenter_Resuables extends SeleniumWebDriver_Commands implements BillingCenter_Resuables_PO {

	LinkedHashMap<String, String> lhm_Data;

	public BillingCenter_Resuables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void clickButton(String ButtonName) throws Throwable {
		switch (ButtonName) {
			case "Search" :
				GuidewireAutomate("Search", Search_Button, "clickAndwait", "");
				break;
			case "Reset" :
				GuidewireAutomate("Reset", Reset_Button, "clickAndwait", "");
				break;
			case "OK" :
				GuidewireAutomate("OK", OK_Button, "clickAndwait", "");
				break;
			case "Update" :
				GuidewireAutomate("Update", Update_Button, "clickAndwait", "");
				break;
			case "Cancel" :
				GuidewireAutomate("Cancel", Cancel_Button, "clickAndwait", "");
				break;
			case "Back" :
				GuidewireAutomate("Back", Back_Button, "clickAndwait", "clickAndwait");
				break;
			case "Next" :
				GuidewireAutomate("Next", Next_Button, "clickAndwait", "clickAndwait");
				break;
			case "Release Lock" :
				GuidewireAutomate("Release Lock", ReleaseLock_Button, "clickAndwait", "");
				break;
			case "Edit Policy Transaction" :
				GuidewireAutomate("Edit Policy Transaction", EditPolicyTransaction_Button, "clickAndwait", "");
				GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Quote" :
				GuidewireAutomate("Quote", Quote_Button, "clickAndwait", "");
				break;
			case "Save Draft" :
				GuidewireAutomate("Save Draft", SaveDraft_Button, "clickAndwait", "");
				break;
			case "Versions" :
				GuidewireAutomate("Versions", Versions_Button, "clickAndwait", "");
				break;
			case "Start Multi Version" :
				GuidewireAutomate("Start Multi Version", Start_MultiVersion_Button, "clickAndwait", "");
				break;
			case "Start Side By Side" :
				GuidewireAutomate("Start Side By Side", Start_SideBySide_Button, "clickAndwait", "");
				break;
			case "Bind Options" :
				GuidewireAutomate("Bind Options", BindOptions_Button, "click", "");
				break;
			case "Bind Only" :
				GuidewireAutomate("Bind Only", BindOptions_BindOnly_Button, "clickAndwait", "");
				GuidewireAutomate_Handle("alertaccept", "NA");
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Job, "equals", "Submission (Bound)");
				break;
			case "Issue Policy" :
				GuidewireAutomate("Issue Policy", Bindoptions_IssuePolicy_Button, "clickAndwait", "");
				GuidewireAutomate_Handle("alertaccept", "NA");
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Job, "equals", "Submission (Bound)");
				break;
			case "Close Options" :
				GuidewireAutomate("Close Options", CloseOptions_Button, "click", "");
				break;
			case "Withdraw Transaction" :
				GuidewireAutomate("Withdraw Transaction", CloseOptions_WithdrawTransaction_Button, "click", "");
				GuidewireAutomate_Handle("alertaccept", "NA");
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Job, "equals", "Submission (Withdrawn)");
				break;
			case "Decline" :
				GuidewireAutomate("Decline", CloseOptions_Decline_Button, "clickAndwait", "");
				GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Not Taken" :
				GuidewireAutomate("Not Taken", CloseOptions_NotTaken_Button, "clickAndwait", "");
				GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Print Quote" :
				GuidewireAutomate("Print Quote", PrintQuote_Button, "clickAndwait", "");
				break;
			case "Withdraw Transaction1" :
				GuidewireAutomate("Withdraw Transaction", WithdrawTransaction_Button, "clickAndwait", "");
				break;

			default :
				throw new IOException("No support for Button : " + ButtonName);
		}
	}

	public static String infoBar(String strLabel) throws Throwable {
		String strInfobar = null;

		switch (strLabel) {
			case "Job" :
				strInfobar = getText_Element(InfoBar_Job);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "Job", strInfobar);
				break;
			case "ReinstatementJob" :
				strInfobar = getText_Element(InfoBar_ReinstatementJob);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "Job", strInfobar);
				break;
			case "RewriteJob" :
				strInfobar = getText_Element(InfoBar_RewriteJob);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "Job", strInfobar);
				break;
			case "SubmissionNumber" :
				strInfobar = getText_Element(InfoBar_SubmissionNumber);
				strInfobar = strInfobar.substring("Submission".length() + 1, strInfobar.length());
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "SubmissionNumber", strInfobar);
				break;
			case "PolicyChangeNumber" :
				strInfobar = getText_Element(InfoBar_SubmissionNumber);
				strInfobar = strInfobar.substring("Policy Change".length() + 1, strInfobar.length());
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "SubmissionNumber", strInfobar);
				break;
			case "RenewalNumber" :
				strInfobar = getText_Element(InfoBar_SubmissionNumber);
				strInfobar = strInfobar.substring("Renewal".length() + 1, strInfobar.length());
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "SubmissionNumber", strInfobar);
				break;
			case "ReinstatementNumber" :
				strInfobar = getText_Element(InfoBar_ReinstatementNumber);
				strInfobar = strInfobar.substring("Reinstatement".length() + 1, strInfobar.length());
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "SubmissionNumber", strInfobar);
				break;
			case "RewriteNumber" :
				strInfobar = getText_Element(InfoBar_RewriteNumber);
				strInfobar = strInfobar.substring("Rewrite".length() + 1, strInfobar.length());
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "SubmissionNumber", strInfobar);
				break;
			case "Workflow" :
				strInfobar = getText_Element(InfoBar_Workflow);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "Workflow", strInfobar);
				break;
			case "LOB" :
				strInfobar = getText_Element(InfoBar_LOB);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "LOB", strInfobar);
				break;
			case "EffectiveDate" :
				strInfobar = getText_Element(InfoBar_EffectiveDate);
				break;
			case "Status" :
				strInfobar = getText_Element(InfoBar_Status);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "Job", strInfobar);
				break;
			case "AccountName" :
				strInfobar = getText_Element(InfoBar_AccountName);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "AccountName", strInfobar);
				break;
			case "AccountNumber" :
				strInfobar = getText_Element(InfoBar_AccountNumber);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "AccountNumber", strInfobar);
				break;
			case "PolicyNumber" :
				strInfobar = getText_Element(InfoBar_PolicyNumber);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "PolicyNumber", strInfobar);
				break;
			case "EditLock" :
				strInfobar = getText_Element(InfoBar_EditLock);
				break;
			case "Underwriter" :
				strInfobar = getText_Element(InfoBar_Underwriter);
				break;
			default :
				throw new IOException("No support for Label : " + strLabel);
		}
		oExtentTest.log(Status.INFO, " Fetched from Info Bar => " + strLabel + " = " + strInfobar);
		return strInfobar;
	}

	public static void bcTabNavigation_Acct_Search() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("searchValues", strTestCaseName);

		strAccountNumber = lhm_TestCase_Table_Data.get("AccountNumber");

		Tab_Menu_Navigation.bcTabNavigation("Acct Search", strAccountNumber);
		GuidewireAutomate_Validation("Screen Header", BillingCenter_AccountSummary_PO.AS_Header, "equals", "Account Summary");
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void bcTabNavigation_Sub_Search() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("searchValues", strTestCaseName);

		strSubmissionNumber = lhm_TestCase_Table_Data.get("SubmissionNumber");

		Tab_Menu_Navigation.bcTabNavigation("Sub Search", strSubmissionNumber);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void bcTabNavigation_Policy_Search() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("searchValues", strTestCaseName);

		strPolicyNumber = lhm_TestCase_Table_Data.get("PolicyNumber");

		Tab_Menu_Navigation.bcTabNavigation("Policy Search", strPolicyNumber);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

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
	 */ public static String getHeader_NewAccount() throws Throwable {
		return getText_Element(NewAccount);

	}

	/*
	 * --------------------------------------------------------------
	 * getAccountInformationHeader
	 * --------------------------------------------------------------
	 */ public static String getHeader_AccountSummary() throws Throwable {
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
	 * --------------------------------------------------------------
	 * bc_NewAccount
	 * --------------------------------------------------------------
	 */
	@Override
	public void bc_NewAccount() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Account", strTestCaseName);

		// ------> Verifying the page -
		GuidewireAutomate_Validation("Screen Header", BillingCenter_Resuables_PO.NewAccount_Header, "equals", "New Account");
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

		GuidewireAutomate("AddExistingContact", AddExistingContact_Button, "click", "");

		GuidewireAutomate("CompanyName", CompanyName, "sendKeys", lhm_TestCase_Table_Data.get("TD_CompanyName"));
		GuidewireAutomate("Search", Search_Button, "click", "");

		GuidewireAutomate("Select", WrightConstruction_Select, "click", "");
		GuidewireAutomate("Edit", WrightConstruction_Edit, "click", "");

		GuidewireAutomate("PrimaryPayer", PrimaryPayer, "click", "");

		GuidewireAutomate("OK", OK_Button, "click", "");

		// getText_ElementWait(AccountNumber);

		GuidewireAutomate("CreateAccount", CreateAccount_Button, "click", "");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public void bc_SearchParentAccount() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Account", strTestCaseName);

		// ------> Verifying the page
		GuidewireAutomate("Search Button", ParentAccount_SearchButton, "click", "");

		GuidewireAutomate_Validation("Screen Header", BillingCenter_Resuables_PO.SearchforAccounts_Header, "equals", "Search for Accounts");
		GuidewireAutomate("Account Number", AccountNumber, "sendKeys", lhm_TestCase_Table_Data.get("TD_SearchAccountNumber"));
		GuidewireAutomate("Search Button", Search_Button, "click", "");
		GuidewireAutomate("Select Button", Select_Button, "click", "");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	@Override
	public void bc_NewPolicy() throws Throwable {
		bc_NewPolicy_PolicyIssuanceWizard_Step1();
		bc_NewPolicy_PolicyIssuanceWizard_Step2();
	}

	public void bc_NewPolicy_PolicyIssuanceWizard_Step1() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Policy", strTestCaseName);

		// Policy Issuance Wizard - Step 1 of 2

		GuidewireAutomate_Validation("Screen Header", BillingCenter_Resuables_PO.PolicyIssuanceWizardStep1_Header, "equals", "Policy Issuance Wizard - Step 1 of 2");
		// GuidewireAutomate("PolicyNumber", PolicyNumber, "sendKeys",
		// strPolicyNumber);
		GuidewireAutomate("Policy Number", PolicyNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_PolicyNumber"));

		GuidewireAutomate("BillingMethod", BillingMethod, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_BillingMethod"));
		GuidewireAutomate("PaymentPlan", PaymentPlan, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_PaymentPlan"));

		GuidewireAutomate("AddExistingContac", AddExistingContact_Button, "clickAndwait", "");

		GuidewireAutomate("CompanyName", CompanyName, "sendKeys", lhm_TestCase_Table_Data.get("TD_CompanyName"));
		GuidewireAutomate("Search", Search_Button, "click", "");

		GuidewireAutomate("Select", WrightConstruction_Select, "click", "");

		GuidewireAutomate("Next", Next_Button, "click", "");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public void bc_NewPolicy_PolicyIssuanceWizard_Step2() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Policy", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", BillingCenter_Resuables_PO.PolicyIssuanceWizardStep2_Header, "equals", "Policy Issuance Wizard - Step 2 of 2");
		Assert.assertEquals(getHeader_PolicyIssuanceWizard2(), "Policy Issuance Wizard - Step 2 of 2");

		/// GuidewireAutomate(OK_Button, "click", "");

		GuidewireAutomate("AddCharges", PolicyAddCharges_Button, "click", "");

		GuidewireAutomate("ChargesType", PolicyAddChargesType, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_ChargesType"));

		GuidewireAutomate("ChargesAmount", PolicyAddChargesAmount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_ChargesAmount"));

		GuidewireAutomate("Finish", PolicyFinish_Button, "clickAndwait", "");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void DirectBillPayment() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("DirectBillPayment", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", DBP_Header, "equals", "Direct Bill Payment");
		GuidewireAutomate("Amount", DBP_Amount, "sendKeys", lhm_TestCase_Table_Data.get("TD_Amount"));
		GuidewireAutomate("Payment Instrument", DBP_PaymentInstrument, "selectByVisibleText", "Cash");
		GuidewireAutomate("Amount", DBP_Description, "sendKeys","Automation");
		//Code to click by using Action Class
		WebElement dbp_button=getElement(DBP_ExecuteWithoutDistribution);
		Actions build=new Actions(driver);
		build.moveToElement(dbp_button).click(dbp_button);
		build.perform();
		
		//GuidewireAutomate("Execute Without Distribution", DBP_ExecuteWithoutDistribution, "clickAndwait", "");
		//GuidewireAutomate("Execute Without Distribution", DBP_ExecuteWithoutDistribution, "click", "");

	}

	@Override
	public void bc_AccountSummary() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Policy", strTestCaseName);
		GuidewireAutomate_Validation("AccountName", AS_AccountName, "equals", lhm_TestCase_Table_Data.get("TD_AccountName"));
		GuidewireAutomate_Validation("PrimaryContact", AS_PrimaryContact, "equals", lhm_TestCase_Table_Data.get("TD_PrimaryContact"));
		GuidewireAutomate_Validation("Currency", AS_Currency, "equals", lhm_TestCase_Table_Data.get("TD_Currency"));
		GuidewireAutomate_Validation("PayoffAmount", AS_PayoffAmount, "equals", lhm_TestCase_Table_Data.get("TD_PayoffAmount"));
		GuidewireAutomate_Validation("TotalValue", AS_TotalValue, "equals", lhm_TestCase_Table_Data.get("TD_TotalValue"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}
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

	public static void FundsTracking() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", BillingCenter_Resuables_PO.FundsTracking_Header, "equals", "Funds Tracking");
		GuidewireAutomate("FundsSources", FT_FundsSources_Tab, "click", "");
		GuidewireAutomate("FundsUses", FT_FundsUses_Tab, "click", "");

	}

	public static void Payments() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", BillingCenter_Resuables_PO.Payments_Header, "equals", "Payments");
		GuidewireAutomate("Payment Details", Payments_PaymentDetails_Tab, "click", "");
		GuidewireAutomate("Suspense Items", Payments_SuspenseItems_Tab, "click", "");
		Thread.sleep(2000);
		GuidewireAutomate("Previous Versions", Payments_PreviousVersions_Tab, "clickAndwait", "");

	}

	@Override
	public void bc_AccountSummary_Invoices() throws Throwable {
		lhm_Data = getDataFromSheet_Fillo("Invoice", "InvoiceValues1");
		Tab_Menu_Navigation.bcMenuNavigation("Invoice");
		// Assert.assertEquals(getSize_ElementsList(InvoiceDetails),
		// Integer.parseInt(lhm_Data.get("TD_InoiveEMI")));
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Invoices verification is succesful");

	}

}
