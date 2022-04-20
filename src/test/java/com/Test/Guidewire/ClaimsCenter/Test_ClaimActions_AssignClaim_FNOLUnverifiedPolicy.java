package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_ClaimActions_AssignClaim_FNOLUnverifiedPolicy extends GW_GetDriver {

	@Test

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto() throws Throwable {
		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto_SelectPolicy() throws Throwable {
		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		CC_Reusables.ccTabNavigation("Claim Search", "");
		CC_Reusables.ccMenuNavigation("Policy General");
		CC_NewClaimWizard.selectPolicy();
		CC_Reusables.clickButton("Finish");
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto_AutoFirstandFinal() throws Throwable {
		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_Reusables.clickButton("Update");
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_AutoFirstandFinal();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved();
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test

	public void AUT_PA_CC_FNOL_UnverifiedPolicy_Newclaim_Auto_QuickClaimAuto() throws Throwable {
		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_Reusables.clickButton("Update");
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.New_QuickClaimAuto();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved();
		CC_Reusables.logout_ClaimsCenter();
	}

}
