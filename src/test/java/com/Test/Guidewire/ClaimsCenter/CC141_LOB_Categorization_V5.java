package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC141_LOB_Categorization_V5 extends GW_GetDriver {

	@Test
	public void CC141_LOBCategorizationV5_ExcessProfessionalLiability() throws Throwable {
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
	public void CC141_LOBCategorizationV5_ExcessLawyersEO() throws Throwable {
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
	public void CC141_LOBCategorizationV5_ExcessAccountantsEO() throws Throwable {
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
	public void CC141_LOBCategorizationV5_ExcessArchitectsAndEngineersEO() throws Throwable {
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
	public void CC141_LOBCategorizationV5_ExcessMiscellaneousEO() throws Throwable {
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
	public void CC141_LOBCategorizationV5_ExcessInsuranceAgentsEO() throws Throwable {
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
	public void CC141_LOBCategorizationV5_ExcessTechnologyEO() throws Throwable {
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
	public void CC141_LOBCategorizationV5_ExcessCyberEO() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamageInsured();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamageThird();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessManagementLiability() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessPublicCompanyDO() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessSideADO() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessEPLI() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFiduciary() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessCrimeFidelity() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessPrivateCompanyDOPackage() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessNotForProfitDOPackage() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFinancialInstitutionsDirectorsOfficers() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFinancialInstitutionsErrorsOmissions() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC141_LOBCategorizationV5_ExcessFIDOPublicCompany_DirectorsOfficers() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIEO_ErrorsOmissions() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIEPLI_EmploymentPractices() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIFiduciary() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBond_FinancialFidelity() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlend_DirectorsOfficers() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlend_ErrorsOmissions() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlend_FiduciaryLiability() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlend_Cyber() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlend_EmploymentPractices() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendBanks_DirectorsOfficers() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendBanks_ErrorsOmissions() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendBanks_FiduciaryLiability() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendBanks_Cyber() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendBanks_EmploymentPractices() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendInsuranceCompanies_DirectorsOfficers() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendInsuranceCompanies_ErrorsOmissions() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendInsuranceCompanies_FiduciaryLiability() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendInsuranceCompanies_Cyber() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendInsuranceCompanies_EmploymentPractices() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendMoneyManagers_DirectorsOfficers() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendMoneyManagers_ErrorsOmissions() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendMoneyManagers_FiduciaryLiability() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessLiabilityFacility() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessLiabilityHospitals() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessLiabilityLongTermCare() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessLiabilityPhysicians() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessLiabilityLifeSciences() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessCasualty() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendMoneyManagers_Cyber() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBlendMoneyManagers_EmploymentPractices() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessLiabilityManagedCare() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessMLBlend_DirectorsOfficers() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessMLBlend_ErrorsOmissions() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessMLBlend_EmploymentPractices() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessMLBlend_FiduciaryLiability() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessMLBlendDOFiduciary_DirectorsOfficers() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessMLBlendDOFiduciary_FiduciaryLiability() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessMLBlendDOEPL_DirectorsOfficers() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessMLBlendDOEPL_EmploymentPractices() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessMLBlendEPLWageHour_EmploymentPractices() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_CreditInsurance_TradeCredit() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_PoliticalRiskInvestment_PoliticalRisk() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_PoliticalRiskContractFrustration_PoliticalRisk() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_PrimaryLiabilityAlliedProviders() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_PrimaryLiabilityFacility() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	// -------------11 Jan 2021-----------//
	@Test
	public void CC141_LOBCategorizationV5_PrimaryLiabilityHospitals() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_PrimaryLiabilityLifeSciences() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_PrimaryLiabilityLongTermCare() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_PrimaryLiabilityManagedCare() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_PrimaryLiabilityPhysicians() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_BodilyInjury();
		CC_Reusables.clickButton("NewExposure Cancel Button");
		CC_Reusables.ccMenuNavigation("Policy Level Coverage");
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_PoliticalRiskInfrastructureFinance() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_PoliticalRiskMobileAssetFinance() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFISecurityBrokerDealerLiability() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIBankersProfessionalLiability() throws Throwable {
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
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIPrivateEquityLiability_ErrorsOmissions() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIPrivateEquityLiability_DirectorsOfficers() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIPrivateEquityLiability_FiduciaryLiability() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC141_LOBCategorizationV5_ExcessFIPrivateEquityLiability_EmploymentPractices() throws Throwable {
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
		CC_ChooseCoverage.PolicyLevelCoverages_GeneralDamage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
}
