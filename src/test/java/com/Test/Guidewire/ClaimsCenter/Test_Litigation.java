package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_Litigation;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_Litigation extends GW_GetDriver {

	@Test

	public void AUT_CreateNewMatter() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// search claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// Click Evaluations
		CC_Reusables.ccMenuNavigation("Litigation");
		CC_Litigation.Litigation_Matter();
		Thread.sleep(2000);
		CC_Litigation.Litigation_NewMatter();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

}
