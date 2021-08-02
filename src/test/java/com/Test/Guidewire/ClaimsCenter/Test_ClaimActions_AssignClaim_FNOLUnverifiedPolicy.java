package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_AutoFirstandFinal;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_QuickClaimAuto;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Resuables;

public class Test_ClaimActions_AssignClaim_FNOLUnverifiedPolicy extends GW_GetDriver {

	@Test

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		Tab_Menu_Navigation.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		ClaimCenter_Resuables.clickButton("Update"); //
		ClaimCenter_Resuables.clickButton("Update"); //
		ClaimCenter_Resuables.clickButton("Next"); //
		/*
		 * CC_NCW_Step2of5_BasicInformation.basicInfo(); //
		 * ClaimCenter_Resuables.clickButton("Next"); //
		 * CC_NCW_Step3of5_AddClaimInformation.addClaimInfo(); //
		 * ClaimCenter_Resuables.clickButton("Next");
		 * ClaimCenter_Resuables.services();
		 * ClaimCenter_Resuables.clickButton("Next"); //
		 * ClaimCenter_Resuables.saveandAssign(); //
		 * ClaimCenter_Resuables.clickButton("Finish"); //
		 * CC_NewClaimWizard.newClaimSaved(); // //
		 */
	}

	@Test

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto_SelectPolicy() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		/*
		 * GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA");
		 * ClaimCenter_SearchPolicy.fnol_Search_UnverifiedPolicy();
		 * ClaimCenter_Resuables.clickButton("Update"); //
		 * ClaimCenter_Resuables.clickButton("Next"); //
		 * ClaimCenter_BasicInformation.basicInfo(); //
		 * ClaimCenter_Resuables.clickButton("Next"); //
		 * ClaimCenter_AddClaimInformation.addClaimInfo(); //
		 * ClaimCenter_Resuables.clickButton("Next");
		 * ClaimCenter_Resuables.services();
		 * ClaimCenter_Resuables.clickButton("Next"); //
		 * ClaimCenter_Resuables.saveandAssign(); //
		 * ClaimCenter_Resuables.clickButton("Finish"); //
		 * CC_NewClaimWizard.newClaimSaved();
		 */
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");
		Tab_Menu_Navigation.ccMenuNavigation("Policy General");
		ClaimCenter_Resuables.selectPolicy();
		ClaimCenter_Resuables.clickButton("Finish");

	}

	@Test

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto_AutoFirstandFinal() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		Tab_Menu_Navigation.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		ClaimCenter_Resuables.clickButton("Update");
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_AutoFirstandFinal.NewClaim_AutoFirstandFinal();
		ClaimCenter_Resuables.clickButton("Finish");
		ClaimCenter_Resuables.DuplicateClaims_Verify();
		ClaimCenter_Resuables.clickButton("Finish");
		CC_NewClaimWizard.newClaimSaved();

	}

	@Test

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto_QuickClaimAuto() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		Tab_Menu_Navigation.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		ClaimCenter_Resuables.clickButton("Update");
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_QuickClaimAuto.New_QuickClaimAuto();
		ClaimCenter_Resuables.clickButton("Finish");
		ClaimCenter_Resuables.DuplicateClaims_Verify();
		ClaimCenter_Resuables.clickButton("Finish");
		CC_NewClaimWizard.newClaimSaved();

	}

}
