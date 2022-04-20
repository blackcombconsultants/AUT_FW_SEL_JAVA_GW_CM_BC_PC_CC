package com.Test.Guidewire.BusinessOwners;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_Base;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_Resuables;

public class BO_CancelPolicy {
	@Test
	public void CancellationByInsured() throws Throwable {

		// Login Into Policy Center--------------------------------------
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();

		// New Account Creation and Submission-------------------------------------------
		BO_Resuables.submissionProcess("New Account", "Issue Policy");

		// Fetching out the Policy Number Da-----------------------------------------------
		GW_Base.strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

		PC_PolicySummary.tools_Billing();

		// Navigate to Existing Policy-------------------------------------
		Tab_Menu_Navigation.pcTabNavigation("Policy Search By Policy NUmber", "");

		// Cancel the policy------------------------------------
		Tab_Menu_Navigation.pcMenuNavigation("Cancel Policy");
		PolicyCenter_Resuables.startCancellationForPolicy();
		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Cancel Now");

		// View Your Policy-----------------------------------
		PC_Bound.ViewYourPolicy();

		// Validate the Status in CPT----------------------------------
		BO_Resuables.ValidateStatusInCompletePolicyTransaction();

		// Logout From Policy center-----------------------------------
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void CancellationByInsurer() throws Throwable {
		// Login Into Policy Center--------------------------------------
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();

		// New Company Account Creation and Submission-------------------------------------------
		BO_Resuables.submissionProcess("New Account", "Issue Policy");

		// Navigate and Verify Status in Billing screen--------------------------------
		PC_PolicySummary.tools_Billing();

		// Navigate to Existing Policy-------------------------------------
		Tab_Menu_Navigation.pcTabNavigation("Policy Search By Policy NUmber", "");

		// Cancel the policy------------------------------------
		Tab_Menu_Navigation.pcMenuNavigation("Cancel Policy");
		PolicyCenter_Resuables.startCancellationForPolicy();

		// Bind and Schedule the cancellation of policy--------------------------------
		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Schedule Cancellation");

		// View Your Policy-----------------------------------
		PC_Bound.ViewYourPolicy();

		// Validate the Status in CPT----------------------------------
		BO_Resuables.ValidateStatusInCompletePolicyTransaction();

		// Logout From Policy center-----------------------------------
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PC_BO_StartCancellationEntry() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_QuoteCancellation_Confirmation() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_PolicySummary() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_ScheduleCancellation_CancelNow() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_RescindCancellation() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_WithdrawTransaction() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_FormsAndDocGeneration() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_CancelPendingRemovals() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_NonPayCancel() throws Throwable {

	}

}
