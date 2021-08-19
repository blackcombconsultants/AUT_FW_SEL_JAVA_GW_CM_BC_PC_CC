package com.pages.Guidewire;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Tab_Menu_Navigation extends SeleniumWebDriver_Commands implements Tab_Menu_Navigation_PO {

	public Tab_Menu_Navigation(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void navigate_ClaimTab() throws Throwable {

	}
	/*
	 * -------------------------------------------------------------- menuNavigation
	 * --------------------------------------------------------------
	 */

	public static void gwContactManagement_TabNavigation(String Tab, String Value) throws Throwable {
		switch (Tab) {

		case "x":
			break;

		case "y":
			break;

		case "z":
			break;

		default:
			throw new IOException("No support for Tab : " + Tab);
		}

		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to " + Tab + " is succesful");

	}

	public static void gwContactManagement_MenuNavigation(String Menu) throws Throwable {
		switch (Menu) {

		case "x":
			break;

		case "y":
			break;

		case "z":
			break;

		default:
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
		case "New Account":
			GuidewireAutomate("Account", TabPC_Account_dd, "click", "click");
			GuidewireAutomate("New Account", TabPC_Account_NewAccount, "click", "click");
			break;
		case "Acct Search":
			GuidewireAutomate("Account", TabPC_Account_dd, "click", "click");
			GuidewireAutomate("Account Number", TabPC_Account_AccountNumber, "sendKeys", Value);
			GuidewireAutomate("Account Search", TabPC_Account_AccountNumberSearch, "click", "click");
			break;

		case "New Submission":
			GuidewireAutomate("Policy Tab", TabPC_Policy_dd, "click", "click");
			GuidewireAutomate("New Submission", TabPC_Policy_NewSubmission, "click", "click");
			GuidewireAutomate_waitForElement(Screen_Header, "visibilityOf", "true");
			Assert.assertEquals(getText_Element(Screen_Header), "New Submissions");
			break;
		case "Sub Search":
			GuidewireAutomate("Policy", TabPC_Policy_dd, "click", "click");
			GuidewireAutomate("Sub Number", TabPC_Policy_SubNumber, "sendKeys", Value);
			GuidewireAutomate("Sub Search", TabPC_Policy_SubNumber_Search, "click", "click");
			break;
		case "Policy Search":
			GuidewireAutomate("Policy", TabPC_Policy_dd, "click", "click");
			GuidewireAutomate("Sub Number", TabPC_Policy_PolicyNumber, "sendKeys", Value);
			GuidewireAutomate("Sub Search", TabPC_Policy_PolicyNumber_Search, "click", "click");
			break;
		case "New Person":
			GuidewireAutomate("Contacts Tab", TabPC_Contact_dd, "click", "click");
			GuidewireAutomate("New Contact", TabPC_Contact_NewContact, "moveToElement", "Null");
			GuidewireAutomate("New Person", TabPC_Contact_NewContact_Person, "click", "click");
			break;
		case "New Company":
			GuidewireAutomate("Contacts Tab", TabPC_Contact_dd, "click", "click");
			GuidewireAutomate("New Contact", TabPC_Contact_NewContact, "moveToElement", "Null");
			GuidewireAutomate("New Company", TabPC_Contact_NewContact_Company, "click", "click");
			break;
		case "Contact Search":
			GuidewireAutomate("Contacts Tab", TabPC_Contact_dd, "click", "click");
			GuidewireAutomate("New Contact", TabPC_Contact_NewContact_Search, "click", "click");
			break;

		case "Policies":
			GuidewireAutomate("SearchTab", TabPC_Search_dd, "click", "click");
			GuidewireAutomate("SearchTab_Policies", TabPC_Search_Policies, "click", "click");
			break;
		case "Accounts":
			GuidewireAutomate("SearchTab", TabPC_Search_dd, "click", "click");
			GuidewireAutomate("SearchTab_Accounts", TabPC_Search_Accounts, "click", "click");
			break;
		case "Producer Codes":
			GuidewireAutomate("SearchTab", TabPC_Search_dd, "click", "click");
			GuidewireAutomate("SearchTab_ProducerCodes", TabPC_Search_ProducerCodes, "click", "click");
			break;
		case "Activities":
			GuidewireAutomate("SearchTab", TabPC_Search_dd, "click", "click");
			GuidewireAutomate("SearchTab_Activities", TabPC_Search_Activities, "click", "click");
			break;
		case "Contacts":
			GuidewireAutomate("SearchTab", TabPC_Search_dd, "click", "click");
			GuidewireAutomate("SearchTab_Contacts", TabPC_Search_Contacts, "click", "click");
			break;

		case "Team":
			GuidewireAutomate("AdministrationTab", TabPC_Team, "click", "click");
			break;

		default:
			throw new IOException("No support for Tab : " + Tab);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to PolicyCenter Tab : " + Tab + " is Succesful");
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
		case "New Account":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewAccount", MenuPC_Desktop_Actions_Create_NewAccount, "click", "click");
			GuidewireAutomate_waitForElement(EnterAccountInformation, "visibilityOf", "true");
			Assert.assertEquals(getText_Element(EnterAccountInformation), "Enter Account Information");
			break;
		case "New Submission Desktop":
			GuidewireAutomate_Validation("Account Summary", AccountSummary_Name, "contains", "Account Summary");
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewSubmission", MenuPC_Desktop_Actions_Create_NewSubmission, "click", "click");
			GuidewireAutomate_waitForElement(NewSubmission_Header, "visibilityOf", "true");
			Assert.assertEquals(getText_Element(NewSubmission_Header), "New Submissions");
			break;
		case "Summary":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Summary", MenuPC_Desktop_Summary, "click", "click");
			break;
		case "My Activities":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("My Activities", MenuPC_Desktop_MyActivities, "click", "click");
			break;
		case "My Accounts":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("My Accounts", MenuPC_Desktop_MyAccounts, "click", "click");
			break;
		case "My Submissions":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("My Submissions", MenuPC_Desktop_MySubmissions, "click", "click");
			break;
		case "My Renewals":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("My Renewals", MenuPC_Desktop_MyRenewals, "click", "click");
			break;
		case "Other Policy Transactions":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("OtherPolicyTransactions", MenuPC_Desktop_OtherPolicyTransactions, "click", "click");
			break;
		case "My Queues":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("My Queues", MenuPC_Desktop_MyQueues, "click", "click");
			break;

		case "New Note":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New_Note", MenuPC_Account_Actions_Create_NewNote, "click", "click");
			break;
		case "New Document":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New_Document", MenuPC_Account_Actions_Create_NewDocument, "click", "click");
			break;
		case "New Email":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New_Email", MenuPC_Account_Actions_Create_NewEmail, "click", "click");
			break;
		case "New Activity":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New_Activity", MenuPC_Account_Actions_Create_NewActivity, "click", "click");
			break;
		case "New Submission":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New_Activity", MenuPC_Account_Actions_Create_NewSubmission, "click", "click");
			break;
		case "Move Policies to this Account":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Move_Policies_to_this_Account", MenuPC_Account_Actions_MovePoliciesToThisAccount,
					"click", "click");
			break;
		case "Rewrite Policires to this Account":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Rewrite_Policires_to_this_Account", MenuPC_Account_Actions_RewritePoliciesToThisAccount,
					"click", "click");
			break;
		case "Merge Account into this Account":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Merge_Account_into_this_Account", MenuPC_Account_Actions_MergeAccountIntoThisAccount,
					"click", "click");
			break;

		case "Account File":
			break;
		case "Policy File":
			break;
		case "Pre Renewal Direction":
			break;
		case "Spin-off Policy from this One":
			break;
		case "Split Policy into Two":
			break;
		case "Issue Policy":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Issue Policy", MenuPC_Actions_Policy_NewPolicyTransaction_IssuePolicy, "click", "click");
			break;
		case "Change Policy":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Change Policy", MenuPC_Actions_Policy_NewPolicyTransaction_ChangePolicy, "click",
					"click");
			break;
		case "Cancel Policy":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Cancel Policy", MenuPC_Actions_Policy_NewPolicyTransaction_CancelPolicy, "click",
					"click");
			break;
		case "Renew Policy":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Renew Policy", MenuPC_Actions_Policy_NewPolicyTransaction_RenewPolicy, "click", "click");
			GuidewireAutomate_Handle("alertaccept", "NA");
			break;
		case "Reinstate Policy":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Reinstate Policy", MenuPC_Actions_Policy_NewPolicyTransaction_ReinstatePolicy, "click",
					"click");
			break;
		case "Rewrite Full Term":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Rewrite Full Term", MenuPC_Actions_Policy_NewPolicyTransaction_RewriteFullTerm, "click",
					"click");
			break;
		case "Rewrite Remainder of Term":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Rewrite Remainder of Term",
					MenuPC_Actions_Policy_NewPolicyTransaction_RewriteRemainderOfTerm, "click", "click");
			break;
		case "Rewrite New Term":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Rewrite New Term", MenuPC_Actions_Policy_NewPolicyTransaction_RewriteNewTerm, "click",
					"click");
			break;
		case "Rescind Cancellation":
			break;
		case "EnableorDisable":
			break;
		case "Copy Submission":

			break;
		default:
			throw new IOException("No support for Menu : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to PolicyCenter Menu : " + Menu + " is Succesful");
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

		case "My Activities":
			GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "click");
			GuidewireAutomate("MyActivities", TabBC_Desktop_MyActivities, "click", "click");
			break;
		case "My Approval Requests":
			GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "click");
			GuidewireAutomate("MyApprovalRequests", TabBC_Desktop_MyApprovalRequests, "click", "click");
			break;
		case "My Trouble Tickets":
			GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "click");
			GuidewireAutomate("MyTroubleTickets", TabBC_Desktop_MyTroubleTickets, "click", "click");
			break;
		case "My Delinquencies":
			GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "click");
			GuidewireAutomate("MyDelinquencies", TabBC_Desktop_MyDelinquencies, "click", "click");
			break;
		case "Disbursements":
			GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "click");
			GuidewireAutomate("Disbursements", TabBC_Desktop_Disbursements, "click", "click");
			break;
		case "Suspense Payments":
			GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "click");
			GuidewireAutomate("SuspensePayments", TabBC_Desktop_SuspensePayments, "click", "click");
			break;
		case "My Agency Items":
			GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "click", "click");
			GuidewireAutomate("MyAgencyItems", TabBC_Desktop_MyAgencyItems, "click", "click");
			break;
		case "Held Charges":
			GuidewireAutomate("Actions", TabBC_Desktop_dd, "click", "click");
			GuidewireAutomate("HeldCharges", TabBC_Desktop_HeldCharges, "click", "click");
			break;

		case "New Account":
			GuidewireAutomate("Account", TabBC_Account, "click", "click");
			GuidewireAutomate("NewAccount", MenuBC_Actions_NewAccount, "click", "click");
			break;
		case "Acct Search":
			GuidewireAutomate("Account Tab", TabBC_Account_dd, "click", "click");
			GuidewireAutomate("Account Number", TabBC_Account_AccountNumber, "clearANDsendKeys", Value);
			GuidewireAutomate("AccountNumberSearch", TabBC_Account_AccountNumber_Search, "click", "click");
			break;

		case "Policy Search":
			GuidewireAutomate("Policy Tab", TabBC_Policy_dd, "click", "click");
			GuidewireAutomate("Account Number", TabBC_Policy_PolicyNumber, "clearANDsendKeys", Value);
			GuidewireAutomate("AccountNumberSearch", TabBC_Policy_PolicyNumber_Search, "click", "click");
			break;

		case "Producer Search":
			GuidewireAutomate("Producer Tab", TabBC_Producer_dd, "click", "click");
			GuidewireAutomate("Producer Name", TabBC_Producer_ProducerName, "clearANDsendKeys", Value);
			GuidewireAutomate("ProducerName Search", TabBC_Producer_ProducerNameSearch, "click", "click");
			break;

		/*
		 * Search
		 */
		case "Search Accounts":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search Accounts", TabBC_Search_Accounts, "click", "click");
		case "Search Policies":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search Policies", TabBC_Search_Policies, "click", "click");
			break;
		case "Search Contacts":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search Contacts", TabBC_Search_Contacts, "click", "click");
			break;
		case "Search Invoices":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search Invoices", TabBC_Search_Invoices, "click", "click");
			break;
		case "Search Payments":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search Payments", TabBC_Search_Payments, "click", "click");
			break;
		case "Search Producers":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search Producers", TabBC_Search_Producers, "click", "click");
			break;
		case "Search Transactions":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search Transactions", TabBC_Search_Transactions, "click", "click");
			break;
		case "Search Activities":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search Activities", TabBC_Search_Activities, "click", "click");
			break;
		case "Search Trouble Tickets":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search TroubleTickets", TabBC_Search_TroubleTickets, "click", "click");
			break;
		case "Search Delinquency Processes":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search DelinquencyProcesses", TabBC_Search_DelinquencyProcesses, "click", "click");
			break;
		case "Search Disbursements":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search Disbursements", TabBC_Search_Disbursements, "click", "click");
			break;
		case "Search Outgoing Producer Payments":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search OutgoingProducerPayments", TabBC_Search_OutgoingProducerPayments, "click",
					"click");
			break;
		case "Search Payment Requests":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search PaymentRequests", TabBC_Search_PaymentRequests, "click", "click");
			break;
		case "Search Direct Bill Suspense Items ":
			GuidewireAutomate("Search Tab", TabBC_Search_dd, "click", "click");
			GuidewireAutomate("Search DirectBillSuspenseItem", TabBC_Search_DirectBillSuspenseItems, "click", "click");
			break;

		/*
		 * AdministrationTab
		 */
		case "Users_and_Security":
			GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "click", "click");
			GuidewireAutomate("Users_and_Security", TabBC_Administration_UsersAndSecurity, "click", "click");
			break;
		case "Business Settings":
			GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "click", "click");
			GuidewireAutomate("Business_Settings", TabBC_Administration_BusinessSettings, "click", "click");
			break;
		case "Monitoring":
			GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "click", "click");
			GuidewireAutomate("Monitoring", TabBC_Administration_Monitoring, "click", "click");
			break;
		case "Utilities":
			GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "click", "click");
			GuidewireAutomate("Utilities", TabBC_Administration_Utilities, "click", "click");
			break;

		default:
			throw new IOException("No support for Tab : " + Tab);
		}

		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to BillingCenter Tab : " + Tab + " is Succesful");

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

		case "My Activities":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New Payment", MenuBC_Desktop_MyActivities, "click", "click");
			break;

		case "New Assigned Activity":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New Payment", MenuBC_Desktop_Actions_NewAssignedActivity, "click", "click");
			break;
		case "New Shared Activity":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New Shared Activity", MenuBC_Desktop_Actions_NewSharedActivity, "click", "click");
			break;
		case "Preferences":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Preferences", MenuBC_Desktop_Actions_Preferences, "click", "click");
			break;

		case "New Account":
			GuidewireAutomate("Account Tab", TabBC_Account, "click", "click");
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New Account", MenuBC_Actions_NewAccount, "click", "click");
			break;
		case "Accounts":
			GuidewireAutomate("Account Tab", TabBC_Account, "click", "click");
			GuidewireAutomate("New Account", MenuBC_Accounts, "click", "click");
			break;

		case "Add Policy":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Add Policy", MenuBC_Account_Actions_AddPolicy, "click", "click");
			break;
		case "New Payment":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New Payment", MenuBC_Account_Actions_NewPayment, "click", "click");
			break;
		case "New Direct Bill Payment":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New Payment", MenuBC_Account_Actions_NewPayment, "moveToElement", "");
			GuidewireAutomate("New Payment", MenuBC_Account_Actions_NewPayment_NewDirectBillPayment, "click", "click");
			break;
		case "New Transaction":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New Transaction", MenuBC_Account_Actions_NewTransaction, "click", "click");
			break;
		case "Transfer Policies ":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Transfer Policies", MenuBC_Account_Actions_TransferPolicies, "click", "click");
			break;
		case "New Note":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New Note", MenuBC_Account_Actions_NewNote, "click", "click");
			break;
		case "New Document":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New Document", MenuBC_Account_Actions_NewDocument, "click", "click");
			break;
		case "New Email":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New Email", MenuBC_Account_Actions_NewEmail, "click", "click");
			break;
		/*
		 * Account Menu Links
		 */
		case "Summary":
			GuidewireAutomate("Summary", MenuBC_Account_Summary, "click", "click");
			break;
		case "Details":
			GuidewireAutomate("Details", MenuBC_Account_Details, "click", "click");
			break;
		case "Contacts":
			GuidewireAutomate("Contacts", MenuBC_Account_Contacts, "click", "click");
			break;
		case "Funds Tracking":
			GuidewireAutomate("Funds Tracking", MenuBC_Account_FundsTracking, "click", "click");
			break;
		case "Payments":
			GuidewireAutomate("Payments", MenuBC_Account_Payments, "click", "click");
			break;
		case "Charges":
			GuidewireAutomate("New Email", MenuBC_Account_Charges, "click", "click");
			break;
		case "Disbursements":
			GuidewireAutomate("New Email", MenuBC_Account_Disbursements, "click", "click");
			break;
		case "Transactions":
			GuidewireAutomate("New Email", MenuBC_Account_Transactions, "click", "click");
			break;
		case "Collateral":
			GuidewireAutomate("New Email", MenuBC_Account_Collateral, "click", "click");
			break;
		case "Policies":
			GuidewireAutomate("New Email", MenuBC_Account_Policies, "click", "click");
			break;
		case "History":
			GuidewireAutomate("New Email", MenuBC_Account_History, "click", "click");
			break;
		case "Evaluation":
			GuidewireAutomate("New Email", MenuBC_Account_Evaluation, "click", "click");
			break;
		case "Invoices":
			GuidewireAutomate("Invoices", MenuBC_Account_Invoices, "click", "click");
			break;
		case "Invoice Streams":
			GuidewireAutomate("Invoice Streams", MenuBC_Account_InvoiceStreams, "click", "click");
			break;
		case "TroubleTickets":
			GuidewireAutomate("TroubleTickets", MenuBC_Account_TroubleTickets, "click", "click");
			break;
		case "Documents":
			GuidewireAutomate("Documents", MenuBC_Account_Documents, "click", "click");
			break;
		case "Ledger":
			GuidewireAutomate("Ledger", MenuBC_Account_Ledger, "click", "click");
			break;
		case "Journal":
			GuidewireAutomate("Journal", MenuBC_Account_Journal, "click", "click");
			break;
		case "Delinquencies":
			GuidewireAutomate("Delinquencies", MenuBC_Account_Delinquencies, "click", "click");
			break;
		/*
		 * Policy
		 */
		case "Change Policy":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Change Policy", MenuBC_Policy_Actions_ChangePolicy, "click", "click");
			break;
		case "Renew Policy":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Renew Policy", MenuBC_Policy_Actions_RenewPolicy, "click", "click");
			break;

		case "Payment Schedule":
			GuidewireAutomate("Payment Schedule", MenuBC_Policy_PaymentSchedule, "click", "click");
			break;

		/*
		 * Producer
		 */
		case "New Producer":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New Producer", TabBC_Producer_Actions_NewProducer, "click", "click");
			break;

		case "New Comm Payment":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New Comm Payment", MenuBC_Producer_Actions_NewCommPayment, "click", "click");
			break;
		case "Commission Write-Off":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Commission Write-Off", MenuBC_Producer_Actions_CommissionWriteOff, "click", "click");
			break;
		case "Commission Recovery Write-Off":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Commission Recovery Write-Off", MenuBC_Producer_Actions_CommissionRecoveryWriteOff,
					"click", "click");
			break;
		case "Return Commission":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Return Commission", MenuBC_Producer_Actions_ReturnCommission, "click", "click");
			break;
		case "New Agency Bill Payment":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("New Agency Bill Payment", MenuBC_Producer_Actions_NewAgencyBillPayment, "click",
					"click");
			break;
		case "Transfer Funds":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Transfer Funds", MenuBC_Producer_Actions_TransferFunds, "click", "click");
			break;
		case "Write-Off":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Write-Off", MenuBC_Producer_Actions_WriteOff, "click", "click");
			break;
		case "Negative Write-Off":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Negative Write-Off", MenuBC_Producer_Actions_NegativeWriteOff, "click", "click");
			break;

		case "Direct Bill Commission Statements":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Negative Write-Off", MenuBC_Producer_DirectBillCommissionStatements, "click", "click");
			break;
		case "Agency Bill Disbursements":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("Negative Write-Off", MenuBC_Producer_AgencyBillDisbursements, "click", "click");
			break;

		/*
		 * Administration
		 */
		case "New Billing Plan":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewBillingPlan", MenuBC_Administration_Actions_NewBillingPlan, "click", "click");
			break;
		case "New Payment Plan":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewPaymentPlan", MenuBC_Administration_Actions_NewPaymentPlan, "click", "click");
			break;
		case "New Commission Plan":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewCommissionPlan", MenuBC_Administration_Actions_NewCommissionPlan, "click", "click");
			break;
		case "New Delinquency Plan":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewDelinquencyPlan", MenuBC_Administration_Actions_NewDelinquencyPlan, "click", "click");
			break;
		case "New Agency Bill Plan":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewAgencyBillPlan", MenuBC_Administration_Actions_NewAgencyBillPlan, "click", "click");
			break;
		case "New Return Premium Plan":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewReturnPremiumPlan", MenuBC_Administration_Actions_NewReturnPremiumPlan, "click",
					"click");
			break;
		case "New Payment Allocation Plan":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewPaymentAllocationPlan", MenuBC_Administration_Actions_NewPaymentAllocationPlan,
					"click", "click");
			break;
		case "New Collection Agency":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewCollectionAgency", MenuBC_Administration_Actions_NewCollectionAgency, "click",
					"click");
			break;
		case "New Charge Pattern":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewChargePattern", MenuBC_Administration_Actions_NewChargePattern, "click", "click");
			break;
		case "New User":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewUser", MenuBC_Administration_Actions_NewUser, "click", "click");
			break;
		case "New Role":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewRole", MenuBC_Administration_Actions_NewRole, "click", "click");
			break;
		case "New Group":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewGroup", MenuBC_Administration_Actions_NewGroup, "click", "click");
			break;
		case "New Authority Limit Profile":
			GuidewireAutomate("Actions", Menu_Actions, "click", "click");
			GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Actions_NewAuthorityLimitProfile,
					"click", "click");
			break;
		/*
		 * Menu Links
		 */
		case "Users Security":
			GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_UsersAndSecurity, "click", "click");
			break;
		case "Users":
			GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_UsersAndSecurity_Users, "click",
					"click");
			break;
		case "Business Settings":
			GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_BusinessSettings, "click", "click");
			break;
		case "Activity Patterns":
			GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_BusinessSettings_ActivityPatterns,
					"click", "click");
			break;
		case "Monitoring":
			GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Monitoring, "click", "click");
			break;
		case "Message Queues":
			GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Monitoring_MessageQueues, "click",
					"click");
			break;
		case "Utilities":
			GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Utilities, "click", "click");
			break;
		case "Import Data":
			GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Utilities_ImportData, "click", "click");
			break;
		default:
			throw new IOException("No support for Tab : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to BillingCenter Menu : " + Menu + " is succesful");

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
		case "Desktop":
			GuidewireAutomate("Desktop Tab", TabCC_Desktop, "click", "click");
			break;
		case "Activities":
			GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "click");
			GuidewireAutomate("Activities", TabCC_Desktop_Activities, "click", "click");
			break;
		case "Claims":
			GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "click");
			GuidewireAutomate("Claims", TabCC_Desktop_Claims, "click", "click");
			break;
		case "Subrogations":
			GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "click");
			GuidewireAutomate("Subrogations", TabCC_Desktop_Subrogations, "click", "click");
			break;
		case "Exposures":
			GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "click");
			GuidewireAutomate("Exposures", TabCC_Desktop_Exposures, "click", "click");
			break;
		case "Pending Assignments":
			GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "click");
			GuidewireAutomate("PendingAssignments", TabCC_Desktop_PendingAssignments, "click", "click");
			break;
		case "Queues":
			GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "click");
			GuidewireAutomate("Queues", TabCC_Desktop_Queues, "click", "click");
			break;
		case "Calendar":
			GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "click");
			GuidewireAutomate("Calendar", TabCC_Desktop_Calendar, "click", "click");
			break;
		case "Bulk Invoices":
			GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "click", "click");
			GuidewireAutomate("BulkInvoices", TabCC_Desktop_BulkInvoices, "click", "click");
			break;

		/*
		 * Claims
		 */
		case "Claim":
			GuidewireAutomate("Claim Tab", TabCC_Claim, "click", "click");
			break;
		case "New Claim":
			GuidewireAutomate("Claims Tab", TabCC_Claim_dd, "click", "click");
			GuidewireAutomate("New Claim", TabCC_Claim_NewClaim, "click", "click");
			break;
		case "Claim Search":
			String strClaimNumber = null;
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("searchValues",
					strTestCaseName);

			strClaimNumber = lhm_TestCase_Table_Data.get("ClaimsNumber");
			GuidewireAutomate("Claims Tab", TabCC_Claim_dd, "click", "click");
			GuidewireAutomate("Claim Number", TabCC_Claim_ClaimNumber, "clearANDsendKeys", strClaimNumber);
			GuidewireAutomate("Claim Number Search", TabCC_Claim_ClaimNumber_Search, "click", "click");
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
			break;
		/*
		 * Search
		 */
		case "Search":
			GuidewireAutomate("Claim Tab", TabCC_Search, "click", "click");
			break;
		case "Search Claims":
			GuidewireAutomate("Search Tab", TabCC_Search_dd, "click", "click");
			GuidewireAutomate("Search Claims", TabCC_Search_Claims, "click", "click");
			break;
		case "Search Activities":
			GuidewireAutomate("Search Tab", TabCC_Search_dd, "click", "click");
			GuidewireAutomate("Search Activities", TabCC_Search_Activities, "click", "click");
			break;
		case "Search Checks":
			GuidewireAutomate("Search Tab", TabCC_Search_dd, "click", "click");
			GuidewireAutomate("Search Checks", TabCC_Search_Checks, "click", "click");
			break;
		case "Search Recoveries":
			GuidewireAutomate("Search Tab", TabCC_Search_dd, "click", "click");
			GuidewireAutomate("Search Recoveries", TabCC_Search_Recoveries, "click", "click");
			break;
		case "Search Bulk Invoices":
			GuidewireAutomate("Search Tab", TabCC_Search_dd, "click", "click");
			GuidewireAutomate("Search Bulk Invoices", TabCC_Search_BulkInvoices, "click", "click");
			break;

		/*
		 * Address Book
		 */
		case "Address Book":
			GuidewireAutomate("Address Search Tab", TabCC_AddressBook, "click", "Null");
			break;
		/*
		 * DashBoard
		 */
		case "Dashboard":
			GuidewireAutomate("DashBoard Tab", TabCC_DashBoard, "click", "Null");
			break;
		/*
		 * Team
		 */
		case "Team":
			GuidewireAutomate("Team Tab", TabCC_Team, "click", "Null");
			break;
		/*
		 * Administration
		 */
		case "Administration":
			GuidewireAutomate("Administration Tab", TabCC_Administration, "click", "click");
			break;

		case "Print User Group Tree":
			GuidewireAutomate("AdministrationTab dd", TabCC_Adminsitration_dd, "click", "Null");
			GuidewireAutomate("Print User Group Tree", TabCC_Adminsitration_PrintUserGroupTree, "click", "Null");
			break;

		default:
			throw new IOException("No support for Tab : " + Tab);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to ClaimsCenter Tab : " + Tab + " is succesful");
	}

	public static void ccMenuNavigation(String Menu) throws Throwable {

		/*
		 * Actions
		 */
		switch (Menu) {
		case "Statistics":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Statistics", MenuCC_Desktop_Actions_Statistics, "click", "click");
			break;
		case "Preferences":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Preferences", MenuCC_Desktop_Actions_Preferences, "click", "click");
			break;
		case "VacationStatus":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("VacationStatus", MenuCC_Desktop_Actions_VacationStatus, "click", "click");
			break;

		// New
		case "New Note":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("New Note", MenuCC_Claim_Actions_NewNote, "click", "click");
			break;
		case "New Email":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("New Email", MenuCC_Claim_Actions_New_Email, "click", "click");
			break;
		case "New Matter":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("New Matter", MenuCC_Claim_Actions_New_Matter, "click", "click");
			break;
		case "New Evaluation":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("New Evaluation", MenuCC_Claim_Actions_New_Evaluation, "click", "click");
			break;
		case "New Negotiation":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("New Negotiation", MenuCC_Claim_Actions_New_Negotiation, "click", "click");
			break;
		case "New Service":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("New Service", MenuCC_Claim_Actions_New_Service, "click", "click");
			break;

		// New Transaction
		case "Reserve":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Reserve", MenuCC_Claim_Actions_NewTransaction_Reserve, "click", "click");
			break;
		case "Check":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Reserve", MenuCC_Claim_Actions_NewTransaction_Check, "click", "click");
			break;
		case "Other":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Other", MenuCC_Claim_Actions_NewTransaction_Other, "moveToElement", "click");
			break;
		case "Manual Check":
			GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
			GuidewireAutomate("Other", MenuCC_Claim_Actions_NewTransaction_Other, "moveToElement", "moveToElement");
			GuidewireAutomate("Manual Check", MenuCC_Claim_Actions_NewTransaction_Other_ManualCheck, "click", "click");
			break;
		case "Recovery":
			GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Other", MenuCC_Claim_Actions_NewTransaction_Other, "moveToElement", "moveToElement");
			GuidewireAutomate("Recovery", MenuCC_Claim_Actions_NewTransaction_Other_Recovery, "click", "click");
			break;
		case "Recovery Reserve":
			GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Other", MenuCC_Claim_Actions_NewTransaction_Other, "moveToElement", "moveToElement");
			GuidewireAutomate("Recovery Reserve", MenuCC_Claim_Actions_NewTransaction_Other_RecoveryReserve, "click",
					"click");
			break;
		case "Create from a template":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Create from a template", MenuCC_Claim_Actions_NewDocument_Createfromatemplate, "click",
					"click");
			break;
		case "Upload Documents":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Upload Documents", MenuCC_Claim_Actions_NewDocument_UploadDocuments, "click", "click");
			break;
		case "Indicate existence of a document":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Indicate existence of a document",
					MenuCC_Claim_Actions_NewDocument_Indicateexistenceofadocument, "click", "click");
			break;

		// New Activity
		case "Correspondence":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Correspondence", MenuCC_Claim_Actions_NewActivity_Correspondence, "moveToElement",
					"moveToElement");
			break;
		case "Send claim acknowledgement letter":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Correspondence", MenuCC_Claim_Actions_NewActivity_Correspondence, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Send claim acknowledgement letter",
					MenuCC_Claim_Actions_NewActivity_Correspondence_SendclaimAcknowledgementLetter, "click", "click");
			break;
		case "Send letter confirming closure of exposure":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Correspondence", MenuCC_Claim_Actions_NewActivity_Correspondence, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Send letter confirming closure of exposure",
					MenuCC_Claim_Actions_NewActivity_Correspondence_SendLetterConfirmingClosureOfExposure, "click",
					"click");
			break;
		case "Send reservation of rights letter":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Correspondence", MenuCC_Claim_Actions_NewActivity_Correspondence, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Send reservation of rights letter",
					MenuCC_Claim_Actions_NewActivity_Interview_GetAStatementFromWitness, "click", "click");
			break;
		case "Interview":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Interview", MenuCC_Claim_Actions_NewActivity_Interview, "moveToElement",
					"moveToElement");
			break;
		case "Get a statement from witness":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Interview", MenuCC_Claim_Actions_NewActivity_Interview, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Get a statement from witness",
					MenuCC_Claim_Actions_NewActivity_Interview_GetAStatementFromWitness, "click", "click");
			break;
		case "Make initial contact with insured":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Interview", MenuCC_Claim_Actions_NewActivity_Interview, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Make initial contact with insured",
					MenuCC_Claim_Actions_NewActivity_Interview_MakeInitialContactWithInsured, "click", "click");
			break;
		case "New Mail":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("New Mail", MenuCC_Claim_Actions_NewActivity_NewMail, "moveToElement", "moveToElement");
			break;
		case "Review new bill received":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("New Mail", MenuCC_Claim_Actions_NewActivity_NewMail, "moveToElement", "moveToElement");
			GuidewireAutomate("Review new bill received",
					MenuCC_Claim_Actions_NewActivity_NewMail_ReviewNewBillReceived, "click", "click");
			break;
		case "Review new mail":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("New Mail", MenuCC_Claim_Actions_NewActivity_NewMail, "moveToElement", "moveToElement");
			GuidewireAutomate("Review new mail", MenuCC_Claim_Actions_NewActivity_NewMail_ReviewNewMail, "click",
					"click");
			break;

		case "Reminder":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Reminder", MenuCC_Claim_Actions_NewActivity_Reminder, "moveToElement", "moveToElement");
			break;
		case "30 day diary":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Reminder", MenuCC_Claim_Actions_NewActivity_Reminder, "moveToElement", "moveToElement");
			GuidewireAutomate("30 day diary", MenuCC_Claim_Actions_NewActivity_Reminder_30DayDiary, "click", "click");
			break;
		case "60 day diary":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Reminder", MenuCC_Claim_Actions_NewActivity_Reminder, "moveToElement", "moveToElement");
			GuidewireAutomate("60 day diary", MenuCC_Claim_Actions_NewActivity_Reminder_60DayDiary, "click", "click");
			break;
		case "90 day diary":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Reminder", MenuCC_Claim_Actions_NewActivity_Reminder, "moveToElement", "moveToElement");
			GuidewireAutomate("90 day diary", MenuCC_Claim_Actions_NewActivity_Reminder_90DayDiary, "click", "click");
			break;
		// Other Reminder Sub-menu Cases need to be added here

		case "Request":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Request", MenuCC_Claim_Actions_NewActivity_Request, "moveToElement", "moveToElement");
			break;
		case "Additional living expenses required":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Request", MenuCC_Claim_Actions_NewActivity_Request, "moveToElement", "moveToElement");
			GuidewireAutomate("Additional living expenses required",
					MenuCC_Claim_Actions_NewActivity_Request_AdditionalLivingExpensesRequired, "click", "click");
			break;
		case "Create Recovery email bill1":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Request", MenuCC_Claim_Actions_NewActivity_Request, "moveToElement", "moveToElement");
			GuidewireAutomate("Create Recovery email bill1",
					MenuCC_Claim_Actions_NewActivity_Request_CreateRecoveryEmailBill1, "click", "click");
			break;
		case "Create Recovery email bill2":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Request", MenuCC_Claim_Actions_NewActivity_Request, "moveToElement", "moveToElement");
			GuidewireAutomate("Create Recovery email bill2",
					MenuCC_Claim_Actions_NewActivity_Request_CreateRecoveryEmailBill2, "click", "click");
			break;
		// Other Request Sub-menu Cases need to be added here

		case "Warning":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Warning", MenuCC_Claim_Actions_NewActivity_Warning, "moveToElement", "moveToElement");
			break;
		case "Unable to close the claim or the exposure":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Warning", MenuCC_Claim_Actions_NewActivity_Warning, "moveToElement", "moveToElement");
			GuidewireAutomate("Unable to close the claim or the exposure",
					MenuCC_Claim_Actions_NewActivity_Warning_UnableToCloseTheClaimOrTheExposure, "click", "click");
			break;

		// Choose by Coverage Vehicle

		case "ChoosebyCoverage Collision":
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
			String strChoosebyCoverage_Vehicle = lhm_TestCase_Table_Data.get("BI_IV_Select");

			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");

			By ChoosebyCoverage_Vehicle = By.xpath(
					"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='"
							+ strChoosebyCoverage_Vehicle + "']");

			GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_Vehicle, "moveToElement", "moveToElement");

			GuidewireAutomate("Collision", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelCollision,
					"click", "click");
			break;

		case "ChoosebyCoverage Comprehensive":
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
			String strChoosebyCoverage_VehicleComprehensive = lhm_TestCase_Table_Data.get("BI_IV_Select");

			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");
			By ChoosebyCoverage_VehicleComprehensive = By.xpath(
					"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='"
							+ strChoosebyCoverage_VehicleComprehensive + "']");

			GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleComprehensive, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Comprehensive",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelComprehensive, "click", "click");
			break;

		case "ChoosebyCoverage ElectronicEquipment":
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
			String strChoosebyCoverage_VehicleElectronicEquipment = lhm_TestCase_Table_Data.get("BI_IV_Select");

			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");
			By ChoosebyCoverage_VehicleElectronicEquipment = By.xpath(
					"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='"
							+ strChoosebyCoverage_VehicleElectronicEquipment + "']");

			GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleElectronicEquipment, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Electronic Equipment",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelElectronicEquipment, "click",
					"click");
			break;

		case "ChoosebyCoverage RentalReimbursement":
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
			String strChoosebyCoverage_VehicleRentalReimbursement = lhm_TestCase_Table_Data.get("BI_IV_Select");

			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");

			By ChoosebyCoverage_VehicleRentalReimbursement = By.xpath(
					"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='"
							+ strChoosebyCoverage_VehicleRentalReimbursement + "']");

			GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleRentalReimbursement, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Rental Reimbursement",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelRentalReimbursement, "click",
					"click");
			break;

		case "ChoosebyCoverage TapeDiscMedia":
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
			String strChoosebyCoverage_VehicleTapeDiscMedia = lhm_TestCase_Table_Data.get("BI_IV_Select");

			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");

			By ChoosebyCoverage_VehicleTapeDiscMedia = By.xpath(
					"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='"
							+ strChoosebyCoverage_VehicleTapeDiscMedia + "']");

			GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleTapeDiscMedia, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Tape Disc Media",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelTapeDiscMedia, "click", "click");
			break;

		case "ChoosebyCoverage TowingAndLabor":
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
			String strChoosebyCoverage_VehicleTowingAndLabor = lhm_TestCase_Table_Data.get("BI_IV_Select");

			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");

			By ChoosebyCoverage_VehicleTowingAndLabor = By.xpath(
					"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='"
							+ strChoosebyCoverage_VehicleTowingAndLabor + "']");

			GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleTowingAndLabor, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Towing and Labor",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelTowingAndLabor, "click", "click");
			break;

		// Choose by Coverage Policy Level Coverage

		case "ChoosebyCoverage Liability Bodily Injury":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Policy Level Coverage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Liability Bodily Injury and Property Damage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Liability Bodily Injury",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityBodilyInjury,
					"click", "click");
			break;

		case "ChoosebyCoverage Liability Property Damage":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Policy Level Coverage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Liability Bodily Injury and Property Damage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Liability Property Damage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityPropertyDamage,
					"click", "click");
			break;

		case "ChoosebyCoverage Liability Vehicle Damage":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Policy Level Coverage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Liability Bodily Injury and Property Damage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Liability Vehicle Damage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityVehicleDamage,
					"click", "click");
			break;

		case "ChoosebyCoverage Mexico Cov BI":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Policy Level Coverage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Mexico Coverage Limited",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Mexico Cov BI",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovBI,
					"click", "click");
			break;
		case "ChoosebyCoverage Mexico Cov PD":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Policy Level Coverage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Mexico Coverage Limited",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Mexico Cov PD",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovPD,
					"click", "click");
			break;
		case "ChoosebyCoverage Mexico Cov Vehicle Damage":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Policy Level Coverage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Mexico Coverage Limited",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Mexico Cov Vehicle Damage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovVehicleDamage,
					"click", "click");
			break;
		case "ChoosebyCoverage Mexico Cov Gen Damages":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Policy Level Coverage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Mexico Coverage Limited",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Mexico Cov Gen Damages",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovGenDamages,
					"click", "click");
			break;

		case "ChoosebyCoverage Medical Payments":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Policy Level Coverage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Medical Payments",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MedicalPayments, "click",
					"click");
			break;

		case "ChoosebyCoverage Underinsured Motorist - Property Damage":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Policy Level Coverage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Underinsured Motorist - Property Damage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UnderinsuredMotoristPropertyDamage,
					"click", "click");
			break;

		case "ChoosebyCoverage Uninsured Motorist Bodily Injury":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Policy Level Coverage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Uninsured Motorist Bodily Injury",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UninsuredMotoristBodilyInjury,
					"click", "click");
			break;
		case "ChoosebyCoverage Uninsured Motorist Property Damage":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Policy Level Coverage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Uninsured Motorist Property Damage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UninsuredMotoristPropertyDamage,
					"click", "click");
			break;

		// Choose By Coverage Type
		case "Choose by Coverage Type":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by Coverage Type", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			break;

		case "Collision":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType C", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Collision", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_Collision, "click",
					"click");
			break;
		case "Collision Limited Coverage":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType C", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Collision Limited Coverage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_CollisionLimitedCoverage, "click", "click");
			break;
		case "Comprehensive":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType C", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Comprehensive", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_Comprehensive,
					"click", "click");
			break;
		case "Death and Disability Benefit":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType D", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_D,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Death and Disability Benefit",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_D_DeathAndDisabilityBenefit, "click",
					"click");
			break;
		case "Electronic Equipment":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType E", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_E,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Electronic Equipment",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_E_ElectronicEquipment, "click", "click");
			break;
		case "Liability Bodily Injury":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType L", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Liability Bodily Injury",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityBodilyInjury, "click", "click");
			break;
		case "Liability Property Damage":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType L", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Liability Property Damage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityPropertyDamage, "click", "click");
			break;
		case "Liability Vehicle Damage":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType L", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Liability Vehicle Damage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityVehicleDamage, "click", "click");
			break;
		case "Mexico Cov BI":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Mexico Coverage Limited",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Mexico Cov BI",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovBI, "click",
					"click");
			break;
		case "Mexico Cov PD":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Mexico Coverage Limited",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Mexico Cov PD",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovPD, "click",
					"click");
			break;
		case "Mexico Cov Vehicle Damage":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Mexico Coverage Limited",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Mexico Cov Vehicle Damage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovVehicleDamage,
					"click", "click");
			break;
		case "Mexico Cov Gen Damages'":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Mexico Coverage Limited",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement",
					"moveToElement");
			GuidewireAutomate("Mexico Cov Gen Damages",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovGenDamages,
					"click", "click");
			break;

		case "Medical Payments":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Mexico Coverage Limited",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MedicalPayments, "click", "click");
			break;

		case "PIP Arkansas":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Arkansas", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPArkansas,
					"click", "click");
			break;
		case "PIP Delaware":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Delaware", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPDelaware,
					"click", "click");
			break;
		case "PIP District of Columbia":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP District of Columbia",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPDistrictOfColumbia, "click", "click");
			break;
		case "PIP Florida":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Florida", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPFlorida,
					"click", "click");
			break;
		case "PIP Hawaii":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Hawaii", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPHawaii, "click",
					"click");
			break;
		case "PIP Kansas":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Kansas", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPKansas, "click",
					"click");
			break;
		case "PIP Kentucky":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Kentucky", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPKentucky,
					"click", "click");
			break;
		case "PIP Maryland":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Maryland", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMaryland,
					"click", "click");
			break;
		case "PIP Massachusetts":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Massachusetts",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMassachusetts, "click", "click");
			break;
		case "PIP Michigan":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Michigan", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMichigan,
					"click", "click");
			break;
		case "PIP Minnesota":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Michigan", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMinnesota,
					"click", "click");
			break;
		case "PIP NewJersey":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP New Jersey", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNewJersey,
					"click", "click");
			break;
		case "PIP NewYork":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP New York", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNewYork,
					"click", "click");
			break;
		case "PIP NorthDakota":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP North Dakota",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNorthDakota, "click", "click");
			break;
		case "PIP Oregon":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Oregon", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPOregon, "click",
					"click");
			break;
		case "PIP Pennsylvania":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Pennsylvania",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPPennsylvania, "click", "click");
			break;
		case "PIP Texas":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Texas", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPTexas, "click",
					"click");
			break;
		case "PIP Utah":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Utah", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPUtah, "click",
					"click");
			break;
		case "PIP Washington":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("PIP Washington", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPWashington,
					"click", "click");
			break;
		case "Property Protection Insurance":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Property Protection Insurance",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PropertyProtectionInsurance, "click",
					"click");
			break;

		case "Rental Car Loss of Use":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType R", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Rental Car Loss of Use",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R_RentalCarLossOfUse, "click", "click");
			break;
		case "Rental Reimbursement":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType R", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Rental Reimbursement",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R_RentalReimbursement, "click", "click");
			break;
		case "Tape Disc Media":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType T", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Tape Disc Media", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T_TapeDiscMedia,
					"click", "click");
			break;
		case "Towing and Labor":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType T", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Towing and Labor",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T_TowingAndLabor, "click", "click");
			break;
		case "Underinsured Motorist Bodily Injury":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType U", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Underinsured Motorist Bodily Injury",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UnderinsuredMotoristBodilyInjury, "click",
					"click");
			break;
		case "Underinsured Motorist Property Damage":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType U", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Underinsured Motorist Property Damage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UnderinsuredMotoristPropertyDamage, "click",
					"click");
			break;
		case "Uninsured Motorist Bodily Injury":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType U", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Uninsured Motorist Bodily Injury",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UninsuredMotoristBodilyInjury, "click",
					"click");
			break;
		case "Uninsured Motorist Property Damage":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Choose by CoverageType U", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Uninsured Motorist Property Damage",
					MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UninsuredMotoristPropertyDamage, "click",
					"click");
			break;

		// Claim Actions
		case "Assign Claim":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Assign Claim", MenuCC_Claim_Actions_ClaimActions_AssignClaim, "click", "click");
			break;
		case "Close Claim":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Close Claim", MenuCC_Claim_Actions_ClaimActions_CloseClaim, "click", "click");
			break;
		case "Print Claim":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Print Claim", MenuCC_Claim_Actions_ClaimActions_PrintClaim, "click", "click");
			break;
		case "Sync Status":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Sync Status", MenuCC_Claim_Actions_ClaimActions_SyncStatus, "click", "click");
			break;
		case "Validate Claim Only":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly,
					"moveToElement", "moveToElement");
			break;
		case "ValidateClaimOnly Loadandsave":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly,
					"moveToElement", "moveToElement");
			GuidewireAutomate("ValidateClaimOnly Loadandsave",
					MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_LoadAndSave, "click", "click");
			break;
		case "ValidateClaimOnly NewLossCompletion":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly,
					"moveToElement", "moveToElement");
			GuidewireAutomate("ValidateClaimOnly NewLossCompletion",
					MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_NewLossCompletion, "click", "click");
			break;
		case "ValidateClaimOnly ValidForISO":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly,
					"moveToElement", "moveToElement");
			GuidewireAutomate("ValidateClaimOnly ValidForISO",
					MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_ValidForISO, "click", "click");
			break;
		case "ValidateClaimOnly SendToExternalSystem":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly,
					"moveToElement", "moveToElement");
			GuidewireAutomate("ValidateClaimOnly SendToExternalSystem",
					MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_SendToExternalSystem, "click", "click");
			break;
		case "ValidateClaimOnly AbilityToPay":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly,
					"moveToElement", "moveToElement");
			GuidewireAutomate("ValidateClaimOnly AbilityToPay",
					MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_AbilityToPay, "click", "click");
			break;
		case "Validate Claim Exposures":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures,
					"click", "click");
			break;
		case "ValidateClaimExposures Loadandsave":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures,
					"moveToElement", "moveToElement");
			GuidewireAutomate("ValidateClaimExposures Loadandsave",
					MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_LoadAndSave, "click", "click");
			break;
		case "ValidateClaimExposures NewLossCompletion":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures,
					"moveToElement", "moveToElement");
			GuidewireAutomate("ValidateClaimExposures NewLossCompletion",
					MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_NewLossCompletion, "click", "click");
			break;
		case "ValidateClaimExposures ValidForISO":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures,
					"moveToElement", "moveToElement");
			GuidewireAutomate("ValidateClaimExposures ValidForISO",
					MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_ValidForISO, "click", "click");
			break;
		case "ValidateClaimExposures SendToExternalSystem":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures,
					"moveToElement", "moveToElement");
			GuidewireAutomate("ValidateClaimExposures SendToExternalSystem",
					MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_SendToExternalSystem, "click", "click");
			break;
		case "ValidateClaimExposures AbilityToPay":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures,
					"moveToElement", "moveToElement");
			GuidewireAutomate("ValidateClaimExposures AbilityToPay",
					MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_AbilityToPay, "click", "click");
			break;
		case "Validate Policy":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "click", "click");
			break;
		case "ValidatePolicy Loadandsave":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement",
					"moveToElement");
			GuidewireAutomate("ValidatePolicy Loadandsave",
					MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_LoadAndSave, "click", "click");
			break;
		case "ValidatePolicy NewLossCompletion":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement",
					"moveToElement");
			GuidewireAutomate("ValidatePolicy NewLossCompletion",
					MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_NewLossCompletion, "click", "click");
			break;
		case "ValidatePolicy ValidForISO":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement",
					"moveToElement");
			GuidewireAutomate("ValidatePolicy ValidForISO",
					MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_ValidForISO, "click", "click");
			break;
		case "ValidatePolicy SendToExternalSystem":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement",
					"moveToElement");
			GuidewireAutomate("ValidatePolicy SendToExternalSystem",
					MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_SendToExternalSystem, "click", "click");
			break;
		case "ValidatePolicy AbilityToPay":
			GuidewireAutomate("Actions", Menu_ActionsCC, "click", "click");
			GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement",
					"moveToElement");
			GuidewireAutomate("ValidatePolicy AbilityToPay",
					MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_AbilityToPay, "click", "click");
			break;

		/*
		 * Claim Details - Menu Links
		 */
		case "Summary":
			GuidewireAutomate("Summary", MenuCC_Claim_Summary, "click", "click");
			break;
		case "Overview":
			GuidewireAutomate("Summary Overview", MenuCC_Claim_Summary_Overview, "click", "click");
			break;
		case "Status":
			GuidewireAutomate("Summary Status", MenuCC_Claim_Summary_Status, "click", "click");
			break;
		case "Health Metrics":
			GuidewireAutomate("Summary Health Metrics", MenuCC_Claim_Summary_HealthMetrics, "click", "click");
			break;
		case "Workplan":
			GuidewireAutomate("Workplan", MenuCC_Claim_Workplan, "click", "click");
			break;
		case "Loss Details":
			GuidewireAutomate("Loss Details", MenuCC_Claim_LossDetails, "click", "click");
			break;
		case "Loss Details General":
			GuidewireAutomate("Loss Details", MenuCC_Claim_LossDetails, "click", "click");
			GuidewireAutomate("General", MenuCC_Claim_LossDetails_General, "click", "click");
			break;
		case "Loss Details Asociations":
			GuidewireAutomate("Loss Details", MenuCC_Claim_LossDetails, "click", "click");
			GuidewireAutomate("Asociations", MenuCC_Claim_LossDetails_Asociations, "click", "click");
			break;
		case "Loss Details SpecialInvestigationDetails":
			GuidewireAutomate("Loss Details", MenuCC_Claim_LossDetails, "click", "click");
			GuidewireAutomate("Special Investigation Details", MenuCC_Claim_LossDetails_SpecialInvestigationDetails,
					"click", "click");
			break;
		case "Medical Details":
			GuidewireAutomate("Medical Details", MenuCC_Claim_MedicalDetails, "click", "click");
			break;
		case "Indemnity":
			GuidewireAutomate("Indemnity", MenuCC_Claim_Indemnity, "click", "click");
			break;
		case "Exposures":
			GuidewireAutomate("Exposures", MenuCC_Claim_Exposures, "click", "click");
			break;
		case "Reinsurance":
			GuidewireAutomate("Reinsurance", MenuCC_Claim_Reinsurance, "click", "click");
			break;
		case "Parties Involved":
			GuidewireAutomate("PartiesInvolved", MenuCC_Claim_PartiesInvolved, "click", "click");
			break;
		case "Parties Involved Contacts":
			GuidewireAutomate("Parties Involved", MenuCC_Claim_PartiesInvolved, "click", "click");
			GuidewireAutomate("Contacts", MenuCC_Claim_PartiesInvolved_Contacts, "click", "click");
			break;
		case "Parties Involved Users":
			GuidewireAutomate("PartiesInvolved", MenuCC_Claim_PartiesInvolved, "click", "click");
			GuidewireAutomate("Users", MenuCC_Claim_PartiesInvolved_Users, "click", "click");
			break;
		case "Policy":
			GuidewireAutomate("Policy", MenuCC_Claim_Policy, "click", "click");
			break;
		case "Policy General":
			GuidewireAutomate("Policy", MenuCC_Claim_Policy, "click", "click");
			GuidewireAutomate("General", MenuCC_Claim_Policy_General, "click", "click");
			break;
		case "Policy Vehicles":
			GuidewireAutomate("Policy", MenuCC_Claim_Policy, "click", "click");
			GuidewireAutomate("Vehicles", MenuCC_Claim_Policy_Vehicle, "click", "click");
			break;
		case "Policy Endorsements":
			GuidewireAutomate("Policy", MenuCC_Claim_Policy, "click", "click");
			GuidewireAutomate("Endorsements", MenuCC_Claim_Policy_Endorsements, "click", "click");
			break;
		case "Policy Aggregate Limits":
			GuidewireAutomate("Policy", MenuCC_Claim_Policy, "click", "click");
			GuidewireAutomate("Aggregate Limits", MenuCC_Claim_Policy_AggregateLimits, "click", "click");
			break;
		case "Financials":
			GuidewireAutomate("Financials", MenuCC_Claim_Financials, "click", "click");
			break;
		case "Financials Summary":
			GuidewireAutomate("Financials", MenuCC_Claim_Financials, "click", "click");
			GuidewireAutomate("Summary", MenuCC_Claim_Financials_Summary, "click", "click");
			break;
		case "Financials Transactions":
			GuidewireAutomate("Financials", MenuCC_Claim_Financials, "click", "click");
			GuidewireAutomate("Transactions", MenuCC_Claim_Financials_Transactions, "click", "click");
			break;
		case "Financials Checks":
			GuidewireAutomate("Financials", MenuCC_Claim_Financials, "click", "click");
			GuidewireAutomate("Checks", MenuCC_Claim_Financials_Checks, "click", "click");
			break;
		case "Notes":
			GuidewireAutomate("Notes", MenuCC_Claim_Notes, "click", "click");
			break;
		case "Documents":
			GuidewireAutomate("Documents", MenuCC_Claim_Documents, "click", "click");
			break;
		case "Plan of Action":
			GuidewireAutomate("Plan of Action", MenuCC_Claim_PlanofAction, "click", "click");
			break;
		case "PlanofAction Evaluations":
			GuidewireAutomate("Plan of Action", MenuCC_Claim_PlanofAction, "click", "");
			GuidewireAutomate("Evaluations", MenuCC_Claim_PlanofAction_Evaluations, "click", "click");
			break;
		case "PlanofAction Negotiations":
			GuidewireAutomate("Plan of Action", MenuCC_Claim_PlanofAction, "click", "click");
			GuidewireAutomate("Negotiations", MenuCC_Claim_PlanofAction_Negotiations, "click", "click");
			break;
		case "Services":
			GuidewireAutomate("Services", MenuCC_Claim_Services, "click", "click");
			break;
		case "Litigation":
			GuidewireAutomate("Litigation", MenuCC_Claim_Litigation, "click", "click");
			break;
		case "History":
			GuidewireAutomate("History", MenuCC_Claim_History, "click", "click");
			break;
		case "FNOL Snapshot":
			GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "click", "click");
			break;
		case "FNOLSnapshot LossDetails":
			GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "click", "click");
			GuidewireAutomate("Loss Details", MenuCC_Claim_FNOLSnapshot_LossDetials, "click", "click");
			break;
		case "FNOLSnapshot PartiesesInvolved":
			GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "click", "click");
			GuidewireAutomate("Partieses Involved", MenuCC_Claim_FNOLSnapshot_PartiesInvolced, "click", "click");
			break;
		case "FNOLSnapshot Policy":
			GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "click", "click");
			GuidewireAutomate("Policy", MenuCC_Claim_FNOLSnapshot_Policy, "click", "click");
			break;
		case "FNOLSnapshot Exposures":
			GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "click", "click");
			GuidewireAutomate("Exposures", MenuCC_Claim_FNOLSnapshot_Exposure, "click", "click");
			break;
		case "FNOLSnapshot Notes":
			GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "click", "click");
			GuidewireAutomate("Notes", MenuCC_Claim_FNOLSnapshot_Notes, "click", "click");
			break;
		case "FNOLSnapshot Documents":
			GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "click", "click");
			GuidewireAutomate("Documents", MenuCC_Claim_FNOLSnapshot_Document, "click", "click");
			break;
		case "FNOLSnapshot AdditionalFileds":
			GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "click", "click");
			GuidewireAutomate("Additional Fileds", MenuCC_Claim_FNOLSnapshot_AdditionalFileds, "click", "click");
			break;
		case "Calendar":
			GuidewireAutomate("Calendar", MenuCC_Claim_Calendar, "click", "click");
			break;
		case "My Calendar":
			GuidewireAutomate("Calendar", MenuCC_Claim_Calendar, "click", "click");
			GuidewireAutomate("My Calendar", MenuCC_Claim_Calendar_MyCalender, "click", "click");
			break;
		case "Supervisor Calender":
			GuidewireAutomate("Calendar", MenuCC_Claim_Calendar, "click", "click");
			GuidewireAutomate("Supervisor Calender", MenuCC_Claim_Calendar_SupervisorCalender, "click", "click");
			break;

		/*
		 * Administration
		 */

		/*
		 * Users&Security
		 */
		case "UsersAndSecurity":
			GuidewireAutomate("Users and Security", MenuCC_Administration_UsersAndSecurity, "click", "click");
			break;
		case "Users":
			GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "click", "click");
			GuidewireAutomate("Users", MenuCC_UserAndSecurity_Users, "click", "click");
			break;
		case "Groups":
			GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "click", "click");
			GuidewireAutomate("Groups", MenuCC_UserAndSecurity_Groups, "click", "click");
			break;
		case "Roles":
			GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "click", "click");
			GuidewireAutomate("Roles", MenuCC_UserAndSecurity_Roles, "click", "click");
			break;
		case "Regions":
			GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "click", "click");
			GuidewireAutomate("Regions", MenuCC_UserAndSecurity_Regions, "click", "click");
			break;
		case "Security Zones":
			GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "click", "click");
			GuidewireAutomate("Security Zones", MenuCC_UserAndSecurity_SecurityZones, "click", "click");
			break;
		case "Authority Limit Profile":
			GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "click", "click");
			GuidewireAutomate("Authority Limit Profile", MenuCC_UserAndSecurity_AuthorityLimitProfile, "click",
					"click");
			break;
		case "Attributes":
			GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "click", "click");
			GuidewireAutomate("Attributes", MenuCC_UserAndSecurity_Attributes, "click", "click");
			break;

		/*
		 * SpecialHandling
		 */
		case "Accounts":
			GuidewireAutomate("Special Handling", MenuCC_Administration_SpecialHandling, "click", "click");
			GuidewireAutomate("Accounts", MenuCC_SpecialHandling_Accounts, "click", "click");
			break;
		case "Service Tiers":
			GuidewireAutomate("Special Handling", MenuCC_Administration_SpecialHandling, "click", "click");
			GuidewireAutomate("Service Tiers", MenuCC_SpecialHandling_ServiceTiers, "click", "click");
			break;

		/*
		 * BusinessSettings
		 */
		case "Business Rules":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "click", "click");
			break;
		case "Activity Rules":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "click", "click");
			GuidewireAutomate("Activity Rules", MenuCC_BusinessSettings_BusinessRules_ActvityRules, "click", "click");
			break;
		case "Exposure Rules":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "click", "click");
			GuidewireAutomate("Exposure Rules", MenuCC_BusinessSettings_BusinessRules_ExposureRules, "click", "click");
			break;
		case "Reserve Rules":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "click", "click");
			GuidewireAutomate("Reserve Rules", MenuCC_BusinessSettings_BusinessRules_ReserveRules, "click", "click");
			break;
		case "Import Export Status":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "click", "click");
			GuidewireAutomate("Import Export Status", MenuCC_BusinessSettings_BusinessRules_ExportImportStatus, "click",
					"click");
			break;
		case "Activity Patterns":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Activity Patterns", MenuCC_BusinessSettings_ActivityPatterns, "click", "click");
			break;
		case "Business Week":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Business Week", MenuCC_BusinessSettings_BusinessWeek, "click", "click");
			break;
		case "Catastrophes":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Catastrophes", MenuCC_BusinessSettings_Catastrophes, "click", "click");
			break;
		case "Coverage Verification":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Coverage Verification", MenuCC_BusinessSettings_CoverageVerification, "click", "click");
			break;
		case "Invalid Coverage For Cause":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Coverage Verification", MenuCC_BusinessSettings_CoverageVerification, "click", "click");
			GuidewireAutomate("Invalid Coverage For Cause",
					MenuCC_BusinessSettings_CoverageVerification_InvalidCoverageForCause, "click", "click");
			break;
		case "Incompatible New Exposure":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Coverage Verification", MenuCC_BusinessSettings_CoverageVerification, "click", "click");
			GuidewireAutomate("Incompatible New Exposure",
					MenuCC_BusinessSettings_CoverageVerification_IncompatibleNewExposure, "click", "click");
			break;
		case "Possible Invalid Coverage":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Coverage Verification", MenuCC_BusinessSettings_CoverageVerification, "click", "click");
			GuidewireAutomate("Possible Invalid Coverage",
					MenuCC_BusinessSettings_CoverageVerification_PossibleInvalidCoverage, "click", "click");
			break;
		case "Holidays":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Holidays", MenuCC_BusinessSettings_Holidays, "click", "click");
			break;
		case "ICD Codes":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("ICD Codes", MenuCC_BusinessSettings_ICDCodes, "click", "click");
			break;
		case "Metrics & Thresholds":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Metrics & Thresholds", MenuCC_BusinessSettings_MetricsAndThresholds, "click", "click");
			break;
		case "Reinsurance Thresholds":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("Reinsurance Thresholds", MenuCC_BusinessSettings_ReinsuranceThresholds, "click",
					"click");
			break;
		case "WC Parameters":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "click", "click");
			break;
		case "Benefit Parameters":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "click", "click");
			GuidewireAutomate("Benefit Parameters", MenuCC_BusinessSettings_WCParameters_BenefitParameters, "click",
					"click");
			break;
		case "PPD Min Max":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "click", "click");
			GuidewireAutomate("PPD Min Max", MenuCC_BusinessSettings_WCParameters_PPDMinMax, "click", "click");
			break;
		case "PPD Weeks":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "click", "click");
			GuidewireAutomate("PPD Weeks", MenuCC_BusinessSettings_WCParameters_PPDWeeks, "click", "click");
			break;
		case "Compensability Parameters":
			GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "click", "click");
			GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "click", "click");
			GuidewireAutomate("Compensability Parameters",
					MenuCC_BusinessSettings_WCParameters_CompensabilityParameters, "click", "click");
			break;
		// Monitoring SubMenu
		case "Message Queues":
			GuidewireAutomate("Monitoring", MenuCC_Administration_Monitoring, "click", "click");
			GuidewireAutomate("Message Queues", MenuCC_Monitoring_MessageQueues, "click", "click");
			break;
		case "Workflows":
			GuidewireAutomate("Monitoring", MenuCC_Administration_Monitoring, "click", "click");
			GuidewireAutomate("Workflows", MenuCC_Monitoring_WorkFlows, "click", "click");
			break;
		case "Workflow Statistics":
			GuidewireAutomate("Monitoring", MenuCC_Administration_Monitoring, "click", "click");
			GuidewireAutomate("Workflow Statistics", MenuCC_Monitoring_WorkFlowsStatistics, "click", "click");
			break;
		// Utilities SubMenu
		case "Import Data":
			GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "click", "click");
			GuidewireAutomate("Import Data", MenuCC_Utilities_ImportData, "click", "click");
			break;
		case "Export Data":
			GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "click", "click");
			GuidewireAutomate("Export Data", MenuCC_Utilities_ExportData, "click", "click");
			break;
		case "Script Parameters":
			GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "click", "click");
			GuidewireAutomate("Script Parameters", MenuCC_Utilities_ScriptParameters, "click", "click");
			break;
		case "Data Change":
			GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "click", "click");
			GuidewireAutomate("Data Change", MenuCC_Utilities_DataChange, "click", "click");
			break;
		case "Inbound Files":
			GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "click", "click");
			GuidewireAutomate("Inbound Files", MenuCC_Utilities_InboundFiles, "click", "click");
			break;
		case "Outbound Files":
			GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "click", "click");
			GuidewireAutomate("Outbound Files", MenuCC_Utilities_OutboundFiles, "click", "click");
			break;
		case "Runtime Properties":
			GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "click", "click");
			GuidewireAutomate("Runtime Properties", MenuCC_Utilities_RuntimeProperties, "click", "click");
			break;

		default:
			throw new IOException("No support for ClaimsCenter Menu : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.PASS, "Navigation to ClaimsCenter Menu : " + Menu + " is succesful");
	}

}
