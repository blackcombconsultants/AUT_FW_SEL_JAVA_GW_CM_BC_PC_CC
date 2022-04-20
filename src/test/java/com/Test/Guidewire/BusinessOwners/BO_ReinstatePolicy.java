package com.Test.Guidewire.BusinessOwners;

import org.testng.annotations.Test;

import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_Resuables;

public class BO_ReinstatePolicy {

	@Test
	public void ReinstatePolicy() throws Throwable {

		// Login Into Policy Center--------------------------
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();

		// New Company Account Creation and Submission-------------------------------------------
		BO_Resuables.submissionProcess("New Account", "Issue Policy");

		// Navigating to Cancel Policy---------------------------------------------
		Tab_Menu_Navigation.pcMenuNavigation("Cancel Policy");
		PolicyCenter_Resuables.startCancellationForPolicy();

		// Bind and View your cancellation Policy------------------------------------
		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Cancel Now");
		PC_Bound.Cancellation_ViewYourPolicy();

		// Navigate to Reinstate Policy and Details-------------------------
		Tab_Menu_Navigation.pcMenuNavigation("Reinstate Policy");
		BO_Resuables.StartReinstatementDetails();
		PolicyCenter_Resuables.clickButton("Next");

		// Quote and Reinstate the Policy---------------------------------
		PolicyCenter_Resuables.clickButton("Quote");

		// Validating Change In Cost In Quote Screen--------------------------------
		PolicyCenter_Resuables.clickButton("Next");
		PolicyCenter_Resuables.clickButton("Reinstate");

		// View Your Policy---------------------------------------------------------
		PC_Bound.ViewYourPolicy();

		// Verify Status In CPT----------------------------------------------------
		BO_Resuables.ValidateStatusInCompletePolicyTransaction();

		// Logout Policy Center-------------------------------
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}
	@Test
	public void AUT_PC_BO_StartReinstatement() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_ReinstatementQuote() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_Reinstatement_RiskAnalysis() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_ReinstatementWithdraw() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_EditPolicyTransaction() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_FormsAndDocGeneration() throws Throwable {

	}
}
