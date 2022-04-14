package com.Test.Guidewire.BilllingCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.BillingCenter.BillingCenter_NonPayment;
import com.pages.Guidewire.BillingCenter.BillingCenter_Payments;
import com.pages.Guidewire.BillingCenter.BillingCenter_Resuables;

public class Test_Payment extends GW_GetDriver {
	@Test

	public void AUT_BC_Payment() throws Throwable {
		// Login
		BillingCenter_Resuables.login_BillingCenter_User("SuperUser");
		// Account Search
		BillingCenter_Resuables.bcTabNavigation_Acct_Search();
		// INVOICES
		Tab_Menu_Navigation.bcMenuNavigation("Invoices");
		BillingCenter_NonPayment.NonPayment_Invoices();
		// INVOICE STREAM
		Tab_Menu_Navigation.bcMenuNavigation("Invoice Streams");
		BillingCenter_NonPayment.NonPayment_InvoicesStream();
		BillingCenter_Payments.RobotKey();
		BillingCenter_NonPayment.ReturnToBillingCenter();
		BillingCenter_Resuables.bcTabNavigation_Acct_Search();
		Tab_Menu_Navigation.bcMenuNavigation("New Direct Bill Payment");
		BillingCenter_Payments.DirectBillPayments();
		Tab_Menu_Navigation.bcMenuNavigation("Payments");
		BillingCenter_Payments.Payments();
		BillingCenter_Resuables.logout_BillingCenter();

	}
}
