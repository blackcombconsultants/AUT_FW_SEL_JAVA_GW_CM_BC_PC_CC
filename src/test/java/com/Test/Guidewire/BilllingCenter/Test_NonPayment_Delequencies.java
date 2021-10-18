package com.Test.Guidewire.BilllingCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.BillingCenter.BillingCenter_AccountSummary;
import com.pages.Guidewire.BillingCenter.BillingCenter_NonPayment;
import com.pages.Guidewire.BillingCenter.BillingCenter_Payments;
import com.pages.Guidewire.BillingCenter.BillingCenter_Resuables;

public class Test_NonPayment_Delequencies extends GW_GetDriver {
@Test
	
	public void AUT_NonPayment_Delequency() throws Throwable {
		// Login
	GW_CM_PC_BC_CC_Login.login_BillingCenter();
		// Account Search
				BillingCenter_Resuables.bcTabNavigation_Acct_Search();
			//INVOICES
				Tab_Menu_Navigation.bcMenuNavigation("Invoices");
                BillingCenter_NonPayment.NonPayment_Invoices();
                //INVOICE STREAM
				Tab_Menu_Navigation.bcMenuNavigation("Invoice Streams");
				BillingCenter_NonPayment.NonPayment_InvoicesStream();
				BillingCenter_Payments.RobotKey();
				Thread.sleep(2000);
				BillingCenter_NonPayment.RunBatch_Invoice();
				BillingCenter_NonPayment.InternalTools();
				Thread.sleep(2000);
				BillingCenter_NonPayment.ReturnToBillingCenter();
				BillingCenter_Resuables.bcTabNavigation_Acct_Search();
				//Deliquency
				GW_CM_PC_BC_CC_Login.logout_BillingCenter();

}


}

