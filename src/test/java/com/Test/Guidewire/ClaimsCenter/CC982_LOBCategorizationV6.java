package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC982_LOBCategorizationV6 extends GW_GetDriver {

	@Test
	public void CC982_TC001_UNV_CreateClaimMapSubcontractorDefaultInsurance() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");

		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicyMultiplePolicy();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC982_TC002_UNV_NewClaimMapExcessFISideAOPolicyType() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_LevelCoverages();
		CC_NewClaimWizard.ncw_CUP_Underwriting();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_InsuredName();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_OtherLocation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC982_TC003_UNV_NewClaimRemoveMappingExcessConstructionProfessional() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_LevelCoverages();
		CC_NewClaimWizard.ncw_CUP_Underwriting();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_InsuredName();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_OtherLocation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_RemovedExposure();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC982_TC004_UNV_NewClaimRemoveMappingExcessConstructionPollution() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_LevelCoverages();
		CC_NewClaimWizard.ncw_CUP_Underwriting();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_InsuredName();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_OtherLocation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_RemovedExposure();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC982_TC005_UNV_NewClaimRemoveMappingConstructionProfessional() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_LevelCoverages();
		CC_NewClaimWizard.ncw_CUP_Underwriting();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_InsuredName();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_OtherLocation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_RemovedExposure();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC982_TC006_UNV_NewClaimRemoveMappingConstructionPollution() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_LevelCoverages();
		CC_NewClaimWizard.ncw_CUP_Underwriting();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_InsuredName();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_OtherLocation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_RemovedExposure();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
}
