package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;

public interface GW_PC_AccountSummary_PO {



	void Detail_Verify() throws Throwable;
	// Capture the details of the account in the Details tab.

	void Details_Edit() throws Throwable;
	// Capture the fields and steps to edit the account through Account Summary
	// screen, Details tile

	void AccountSummary_AccountHolderSummary() throws Throwable;
	// Elaborate the steps to validate the Account holder infomation from the
	// Account summary screen

	void AccountSummary_AccountHolderSummary_Edit() throws Throwable;
	// Steps to edit the Account Holder Summary by navigating through Account
	// Summary Screen and clicking the Account Holder hyperlink

	void AccountSummary_Actions_NewSubmission() throws Throwable;

}
