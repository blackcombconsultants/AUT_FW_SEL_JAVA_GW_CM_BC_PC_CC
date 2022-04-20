package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.CC_Exposure;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC70_CreateMaintainExposureToTheFirstExposure {
	@Test
	public void CC70_TC001_ChooseByCoverageTypeIsRemoved() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		CC_Reusables.ccMenuNavigation("Actions");
		CC_Exposure.NewExposure_CoverageTypeIsRemoved();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC70_TC002_UpdateClaimantTypelist() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Exposures");

		// CC_Resuables.ccMenuNavigation("New Exposure 1 :5 Commercial Way Liability COV Gen Damages");
		CC_ChooseCoverage.Exposure_ClaimantType();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC70_TC003_SegmentFieldHiddenInExposure() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Exposures");
		CC_Exposure.NewExposure_SegmentFieldHiddenInExposure();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC70_TC004_ChooseByCoverageTypeIsRemovedFromExposureTable() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		// CC_NewClaimWizard.basicInformation_InsuredDetailsEdit();
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Exposure.CoverageTypeIsRemovedFormExposureTable();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC70_TC005_InsuredAndThirdPartyShouldDisplay() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.NewExposureGeneral_InsuredAndThirdPartyShouldDisplay();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC70_TC006_UnnecessaryoutcomeshouldNotDisplayedInClosedxposure() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.NewExposureGeneral_OutcomeTypeList();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC70_TC007_ReopenReasontypelist() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Exposures");

		CC_ChooseCoverage.Reopen_Exposure_VerifyOutcome();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
}
