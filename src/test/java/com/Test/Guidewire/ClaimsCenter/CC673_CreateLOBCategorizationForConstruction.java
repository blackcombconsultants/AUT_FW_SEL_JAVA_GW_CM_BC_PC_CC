package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC673_CreateLOBCategorizationForConstruction {

	@Test
	public void CC673_LOBCategorization_CombinedProfessional_ProfessionalLiability_Professional() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_CombinedProfessional_ProfessionalLiability_Pollution() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_CombinedProfessional_PollutionLiability_Professional() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_CombinedProfessional_PollutionLiability_Pollution() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ConstructionIntegratedExcess_ProfessionalLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ConstructionIntegratedExcess_PollutionLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ConstructionIntegratedProjectDelivery_ProfessionalLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ConstructionIntegratedProjectDelivery_PollutionLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ConstructionPollutionLiability_ProfessionalLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOBProfLiabilityvalidate();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ConstructionPollutionLiability_PollutionLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOBProfLiabilityvalidate();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ConstructionProfessionalLiability_ProfessionalLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOBProfLiabilityvalidate();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ConstructionProfessionalLiability_PollutionLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOBProfLiabilityvalidate();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessCombinedProfessionalLiabilityPollutionLiability_ProfessionalLiability_Professional() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessCombinedProfessionalLiabilityPollutionLiability_ProfessionalLiability_Pollution() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	// 24 Jan 2022
	@Test
	public void CC673_LOBCategorization_ExcessCombinedProfessionalLiabilityPollutionLiability_PollutionLiability_Professional() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessCombinedProfessionalLiabilityPollutionLiability_PollutionLiability_Pollution() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessConstructionIntegratedProjectDelivery_ProfessionalLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessConstructionIntegratedProjectDelivery_PollutionLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessConstructionPollutionLiability_ProfessionalLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessConstructionPollutionLiability_PollutionLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessConstructionProfessionalLiability_ProfessionalLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessConstructionProfessionalLiability_PollutionLiability() throws Throwable {
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
		CC_NewClaimWizard.ncw_AddClaimInformation_LOB();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessSubcontractorDefaultInsuranceProject_GeneralLiability() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessSubcontractorDefaultInsuranceSubcontractor_GeneralLiability() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_SubcontractorDefaultInsuranceProject_GeneralLiability() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_SubcontractorDefaultInsuranceSubcontractor_GeneralLiability() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_Property();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessWageHour_EmploymentPractices() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessConsultantsEO_ProfessionalLiability() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC673_LOBCategorization_ExcessFIWageHour_EmploymentPractices() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
}
