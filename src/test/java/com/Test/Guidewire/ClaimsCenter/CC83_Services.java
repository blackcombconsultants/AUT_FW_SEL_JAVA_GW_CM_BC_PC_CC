package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_Services;

public class CC83_Services extends GW_GetDriver {

	@Test
	public void Claim83_Services() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// ----->Verify whether Services is
		CC_Services.Validate_ServicesNotVisible();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
}
