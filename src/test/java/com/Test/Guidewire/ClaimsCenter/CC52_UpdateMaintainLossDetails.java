package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_LossDetails;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC52_UpdateMaintainLossDetails {
	@Test
	public void Claim_52_TC001_ReplaceLossCauseWith2NewFields() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Find Existing Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_LossDetails.LossDetails_Verify_PrimaryAndSecondaryLossCause();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	/*
	 * @Test public void Claim_52_TC003_ValidateVehicleSection() throws Throwable { // User Logs into GW CC as an Adjuster
	 * ClaimCenter_Resuables.login_ClaimsCenter_User("SuperUser"); //Find Existing Claim CC_Resuables.ccTabNavigation("Claim Search", "NA");
	 * CC_Resuables.ccMenuNavigation("Loss Details"); CC_LossDetails.LossDetails_Verify_VehicleSection();
	 * 
	 * // ----->Logout ClaimCenter ClaimCenter_Resuables.logout_ClaimsCenter(); }
	 */

	@Test
	public void Claim_52_TC004_ValidateGeneralDamagesSection() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Find Existing Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_LossDetails.LossDetails_Verify_GeneralDamageSection();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void Claim_52_TC007_ValidateComplexityFields() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Find Existing Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_LossDetails.LossDetails_Verify_Complexity();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
}
