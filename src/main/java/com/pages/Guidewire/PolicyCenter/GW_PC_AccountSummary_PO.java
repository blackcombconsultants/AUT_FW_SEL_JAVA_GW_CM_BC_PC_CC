package com.pages.Guidewire.PolicyCenter;

public interface GW_PC_AccountSummary_PO {

	void detail_Verify() throws Throwable;
	// Capture the details of the account in the Details tab.

	void details_Edit() throws Throwable;
	// Capture the fields and steps to edit the account through Account Summary
	// screen, Details tile

	void CurrentActivities_Verify() throws Throwable;

	void PolicyTerms_Verify() throws Throwable;

	void OpenPolicyTransactions_Verify() throws Throwable;

	void Claims_Verify() throws Throwable;

	void Overview_Verify() throws Throwable;

	void Billing_Verify() throws Throwable;

	void Contacts_Verify() throws Throwable;

	void Producers_Verify() throws Throwable;

	void Locations_Verify() throws Throwable;

	void RelatedAccounts_Verify() throws Throwable;

	void Notes_Verify() throws Throwable;

	void accountHolderSummary() throws Throwable;
	// Elaborate the steps to validate the Account holder infomation from the
	// Account summary screen

	void accountHolderSummary_Details_Edit() throws Throwable;

	// Steps to edit the Account Holder Summary by navigating through Account
	// Summary Screen and clicking the Account Holder hyperlink
	void accountHolderSummary_Details_Verify() throws Throwable;

	void accountHolderSummary_Policies_Verify() throws Throwable;

	void accountHolderSummary_OpenPolicyTransactions_Verify() throws Throwable;

	void accountHolderSummary_Claims_Verify() throws Throwable;

	void accountHolderSummary_Overview_Verify() throws Throwable;

	void accountHolderSummary_Billing_Verify() throws Throwable;

	void accountHolderSummary_Notes_Verify() throws Throwable;

}
