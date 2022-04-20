package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_ClaimActions;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_SearchPolicyOrCreatePolicy;

public class CC58_CloseAClaim {

	/*
	 * Testcase ID : CC58_TC001 Decription : Verify Outcome Dropdown Owner : Rahul Dixit Date : 16-12-2021
	 */
	@Test
	public void CC58_TC001_ClaimClosedOutcomeTypelist() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Step3 : Choose close claim
		CC_Reusables.ccMenuNavigation("Close Claim");
		// Step4 : Verify Outcome Dropdown
		CC_ClaimActions.Outcome();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}

	/*
	 * Testcase ID : CC58_TC002 Decription : Verify The secondary primary Error check Owner : Rahul Dixit Date : 16-12-2021
	 */
	@Test
	public void CC58_TC002_ClaimClosedOutcomeTypelist() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Step3 : Choose close claim
		CC_Reusables.ccMenuNavigation("Close Claim");
		// Step4 : Verify Outcome Dropdown
		CC_ClaimActions.Outcome();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}

	/*
	 * Testcase ID : CC58_TC003 Decription : Verify Outcome Dropdown Owner : Rahul Dixit Date : 16-12-2021
	 */
	@Test
	public void CC58_TC003_VerifyTheErrorMessage() throws Throwable {
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim

		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();

		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		// CC_NewClaimWizard.basicInformation_InsuredDetailsEdit();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		// Step6 : Click Loss details Edit
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		// Step7 : Fill Loss Details Info
		CC_ClaimActions.LossDetailsInformation();
		CC_Reusables.ccMenuNavigation("Assign Claim");
		CC_ClaimActions.AssignClaimwithwarining();

		CC_Reusables.ccMenuNavigation("Close Claim");
		// Step4 : Choose close claim info
		CC_ClaimActions.CloseClaiminfo();
		// Step5 : verify the error
		// CCC_ClaimActions_CloseClaim.Error_primarySecondaryLossDetails();

		/*
		 * // Step8 : Choose Workplan CC_Resuables.ccMenuNavigation("Workplan"); // Step9 : Choose to complete workplan activities
		 * ClaimCenter_Workplan.workPlan(); // Step10 : Choose Action-Close claim
		 */
		/*
		 * CC_Resuables.ccMenuNavigation("Close Claim"); CCC_ClaimActions_CloseClaim.CloseClaim();
		 */

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
}