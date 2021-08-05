package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;

public class Test_ClaimActions_AssignClaim_FNOLVerifiedPolicy extends GW_GetDriver {

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_AutomatedAssignclaim() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// --->Assigning Claim
		Tab_Menu_Navigation.ccMenuNavigation("Assign Claim");
		CC_NewClaimWizard.assignClaim();

	}

	@Test
	public void AUT_FNOL_VerifiedPolicy_Auto() throws Throwable {

		// ------>Login to CliamCenter

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_FNOL_VerifiedPolicy_Auto_AutoFirstandFinal() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim Auto_AutoFirstandFinal
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAutoFirstandFinal");

	}

	@Test
	public void AUT_FNOL_VerifiedPolicy_Auto_QuickClaimAuto() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim Auto_QuickClaimAuto
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyQuickClaimAuto");

	}

}
