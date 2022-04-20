package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_Administration;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC1088_USOperations {
	/*
	 * TestCaseID: Claim1088_TC001 owner: Rahul Dixit Description: VerifyPermissionActQueuePickAssignedToRoleClerical Date: 16/02/2022
	 */
	@Test
	public void Claim1088_TC001_VerifyPermissionActQueuePickAssignedToRoleClerical() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("User");

		CC_Reusables.ccTabNavigation("Administration", "NA");
		CC_Reusables.ccMenuNavigation("Roles");
		CC_Administration.VerifyPermissionActQueuePickAssignedToRoleClerical();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	/*
	 * TestCaseID: Claim1088_TC002 owner: Rahul Dixit Description: VerifyUserWithRoleClericalCanAssignTheSelectedActivity Date: 16/02/2022
	 */
	@Test
	public void Claim1088_TC002_VerifyUserWithRoleClericalCanAssignTheSelectedActivity() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Paula");
		CC_Reusables.ccTabNavigation("Queues", "NA");
		CC_Administration.VerifyUserWithRoleClericalCanAssignTheSelectedActivity();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
}
