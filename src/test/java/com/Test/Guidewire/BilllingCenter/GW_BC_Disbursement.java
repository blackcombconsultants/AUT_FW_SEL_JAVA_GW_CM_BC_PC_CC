package com.Test.Guidewire.BilllingCenter;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.BillingCenter.BillingCenter_AccountSummary;
import com.pages.Guidewire.BillingCenter.BillingCenter_Disbursement;
import com.pages.Guidewire.BillingCenter.BillingCenter_Resuables;

import org.testng.annotations.Test;

public class GW_BC_Disbursement extends GW_GetDriver {
	
	@Test
	public void AUT_Disbursement_Manual() throws Throwable {
		
		GW_CM_PC_BC_CC_Login.login_BillingCenter();
		BillingCenter_Resuables.bcTabNavigation_Acct_Search();
		BillingCenter_AccountSummary.AccountSummary();
		BillingCenter_AccountSummary.AccountSummary_Financials();
		Tab_Menu_Navigation.bcMenuNavigation("New Transaction Disbursement");
		BillingCenter_Disbursement.NewTransaction_Disbursement();
		BillingCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);
		BillingCenter_Disbursement.Verify_Disbursement();
		Tab_Menu_Navigation.bcMenuNavigation("Disbursements");
		Thread.sleep(2000);
		BillingCenter_Disbursement.Disbursement_Status("Approved");
		BillingCenter_Disbursement.RobotKey();
		Thread.sleep(2000);
		BillingCenter_Disbursement.RunBatch_Disbursement();
		BillingCenter_Disbursement.ReturnToBillingCenter();
		Thread.sleep(2000);
		BillingCenter_Resuables.bcTabNavigation_Acct_Search();
		Tab_Menu_Navigation.bcMenuNavigation("Disbursements");
		Thread.sleep(2000);
		BillingCenter_Disbursement.Disbursement_Status("Sent");		
		
		GW_CM_PC_BC_CC_Login.logout_BillingCenter();
		
		
		
		
		
		
	}
	@Test
	public void AUT_Disbursement_Automatic() throws Throwable {
		
		GW_CM_PC_BC_CC_Login.login_BillingCenter();

		BillingCenter_Resuables.bcTabNavigation_Acct_Search();
		BillingCenter_AccountSummary.AccountSummary();
		BillingCenter_AccountSummary.AccountSummary_Financials();
		BillingCenter_Disbursement.RobotKey();
		Thread.sleep(2000);
		BillingCenter_Disbursement.RunBatch_AutomaticDisbursement();
		BillingCenter_Disbursement.ReturnToBillingCenter();
		Thread.sleep(2000);
		GW_CM_PC_BC_CC_Login.logout_BillingCenter();
		Thread.sleep(2000);
		GW_CM_PC_BC_CC_Login.login_BillingCenter();
		BillingCenter_Resuables.bcTabNavigation_Acct_Search();
		Tab_Menu_Navigation.bcMenuNavigation("Disbursements");
		Thread.sleep(2000);
		BillingCenter_Disbursement.Disbursement_Status("Approved");
		BillingCenter_Disbursement.Disbursement_DateModify();
		BillingCenter_Disbursement.RobotKey();
		Thread.sleep(2000);
		BillingCenter_Disbursement.RunBatch_Disbursement();
		BillingCenter_Disbursement.ReturnToBillingCenter();
		Thread.sleep(2000);
		BillingCenter_Resuables.bcTabNavigation_Acct_Search();
		Tab_Menu_Navigation.bcMenuNavigation("Disbursements");
		Thread.sleep(2000);
		BillingCenter_Disbursement.Disbursement_Status("Sent");		
		
		GW_CM_PC_BC_CC_Login.logout_BillingCenter();
		
		
		
		
		
		
	}
}
