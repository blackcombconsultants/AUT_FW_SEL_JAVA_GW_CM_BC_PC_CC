package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC78_SearchForActivities {
	/*
	 * TestCaseID: Claim78_TC001 owner: Rahul Dixit Description: PolicyNumberDisplayedAfterInsuredColumn Date: 24/01/2022
	 */
	@Test
	public void Claim78_TC001_PolicyNumberDisplayedAfterInsuredColumn() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Search Activities", "NA");
		CC_NewClaimWizard.VerifyPolicyNumberDisplayedAfterInsuredColumn();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	/*
	 * TestCaseID: Claim78_TC002 owner: Rahul Dixit Description: BuisnessDisplayedAfterPolicyNumberColumn Date: 24/01/2022
	 */
	@Test
	public void Claim78_TC002_LineOfBuisnessDisplayedAfterPolicyNumberColumn() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Search Activities", "NA");
		CC_NewClaimWizard.VerifyLineOfBuisnessDisplayedAfterPolicyNumberColumn();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
}
