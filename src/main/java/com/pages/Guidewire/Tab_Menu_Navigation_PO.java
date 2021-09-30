package com.pages.Guidewire;

import org.openqa.selenium.By;

public interface Tab_Menu_Navigation_PO {

	/*
	 * Menu Options
	 * -------------------------------------------------------------------------
	 * ----
	 * 
	 */

	final By Menu_ActionsBC = By.xpath("//div[@id='gw-west-panel--top-section']/div[contains(@id,'MenuActions')]");
	final By Menu_ActionsCC = By.xpath("//div[contains(@id,'ClaimMenuActions')]/div[@role='button']");
	final By Menu_Actions = By.xpath("//div[contains(@id,'MenuActions')]/div[@role='button']/div[2]");

	/*
	 * -------------------------------------------------------------------------
	 * -------------------------------------------------------------------------
	 * -------------------------------------------------------------------------
	 * PolicyCenter Tabs
	 * -------------------------------------------------------------------------
	 * -------------------------------------------------------------------------
	 * -------------------------------------------------------------------------
	 * 
	 */

	/*
	 * -------------------------------------------------------------------------
	 * Desktop Tab
	 * -------------------------------------------------------------------------
	 */
	final By TabPC_Desktop = By.xpath("//div[@id='TabBar-DesktopTab']//div[@class='gw-label']");
	final By TabPC_Desktop_dd = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	final By TabPC_Desktop_Summary = By.id("TabBar-DesktopTab-Desktop_Underwriter_MySummary");
	final By TabPC_Desktop_MyActivities = By.id("TabBar-DesktopTab-Desktop_DesktopActivities");
	final By TabPC_Desktop_MyAccounts = By.id("TabBar-DesktopTab-Desktop_DesktopAccounts");
	final By TabPC_Desktop_MySubmission = By.id("TabBar-DesktopTab-Desktop_DesktopSubmissions");
	final By TabPC_Desktop_MyRenewals = By.id("TabBar-DesktopTab-Desktop_DesktopRenewals");
	final By TabPC_Desktop_OtherPolicyTransactions = By.id("TabBar-DesktopTab-Desktop_DesktopOtherWorkOrders");
	final By TabPC_Desktop_MyQueues = By.id("TabBar-DesktopTab-Desktop_DesktopAssignableQueues");
	/*
	 * MenuLinks
	 */
	final By MenuPC_Desktop_Actions_Create_NewAccount = By
			.xpath("//div[@id='Desktop-DesktopMenuActions-DesktopMenuActions_Create-DesktopMenuActions_NewAccount']");
	final By MenuPC_Desktop_Actions_Create_NewSubmission = By.xpath(
			"//div[@id='Desktop-DesktopMenuActions-DesktopMenuActions_Create-DesktopMenuActions_NewSubmission']");

	final By MenuPC_Desktop_Summary = By
			.xpath("//div[@id='Desktop-MenuLinks-Desktop_Underwriter_MySummary']/div[1]/div[text()='Summary']");
	final By MenuPC_Desktop_MyActivities = By
			.xpath("//div[@id='Desktop-MenuLinks-Desktop_DesktopActivities']/div[1]/div[text()='My Activities']");
	final By MenuPC_Desktop_MyAccounts = By
			.xpath("//div[@id='Desktop-MenuLinks-Desktop_DesktopAccounts']/div[1]/div[text()='My Accounts']");
	final By MenuPC_Desktop_MySubmissions = By
			.xpath("//div[@id='Desktop-MenuLinks-Desktop_DesktopSubmissions']/div[1]/div[text()='My Submissions']");
	final By MenuPC_Desktop_MyRenewals = By
			.xpath("//div[@id='Desktop-MenuLinks-Desktop_DesktopRenewals']/div[1]/div[text()='My Renewals']");
	final By MenuPC_Desktop_OtherPolicyTransactions = By.xpath(
			"//div[@id='Desktop-MenuLinks-Desktop_DesktopOtherWorkOrders']/div[1]/div[text()='Other Policy Transactions']");
	final By MenuPC_Desktop_MyQueues = By
			.xpath("//div[@id='Desktop-MenuLinks-Desktop_DesktopAssignableQueues']/div[1]/div[text()='My Queues']");

	/*
	 * -------------------------------------------------------------------------
	 * ---- Account Tab
	 * -------------------------------------------------------------------------
	 * ----
	 */
	final By TabPC_Account = By.xpath("//div[@id='TabBar-AccountsTab']//div[@class='gw-label']");
	final By TabPC_Account_dd = By.xpath("//div[@id='TabBar-AccountTab']/div[3]");
	final By TabPC_Account_NewAccount = By.id("TabBar-AccountTab-AccountTab_NewAccount");
	final By TabPC_Account_AccountNumber = By
			.xpath("//*[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem']/div/input");
	final By TabPC_Account_AccountNumberSearch = By
			.xpath("//*[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem_Button']/span");
	/*
	 * Create
	 */
	final By MenuPC_Actions_Create = By.xpath(
			"//div[@id='AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create']//div[@role='menuitem']");
	final By MenuPC_Account_Actions_Create_NewNote = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_NewNote')]//div[@role='menuitem']");
	final By MenuPC_Account_Actions_Create_NewDocument = By.xpath(
			"//div[@id='AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create-AccountFileMenuActions_NewDocument']");
	final By MenuPC_Account_Actions_Create_NewEmail = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_NewEmail')]//div[@role='menuitem']");
	final By MenuPC_Account_Actions_Create_NewSubmission = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_NewSubmission')]//div[@role='menuitem']");
	final By MenuPC_Account_Actions_Create_NewActivity = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_NewActivity')]//div[@role='menuitem']");
	final By MenuPC_Account_Actions_WithdrawAccount = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_WithdrawAccount')]//div[@role='menuitem']");
	final By MenuPC_Account_Actions_MovePoliciesToThisAccount = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_MovePolicies')]//div[@role='menuitem']");
	final By MenuPC_Account_Actions_RewritePoliciesToThisAccount = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_RewritePolicies')]//div[@role='menuitem']");
	final By MenuPC_Account_Actions_MergeAccountIntoThisAccount = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_MergeAccounts')]//div[@role='menuitem']");

	final By MenuPC_Account_Summary = By
			.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_Summary']//div[@class='gw-label']");
	final By MenuPC_Account_Contacts = By
			.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_Contacts']//div[@class='gw-label']");
	final By MenuPC_Account_Locations = By
			.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_Locations']//div[@class='gw-label']");
	final By MenuPC_Account_Participants = By
			.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_Participants']final By MenuPC_Account_]");
	final By MenuPC_Account_PolicyTransactions = By
			.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_PolicyTransactions']//div[@class='gw-label']");
	final By MenuPC_Account_SubmissonManager = By
			.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_SubmissionManager']//div[@class='gw-label']");
	final By MenuPC_Account_UnderwritingFiles = By
			.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_UnderwritingFiles']//div[@class='gw-label']");
	final By MenuPC_Account_RelatedAccounts = By
			.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_RelatedAccounts']//div[@class='gw-label']");
	final By MenuPC_Account_Documents = By
			.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_Documents']//div[@class='gw-label']");
	final By MenuPC_Account_Notes = By
			.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_Notes']//div[@class='gw-label']");
	final By MenuPC_Account_Claims = By
			.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_Claims']//div[@class='gw-label']");
	final By MenuPC_Account_Billing = By
			.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_Billing']//div[@class='gw-label']");
	final By MenuPC_Account_History = By
			.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_History']//div[@class='gw-label']");

	/*
	 * -------------------------------------------------------------------------
	 * ---- Policy Tab
	 * -------------------------------------------------------------------------
	 * ----
	 */

	final By TabPC_Policy = By.xpath("//div[@id='TabBar-PolicyTab']/div[@class='gw-label']");
	final By TabPC_Policy_dd = By.xpath("//div[@id='TabBar-PolicyTab']/div[3]");
	final By TabPC_Policy_NewSubmission = By.id("TabBar-PolicyTab-PolicyTab_NewSubmission");
	final By TabPC_Policy_SubNumber = By
			.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_SubmissionNumberSearchItem']/div/input");
	final By TabPC_Policy_SubNumber_Search = By
			.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_SubmissionNumberSearchItem_Button']/span");

	/*
	 * GoTo
	 */
	final By MenuPC_Actions_Submission_GoTo_AccountFile = By.xpath(
			"//div[@id='AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create']//div[@role='menuitem']");
	final By MenuPC_Actions_Submission_GoTo_PolicyFile = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_NewNote')]//div[@role='menuitem']");
	final By MenuPC_Actions_Submission_GoTo_SuubmissionManager = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_NewNote')]//div[@role='menuitem']");
	final By MenuPC_Actions_Submission_GoTo_Group = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_NewNote')]//div[@role='menuitem']");
	/*
	 * Create
	 */
	final By MenuPC_Actions_Submission_Create_CopySubmission = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_NewNote')]//div[@role='menuitem']");
	/*
	 * Archiving
	 */
	final By MenuPC_Actions_Submission_Archiving_EnableDisable = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_NewNote')]//div[@role='menuitem']");

	final By TabPC_Policy_PolicyNumber = By
			.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_PolicyRetrievalItem']/div/input");
	final By TabPC_Policy_PolicyNumber_Search = By
			.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_PolicyRetrievalItem_Button']/span");
	/*
	 * GoTo
	 */
	final By MenuPC_Actions_Policy_GoTo_AccountFile = By.xpath(
			"//div[@id='PolicyFile-PolicyFileMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile']//div[@role='menuitem']");
	final By MenuPC_Actions_Policy_GoTo_PolicyFile = By.xpath(
			"//div[@id='PolicyFile-PolicyFileMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile']//div[@role='menuitem']");
	/*
	 * Create
	 */
	final By MenuPC_Actions_Policy_Create_NewNote = By.xpath(
			"//div[@id='PolicyFile-PolicyFileMenuActions-PolicyFileMenuActions_Create-PolicyFileMenuActions_NewNote']//div[@role='menuitem']");
	final By MenuPC_Actions_Policy_Create_NewDocument = By.xpath(
			"//div[@id='PolicyFile-PolicyFileMenuActions-PolicyFileMenuActions_Create-PolicyFileMenuActions_NewDocument']//div[@role='menuitem']");
	final By MenuPC_Actions_Policy_Create_NewActivity = By.xpath(
			"//div[@id='PolicyFile-PolicyFileMenuActions-PolicyFileMenuActions_Create-PolicyFileMenuActions_NewNote']//div[@role='menuitem']");
	final By MenuPC_Actions_Policy_Create_NewEmail = By.xpath(
			"//div[@id='PolicyFile-PolicyFileMenuActions-PolicyFileMenuActions_Create-PolicyFileMenuActions_NewNote']//div[@role='menuitem']");
	final By MenuPC_Actions_Policy_Create_PreRenewalDirection = By.xpath(
			"//div[@id='PolicyFile-PolicyFileMenuActions-PolicyFileMenuActions_Create-PolicyFileMenuActions_NewNote']//div[@role='menuitem']");
	final By MenuPC_Actions_Policy_Create_CopySubmission = By.xpath(
			"//div[@id='PolicyFile-PolicyFileMenuActions-PolicyFileMenuActions_Create-PolicyFileMenuActions_NewNote']//div[@role='menuitem']");
	final By MenuPC_Actions_Policy_Create_SpinOffPolicyFromThisOne = By.xpath(
			"//div[@id='PolicyFile-PolicyFileMenuActions-PolicyFileMenuActions_Create-PolicyFileMenuActions_SpinPolicy']//div[@role='menuitem']");
	final By MenuPC_Actions_Policy_Create_SplitPolicyintoTwo = By.xpath(
			"//div[@id='PolicyFile-PolicyFileMenuActions-PolicyFileMenuActions_Create-PolicyFileMenuActions_SplitPolicy']//div[@role='menuitem']");
	/*
	 * New Policy Transaction
	 */
	final By MenuPC_Actions_Policy_NewPolicyTransaction_ChangePolicy = By
			.xpath("//div[contains(@id,'ChangePolicy')]//div[@class='gw-label']");
	final By MenuPC_Actions_Policy_NewPolicyTransaction_IssuePolicy = By
			.xpath("//div[contains(@id,'IssuePolicy')]//div[@class='gw-label']");
	final By MenuPC_Actions_Policy_NewPolicyTransaction_CancelPolicy = By
			.xpath("//div[contains(@id,'CancelPolicy')]//div[@class='gw-action--inner gw-hasDivider']");
	final By MenuPC_Actions_Policy_NewPolicyTransaction_RenewPolicy = By
			.xpath("//div[contains(@id,'RenewPolicy')]//div[@class='gw-label']");
	final By MenuPC_Actions_Policy_NewPolicyTransaction_ReinstatePolicy = By
			.xpath("//div[contains(@id,'ReinstatePolicy')]//div[@class='gw-label']");
	final By MenuPC_Actions_Policy_NewPolicyTransaction_RewriteNewTerm = By
			.xpath("//div[contains(@id,'RewriteNewTerm')]//div[@class='gw-label']");
	final By MenuPC_Actions_Policy_NewPolicyTransaction_RewriteFullTerm = By
			.xpath("//div[contains(@id,'RewriteFullTerm')]//div[@class='gw-label']");
	final By MenuPC_Actions_Policy_NewPolicyTransaction_RewriteRemainderOfTerm = By
			.xpath("//div[contains(@id,'RewriteRemainderOfTerm')]//div[@class='gw-label']");

	/*
	 * -------------------------------------------------------------------------
	 * ---- Contact Tab
	 * -------------------------------------------------------------------------
	 * ----
	 */

	final By TabPC_Contact = By.xpath("//div[@id='TabBar-ContactTab']/div[@class='gw-label']");
	final By TabPC_Contact_dd = By.xpath("//div[@id='TabBar-ContactTab']/div[3]");
	final By TabPC_Contact_NewContact = By.id("TabBar-AccountTab-ContactsTab_NewAccount");
	final By TabPC_Contact_NewContact_Company = By.xpath("//*[@id='TabBar-ContactTab-NewContact-NewCompany']/span");
	final By TabPC_Contact_NewContact_Person = By.xpath("//*[@id='TabBar-ContactTab-NewContact-NewPerson']/span");
	final By TabPC_Contact_NewContact_Search = By.id("TabBar-ContactTab-Search");

	/*
	 * -------------------------------------------------------------------------
	 * ---- Search Tab
	 * -------------------------------------------------------------------------
	 * ----
	 */
	final By TabPC_Search = By.xpath("//div[@id='TabBar-SearchTab']/div[@class='gw-label']");
	final By TabPC_Search_dd = By.xpath("//div[@id='TabBar-SearchTab']/div[3]");
	final By TabPC_Search_Policies = By.id("TabBar-SearchTab-Search_PolicySearch");
	final By TabPC_Search_Accounts = By.id("TabBar-SearchTab-Search_AccountSearch");
	final By TabPC_Search_ProducerCodes = By.id("TabBar-SearchTab-Search_ProducerCodeSearch");
	final By TabPC_Search_Activities = By.id("TabBar-SearchTab-TabBar-SearchTab-Search_ActivitySearch");
	final By TabPC_Search_Contacts = By.id("TabBar-SearchTab-TabBar-SearchTab-Search_ContactSearch");

	/*
	 * -------------------------------------------------------------------------
	 * ---- Team Tab
	 * -------------------------------------------------------------------------
	 * ----
	 */
	final By TabPC_Team = By.xpath("//div[@id='TabBar-TeamTab']/div[@class='gw-label']");

	/*
	 * -------------------------------------------------------------------------
	 * ---- Administration Tab
	 * -------------------------------------------------------------------------
	 * ----
	 */
	final By TabPC_Administration = By.xpath("//div[@id='TabBar-AdministrationTab']/div[@class='gw-label']");
	final By TabPC_Administration_dd = By.xpath("//div[@id='TabBar-AdministrationTab']/div[3]");

	final By TabPC_Administration_UsersSecurity = By
			.xpath("//div[@id='TabBar-AdminTab-Admin_UsersAndSecurity']/div[@class='gw-action--expand-button']");
	final By TabPC_Administration_BusinessSettings = By
			.xpath("//div[@id='TabBar-AdminTab-Admin_BusinessSettings']/div[@class='gw-action--expand-button']");
	final By TabPC_Administration_Monitoring = By
			.xpath("//div[@id='TabBar-AdminTab-Admin_Monitoring']/div[@class='gw-action--expand-button']");
	final By TabPC_Administration_Utilities = By
			.xpath("//div[@id='TabBar-AdminTab-Admin_Utilities']/div[@class='gw-action--expand-button']");

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
	/*
	 * Desktop Tab
	 */
	final By TabBC_Desktop = By.xpath("//div[@id='TabBar-AccountsTab']//div[@class='gw-label']");
	final By TabBC_Desktop_dd = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	final By TabBC_Desktop_MyActivities = By.id("TabBar-DesktopTab-DesktopGroup_DesktopActivities");
	final By TabBC_Desktop_MyApprovalRequests = By.id("TabBar-DesktopTab-DesktopGroup_DesktopApprovals");
	final By TabBC_Desktop_MyTroubleTickets = By.id("TabBar-DesktopTab-DesktopGroup_DesktopTroubleTickets");
	final By TabBC_Desktop_MyDelinquencies = By.id("TabBar-DesktopTab-DesktopGroup_DesktopDelinquencies");
	final By TabBC_Desktop_Disbursements = By.id("TabBar-DesktopTab-DesktopGroup_DesktopDisbursements");
	final By TabBC_Desktop_SuspensePayments = By.id("TabBar-DesktopTab-DesktopGroup_DesktopSuspensePayments");
	final By TabBC_Desktop_MyAgencyItems = By.id("TabBar-DesktopTab-DesktopGroup_DesktopAgencyItems");
	final By TabBC_Desktop_HeldCharges = By.id("TabBar-DesktopTab-DesktopGroup_DesktopHeldCharges");

	final By MenuBC_Desktop_MyActivities = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopActivities");
	final By MenuBC_Desktop_MyApprovalRequests = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopApprovals");
	final By MenuBC_Desktop_MyTroubleTickets = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopTroubleTickets");
	final By MenuBC_Desktop_MyDelinquencies = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopDelinquencies");
	final By MenuBC_Desktop_Disbursements = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopDisbursements");
	final By MenuBC_Desktop_SuspensePayments = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopSuspensePayments");
	final By MenuBC_Desktop_MyAgencyItems = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopAgencyItems");
	final By MenuBC_Desktop_HeldCharges = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopHeldCharges");

	final By MenuBC_Desktop_Actions_NewAssignedActivity = By.id("DesktopGroup-DesktopMenuActions-NewAssignedActivity");
	final By MenuBC_Desktop_Actions_NewSharedActivity = By.id("DesktopGroup-DesktopMenuActions-NewSharedActivity");
	final By MenuBC_Desktop_Actions_Preferences = By
			.id("DesktopGroup-DesktopMenuActions-DesktopMenuActions_UserPreferences");

	/*
	 * Account Tab
	 */
	final By TabBC_Account = By.xpath("//div[@id='TabBar-AccountsTab']//div[@class='gw-label']");
	final By TabBC_Account_dd = By.xpath("//div[@id='TabBar-AccountsTab']/div[3]");
	final By TabBC_Account_AccountNumber = By.xpath("//input[@name='TabBar-AccountsTab-AccountNumberSearchItem']");
	final By TabBC_Account_AccountNumber_Search = By
			.xpath("//div[@id='TabBar-AccountsTab-AccountNumberSearchItem_Button']/span");
	/*
	 * NewAccount
	 */

	/*
	 * Actions
	 */
	final By MenuBC_Actions_NewAccount = By.id("AccountsGroup-AccountsMenuActions-AccountsMenuActions_NewAccount");
	final By MenuBC_Accounts = By.id("AccountsGroup-MenuLinks-AccountsGroup_Accounts");
	/*
	 * Account
	 */

	/*
	 * Actions
	 */

	final By MenuBC_Account_Actions_AddPolicy = By
			.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_NewPolicy");
	final By MenuBC_Account_Actions_NewPayment = By
			.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_Payments");
	final By MenuBC_Account_Actions_NewPayment_NewDirectBillPayment = By.id(
			"AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_Payments-AccountDetailMenuActions_NewDirectBillPayment");
	final By MenuBC_Account_Actions_NewTransaction = By
			.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_NewTransaction");
	final By MenuBC_Account_Actions_TransferPolicies = By
			.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_TransferPolicies");
	final By MenuBC_Account_Actions_NewNote = By
			.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_NewNote");
	final By MenuBC_Account_Actions_NewDocument = By
			.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_NewDocument");
	final By MenuBC_Account_Actions_NewDocument_CreateFromTemplate = By
			.id("AccountGroup-AccountDetailMenuActions-NewDocument");
	final By MenuBC_Account_Actions_NewDocument_UploadDocument = By
			.id("AccountGroup-AccountDetailMenuActions-NewDocument");
	final By MenuBC_Account_Actions_NewEmail = By
			.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_NewEmail");
	final By MenuBC_Account_Actions_NewEmail_NewEmail = By.id("AccountGroup-AccountDetailMenuActions-NewEmail");
	final By MenuBC_Account_Actions_NewEmail_NewEmailTemplete = By.id("AccountGroup-AccountDetailMenuActions-NewEmail");

	final By MenuBC_Account_Summary = By.xpath(
			"//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountOverview-AccountOverview_AccountSummary']//div[@class='gw-label']");
	final By MenuBC_Account_Details = By.xpath(
			"//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountOverview-AccountOverview_AccountDetailSummary']//div[@class='gw-label']");
	final By MenuBC_Account_Contacts = By
			.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailContacts']//div[@class='gw-label']");
	final By MenuBC_Account_FundsTracking = By.xpath(
			"//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailFundsTracking']//div[@class='gw-label']");
	final By MenuBC_Account_Payments = By
			.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailPayments']//div[@class='gw-label']");
	final By MenuBC_Account_Charges = By
			.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailCharges']//div[@class='gw-label']");
	final By MenuBC_Account_Disbursements = By.xpath(
			"//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailDisbursements']//div[@class='gw-label']");
	final By MenuBC_Account_Transactions = By.xpath(
			"//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailTransactions']//div[@class='gw-label']");
	final By MenuBC_Account_Collateral = By
			.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountCollateral']//div[@class='gw-label']");
	final By MenuBC_Account_Policies = By
			.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailPolicies']//div[@class='gw-label']");
	final By MenuBC_Account_History = By
			.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailHistory']//div[@class='gw-label']");
	final By MenuBC_Account_Evaluation = By
			.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailEvaluation']//div[@class='gw-label']");
	final By MenuBC_Account_Invoices = By
			.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailInvoices']//div[@class='gw-label']");
	final By MenuBC_Account_InvoiceStreams = By.xpath(
			"//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailInvoiceStreams']//div[@class='gw-label']");
	final By MenuBC_Account_TroubleTickets = By.xpath(
			"//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailTroubleTickets']//div[@class='gw-label']");
	final By MenuBC_Account_Documents = By
			.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailDocuments']//div[@class='gw-label']");
	final By MenuBC_Account_Ledger = By
			.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailLedger]//div[@class='gw-label']");
	final By MenuBC_Account_Journal = By
			.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailJournal']//div[@class='gw-label']");
	final By MenuBC_Account_Delinquencies = By.xpath(
			"//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailDelinquencies']//div[@class='gw-label']");

	/*
	 * Policy Tab
	 */
	final By TabBC_Policy = By.xpath("//div[@id='TabBar-PolicyTab']/div[@class='gw-label']");
	final By TabBC_Policy_dd = By.xpath("//div[@id='TabBar-PoliciesTab']//div[3]");
	final By TabBC_Policy_PolicyNumber = By
			.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_PolicyRetrievalItem']/div/input");
	final By TabBC_Policy_PolicyNumber_Search = By
			.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_PolicyRetrievalItem_Button']/span");

	final By MenuBC_Policy_Summary = By.xpath(
			"//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyOverview-AccountOverview_AccountSummary']//div[@class='gw-label']");
	final By MenuBC_Policy_Details = By.xpath(
			"//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyOverview-AccountOverview_AccountDetailSummary']//div[@class='gw-label']");
	final By MenuBC_Policy_Contacts = By
			.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailContacts']//div[@class='gw-label']");
	final By MenuBC_Policy_Transactions = By
			.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailTransactions']//div[@class='gw-label']");
	final By BC_Policy_Charges = By
			.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailCharges']//div[@class='gw-label']");
	final By MenuBC_Policy_Disbursements = By
			.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailDisbursements']//div[@class='gw-label']");
	final By MenuBC_Policy_PaymentSchedule = By
			.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailPayments']//div[@class='gw-label']");
	final By MenuBC_Policy_Commissions = By
			.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailCommissions']//div[@class='gw-label']");
	final By MenuBC_Policy_TroubleTickets = By
			.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailTroubleTickets']//div[@class='gw-label']");
	final By MenuBC_Policy_Documents = By
			.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailDocuments']//div[@class='gw-label']");
	final By MenuBC_Policy_PolicyNotes = By
			.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailNotes']//div[@class='gw-label']");
	final By MenuBC_Policy_Ledger = By
			.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailLedger]//div[@class='gw-label']");
	final By MenuBC_Policy_Journal = By
			.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailJournal']//div[@class='gw-label']");
	final By MenuBC_Policy_Delinquencies = By
			.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailDelinquencies']//div[@class='gw-label']");

	/*
	 * Actions
	 */
	final By MenuBC_Policy_Actions_ChangePolicy = By
			.id("PolicyGroup-PolicyDetailMenuActions-PolicyDetailMenuActions_ChangePolicy");
	final By MenuBC_Policy_Actions_RenewPolicy = By
			.id("PolicyGroup-PolicyDetailMenuActions-PolicyDetailMenuActions_Renew");

	/*
	 * Producer Tab
	 */
	final By TabBC_Producer = By.xpath("//div[@id='TabBar-ProducersTab']//div[@class='gw-label']");
	final By TabBC_Producer_dd = By.xpath("//div[contains(@id,'TabBar-ProducersTab')]//div[3]");
	final By TabBC_Producer_ProducerName = By.xpath("//*[@id='TabBar-ProducersTab-ProducerNameSearchItem']/div/input");
	final By TabBC_Producer_ProducerNameSearch = By
			.xpath("//*[@id='TabBar-ProducersTab-ProducerNameSearchItem_Button']/span");

	final By TabBC_Producer_Actions_NewProducer = By
			.id("ProducersGroup-ProducersMenuActions-ProducersMenuActions_NewProducer");

	final By MenuBC_Producer_Actions_NewCommPayment = By.xpath(
			"//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_NewCommissionPayment']//div[@class='gw-label']");
	final By MenuBC_Producer_Actions_CommissionWriteOff = By.xpath(
			"//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_CommissionWriteoff']//div[@class='gw-label']");
	final By MenuBC_Producer_Actions_CommissionRecoveryWriteOff = By.xpath(
			"//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_CommissionRecoveryWriteoff']//div[@class='gw-label']");
	final By MenuBC_Producer_Actions_ReturnCommission = By.xpath(
			"//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_ReturnCommission']//div[@class='gw-label']");
	final By MenuBC_Producer_Actions_NewAgencyBillPayment = By.xpath(
			"//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_NewAgencyPayment']//div[@class='gw-label']");
	final By MenuBC_Producer_Actions_TransferFunds = By.xpath(
			"//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_TransferFunds']//div[@class='gw-label']");
	final By MenuBC_Producer_Actions_WriteOff = By.xpath(
			"//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_Writeoff']//div[@class='gw-label']");
	final By MenuBC_Producer_Actions_NegativeWriteOff = By.xpath(
			"//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_NegativeWriteoff']//div[@class='gw-label']");

	final By MenuBC_Producer_Summary = By.xpath(
			"//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerOverview-AccountOverview_AccountSummary']//div[@class='gw-label']");
	final By MenuBC_Producer_Contacts = By.xpath(
			"//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailContacts']//div[@class='gw-label']");
	final By MenuBC_Producer_Policies = By.xpath(
			"//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailContacts']//div[@class='gw-label']");
	final By MenuBC_Producer_DirectBillCommissionStatements = By.xpath(
			"//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerStatementOverview']//div[@class='gw-label']");
	final By MenuBC_Producer_AgencyBillPayments = By.xpath(
			"//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_AgencyBillPayments']//div[@class='gw-label']");
	final By MenuBC_Producer_AgencyBillDisbursements = By.xpath(
			"//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_AgencyBillDisbursements']//div[@class='gw-label']");
	final By MenuBC_Producer_TroubleTickets = By.xpath(
			"//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailTroubleTickets']//div[@class='gw-label']");
	final By MenuBC_Producer_Documents = By.xpath(
			"//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailDocuments']//div[@class='gw-label']");
	final By MenuBC_Producer_Notes = By.xpath(
			"//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailNotes']//div[@class='gw-label']");
	final By MenuBC_Producer_Transaction = By.xpath(
			"//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailNotes']//div[@class='gw-label']");
	final By MenuBC_Producer_Ledger = By.xpath(
			"//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailLedger]//div[@class='gw-label']");
	final By MenuBC_Producer_Transactions = By.xpath(
			"//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailTransactions']//div[@class='gw-label']");
	final By MenuBC_Producer_Journal = By.xpath(
			"//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailJournal']//div[@class='gw-label']");

	/*
	 * Search Tab
	 */
	final By TabBC_Search = By.xpath("//div[@id='TabBar-SearchTab']/div[@class='gw-label']");
	final By TabBC_Search_dd = By.xpath("//div[@id='TabBar-SearchTab']/div[3]");
	final By TabBC_Search_Accounts = By.id("TabBar-SearchTab-SearchGroup_AccountSearch");
	final By TabBC_Search_Policies = By.id("TabBar-SearchTab-SearchGroup_PolicySearch");
	final By TabBC_Search_Contacts = By.id("TabBar-SearchTab-SearchGroup_ContactSearch");
	final By TabBC_Search_Invoices = By.id("TabBar-SearchTab-SearchGroup_InvoiceSearch");
	final By TabBC_Search_Payments = By.id("TabBar-SearchTab-SearchGroup_PaymentSearch");
	final By TabBC_Search_Producers = By.id("TabBar-SearchTab-SearchGroup_ProducerSearch");
	final By TabBC_Search_Transactions = By.id("TabBar-SearchTab-SearchGroup_TransactionSearch");
	final By TabBC_Search_Activities = By.id("TabBar-SearchTab-SearchGroup_ActivitySearch");
	final By TabBC_Search_TroubleTickets = By.id("TabBar-SearchTab-SearchGroup_TroubleTicketSearch");
	final By TabBC_Search_DelinquencyProcesses = By.id("TabBar-SearchTab-SearchGroup_DelinquencyProcessSearch");
	final By TabBC_Search_Disbursements = By.id("TabBar-SearchTab-SearchGroup_DisbursementSearch");
	final By TabBC_Search_OutgoingProducerPayments = By
			.id("TabBar-SearchTab-SearchGroup_OutgoingProducerPaymentSearch");
	final By TabBC_Search_PaymentRequests = By.id("TabBar-SearchTab-SearchGroup_PaymentRequestSearch");
	final By TabBC_Search_DirectBillSuspenseItems = By.id("TabBar-SearchTab-SearchGroup_DirectBillSuspenseItemSearch");

	/*
	 * Team Tab - SubMenu
	 */

	final By TabBC_Team = By.xpath("//div[@id='TabBar-TeamTab']//div[@class='gw-label']");

	/*
	 * Administration Tab
	 */
	final By TabBC_Administration = By.xpath("//div[@id='TabBar-AdminTab']/div[@class='gw-label']");
	final By TabBC_Administration_dd = By.xpath("//div[@id='TabBar-AdministrationTab']/div[3]");
	final By TabBC_Administration_UsersAndSecurity = By.xpath(
			"//div[@id='TabBar-AdministrationTab-Admin_UsersAndSecurity']/div[@class='gw-action--expand-button']");
	final By TabBC_Administration_BusinessSettings = By.xpath(
			"//div[@id='TabBar-AdministrationTab-Admin_BusinessSettings']/div[@class='gw-action--expand-button']");
	final By TabBC_Administration_Monitoring = By
			.xpath("//div[@id='TabBar-AdministrationTab-Admin_Monitoring']/div[@class='gw-action--expand-button']");
	final By TabBC_Administration_Utilities = By
			.xpath("//div[@id='TabBar-AdministrationTab-Admin_Utilities']/div[@class='gw-action--expand-button']");

	final By MenuBC_Administration_Actions_NewBillingPlan = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewBillingPlan");
	final By MenuBC_Administration_Actions_NewPaymentPlan = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewPaymentPlan");
	final By MenuBC_Administration_Actions_NewCommissionPlan = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewCommissionPlan");
	final By MenuBC_Administration_Actions_NewDelinquencyPlan = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewDelinquencyPlan");
	final By MenuBC_Administration_Actions_NewAgencyBillPlan = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewAgencyBillPlan");
	final By MenuBC_Administration_Actions_NewReturnPremiumPlan = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewReturnPremiumPlan");
	final By MenuBC_Administration_Actions_NewPaymentAllocationPlan = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewPaymentAllocationPlan");
	final By MenuBC_Administration_Actions_NewCollectionAgency = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewCollectionAgency");
	final By MenuBC_Administration_Actions_NewChargePattern = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewChargePattern");
	final By MenuBC_Administration_Actions_NewUser = By.id("Admin-AdminMenuActions-AdminMenuActions_NewUser");
	final By MenuBC_Administration_Actions_NewRole = By.id("Admin-AdminMenuActions-AdminMenuActions_NewRole");
	final By MenuBC_Administration_Actions_NewGroup = By.id("Admin-AdminMenuActions-AdminMenuActions_NewGroup");
	final By MenuBC_Administration_Actions_NewAuthorityLimitProfile = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");

	final By MenuBC_Administration_UsersAndSecurity = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");
	final By MenuBC_Administration_UsersAndSecurity_Users = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");

	final By MenuBC_Administration_BusinessSettings = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");
	final By MenuBC_Administration_BusinessSettings_ActivityPatterns = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");

	final By MenuBC_Administration_Monitoring = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");
	final By MenuBC_Administration_Monitoring_MessageQueues = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");

	final By MenuBC_Administration_Utilities = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");
	final By MenuBC_Administration_Utilities_ImportData = By
			.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");

	/*
	 * Menu Options
	 * -------------------------------------------------------------------------
	 * ---- -------------------------------------
	 */

	final By ActionsBC_Newfinal = By.id("Group-MenuActions-NewAssignedActivity");
	final By ActionsBC_NewSharedActivity = By.id("Group-MenuActions-NewSharedActivity");
	final By ActionsBC_Preferences = By.id("Group-MenuActions-MenuActions_UserPreferences");
	/*
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ---- ClaimsCenter Tabs
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 * -------------------------------------------------------------------------
	 * ----
	 */
	/*
	 * Desktop Tab
	 */

	final By TabCC_Desktop = By.xpath("//div[@id='TabBar-DesktopTab']//div[@class='gw-label']");
	final By TabCC_Desktop_dd = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	final By TabCC_Desktop_Activities = By
			.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopActivities']//div[@class='gw-label gw-hasIcon']");
	final By TabCC_Desktop_Claims = By
			.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopClaims']//div[@class='gw-label gw-hasIcon']");
	final By TabCC_Desktop_Exposures = By
			.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopExposures']//div[@class='gw-label gw-hasIcon']");
	final By TabCC_Desktop_Subrogations = By
			.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopSubrogations']//div[@class='gw-label gw-hasIcon']");
	final By TabCC_Desktop_PendingAssignments = By.xpath(
			"//div[@id='TabBar-DesktopTab-Desktop_DesktopAwaitingAssignment']//div[@class='gw-label gw-hasIcon']");
	final By TabCC_Desktop_Queues = By
			.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopQueuedActivities']//div[@class='gw-label gw-hasIcon']");
	final By TabCC_Desktop_Calendar = By
			.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopCalendarGroup']//div[@class='gw-label gw-hasIcon']");
	final By TabCC_Desktop_Calendar_MyCalendar = By.xpath(
			"//div[contains(@id,'DesktopCalendarGroup_Calendar')]//div[@class='gw-action--inner gw-hasDivider']");
	final By TabCC_Desktop_Calendar_SupervisorCalendar = By.xpath(
			"//div[contains(@id,'DesktopCalendarGroup_SupervisorCalendar')]//div[@class='gw-action--inner gw-hasDivider']");
	final By TabCC_Desktop_BulkInvoices = By
			.xpath("//div[@id='TabBar-DesktopTab-Desktop_BulkPay']//div[@class='gw-label gw-hasIcon']");

	final By MenuCC_Desktop_Actions_Statistics = By
			.xpath("//div[@id='Desktop-DesktopMenuActions-DesktopMenuActions_Statistics']//div[@class='gw-label']");
	final By MenuCC_Desktop_Actions_Preferences = By
			.xpath("//div[@id='Desktop-DesktopMenuActions-DesktopMenuActions_Preferences']//div[@class='gw-label']");
	final By MenuCC_Desktop_Actions_VacationStatus = By
			.xpath("//div[@id='Desktop-DesktopMenuActions-DesktopMenuActions_UserVacation']//div[@class='gw-label']");
	final By MenuCC_Desktop_BulkInvoices = By
			.xpath("//div[@id='Desktop-MenuLinks-Desktop_BulkPay']");
	/*
	 * Claims Tab
	 */
	final By TabCC_Claim = By.xpath("//div[@id='TabBar-ClaimTab']//div[@class='gw-label']");
	final By TabCC_Claim_dd = By.xpath("//div[@id='TabBar-ClaimTab']//div[3]");
	final By TabCC_Claim_NewClaim = By
			.xpath("//div[@id='TabBar-ClaimTab-ClaimTab_FNOLWizard']//div[@class='gw-label']");
	final By TabCC_Claim_ClaimNumber = By.xpath("//input[@name='TabBar-ClaimTab-ClaimTab_FindClaim']");
	final By TabCC_Claim_ClaimNumber_Search = By.xpath("//div[@id='TabBar-ClaimTab-ClaimTab_FindClaim_Button']//span");

	/*
	 * New
	 */
	final By MenuCC_Claim_Actions_NewNote = By
			.xpath("//div[contains(@id,'ClaimMenuActions_NewNote')]//div[@class='gw-label']");
	final By MenuCC_Claim_Actions_New_Email = By
			.xpath("//div[contains(@id,'ClaimMenuActions_NewEmail')]//div[@class='gw-label']");
	final By MenuCC_Claim_Actions_New_Matter = By
			.xpath("//div[contains(@id,'ClaimMenuActions_NewMatter')]//div[@class='gw-label']");
	final By MenuCC_Claim_Actions_New_Evaluation = By
			.xpath("//div[contains(@id,'ClaimMenuActions_NewEvaluation')]//div[@class='gw-label']");
	final By MenuCC_Claim_Actions_New_Negotiation = By
			.xpath("//div[contains(@id,'ClaimMenuActions_NewNegotiation')]//div[@class='gw-label']");
	final By MenuCC_Claim_Actions_New_Service = By
			.xpath("//div[contains(@id,'ClaimMenuActions_NewServiceRequest')]//div[@class='gw-label']");
	/*
	 * New Transaction
	 */
	final By MenuCC_Claim_Actions_NewTransaction_Reserve = By
			.xpath("//div[contains(@id,'ClaimMenuActions_NewTransaction_ReserveSet')]//div[@class='gw-label']");
	final By MenuCC_Claim_Actions_NewTransaction_Check = By
			.xpath("//div[contains(@id,'ClaimMenuActions_NewTransaction_CheckSet')]//div[@class='gw-label']");
	final By MenuCC_Claim_Actions_NewTransaction_Other = By.xpath(
			"//div[@id='Claim-ClaimMenuActions-ClaimMenuActions_NewTransaction-ClaimMenuActions_NewOtherTrans']");
	final By MenuCC_Claim_Actions_NewTransaction_Other_ManualCheck = By
			.xpath("//div[contains(@id,'NewTransaction_Check')]//div[text()='Manual Check']");
	final By MenuCC_Claim_Actions_NewTransaction_Other_Recovery = By
			.xpath("//div[contains(@id,'NewTransaction_RecoverySet')]//div[text()='Recovery']");
	final By MenuCC_Claim_Actions_NewTransaction_Other_RecoveryReserve = By
			.xpath("//div[contains(@id,'NewTransaction_RecoverySet')]//div[text()='Recovery Reserve']");

	/*
	 * New Document
	 */
	final By MenuCC_Claim_Actions_NewDocument_Createfromatemplate = By
			.xpath("//div[contains(@id,'ClaimNewDocumentMenuItemSet_Create')]//div[@class='gw-label']");
	final By MenuCC_Claim_Actions_NewDocument_UploadDocuments = By
			.xpath("//div[contains(@id,'ClaimNewDocumentMenuItemSet_Link')]//div[@class='gw-label']");
	final By MenuCC_Claim_Actions_NewDocument_Indicateexistenceofadocument = By
			.xpath("//div[contains(@id,'ClaimNewDocumentMenuItemSet_IndicateExists')]//div[@class='gw-label']");
	/*
	 * New Activity
	 */
	final By MenuCC_Claim_Actions_NewActivity_Correspondence = By.xpath(
			"//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='Correspondence']");
	final By MenuCC_Claim_Actions_NewActivity_Correspondence_SendclaimAcknowledgementLetter = By.xpath(
			"//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Send claim acknowledgement letter']");
	final By MenuCC_Claim_Actions_NewActivity_Correspondence_SendLetterConfirmingClosureOfExposure = By.xpath(
			"//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Send letter confirming closure of exposure']");
	final By MenuCC_Claim_Actions_NewActivity_Correspondence_SendReservationOfRightsLetter = By.xpath(
			"//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Send reservation of rights letter']");

	final By MenuCC_Claim_Actions_NewActivity_Interview = By.xpath(
			"//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='Interview']");
	final By MenuCC_Claim_Actions_NewActivity_Interview_GetAStatementFromWitness = By.xpath(
			"//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Get a statement from witness']");
	final By MenuCC_Claim_Actions_NewActivity_Interview_MakeInitialContactWithInsured = By.xpath(
			"//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Make initial contact with insured']");

	final By MenuCC_Claim_Actions_NewActivity_NewMail = By.xpath(
			"//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='New Mail']");
	final By MenuCC_Claim_Actions_NewActivity_NewMail_ReviewNewBillReceived = By
			.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Review new bill received']");
	final By MenuCC_Claim_Actions_NewActivity_NewMail_ReviewNewMail = By
			.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Review new mail']");

	final By MenuCC_Claim_Actions_NewActivity_Reminder = By.xpath(
			"//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='Reminder']");
	final By MenuCC_Claim_Actions_NewActivity_Reminder_30DayDiary = By
			.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='30 day diary']");
	final By MenuCC_Claim_Actions_NewActivity_Reminder_60DayDiary = By
			.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='60 day diary']");
	final By MenuCC_Claim_Actions_NewActivity_Reminder_90DayDiary = By
			.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='90 day diary']");

	final By MenuCC_Claim_Actions_NewActivity_Request = By.xpath(
			"//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='Request']");
	final By MenuCC_Claim_Actions_NewActivity_Request_AdditionalLivingExpensesRequired = By.xpath(
			"//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Additional living expenses required']");
	final By MenuCC_Claim_Actions_NewActivity_Request_CreateRecoveryEmailBill1 = By
			.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Create Recovery email bill1']");
	final By MenuCC_Claim_Actions_NewActivity_Request_CreateRecoveryEmailBill2 = By
			.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Create Recovery email bill2']");

	final By MenuCC_Claim_Actions_NewActivity_Warning = By.xpath(
			"//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='Warning']");
	final By MenuCC_Claim_Actions_NewActivity_Warning_UnableToCloseTheClaimOrTheExposure = By.xpath(
			"//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='Unable to close the claim or the exposure']");
	/*
	 * New Exposure
	 */
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Choose by Coverage Type']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='C']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_Collision = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Collision']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_CollisionLimitedCoverage = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Collision - Limited Coverage']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_Comprehensive = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Comprehensive']");

	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_D = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='D']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_D_DeathAndDisabilityBenefit = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Death and Disability Benefit']");

	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_E = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='E']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_E_ElectronicEquipment = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Electronic Equipment']");

	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='L']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityBodilyInjury = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Liability - Bodily Injury']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityPropertyDamage = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Liability - Property Damage']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityVehicleDamage = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Liability - Vehicle Damage']");

	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='M']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Mexico Coverage - Limited']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovBI = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Mexico Cov - BI']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovPD = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Mexico Cov - PD']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovVehicleDamage = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Mexico Cov - Vehicle Damage']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovGenDamages = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Mexico Cov - Gen. Damages']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MedicalPayments = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Medical Payments']");

	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='P']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPArkansas = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Arkansas']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPDelaware = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Delaware']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPDistrictOfColumbia = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - District of Columbia']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPFlorida = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Florida']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPHawaii = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Hawaii']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPKansas = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Kansas']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPKentucky = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Kentucky']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMaryland = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Maryland']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMassachusetts = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Massachusetts']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMichigan = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Michigan']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMinnesota = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Minnesota']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNewJersey = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - New Jersey']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNewYork = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - New York']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNorthDakota = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - North Dakota']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPOregon = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Oregon']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPPennsylvania = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Pennsylvania']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPTexas = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Texas']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPUtah = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Utah']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPWashington = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Washington']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PropertyProtectionInsurance = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Property Protection Insurance']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='R']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R_RentalCarLossOfUse = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Rental Car Loss of Use']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R_RentalReimbursement = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Rental Reimbursement']");

	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='T']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T_TapeDiscMedia = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Tape / Disc Media']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T_TowingAndLabor = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Towing and Labor']");

	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='U']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UnderinsuredMotoristBodilyInjury = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Underinsured Motorist - Bodily Injury']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UnderinsuredMotoristPropertyDamage = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Underinsured Motorist - Property Damage']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UninsuredMotoristBodilyInjury = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Uninsured Motorist - Bodily Injury']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UninsuredMotoristPropertyDamage = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Uninsured Motorist - Property Damage']");

	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Choose by Coverage']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Policy Level Coverage']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Liability - Bodily Injury and Property Damage']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityBodilyInjury = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Liability - Bodily Injury']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityPropertyDamage = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Liability - Property Damage']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityVehicleDamage = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Liability - Vehicle Damage']");

	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Mexico Coverage - Limited']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovBI = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Mexico Cov - BI']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovPD = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Mexico Cov - PD']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovVehicleDamage = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Mexico Cov - Vehicle Damage']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovGenDamages = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Mexico Cov - Gen. Damages']");

	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MedicalPayments = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Medical Payments']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UninsuredMotoristBodilyInjury = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Uninsured Motorist - Bodily Injury']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UninsuredMotoristPropertyDamage = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Uninsured Motorist - Property Damage']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UnderinsuredMotoristPropertyDamage = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Underinsured Motorist - Property Damage']");
	/*
	 * Claim Actions
	 */

	final By MenuCC_Claim_Actions_ClaimActions_AssignClaim = By.xpath(
			"//div[contains(@id,'ClaimActions-ClaimMenuActions_Assign')]//div[@class='gw-label' and text()='Assign Claim']");
	final By MenuCC_Claim_Actions_ClaimActions_CloseClaim = By.xpath(
			"//div[contains(@id,'ClaimActions-ClaimMenuActions_CloseClaim')]//div[@class='gw-label' and text()='Close Claim']");
	final By MenuCC_Claim_Actions_ClaimActions_PrintClaim = By.xpath(
			"//div[contains(@id,'ClaimActions-ClaimMenuActions_Print')]//div[@class='gw-label' and text()='Print Claim']");
	final By MenuCC_Claim_Actions_ClaimActions_SyncStatus = By.xpath(
			"//div[contains(@id,'ClaimActions-ClaimMenuActions_SyncStatus')]//div[@class='gw-label' and text()='Sync Status']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly = By.xpath(
			"//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimValidation')]//div[@class='gw-label' and text()='Validate Claim Only']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_LoadAndSave = By.xpath(
			"//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimValidation')]//div[@class='gw-label' and text()='Load and save']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_NewLossCompletion = By.xpath(
			"//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimValidation')]//div[@class='gw-label' and text()='New loss completion']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_ValidForISO = By.xpath(
			"//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimValidation')]//div[@class='gw-label' and text()='Valid for ISO']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_SendToExternalSystem = By.xpath(
			"//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimValidation')]//div[@class='gw-label' and text()='Send to external system']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_AbilityToPay = By.xpath(
			"//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimValidation')]//div[@class='gw-label' and text()='Ability to pay']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures = By.xpath(
			"//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimExposureValidation')]//div[@class='gw-label' and text()='Validate Claim + Exposures']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_LoadAndSave = By.xpath(
			"//div[contains(@id,'ClaimMenuActions_ClaimExposureValidation')]//div[@class='gw-label' and text()='Load and save']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_NewLossCompletion = By.xpath(
			"//div[contains(@id,'ClaimMenuActions_ClaimExposureValidation')]//div[@class='gw-label' and text()='New loss completion']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_ValidForISO = By.xpath(
			"//div[contains(@id,'ClaimMenuActions_ClaimExposureValidation')]//div[@class='gw-label' and text()='Valid for ISO']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_SendToExternalSystem = By.xpath(
			"//div[contains(@id,'ClaimMenuActions_ClaimExposureValidation')]//div[@class='gw-label' and text()='Send to external system']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_AbilityToPay = By.xpath(
			"//div[contains(@id,'ClaimMenuActions_ClaimExposureValidation')]//div[@class='gw-label' and text()='Ability to pay']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidatePolicy = By.xpath(
			"//div[contains(@id,'ClaimActions-ClaimMenuActions_PolicyValidation')]//div[@class='gw-label' and text()='Validate Policy']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_LoadAndSave = By.xpath(
			"//div[contains(@id,'ClaimMenuActions_PolicyValidation')]//div[@class='gw-label' and text()='Load and save']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_NewLossCompletion = By.xpath(
			"//div[contains(@id,'ClaimMenuActions_PolicyValidation')]//div[@class='gw-label' and text()='New loss completion']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_ValidForISO = By.xpath(
			"//div[contains(@id,'ClaimMenuActions_PolicyValidation')]//div[@class='gw-label' and text()='Valid for ISO']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_SendToExternalSystem = By.xpath(
			"//div[contains(@id,'ClaimMenuActions_PolicyValidation')]//div[@class='gw-label' and text()='Send to external system']");
	final By MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_AbilityToPay = By.xpath(
			"//div[contains(@id,'ClaimMenuActions_PolicyValidation')]//div[@class='gw-label' and text()='Ability to pay']");

	/*
	 * Claim MenuLinks
	 */
	final By MenuCC_Claim_Summary = By
			.xpath("//div[contains(@id,'ClaimSummaryGroup')]//div[@class='gw-label gw-hasIcon' and text()='Summary']");
	final By MenuCC_Claim_Summary_Overview = By.xpath(
			"//div[contains(@id,'ClaimSummaryGroup_ClaimSummary')]//div[@class='gw-label' and text()='Overview']");
	final By MenuCC_Claim_Summary_Status = By
			.xpath("//div[contains(@id,'ClaimSummaryGroup_ClaimStatus')]//div[@class='gw-label' and text()='Status']");
	final By MenuCC_Claim_Summary_HealthMetrics = By.xpath(
			"//div[contains(@id,'ClaimSummaryGroup_ClaimKeyMetrics')]//div[@class='gw-label' and text()='Health Metrics']");
	final By MenuCC_Claim_Workplan = By.xpath(
			"//div[contains(@id,'Claim_ClaimWorkplan')]//div[@class='gw-label gw-hasIcon' and text()='Workplan']");
	final By MenuCC_Claim_LossDetails = By.xpath(
			"//div[contains(@id,'Claim_ClaimLossDetailsGroup')]//div[@class='gw-label gw-hasIcon' and text()='Loss Details']");
	final By MenuCC_Claim_LossDetails_General = By.xpath(
			"//div[contains(@id,'ClaimLossDetailsGroup_ClaimLossDetails')]//div[@class='gw-label' and text()='General']");
	final By MenuCC_Claim_LossDetails_Asociations = By
			.xpath("//div[contains(@id,'ClaimLossDetailsGroup_ClaimAssociations')]//div[@class='gw-label']");
	final By MenuCC_Claim_LossDetails_SpecialInvestigationDetails = By.xpath(
			"//div[contains(@id,'ClaimLossDetailsGroup_SIDetails')]//div[@class='gw-label' and text()='Special I']");
	final By MenuCC_Claim_MedicalDetails = By
			.xpath("//div[@id='Claim-MenuLinks-0-Claim_TopLevelExposureDetail']//div[@class='gw-action--inner']");
	final By MenuCC_Claim_Indemnity = By
			.xpath("//div[@id='Claim-MenuLinks-1-Claim_TopLevelExposureDetail']//div[@class='gw-action--inner']");
	final By MenuCC_Claim_Exposures = By.xpath(
			"//div[contains(@id,'Claim_ClaimExposures')]//div[@class='gw-label gw-hasIcon' and text()='Exposures']");
	final By MenuCC_Claim_Reinsurance = By.xpath(
			"//div[contains(@id,'Claim_ReinsuranceSummary')]//div[@class='gw-label gw-hasIcon' and text()='Reinsurance']");
	final By MenuCC_Claim_PartiesInvolved = By.xpath(
			"//div[contains(@id,'ClaimPartiesGroup')]/div[@role='menuitem']//div[@class='gw-label gw-hasIcon' and text()='Parties Involved']");
	final By MenuCC_Claim_PartiesInvolved_Contacts = By
			.xpath("//div[contains(@id,'ClaimPartiesGroup_ClaimContacts')]/div[@role='menuitem']");
	final By MenuCC_Claim_PartiesInvolved_Users = By
			.xpath("//div[contains(@id,'ClaimPartiesGroup_ClaimUsers')]/div[@role='menuitem']");
	final By MenuCC_Claim_Policy = By.xpath(
			"//div[contains(@id,'Claim_ClaimPolicyGroup')]//div[@class='gw-label gw-hasIcon' and text()='Policy']");
	final By MenuCC_Claim_Policy_General = By.xpath(
			"//div[contains(@id,'Claim_ClaimPolicyGroup')]//div[@class='gw-label gw-hasIcon' and text()='Policy']");
	final By MenuCC_Claim_Policy_Vehicle = By.xpath(
			"//div[contains(@id,'Claim_ClaimPolicyGroup')]//div[@class='gw-label gw-hasIcon' and text()='Policy']");
	final By MenuCC_Claim_Policy_Endorsements = By.xpath(
			"//div[contains(@id,'Claim_ClaimPolicyGroup')]//div[@class='gw-label gw-hasIcon' and text()='Policy']");
	final By MenuCC_Claim_Policy_AggregateLimits = By.xpath(
			"//div[contains(@id,'Claim_ClaimPolicyGroup')]//div[@class='gw-label gw-hasIcon' and text()='Policy']");
	final By MenuCC_Claim_Financials = By.xpath(
			"//div[contains(@id,'Claim_ClaimFinancialsGroup')]//div[@class='gw-label gw-hasIcon' and text()='Financials']");
	final By MenuCC_Claim_Financials_Summary = By.xpath(
			"//div[contains(@id,'ClaimFinancialsSummary')]//div[@role='menuitem' and @class='gw-action--inner']");
	final By MenuCC_Claim_Financials_Transactions = By.xpath(
			"//div[contains(@id,'ClaimFinancialsTransactions')]//div[@role='menuitem' and @class='gw-action--inner']");
	final By MenuCC_Claim_Financials_Checks = By
			.xpath("//div[contains(@id,'ClaimFinancialsChecks')]//div[@role='menuitem' and @class='gw-action--inner']");
	final By MenuCC_Claim_Notes = By
			.xpath("//div[contains(@id,'Claim_ClaimNotes')]//div[@class='gw-label gw-hasIcon' and text()='Notes']");
	final By MenuCC_Claim_Documents = By.xpath(
			"//div[contains(@id,'Claim_ClaimDocuments')]//div[@class='gw-label gw-hasIcon' and text()='Documents']");
	final By MenuCC_Claim_PlanofAction = By.xpath(
			"//div[contains(@id,'Claim_ClaimPlanOfActionGroup')]//div[@class='gw-label gw-hasIcon' and text()='Plan of Action']");
	final By MenuCC_Claim_PlanofAction_Evaluations = By
			.xpath("//div[contains(@id,'ClaimEvaluations')]//div[@class='gw-action--inner' and @role='menuitem']");
	final By MenuCC_Claim_PlanofAction_Negotiations = By
			.xpath("//div[contains(@id,'ClaimNegotiations')]//div[@class='gw-action--inner' and @role='menuitem']");
	final By MenuCC_Claim_Services = By.xpath(
			"//div[contains(@id,'Claim_ClaimServiceRequests')]//div[@class='gw-label gw-hasIcon' and text()='Services']");
	final By MenuCC_Claim_Litigation = By.xpath(
			"//div[contains(@id,'Claim_ClaimMatters')]//div[@class='gw-label gw-hasIcon' and text()='Litigation']");
	final By MenuCC_Claim_History = By
			.xpath("//div[contains(@id,'Claim_ClaimHistory')]//div[@class='gw-label gw-hasIcon' and text()='History']");
	final By MenuCC_Claim_FNOLSnapshot = By.xpath(
			"//div[contains(@id,'Claim_ClaimSnapshotGroup')]//div[@class='gw-label gw-hasIcon' and text()='FNOL Snapshot']");
	final By MenuCC_Claim_FNOLSnapshot_LossDetials = By.xpath(
			"//div[contains(@id,'ClaimSnapshotLossDetails')]//div[@role='menuitem' and @class='gw-action--inner']");
	final By MenuCC_Claim_FNOLSnapshot_PartiesInvolced = By.xpath(
			"//div[contains(@id,'ClaimSnapshotPartiesInvolved')]//div[@role='menuitem' and @class='gw-action--inner']");
	final By MenuCC_Claim_FNOLSnapshot_Policy = By
			.xpath("//div[contains(@id,'ClaimSnapshotPolicy')]//div[@role='menuitem' and @class='gw-action--inner']");
	final By MenuCC_Claim_FNOLSnapshot_Exposure = By.xpath(
			"//div[contains(@id,'ClaimSnapshotExposures')]//div[@role='menuitem' and @class='gw-action--inner']");
	final By MenuCC_Claim_FNOLSnapshot_Notes = By
			.xpath("//div[contains(@id,'ClaimSnapshotNotes')]//div[@role='menuitem' and @class='gw-action--inner']");
	final By MenuCC_Claim_FNOLSnapshot_Document = By.xpath(
			"//div[contains(@id,'ClaimSnapshotDocuments')]//div[@role='menuitem' and @class='gw-action--inner']");
	final By MenuCC_Claim_FNOLSnapshot_AdditionalFileds = By.xpath(
			"//div[contains(@id,'ClaimSnapshotExtraFields')]//div[@role='menuitem' and @class='gw-action--inner']");
	final By MenuCC_Claim_Calendar = By
			.xpath("//div[contains(@id,'Claim_ClaimCalendarGroup')]//div[@class='gw-label gw-hasIcon']");
	final By MenuCC_Claim_Calendar_MyCalender = By
			.xpath("//div[contains(@id,'ClaimCalendarGroup_ClaimCalendar')]//div[@class='gw-action--inner']");
	final By MenuCC_Claim_Calendar_SupervisorCalender = By
			.xpath("//div[contains(@id,'ClaimCalendarGroup_SupervisorClaimCalendar')]//div[@class='gw-action--inner']");

	/*
	 * Search Tab
	 */
	final By TabCC_Search = By.xpath("//div[@id='TabBar-SearchTab']/div[@class='gw-label']");
	final By TabCC_Search_dd = By.xpath("//div[@id='TabBar-SearchTab']/div[3]");
	final By TabCC_Search_Claims = By
			.xpath("//div[@id='TabBar-SearchTab-Search_ClaimSearchesGroup']//div[@class='gw-label']");
	final By TabCC_Search_Claims_SimpleSearch = By.id("TabBar-SearchTab-Search_PolicySearch");
	final By TabCC_Search_Claims_AdvancedSearch = By.id("TabBar-SearchTab-Search_PolicySearch");
	final By TabCC_Search_Activities = By
			.xpath("//div[@id='TabBar-SearchTab-Search_ActivitySearch']//div[@class='gw-label']");
	final By TabCC_Search_Checks = By
			.xpath("//div[@id='TabBar-SearchTab-Search_PaymentSearch']//div[@class='gw-label']");
	final By TabCC_Search_Recoveries = By
			.xpath("//div[@id='TabBar-SearchTab-Search_RecoverySearch']//div[@class='gw-label']");
	final By TabCC_Search_BulkInvoices = By
			.xpath("//div[@id='TabBar-SearchTab-Search_BulkInvoiceSearch']//div[@class='gw-label']");

	/*
	 * Team Tab - SubMenu
	 */

	final By TabCC_Team = By.xpath("//div[@id='TabBar-TeamTab']//div[@class='gw-label']");

	/*
	 * AdministrationTab Tab - SubMenu
	 */
	final By TabCC_Administration = By.xpath("//div[@id='TabBar-AdminTab']/div[@role='tab']");
	final By TabCC_Adminsitration_dd = By.xpath("//div[@id='TabBar-AdminTab']//div[@class='gw-action--expand-button']");
	final By TabCC_Adminsitration_PrintUserGroupTree = By
			.xpath("//div[@id='TabBar-AdminTab-AdminTab_PrintUserGroupTree']//div[@role='menuitem']");

	// User And Security SubMenu

	final By MenuCC_Administration_UsersAndSecurity = By
			.xpath("//div[@id='Admin-MenuLinks-Admin_UsersAndSecurity']//div[@class='gw-action--expand-button']");
	final By MenuCC_UserAndSecurity_Users = By
			.xpath("//div[contains(@id,'UsersAndSecurity_AdminUserSearchPage')]//div[@role='menuitem']");
	final By MenuCC_UserAndSecurity_Groups = By
			.xpath("//div[contains(@id,'UsersAndSecurity_AdminGroupSearchPage')]//div[@role='menuitem']");
	final By MenuCC_UserAndSecurity_Roles = By
			.xpath("//div[contains(@id,'UsersAndSecurity_Roles')]//div[@role='menuitem']");
	final By MenuCC_UserAndSecurity_Regions = By
			.xpath("//div[contains(@id,'UsersAndSecurity_Regions')]//div[@role='menuitem']");
	final By MenuCC_UserAndSecurity_SecurityZones = By
			.xpath("//div[contains(@id,'UsersAndSecurity_SecurityZones')]//div[@role='menuitem']");
	final By MenuCC_UserAndSecurity_AuthorityLimitProfile = By
			.xpath("//div[contains(@id,'UsersAndSecurity_AuthorityLimitProfiles')]//div[@role='menuitem']");
	final By MenuCC_UserAndSecurity_Attributes = By
			.xpath("//div[contains(@id,'UsersAndSecurity_Attributes')]//div[@role='menuitem']");

	// Special Handling
	final By MenuCC_Administration_SpecialHandling = By
			.xpath("//div[@id='TabBar-AdminTab-Admin_Monitoring']/div[@class='gw-action--expand-button']");
	final By MenuCC_SpecialHandling_Accounts = By
			.xpath("//div[contains(@id,'SpecialHandling_AccountAdmin')]/div[@role='menuitem']");
	final By MenuCC_SpecialHandling_ServiceTiers = By
			.xpath("//div[contains(@id,'SpecialHandling_CustomerServiceTierAdmin')]/div[@role='menuitem']");

	// Business Settings
	final By MenuCC_Administration_BusinessSettings = By.xpath(
			"//div[@id='Admin-MenuLinks-Admin_BusinessSettings']/div[@class='gw-action--expand-button']/div[@class='gw-icon gw-icon--expand']");
	final By MenuCC_BusinessSettings_Expand = By
			.xpath("//div[@id='Admin-MenuLinks-Admin_BusinessSettings']/div[@class='gw-action--expand-button']");
	/* Business Rules SubMenu */
	final By MenuCC_BusinessSettings_BusinessRules = By
			.xpath("//div[contains(@id,'BusinessSettings_BusinessRules')]/div[@class='gw-action--expand-button']");
	final By MenuCC_BusinessSettings_BusinessRules_ActvityRules = By
			.xpath("//div[contains(@id,'BusinessRules_ActivityRules')]/div[@role='menuitem']");
	final By MenuCC_BusinessSettings_BusinessRules_ExposureRules = By
			.xpath("//div[contains(@id,'BusinessRules_ExposureRules')]/div[@role='menuitem']");
	final By MenuCC_BusinessSettings_BusinessRules_ReserveRules = By
			.xpath("//div[contains(@id,'BusinessRules_ReserveRules')]/div[@role='menuitem']");
	final By MenuCC_BusinessSettings_BusinessRules_ExportImportStatus = By
			.xpath("//div[contains(@id,'BusinessRules_CCRulesExportImportStatus')]/div[@role='menuitem']");

	final By MenuCC_BusinessSettings_ActivityPatterns = By
			.xpath("//div[contains(@id,'BusinessSettings_ActivityPatterns')]//div[@role='menuitem']");
	final By MenuCC_BusinessSettings_BusinessWeek = By
			.xpath("//div[contains(@id,'BusinessSettings_BusinessWeek')]//div[@role='menuitem']");
	final By MenuCC_BusinessSettings_Catastrophes = By
			.xpath("//div[contains(@id,'BusinessSettings_Catastrophes')]//div[@role='menuitem']");
	final By MenuCC_BusinessSettings_CoverageVerification = By.xpath(
			"//div[contains(@id,'BusinessSettings_CoverageDetermination')]/div[@class='gw-action--expand-button']");
	/* Coverage Verification SubMenu */
	final By MenuCC_BusinessSettings_CoverageVerification_InvalidCoverageForCause = By
			.xpath("//div[contains(@id,'CoverageDetermination_InvalidCoverageForCause')]/div[@role='menuitem']");
	final By MenuCC_BusinessSettings_CoverageVerification_IncompatibleNewExposure = By
			.xpath("//div[contains(@id,'CoverageDetermination_IncompatibleNewExposure')]/div[@role='menuitem']");
	final By MenuCC_BusinessSettings_CoverageVerification_PossibleInvalidCoverage = By
			.xpath("//div[contains(@id,'CoverageDetermination_InvalidCoverageForFault')]/div[@role='menuitem']");

	final By MenuCC_BusinessSettings_Holidays = By
			.xpath("//div[contains(@id,'BusinessSettings_Holidays')]//div[@role='menuitem']");
	final By MenuCC_BusinessSettings_ICDCodes = By
			.xpath("//div[contains(@id,'BusinessSettings_ICD')]//div[@role='menuitem']");
	final By MenuCC_BusinessSettings_MetricsAndThresholds = By
			.xpath("//div[contains(@id,'BusinessSettings_KeyMetrics')]//div[@role='menuitem']");
	final By MenuCC_BusinessSettings_ReinsuranceThresholds = By
			.xpath("//div[contains(@id,'BusinessSettings_ReinsuranceThresholds')]//div[@role='menuitem']");
	final By MenuCC_BusinessSettings_WCParameters = By
			.xpath("//div[contains(@id,'BusinessSettings_WCParms')]/div[@class='gw-action--expand-button']");
	/* WC Parameters SubMenu */
	final By MenuCC_BusinessSettings_WCParameters_BenefitParameters = By
			.xpath("//div[contains(@id,'WCParms-WCParms_WCBenefitParameterSet')]/div[@role='menuitem']");
	final By MenuCC_BusinessSettings_WCParameters_PPDMinMax = By
			.xpath("//div[contains(@id,'WCParms-WCParms_WCPDBenefits')]/div[@role='menuitem']");
	final By MenuCC_BusinessSettings_WCParameters_PPDWeeks = By
			.xpath("//div[contains(@id,'WCParms-WCParms_WCPDWeeksAndLimits')]/div[@role='menuitem']");
	final By MenuCC_BusinessSettings_WCParameters_CompensabilityParameters = By
			.xpath("//div[contains(@id,'WCParms-WCParms_DenialPeriods')]/div[@role='menuitem']");

	// Monitoring
	final By MenuCC_Administration_Monitoring = By
			.xpath("//div[@id='TabBar-AdminTab-Admin_Monitoring']/div[@class='gw-action--expand-button']");
	/* Monitoring SubMenu */
	final By MenuCC_Monitoring_MessageQueues = By
			.xpath("//div[contains(@id,'MessagingDestinationControlList')]/div[@role='menuitem']");
	final By MenuCC_Monitoring_WorkFlows = By.xpath("//div[contains(@id,'WorkflowSearch')]/div[@role='menuitem']");
	final By MenuCC_Monitoring_WorkFlowsStatistics = By
			.xpath("//div[contains(@id,'WorkflowStats')]/div[@role='menuitem']");

	// Utilities
	final By MenuCC_Administration_Utilities = By
			.xpath("//div[@id='TabBar-AdminTab-Admin_Utilities']/div[@class='gw-action--expand-button']");
	/* Utilities SubMenu */
	final By MenuCC_Utilities_ImportData = By
			.xpath("//div[contains(@id,'Utilities_ImportWizard')]/div[@role='menuitem']");
	final By MenuCC_Utilities_ExportData = By
			.xpath("//div[contains(@id,'Utilities_ExportData')]/div[@role='menuitem']");
	final By MenuCC_Utilities_ScriptParameters = By
			.xpath("//div[contains(@id,'Utilities_ScriptParametersPage')]/div[@role='menuitem']");
	final By MenuCC_Utilities_DataChange = By
			.xpath("//div[contains(@id,'Utilities_DataChangePage')]/div[@role='menuitem']");
	final By MenuCC_Utilities_InboundFiles = By
			.xpath("//div[contains(@id,'Utilities_InboundFileSearch')]/div[@role='menuitem']");
	final By MenuCC_Utilities_OutboundFiles = By
			.xpath("//div[contains(@id,'Utilities_OutboundFileSearch')]/div[@role='menuitem']");
	final By MenuCC_Utilities_RuntimeProperties = By
			.xpath("//div[contains(@id,'Utilities_Properties')]/div[@role='menuitem']");

	/*
	 * 
	 */
	final By CCMedicalDetails = By
			.xpath("//div[@id='Claim-MenuLinks-0-Claim_TopLevelExposureDetail']//div[@class='gw-label gw-hasIcon']");
	final By CCIndemnity = By
			.xpath("//div[@id='Claim-MenuLinks-1-Claim_TopLevelExposureDetail']//div[@class='gw-label gw-hasIcon']");
	final By CCEmployerLiability = By
			.xpath("//div[@id='Claim-MenuLinks-2-Claim_TopLevelExposureDetail']//div[@class='gw-label gw-hasIcon']");

	final By Tab_Producer = By.xpath("//div[@id='TabBar-ProducersTab']//div[@class='gw-label']");
	final By Tab_Producer_dd = By.xpath("//div[contains(@id,'TabBar-ProducersTab')]//div[3]");

	/* Address Tab */
	final By TabCC_AddressBook = By.xpath("//div[@id='TabBar-AddressBookTab']//div[@role='tab']");

	/* DashBoard Tab */
	final By TabCC_DashBoard = By.xpath("//div[@id='TabBar-DashboardTab']//div[@role='tab']");

	/*
	 * Page Headers - Claims Center
	 */

	/*
	 * -------------------------------------------------------------------------
	 * ---- ------------------------------------------- Conact Management Tabs
	 * -------------------------------------------------------------------------
	 * ---- -------------------------------------------
	 */

	/*
	 * Page Headers - Policy Center
	 */

	final By Screen_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title']");

	final By EnterAccountInformation = By
			.xpath("//div[contains(@id,'NewAccountScreen-ttlBar')]//div[text()='Enter Account Information']");

	final By AccountSummary = By
			.xpath("//div[contains(@id,'AccountFile_Summary-ttlBar')]//div[text(),'Account Summary']");

	final By AccountSummary_Name = By
			.xpath("//div[contains(@id,'AccountFile_Summary-ttlBar')]//div[contains(text(),'Account Summary')]");

	final By Producer_Header = By.xpath("//div[contains(@id,'AccountFile_Summary-ttlBar')]//div[text(),'Producer')]");

	final By NewSubmission_Header = By.xpath("//div[contains(@id,'Screen-ttlBar')]//div[text()='New Submissions']");

	/*
	 * void gwContactManagement_TabNavigation(String Tab, String Value) throws
	 * Throwable;
	 * 
	 * void gwPolicyCenter_TabNavigation(String Tab, String Value) throws Throwable;
	 * 
	 * void gwBillingCenter_TabNavigation(String Tab, String Value) throws
	 * Throwable;
	 * 
	 * void gwClaimsCenter_TabNavigation(String Tab, String Value) throws Throwable;
	 * 
	 * void gwContactManagement_MenuNavigation(String strMenuOption) throws
	 * Throwable;
	 * 
	 * void gwPolicyCenter_MenuNavigation(String Menu) throws Throwable;
	 * 
	 * void gwBillingCenter_MenuNavigation(String Menu) throws Throwable;
	 * 
	 * void gwClaimsCenter_MenuNavigation(String Menu) throws Throwable;
	 */
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelCollision = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Collision']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelComprehensive = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Comprehensive']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelRentalReimbursement = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Rental Reimbursement']");
	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelTowingAndLabor = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Towing and Labor']");

	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelElectronicEquipment = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Electronic Equipment']");

	final By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelTapeDiscMedia = By.xpath(
			"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Tape / Disc Media']");

}
