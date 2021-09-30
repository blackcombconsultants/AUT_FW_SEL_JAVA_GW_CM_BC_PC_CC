package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

//import org.testng.annotations.Test;

import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_BulkInvoices;

public class Test_BulkInvoices {

	@Test
	public void CreateNewBulkInvoice_DistributeamountEvenly() throws Throwable {

		// User Logs into GW CC as an Adjuster
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// Navigate to Desktop->Bulk Invoice
		Tab_Menu_Navigation.ccMenuNavigation("Bulk Invoices");

		// click on create new button
		CC_BulkInvoices.BulkInvoices_CreateNew();

		CC_BulkInvoices.BID_Invoice();
		CC_BulkInvoices.BID_InvoiceItemDetails();

		CC_BulkInvoices.CheckDetails_Search();
		CC_BulkInvoices.BID_PaymentInstructions();
		CC_BulkInvoices.BID_Add();
		CC_BulkInvoices.BulkInvoiceDetails();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

}
