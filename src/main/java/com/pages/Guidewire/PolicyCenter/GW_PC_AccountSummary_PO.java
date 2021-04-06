package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;

public interface GW_PC_AccountSummary_PO {
	
	final By Account_Actions_Menu = By.xpath("//div[@id='AccountFile-AccountFileMenuActions']");
    final By Account_Actions_NewSubmission = By.xpath("//div[@id=\"AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create-AccountFileMenuActions_NewSubmission\"]");
    final By Account_Tab_Dropdown = By.xpath("//div[@id='TabBar-AccountTab']//div[3]");
    final By Account_Tab_Search = By.xpath("//input[@name='TabBar-AccountTab-AccountTab_AccountNumberSearchItem']");
    final By Account_Tab_Search_Button = By.xpath("//div[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem_Button']");
    final By NewSubmission_Screen_Header = By.xpath("div[contains(@id,'Screen-ttlBar')]//div[text()='New Submissions']");
	void Detail_Verify();
	//Capture the details of the account in the Details tab.
	
	void Details_Edit();
	//Capture the fields and steps to edit the account through Account Summary screen, Details tile
	
	void AccountSummary_AccountHolderSummary();
	//Elaborate the steps to validate the Account holder infomation from the Account summary screen
	
	void AccountSummary_AccountHolderSummary_Edit();
	// Steps to edit the Account Holder Summary by navigating through Account Summary Screen and clicking the Account Holder hyperlink
	
	void AccountSummary_Actions_NewSubmission();
	

}
