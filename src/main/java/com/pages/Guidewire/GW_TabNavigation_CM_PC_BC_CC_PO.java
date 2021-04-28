package com.pages.Guidewire;

import org.openqa.selenium.By;

public interface GW_TabNavigation_CM_PC_BC_CC_PO {

	/*
	 * -----------------------------------------------------------------------------
	 * ------------------------------------------- Policy Center Tabs
	 * -----------------------------------------------------------------------------
	 * -------------------------------------------
	 */

	/*
	 * Desktop Tab
	 */
	final By Tab_Desktop = By.xpath("//div[@id='TabBar-DesktopTab']//div[@class='gw-label']");
	final By Tab_DesktopTab_Account_dd = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	final By Tab_Account = By.xpath("//div[@id='TabBar-AccountsTab']//div[@class='gw-label']");
	final By Tab_Account_dd = By.xpath("//div[@id='TabBar-AccountTab']/div[3]");
	final By Tab_Policy = By.xpath("//div[@id='TabBar-DesktopTab']/div[@class='gw-label']");
	final By Tab_Policy_dd = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	final By Tab_Contact = By.xpath("//div[@id='TabBar-DesktopTab']/div[@class='gw-label']");
	final By Tab_Contact_dd = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	final By Tab_Search = By.xpath("//div[@id='TabBar-DesktopTab']/div[@class='gw-label']");
	final By Tab_Search_dd = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	final By Tab_Team = By.xpath("//div[@id='TabBar-DesktopTab']/div[@class='gw-label']");
	final By Tab_Administration = By.xpath("//div[@id='TabBar-DesktopTab']/div[@class='gw-label']");
	final By Tab_Administration_dd = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");

	/*
	 * Desktop Tab - SubMenu
	 */
	final By DesktopTab_Summary = By.id("TabBar-DesktopTab-Desktop_Underwriter_MySummary");
	final By DesktopTab_MyActivities = By.id("TabBar-DesktopTab-Desktop_DesktopActivities");
	final By DesktopTab_MyAccounts = By.id("TabBar-DesktopTab-Desktop_DesktopAccounts");
	final By DesktopTab_MySubmission = By.id("TabBar-DesktopTab-Desktop_DesktopSubmissions");
	final By DesktopTab_MyRenewals = By.id("TabBar-DesktopTab-Desktop_DesktopRenewals");
	final By DesktopTab_OtherPolicyTransactions = By.id("TabBar-DesktopTab-Desktop_DesktopOtherWorkOrders");
	final By Desktop_MyQueues = By.id("TabBar-DesktopTab-Desktop_DesktopAssignableQueues");

	/*
	 * Account Tab - SubMenu
	 */
	final By AccountTab_NewAccount = By.id("TabBar-AccountTab-AccountTab_NewAccount");
	final By AccountTab_AccountNumber = By
			.xpath("//*[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem']/div/input");
	final By AccountTab_AccountNumberSearch = By
			.xpath("//*[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem_Button']/span");
	/*
	 * PolicyTab Tab - SubMenu
	 */
	final By PolicyTab_NewSubmission = By.id("TabBar-PolicyTab-PolicyTab_NewSubmission");
	final By PolicyTab_SubNumber = By
			.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_SubmissionNumberSearchItem']/div/input");
	final By PolicyTab_SubSearch = By
			.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_SubmissionNumberSearchItem_Button']/span");
	final By PolicyTab_PolicyNumber = By.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_PolicyRetrievalItem']/div/input");
	final By PolicyTab_PolicyNumberSearch = By
			.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_PolicyRetrievalItem_Button']/span");
	/*
	 * ContactTab Tab - SubMenu
	 */
	final By ContactsTab_NewContacts = By.id("TabBar-AccountTab-ContactsTab_NewAccount");
	final By ContactsTab_NewContacts_Company = By.xpath("//*[@id='TabBar-ContactTab-NewContact-NewCompany']/span");
	final By ContactsTab_NewContacts_Person = By.xpath("//*[@id='TabBar-ContactTab-NewContact-NewPerson']/span");
	final By ContactsTab_Search = By.id("TabBar-ContactTab-Search");
	/*
	 * SearchTab Tab - SubMenu
	 */
	final By SearchTab_Policies = By.id("TabBar-SearchTab-Search_PolicySearch");
	final By SearchTab_Accounts = By.id("TabBar-SearchTab-Search_AccountSearch");
	final By SearchTab_ProducerCodes = By.id("TabBar-SearchTab-Search_ProducerCodeSearch");
	final By SearchTab_Activities = By.id("TabBar-SearchTab-TabBar-SearchTab-Search_ActivitySearch");
	final By SearchTab_Contacts = By.id("TabBar-SearchTab-TabBar-SearchTab-Search_ContactSearch");
	
	/*
	 * Team Tab - SubMenu
	 */

	final By Team = By.xpath("//div[@id='TabBar-TeamTab']//div[@class='gw-label']");
	
	/*
	 * AdministrationTab Tab - SubMenu
	 */
	final By AdministrationTab_Users_and_Security = By
			.xpath("//div[@id='TabBar-AdminTab-Admin_UsersAndSecurity']/div[@class='gw-action--expand-button']");
	final By AdministrationTab_Business_Settings = By
			.xpath("//div[@id='TabBar-AdminTab-Admin_BusinessSettings']/div[@class='gw-action--expand-button']");
	final By AdministrationTab_Monitoring = By
			.xpath("//div[@id='TabBar-AdminTab-Admin_Monitoring']/div[@class='gw-action--expand-button']");
	final By AdministrationTab_Utilities = By
			.xpath("//div[@id='TabBar-AdminTab-Admin_Utilities']/div[@class='gw-action--expand-button']");
	
	/*
	 * Menu Options
	 * -----------------------------------------------------------------------------
	 * -------------------------------------
	 */

	final By Menu_Actions = By.xpath("//div[@id='gw-west-panel--top-section']/div[contains(@id,'MenuActions')]");

	final By Actions_NewAccount = By.id("AccountsGroup-AccountsMenuActions-AccountsMenuActions_NewAccount");
	final By Actions_NewPolicy = By.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_NewPolicy");
	final By Actions_NewSubmission = By.xpath(
			"//div[@id=\"AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create-AccountFileMenuActions_NewSubmission\"]");

	final By create = By.xpath(
			"//div[@id='AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create']//div[@role='menuitem']");
	final By New_Note = By.xpath("//div[contains(@id,'AccountFileMenuActions_NewNote')]//div[@role='menuitem']");
	final By New_Document = By.xpath(
			"//div[@id='AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create-AccountFileMenuActions_NewDocument']");
	final By New_Email = By.xpath("//div[contains(@id,'AccountFileMenuActions_NewEmail')]//div[@role='menuitem']");
	final By New_Submission = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_NewSubmission')]//div[@role='menuitem']");
	final By New_Activity = By.xpath("");
	final By Withdraw_Account = By.xpath("");
	final By Move_Policies_to_this_Account = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_MovePolicies')]//div[@role='menuitem']");
	final By Rewrite_Policires_to_this_Account = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_RewritePolicies')]//div[@role='menuitem']");
	final By Merge_Account_into_this_Account = By
			.xpath("//div[contains(@id,'AccountFileMenuActions_MergeAccounts')]//div[@role='menuitem']");

	final By My_Summary = By
			.xpath("//div[@id='Desktop-MenuLinks-Desktop_Underwriter_MySummary']/div[1]/div[text()='Summary']");
	final By My_Activities = By
			.xpath("//div[@id='Desktop-MenuLinks-Desktop_DesktopActivities']/div[1]/div[text()='My Activities']");
	final By My_Accounts = By
			.xpath("//div[@id='Desktop-MenuLinks-Desktop_DesktopAccounts']/div[1]/div[text()='My Accounts']");
	final By My_Submissions = By
			.xpath("//div[@id='Desktop-MenuLinks-Desktop_DesktopSubmissions']/div[1]/div[text()='My Submissions']");
	final By My_Renewals = By
			.xpath("//div[@id='Desktop-MenuLinks-Desktop_DesktopRenewals']/div[1]/div[text()='My Renewals']");
	final By Other_Policy_Transactions = By.xpath(
			"//div[@id='Desktop-MenuLinks-Desktop_DesktopOtherWorkOrders']/div[1]/div[text()='Other Policy Transactions']");
	final By My_Queues = By
			.xpath("//div[@id='Desktop-MenuLinks-Desktop_DesktopAssignableQueues']/div[1]/div[text()='My Queues']");

		
	/*
	 * -----------------------------------------------------------------------------
	 * ------------------------------------------- Billing Center Tabs
	 * -----------------------------------------------------------------------------
	 * -------------------------------------------
	 */

	/*
	 * Menu Options
	 * -----------------------------------------------------------------------------
	 * -------------------------------------
	 */

	final By AS_HistoryLink = By.id("AccountGroup-MenuLinks-AccountGroup_AccountDetailHistory");
	final By AS_InvoicesLink = By.id("AccountGroup-MenuLinks-AccountGroup_AccountDetailInvoices");

	final By InvoiceHeader = By.xpath("//div[contains(@id,'Screen-ttlBar')]//div[contains(text(),'Invoice')]");

	/*
	 * Page Headers - Billing Center
	 */

	/*
	 * -----------------------------------------------------------------------------
	 * ------------------------------------------- Claims Center Tabs
	 * -----------------------------------------------------------------------------
	 * -------------------------------------------
	 */
	final By ClaimTab = By.xpath("//div[@id='TabBar-ClaimTab']//div[3]");
	final By ClaimTab_NewClaim = By.xpath("//div[text()='New Claim']");

	/*
	 * Page Headers - Claims Center
	 */

	/*
	 * -----------------------------------------------------------------------------
	 * ------------------------------------------- Conact Management Tabs
	 * -----------------------------------------------------------------------------
	 * -------------------------------------------
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

	
	
	

	void gwContactManagement_TabNavigation(String Tab, String Value) throws Throwable;

	void gwPolicyCenter_TabNavigation(String Tab, String Value) throws Throwable;

	void gwBillingCenter_TabNavigation(String Tab, String Value) throws Throwable;

	void gwClaimsCenter_TabNavigation(String Tab, String Value) throws Throwable;

	void gwContactManagement_MenuNavigation(String strMenuOption) throws Throwable;

	void gwPolicyCenter_MenuNavigation(String Menu) throws Throwable;

	void gwBillingCenter_MenuNavigation(String Menu) throws Throwable;

	void gwClaimsCenter_MenuNavigation(String Menu) throws Throwable;

}
