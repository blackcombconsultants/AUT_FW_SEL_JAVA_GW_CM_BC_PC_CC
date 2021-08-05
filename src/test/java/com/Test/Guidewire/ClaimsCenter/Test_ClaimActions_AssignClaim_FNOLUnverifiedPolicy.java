package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Resuables;

public class Test_ClaimActions_AssignClaim_FNOLUnverifiedPolicy extends GW_GetDriver {

	@Test

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		Tab_Menu_Navigation.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto_SelectPolicy() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");
		Tab_Menu_Navigation.ccMenuNavigation("Policy General");
		CC_NewClaimWizard.selectPolicy();
		ClaimCenter_Resuables.clickButton("Finish");

	}

	@Test

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto_AutoFirstandFinal() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		Tab_Menu_Navigation.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		ClaimCenter_Resuables.clickButton("Update");
		ClaimCenter_Resuables.clickButton("Next");
		CC_NewClaimWizard.ncw_AutoFirstandFinal();
		ClaimCenter_Resuables.clickButton("Finish");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		ClaimCenter_Resuables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved();

	}

	@Test

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto_QuickClaimAuto() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		Tab_Menu_Navigation.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		ClaimCenter_Resuables.clickButton("Update");
		ClaimCenter_Resuables.clickButton("Next");
		CC_NewClaimWizard.New_QuickClaimAuto();
		ClaimCenter_Resuables.clickButton("Finish");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		ClaimCenter_Resuables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved();

	}

}
