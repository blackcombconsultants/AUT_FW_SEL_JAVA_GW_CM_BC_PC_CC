package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_PolicyGeneral;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC174_PolicyExports {
	@Test
	public void CC174_TC001_PolicyExport() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Policy Tab
		CC_Reusables.ccMenuNavigation("Policy");
		CC_PolicyGeneral.PolicyGeneral_PolicyExport();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
}
