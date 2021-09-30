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
	 * -------------------------------------------------------------- menuNavigation --------------------------------------------------------------
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
				GuidewireAutomate("Sub Number", TabPC_Policy_PolicyNumber, "sendKeys", Value);
				GuidewireAutomate("Sub Search", TabPC_Policy_PolicyNumber_Search, "clickAndwait", "click");
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
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Change Policy", MenuPC_Actions_Policy_NewPolicyTransaction_ChangePolicy, "click", "click");
				break;
			case "Cancel Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Cancel Policy", MenuPC_Actions_Policy_NewPolicyTransaction_CancelPolicy, "click", "click");
				break;
			case "Renew Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Renew Policy", MenuPC_Actions_Policy_NewPolicyTransaction_RenewPolicy, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Reinstate Policy" :
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

				break;
			default :
				throw new IOException("No support for Menu : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to PolicyCenter Menu : " + Menu + " is Succesful");
	}

	/*
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ---- BillingCenter Tabs
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 */

	public static void bcTabNavigation(String Tab, String Value) throws Throwable {

		switch (Tab) {

			case "My Activities" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("MyActivities", TabBC_Desktop_MyActivities, "clickAndwait", "click");
				break;
			case "My Approval Requests" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("MyApprovalRequests", TabBC_Desktop_MyApprovalRequests, "clickAndwait", "click");
				break;
			case "My Trouble Tickets" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("MyTroubleTickets", TabBC_Desktop_MyTroubleTickets, "clickAndwait", "click");
				break;
			case "My Delinquencies" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("MyDelinquencies", TabBC_Desktop_MyDelinquencies, "clickAndwait", "click");
				break;
			case "Disbursements" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Disbursements", TabBC_Desktop_Disbursements, "clickAndwait", "click");
				break;
			case "Suspense Payments" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("SuspensePayments", TabBC_Desktop_SuspensePayments, "clickAndwait", "click");
				break;
			case "My Agency Items" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("MyAgencyItems", TabBC_Desktop_MyAgencyItems, "clickAndwait", "click");
				break;
			case "Held Charges" :
				GuidewireAutomate("Actions", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("HeldCharges", TabBC_Desktop_HeldCharges, "clickAndwait", "click");
				break;

			case "New Account" :
				GuidewireAutomate("Account", TabBC_Account, "clickAndwait", "click");
				GuidewireAutomate("NewAccount", MenuBC_Actions_NewAccount, "clickAndwait", "click");
				break;
			case "Acct Search" :
				GuidewireAutomate("Account Tab", TabBC_Account_dd, "clickAndwait", "click");
				GuidewireAutomate("Account Number", TabBC_Account_AccountNumber, "clearANDsendKeys", Value);
				GuidewireAutomate("AccountNumberSearch", TabBC_Account_AccountNumber_Search, "clickAndwait", "click");
				break;

			case "Policy Search" :
				GuidewireAutomate("Policy Tab", TabBC_Policy_dd, "clickAndwait", "click");
				GuidewireAutomate("Account Number", TabBC_Policy_PolicyNumber, "clearANDsendKeys", Value);
				GuidewireAutomate("AccountNumberSearch", TabBC_Policy_PolicyNumber_Search, "clickAndwait", "click");
				break;

			case "Producer Search" :
				GuidewireAutomate("Producer Tab", TabBC_Producer_dd, "clickAndwait", "click");
				GuidewireAutomate("Producer Name", TabBC_Producer_ProducerName, "clearANDsendKeys", Value);
				GuidewireAutomate("ProducerName Search", TabBC_Producer_ProducerNameSearch, "clickAndwait", "click");
				break;

			/*
			 * Search
			 */
			case "Search Accounts" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Accounts", TabBC_Search_Accounts, "clickAndwait", "click");
			case "Search Policies" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Policies", TabBC_Search_Policies, "clickAndwait", "click");
				break;
			case "Search Contacts" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Contacts", TabBC_Search_Contacts, "clickAndwait", "click");
				break;
			case "Search Invoices" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Invoices", TabBC_Search_Invoices, "clickAndwait", "click");
				break;
			case "Search Payments" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Payments", TabBC_Search_Payments, "clickAndwait", "click");
				break;
			case "Search Producers" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Producers", TabBC_Search_Producers, "clickAndwait", "click");
				break;
			case "Search Transactions" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Transactions", TabBC_Search_Transactions, "clickAndwait", "click");
				break;
			case "Search Activities" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Activities", TabBC_Search_Activities, "clickAndwait", "click");
				break;
			case "Search Trouble Tickets" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search TroubleTickets", TabBC_Search_TroubleTickets, "clickAndwait", "click");
				break;
			case "Search Delinquency Processes" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search DelinquencyProcesses", TabBC_Search_DelinquencyProcesses, "clickAndwait", "click");
				break;
			case "Search Disbursements" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Disbursements", TabBC_Search_Disbursements, "clickAndwait", "click");
				break;
			case "Search Outgoing Producer Payments" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search OutgoingProducerPayments", TabBC_Search_OutgoingProducerPayments, "click", "click");
				break;
			case "Search Payment Requests" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search PaymentRequests", TabBC_Search_PaymentRequests, "clickAndwait", "click");
				break;
			case "Search Direct Bill Suspense Items " :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search DirectBillSuspenseItem", TabBC_Search_DirectBillSuspenseItems, "clickAndwait", "click");
				break;

			/*
			 * AdministrationTab
			 */
			case "Users_and_Security" :
				GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "clickAndwait", "click");
				GuidewireAutomate("Users_and_Security", TabBC_Administration_UsersAndSecurity, "clickAndwait", "click");
				break;
			case "Business Settings" :
				GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "clickAndwait", "click");
				GuidewireAutomate("Business_Settings", TabBC_Administration_BusinessSettings, "clickAndwait", "click");
				break;
			case "Monitoring" :
				GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "clickAndwait", "click");
				GuidewireAutomate("Monitoring", TabBC_Administration_Monitoring, "clickAndwait", "click");
				break;
			case "Utilities" :
				GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "clickAndwait", "click");
				GuidewireAutomate("Utilities", TabBC_Administration_Utilities, "clickAndwait", "click");
				break;

			default :
				throw new IOException("No support for Tab : " + Tab);
		}

		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to BillingCenter Tab : " + Tab + " is Succesful");

	}

	/*
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ---- BillingCenter menu
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 */

	public static void bcMenuNavigation(String Menu) throws Throwable {
		switch (Menu) {

			case "My Activities" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Payment", MenuBC_Desktop_MyActivities, "clickAndwait", "click");
				break;

			case "New Assigned Activity" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Payment", MenuBC_Desktop_Actions_NewAssignedActivity, "clickAndwait", "click");
				break;
			case "New Shared Activity" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Shared Activity", MenuBC_Desktop_Actions_NewSharedActivity, "clickAndwait", "click");
				break;
			case "Preferences" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Preferences", MenuBC_Desktop_Actions_Preferences, "clickAndwait", "click");
				break;

			case "New Account" :
				GuidewireAutomate("Account Tab", TabBC_Account, "clickAndwait", "click");
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Account", MenuBC_Actions_NewAccount, "clickAndwait", "click");
				break;
			case "Accounts" :
				GuidewireAutomate("Account Tab", TabBC_Account, "clickAndwait", "click");
				GuidewireAutomate("New Account", MenuBC_Accounts, "clickAndwait", "click");
				break;

			case "Add Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Add Policy", MenuBC_Account_Actions_AddPolicy, "clickAndwait", "click");
				break;
			case "New Payment" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Payment", MenuBC_Account_Actions_NewPayment, "clickAndwait", "click");
				break;
			case "New Direct Bill Payment" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Payment", MenuBC_Account_Actions_NewPayment, "moveToElement", "");
				GuidewireAutomate("New Payment", MenuBC_Account_Actions_NewPayment_NewDirectBillPayment, "clickAndwait", "click");
				break;
			case "New Transaction" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Transaction", MenuBC_Account_Actions_NewTransaction, "clickAndwait", "click");
				break;
			case "Transfer Policies " :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Transfer Policies", MenuBC_Account_Actions_TransferPolicies, "clickAndwait", "click");
				break;
			case "New Note" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Note", MenuBC_Account_Actions_NewNote, "clickAndwait", "click");
				break;
			case "New Document" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Document", MenuBC_Account_Actions_NewDocument, "clickAndwait", "click");
				break;
			case "New Email" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Email", MenuBC_Account_Actions_NewEmail, "clickAndwait", "click");
				break;
			/*
			 * Account Menu Links
			 */
			case "Summary" :
				GuidewireAutomate("Summary", MenuBC_Account_Summary, "clickAndwait", "click");
				break;
			case "Details" :
				GuidewireAutomate("Details", MenuBC_Account_Details, "clickAndwait", "click");
				break;
			case "Contacts" :
				GuidewireAutomate("Contacts", MenuBC_Account_Contacts, "clickAndwait", "click");
				break;
			case "Funds Tracking" :
				GuidewireAutomate("Funds Tracking", MenuBC_Account_FundsTracking, "clickAndwait", "click");
				break;
			case "Payments" :
				GuidewireAutomate("Payments", MenuBC_Account_Payments, "clickAndwait", "click");
				break;
			case "Charges" :
				GuidewireAutomate("New Email", MenuBC_Account_Charges, "clickAndwait", "click");
				break;
			case "Disbursements" :
				GuidewireAutomate("New Email", MenuBC_Account_Disbursements, "clickAndwait", "click");
				break;
			case "Transactions" :
				GuidewireAutomate("New Email", MenuBC_Account_Transactions, "clickAndwait", "click");
				break;
			case "Collateral" :
				GuidewireAutomate("New Email", MenuBC_Account_Collateral, "clickAndwait", "click");
				break;
			case "Policies" :
				GuidewireAutomate("New Email", MenuBC_Account_Policies, "clickAndwait", "click");
				break;
			case "History" :
				GuidewireAutomate("New Email", MenuBC_Account_History, "clickAndwait", "click");
				break;
			case "Evaluation" :
				GuidewireAutomate("New Email", MenuBC_Account_Evaluation, "clickAndwait", "click");
				break;
			case "Invoices" :
				GuidewireAutomate("Invoices", MenuBC_Account_Invoices, "clickAndwait", "click");
				break;
			case "Invoice Streams" :
				GuidewireAutomate("Invoice Streams", MenuBC_Account_InvoiceStreams, "clickAndwait", "click");
				break;
			case "TroubleTickets" :
				GuidewireAutomate("TroubleTickets", MenuBC_Account_TroubleTickets, "clickAndwait", "click");
				break;
			case "Documents" :
				GuidewireAutomate("Documents", MenuBC_Account_Documents, "clickAndwait", "click");
				break;
			case "Ledger" :
				GuidewireAutomate("Ledger", MenuBC_Account_Ledger, "clickAndwait", "click");
				break;
			case "Journal" :
				GuidewireAutomate("Journal", MenuBC_Account_Journal, "clickAndwait", "click");
				break;
			case "Delinquencies" :
				GuidewireAutomate("Delinquencies", MenuBC_Account_Delinquencies, "clickAndwait", "click");
				break;
			/*
			 * Policy
			 */
			case "Change Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Change Policy", MenuBC_Policy_Actions_ChangePolicy, "clickAndwait", "click");
				break;
			case "Renew Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Renew Policy", MenuBC_Policy_Actions_RenewPolicy, "clickAndwait", "click");
				break;

			case "Payment Schedule" :
				GuidewireAutomate("Payment Schedule", MenuBC_Policy_PaymentSchedule, "clickAndwait", "click");
				break;

			/*
			 * Producer
			 */
			case "New Producer" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Producer", TabBC_Producer_Actions_NewProducer, "clickAndwait", "click");
				break;

			case "New Comm Payment" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Comm Payment", MenuBC_Producer_Actions_NewCommPayment, "clickAndwait", "click");
				break;
			case "Commission Write-Off" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Commission Write-Off", MenuBC_Producer_Actions_CommissionWriteOff, "clickAndwait", "click");
				break;
			case "Commission Recovery Write-Off" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Commission Recovery Write-Off", MenuBC_Producer_Actions_CommissionRecoveryWriteOff, "clickAndwait", "click");
				break;
			case "Return Commission" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Return Commission", MenuBC_Producer_Actions_ReturnCommission, "clickAndwait", "click");
				break;
			case "New Agency Bill Payment" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Agency Bill Payment", MenuBC_Producer_Actions_NewAgencyBillPayment, "click", "click");
				break;
			case "Transfer Funds" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Transfer Funds", MenuBC_Producer_Actions_TransferFunds, "clickAndwait", "click");
				break;
			case "Write-Off" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Write-Off", MenuBC_Producer_Actions_WriteOff, "clickAndwait", "click");
				break;
			case "Negative Write-Off" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Negative Write-Off", MenuBC_Producer_Actions_NegativeWriteOff, "clickAndwait", "click");
				break;

			case "Direct Bill Commission Statements" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Negative Write-Off", MenuBC_Producer_DirectBillCommissionStatements, "clickAndwait", "click");
				break;
			case "Agency Bill Disbursements" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Negative Write-Off", MenuBC_Producer_AgencyBillDisbursements, "clickAndwait", "click");
				break;

			/*
			 * Administration
			 */
			case "New Billing Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewBillingPlan", MenuBC_Administration_Actions_NewBillingPlan, "clickAndwait", "click");
				break;
			case "New Payment Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewPaymentPlan", MenuBC_Administration_Actions_NewPaymentPlan, "clickAndwait", "click");
				break;
			case "New Commission Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewCommissionPlan", MenuBC_Administration_Actions_NewCommissionPlan, "clickAndwait", "click");
				break;
			case "New Delinquency Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewDelinquencyPlan", MenuBC_Administration_Actions_NewDelinquencyPlan, "clickAndwait", "click");
				break;
			case "New Agency Bill Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewAgencyBillPlan", MenuBC_Administration_Actions_NewAgencyBillPlan, "clickAndwait", "click");
				break;
			case "New Return Premium Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewReturnPremiumPlan", MenuBC_Administration_Actions_NewReturnPremiumPlan, "click", "click");
				break;
			case "New Payment Allocation Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewPaymentAllocationPlan", MenuBC_Administration_Actions_NewPaymentAllocationPlan, "clickAndwait", "click");
				break;
			case "New Collection Agency" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewCollectionAgency", MenuBC_Administration_Actions_NewCollectionAgency, "click", "click");
				break;
			case "New Charge Pattern" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewChargePattern", MenuBC_Administration_Actions_NewChargePattern, "clickAndwait", "click");
				break;
			case "New User" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewUser", MenuBC_Administration_Actions_NewUser, "clickAndwait", "click");
				break;
			case "New Role" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewRole", MenuBC_Administration_Actions_NewRole, "clickAndwait", "click");
				break;
			case "New Group" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewGroup", MenuBC_Administration_Actions_NewGroup, "clickAndwait", "click");
				break;
			case "New Authority Limit Profile" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Actions_NewAuthorityLimitProfile, "clickAndwait", "click");
				break;
			/*
			 * Menu Links
			 */
			case "Users Security" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_UsersAndSecurity, "clickAndwait", "click");
				break;
			case "Users" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_UsersAndSecurity_Users, "click", "click");
				break;
			case "Business Settings" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_BusinessSettings, "clickAndwait", "click");
				break;
			case "Activity Patterns" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_BusinessSettings_ActivityPatterns, "clickAndwait", "click");
				break;
			case "Monitoring" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Monitoring, "clickAndwait", "click");
				break;
			case "Message Queues" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Monitoring_MessageQueues, "click", "click");
				break;
			case "Utilities" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Utilities, "clickAndwait", "click");
				break;
			case "Import Data" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Utilities_ImportData, "clickAndwait", "click");
				break;
			default :
				throw new IOException("No support for Tab : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to BillingCenter Menu : " + Menu + " is succesful");

	}

	/*
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ---- ClaimsCenter
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 */
	public static void ccTabNavigation(String Tab, String Value) throws Throwable {

		switch (Tab) {

			/*
			 * Desktop
			 */
			case "Desktop" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop, "clickAndwait", "click");
				break;
			case "Activities" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Activities", TabCC_Desktop_Activities, "clickAndwait", "click");
				break;
			case "Claims" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Claims", TabCC_Desktop_Claims, "clickAndwait", "click");
				break;
			case "Subrogations" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Subrogations", TabCC_Desktop_Subrogations, "clickAndwait", "click");
				break;
			case "Exposures" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Exposures", TabCC_Desktop_Exposures, "clickAndwait", "click");
				break;
			case "Pending Assignments" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("PendingAssignments", TabCC_Desktop_PendingAssignments, "clickAndwait", "click");
				break;
			case "Queues" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Queues", TabCC_Desktop_Queues, "clickAndwait", "click");
				break;
			case "Calendar" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Calendar", TabCC_Desktop_Calendar, "clickAndwait", "click");
				break;
			case "Bulk Invoices" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("BulkInvoices", TabCC_Desktop_BulkInvoices, "clickAndwait", "click");
				break;

			/*
			 * Claims
			 */
			case "Claim" :
				GuidewireAutomate("Claim Tab", TabCC_Claim, "clickAndwait", "click");
				break;
			case "New Claim" :
				GuidewireAutomate("Claims Tab", TabCC_Claim_dd, "clickAndwait", "click");
				GuidewireAutomate("New Claim", TabCC_Claim_NewClaim, "clickAndwait", "click");
				break;
			case "Claim Search" :
				String strClaimNumber = null;
				lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("searchValues", strTestCaseName);

				strClaimNumber = lhm_TestCase_Table_Data.get("ClaimsNumber");
				GuidewireAutomate("Claims Tab", TabCC_Claim_dd, "clickAndwait", "click");
				GuidewireAutomate("Claim Number", TabCC_Claim_ClaimNumber, "clearANDsendKeys", strClaimNumber);
				GuidewireAutomate("Claim Number Search", TabCC_Claim_ClaimNumber_Search, "clickAndwait", "click");
				lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
				lhm_TestCase_Table_Data.clear();
				break;
			/*
			 * Search
			 */
			case "Search" :
				GuidewireAutomate("Claim Tab", TabCC_Search, "clickAndwait", "click");
				break;
			case "Search Claims" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Claims", TabCC_Search_Claims, "clickAndwait", "click");
				break;
			case "Search Activities" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Activities", TabCC_Search_Activities, "clickAndwait", "click");
				break;
			case "Search Checks" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Checks", TabCC_Search_Checks, "clickAndwait", "click");
				break;
			case "Search Recoveries" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Recoveries", TabCC_Search_Recoveries, "clickAndwait", "click");
				break;
			case "Search Bulk Invoices" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Bulk Invoices", TabCC_Search_BulkInvoices, "clickAndwait", "click");
				break;

			/*
			 * Address Book
			 */
			case "Address Book" :
				GuidewireAutomate("Address Search Tab", TabCC_AddressBook, "click", "Null");
				break;
			/*
			 * DashBoard
			 */
			case "Dashboard" :
				GuidewireAutomate("DashBoard Tab", TabCC_DashBoard, "click", "Null");
				break;
			/*
			 * Team
			 */
			case "Team" :
				GuidewireAutomate("Team Tab", TabCC_Team, "click", "Null");
				break;
			/*
			 * Administration
			 */
			case "Administration" :
				GuidewireAutomate("Administration Tab", TabCC_Administration, "clickAndwait", "click");
				break;

			case "Print User Group Tree" :
				GuidewireAutomate("AdministrationTab dd", TabCC_Adminsitration_dd, "click", "Null");
				GuidewireAutomate("Print User Group Tree", TabCC_Adminsitration_PrintUserGroupTree, "click", "Null");
				break;

			default :
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
			case "Statistics" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Statistics", MenuCC_Desktop_Actions_Statistics, "clickAndwait", "click");
				break;
			case "Preferences" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Preferences", MenuCC_Desktop_Actions_Preferences, "clickAndwait", "click");
				break;
			case "VacationStatus" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("VacationStatus", MenuCC_Desktop_Actions_VacationStatus, "clickAndwait", "click");
				break;
			
			
			case "Bulk Invoices" :
				GuidewireAutomate("BulkInvoices", MenuCC_Desktop_BulkInvoices, "clickAndwait", "click");
				break;
				
			// New
			case "New Note" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Note", MenuCC_Claim_Actions_NewNote, "clickAndwait", "click");
				break;
			case "New Email" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Email", MenuCC_Claim_Actions_New_Email, "clickAndwait", "click");
				break;
			case "New Matter" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Matter", MenuCC_Claim_Actions_New_Matter, "clickAndwait", "click");
				break;
			case "New Evaluation" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Evaluation", MenuCC_Claim_Actions_New_Evaluation, "clickAndwait", "click");
				break;
			case "New Negotiation" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Negotiation", MenuCC_Claim_Actions_New_Negotiation, "clickAndwait", "click");
				break;
			case "New Service" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Service", MenuCC_Claim_Actions_New_Service, "clickAndwait", "click");
				break;

			// New Transaction
			case "Reserve" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Reserve", MenuCC_Claim_Actions_NewTransaction_Reserve, "clickAndwait", "click");
				break;
			case "Check" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Reserve", MenuCC_Claim_Actions_NewTransaction_Check, "clickAndwait", "click");
				break;
			case "Other" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Other", MenuCC_Claim_Actions_NewTransaction_Other, "moveToElement", "click");
				break;
			case "Manual Check" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Other", MenuCC_Claim_Actions_NewTransaction_Other, "moveToElement", "moveToElement");
				GuidewireAutomate("Manual Check", MenuCC_Claim_Actions_NewTransaction_Other_ManualCheck, "clickAndwait", "click");
				break;
			case "Recovery" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "clickAndwait");
				GuidewireAutomate("Other", MenuCC_Claim_Actions_NewTransaction_Other, "moveToElement", "moveToElement");
				GuidewireAutomate("Recovery", MenuCC_Claim_Actions_NewTransaction_Other_Recovery, "clickAndwait", "click");
				break;
			case "Recovery Reserve" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "clickAndwait");
				GuidewireAutomate("Other", MenuCC_Claim_Actions_NewTransaction_Other, "moveToElement", "moveToElement");
				GuidewireAutomate("Recovery Reserve", MenuCC_Claim_Actions_NewTransaction_Other_RecoveryReserve, "click", "click");
				break;
			case "Create from a template" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Create from a template", MenuCC_Claim_Actions_NewDocument_Createfromatemplate, "click", "click");
				break;
			case "Upload Documents" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Upload Documents", MenuCC_Claim_Actions_NewDocument_UploadDocuments, "clickAndwait", "click");
				break;
			case "Indicate existence of a document" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Indicate existence of a document", MenuCC_Claim_Actions_NewDocument_Indicateexistenceofadocument, "clickAndwait", "click");
				break;

			// New Activity
			case "Correspondence" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Correspondence", MenuCC_Claim_Actions_NewActivity_Correspondence, "moveToElement", "moveToElement");
				break;
			case "Send claim acknowledgement letter" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Correspondence", MenuCC_Claim_Actions_NewActivity_Correspondence, "moveToElement", "moveToElement");
				GuidewireAutomate("Send claim acknowledgement letter", MenuCC_Claim_Actions_NewActivity_Correspondence_SendclaimAcknowledgementLetter, "clickAndwait", "click");
				break;
			case "Send letter confirming closure of exposure" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Correspondence", MenuCC_Claim_Actions_NewActivity_Correspondence, "moveToElement", "moveToElement");
				GuidewireAutomate("Send letter confirming closure of exposure", MenuCC_Claim_Actions_NewActivity_Correspondence_SendLetterConfirmingClosureOfExposure, "click", "click");
				break;
			case "Send reservation of rights letter" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Correspondence", MenuCC_Claim_Actions_NewActivity_Correspondence, "moveToElement", "moveToElement");
				GuidewireAutomate("Send reservation of rights letter", MenuCC_Claim_Actions_NewActivity_Interview_GetAStatementFromWitness, "clickAndwait", "click");
				break;
			case "Interview" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Interview", MenuCC_Claim_Actions_NewActivity_Interview, "moveToElement", "moveToElement");
				break;
			case "Get a statement from witness" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Interview", MenuCC_Claim_Actions_NewActivity_Interview, "moveToElement", "moveToElement");
				GuidewireAutomate("Get a statement from witness", MenuCC_Claim_Actions_NewActivity_Interview_GetAStatementFromWitness, "clickAndwait", "click");
				break;
			case "Make initial contact with insured" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Interview", MenuCC_Claim_Actions_NewActivity_Interview, "moveToElement", "moveToElement");
				GuidewireAutomate("Make initial contact with insured", MenuCC_Claim_Actions_NewActivity_Interview_MakeInitialContactWithInsured, "clickAndwait", "click");
				break;
			case "New Mail" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Mail", MenuCC_Claim_Actions_NewActivity_NewMail, "moveToElement", "moveToElement");
				break;
			case "Review new bill received" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Mail", MenuCC_Claim_Actions_NewActivity_NewMail, "moveToElement", "moveToElement");
				GuidewireAutomate("Review new bill received", MenuCC_Claim_Actions_NewActivity_NewMail_ReviewNewBillReceived, "clickAndwait", "click");
				break;
			case "Review new mail" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Mail", MenuCC_Claim_Actions_NewActivity_NewMail, "moveToElement", "moveToElement");
				GuidewireAutomate("Review new mail", MenuCC_Claim_Actions_NewActivity_NewMail_ReviewNewMail, "click", "click");
				break;

			case "Reminder" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Reminder", MenuCC_Claim_Actions_NewActivity_Reminder, "moveToElement", "moveToElement");
				break;
			case "30 day diary" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Reminder", MenuCC_Claim_Actions_NewActivity_Reminder, "moveToElement", "moveToElement");
				GuidewireAutomate("30 day diary", MenuCC_Claim_Actions_NewActivity_Reminder_30DayDiary, "clickAndwait", "click");
				break;
			case "60 day diary" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Reminder", MenuCC_Claim_Actions_NewActivity_Reminder, "moveToElement", "moveToElement");
				GuidewireAutomate("60 day diary", MenuCC_Claim_Actions_NewActivity_Reminder_60DayDiary, "clickAndwait", "click");
				break;
			case "90 day diary" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Reminder", MenuCC_Claim_Actions_NewActivity_Reminder, "moveToElement", "moveToElement");
				GuidewireAutomate("90 day diary", MenuCC_Claim_Actions_NewActivity_Reminder_90DayDiary, "clickAndwait", "click");
				break;
			// Other Reminder Sub-menu Cases need to be added here

			case "Request" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Request", MenuCC_Claim_Actions_NewActivity_Request, "moveToElement", "moveToElement");
				break;
			case "Additional living expenses required" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Request", MenuCC_Claim_Actions_NewActivity_Request, "moveToElement", "moveToElement");
				GuidewireAutomate("Additional living expenses required", MenuCC_Claim_Actions_NewActivity_Request_AdditionalLivingExpensesRequired, "clickAndwait", "click");
				break;
			case "Create Recovery email bill1" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Request", MenuCC_Claim_Actions_NewActivity_Request, "moveToElement", "moveToElement");
				GuidewireAutomate("Create Recovery email bill1", MenuCC_Claim_Actions_NewActivity_Request_CreateRecoveryEmailBill1, "clickAndwait", "click");
				break;
			case "Create Recovery email bill2" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Request", MenuCC_Claim_Actions_NewActivity_Request, "moveToElement", "moveToElement");
				GuidewireAutomate("Create Recovery email bill2", MenuCC_Claim_Actions_NewActivity_Request_CreateRecoveryEmailBill2, "clickAndwait", "click");
				break;
			// Other Request Sub-menu Cases need to be added here

			case "Warning" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Warning", MenuCC_Claim_Actions_NewActivity_Warning, "moveToElement", "moveToElement");
				break;
			case "Unable to close the claim or the exposure" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Warning", MenuCC_Claim_Actions_NewActivity_Warning, "moveToElement", "moveToElement");
				GuidewireAutomate("Unable to close the claim or the exposure", MenuCC_Claim_Actions_NewActivity_Warning_UnableToCloseTheClaimOrTheExposure, "clickAndwait", "click");
				break;

			// Choose by Coverage Vehicle

			case "ChoosebyCoverage Collision" :
				lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
				String strChoosebyCoverage_Vehicle = lhm_TestCase_Table_Data.get("BI_IV_Select");

				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");

				By ChoosebyCoverage_Vehicle = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='" + strChoosebyCoverage_Vehicle + "']");

				GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_Vehicle, "moveToElement", "moveToElement");

				GuidewireAutomate("Collision", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelCollision, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage Comprehensive" :
				lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
				String strChoosebyCoverage_VehicleComprehensive = lhm_TestCase_Table_Data.get("BI_IV_Select");

				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				By ChoosebyCoverage_VehicleComprehensive = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='" + strChoosebyCoverage_VehicleComprehensive + "']");

				GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleComprehensive, "moveToElement", "moveToElement");
				GuidewireAutomate("Comprehensive", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelComprehensive, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage ElectronicEquipment" :
				lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
				String strChoosebyCoverage_VehicleElectronicEquipment = lhm_TestCase_Table_Data.get("BI_IV_Select");

				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				By ChoosebyCoverage_VehicleElectronicEquipment = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='" + strChoosebyCoverage_VehicleElectronicEquipment + "']");

				GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleElectronicEquipment, "moveToElement", "moveToElement");
				GuidewireAutomate("Electronic Equipment", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelElectronicEquipment, "click", "click");
				break;

			case "ChoosebyCoverage RentalReimbursement" :
				lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
				String strChoosebyCoverage_VehicleRentalReimbursement = lhm_TestCase_Table_Data.get("BI_IV_Select");

				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");

				By ChoosebyCoverage_VehicleRentalReimbursement = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='" + strChoosebyCoverage_VehicleRentalReimbursement + "']");

				GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleRentalReimbursement, "moveToElement", "moveToElement");
				GuidewireAutomate("Rental Reimbursement", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelRentalReimbursement, "click", "click");
				break;

			case "ChoosebyCoverage TapeDiscMedia" :
				lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
				String strChoosebyCoverage_VehicleTapeDiscMedia = lhm_TestCase_Table_Data.get("BI_IV_Select");

				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");

				By ChoosebyCoverage_VehicleTapeDiscMedia = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='" + strChoosebyCoverage_VehicleTapeDiscMedia + "']");

				GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleTapeDiscMedia, "moveToElement", "moveToElement");
				GuidewireAutomate("Tape Disc Media", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelTapeDiscMedia, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage TowingAndLabor" :
				lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
				String strChoosebyCoverage_VehicleTowingAndLabor = lhm_TestCase_Table_Data.get("BI_IV_Select");

				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");

				By ChoosebyCoverage_VehicleTowingAndLabor = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='" + strChoosebyCoverage_VehicleTowingAndLabor + "']");

				GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleTowingAndLabor, "moveToElement", "moveToElement");
				GuidewireAutomate("Towing and Labor", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelTowingAndLabor, "clickAndwait", "click");
				break;

			// Choose by Coverage Policy Level Coverage

			case "ChoosebyCoverage Liability Bodily Injury" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Bodily Injury and Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Bodily Injury", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityBodilyInjury, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage Liability Property Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Bodily Injury and Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityPropertyDamage, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage Liability Vehicle Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Bodily Injury and Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Vehicle Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityVehicleDamage, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage Mexico Cov BI" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov BI", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovBI, "clickAndwait", "click");
				break;
			case "ChoosebyCoverage Mexico Cov PD" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov PD", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovPD, "clickAndwait", "click");
				break;
			case "ChoosebyCoverage Mexico Cov Vehicle Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov Vehicle Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovVehicleDamage, "clickAndwait", "click");
				break;
			case "ChoosebyCoverage Mexico Cov Gen Damages" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov Gen Damages", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovGenDamages, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage Medical Payments" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Medical Payments", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MedicalPayments, "click", "click");
				break;

			case "ChoosebyCoverage Underinsured Motorist - Property Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Underinsured Motorist - Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UnderinsuredMotoristPropertyDamage, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage Uninsured Motorist Bodily Injury" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Uninsured Motorist Bodily Injury", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UninsuredMotoristBodilyInjury, "clickAndwait", "click");
				break;
			case "ChoosebyCoverage Uninsured Motorist Property Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Uninsured Motorist Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UninsuredMotoristPropertyDamage, "clickAndwait", "click");
				break;

			// Choose By Coverage Type
			case "Choose by Coverage Type" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage Type", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				break;

			case "Collision" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType C", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C, "moveToElement", "moveToElement");
				GuidewireAutomate("Collision", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_Collision, "click", "click");
				break;
			case "Collision Limited Coverage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType C", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C, "moveToElement", "moveToElement");
				GuidewireAutomate("Collision Limited Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_CollisionLimitedCoverage, "clickAndwait", "click");
				break;
			case "Comprehensive" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType C", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C, "moveToElement", "moveToElement");
				GuidewireAutomate("Comprehensive", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_Comprehensive, "clickAndwait", "click");
				break;
			case "Death and Disability Benefit" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType D", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_D, "moveToElement", "moveToElement");
				GuidewireAutomate("Death and Disability Benefit", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_D_DeathAndDisabilityBenefit, "click", "click");
				break;
			case "Electronic Equipment" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType E", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_E, "moveToElement", "moveToElement");
				GuidewireAutomate("Electronic Equipment", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_E_ElectronicEquipment, "clickAndwait", "click");
				break;
			case "Liability Bodily Injury" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType L", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Bodily Injury", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityBodilyInjury, "clickAndwait", "click");
				break;
			case "Liability Property Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType L", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityPropertyDamage, "clickAndwait", "click");
				break;
			case "Liability Vehicle Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType L", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Vehicle Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityVehicleDamage, "clickAndwait", "click");
				break;
			case "Mexico Cov BI" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov BI", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovBI, "click", "click");
				break;
			case "Mexico Cov PD" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov PD", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovPD, "click", "click");
				break;
			case "Mexico Cov Vehicle Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov Vehicle Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovVehicleDamage, "clickAndwait", "click");
				break;
			case "Mexico Cov Gen Damages'" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov Gen Damages", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovGenDamages, "clickAndwait", "click");
				break;

			case "Medical Payments" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MedicalPayments, "clickAndwait", "click");
				break;

			case "PIP Arkansas" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Arkansas", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPArkansas, "clickAndwait", "click");
				break;
			case "PIP Delaware" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Delaware", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPDelaware, "clickAndwait", "click");
				break;
			case "PIP District of Columbia" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP District of Columbia", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPDistrictOfColumbia, "clickAndwait", "click");
				break;
			case "PIP Florida" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Florida", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPFlorida, "clickAndwait", "click");
				break;
			case "PIP Hawaii" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Hawaii", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPHawaii, "click", "click");
				break;
			case "PIP Kansas" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Kansas", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPKansas, "click", "click");
				break;
			case "PIP Kentucky" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Kentucky", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPKentucky, "clickAndwait", "click");
				break;
			case "PIP Maryland" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Maryland", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMaryland, "clickAndwait", "click");
				break;
			case "PIP Massachusetts" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Massachusetts", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMassachusetts, "clickAndwait", "click");
				break;
			case "PIP Michigan" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Michigan", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMichigan, "clickAndwait", "click");
				break;
			case "PIP Minnesota" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Michigan", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMinnesota, "clickAndwait", "click");
				break;
			case "PIP NewJersey" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP New Jersey", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNewJersey, "clickAndwait", "click");
				break;
			case "PIP NewYork" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP New York", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNewYork, "clickAndwait", "click");
				break;
			case "PIP NorthDakota" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP North Dakota", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNorthDakota, "clickAndwait", "click");
				break;
			case "PIP Oregon" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Oregon", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPOregon, "click", "click");
				break;
			case "PIP Pennsylvania" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Pennsylvania", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPPennsylvania, "clickAndwait", "click");
				break;
			case "PIP Texas" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Texas", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPTexas, "click", "click");
				break;
			case "PIP Utah" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Utah", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPUtah, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Utah", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPUtah, "click", "click");
				break;
			case "PIP Washington" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Utah", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPUtah, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Washington", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPWashington, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Washington", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPWashington, "clickAndwait", "click");
				break;
			case "Property Protection Insurance" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Utah", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPUtah, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Washington", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPWashington, "moveToElement", "moveToElement");
				GuidewireAutomate("Property Protection Insurance", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PropertyProtectionInsurance, "click", "click");
				break;

			case "Rental Car Loss of Use" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType R", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R, "moveToElement", "moveToElement");
				GuidewireAutomate("Rental Car Loss of Use", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R_RentalCarLossOfUse, "clickAndwait", "click");
				break;
			case "Rental Reimbursement" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType R", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R, "moveToElement", "moveToElement");
				GuidewireAutomate("Rental Reimbursement", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R_RentalReimbursement, "clickAndwait", "click");
				break;
			case "Tape Disc Media" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType T", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T, "moveToElement", "moveToElement");
				GuidewireAutomate("Tape Disc Media", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T_TapeDiscMedia, "clickAndwait", "click");
				break;
			case "Towing and Labor" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType T", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T, "moveToElement", "moveToElement");
				GuidewireAutomate("Towing and Labor", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T_TowingAndLabor, "clickAndwait", "click");
				break;
			case "Underinsured Motorist Bodily Injury" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType U", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U, "moveToElement", "moveToElement");
				GuidewireAutomate("Underinsured Motorist Bodily Injury", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UnderinsuredMotoristBodilyInjury, "click", "click");
				break;
			case "Underinsured Motorist Property Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType U", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U, "moveToElement", "moveToElement");
				GuidewireAutomate("Underinsured Motorist Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UnderinsuredMotoristPropertyDamage, "click", "click");
				break;
			case "Uninsured Motorist Bodily Injury" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType U", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U, "moveToElement", "moveToElement");
				GuidewireAutomate("Uninsured Motorist Bodily Injury", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UninsuredMotoristBodilyInjury, "click", "click");
				break;
			case "Uninsured Motorist Property Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType U", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U, "moveToElement", "moveToElement");
				GuidewireAutomate("Uninsured Motorist Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UninsuredMotoristPropertyDamage, "click", "click");
				break;

			// Claim Actions
			case "Assign Claim" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Assign Claim", MenuCC_Claim_Actions_ClaimActions_AssignClaim, "clickAndwait", "click");
				break;
			case "Close Claim" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Close Claim", MenuCC_Claim_Actions_ClaimActions_CloseClaim, "clickAndwait", "click");
				break;
			case "Print Claim" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Print Claim", MenuCC_Claim_Actions_ClaimActions_PrintClaim, "clickAndwait", "click");
				break;
			case "Sync Status" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Sync Status", MenuCC_Claim_Actions_ClaimActions_SyncStatus, "clickAndwait", "click");
				break;
			case "Validate Claim Only" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly, "moveToElement", "moveToElement");
				break;
			case "ValidateClaimOnly Loadandsave" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimOnly Loadandsave", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_LoadAndSave, "clickAndwait", "click");
				break;
			case "ValidateClaimOnly NewLossCompletion" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimOnly NewLossCompletion", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_NewLossCompletion, "clickAndwait", "click");
				break;
			case "ValidateClaimOnly ValidForISO" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimOnly ValidForISO", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_ValidForISO, "clickAndwait", "click");
				break;
			case "ValidateClaimOnly SendToExternalSystem" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimOnly SendToExternalSystem", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_SendToExternalSystem, "clickAndwait", "click");
				break;
			case "ValidateClaimOnly AbilityToPay" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimOnly AbilityToPay", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_AbilityToPay, "clickAndwait", "click");
				break;
			case "Validate Claim Exposures" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures, "clickAndwait", "click");
				break;
			case "ValidateClaimExposures Loadandsave" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimExposures Loadandsave", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_LoadAndSave, "clickAndwait", "click");
				break;
			case "ValidateClaimExposures NewLossCompletion" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimExposures NewLossCompletion", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_NewLossCompletion, "clickAndwait", "click");
				break;
			case "ValidateClaimExposures ValidForISO" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimExposures ValidForISO", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_ValidForISO, "clickAndwait", "click");
				break;
			case "ValidateClaimExposures SendToExternalSystem" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimExposures SendToExternalSystem", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_SendToExternalSystem, "clickAndwait", "click");
				break;
			case "ValidateClaimExposures AbilityToPay" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimExposures AbilityToPay", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_AbilityToPay, "clickAndwait", "click");
				break;
			case "Validate Policy" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "clickAndwait", "click");
				break;
			case "ValidatePolicy Loadandsave" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidatePolicy Loadandsave", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_LoadAndSave, "clickAndwait", "click");
				break;
			case "ValidatePolicy NewLossCompletion" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidatePolicy NewLossCompletion", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_NewLossCompletion, "clickAndwait", "click");
				break;
			case "ValidatePolicy ValidForISO" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidatePolicy ValidForISO", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_ValidForISO, "clickAndwait", "click");
				break;
			case "ValidatePolicy SendToExternalSystem" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidatePolicy SendToExternalSystem", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_SendToExternalSystem, "clickAndwait", "click");
				break;
			case "ValidatePolicy AbilityToPay" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidatePolicy AbilityToPay", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_AbilityToPay, "clickAndwait", "click");
				break;

			/*
			 * Claim Details - Menu Links
			 */
			case "Summary" :
				GuidewireAutomate("Summary", MenuCC_Claim_Summary, "clickAndwait", "click");
				break;
			case "Overview" :
				GuidewireAutomate("Summary Overview", MenuCC_Claim_Summary_Overview, "clickAndwait", "click");
				break;
			case "Status" :
				GuidewireAutomate("Summary Status", MenuCC_Claim_Summary_Status, "clickAndwait", "click");
				break;
			case "Health Metrics" :
				GuidewireAutomate("Summary Health Metrics", MenuCC_Claim_Summary_HealthMetrics, "clickAndwait", "click");
				break;
			case "Workplan" :
				GuidewireAutomate("Workplan", MenuCC_Claim_Workplan, "clickAndwait", "click");
				break;
			case "Loss Details" :
				GuidewireAutomate("Loss Details", MenuCC_Claim_LossDetails, "clickAndwait", "click");
				break;
			case "Loss Details General" :
				GuidewireAutomate("Loss Details", MenuCC_Claim_LossDetails, "clickAndwait", "click");
				GuidewireAutomate("General", MenuCC_Claim_LossDetails_General, "clickAndwait", "click");
				break;
			case "Loss Details Asociations" :
				GuidewireAutomate("Loss Details", MenuCC_Claim_LossDetails, "clickAndwait", "click");
				GuidewireAutomate("Asociations", MenuCC_Claim_LossDetails_Asociations, "clickAndwait", "click");
				break;
			case "Loss Details SpecialInvestigationDetails" :
				GuidewireAutomate("Loss Details", MenuCC_Claim_LossDetails, "clickAndwait", "click");
				GuidewireAutomate("Special Investigation Details", MenuCC_Claim_LossDetails_SpecialInvestigationDetails, "clickAndwait", "click");
				break;
			case "Medical Details" :
				GuidewireAutomate("Medical Details", MenuCC_Claim_MedicalDetails, "clickAndwait", "click");
				break;
			case "Indemnity" :
				GuidewireAutomate("Indemnity", MenuCC_Claim_Indemnity, "clickAndwait", "click");
				break;
			case "Exposures" :
				GuidewireAutomate("Exposures", MenuCC_Claim_Exposures, "clickAndwait", "click");
				break;
			case "Reinsurance" :
				GuidewireAutomate("Reinsurance", MenuCC_Claim_Reinsurance, "clickAndwait", "click");
				break;
			case "Parties Involved" :
				GuidewireAutomate("PartiesInvolved", MenuCC_Claim_PartiesInvolved, "clickAndwait", "click");
				break;
			case "Parties Involved Contacts" :
				GuidewireAutomate("Parties Involved", MenuCC_Claim_PartiesInvolved, "clickAndwait", "click");
				GuidewireAutomate("Contacts", MenuCC_Claim_PartiesInvolved_Contacts, "clickAndwait", "click");
				break;
			case "Parties Involved Users" :
				GuidewireAutomate("PartiesInvolved", MenuCC_Claim_PartiesInvolved, "clickAndwait", "click");
				GuidewireAutomate("Users", MenuCC_Claim_PartiesInvolved_Users, "clickAndwait", "click");
				break;
			case "Policy" :
				GuidewireAutomate("Policy", MenuCC_Claim_Policy, "clickAndwait", "click");
				break;
			case "Policy General" :
				GuidewireAutomate("Policy", MenuCC_Claim_Policy, "clickAndwait", "click");
				GuidewireAutomate("General", MenuCC_Claim_Policy_General, "clickAndwait", "click");
				break;
			case "Policy Vehicles" :
				GuidewireAutomate("Policy", MenuCC_Claim_Policy, "clickAndwait", "click");
				GuidewireAutomate("Vehicles", MenuCC_Claim_Policy_Vehicle, "clickAndwait", "click");
				break;
			case "Policy Endorsements" :
				GuidewireAutomate("Policy", MenuCC_Claim_Policy, "clickAndwait", "click");
				GuidewireAutomate("Endorsements", MenuCC_Claim_Policy_Endorsements, "clickAndwait", "click");
				break;
			case "Policy Aggregate Limits" :
				GuidewireAutomate("Policy", MenuCC_Claim_Policy, "clickAndwait", "click");
				GuidewireAutomate("Aggregate Limits", MenuCC_Claim_Policy_AggregateLimits, "clickAndwait", "click");
				break;
			case "Financials" :
				GuidewireAutomate("Financials", MenuCC_Claim_Financials, "clickAndwait", "click");
				break;
			case "Financials Summary" :
				GuidewireAutomate("Financials", MenuCC_Claim_Financials, "clickAndwait", "click");
				GuidewireAutomate("Summary", MenuCC_Claim_Financials_Summary, "clickAndwait", "click");
				break;
			case "Financials Transactions" :
				GuidewireAutomate("Financials", MenuCC_Claim_Financials, "clickAndwait", "click");
				GuidewireAutomate("Transactions", MenuCC_Claim_Financials_Transactions, "clickAndwait", "click");
				break;
			case "Financials Checks" :
				GuidewireAutomate("Financials", MenuCC_Claim_Financials, "clickAndwait", "click");
				GuidewireAutomate("Checks", MenuCC_Claim_Financials_Checks, "clickAndwait", "click");
				break;
			case "Notes" :
				GuidewireAutomate("Notes", MenuCC_Claim_Notes, "clickAndwait", "click");
				break;
			case "Documents" :
				GuidewireAutomate("Documents", MenuCC_Claim_Documents, "clickAndwait", "click");
				break;
			case "Plan of Action" :
				GuidewireAutomate("Plan of Action", MenuCC_Claim_PlanofAction, "clickAndwait", "click");
				break;
			case "PlanofAction Evaluations" :
				GuidewireAutomate("Plan of Action", MenuCC_Claim_PlanofAction, "click", "");
				GuidewireAutomate("Evaluations", MenuCC_Claim_PlanofAction_Evaluations, "clickAndwait", "click");
				break;
			case "PlanofAction Negotiations" :
				GuidewireAutomate("Plan of Action", MenuCC_Claim_PlanofAction, "clickAndwait", "click");
				GuidewireAutomate("Negotiations", MenuCC_Claim_PlanofAction_Negotiations, "clickAndwait", "click");
				break;
			case "Services" :
				GuidewireAutomate("Services", MenuCC_Claim_Services, "clickAndwait", "click");
				break;
			case "Litigation" :
				GuidewireAutomate("Litigation", MenuCC_Claim_Litigation, "clickAndwait", "click");
				break;
			case "History" :
				GuidewireAutomate("History", MenuCC_Claim_History, "clickAndwait", "click");
				break;
			case "FNOL Snapshot" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				break;
			case "FNOLSnapshot LossDetails" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Loss Details", MenuCC_Claim_FNOLSnapshot_LossDetials, "clickAndwait", "click");
				break;
			case "FNOLSnapshot PartiesesInvolved" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Partieses Involved", MenuCC_Claim_FNOLSnapshot_PartiesInvolced, "clickAndwait", "click");
				break;
			case "FNOLSnapshot Policy" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Policy", MenuCC_Claim_FNOLSnapshot_Policy, "clickAndwait", "click");
				break;
			case "FNOLSnapshot Exposures" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Exposures", MenuCC_Claim_FNOLSnapshot_Exposure, "clickAndwait", "click");
				break;
			case "FNOLSnapshot Notes" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Notes", MenuCC_Claim_FNOLSnapshot_Notes, "clickAndwait", "click");
				break;
			case "FNOLSnapshot Documents" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Documents", MenuCC_Claim_FNOLSnapshot_Document, "clickAndwait", "click");
				break;
			case "FNOLSnapshot AdditionalFileds" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Additional Fileds", MenuCC_Claim_FNOLSnapshot_AdditionalFileds, "clickAndwait", "click");
				break;
			case "Calendar" :
				GuidewireAutomate("Calendar", MenuCC_Claim_Calendar, "clickAndwait", "click");
				break;
			case "My Calendar" :
				GuidewireAutomate("Calendar", MenuCC_Claim_Calendar, "clickAndwait", "click");
				GuidewireAutomate("My Calendar", MenuCC_Claim_Calendar_MyCalender, "clickAndwait", "click");
				break;
			case "Supervisor Calender" :
				GuidewireAutomate("Calendar", MenuCC_Claim_Calendar, "clickAndwait", "click");
				GuidewireAutomate("Supervisor Calender", MenuCC_Claim_Calendar_SupervisorCalender, "clickAndwait", "click");
				break;

			/*
			 * Administration
			 */

			/*
			 * Users&Security
			 */
			case "UsersAndSecurity" :
				GuidewireAutomate("Users and Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				break;
			case "Users" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				GuidewireAutomate("Users", MenuCC_UserAndSecurity_Users, "clickAndwait", "click");
				break;
			case "Groups" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				GuidewireAutomate("Groups", MenuCC_UserAndSecurity_Groups, "clickAndwait", "click");
				break;
			case "Roles" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				GuidewireAutomate("Roles", MenuCC_UserAndSecurity_Roles, "clickAndwait", "click");
				break;
			case "Regions" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				GuidewireAutomate("Regions", MenuCC_UserAndSecurity_Regions, "clickAndwait", "click");
				break;
			case "Security Zones" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				GuidewireAutomate("Security Zones", MenuCC_UserAndSecurity_SecurityZones, "clickAndwait", "click");
				break;
			case "Authority Limit Profile" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				GuidewireAutomate("Authority Limit Profile", MenuCC_UserAndSecurity_AuthorityLimitProfile, "click", "click");
				break;
			case "Attributes" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				GuidewireAutomate("Attributes", MenuCC_UserAndSecurity_Attributes, "clickAndwait", "click");
				break;

			/*
			 * SpecialHandling
			 */
			case "Accounts" :
				GuidewireAutomate("Special Handling", MenuCC_Administration_SpecialHandling, "clickAndwait", "click");
				GuidewireAutomate("Accounts", MenuCC_SpecialHandling_Accounts, "clickAndwait", "click");
				break;
			case "Service Tiers" :
				GuidewireAutomate("Special Handling", MenuCC_Administration_SpecialHandling, "clickAndwait", "click");
				GuidewireAutomate("Service Tiers", MenuCC_SpecialHandling_ServiceTiers, "clickAndwait", "click");
				break;

			/*
			 * BusinessSettings
			 */
			case "Business Rules" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "clickAndwait", "click");
				break;
			case "Activity Rules" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "clickAndwait", "click");
				GuidewireAutomate("Activity Rules", MenuCC_BusinessSettings_BusinessRules_ActvityRules, "clickAndwait", "click");
				break;
			case "Exposure Rules" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "clickAndwait", "click");
				GuidewireAutomate("Exposure Rules", MenuCC_BusinessSettings_BusinessRules_ExposureRules, "clickAndwait", "click");
				break;
			case "Reserve Rules" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "clickAndwait", "click");
				GuidewireAutomate("Reserve Rules", MenuCC_BusinessSettings_BusinessRules_ReserveRules, "clickAndwait", "click");
				break;
			case "Import Export Status" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "clickAndwait", "click");
				GuidewireAutomate("Import Export Status", MenuCC_BusinessSettings_BusinessRules_ExportImportStatus, "click", "click");
				break;
			case "Activity Patterns" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Activity Patterns", MenuCC_BusinessSettings_ActivityPatterns, "clickAndwait", "click");
				break;
			case "Business Week" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Business Week", MenuCC_BusinessSettings_BusinessWeek, "clickAndwait", "click");
				break;
			case "Catastrophes" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Catastrophes", MenuCC_BusinessSettings_Catastrophes, "clickAndwait", "click");
				break;
			case "Coverage Verification" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Coverage Verification", MenuCC_BusinessSettings_CoverageVerification, "clickAndwait", "click");
				break;
			case "Invalid Coverage For Cause" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Coverage Verification", MenuCC_BusinessSettings_CoverageVerification, "clickAndwait", "click");
				GuidewireAutomate("Invalid Coverage For Cause", MenuCC_BusinessSettings_CoverageVerification_InvalidCoverageForCause, "clickAndwait", "click");
				break;
			case "Incompatible New Exposure" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Coverage Verification", MenuCC_BusinessSettings_CoverageVerification, "clickAndwait", "click");
				GuidewireAutomate("Incompatible New Exposure", MenuCC_BusinessSettings_CoverageVerification_IncompatibleNewExposure, "clickAndwait", "click");
				break;
			case "Possible Invalid Coverage" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Coverage Verification", MenuCC_BusinessSettings_CoverageVerification, "clickAndwait", "click");
				GuidewireAutomate("Possible Invalid Coverage", MenuCC_BusinessSettings_CoverageVerification_PossibleInvalidCoverage, "clickAndwait", "click");
				break;
			case "Holidays" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Holidays", MenuCC_BusinessSettings_Holidays, "clickAndwait", "click");
				break;
			case "ICD Codes" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("ICD Codes", MenuCC_BusinessSettings_ICDCodes, "clickAndwait", "click");
				break;
			case "Metrics & Thresholds" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Metrics & Thresholds", MenuCC_BusinessSettings_MetricsAndThresholds, "clickAndwait", "click");
				break;
			case "Reinsurance Thresholds" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Reinsurance Thresholds", MenuCC_BusinessSettings_ReinsuranceThresholds, "click", "click");
				break;
			case "WC Parameters" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "clickAndwait", "click");
				break;
			case "Benefit Parameters" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "clickAndwait", "click");
				GuidewireAutomate("Benefit Parameters", MenuCC_BusinessSettings_WCParameters_BenefitParameters, "click", "click");
				break;
			case "PPD Min Max" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "clickAndwait", "click");
				GuidewireAutomate("PPD Min Max", MenuCC_BusinessSettings_WCParameters_PPDMinMax, "clickAndwait", "click");
				break;
			case "PPD Weeks" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "clickAndwait", "click");
				GuidewireAutomate("PPD Weeks", MenuCC_BusinessSettings_WCParameters_PPDWeeks, "clickAndwait", "click");
				break;
			case "Compensability Parameters" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "clickAndwait", "click");
				GuidewireAutomate("Compensability Parameters", MenuCC_BusinessSettings_WCParameters_CompensabilityParameters, "clickAndwait", "click");
				break;
			// Monitoring SubMenu
			case "Message Queues" :
				GuidewireAutomate("Monitoring", MenuCC_Administration_Monitoring, "clickAndwait", "click");
				GuidewireAutomate("Message Queues", MenuCC_Monitoring_MessageQueues, "clickAndwait", "click");
				break;
			case "Workflows" :
				GuidewireAutomate("Monitoring", MenuCC_Administration_Monitoring, "clickAndwait", "click");
				GuidewireAutomate("Workflows", MenuCC_Monitoring_WorkFlows, "clickAndwait", "click");
				break;
			case "Workflow Statistics" :
				GuidewireAutomate("Monitoring", MenuCC_Administration_Monitoring, "clickAndwait", "click");
				GuidewireAutomate("Workflow Statistics", MenuCC_Monitoring_WorkFlowsStatistics, "clickAndwait", "click");
				break;
			// Utilities SubMenu
			case "Import Data" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Import Data", MenuCC_Utilities_ImportData, "clickAndwait", "click");
				break;
			case "Export Data" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Export Data", MenuCC_Utilities_ExportData, "clickAndwait", "click");
				break;
			case "Script Parameters" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Script Parameters", MenuCC_Utilities_ScriptParameters, "clickAndwait", "click");
				break;
			case "Data Change" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Data Change", MenuCC_Utilities_DataChange, "clickAndwait", "click");
				break;
			case "Inbound Files" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Inbound Files", MenuCC_Utilities_InboundFiles, "clickAndwait", "click");
				break;
			case "Outbound Files" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Outbound Files", MenuCC_Utilities_OutboundFiles, "clickAndwait", "click");
				break;
			case "Runtime Properties" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Runtime Properties", MenuCC_Utilities_RuntimeProperties, "clickAndwait", "click");
				break;

			default :
				throw new IOException("No support for ClaimsCenter Menu : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.PASS, "Navigation to ClaimsCenter Menu : " + Menu + " is succesful");
	}

}
