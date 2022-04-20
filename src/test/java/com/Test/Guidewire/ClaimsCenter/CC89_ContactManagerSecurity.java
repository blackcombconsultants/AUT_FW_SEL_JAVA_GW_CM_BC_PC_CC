package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_Administration;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC89_ContactManagerSecurity {
	/*
	 * TestCaseID: Claim89_TC002 owner: Rahul Dixit Description: ContactManagerWithRoleOfSuperuser Date: 31/01/2022
	 */
	@Test
	public void Claim89_TC001_ContactManagerWithRoleOfSuperuser() throws Throwable {
		// User Logs into GW CC as an Superuser
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Administration", "NA");
		CC_Reusables.ccMenuNavigation("Users");
		CC_Administration.Verify_StephenCeceliaAndPaulaAddedWithRoleOfSupervisorInUserAndSecurityScreen();
		CC_Reusables.logout_ClaimsCenter();
	}
}