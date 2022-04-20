package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_BulkInvoices;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_BulkInvoices {

	@Test
	public void CreateNewBulkInvoice_DistributeamountEvenly() throws Throwable {

		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// Navigate to Desktop->Bulk Invoice
		CC_Reusables.ccMenuNavigation("Bulk Invoices");

		// click on create new button
		CC_BulkInvoices.BulkInvoices_CreateNew();

		CC_BulkInvoices.BID_Invoice();
		CC_BulkInvoices.BID_InvoiceItemDetails();

		CC_BulkInvoices.CheckDetails_Search();
		CC_BulkInvoices.BID_PaymentInstructions();
		CC_BulkInvoices.BID_Add();
		CC_BulkInvoices.BulkInvoiceDetails();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

}
