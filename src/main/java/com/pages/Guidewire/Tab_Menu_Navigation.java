package com.pages.Guidewire;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Tab_Menu_Navigation extends SeleniumWebDriver_Commands implements Tab_Menu_Navigation_PO {

	public Tab_Menu_Navigation(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void navigate_ClaimTab() throws Throwable {

	}

	/*
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ---- PolicyCenter Tabs
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 */

	public static void pcTabNavigation(String Tab, String Value) throws Throwable {
		switch (Tab) {
			case "New Account" :
				GuidewireAutomate("Account", TabPC_Account_dd, "clickAndwait", "click");
				GuidewireAutomate("New Account", TabPC_Account_NewAccount, "clickAndwait", "click");
				break;
			case "Acct Search" :
				GuidewireAutomate("Account", TabPC_Account_dd, "clickAndwait", "click");
				GuidewireAutomate("Account Number", TabPC_Account_AccountNumber, "sendKeys", Value);
				GuidewireAutomate("Account Search", TabPC_Account_AccountNumberSearch, "clickAndwait", "click");
				break;

			case "New Submission" :
				GuidewireAutomate("Policy Tab", TabPC_Policy_dd, "clickAndwait", "click");
				GuidewireAutomate("New Submission", TabPC_Policy_NewSubmission, "clickAndwait", "click");
				GuidewireAutomate_waitForElement(Screen_Header, "visibilityOf", "true");
				Assert.assertEquals(getText_Element(Screen_Header), "New Submissions");
				break;
			case "Sub Search" :
				GuidewireAutomate("Policy", TabPC_Policy_dd, "clickAndwait", "click");
				GuidewireAutomate("Sub Number", TabPC_Policy_SubNumber, "sendKeys", Value);
				GuidewireAutomate("Sub Search", TabPC_Policy_SubNumber_Search, "clickAndwait", "click");
				break;
			case "Policy Search" :
				GuidewireAutomate("Policy", TabPC_Policy_dd, "clickAndwait", "click");
				GuidewireAutomate("Policy Number", TabPC_Policy_PolicyNumber, "sendKeys", Value);
				getStaleElement("Policy Search", TabPC_Policy_PolicyNumber_Search);
				GuidewireAutomate("Policy Search", TabPC_Policy_PolicyNumber_Search, "clickAndwait", "click");
				break;

			case "Policy Search By Fetching" :
				GuidewireAutomate("Policy", TabPC_Policy_dd, "clickAndwait", "click");
				getStaleElement("Policy Number", TabPC_Policy_PolicyNumber);
				GuidewireAutomate("Policy Number", TabPC_Policy_PolicyNumber, "sendKeys", strPolicyNumber);
				GuidewireAutomate("Policy Search", TabPC_Policy_PolicyNumber_Search, "clickAndwait", "click");
				break;

			case "New Person" :
				GuidewireAutomate("Contacts Tab", TabPC_Contact_dd, "clickAndwait", "click");
				GuidewireAutomate("New Contact", TabPC_Contact_NewContact, "moveToElement", "Null");
				GuidewireAutomate("New Person", TabPC_Contact_NewContact_Person, "clickAndwait", "click");
				break;
			case "New Company" :
				GuidewireAutomate("Contacts Tab", TabPC_Contact_dd, "clickAndwait", "click");
				GuidewireAutomate("New Contact", TabPC_Contact_NewContact, "moveToElement", "Null");
				GuidewireAutomate("New Company", TabPC_Contact_NewContact_Company, "clickAndwait", "click");
				break;
			case "Contact Search" :
				GuidewireAutomate("Contacts Tab", TabPC_Contact_dd, "clickAndwait", "click");
				GuidewireAutomate("New Contact", TabPC_Contact_NewContact_Search, "clickAndwait", "click");
				break;

			case "Policies" :
				GuidewireAutomate("SearchTab", TabPC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("SearchTab_Policies", TabPC_Search_Policies, "clickAndwait", "click");
				break;
			case "Accounts" :
				GuidewireAutomate("SearchTab", TabPC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("SearchTab_Accounts", TabPC_Search_Accounts, "clickAndwait", "click");
				break;
			case "Producer Codes" :
				GuidewireAutomate("SearchTab", TabPC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("SearchTab_ProducerCodes", TabPC_Search_ProducerCodes, "clickAndwait", "click");
				break;
			case "Activities" :
				GuidewireAutomate("SearchTab", TabPC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("SearchTab_Activities", TabPC_Search_Activities, "clickAndwait", "click");
				break;
			case "Contacts" :
				GuidewireAutomate("SearchTab", TabPC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("SearchTab_Contacts", TabPC_Search_Contacts, "clickAndwait", "click");
				break;

			case "Team" :
				GuidewireAutomate("AdministrationTab", TabPC_Team, "clickAndwait", "click");
				break;
			/*
			 * ownerName:shanta date:28/03/2022
			 */
			case "Account" :
				GuidewireAutomate("AccountTab", Tab_Account, "clickAndwait", "click");

			default :
				throw new IOException("No support for Tab : " + Tab);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to PolicyCenter Tab : " + Tab + " is Succesful");
	}
	/*
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ---- PolicyCenter menu
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 */

	public static void pcMenuNavigation(String Menu) throws Throwable {
		switch (Menu) {
			case "New Account" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewAccount", MenuPC_Desktop_Actions_Create_NewAccount, "clickAndwait", "click");
				GuidewireAutomate_waitForElement(EnterAccountInformation, "visibilityOf", "true");
				Assert.assertEquals(getText_Element(EnterAccountInformation), "Enter Account Information");
				break;
			case "New Submission Desktop" :
				GuidewireAutomate_Validation("Account Summary", AccountSummary_Name, "contains", "Account Summary");
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewSubmission", MenuPC_Desktop_Actions_Create_NewSubmission, "clickAndwait", "click");
				GuidewireAutomate_waitForElement(NewSubmission_Header, "visibilityOf", "true");
				Assert.assertEquals(getText_Element(NewSubmission_Header), "New Submissions");
				break;
			case "Summary" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Summary", MenuPC_Desktop_Summary, "clickAndwait", "click");
				break;
			case "My Activities" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("My Activities", MenuPC_Desktop_MyActivities, "clickAndwait", "click");
				break;
			case "My Accounts" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("My Accounts", MenuPC_Desktop_MyAccounts, "clickAndwait", "click");
				break;
			case "My Submissions" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("My Submissions", MenuPC_Desktop_MySubmissions, "clickAndwait", "click");
				break;
			case "My Renewals" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("My Renewals", MenuPC_Desktop_MyRenewals, "clickAndwait", "click");
				break;
			case "Other Policy Transactions" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("OtherPolicyTransactions", MenuPC_Desktop_OtherPolicyTransactions, "clickAndwait", "click");
				break;
			case "My Queues" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("My Queues", MenuPC_Desktop_MyQueues, "clickAndwait", "click");
				break;

			case "New Note" :
				getStaleElement("Actions", Menu_Actions);
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New_Note", MenuPC_Account_Actions_Create_NewNote, "clickAndwait", "click");
				break;
			case "New Document" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New_Document", MenuPC_Account_Actions_Create_NewDocument, "clickAndwait", "click");
				break;
			case "New Email" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New_Email", MenuPC_Account_Actions_Create_NewEmail, "clickAndwait", "click");
				break;
			case "New Activity" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New_Activity", MenuPC_Account_Actions_Create_NewActivity, "clickAndwait", "click");
				break;
			case "New Submission" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New_Activity", MenuPC_Account_Actions_Create_NewSubmission, "clickAndwait", "click");
				break;
			case "Move Policies to this Account" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Move_Policies_to_this_Account", MenuPC_Account_Actions_MovePoliciesToThisAccount, "clickAndwait", "click");
				break;
			case "Rewrite Policires to this Account" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Rewrite_Policires_to_this_Account", MenuPC_Account_Actions_RewritePoliciesToThisAccount, "clickAndwait", "click");
				break;
			case "Merge Account into this Account" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Merge_Account_into_this_Account", MenuPC_Account_Actions_MergeAccountIntoThisAccount, "clickAndwait", "click");
				break;

			case "Account File" :
				break;
			case "Policy File" :
				break;
			case "Pre Renewal Direction" :
				getStaleElement("Actions", Menu_Actions);
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("PreRenewalDirection", PreRenewalDirection, "clickAndwait", "click");

				break;
			case "Spin-off Policy from this One" :
				break;
			case "Split Policy into Two" :
				break;
			case "Issue Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Issue Policy", MenuPC_Actions_Policy_NewPolicyTransaction_IssuePolicy, "clickAndwait", "click");
				break;
			case "Change Policy" :
				getStaleElement("Actions", Menu_Actions);
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Change Policy", MenuPC_Actions_Policy_NewPolicyTransaction_ChangePolicy, "click", "click");
				break;
			case "Cancel Policy" :
				getStaleElement("Actions", Menu_Actions);
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Cancel Policy", MenuPC_Actions_Policy_NewPolicyTransaction_CancelPolicy, "click", "click");
				break;
			case "Renew Policy" :
				getStaleElement("Actions", Menu_Actions);
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Renew Policy", MenuPC_Actions_Policy_NewPolicyTransaction_RenewPolicy, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Reinstate Policy" :
				getStaleElement("Actions", Menu_Actions);
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Reinstate Policy", MenuPC_Actions_Policy_NewPolicyTransaction_ReinstatePolicy, "click", "click");
				break;
			case "Rewrite Full Term" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Rewrite Full Term", MenuPC_Actions_Policy_NewPolicyTransaction_RewriteFullTerm, "click", "click");
				break;
			case "Rewrite Remainder of Term" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Rewrite Remainder of Term", MenuPC_Actions_Policy_NewPolicyTransaction_RewriteRemainderOfTerm, "clickAndwait", "click");
				break;
			case "Rewrite New Term" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Rewrite New Term", MenuPC_Actions_Policy_NewPolicyTransaction_RewriteNewTerm, "click", "click");
				break;
			case "Rescind Cancellation" :
				break;
			case "EnableorDisable" :
				break;
			case "Copy Submission" :
				getStaleElement("Actions", Menu_Actions);
				getStaleElement("Actions", Menu_Actions);
				getStaleElement("Actions", Menu_Actions);
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("copysubmission", MenuPC_Actions_Policy_NewPolicyTransaction_Copysubmission, "click", "click");
				break;
			default :
				throw new IOException("No support for Menu : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to PolicyCenter Menu : " + Menu + " is Succesful");
	}

}
