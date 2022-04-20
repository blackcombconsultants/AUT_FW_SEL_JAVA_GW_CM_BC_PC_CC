package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_Negotiations;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC762_MaintainClaimNegotiations extends GW_GetDriver {

	@Test
	public void CC762_TC001__AddTheBelowTwoValuesTypelistInNegotiationLinesLV() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("New Negotiation");

		CC_Negotiations.Negotiation_Lines_Typeverify();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void CC762_TC002__AddTheBelowTwoValuesTypelistInNegotiationLinesLV() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("PlanofAction Negotiations");

		CC_Negotiations.Negotiation();
		CC_Negotiations.Negotiation_Lines_Typeverify();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
}
