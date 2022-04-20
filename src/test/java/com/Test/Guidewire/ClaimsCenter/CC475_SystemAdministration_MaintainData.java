package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_Administration;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC475_SystemAdministration_MaintainData {
	@Test
	public static void CC475_TC001_CC_VerifyUserGroupStructure() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("User");

		CC_Reusables.ccTabNavigation("Administration", "NA");

		CC_Administration.VantageRiskScreen();
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public static void CC475_TC002_CC_FinanceAndComplianceAddedGroupTypeList() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		CC_Reusables.ccTabNavigation("Administration", "NA");

		CC_Reusables.ccMenuNavigation("New Group");

		CC_Administration.VerifyNewGroup_Type();

		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public static void CC475_TC003_CC_SecurityZoneTypeList() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		CC_Reusables.ccTabNavigation("Administration", "NA");
		CC_Reusables.ccMenuNavigation("New Group");

		CC_Administration.VerifyNewGroup_SecurityZone();

		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public static void CC475_TC004_CC_VerifyUsers() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		CC_Reusables.ccTabNavigation("Administration", "NA");
		CC_Reusables.ccMenuNavigation("Users");

		CC_Administration.VerifyGroupUsers();

		CC_Reusables.logout_ClaimsCenter();

	}
}
