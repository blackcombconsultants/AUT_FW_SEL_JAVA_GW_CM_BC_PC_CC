package com.pages.Guidewire;

import org.openqa.selenium.By;

public interface GW_MenuNavigation_CM_PC_BC_CC_PO {

	/*
	 * Policy Center
	 * 
	 * 
	 */
	/*
	 * Desktop Tab
	 */
	final By Tab_Desktop = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	final By Tab_Account = By.xpath("//div[@id='TabBar-AccountTab']/div[3]");
	final By Tab_Policy = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	final By Tab_Contact = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	final By Tab_Search = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	final By Tab_Team = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	final By Tab_Administration = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
		
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
	final By AccountTab_AccountNumber = By.xpath("//*[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem']/div/input");
	final By AccountTab_AccountNumberSearch = By.xpath("//*[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem_Button']/span");
	/*
	 * PolicyTab Tab - SubMenu
	 */
	final By PolicyTab_NewSubmission = By.id("TabBar-PolicyTab-PolicyTab_NewSubmission");
	final By PolicyTab_SubNumber = By.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_SubmissionNumberSearchItem']/div/input");
	final By PolicyTab_SubSearch = By.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_SubmissionNumberSearchItem_Button']/span");
	final By PolicyTab_PolicyNumber = By.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_PolicyRetrievalItem']/div/input");
	final By PolicyTab_PolicyNumberSearch = By.xpath("//*[@id='TabBar-PolicyTab-PolicyTab_PolicyRetrievalItem_Button']/span");
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
	 * AdministrationTab Tab - SubMenu
	 */
	final By AdministrationTab_MyActivities = By.id("TabBar-AdministrationTab-AdministrationTab_NewAccount");
	final By AdministrationTab_MyAccounts = By.id("TabBar-AdministrationTab-AdministrationTab_NewAccount");
	final By AdministrationTab_MySubmission = By.id("TabBar-AccountTab-AdministrationTab_NewAccount");
	final By AdministrationTab_MyRenewals = By.id("TabBar-AdministrationTab-AdministrationTab_NewAccount");

	void gwContactManagement_MenuNavigation(String strMenuOption);

	void gwPolicyCenter_MenuNavigation(String strMenuOption);

	void gwBillingCenter_MenuNavigation(String strMenuOption);

	void gwClaimsCenter_MenuNavigation(String strMenuOption);
}
