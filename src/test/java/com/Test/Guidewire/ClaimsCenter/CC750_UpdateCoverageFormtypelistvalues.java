package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_PolicyDetails;
import com.pages.Guidewire.ClaimsCenter.CC_PolicyGeneral;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_SearchPolicyOrCreatePolicy;

public class CC750_UpdateCoverageFormtypelistvalues extends GW_GetDriver {

	@Test
	public void CC750_TC001_CoverageFormTypelistHaveChanged() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_LiabilityQuickClaim();
		CC_NewClaimWizard.ncw_AddClaimInfo_ForSearch();
		Thread.sleep(30000);
		CC_Reusables.ccMenuNavigation("Policy General Direct");
		CC_PolicyGeneral.PG_EditEntirePolicy();
		CC_PolicyGeneral.PolicyGeneral_BasicInformation();
		CC_PolicyGeneral.ncw_PolicyGeneral_PolicyLevelCoverage_AddCoverage();
		CC_Reusables.ccMenuNavigation("Policy General");
		// CC_PolicyGeneral.PG_EditEntirePolicy();
		CC_PolicyGeneral.PG_PolicyLevelCoverages_Add();
		CC_PolicyGeneral.ncw_PolicyGeneral_PolicyLevelCoverage_AddCoverage();
		// ----->Logout ClaimCentertib
		CC_Reusables.logout_ClaimsCenter();

	}

	// --Policy details post-FNOL--//
	@Test
	public void CC750_PolicydetailspostFNOL_TC001_PolicyLevelCoverages_Rename() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy");
		CC_Reusables.clickButton("Policy Edit");

		CC_PolicyGeneral.PG_PolicyLevelCoverages_Add();
		CC_PolicyGeneral.PLC_CoverageForm();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void CC750_PolicydetailspostFNOL_TC002_RiskUnitLevelCoverages() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy");
		CC_Reusables.ccMenuNavigation("Location and Class");
		CC_Reusables.clickButton("Edit");
		CC_PolicyDetails.PL_AddLocationRisk();
		// ClaimCenter_Resuables.clickButton("Edit");
		CC_PolicyGeneral.LocationCoverages();
		CC_PolicyGeneral.PLC_CoverageForm();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void CC750_PolicydetailspostFNOL_TC003_RetiretheexistingOOTBvalues() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy");
		Thread.sleep(1000);
		CC_Reusables.clickButton("Policy Edit");
		Thread.sleep(1000);
		CC_PolicyGeneral.PG_PolicyLevelCoverages_Add();
		CC_PolicyGeneral.OOTBvalues();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void CC750_PolicydetailspostFNOL_TC004_RetireOOTBvalues() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy");
		CC_Reusables.ccMenuNavigation("Location and Class");
		CC_Reusables.clickButton("Edit");
		CC_PolicyDetails.PL_AddLocationRisk();
		CC_PolicyGeneral.LocationCoverages();
		CC_PolicyGeneral.OOTBvalues();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void CC750_PolicydetailspostFNOL_TC005_CoverageFormtypelist() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy");
		CC_Reusables.clickButton("Policy Edit");

		CC_PolicyGeneral.PG_PolicyLevelCoverages_Add();
		CC_PolicyGeneral.PG_CoverageFormTypelist();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void CC750_PolicydetailspostFNOL_TC006_RiskUnitLevel() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy");

		CC_Reusables.ccMenuNavigation("Location and Class");
		CC_Reusables.clickButton("Edit");
		CC_PolicyDetails.PL_AddLocationRisk();
		CC_PolicyGeneral.LocationCoverages();
		CC_PolicyGeneral.PG_CoverageFormTypelist();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	// --Loss Details--//
	@Test
	public void CC750_LossDetails_TC001_CoverageFormtypelist() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// Policy Tab
		CC_Reusables.ccMenuNavigation("Policy");
		CC_Reusables.clickButton("Policy Edit");
		CC_PolicyGeneral.PG_PolicyLevelCoverages_Add();

		CC_PolicyGeneral.PG_CoverageFormTypelist();

		CC_PolicyGeneral.PLC_CoverageForm();
		CC_NewClaimWizard.Policy();
		CC_Reusables.clickButton("Update");
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_Reusables.clickButton("Edit");
		CC_NewClaimWizard.LossDetails_Dates();
		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ErrorMessage();

		// Policy Tab
		CC_Reusables.ccMenuNavigation("Policy");
		// ClaimCenter_Resuables.clickButton("Edit");
		CC_NewClaimWizard.ncw_CreateverifiedPolicy_LevelCoverages();
		CC_Reusables.clickButton("Update");

		CC_Reusables.ccMenuNavigation("Loss Details");

		// ClaimCenter_Resuables.clickButton("Edit");
		CC_NewClaimWizard.LossDetails_Dates();
		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ErrorMessage();
		CC_Reusables.ccMenuNavigation("Policy");
		// ClaimCenter_Resuables.clickButton("Edit");
		CC_NewClaimWizard.Policy_Ext();
		CC_NewClaimWizard.ncw_CreateverifiedPolicy_LevelCoverages();
		// CC_NewClaimWizard.Policy_Ext();
		CC_Reusables.clickButton("Update");
		CC_Reusables.ccMenuNavigation("Loss Details");

		// ClaimCenter_Resuables.clickButton("Edit");
		CC_NewClaimWizard.LossDates_DifferentValues();

		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ErrorMessage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	// Policy Details FNOL
	@Test
	public void CC750_PolicydetailsFNOL_TC001_PolicyLevelCoverages_Rename() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_PolicyType();
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.BasicInformation_Header();
		CC_Reusables.ccMenuNavigation("Policy General");
		CC_PolicyGeneral.PG_EditEntirePolicy();
		CC_PolicyGeneral.PG_PolicyLevelCoverages_Add();
		CC_PolicyGeneral.PLC_CoverageForm();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC750_PolicydetailsFNOL_TC002_PolicyLevelCoverages_RenameinRiskCoverage() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_PolicyType();
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.BasicInformation_Header();
		CC_Reusables.ccMenuNavigation("Policy Details");
		CC_PolicyDetails.PD_LocationsAdd_CoveredRisk();
		CC_PolicyDetails.PL_AddLocationRisk();
		CC_PolicyDetails.ALR_Coverages();
		CC_PolicyGeneral.PLC_CoverageForm();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC750_PolicydetailsFNOL_TC005_AddedCoverageFormtypelist() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_PolicyType();
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.BasicInformation_Header();
		// Policy Tab
		CC_Reusables.ccMenuNavigation("Policy General");

		CC_PolicyGeneral.PG_EditEntirePolicy();
		CC_PolicyGeneral.PG_PolicyLevelCoverages_Add();
		CC_PolicyGeneral.PG_CoverageFormTypelist();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC750_PolicydetailsFNOL_TC006_AddedCoverageFormtypelistinRisk() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_PolicyType();
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.BasicInformation_Header();
		// Policy Tab
		CC_Reusables.ccMenuNavigation("Policy Details");
		CC_PolicyDetails.PD_LocationsAdd_CoveredRisk();
		CC_PolicyDetails.PL_AddLocationRisk();
		CC_PolicyDetails.ALR_Coverages();
		CC_PolicyGeneral.PG_CoverageFormTypelist();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC750_PolicydetailsFNOL_TC003_RetiretheexistingOOTBvalues() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy");
		CC_Reusables.clickButton("Edit");
		CC_PolicyGeneral.PG_PolicyLevelCoverages_Add();
		CC_PolicyGeneral.OOTBvalues();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void CC750_PolicydetailsFNOL_TC004_RetireOOTBvalues() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		CC_Reusables.ccMenuNavigation("Locations and Class");
		CC_Reusables.clickButton("Edit");
		CC_PolicyDetails.PL_AddLocationRisk();
		CC_PolicyGeneral.LocationCoverages();
		CC_PolicyGeneral.OOTBvalues();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void CC750_UnverifiedPolicy_TC001_CoverageFormtypelist() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ncw_CUP_Underwriting();
		CC_NewClaimWizard.CreateUnverifiedPolicy_LevelCoverages();

		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.Warning_OutsideCoverage();
		// Policy Tab
		CC_Reusables.ccMenuNavigation("Policy General");
		CC_NewClaimWizard.CreateUnverifiedPolicy_LevelCoveragesRetro();
		CC_Reusables.clickButton("Back");
		CC_NewClaimWizard.Warning_OutsideCoverage();
		CC_Reusables.ccMenuNavigation("Policy General");
		CC_NewClaimWizard.Policy_Ext();
		CC_NewClaimWizard.CreateUnverifiedPolicy_LevelCoverages();
		CC_Reusables.clickButton("Back");

		// ----->Logout ClaimCentertib
		CC_Reusables.logout_ClaimsCenter();

	}
}
