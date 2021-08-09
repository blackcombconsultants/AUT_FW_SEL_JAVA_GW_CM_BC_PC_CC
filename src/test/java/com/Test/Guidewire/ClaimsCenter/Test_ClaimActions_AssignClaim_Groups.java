package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_Admininstration_Groups;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;

public class Test_ClaimActions_AssignClaim_Groups extends GW_GetDriver {

	String strInsuredName = null;
	String strLostDate    = null;
	String strAdjuster    = null;

	@Test
	public void AssignClaim_Groups_LoadFactor100() throws Throwable

	{

		// ------>Login to CliamCenter super user
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// ----->Navigate to Groups
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");
		Tab_Menu_Navigation.ccMenuNavigation("Groups");
		// 1. "Auto1 - TeamB" should be available in the Groups tab
		CC_Admininstration_Groups.groups_Search();
		// 2. Group Load Factor and Group users load factor should be "100"
		// 3. Vacation Status for the group users should be set to "Active"
		CC_Admininstration_Groups.groupName_ProfileTab();
		CC_Admininstration_Groups.groupName_AllUsers_Edit_LoadFactor_VacationStatus();
		CC_Admininstration_Groups.groupName_ProfileTab();
		// 4. By default "Eastern Region", "Western Region", "Western Part of
		// Mid-west" & "Eastern Part of Mid-west" groups should be added to the
		// "Auto1-TeamB group".
		CC_Admininstration_Groups.groupName_QueuesTab();
		CC_Admininstration_Groups.groupName_RegionsTab();
		// ----->LogOut from super user
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

		// ----->Login to ClaimCenter bbaker user
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");
		CC_NewClaimWizard.ncw_ClaimAssign_RoundRobin();
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AssignClaim_Groups_LoadFactor50() throws Throwable {
		// ------>Login to CliamCenter super user
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// ----->Clicking on Administration Tab
		Tab_Menu_Navigation.ccTabNavigation("Administration UsersandSecurity Groups", "");
		// ------>Verify the groups
		// CC_Admininstration_Groups.LoadFactor_VacationStatus_Edit50();
	}

	@Test
	public void AssignClaim_Groups_LoadFactor0() throws Throwable {
		// ------>Login to CliamCenter super user
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// ----->Clicking on Administration Tab
		Tab_Menu_Navigation.ccTabNavigation("Administration UsersandSecurity Groups", "");
		// ------>Verify the groups
		CC_Admininstration_Groups.LoadFactor_VacationStatus_EditZero();
	}

	@Test
	public void TC002_RoundRobin_User_LoadFactoris100_VacationStatusisAtwork() throws Throwable {
		// ------>Login to CliamCenter super user
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// ----->Navigate to Groups
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");
		Tab_Menu_Navigation.ccMenuNavigation("Groups");
		// 1. "Auto1 - TeamB" should be available in the Groups tab
		CC_Admininstration_Groups.groups_Search();
		// 2. Group Load Factor and Group users load factor should be "100"
		// 3. Vacation Status for the group users should be set to "Active"
		CC_Admininstration_Groups.groupName_ProfileTab();
		CC_Admininstration_Groups.groupName_AllUsers_Edit_LoadFactor_VacationStatus();
		CC_Admininstration_Groups.groupName_ProfileTab();
		// 4. By default "Eastern Region", "Western Region", "Western Part of
		// Mid-west" & "Eastern Part of Mid-west" groups should be added to the
		// "Auto1-TeamB group".
		CC_Admininstration_Groups.groupName_QueuesTab();
		CC_Admininstration_Groups.groupName_RegionsTab();

		CC_Admininstration_Groups.LoadFactor_VacationStatus_OnVacationandAssignBackUpUser();
		// ----> VacationStatus Active for all other user except "Heidi
		// Johnson".

		// ----> Set "Andy Applegate" as the back up user for "Heidi Johnson"
		// and Vacation Status as "On vacation
	}

	@Test
	public void AssignClaim_Groups_LoadFactor100_VacationStatusOnVacationInactive() throws Throwable {
		// ------>Login to CliamCenter super user
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// ----->Clicking on Administration Tab
		Tab_Menu_Navigation.ccTabNavigation("Administration UsersandSecurity Groups", "");
		// ------>Verify the groups
		CC_Admininstration_Groups.LoadFactor_VacationStatus_OnVacationInActive();
	}

}
