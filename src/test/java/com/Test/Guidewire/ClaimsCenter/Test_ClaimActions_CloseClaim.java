package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CCC_ClaimActions_CloseClaim;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_ClaimExposure;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_CreateManualCheck;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Resuables;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Workplan;

public class Test_ClaimActions_CloseClaim extends GW_GetDriver {

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_CloseClaim001() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ------>ClosingClaim without any expsosure and validating error
		// message
		Tab_Menu_Navigation.ccMenuNavigation("Close Claim");
		CCC_ClaimActions_CloseClaim.CloseClaim();
		CCC_ClaimActions_CloseClaim.ValidationResults("WithOutExpsoure");
		Tab_Menu_Navigation.ccMenuNavigation("Workplan");
		ClaimCenter_Workplan.workPlan();
		Tab_Menu_Navigation.ccMenuNavigation("Close Claim");
		CCC_ClaimActions_CloseClaim.CloseClaim();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_CloseClaim002() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ------>ClosingClaim without any expsosure and validating error
		// message
		Tab_Menu_Navigation.ccMenuNavigation("Close Claim");
		CCC_ClaimActions_CloseClaim.CloseClaim();
		CCC_ClaimActions_CloseClaim.ValidationResults("WithOutExpsoure");

		// ------>Adding to exposure
		Tab_Menu_Navigation.ccMenuNavigation("Choose by Coverage");
		ClaimCenter_ClaimExposure.ChoosebyCoverage_Collison();

		// ------>ClosingClaim with expsosure and validating error message
		Tab_Menu_Navigation.ccMenuNavigation("Close Claim");
		CCC_ClaimActions_CloseClaim.CloseClaim();
		CCC_ClaimActions_CloseClaim.ValidationResults("WithExposure");

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_CloseClaim003() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ------>ClosingClaim without any expsosure and validating error
		// message
		Tab_Menu_Navigation.ccMenuNavigation("Close Claim");
		CCC_ClaimActions_CloseClaim.CloseClaim();
		CCC_ClaimActions_CloseClaim.ValidationResults("WithOutExpsoure");

		// ------>Adding to exposure
		Tab_Menu_Navigation.ccMenuNavigation("Choose by Coverage");
		ClaimCenter_ClaimExposure.ChoosebyCoverage_Collison();

		// ------>ClosingClaim with expsosure and validating error message
		Tab_Menu_Navigation.ccMenuNavigation("Close Claim");
		CCC_ClaimActions_CloseClaim.CloseClaim();
		CCC_ClaimActions_CloseClaim.ValidationResults("WithExposure");

		// ----->Adding manual check

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		ClaimCenter_CreateManualCheck.Enterpayeeinformation();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_CreateManualCheck.Enterpaymentinformation();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_CreateManualCheck.Setcheckinstructions();

		// ------>ClosingClaim with check and validating error message
		Tab_Menu_Navigation.ccMenuNavigation("Close Claim");
		CCC_ClaimActions_CloseClaim.CloseClaim();
		CCC_ClaimActions_CloseClaim.ValidationResults("WithCheckPayment");
	}

}
