package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_ClaimActions;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC1212_UpdateClaimClosingReason {
	@Test
	public void CC1212_TC001_ClaimClosedOutcomeTypelistUpdated() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Step3 : Choose close claim
		CC_Reusables.ccMenuNavigation("Close Claim");
		// Step4 : Verify Outcome Dropdown
		CC_ClaimActions.OutcomeClosingReason();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}

}
