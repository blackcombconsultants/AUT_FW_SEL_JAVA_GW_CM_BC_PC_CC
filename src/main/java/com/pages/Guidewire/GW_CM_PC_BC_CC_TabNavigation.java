package com.pages.Guidewire;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class GW_CM_PC_BC_CC_TabNavigation extends SeleniumWebDriver_Commands implements GW_CM_PC_BC_CC_TabNavigation_PO {

	public GW_CM_PC_BC_CC_TabNavigation(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void navigate_ClaimTab() throws Throwable {

	}
	/*
	 * --------------------------------------------------------------
	 * menuNavigation
	 * --------------------------------------------------------------
	 */

	public static void gwContactManagement_TabNavigation(String Tab, String Value) throws Throwable {
		switch (Tab) {

			case "x" :
				break;

			case "y" :
				break;

			case "z" :
				break;

			default :
				throw new IOException("No support for Tab : " + Tab);
		}

		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to " + Tab + " is succesful");

	}

	public static void gwContactManagement_MenuNavigation(String Menu) throws Throwable {
		switch (Menu) {

			case "x" :
				break;

			case "y" :
				break;

			case "z" :
				break;

			default :
				throw new IOException("No support for Menu : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to " + Menu + " is succesful");
	}

	/*
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ---- PolicyCenter Tabs
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 */

	public static void pcTabNavigation(String Tab, String Value) throws Throwable {
		switch (Tab) {
			case "New Account" :
				GuidewireAutomate("Account", TabPC_Account_dd, "click", "Null");
				GuidewireAutomate("New Account", TabPC_Account_NewAccount, "click", "Null");
				GuidewireAutomate_Validation("Enter Account Information", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Enter Account Information");
				break;
			case "Acct Search" :
				GuidewireAutomate("Account", TabPC_Account_dd, "click", "Null");
				GuidewireAutomate("Account Number", TabPC_Account_AccountNumber, "sendKeys", Value);
				GuidewireAutomate("Account Search", TabPC_Account_AccountNumberSearch, "clickAndwait", "Null");
				break;

			case "New Submission" :
				GuidewireAutomate("Policy Tab", TabPC_Policy_dd, "click", "Null");
				GuidewireAutomate("New Submission", TabPC_Policy_NewSubmission, "click", "Null");
				GuidewireAutomate_waitForElement(Screen_Header, "visibilityOf", "true");
				Assert.assertEquals(getText_Element(Screen_Header), "New Submissions");
				break;
			case "Sub Search" :
				GuidewireAutomate("Policy", TabPC_Policy_dd, "click", "Null");
				GuidewireAutomate("Sub Number", TabPC_Policy_SubNumber, "sendKeys", Value);
				GuidewireAutomate("Sub Search", TabPC_Policy_SubNumber_Search, "clickAndwait", "Null");
				break;
			case "Policy Search" :
				GuidewireAutomate("Policy", TabPC_Policy_dd, "click", "Null");
				GuidewireAutomate("Sub Number", TabPC_Policy_PolicyNumber, "sendKeys", Value);
				GuidewireAutomate("Sub Search", TabPC_Policy_PolicyNumber_Search, "clickAndwait", "Null");
				break;
			case "New Person" :
				GuidewireAutomate("Contacts Tab", TabPC_Contact_dd, "click", "Null");
				GuidewireAutomate("New Contact", TabPC_Contact_NewContact, "moveToElement", "Null");
				GuidewireAutomate("New Person", TabPC_Contact_NewContact_Person, "click", "Null");
				break;
			case "New Company" :
				GuidewireAutomate("Contacts Tab", TabPC_Contact_dd, "click", "Null");
				GuidewireAutomate("New Contact", TabPC_Contact_NewContact, "moveToElement", "Null");
				GuidewireAutomate("New Company", TabPC_Contact_NewContact_Company, "click", "Null");
				break;
			case "Contact Search" :
				GuidewireAutomate("Contacts Tab", TabPC_Contact_dd, "click", "Null");
				GuidewireAutomate("New Contact", TabPC_Contact_NewContact_Search, "click", "Null");
				break;

			case "Policies" :
				GuidewireAutomate("SearchTab", TabPC_Search_dd, "click", "Null");
				GuidewireAutomate("SearchTab_Policies", TabPC_Search_Policies, "click", "Null");
				break;
			case "Accounts" :
				GuidewireAutomate("SearchTab", TabPC_Search_dd, "click", "Null");
				GuidewireAutomate("SearchTab_Accounts", TabPC_Search_Accounts, "click", "Null");
				break;
			case "Producer Codes" :
				GuidewireAutomate("SearchTab", TabPC_Search_dd, "click", "Null");
				GuidewireAutomate("SearchTab_ProducerCodes", TabPC_Search_ProducerCodes, "click", "Null");
				break;
			case "Activities" :
				GuidewireAutomate("SearchTab", TabPC_Search_dd, "click", "Null");
				GuidewireAutomate("SearchTab_Activities", TabPC_Search_Activities, "click", "Null");
				break;
			case "Contacts" :
				GuidewireAutomate("SearchTab", TabPC_Search_dd, "click", "Null");
				GuidewireAutomate("SearchTab_Contacts", TabPC_Search_Contacts, "click", "Null");
				break;

			case "Team" :
				GuidewireAutomate("AdministrationTab", TabPC_Team, "click", "Null");
				break;

			case "Users_and_Security" :
				GuidewireAutomate("AdministrationTab", TabPC_Administration_dd, "click", "Null");
				GuidewireAutomate("Users_and_Security", TabPC_Administration_UsersSecurity, "click", "Null");
				break;
			case "Business Settings" :
				GuidewireAutomate("AdministrationTab", TabPC_Administration_dd, "click", "Null");
				GuidewireAutomate("Business_Settings", TabPC_Administration_BusinessSettings, "click", "Null");
				break;
			case "Monitoring" :
				GuidewireAutomate("AdministrationTab", TabPC_Administration_dd, "click", "Null");
				GuidewireAutomate("Monitoring", TabPC_Administration_Monitoring, "click", "Null");
				break;
			case "Utilities" :
				GuidewireAutomate("AdministrationTab", TabPC_Administration_dd, "click", "Null");
				GuidewireAutomate("Utilities", TabPC_Administration_Utilities, "click", "Null");
				break;

			default :
				throw new IOException("No support for Tab : " + Tab);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to " + Tab + " is succesful");
	}
	/*
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ---- PolicyCenter menu
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 */

	public static void pcMenuNavigation(String Menu) throws Throwable {
		switch (Menu) {
			case "New Account" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewAccount", MenuPC_Desktop_Actions_Create_NewAccount, "click", "Null");
				GuidewireAutomate_waitForElement(EnterAccountInformation, "visibilityOf", "true");
				Assert.assertEquals(getText_Element(EnterAccountInformation), "Enter Account Information");
				break;
			case "New Submission Desktop" :
				GuidewireAutomate_Validation("Account Summary", AccountSummary_Name, "contains", "Account Summary");
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewSubmission", MenuPC_Desktop_Actions_Create_NewSubmission, "click", "");
				GuidewireAutomate_waitForElement(NewSubmission_Header, "visibilityOf", "true");
				Assert.assertEquals(getText_Element(NewSubmission_Header), "New Submissions");
				break;
			case "Summary" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Summary", MenuPC_Desktop_Summary, "click", "");
				break;
			case "My Activities" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("My Activities", MenuPC_Desktop_MyActivities, "click", "");
				break;
			case "My Accounts" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("My Accounts", MenuPC_Desktop_MyAccounts, "click", "");
				break;
			case "My Submissions" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("My Submissions", MenuPC_Desktop_MySubmissions, "click", "");
				break;
			case "My Renewals" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("My Renewals", MenuPC_Desktop_MyRenewals, "click", "");
				break;
			case "Other Policy Transactions" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("OtherPolicyTransactions", MenuPC_Desktop_OtherPolicyTransactions, "click", "");
				break;
			case "My Queues" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("My Queues", MenuPC_Desktop_MyQueues, "click", "");
				break;

			case "New Note" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New_Note", MenuPC_Account_Actions_Create_NewNote, "click", "");
				break;
			case "New Document" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New_Document", MenuPC_Account_Actions_Create_NewDocument, "click", "");
				break;
			case "New Email" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New_Email", MenuPC_Account_Actions_Create_NewEmail, "click", "");
				break;
			case "New Activity" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New_Activity", MenuPC_Account_Actions_Create_NewActivity, "click", "");
				break;
			case "New Submission" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New_Activity", MenuPC_Account_Actions_Create_NewSubmission, "click", "");
				break;
			case "Move Policies to this Account" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Move_Policies_to_this_Account", MenuPC_Account_Actions_MovePoliciesToThisAccount, "click", "");
				break;
			case "Rewrite Policires to this Account" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Rewrite_Policires_to_this_Account", MenuPC_Account_Actions_RewritePoliciesToThisAccount, "click", "");
				break;
			case "Merge Account into this Account" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Merge_Account_into_this_Account", MenuPC_Account_Actions_MergeAccountIntoThisAccount, "click", "");
				break;

			case "Account File" :
				break;
			case "Policy File" :
				break;
			case "Pre Renewal Direction" :
				break;
			case "Spin-off Policy from this One" :
				break;
			case "Split Policy into Two" :
				break;
			case "Issue Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Issue Policy", MenuPC_Actions_Policy_NewPolicyTransaction_IssuePolicy, "click", "");
				break;
			case "Change Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Change Policy", MenuPC_Actions_Policy_NewPolicyTransaction_ChangePolicy, "click", "");
				break;
			case "Cancel Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Cancel Policy", MenuPC_Actions_Policy_NewPolicyTransaction_CancelPolicy, "click", "");
				break;
			case "Renew Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Renew Policy", MenuPC_Actions_Policy_NewPolicyTransaction_RenewPolicy, "click", "");
				GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Reinstate Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Reinstate Policy", MenuPC_Actions_Policy_NewPolicyTransaction_ReinstatePolicy, "click", "");
				break;
			case "Rewrite Full Term" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Rewrite Full Term", MenuPC_Actions_Policy_NewPolicyTransaction_RewriteFullTerm, "click", "");
				break;
			case "Rewrite Remainder of Term" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Rewrite Remainder of Term", MenuPC_Actions_Policy_NewPolicyTransaction_RewriteRemainderOfTerm, "click", "");
				break;
			case "Rewrite New Term" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Rewrite New Term", MenuPC_Actions_Policy_NewPolicyTransaction_RewriteNewTerm, "click", "");
				break;
			case "Rescind Cancellation" :
				break;
			case "EnableorDisable" :
				break;
			case "Copy Submission" :

				break;
			default :
				throw new IOException("No support for Menu : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to " + Menu + " is succesful");
	}

	/*
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ---- BillingCenter Tabs
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 */

	public static void bcTabNavigation(String Tab, String Value) throws Throwable {

		switch (Tab) {

			case "My Activities" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "");
				GuidewireAutomate("MyActivities", TabBC_Desktop_MyActivities, "click", "");
				break;
			case "My Approval Requests" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "");
				GuidewireAutomate("MyApprovalRequests", TabBC_Desktop_MyApprovalRequests, "click", "");
				break;
			case "My Trouble Tickets" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "");
				GuidewireAutomate("MyTroubleTickets", TabBC_Desktop_MyTroubleTickets, "click", "");
				break;
			case "My Delinquencies" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "");
				GuidewireAutomate("MyDelinquencies", TabBC_Desktop_MyDelinquencies, "click", "");
				break;
			case "Disbursements" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "");
				GuidewireAutomate("Disbursements", TabBC_Desktop_Disbursements, "click", "");
				break;
			case "Suspense Payments" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "");
				GuidewireAutomate("SuspensePayments", TabBC_Desktop_SuspensePayments, "click", "");
				break;
			case "My Agency Items" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "");
				GuidewireAutomate("MyAgencyItems", TabBC_Desktop_MyAgencyItems, "click", "");
				break;
			case "Held Charges" :
				GuidewireAutomate("Actions", TabBC_Desktop_dd, "click", "");
				GuidewireAutomate("HeldCharges", TabBC_Desktop_HeldCharges, "click", "");
				break;

			case "New Account" :
				GuidewireAutomate("Account", TabBC_Account, "click", "Null");
				GuidewireAutomate("NewAccount", MenuBC_Actions_NewAccount, "click", "Null");
				break;
			case "Acct Search" :
				GuidewireAutomate("Account Tab", TabBC_Account_dd, "click", "Null");
				GuidewireAutomate("Account Number", TabBC_Account_AccountNumber, "clearANDsendKeys", "Null");
				GuidewireAutomate("AccountNumberSearch", TabBC_Account_AccountNumber_Search, "click", "Null");
				break;

			case "Policy Search" :
				GuidewireAutomate("Policy Tab", TabBC_Policy_dd, "click", "Null");
				GuidewireAutomate("Account Number", TabBC_Policy_PolicyNumber, "clearANDsendKeys", "Null");
				GuidewireAutomate("AccountNumberSearch", TabBC_Policy_PolicyNumber_Search, "click", "Null");
				break;

			case "Producer Search" :
				GuidewireAutomate("Producer Tab", TabBC_Producer_dd, "click", "Null");
				GuidewireAutomate("Producer Name", TabBC_Producer_ProducerName, "clearANDsendKeys", "Null");
				GuidewireAutomate("ProducerName Search", TabBC_Producer_ProducerNameSearch, "click", "Null");
				break;

			/*
			 * Search
			 */
			case "Search Accounts" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Accounts", TabBC_Search_Accounts, "click", "Null");
			case "Search Policies" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Policies", TabBC_Search_Policies, "click", "Null");
				break;
			case "Search Contacts" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Contacts", TabBC_Search_Contacts, "click", "Null");
				break;
			case "Search Invoices" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Invoices", TabBC_Search_Invoices, "click", "Null");
				break;
			case "Search Payments" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Payments", TabBC_Search_Payments, "click", "Null");
				break;
			case "Search Producers" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Producers", TabBC_Search_Producers, "click", "Null");
				break;
			case "Search Transactions" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Transactions", TabBC_Search_Transactions, "click", "Null");
				break;
			case "Search Activities" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Activities", TabBC_Search_Activities, "click", "Null");
				break;
			case "Search Trouble Tickets" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search TroubleTickets", TabBC_Search_TroubleTickets, "click", "Null");
				break;
			case "Search Delinquency Processes" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search DelinquencyProcesses", TabBC_Search_DelinquencyProcesses, "click", "Null");
				break;
			case "Search Disbursements" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Disbursements", TabBC_Search_Disbursements, "click", "Null");
				break;
			case "Search Outgoing Producer Payments" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search OutgoingProducerPayments", TabBC_Search_OutgoingProducerPayments, "click", "Null");
				break;
			case "Search Payment Requests" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search PaymentRequests", TabBC_Search_PaymentRequests, "click", "Null");
				break;
			case "Search Direct Bill Suspense Items " :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "Null");
				GuidewireAutomate("Search DirectBillSuspenseItem", TabBC_Search_DirectBillSuspenseItems, "click", "Null");
				break;

			/*
			 * AdministrationTab
			 */
			case "Users_and_Security" :
				GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "click", "Null");
				GuidewireAutomate("Users_and_Security", TabBC_Administration_UsersAndSecurity, "click", "Null");
				break;
			case "Business Settings" :
				GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "click", "Null");
				GuidewireAutomate("Business_Settings", TabBC_Administration_BusinessSettings, "click", "Null");
				break;
			case "Monitoring" :
				GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "click", "Null");
				GuidewireAutomate("Monitoring", TabBC_Administration_Monitoring, "click", "Null");
				break;
			case "Utilities" :
				GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "click", "Null");
				GuidewireAutomate("Utilities", TabBC_Administration_Utilities, "click", "Null");
				break;

			default :
				throw new IOException("No support for Tab : " + Tab);
		}

		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to " + Tab + " is succesful");

	}

	/*
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ---- BillingCenter menu
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 */

	public static void bcMenuNavigation(String Menu) throws Throwable {
		switch (Menu) {

			case "My Activities" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "");
				GuidewireAutomate("New Payment", MenuBC_Desktop_MyActivities, "click", "");
				break;

			case "New Assigned Activity" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "");
				GuidewireAutomate("New Payment", MenuBC_Desktop_Actions_NewAssignedActivity, "click", "");
				break;
			case "New Shared Activity" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Shared Activity", MenuBC_Desktop_Actions_NewSharedActivity, "click", "");
				break;
			case "Preferences" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Preferences", MenuBC_Desktop_Actions_Preferences, "click", "");
				break;

			case "New Account" :
				GuidewireAutomate("Account Tab", TabBC_Account, "clickAndwait", "");
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "");
				GuidewireAutomate("New Account", MenuBC_Actions_NewAccount, "clickAndwait", "");
				break;
			case "Accounts" :
				GuidewireAutomate("Account Tab", TabBC_Account, "clickAndwait", "");
				GuidewireAutomate("New Account", MenuBC_Accounts, "clickAndwait", "");
				break;

			case "Add Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "");
				GuidewireAutomate("Add Policy", MenuBC_Account_Actions_AddPolicy, "click", "");
				break;
			case "New Payment" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "");
				GuidewireAutomate("New Payment", MenuBC_Account_Actions_NewPayment, "click", "");
				break;
			case "New Transaction" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Transaction", MenuBC_Account_Actions_NewTransaction, "click", "");
				break;
			case "Transfer Policies " :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "");
				GuidewireAutomate("Transfer Policies", MenuBC_Account_Actions_TransferPolicies, "click", "");
				break;
			case "New Note" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Note", MenuBC_Account_Actions_NewNote, "click", "");
				break;
			case "New Document" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Document", MenuBC_Account_Actions_NewDocument, "click", "");
				break;
			case "New Email" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Email", MenuBC_Account_Actions_NewEmail, "click", "");
				break;
			/*
			 * Account Menu Links
			 */
			case "Summary" :
				GuidewireAutomate("Summary", MenuBC_Account_Summary, "click", "");
				break;
			case "Details" :
				GuidewireAutomate("Details", MenuBC_Account_Details, "click", "");
				break;
			case "Contacts" :
				GuidewireAutomate("Contacts", MenuBC_Account_Contacts, "click", "");
				break;
			case "Funds Tracking" :
				GuidewireAutomate("Funds Tracking", MenuBC_Account_FundsTracking, "click", "");
				break;
			case "Payments" :
				GuidewireAutomate("Payments", MenuBC_Account_Payments, "click", "");
				break;
			case "Charges" :
				GuidewireAutomate("New Email", MenuBC_Account_Charges, "click", "");
				break;
			case "Disbursements" :
				GuidewireAutomate("New Email", MenuBC_Account_Disbursements, "click", "");
				break;
			case "Transactions" :
				GuidewireAutomate("New Email", MenuBC_Account_Transactions, "click", "");
				break;
			case "Collateral" :
				GuidewireAutomate("New Email", MenuBC_Account_Collateral, "click", "");
				break;
			case "Policies" :
				GuidewireAutomate("New Email", MenuBC_Account_Policies, "click", "");
				break;
			case "History" :
				GuidewireAutomate("New Email", MenuBC_Account_History, "click", "");
				break;
			case "Evaluation" :
				GuidewireAutomate("New Email", MenuBC_Account_Evaluation, "click", "");
				break;
			case "Invoices" :
				GuidewireAutomate("Invoices", MenuBC_Account_Invoices, "click", "");
				break;
			case "Invoice Streams" :
				GuidewireAutomate("Invoice Streams", MenuBC_Account_InvoiceStreams, "click", "");
				break;
			case "TroubleTickets" :
				GuidewireAutomate("TroubleTickets", MenuBC_Account_TroubleTickets, "click", "");
				break;
			case "Documents" :
				GuidewireAutomate("Documents", MenuBC_Account_Documents, "click", "");
				break;
			case "Ledger" :
				GuidewireAutomate("Ledger", MenuBC_Account_Ledger, "click", "");
				break;
			case "Journal" :
				GuidewireAutomate("Journal", MenuBC_Account_Journal, "click", "");
				break;
			case "Delinquencies" :
				GuidewireAutomate("Delinquencies", MenuBC_Account_Delinquencies, "click", "");
				break;
			/*
			 * Policy
			 */
			case "Change Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Change Policy", MenuBC_Policy_Actions_ChangePolicy, "click", "");
				break;
			case "Renew Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Renew Policy", MenuBC_Policy_Actions_RenewPolicy, "click", "");
				break;

			case "Payment Schedule" :
				GuidewireAutomate("Payment Schedule", MenuBC_Policy_PaymentSchedule, "click", "");
				break;

			/*
			 * Producer
			 */
			case "New Producer" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Producer", TabBC_Producer_Actions_NewProducer, "click", "");
				break;

			case "New Comm Payment" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Comm Payment", MenuBC_Producer_Actions_NewCommPayment, "click", "");
				break;
			case "Commission Write-Off" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Commission Write-Off", MenuBC_Producer_Actions_CommissionWriteOff, "click", "");
				break;
			case "Commission Recovery Write-Off" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Commission Recovery Write-Off", MenuBC_Producer_Actions_CommissionRecoveryWriteOff, "click", "");
				break;
			case "Return Commission" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Return Commission", MenuBC_Producer_Actions_ReturnCommission, "click", "");
				break;
			case "New Agency Bill Payment" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Agency Bill Payment", MenuBC_Producer_Actions_NewAgencyBillPayment, "click", "");
				break;
			case "Transfer Funds" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Transfer Funds", MenuBC_Producer_Actions_TransferFunds, "click", "");
				break;
			case "Write-Off" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Write-Off", MenuBC_Producer_Actions_WriteOff, "click", "");
				break;
			case "Negative Write-Off" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Negative Write-Off", MenuBC_Producer_Actions_NegativeWriteOff, "click", "");
				break;

			case "Direct Bill Commission Statements" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Negative Write-Off", MenuBC_Producer_DirectBillCommissionStatements, "click", "");
				break;
			case "Agency Bill Disbursements" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Negative Write-Off", MenuBC_Producer_AgencyBillDisbursements, "click", "");
				break;

			/*
			 * Administration
			 */
			case "New Billing Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewBillingPlan", MenuBC_Administration_Actions_NewBillingPlan, "click", "");
				break;
			case "New Payment Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewPaymentPlan", MenuBC_Administration_Actions_NewPaymentPlan, "click", "");
				break;
			case "New Commission Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewCommissionPlan", MenuBC_Administration_Actions_NewCommissionPlan, "click", "");
				break;
			case "New Delinquency Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewDelinquencyPlan", MenuBC_Administration_Actions_NewDelinquencyPlan, "click", "");
				break;
			case "New Agency Bill Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewAgencyBillPlan", MenuBC_Administration_Actions_NewAgencyBillPlan, "click", "");
				break;
			case "New Return Premium Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewReturnPremiumPlan", MenuBC_Administration_Actions_NewReturnPremiumPlan, "click", "");
				break;
			case "New Payment Allocation Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewPaymentAllocationPlan", MenuBC_Administration_Actions_NewPaymentAllocationPlan, "click", "");
				break;
			case "New Collection Agency" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewCollectionAgency", MenuBC_Administration_Actions_NewCollectionAgency, "click", "");
				break;
			case "New Charge Pattern" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewChargePattern", MenuBC_Administration_Actions_NewChargePattern, "click", "");
				break;
			case "New User" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewUser", MenuBC_Administration_Actions_NewUser, "click", "");
				break;
			case "New Role" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewRole", MenuBC_Administration_Actions_NewRole, "click", "");
				break;
			case "New Group" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewGroup", MenuBC_Administration_Actions_NewGroup, "click", "");
				break;
			case "New Authority Limit Profile" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Actions_NewAuthorityLimitProfile, "click", "");
				break;
			/*
			 * Menu Links
			 */
			case "Users Security" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_UsersAndSecurity, "click", "");
				break;
			case "Users" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_UsersAndSecurity_Users, "click", "");
				break;
			case "Business Settings" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_BusinessSettings, "click", "");
				break;
			case "Activity Patterns" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_BusinessSettings_ActivityPatterns, "click", "");
				break;
			case "Monitoring" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Monitoring, "click", "");
				break;
			case "Message Queues" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Monitoring_MessageQueues, "click", "");
				break;
			case "Utilities" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Utilities, "click", "");
				break;
			case "Import Data" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Utilities_ImportData, "click", "");
				break;
			default :
				throw new IOException("No support for Tab : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to " + Menu + " is succesful");

	}

	/*
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ---- ClaimsCenter
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 */
	public static void ccTabNavigation(String Tab, String Value) throws Throwable {

		switch (Tab) {

			/*
			 * Desktop
			 */
			case "Desktop" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop, "click", "Null");
				break;
			case "Activities" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "Null");
				GuidewireAutomate("Activities", TabCC_Desktop_Activities, "click", "Null");
				break;
			case "Claims" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "Null");
				GuidewireAutomate("Claims", TabCC_Desktop_Claims, "click", "Null");
				break;
			case "Subrogations" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "Null");
				GuidewireAutomate("Subrogations", TabCC_Desktop_Subrogations, "click", "Null");
				break;
			case "Exposures" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "Null");
				GuidewireAutomate("Exposures", TabCC_Desktop_Exposures, "click", "Null");
				break;
			case "Pending Assignments" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "Null");
				GuidewireAutomate("PendingAssignments", TabCC_Desktop_PendingAssignments, "click", "Null");
				break;
			case "Queues" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "Null");
				GuidewireAutomate("Queues", TabCC_Desktop_Queues, "click", "Null");
				break;
			case "Calendar" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "Null");
				GuidewireAutomate("Calendar", TabCC_Desktop_Calendar, "click", "Null");
				break;
			case "Bulk Invoices" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "Null");
				GuidewireAutomate("BulkInvoices", TabCC_Desktop_BulkInvoices, "click", "Null");
				break;
			/*
			 * Claims
			 */
			case "Claim" :
				GuidewireAutomate("Claim Tab", TabCC_Claim, "click", "Null");
				break;
			case "New Claim" :
				GuidewireAutomate("Claims Tab", TabCC_Claim_dd, "click", "Null");
				GuidewireAutomate("New Claim", TabCC_Claim_NewClaim, "click", "Null");
				break;
			case "Claim Search" :
				GuidewireAutomate("Claims Tab", TabCC_Claim_dd, "click", "Null");
				GuidewireAutomate("Claim Number", TabCC_Claim_ClaimNumber, "clearANDsendKeys", "Null");
				GuidewireAutomate("Claim Number Search", TabCC_Claim_ClaimNumber_Search, "click", "Null");
				break;
			/*
			 * Search
			 */
			case "Search" :
				GuidewireAutomate("Claim Tab", TabCC_Search, "click", "Null");
				break;
			case "Search Claims" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Claims", TabCC_Search_Claims, "click", "Null");
				break;
			case "Search Activities" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Activities", TabCC_Search_Activities, "click", "Null");
				break;
			case "Search Checks" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Checks", TabCC_Search_Checks, "click", "Null");
				break;
			case "Search Recoveries" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Recoveries", TabCC_Search_Recoveries, "click", "Null");
				break;
			case "Search Bulk Invoices" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "click", "Null");
				GuidewireAutomate("Search Bulk Invoices", TabCC_Search_BulkInvoices, "click", "Null");
				break;

			default :
				throw new IOException("No support for Tab : " + Tab);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to " + Tab + " is succesful");
	}

	public static void ccMenuNavigation(String Menu) throws Throwable {

		/*
		 * Actions
		 */
		switch (Menu) {
			case "Statistics" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Statistics", MenuCC_Desktop_Actions_Statistics, "click", "");
				break;
			case "Preferences" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Preferences", MenuCC_Desktop_Actions_Preferences, "click", "");
				break;
			case "VacationStatus" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("VacationStatus", MenuCC_Desktop_Actions_VacationStatus, "click", "");
				break;
			case "New Note" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Note", MenuCC_Claim_Actions_NewNote, "click", "");
				break;
			case "New Email" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Email", MenuCC_Claim_Actions_New_Email, "click", "");
				break;
			case "New Matter" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Matter", MenuCC_Claim_Actions_New_Matter, "click", "");
				break;
			case "New Evaluation" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Evaluation", MenuCC_Claim_Actions_New_Evaluation, "click", "");
				break;
			case "New Negotiation" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Negotiation", MenuCC_Claim_Actions_New_Negotiation, "click", "");
				break;
			case "New Service" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Service", MenuCC_Claim_Actions_New_Service, "click", "");
				break;
			case "Reserve" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Reserve", MenuCC_Claim_Actions_NewTransaction_Reserve, "click", "");
				break;
			case "Check" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Reserve", MenuCC_Claim_Actions_NewTransaction_Check, "click", "");
				break;
			case "Other" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Other", MenuCC_Claim_Actions_NewTransaction_Other, "click", "");
				break;
			case "Create from a template" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Create from a template", MenuCC_Claim_Actions_NewDocument_Createfromatemplate, "click", "");
				break;
			case "Upload Documents" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Upload Documents", MenuCC_Claim_Actions_NewDocument_UploadDocuments, "click", "");
				break;
			case "Indicate existence of a document" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Indicate existence of a document", MenuCC_Claim_Actions_NewDocument_Indicateexistenceofadocument, "click", "");
				break;
			case "Correspondence" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Correspondence", MenuCC_Claim_Actions_NewActivity_Correspondence, "click", "");
				break;
			case "Interview" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Interview", MenuCC_Claim_Actions_NewActivity_Interview, "click", "");
				break;
			case "New Mail" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("New Mail", MenuCC_Claim_Actions_NewActivity_NewMail, "click", "");
				break;
			case "Reminder" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Reminder", MenuCC_Claim_Actions_NewActivity_Reminder, "click", "");
				break;
			case "Request" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Request", MenuCC_Claim_Actions_NewActivity_Request, "click", "");
				break;
			case "Warning" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Warning", MenuCC_Claim_Actions_NewActivity_Warning, "click", "");
				break;
			case "Choose by Coverage Type" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Choose by Coverage Type", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "click", "");
				break;
			case "Choose by Coverage" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "click", "");
				break;
			case "Assign Claim" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Assign Claim", MenuCC_Claim_Actions_ClaimActions_AssignClaim, "click", "");
				break;
			case "Close Claim" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Close Claim", MenuCC_Claim_Actions_ClaimActions_CloseClaim, "click", "");
				break;
			case "Print Claim" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Print Claim", MenuCC_Claim_Actions_ClaimActions_PrintClaim, "click", "");
				break;
			case "Sync Status" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Sync Status", MenuCC_Claim_Actions_ClaimActions_SyncStatus, "click", "");
				break;
			case "Validate Claim Only" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly, "click", "");
				break;
			case "Validate Claim Exposures" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures, "click", "");
				break;
			case "Validate Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "click", "");
				GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "click", "");
				break;
			/*
			 * Links
			 */
			case "Summary" :
				GuidewireAutomate("Summary", MenuCC_Claim_Summary, "click", "");
				break;
			case "Overview" :
				GuidewireAutomate("Summary Overview", MenuCC_Claim_Summary_Overview, "click", "");
				break;
			case "Status" :
				GuidewireAutomate("Summary Status", MenuCC_Claim_Summary_Status, "click", "");
				break;
			case "Health Metrics" :
				GuidewireAutomate("Summary Health Metrics", MenuCC_Claim_Summary_HealthMetrics, "click", "");
				break;
			case "Workplan" :
				GuidewireAutomate("Workplan", MenuCC_Claim_Workplan, "click", "");
				break;
			case "Loss Details" :
				GuidewireAutomate("Loss Details", MenuCC_Claim_LossDetails, "click", "");
				break;
			case "Loss Details General" :
				GuidewireAutomate("LossDetails General", MenuCC_Claim_LossDetails_General, "click", "");
				break;
			case "Loss Details Asociations" :
				GuidewireAutomate("LossDetails Asociations", MenuCC_Claim_LossDetails_Asociations, "click", "");
				break;
			case "Loss Details SpecialInvestigationDetails" :
				GuidewireAutomate("LossDetails SpecialInvestigationDetails", MenuCC_Claim_LossDetails_SpecialInvestigationDetails, "click", "");
				break;
			case "Exposures" :
				GuidewireAutomate("Reinsurance", MenuCC_Claim_Exposures, "click", "");
				break;
			case "Reinsurance" :
				GuidewireAutomate("Reinsurance", MenuCC_Claim_Reinsurance, "click", "");
				break;
			case "Parties Involved" :
				GuidewireAutomate("PartiesInvolved", MenuCC_Claim_PartiesInvolved, "click", "");
				break;
			case "Parties Involved Users" :
				GuidewireAutomate("PartiesInvolved", MenuCC_Claim_PartiesInvolved_Users, "click", "");
				break;
			/*
			 * remaining casess to be added
			 * 
			 */
			default :
				throw new IOException("No support for Menu : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to " + Menu + " is succesful");
	}

}
