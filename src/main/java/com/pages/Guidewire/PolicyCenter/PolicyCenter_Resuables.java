package com.pages.Guidewire.PolicyCenter;

import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;

import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_PolicyInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_RiskAnalysis;

public class PolicyCenter_Resuables extends SeleniumWebDriver_Commands implements PolicyCenter_Resuables_PO {

	LinkedHashMap<String, String> lhm_TestCase_Table_Data1;

	public PolicyCenter_Resuables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	/*
	 * -------------------------------------------------------------- searchResultsMessage
	 * --------------------------------------------------------------
	 */
	// checking search result message
	public static String gettext_SearchAccountResultsMessage() throws Throwable {
		return getText_Element(SearchAccountResults_Msg);
	}

	public static boolean ValidationResults_Clear() throws Throwable {
		Boolean bValidationResults = false;
		By      ValidationResults  = By.xpath("//div[@id='wsTabBar-wsTab_0']//div[@role='tab']");
		By      Clear              = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");

		if (IsElementDisplayed("ValidationResults", ValidationResults)) {
			GuidewireAutomate_Validation("Section", ValidationResults, "equals", "Validation Results");
			GuidewireAutomate("Clear", Clear, "clickAndwait", "click");
			bValidationResults = true;
		}

		return bValidationResults;
	}

	public static void clickButton(String ButtonName) throws Throwable {

		String DynamicXpath_InfoBar_Jobstatus = "//div[contains(@id,'InfoBar-JobLabel')]//div[@class='gw-label']";
		By     InfoBar_Jobstatus;

		switch (ButtonName) {
			case "Search" :
				GuidewireAutomate("Search", Search_Button, "clickAndwait", "click");
				break;
			case "Reset" :
				GuidewireAutomate("Reset", Reset_Button, "clickAndwait", "click");
				break;
			case "OK" :
				GuidewireAutomate("OK", OK_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Update" :
				getStaleElement("Update", Update_Button);
				getStaleElement("Update", Update_Button);
				GuidewireAutomate("Update", Update_Button, "clickAndwait", "click");
				break;
			case "Cancel" :
				GuidewireAutomate("Cancel", Cancel_Button, "clickAndwait", "click");
				break;
			case "Back" :
				getStaleElement("Back", Back_Button);
				GuidewireAutomate("Back", Back_Button, "clickAndwait", "click");
				break;
			case "Next" :
				getStaleElement("Next", Next_Button);
				GuidewireAutomate("Next", Next_Button, "clickAndwait", "click");
				break;

			case "Save Next" :
				getStaleElement("Next", SaveAndNext_Button);
				GuidewireAutomate("Next", SaveAndNext_Button, "clickAndwait", "click");
				Thread.sleep(6000);
				break;
			case "Edit" :
				GuidewireAutomate("Edit", Edit_Button, "clickAndwait", "click");
				break;
			case "Release Lock" :
				GuidewireAutomate("Release Lock", ReleaseLock_Button, "clickAndwait", "click");
				break;
			case "Edit Policy Transaction" :
				getStaleElement("Edit Policy Transaction", EditPolicyTransaction_Button);
				GuidewireAutomate("Edit Policy Transaction", EditPolicyTransaction_Button, "clickAndwait", "click");
				// GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "AccountSummary_Edit" :
				getStaleElement("AS Edit Button", AS_Edit_Button);
				GuidewireAutomate("AS_Edit_Button", AS_Edit_Button, "clickAndwait", "click");
				break;
			case "Quote" :
				Thread.sleep(3000);
				GuidewireAutomate("Quote", Quote_Button, "clickAndwait", "click");
				break;
			case "Save Draft" :
				getStaleElement("Save Draft", SaveDraft_Button);
				GuidewireAutomate("Save Draft", SaveDraft_Button, "clickAndwait", "click");
				break;
			case "Versions" :
				GuidewireAutomate("Versions", Versions_Button, "clickAndwait", "click");
				break;
			case "Start Multi Version" :
				GuidewireAutomate("Start Multi Version", Start_MultiVersion_Button, "clickAndwait", "click");
				break;
			case "Start Side By Side" :
				GuidewireAutomate("Start Side By Side", Start_SideBySide_Button, "clickAndwait", "click");
				break;
			case "Bind Options" :
				GuidewireAutomate("Bind Options", BindOptions_Button, "clickAndwait", "click");
				break;
			case "Bind Only" :
				GuidewireAutomate("Bind Only", BindOptions_BindOnly_Button, "clickAndwait", "click");
				break;
			case "Issue Policy" :
				GuidewireAutomate("Issue Policy", Bindoptions_IssuePolicy_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				InfoBar_Jobstatus = By.xpath(DynamicXpath_InfoBar_Jobstatus.replace("Jobstatus", "Submission (Bound)"));
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Jobstatus, "contains", "Submission");
				break;

			case "IssuePolicy for ChangePolicy" :
				getStaleElement("IssuePolicy", IssuePolicyButton);
				GuidewireAutomate("IssuePolicy", IssuePolicyButton, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				InfoBar_Jobstatus = By.xpath(DynamicXpath_InfoBar_Jobstatus.replace("Jobstatus", "Policy Change (Bound)"));
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Jobstatus, "equals", "Policy Change (Bound)");
				break;
			case "Issue Policy for Policy Change" :
				GuidewireAutomate("Issue Policy", Rewrite_IssuePolicy_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				InfoBar_Jobstatus = By.xpath(DynamicXpath_InfoBar_Jobstatus.replace("Jobstatus", "Policy Change (Bound)"));
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Jobstatus, "equals", "Policy Change (Bound)");
				break;
			case "Schedule Cancellation" :
				GuidewireAutomate("Schedule Cancellation", BindOptions_ScheduleCancellation_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Cancel Now" :
				GuidewireAutomate("Cancel Now", Bindoptions_CancelNow_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				InfoBar_Jobstatus = By.xpath(DynamicXpath_InfoBar_Jobstatus.replace("Jobstatus", "Cancellation (Bound)"));
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Jobstatus, "equals", "Cancellation (Bound)");
				break;
			case "Renew" :
				GuidewireAutomate("Renew", BindOptions_ScheduleCancellation_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Issue Now" :
				GuidewireAutomate("Issue Now", Bindoptions_IssueNow_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				// GuidewireAutomate_Validation("Infobar Job", InfoBar_Job, "equals", "Cancellation (Bound)");
				break;
			case "Reinstate" :
				getStaleElement("Reinstate", Reinstate_Button);
				GuidewireAutomate("Reinstate", Reinstate_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Job, "equals", "Reinstatement (Bound)");
				break;
			case "Issue Policy for Rewrite Full Term" :
				GuidewireAutomate("Issue Policy", Rewrite_IssuePolicy_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Job, "equals", "Rewrite Full Term (Bound)");
				break;
			case "Issue Policy for Rewrite New Term" :
				GuidewireAutomate("Issue Policy", Rewrite_IssuePolicy_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				InfoBar_Jobstatus = By.xpath(DynamicXpath_InfoBar_Jobstatus.replace("Jobstatus", "Rewrite New Term (Quoted)"));
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Jobstatus, "equals", "Rewrite New Term (Quoted)");
				break;
			case "Issue Policy for Rewrite New Term Bound" :
				GuidewireAutomate("Issue Policy", Rewrite_IssuePolicy_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				InfoBar_Jobstatus = By.xpath(DynamicXpath_InfoBar_Jobstatus.replace("Jobstatus", "Rewrite New Term (Bound)"));
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Jobstatus, "equals", "Rewrite New Term (Bound)");
				break;
			case "Issue Policy for Rewrite Remainder of Term" :
				GuidewireAutomate("Issue Policy", Rewrite_IssuePolicy_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				InfoBar_Jobstatus = By.xpath(DynamicXpath_InfoBar_Jobstatus.replace("Jobstatus", "Rewrite Remainder of Term (Quoted)"));
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Jobstatus, "equals", "Rewrite Remainder of Term (Quoted)");
				break;
			case "Issue Policy for Rewrite Remainder of Term Bound" :
				GuidewireAutomate("Issue Policy", Rewrite_IssuePolicy_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				InfoBar_Jobstatus = By.xpath(DynamicXpath_InfoBar_Jobstatus.replace("Jobstatus", "Rewrite Remainder of Term (Bound)"));
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Jobstatus, "equals", "Rewrite Remainder of Term (Bound)");
				break;
			case "Close Options" :
				GuidewireAutomate("Close Options", CloseOptions_Button, "clickAndwait", "click");
				break;

			/*
			 * Name:shanta date:30/03/2022
			 */

			case "Close Options NonRenew" :
				getStaleElement("Close Options", CloseOptions_Button);
				GuidewireAutomate("Close Options", CloseOptions_Button, "clickAndwait", "click");
				GuidewireAutomate("NonRenew", NonRenew, "clickAndwait", "click");
				// GuidewireAutomate_Handle("alertaccept", "NA");
				break;

			case "Withdraw Transaction" :
				GuidewireAutomate("Withdraw Transaction", CloseOptions_WithdrawTransaction_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Job, "equals", "Submission (Withdrawn)");
				break;
			case "Decline" :
				GuidewireAutomate("Decline", CloseOptions_Decline_Button, "clickAndwait", "click");
				// GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Not Taken" :
				GuidewireAutomate("Not Taken", CloseOptions_NotTaken_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Print Quote" :
				GuidewireAutomate("Print Quote", PrintQuote_Button, "clickAndwait", "click");
				break;
			case "Withdraw Transaction1" :
				GuidewireAutomate("Withdraw Transaction", WithdrawTransaction_Button, "clickAndwait", "click");
				break;

			default :

				throw new IOException("No support for Button : " + ButtonName);
		}
	}

	public static String infoBar(String strLabel) throws Throwable {

		String strInfobar = null;

		try {

			switch (strLabel) {
				case "Job" :
					strInfobar = getText_Element(InfoBar_Job);
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "Job", strInfobar);
					break;
				case "ReinstatementJob" :
					strInfobar = getText_Element(InfoBar_ReinstatementJob);
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "Job", strInfobar);
					break;
				case "RewriteJob" :
					strInfobar = getText_Element(InfoBar_RewriteJob);
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "Job", strInfobar);
					break;
				case "SubmissionNumber" :
					strInfobar = getText_Element(InfoBar_SubmissionNumber);
					strInfobar = strInfobar.substring("Submission".length() + 1, strInfobar.length());
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "SubmissionNumber", strInfobar);
					break;
				case "PolicyChangeNumber" :
					strInfobar = getText_Element(InfoBar_SubmissionNumber);
					strInfobar = strInfobar.substring("Policy Change".length() + 1, strInfobar.length());
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "SubmissionNumber", strInfobar);
					break;
				case "RenewalNumber" :
					strInfobar = getText_Element(InfoBar_SubmissionNumber);
					strInfobar = strInfobar.substring("Renewal".length() + 1, strInfobar.length());
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "SubmissionNumber", strInfobar);
					break;
				case "ReinstatementNumber" :
					strInfobar = getText_Element(InfoBar_ReinstatementNumber);
					strInfobar = strInfobar.substring("Reinstatement".length() + 1, strInfobar.length());
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "SubmissionNumber", strInfobar);
					break;
				case "RewriteNumber" :
					strInfobar = getText_Element(InfoBar_RewriteNumber);
					strInfobar = strInfobar.substring("Rewrite".length() + 1, strInfobar.length());
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "SubmissionNumber", strInfobar);
					break;
				case "Workflow" :
					strInfobar = getText_Element(InfoBar_Workflow);
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "Workflow", strInfobar);
					break;
				case "LOB" :
					strInfobar = getText_Element(InfoBar_LOB);
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "LOB", strInfobar);
					break;
				case "EffectiveDate" :
					strInfobar = getText_Element(InfoBar_EffectiveDate);
					break;
				case "Status" :
					strInfobar = getText_Element(InfoBar_Status);
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "Job", strInfobar);
					break;
				case "AccountName" :
					strInfobar = getText_Element(InfoBar_AccountName);
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "AccountName", strInfobar);
					break;
				case "AccountNumber" :
					strInfobar = getText_Element(InfoBar_AccountNumber);
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "AccountNumber", strInfobar);
					break;
				case "PolicyNumber" :
					strInfobar = getText_Element(InfoBar_PolicyNumber);
					Selenium_Utils_DataBase.UpdateData_MSExcelWorkSheet_Column_Fillo("master", "PolicyNumber", strInfobar);
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

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, e.getMessage());
		}
		return strInfobar;
	}
	public static void Policytransactions(String Job) throws Throwable {
		switch (Job) {
			case "Change Policy" :
				Tab_Menu_Navigation.pcMenuNavigation("Change Policy");

				strLOB = PolicyCenter_Resuables.infoBar("LOB");
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
				Thread.sleep(2000);
				PolicyCenter_Resuables.PC_ChangePolicy();
				PolicyCenter_Resuables.offering();
				PolicyCenter_Resuables.clickButton("Next");
				CA_PolicyInfo.primaryNamedInsured_ChangeTo_NewPerson();
				PolicyCenter_Resuables.clickButton("Update");
				PolicyCenter_Resuables.NavigateToPolicyReviewScreen();
				PolicyCenter_Resuables.PolicyReview_Preemption();
				PolicyCenter_Resuables.clickButton("Quote");
				PolicyCenter_Resuables.clickButton("IssuePolicy for ChangePolicy");
				strJob = PolicyCenter_Resuables.infoBar("Job");
				strLOB = PolicyCenter_Resuables.infoBar("LOB");
				strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
				strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
				break;

			case "Change Policy_ChangeConflicts" :
				Tab_Menu_Navigation.pcMenuNavigation("Change Policy");

				strLOB = PolicyCenter_Resuables.infoBar("LOB");
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
				PolicyCenter_Resuables.PC_ChangePolicyPastDate();
				PolicyCenter_Resuables.offering();
				PolicyCenter_Resuables.clickButton("Next");
				CA_PolicyInfo.primaryNamedInsured_ChangeTo_NewPerson();
				PolicyCenter_Resuables.clickButton("Update");
				PolicyCenter_Resuables.NavigateToPolicyReviewScreen();
				PolicyCenter_Resuables.PolicyReview_ChangeConflicts();
				PolicyCenter_Resuables.clickButton("Quote");
				PolicyCenter_Resuables.clickButton("IssuePolicy for ChangePolicy");
				strJob = PolicyCenter_Resuables.infoBar("Job");
				strLOB = PolicyCenter_Resuables.infoBar("LOB");
				strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
				strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
				break;

			case "CancelPolicy_CancelNow" :
				Tab_Menu_Navigation.pcMenuNavigation("Cancel Policy");
				PolicyCenter_Resuables.startCancellationForPolicy();
				PolicyCenter_Resuables.clickButton("Bind Options");
				PolicyCenter_Resuables.clickButton("Cancel Now");
				PC_Bound.Cancellation_ViewYourPolicy();
				break;

			case "CancelPolicy_Schedule CancellationLaterDate" :
				Tab_Menu_Navigation.pcMenuNavigation("Cancel Policy");
				PolicyCenter_Resuables.startCancellationForLaterDate();
				PolicyCenter_Resuables.clickButton("Bind Options");
				PolicyCenter_Resuables.clickButton("Schedule Cancellation");
				PC_Bound.Cancellation_Scheduled_ViewYourPolicy();
				break;

			case "CancelPolicy_Schedule Cancellation" :
				Tab_Menu_Navigation.pcMenuNavigation("Cancel Policy");
				PolicyCenter_Resuables.startCancellationForPolicy();
				PolicyCenter_Resuables.clickButton("Bind Options");
				PolicyCenter_Resuables.clickButton("Schedule Cancellation");
				PC_Bound.Cancellation_Scheduled_ViewYourPolicy();
				break;

			case "Reinstate Policy" :
				Tab_Menu_Navigation.pcMenuNavigation("Reinstate Policy");
				PolicyCenter_Resuables.startReinstatement_PolicyDetails();
				PolicyCenter_Resuables.startReinstatement_AffinityGroup();
				PolicyCenter_Resuables.clickButton("Next");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("ReinstatementNumber");
				PA_RiskAnalysis.button_Verify();
				PolicyCenter_Resuables.clickButton("Save Draft");
				PolicyCenter_Resuables.clickButton("Quote");
				PolicyCenter_Resuables.clickButton("Next");
				PolicyCenter_Resuables.clickButton("Save Draft");
				PolicyCenter_Resuables.clickButton("Reinstate");
				break;

			case "Renew Policy_NonRenewing" :
				Tab_Menu_Navigation.pcMenuNavigation("Renew Policy");
				PolicyCenter_Resuables.clickButton("Next");
				PolicyCenter_Resuables.clickButton("Next");
				PolicyCenter_Resuables.clickButton("Edit Policy Transaction");
				PolicyCenter_Resuables.clickButton("Close Options NonRenew");
				PolicyCenter_Resuables.NonRenewalDataEntry();
				PolicyCenter_Resuables.clickButton("OK");
				Thread.sleep(2000);
				strJob = PolicyCenter_Resuables.infoBar("Job");
				strLOB = PolicyCenter_Resuables.infoBar("LOB");
				strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
				strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
				break;

			case "Copy Submission" :
				Tab_Menu_Navigation.pcMenuNavigation("Copy Submission");
				// Navigate to copy submission pages
				PolicyCenter_Resuables.clickButton("Next");
				PolicyCenter_Resuables.clickButton("Next");
				CA_PolicyInfo.policyDetails();
				PolicyCenter_Resuables.clickButton("Quote");
				PolicyCenter_Resuables.clickButton("Bind Options");
				PolicyCenter_Resuables.clickButton("Issue Policy");
				PC_Bound.ViewYourPolicy();
				break;

			default :
				throw new IOException("No support for Job : " + Job);
		}
	}

	public static void pcTabNavigation_Acct_Search() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("searchValues", strTestCaseName);

		strAccountNumber = lhm_TestCase_Table_Data.get("AccountNumber");

		Tab_Menu_Navigation.pcTabNavigation("Acct Search", strAccountNumber);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void pcTabNavigation_Sub_Search() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("searchValues", strTestCaseName);

		strSubmissionNumber = lhm_TestCase_Table_Data.get("SubmissionNumber");

		Tab_Menu_Navigation.pcTabNavigation("Sub Search", strSubmissionNumber);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void pcTabNavigation_Policy_Search() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("searchValues", strTestCaseName);

		strPolicyNumber = lhm_TestCase_Table_Data.get("PolicyNumber");

		Tab_Menu_Navigation.pcTabNavigation("Policy Search", strPolicyNumber);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void pcTabNavigation_Contact_Search() throws Throwable {
		// TODO Auto-generated method stub

	}
	/*
	 * shanta
	 */
	public static void PolicyReview_Preemption() throws Throwable {
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.PolicyReview_Header, "equals", "Policy Review");
		GuidewireAutomate_Validation("Search", Tab_Differences, "equals", "Differences");
		GuidewireAutomate_Validation("PolicyItem", PolicyItem, "equals", "Item");
		GuidewireAutomate_Validation("ExistingPolicy", ExistingPolicy, "equals", "Existing Policy");
		GuidewireAutomate_Validation("Preemption", Preemption, "contains", "Preemptions");
	}
	public static void PolicyReview_ChangeConflicts() throws Throwable {
		GuidewireAutomate("Change Conflicts", PR_ChangeConflicts, "clickAndwait", "click");
		GuidewireAutomate("Conflicts_OverrideAll", Conflicts_OverrideAll, "clickAndwait", "click");
		getStaleElement("Conflicts_Submit", Conflicts_Submit);
		GuidewireAutomate("Conflicts_Submit", Conflicts_Submit, "clickAndwait", "click");
		GuidewireAutomate_Handle("alertaccept", "NA");
	}

	public static void newSubmissions_Edit() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("newSubmissions", strTestCaseName);

		/*
		 * Select Producer
		 */
		GuidewireAutomate_Validation("Select Producer", PC_Account.PC_SelectProducer, "equals", "Select Producer");

		PC_Account.organizations(Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("organizations", strTestCaseName));
		PC_Account.select_SearchResult(Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("organizations", strTestCaseName));

		/*
		 * Product Offers
		 */
		GuidewireAutomate_Validation("Product Offers", PC_Account.PC_ProductOffers, "equals", "Product Offers");

		GuidewireAutomate("Single or Multiple Policies", NS_PO_SingleorMultiplePolicies, "click", lhm_TestCase_Table_Data.get("NS_PO_SingleorMultiplePolicies"));
		GuidewireAutomate("Quote Type", NS_PO_QuoteType, "selectByVisibleText", lhm_TestCase_Table_Data.get("NS_PO_QuoteType"));
		GuidewireAutomate("Default Base State", NS_PO_DefaultBaseState, "selectByVisibleText", lhm_TestCase_Table_Data.get("NS_PO_DefaultBaseState"));
		GuidewireAutomate("Default Effective Date", NS_PO_DefaultEffectiveDate, "clearAndsendKeys", lhm_TestCase_Table_Data.get("NS_PO_DefaultEffectiveDate"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}
	/*
	 * shanta
	 */
	public static void NavigateToPolicyReviewScreen() throws Throwable {
		try {
			getStaleElement("Policy Review Screen", PolicyReviewScreen);
			GuidewireAutomate("Policy Review Screen", PolicyReviewScreen, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void newSubmissions_Verify() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("newSubmissions", strTestCaseName);

		/*
		 * Select Producer
		 */
		GuidewireAutomate_Validation("Select Producer", PC_Account.PC_SelectProducer, "equals", "Select Producer");

		/*
		 * Product Offers
		 */
		GuidewireAutomate_Validation("Organization", PC_Account.CA_SP_Organization, "valueEquals", lhm_TestCase_Table_Data.get("NS_PO_Organization"));
		GuidewireAutomate_Validation("Producer Code", PC_Account.CA_SP_ProducerCode, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("NS_PO_ProducerCode"));

		GuidewireAutomate_Validation("Quote Type", NS_PO_QuoteType, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("NS_PO_QuoteType"));
		GuidewireAutomate_Validation("Default Base State", NS_PO_DefaultBaseState, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("NS_PO_DefaultBaseState"));
		GuidewireAutomate_Validation("Default Effective Date", NS_PO_DefaultEffectiveDate, "valueEquals", sdf_ddMMMyyyy_GW1.format(new Date()));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void offering() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("offering", strTestCaseName);
		getStaleElement("Screen Header", Offerings_Header);
		GuidewireAutomate_Validation("Screen Header", Offerings_Header, "equals", "Offerings");
		GuidewireAutomate("Offering Selection", Of_OfferingSelection, "selectByVisibleText", lhm_TestCase_Table_Data.get("Of_OfferingSelection"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void RiskApprovalManger() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void startPolicyChange() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("PolicyChange", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", SPC_ScreenHeader, "equals", "Start Policy Change");
		GuidewireAutomate("EffectiveDate", SPC_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PA_PC_EffectiveDate"));
		GuidewireAutomate("Description", SPC_Description, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PA_PC_Description"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void startCancellationForPolicy() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("CancelPolicy", strTestCaseName);
			getStaleElement("Screen Header", PolicyCenter_Resuables_PO.StartCancellationForPolicy_Header);
			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.StartCancellationForPolicy_Header, "contains", "Start Cancellation");
			GuidewireAutomate("Source", SCFP_Source, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CP_Source"));
			getStaleElement("Reason", SCFP_Reason);
			GuidewireAutomate("Reason", SCFP_Reason, "selectByVisibleText", lhm_TestCase_Table_Data.get("CP_Reason"));
			GuidewireAutomate("ReasonDescription", SCFP_ReasonDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CP_Reason _Description"));
			GuidewireAutomate("StartCancellation", StartCancellation_Button, "clickAndwait", "click");
			oExtentTest.log(Status.PASS, "startCancellationForPolicy is Succesful");

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "startCancellationForPolicy is not Succesful");
			e.printStackTrace();
			throw e;

		}

	}

	public static void startCancellationForLaterDate() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("CancelPolicy", strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.StartCancellationForPolicy_Header, "contains", "Start Cancellation For Policy");

			GuidewireAutomate("Source", SCFP_Source, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CP_Source"));
			getStaleElement("Reason", SCFP_Reason);
			GuidewireAutomate("Reason", SCFP_Reason, "selectByVisibleText", lhm_TestCase_Table_Data.get("CP_Reason"));
			GuidewireAutomate("ReasonDescription", SCFP_ReasonDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CP_Reason _Description"));
			getStaleElement("CancellationDate", SCFP_CancellationEffectiveDate);
			GuidewireAutomate("CancellationDate", SCFP_CancellationEffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CP_Cancellation _Effective_ Date"));
			getStaleElement("StartCancellation", StartCancellation_Button);
			GuidewireAutomate("StartCancellation", StartCancellation_Button, "clickAndwait", "click");
			getStaleElement("StartCancellation", StartCancellation_Button);
			GuidewireAutomate("StartCancellation", StartCancellation_Button, "clickAndwait", "click");
			oExtentTest.log(Status.PASS, "startCancellationForPolicy is Succesful");

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "startCancellationForPolicy is not Succesful");
			e.printStackTrace();
			throw e;

		}

	}

	public static void Confirmation() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Confirmation", strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Confirmation_Header, "equals", "Confirmation");

			GuidewireAutomate_Validation("PolicyNumber", SCFP_PolicyNumber, "equals", strPolicyNumber);
			GuidewireAutomate_Validation("Primary_Named_Insured", SCFP_PrimaryNamedInsured, "equals", lhm_TestCase_Table_Data.get("SCFP_PrimaryNamedInsured"));
			GuidewireAutomate_Validation("Address", SCFP_Address, "contains", lhm_TestCase_Table_Data.get("SCFP_Address"));
			GuidewireAutomate_Validation("County", SCFP_County, "equals", lhm_TestCase_Table_Data.get("SCFP_County"));
			GuidewireAutomate_Validation("Address Type", SCFP_AddressType, "equals", lhm_TestCase_Table_Data.get("SCFP_AddressType"));
			GuidewireAutomate_Validation("Address_Description", SCFP_AddressDescription, "contains", lhm_TestCase_Table_Data.get("SCFP_AddressDescription"));
			oExtentTest.log(Status.PASS, "Confirmation is Succesful");

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Confirmation is not Succesful");
			e.printStackTrace();
			throw e;
		}
	}

	public static void CancellationBound() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void startReinstatement_PolicyDetails() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("StartReinstatement", strTestCaseName);
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Start Reinstatement");
		GuidewireAutomate_Validation("PolicyDetails", SR_PolicyDetails, "equals", "Policy Details");
		GuidewireAutomate_Validation("TermType", SR_PD_TermType, "equals", lhm_TestCase_Table_Data.get("SRFP_TermType"));
		// GuidewireAutomate_Validation("TermNumber", SR_PD_TermNumber,
		// "equals", lhm_TestCase_Table_Data.get("SRFP_Term Number"));
		GuidewireAutomate_Validation("EffectiveDate", SR_PD_EffectiveDate, "equals", lhm_TestCase_Table_Data.get("SRFP_EffectiveDate"));
		GuidewireAutomate_Validation("ExpirationDate", SR_PD_ExpirationDate, "equals", lhm_TestCase_Table_Data.get("SRFP_ExpirationDate"));
		GuidewireAutomate_Validation("WrittenDate", SR_PD_WrittenDate, "equals", lhm_TestCase_Table_Data.get("SRFP_WrittenDate"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void renewalDataEntry() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("RenewalDataEntry", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Renewal Data Entry");
		GuidewireAutomate("Renewal Code", RDE_RenewalCode, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("Renewal Code"));
		GuidewireAutomate("ok", OK_Button, "clickAndwait", "click");
		GuidewireAutomate_Handle("alertaccept", "NA");
		GuidewireAutomate_Validation("Infobar Job", InfoBar_Job, "equals", "Renewal (Renewing)");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}
	public static void NonRenewalDataEntry() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("NonRenewalDataEntry", strTestCaseName);
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Non-Renewal Data Entry");
		GuidewireAutomate_Validation("ElementHeader", NonRenewReasonHeader, "equals", "Non-Renew Reason");
		GuidewireAutomate("NonRenewReason", NonRenewReason, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("Non-Renew Reason"));
		GuidewireAutomate_Validation("ElementHeader", NonRenewAdditionalTextHeader, "equals", "Non-Renew Additional Text");
		GuidewireAutomate("NonRenewAdditionalText", NonRenewAdditionalText, "sendKeys", lhm_TestCase_Table_Data.get("Non-Renew Additional Text"));
		GuidewireAutomate_Validation("ElementHeader", SelectedNonRenewalExplanations, "equals", "Selected Non-Renewal Explanations");
		getStaleElement("AddExplanation", AddExplanation);
		GuidewireAutomate("AddExplanation", AddExplanation, "clickAndwait", "click");
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Non-Renewal Explanations");
		GuidewireAutomate("CheckBox", SelectNonRenewalExplanations, "click", "click");
		GuidewireAutomate("Addbutton", AddButton, "clickAndwait", "click");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void startReinstatement_AffinityGroup() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("StartReinstatement", strTestCaseName);

		GuidewireAutomate_Validation("AffinityGroup", SR_AffinityGroup, "equals", "Affinity Group");
		GuidewireAutomate_Validation("ReinstatementDate", SR_AG_ReinstatementDate, "equals", lhm_TestCase_Table_Data.get("SRFP_EffectiveDateReinstatement"));
		GuidewireAutomate("ReasonCode", SR_AG_ReasonCode, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("SRFP_Reason"));
		GuidewireAutomate("ReasonDescription", SR_AG_ReasonDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SRFP_ReasonDescription"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	/*
	 * name:shanta date:28/03/2022
	 */
	public static void Submission_Declined() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("SubmissionDeclined", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", SD_SubmissionDeclined, "equals", "Submission Declined");
		GuidewireAutomate_Validation("Element Name", SD_ReasonCodeHeader, "equals", "Reason Code");
		GuidewireAutomate("ReasonCode", SD_ReasonCode, "click", "click");
		GuidewireAutomate("ReasonCode", SD_ReasonCode, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("SD_ReasonCode"));
		GuidewireAutomate("ReasonDescription", SD_ReasonText, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SD_ReasonDescription"));
		GuidewireAutomate("Decline", SD_DeclineButton, "clickAndwait", "click");
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	/*
	 * name:shanta date:28/03/2022
	 */
	public static void PC_AccountFileContacts() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("AccountFileContacts", strTestCaseName);
		getStaleElement("PC_Contact", MenuPC_Account_Contacts);
		GuidewireAutomate("PC_Contact", MenuPC_Account_Contacts, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", AccountFileContacts, "equals", "Account File Contacts");
		GuidewireAutomate("CreateNewContact", CreateNewContact, "clickAndwait", "click");
		GuidewireAutomate("NamedInsured", NamedInsured, "moveToElement", "NameedInsured");
		GuidewireAutomate("NewCompany", NewCompany, "clickAndwait", "click");
		getStaleElement("NewNamedInsured", NewNamedInsured);
		GuidewireAutomate_Validation("NewNamedInsured", NewNamedInsured, "equals", "New Named Insured");
		GuidewireAutomate_Validation("CompanyHeader", CompanyHeader, "equals", "Company");
		GuidewireAutomate("CompanyName", CompanyName, "sendKeys", lhm_TestCase_Table_Data.get("CA_CompanyName"));
		getStaleElement("Address", Address);
		GuidewireAutomate("Address", Address, "click", "click");
		getStaleElement("Account", AccountHolder);
		GuidewireAutomate("Account", AccountHolder, "moveToElement", "AccountHolder");
		GuidewireAutomate("Address", AccountHolderAddress, "clickAndwait", "click");
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	/*
	 * name:shanta date:28/03/2022
	 */
	public static void PC_ChangeAccountHolder() throws Throwable {

		GuidewireAutomate("changeAccountHolder", ChangeAccountHolder, "clickAndwait", "click");
		GuidewireAutomate("CompanyDetails", CompanyDetails, "clickAndwait", "click");

	}
	/*
	 * name:shanta date:28/03/2022
	 */
	public static void PC_ChangePolicy() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("ChangePolicy", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", StartPolicyChange, "equals", "Start Policy Change");
		getStaleElement("EffectiveDate", EffectiveDate);
		GuidewireAutomate("EffectiveDate", EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Effective Date"));
		getStaleElement("EffectiveDate", EffectiveDate);
		GuidewireAutomate("EffectiveDate", EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Effective Date"));
		GuidewireAutomate("Desctiption", Description, "sendKeys", lhm_TestCase_Table_Data.get("Description"));
		getStaleElement("Next", NextButton);
		GuidewireAutomate("Next", NextButton, "clickAndwait", "click");
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void PC_ChangePolicyPastDate() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("ChangePolicy", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", StartPolicyChange, "equals", "Start Policy Change");
		getStaleElement("EffectiveDate", EffectiveDate);
		getStaleElement("EffectiveDate", EffectiveDate);
		GuidewireAutomate("EffectiveDate", EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PolicyChange_PastDate"));
		getStaleElement("EffectiveDate", EffectiveDate);
		GuidewireAutomate("EffectiveDate", EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PolicyChange_PastDate"));
		GuidewireAutomate("Desctiption", Description, "sendKeys", lhm_TestCase_Table_Data.get("Description"));
		getStaleElement("Next", NextButton);
		GuidewireAutomate("Next", NextButton, "clickAndwait", "click");
		GuidewireAutomate_Handle("alertaccept", "NA");
		GuidewireAutomate_Validation("Out Of Sequence Error", OutOfsequenceError, "contains", "out-of-sequence ");
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	/*
	 * Name:shanta Date:31/03/2022
	 */
	public static void PolicyRenewalStart() throws Throwable {
		getStaleElement("RenewalStart", PolicyRenewalStart);
		GuidewireAutomate_Validation("RenewalStart", PolicyRenewalStart, "equals", "Policy Renewal Start");
		GuidewireAutomate("Run", RunButton, "clickAndwait", "click");
		GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
		GuidewireAutomate("ReturnToPC", ReturnToPC, "clickAndwait", "click");

	}
	/*
	 * Name:shanta Date:01/04/2022
	 */
	public static void NewNoteDetails() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("NewNote", strTestCaseName);
		GuidewireAutomate("topic", NewNoteTopic, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("NewNote_Topic"));
		GuidewireAutomate("Text", NewNoteText, "sendKeys", lhm_TestCase_Table_Data.get("NewNote_Text"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}
	/*
	 * Name:shanta Date:01/04/2022
	 */
	public static void PreRenewalDirection() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("PreRenewalDirection", strTestCaseName);
		GuidewireAutomate_Validation("DetailHeader", DetailsHeader, "equals", "Details");
		GuidewireAutomate("Direction", DirectionDetails, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("DirectionDetails"));
		getStaleElement("NonRenewalReason", NonrenewalReason);
		GuidewireAutomate("NonRenewalReason", NonrenewalReason, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("NonRenewal Reason"));
		GuidewireAutomate_Validation("Note", NoteHeader, "equals", "Note");
		GuidewireAutomate("textarea", NoteText, "sendKeys", lhm_TestCase_Table_Data.get("NoteText"));
		GuidewireAutomate_Validation("ElementHeader", SelectedNonRenewalExplanations, "equals", "Selected Non-Renewal Explanations");
		getStaleElement("AddExplanation", AddExplanation);
		GuidewireAutomate("AddExplanation", AddExplanation, "clickAndwait", "click");
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Non-Renewal Explanations");
		GuidewireAutomate("CheckBox", SelectNonRenewalExplanations, "click", "click");
		GuidewireAutomate("Addbutton", AddButton, "clickAndwait", "click");
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}
	public static LinkedHashMap<String, String> getData_PolicyCenter(String strTable) throws Throwable {

		return Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_Fillo(pTestDataFile_PolicyCenter, strTable, strTestCaseName);

	}



}
