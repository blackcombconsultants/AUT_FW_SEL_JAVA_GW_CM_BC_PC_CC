package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_LossDetails;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC850_FNOLSnapshot {
	/*
	 * Owner: Rahul Dixit Description: FNOLSnapshot Date: 07/01/201
	 * 
	 */
	@Test
	public void Claim850_TC001_CoverageQuestionFieldHiddenInLossDetailsScreenFNOLSnapshot() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("FNOL Snapshot");
		CC_LossDetails.Verify_CoverageInQuestionNotDisplayed();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
}