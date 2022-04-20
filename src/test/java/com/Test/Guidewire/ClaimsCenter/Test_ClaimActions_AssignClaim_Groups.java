package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.Admininstration_Groups;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_ClaimActions_AssignClaim_Groups extends GW_GetDriver {

	String strInsuredName = null;
	String strLostDate    = null;
	String strAdjuster    = null;

	@Test
	public void AssignClaim_Groups_LoadFactor100() throws Throwable

	{

		// ------>Login to CliamCenter super user
		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// ----->Navigate to Groups
		CC_Reusables.ccTabNavigation("Administration", "NA");
		CC_Reusables.ccMenuNavigation("Groups");
		// 1. "Auto1 - TeamB" should be available in the Groups tab
		Admininstration_Groups.groups_Search();
		// 2. Group Load Factor and Group users load factor should be "100"
		// 3. Vacation Status for the group users should be set to "Active"
		Admininstration_Groups.groupName_ProfileTab();
		Admininstration_Groups.groupName_AllUsers_Edit_LoadFactor_VacationStatus();
		Admininstration_Groups.groupName_ProfileTab();
		// 4. By default "Eastern Region", "Western Region", "Western Part of
		// Mid-west" & "Eastern Part of Mid-west" groups should be added to the
		// "Auto1-TeamB group".
		Admininstration_Groups.groupName_QueuesTab();
		Admininstration_Groups.groupName_RegionsTab();
		// ----->LogOut from super user
		CC_Reusables.logout_ClaimsCenter();

		// ----->Login to ClaimCenter bbaker user
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");
		CC_NewClaimWizard.ncw_ClaimAssign_RoundRobin();
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AssignClaim_Groups_LoadFactor50() throws Throwable {
		// ------>Login to CliamCenter super user
		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// ----->Clicking on Administration Tab
		CC_Reusables.ccTabNavigation("Administration UsersandSecurity Groups", "");
		// ------>Verify the groups
		// CC_Admininstration_Groups.LoadFactor_VacationStatus_Edit50();
	}

	@Test
	public void AssignClaim_Groups_LoadFactor0() throws Throwable {
		// ------>Login to CliamCenter super user
		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// ----->Clicking on Administration Tab
		CC_Reusables.ccTabNavigation("Administration UsersandSecurity Groups", "");
		// ------>Verify the groups
		Admininstration_Groups.LoadFactor_VacationStatus_EditZero();
	}

	@Test
	public void TC002_RoundRobin_User_LoadFactoris100_VacationStatusisAtwork() throws Throwable {
		// ------>Login to CliamCenter super user
		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// ----->Navigate to Groups
		CC_Reusables.ccTabNavigation("Administration", "NA");
		CC_Reusables.ccMenuNavigation("Groups");
		// 1. "Auto1 - TeamB" should be available in the Groups tab
		Admininstration_Groups.groups_Search();
		// 2. Group Load Factor and Group users load factor should be "100"
		// 3. Vacation Status for the group users should be set to "Active"
		Admininstration_Groups.groupName_ProfileTab();
		Admininstration_Groups.groupName_AllUsers_Edit_LoadFactor_VacationStatus();
		Admininstration_Groups.groupName_ProfileTab();
		// 4. By default "Eastern Region", "Western Region", "Western Part of
		// Mid-west" & "Eastern Part of Mid-west" groups should be added to the
		// "Auto1-TeamB group".
		Admininstration_Groups.groupName_QueuesTab();
		Admininstration_Groups.groupName_RegionsTab();

		Admininstration_Groups.LoadFactor_VacationStatus_OnVacationandAssignBackUpUser();
		// ----> VacationStatus Active for all other user except "Heidi
		// Johnson".

		// ----> Set "Andy Applegate" as the back up user for "Heidi Johnson"
		// and Vacation Status as "On vacation
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AssignClaim_Groups_LoadFactor100_VacationStatusOnVacationInactive() throws Throwable {
		// ------>Login to CliamCenter super user
		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// ----->Clicking on Administration Tab
		CC_Reusables.ccTabNavigation("Administration UsersandSecurity Groups", "");
		// ------>Verify the groups
		Admininstration_Groups.LoadFactor_VacationStatus_OnVacationInActive();
		CC_Reusables.logout_ClaimsCenter();

	}

}
