package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_ClaimActions;
import com.pages.Guidewire.ClaimsCenter.CC_CreateManualCheck;
import com.pages.Guidewire.ClaimsCenter.CC_Exposure;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_Workplan;

public class Test_ClaimActions_CloseClaim extends GW_GetDriver {

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_CloseClaim001() throws Throwable {
		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ------>ClosingClaim without any expsosure and validating error
		// message
		CC_Reusables.ccMenuNavigation("Close Claim");
		CC_ClaimActions.CloseClaim();
		CC_ClaimActions.ValidationResults("WithOutExpsoure");
		CC_Reusables.ccMenuNavigation("Workplan");
		CC_Workplan.workPlan();
		CC_Reusables.ccMenuNavigation("Close Claim");
		CC_ClaimActions.CloseClaim();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_CloseClaim002() throws Throwable {
		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ------>ClosingClaim without any expsosure and validating error
		// message
		CC_Reusables.ccMenuNavigation("Close Claim");
		CC_ClaimActions.CloseClaim();
		CC_ClaimActions.ValidationResults("WithOutExpsoure");

		// ------>Adding to exposure
		CC_Reusables.ccMenuNavigation("Choose by Coverage");
		CC_Exposure.ChoosebyCoverage_Collison();

		// ------>ClosingClaim with expsosure and validating error message
		CC_Reusables.ccMenuNavigation("Close Claim");
		CC_ClaimActions.CloseClaim();
		CC_ClaimActions.ValidationResults("WithExposure");

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_CloseClaim003() throws Throwable {
		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ------>ClosingClaim without any expsosure and validating error
		// message
		CC_Reusables.ccMenuNavigation("Close Claim");
		CC_ClaimActions.CloseClaim();
		CC_ClaimActions.ValidationResults("WithOutExpsoure");

		// ------>Adding to exposure
		CC_Reusables.ccMenuNavigation("Choose by Coverage");
		CC_Exposure.ChoosebyCoverage_Collison();

		// ------>ClosingClaim with expsosure and validating error message
		CC_Reusables.ccMenuNavigation("Close Claim");
		CC_ClaimActions.CloseClaim();
		CC_ClaimActions.ValidationResults("WithExposure");

		// ----->Adding manual check

		CC_Reusables.ccMenuNavigation("Check");
		CC_CreateManualCheck.Enterpayeeinformation();
		CC_Reusables.clickButton("Next");
		CC_CreateManualCheck.Enterpaymentinformation();
		CC_Reusables.clickButton("Next");
		CC_CreateManualCheck.Setcheckinstructions();

		// ------>ClosingClaim with check and validating error message
		CC_Reusables.ccMenuNavigation("Close Claim");
		CC_ClaimActions.CloseClaim();
		CC_ClaimActions.ValidationResults("WithCheckPayment");
	}

}
