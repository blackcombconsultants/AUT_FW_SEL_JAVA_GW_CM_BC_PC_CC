package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Claim98_ConfigureUsersDesktop {
	/*
	 * TestCaseID: Claim98_TC001 owner: Rahul Dixit Description: VerifyActivityDueIn14Days Date: 09/02/2022
	 */
	@Test
	public void Claim98_TC001_VerifyActivityDueIn14Days() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Activities", "NA");
		CC_NewClaimWizard.VerifyActivitiesDueIn14Days();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	/*
	 * TestCaseID: Claim98_TC002 owner: Rahul Dixit Description: VerifyActivityDueIn14Days Date: 09/02/2022
	 */
	@Test
	public void Claim98_TC002_VerifyReportedDateIsAddedAfterLossDate() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claims", "NA");
		CC_NewClaimWizard.VerifyLossDateIsAddedAfterReportedDate();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	/*
	 * TestCaseID: Claim98_TC003 owner: Rahul Dixit Description: VerifyAllOpenReviewNewClaimActivity Date: 09/02/2022
	 */
	@Test
	public void Claim98_TC003_VerifyAllOpenReviewNewClaimActivity() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("New Claims", "NA");
		CC_NewClaimWizard.VerifyAllOpenReviewNewClaimActivity();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
}
