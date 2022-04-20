package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.CC_ClaimActions;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_PolicyGeneral;
import com.pages.Guidewire.ClaimsCenter.CC_Policy_AggregateLimits;
import com.pages.Guidewire.ClaimsCenter.CC_Reserve;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC367_ViewPolicyAggregateLimits {

	@Test
	public static void Claims367_TC001_CC_VerifiedPolicy_RemoveAllIncurredCostsEexceptLegalExpenses() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy Aggregate Limits");
		CC_Policy_AggregateLimits.AG_VerifyCountTowardsLimitTypelist();
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public static void Claims367_TC002_CC_VerifiedPolicy_RemoveAllIncurredCostsEexceptLegalExpenses() throws Throwable {

		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");

		CC_Reusables.ccMenuNavigation("Policy General");

		CC_PolicyGeneral.PG_EditEntirePolicy();

		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_LevelCoverages();
		CC_Reusables.clickButton("Back");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");

		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();

		CC_Reusables.ccMenuNavigation("Loss Details");

		CC_ClaimActions.LossDetails();
		CC_ClaimActions.LossDetailsInformation();

		CC_Reusables.ccMenuNavigation("Policy Aggregate Limits");

		CC_Policy_AggregateLimits.AG_AggregateLimits();

		CC_Reusables.clickButton("Update");

		CC_Reusables.ccMenuNavigation("Policy Level Coverage Insured Party");
		CC_ChooseCoverage.CreateNewExposure();
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.CreateReserve_ClaimCostAndExpenceDCC();
		CC_Reusables.ccMenuNavigation("Policy Aggregate Limits");
		CC_Policy_AggregateLimits.AG_VerifyAggregateLimits();
		CC_Reusables.ccMenuNavigation("Exposures");
		CC_ChooseCoverage.CloseExposure(1);
		// Logout
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public static void Claims367_TC003_CC_VerifiedPolicy_AllIncurredCostsexceptexpenses_ShouldInclude_OnlyClaimCost() throws Throwable {

		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");

		CC_Reusables.ccMenuNavigation("Policy General");

		CC_PolicyGeneral.PG_EditEntirePolicy();

		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_LevelCoverages();
		CC_Reusables.clickButton("Back");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");

		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();

		CC_Reusables.ccMenuNavigation("Loss Details");

		CC_ClaimActions.LossDetails();
		CC_ClaimActions.LossDetailsInformation();

		CC_Reusables.ccMenuNavigation("Policy Aggregate Limits");

		CC_Policy_AggregateLimits.AG_AggregateLimits();

		CC_Reusables.clickButton("Update");

		CC_Reusables.ccMenuNavigation("Policy Level Coverage Insured Party");
		CC_ChooseCoverage.CreateNewExposure();
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.CreateReserve_ClaimCostAndExpenceDCC();
		CC_Reusables.ccMenuNavigation("Policy Aggregate Limits");
		CC_Policy_AggregateLimits.AG_VerifyAggregateLimits();
		CC_Reusables.ccMenuNavigation("Exposures");
		CC_ChooseCoverage.CloseExposure(1);
		// Logout
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public static void Claims367_TC004_CC_VerifiedPolicy_AggregateLimitsandDeductibles_AvailableAllPolicy() throws Throwable {

		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing Claim
		CC_Policy_AggregateLimits.AG_VerifyAggregateLimitsAndDeductibles();

		// Logout
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
}
