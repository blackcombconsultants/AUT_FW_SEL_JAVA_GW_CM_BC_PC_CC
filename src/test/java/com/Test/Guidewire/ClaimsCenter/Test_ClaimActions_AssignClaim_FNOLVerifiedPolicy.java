package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_ClaimActions_AssignClaim_FNOLVerifiedPolicy extends GW_GetDriver {

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_AutomatedAssignclaim() throws Throwable {
		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// --->Assigning Claim
		CC_Reusables.ccMenuNavigation("Assign Claim");
		CC_NewClaimWizard.assignClaim();
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_FNOL_VerifiedPolicy_Auto() throws Throwable {

		// ------>Login to CliamCenter

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_FNOL_VerifiedPolicy_Auto_AutoFirstandFinal() throws Throwable {
		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim Auto_AutoFirstandFinal
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAutoFirstandFinal");
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_FNOL_VerifiedPolicy_Auto_QuickClaimAuto() throws Throwable {
		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim Auto_QuickClaimAuto
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyQuickClaimAuto");
		CC_Reusables.logout_ClaimsCenter();

	}

}
