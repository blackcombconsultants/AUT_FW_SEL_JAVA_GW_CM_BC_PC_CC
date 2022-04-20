package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_Negotiations;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_Negotiation extends GW_GetDriver {

	@Test

	public void AUT_CreateNewNegotiation() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// search claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// Click Evaluations
		CC_Reusables.ccMenuNavigation("PlanofAction Negotiations");
		CC_Negotiations.Negotiation();
		CC_Negotiations.NewNegotiation();
		CC_Negotiations.ValidateNegotiation();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test

	public void AUT_DeleteNegotiation() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// search claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// Click Evaluations
		CC_Reusables.ccMenuNavigation("PlanofAction Negotiations");
		CC_Negotiations.Negotiation();
		CC_Negotiations.NewNegotiation();
		CC_Negotiations.ValidateNegotiation();

		CC_Negotiations.DeleteNegotiation();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

}
