package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_ClaimActions;
import com.pages.Guidewire.ClaimsCenter.CC_CreateRecovery;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC798_ProcessRecoveryReserve {
	// Author:Misba
	// Date:21/01/2022

	@Test
	public void CC798_TC001_RecoveryReserve_VerifyCostTypeList() throws Throwable {
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
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		// Step6 : Click Loss details Edit
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		// Step7 : Fill Loss Details Info
		CC_ClaimActions.LossDetailsInformation();
		// recovery rseserve
		CC_Reusables.ccMenuNavigation("Recovery Reserve");
		CC_CreateRecovery.VerifyCostTypeList();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC798_TC002_RecoveryReserve_VerifyCostCategorywithCostTypeIndemnity() throws Throwable {
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
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		// Step6 : Click Loss details Edit
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		// Step7 : Fill Loss Details Info
		CC_ClaimActions.LossDetailsInformation();
		// recovery reserve
		CC_Reusables.ccMenuNavigation("Recovery Reserve");
		CC_CreateRecovery.VerifyCostCategorywithCostTypeIndemnity();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC798_TC003_RecoveryReserve_VerifyCostCategorywithCostTypeExpenseAO() throws Throwable {
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
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		// Step6 : Click Loss details Edit
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		// Step7 : Fill Loss Details Info
		CC_ClaimActions.LossDetailsInformation();
		// recovery rseserve
		CC_Reusables.ccMenuNavigation("Recovery Reserve");
		CC_CreateRecovery.VerifyCostCategorywithCostTypeExpenseAO();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC798_TC004_RecoveryReserve_VerifyCostCategorywithCostTypeExpenseDCC() throws Throwable {
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
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		// Step6 : Click Loss details Edit
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		// Step7 : Fill Loss Details Info
		CC_ClaimActions.LossDetailsInformation();
		// recovery rseserve
		CC_Reusables.ccMenuNavigation("Recovery Reserve");
		CC_CreateRecovery.VerifyCostCategorywithCostTypeExpenseDCC();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
}
