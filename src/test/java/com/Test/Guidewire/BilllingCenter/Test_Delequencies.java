package com.Test.Guidewire.BilllingCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.BillingCenter.BC_Payments;
import com.pages.Guidewire.BillingCenter.BC_Resuables;

public class Test_Delequencies extends GW_GetDriver {
	@Test

	public void AUT_NonPayment_Delequency() throws Throwable {
		// Login
		BC_Resuables.login_BillingCenter_User("SuperUser");
		// Account Search
		BC_Resuables.bcTabNavigation_Acct_Search();
		// INVOICES
		BC_Resuables.bcMenuNavigation("Invoices");
		BC_Payments.NonPayment_Invoices();
		// INVOICE STREAM
		BC_Resuables.bcMenuNavigation("Invoice Streams");
		BC_Payments.NonPayment_InvoicesStream();
		BC_Resuables.RobotKey();
		Thread.sleep(2000);
		BC_Resuables.RunBatch_Invoice();
		BC_Resuables.InternalTools();
		Thread.sleep(2000);
		BC_Resuables.ReturnToBillingCenter();
		BC_Resuables.bcTabNavigation_Acct_Search();
		// Delinquency
		BC_Resuables.logout_BillingCenter();

	}

}
