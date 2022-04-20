package com.Test.Guidewire.BilllingCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.BillingCenter.BC_AccountSummary;
import com.pages.Guidewire.BillingCenter.BC_Invoices;
import com.pages.Guidewire.BillingCenter.BC_Payments;
import com.pages.Guidewire.BillingCenter.BC_PolicySummary;
import com.pages.Guidewire.BillingCenter.BC_Resuables;

public class Test_Payment extends GW_GetDriver {
	@Test

	public void AUT_BC_Payment() throws Throwable {
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
		BC_Resuables.ReturnToBillingCenter();
		BC_Resuables.bcTabNavigation_Acct_Search();
		BC_Resuables.bcMenuNavigation("New Direct Bill Payment");
		BC_Payments.DirectBillPayments();
		BC_Resuables.bcMenuNavigation("Payments");
		BC_Payments.Payments();
		BC_Resuables.logout_BillingCenter();

	}

	@Test
	public void ReversePayment() throws Throwable {

		BC_Resuables.login_BillingCenter_User("SuperUser");

		BC_Resuables.bcTabNavigation_Acct_Search();
		BC_AccountSummary.AccountSummary();
		BC_AccountSummary.AccountSummary_Financials();
		BC_Resuables.bcMenuNavigation("New Direct Bill Payment");
		BC_Payments.DirectBillPayment();
		BC_Resuables.bcMenuNavigation("Payments");
		BC_Payments.Payments();
		BC_Resuables.logout_BillingCenter();

	}

	@Test
	public void PaymentSchedule() throws Throwable {

		BC_Resuables.login_BillingCenter_User("SuperUser");

		BC_Resuables.bcTabNavigation_Policy_Search();
		BC_PolicySummary.PolicySummary_Overview();
		BC_Resuables.clickButton("Payment Schedule");
		BC_Payments.PaymentSchedule();

		BC_Resuables.logout_BillingCenter();

	}

	@Test
	public void SuspensePaymentProcess() throws Throwable {

		BC_Resuables.login_BillingCenter_User("SuperUser");

		BC_Resuables.bcTabNavigation_Acct_Search();
		BC_AccountSummary.AccountSummary();
		BC_Resuables.bcMenuNavigation("Invoices");
		BC_Invoices.Invoices_Verify();
		BC_Resuables.bcMenuNavigation("Suspense Payments");
		BC_Payments.SuspensePaymentProcess();
		BC_Resuables.clickButton("Update");

		BC_Resuables.logout_BillingCenter();

	}

}
