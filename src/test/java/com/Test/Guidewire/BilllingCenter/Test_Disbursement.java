package com.Test.Guidewire.BilllingCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.BillingCenter.BC_AccountSummary;
import com.pages.Guidewire.BillingCenter.BC_Disbursement;
import com.pages.Guidewire.BillingCenter.BC_Resuables;

public class Test_Disbursement extends GW_GetDriver {

	@Test
	public void AUT_Disbursement_Manual() throws Throwable {

		BC_Resuables.login_BillingCenter_User("SuperUser");
		BC_Resuables.bcTabNavigation_Acct_Search();
		BC_AccountSummary.AccountSummary();
		BC_AccountSummary.AccountSummary_Financials();
		BC_Resuables.bcMenuNavigation("New Transaction Disbursement");
		BC_Disbursement.NewTransaction_Disbursement();
		BC_Resuables.clickButton("Next");

		BC_Disbursement.Verify_Disbursement();
		BC_Resuables.bcMenuNavigation("Disbursements");

		BC_Disbursement.Disbursement_Status("Approved");
		BC_Resuables.RobotKey();

		BC_Resuables.RunBatch_Disbursement();
		BC_Resuables.ReturnToBillingCenter();

		BC_Resuables.bcTabNavigation_Acct_Search();
		BC_Resuables.bcMenuNavigation("Disbursements");

		BC_Disbursement.Disbursement_Status("Sent");

		BC_Resuables.logout_BillingCenter();

	}
	@Test
	public void AUT_Disbursement_Automatic() throws Throwable {

		BC_Resuables.login_BillingCenter_User("SuperUser");

		BC_Resuables.bcTabNavigation_Acct_Search();
		BC_AccountSummary.AccountSummary();
		BC_AccountSummary.AccountSummary_Financials();
		BC_Resuables.RobotKey();

		BC_Resuables.RunBatch_AutomaticDisbursement();
		BC_Resuables.ReturnToBillingCenter();

		BC_Resuables.logout_BillingCenter();

		BC_Resuables.login_BillingCenter_User("SuperUser");
		BC_Resuables.bcTabNavigation_Acct_Search();
		BC_Resuables.bcMenuNavigation("Disbursements");

		BC_Disbursement.Disbursement_Status("Approved");
		BC_Disbursement.Disbursement_DateModify();
		BC_Resuables.RobotKey();

		BC_Resuables.RunBatch_Disbursement();
		BC_Resuables.ReturnToBillingCenter();

		BC_Resuables.bcTabNavigation_Acct_Search();
		BC_Resuables.bcMenuNavigation("Disbursements");

		BC_Disbursement.Disbursement_Status("Sent");

		BC_Resuables.logout_BillingCenter();

	}
}
