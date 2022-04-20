package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_ReopenClaim;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Claim57_ReopenClaim extends GW_GetDriver {

	@Test
	public void Claim57_TC001_CC_ClaimReopenReasontypelist() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Reopen Claim");
		CC_ReopenClaim.ReopenClaimInfoVerifyReason();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void Claim57_TC002_CC_RenameMistakeintheClaim() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		Thread.sleep(1000);
		CC_Reusables.ccMenuNavigation("Reopen Claim");
		CC_ReopenClaim.ReopenClaimInfoVerifyClosedinError();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

}
