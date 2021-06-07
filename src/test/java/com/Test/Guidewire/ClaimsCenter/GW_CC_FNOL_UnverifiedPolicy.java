package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_AddClaimInformation;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_BasicInformation;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Resuables;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_SearchPolicy;

public class GW_CC_FNOL_UnverifiedPolicy extends GW_GetDriver {

	@Test()

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA");
		ClaimCenter_SearchPolicy.fnol_Search_UnverifiedPolicy();
		ClaimCenter_Resuables.clickButton("Update"); //
		ClaimCenter_Resuables.clickButton("Next"); //
		ClaimCenter_BasicInformation.basicInfo(); //
		ClaimCenter_Resuables.clickButton("Next"); //
		ClaimCenter_AddClaimInformation.addClaimInfo(); //
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.services();
		ClaimCenter_Resuables.clickButton("Next"); //
		ClaimCenter_Resuables.saveandAssign(); //
		ClaimCenter_Resuables.clickButton("Finish"); //
		ClaimCenter_Resuables.newClaimSaved(); // //

	}
	
	@Test()

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto_SelectPolicy() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		/*
		 * GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA");
		 * ClaimCenter_SearchPolicy.fnol_Search_UnverifiedPolicy();
		 * ClaimCenter_Resuables.clickButton("Update"); //
		 * ClaimCenter_Resuables.clickButton("Next"); //
		 * ClaimCenter_BasicInformation.basicInfo(); //
		 * ClaimCenter_Resuables.clickButton("Next"); //
		 * ClaimCenter_AddClaimInformation.addClaimInfo(); //
		 * ClaimCenter_Resuables.clickButton("Next"); ClaimCenter_Resuables.services();
		 * ClaimCenter_Resuables.clickButton("Next"); //
		 * ClaimCenter_Resuables.saveandAssign(); //
		 * ClaimCenter_Resuables.clickButton("Finish"); //
		 * ClaimCenter_Resuables.newClaimSaved();
		 */
		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("Claim Search", "");
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Policy General");
        ClaimCenter_Resuables.selectPolicy();
        ClaimCenter_Resuables.clickButton("Finish");
		

	}
	
	
	

	@Test()

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto_AutoFirstandFinal() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA");
		ClaimCenter_SearchPolicy.fnol_Search_UnverifiedPolicy();
		ClaimCenter_Resuables.clickButton("Update");
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.NewClaim_AutoFirstandFinal();
		ClaimCenter_Resuables.clickButton("Finish");
		ClaimCenter_Resuables.DuplicateClaims_Verify();
		ClaimCenter_Resuables.clickButton("Finish");
		ClaimCenter_Resuables.newClaimSaved();

	}

	@Test()

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto_QuickClaimAuto() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA");
		ClaimCenter_SearchPolicy.fnol_Search_UnverifiedPolicy();

		ClaimCenter_Resuables.clickButton("Update");
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.New_QuickClaimAuto();
		ClaimCenter_Resuables.clickButton("Finish");
		ClaimCenter_Resuables.DuplicateClaims_Verify();
        ClaimCenter_Resuables.clickButton("Finish");
		ClaimCenter_Resuables.newClaimSaved();

	}

}
