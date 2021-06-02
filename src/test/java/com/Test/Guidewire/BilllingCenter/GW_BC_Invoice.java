package com.Test.Guidewire.BilllingCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.BillingCenter.BillingCenter_AccountDetails;
import com.pages.Guidewire.BillingCenter.BillingCenter_AccountSummary;
import com.pages.Guidewire.BillingCenter.BillingCenter_Contacts;
import com.pages.Guidewire.BillingCenter.BillingCenter_Invoices;
import com.pages.Guidewire.BillingCenter.BillingCenter_PolicySummary;
import com.pages.Guidewire.BillingCenter.BillingCenter_Resuables;

public class GW_BC_Invoice extends GW_GetDriver {

	@Test
	public void AUT_PA_BC_Invoice_01() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_BillingCenter();

		BillingCenter_Resuables.bcTabNavigation_Acct_Search();
		GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("New Direct Bill Payment");
		BillingCenter_Resuables.DirectBillPayment();
		BillingCenter_AccountSummary.AccountSummary();
		GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Details");
		BillingCenter_AccountDetails.AD_AccountBasics_Verify();
		BillingCenter_AccountDetails.AD_ContactInfo_Verify();
		GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Contacts");
		BillingCenter_Contacts.C_ContactInfo_Verify();
		GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Funds Tracking");
		BillingCenter_Resuables.FundsTracking();
		GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Payments");
		BillingCenter_Resuables.Payments();
		GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Invoices");
		BillingCenter_Invoices.Invoices_InvoiceInformation_Edit();
		BillingCenter_Invoices.Invoices_InvoiceItems();
		BillingCenter_PolicySummary.PolicySummary_Overview();

		// GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Details");
		// BillingCenter_PolicyDetails.PD_PolicyBasics_Verify();
		// BillingCenter_PolicyDetails.PD_Charges_Verify();
		GW_CM_PC_BC_CC_Login.logout_BillingCenter();

	}

}
