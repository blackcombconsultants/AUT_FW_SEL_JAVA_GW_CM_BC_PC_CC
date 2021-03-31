package com.pages.Sandbox;

import org.openqa.selenium.By;

public interface GW_MenuNavigation_CM_PC_BC_CC_PO {

	/*
	 * Desktop Tab
	 */
	final By Menu_Desktop = By.xpath("//div[@id='TabBar-AccountTab']/div[3]");
	final By SuBMenu_Desktop_Summary = By.id("TabBar-AccountTab-AccountTab_NewAccount");

	/*
	 * Account Tab
	 */
	final By Menu_Account = By.xpath("//div[@id='TabBar-AccountTab']/div[3]");
	final By SubMenu_Account_Newaccount = By.id("TabBar-AccountTab-AccountTab_NewAccount");

	
	
	final By Menu_AccountBC = By.xpath("//div[@id='TabBar-AccountsTab']//div[2]");

	
	void click_Menu_Desktop(By Menu_Desktop);

	void click_SuBMenu_Desktop_Summary(By SuBMenu_Desktop_Summary);

	void click_Menu_Account(By Menu_Account);

	void click_SubMenu_Account_Newaccount(By SubMenu_Account_Newaccount);

	void gwContactManagement_MenuNavigation(String strMenuOption);

	void gwPolicyCenter_MenuNavigation(String strMenuOption);

	void gwBillingCenter_MenuNavigation(String strMenuOption);

	void gwClaimsCenter_MenuNavigation(String strMenuOption);
}
