package com.Test.Guidewire.BilllingCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_LoginCM_PC_BC_CC;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;
import com.pages.Guidewire.BillingCenter.GW_BillingCenter_Resuables;

public class GW_BC_Invoice_Test extends GW_GetDriver {

	@Test
	public void GW_BC_Invoice() throws Throwable {

		try {

			GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
			GW_BillingCenter_Resuables gwPC = new GW_BillingCenter_Resuables(driver, oExtentTest);
			GW_TabNavigation_CM_PC_BC_CC mn = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

			// ------> login_PolicyCenter
			lg.login_BillingCenter();

			// ------> navigate to new account
			mn.gwBillingCenter_TabNavigation("Account","NA");

			// ------> New Account
			gwPC.bc_NewAccount();

			// ------> New Policy
			gwPC.bc_NewPolicy_PolicyIssuanceWizard_Step1();

			// ------> Verifying the page -
			gwPC.bc_NewPolicy_PolicyIssuanceWizard_Step2();

			// ------> Verifying the bc_AccountSummary -
			gwPC.bc_AccountSummary();

			// ------> bc_AccountSummary_Invoices
			gwPC.bc_AccountSummary_Invoices();

			// ------> logout_BillingCenter
			lg.logout_BillingCenter();

			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
