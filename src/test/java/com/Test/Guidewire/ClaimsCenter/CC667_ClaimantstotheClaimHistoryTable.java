package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC667_ClaimantstotheClaimHistoryTable extends GW_GetDriver {
	// Author:Misba Fathima
	@Test
	public void Claim667_TC001_CC_VerifytheClaimantscolumn() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		// CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_PolicyType();
		CC_NewClaimWizard.Claimants_Validation();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public void Claim667_TC002_CC_VerifytheClaimantscolumnsepartedbycomma() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();

		// CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_ClaimsHistory();
		CC_NewClaimWizard.Claimants();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}

}
