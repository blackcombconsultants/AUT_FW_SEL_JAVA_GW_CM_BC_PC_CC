package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.CC_ClaimActions;
import com.pages.Guidewire.ClaimsCenter.CC_CreateRecovery;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Claim_796_SettleCloseProcessRecoveries {
	// Author:Misba
	// Date:13/01/2022
	// Description:values are displayed in the Recovery Line Category typelist
	@Test
	public void CC796_TC001_ValuesaredisplayedinRecoveryLineCategorytypelist() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		// CC_NewClaimWizard.basicInformation_InsuredDetailsEdit();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_NewClaimWizard.ncw_ACI_AddIncident(1);
		CC_Reusables.clickButton("Next");
		// CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_ChooseCoverage.newExposure(1);
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		// Step6 : Click Loss details Edit
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		// Step7 : Fill Loss Details Info
		Thread.sleep(1000);
		CC_ClaimActions.LossDetailsInformation();
		// recovery rseserve
		CC_Reusables.ccMenuNavigation("Recovery Reserve");
		CC_CreateRecovery.ValuesaredisplayedinRecoveryLineCategorytypelist();
		CC_Reusables.ccMenuNavigation("Recovery");
		Thread.sleep(1000);
		CC_CreateRecovery.CreateRecovery_LineItems();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
}
