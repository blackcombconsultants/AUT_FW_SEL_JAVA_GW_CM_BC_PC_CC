package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_SearchClaims;

public class CC53_SearchClaim {
	@Test
	public void CC53_TC001_AdvancedSearch_PrimaryAndSecondary() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Search Claims Advanced Search", "NA");
		CC_SearchClaims.SearchClaims_AdvancedSearch_PrimaryAndSecondary();
		// ----->Logout ClaimCenter
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC53_TC002_AdvancedSearch_SearchDate() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Search Claims Advanced Search", "NA");
		CC_SearchClaims.SearchClaims_AdvancedSearch_SearchDate();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC53_TC003_SimpleSearch_Reported() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Search Claims Simple Search", "NA");
		CC_SearchClaims.SimpleSearch_Reported();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC53_TC004_AdvancedSearch_Reported() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Search Claims Advanced Search", "NA");
		CC_SearchClaims.AdvancedSearch_Reported();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC53_TC005_SimpleSearch_LossDate() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Search Claims Simple Search", "NA");
		CC_SearchClaims.SimpleSearch_LossDate();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC53_TC006_AdvancedSearch_LossDate() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Search Claims Advanced Search", "NA");
		CC_SearchClaims.AdvancedSearch_LossDate();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
}
