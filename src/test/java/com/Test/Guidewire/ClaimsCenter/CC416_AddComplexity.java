package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_LossDetails;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_SearchPolicyOrCreatePolicy;

public class CC416_AddComplexity {

	/*
	 * TestCaseID: Claim416_TC001 owner: Rahul Dixit Description: VerifyComplexityInLossDetailsScreen Date: 31/01/2022
	 */
	@Test
	public void Claim416_TC001_VerifyComplexityInLossDetailsScreen() throws Throwable {
		// User Logs into GW CC as an Superuser
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");
		// CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();

		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();

		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_LossDetails.LossDetails_Verify_Complexity();
		CC_Reusables.clickButton("Update");
		CC_LossDetails.VerifyComplexityIsMandatory();
		CC_LossDetails.LossDetailsInformation();
		CC_Reusables.logout_ClaimsCenter();
	}
}
