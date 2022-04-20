package com.Test.Guidewire.BilllingCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.BillingCenter.BC_AccountDetails;
import com.pages.Guidewire.BillingCenter.BC_AccountSummary;
import com.pages.Guidewire.BillingCenter.BC_Contacts;
import com.pages.Guidewire.BillingCenter.BC_Invoices;
import com.pages.Guidewire.BillingCenter.BC_Payments;
import com.pages.Guidewire.BillingCenter.BC_Resuables;

public class Test_Invoice extends GW_GetDriver {

	@Test
	public void AUT_PA_BC_Invoice_01() throws Throwable {

		BC_Resuables.login_BillingCenter_User("SuperUser");

		BC_Resuables.bcTabNavigation_Acct_Search();
		BC_Resuables.bcMenuNavigation("New Direct Bill Payment");
		BC_Payments.DirectBillPayment();
		BC_AccountSummary.AccountSummary();
		BC_Resuables.bcMenuNavigation("Details");
		BC_AccountDetails.AD_AccountBasics_Verify();
		BC_AccountDetails.AD_ContactInfo_Verify();
		BC_Resuables.bcMenuNavigation("Contacts");
		BC_Contacts.C_ContactInfo_Verify();
		BC_Resuables.bcMenuNavigation("Funds Tracking");
		BC_Payments.FundsTracking();
		BC_Resuables.bcMenuNavigation("Payments");
		BC_Payments.Payments();
		BC_Resuables.bcMenuNavigation("Invoices");
		BC_Invoices.Invoices_InvoiceInformation_Verify();
		// BillingCenter_Invoices.Invoices_InvoiceInformation_Edit();
		// BillingCenter_Invoices.Invoices_InvoiceItems();
		// BillingCenter_PolicySummary.PolicySummary_Overview();

		BC_Resuables.logout_BillingCenter();

	}

}
