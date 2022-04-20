package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_Email;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC108_IntegrationGWCCEmail extends GW_GetDriver {
	@Test
	public void Claim108_TC001_CC_ValidateemaileventinGWCC() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Email");
		CC_Email.Emails();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
}
