package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_PolicyDetails;
import com.pages.Guidewire.ClaimsCenter.CC_PolicyGeneral;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_SearchPolicyOrCreatePolicy;

public class CC46_PolicyRetrieve extends GW_GetDriver {
	@Test

	public static void Claims46_TC001_CC_VP_PG_AddfieldCoverageForm_PolicyLevelCoverage() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		Thread.sleep(15000);
		CC_Reusables.ccMenuNavigation("Policy General Direct");
		CC_PolicyGeneral.PG_PolicyLevelCoverages();
		CC_PolicyGeneral.CoverageForm_Validation();

		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public static void Claims46_TC002_CC_VP_PD_AddfieldCoverageForm_RiskUnitLevelCoverage() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		Thread.sleep(15000);
		CC_Reusables.ccMenuNavigation("Policy Details");
		CC_PolicyDetails.PD_EditEntirePolicy();

		CC_PolicyDetails.PD_AddLocations();

		CC_PolicyDetails.PL_AddLocationRisk();

		CC_PolicyDetails.ALR_Coverages();
		CC_PolicyGeneral.CoverageFormPolicyLocation_Validation();

		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public static void Claims46_TC003_CC_VP_PG_PLC_AddEachOffense_PerTypelist() throws Throwable {
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		Thread.sleep(15000);
		CC_Reusables.ccMenuNavigation("Policy General Direct");
		CC_PolicyGeneral.PG_EditEntirePolicy();

		CC_PolicyGeneral.PG_PolicyLevelCoverages_Add();
		CC_PolicyGeneral.PLC_CoverageTerms_AddFinacialCoverageTerm();
		CC_PolicyGeneral.CoverageTerm_PerTypeListVerify();
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public static void Claims46_TC004_CC_VP_PG_PLC_AddEachOffense_ApplicableTypelist() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		Thread.sleep(15000);
		CC_Reusables.ccMenuNavigation("Policy General Direct");
		CC_PolicyGeneral.PG_EditEntirePolicy();

		CC_PolicyGeneral.PG_PolicyLevelCoverages_Add();
		CC_PolicyGeneral.PLC_CoverageTerms_AddFinacialCoverageTerm();
		CC_PolicyGeneral.CoverageTerm_ApplicableToTypeListVerify();
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public static void Claims46_TC005_CC_VP_PD_PLC_AddEachOffense_PerTypelist() throws Throwable {
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		Thread.sleep(15000);
		CC_Reusables.ccMenuNavigation("Policy Details");

		CC_PolicyDetails.PD_EditEntirePolicy();

		CC_PolicyDetails.PD_AddLocations();
		CC_PolicyDetails.PL_AddLocationRisk();
		CC_PolicyDetails.ALR_Coverages();
		CC_PolicyGeneral.PLC_CoverageTerms_AddFinacialCoverageTerm();
		CC_PolicyGeneral.CoverageTerm_PerTypeListVerify();
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public static void Claims46_TC006_CC_VP_PD_PLC_AddEachOffense_ApplicableTypelist() throws Throwable {
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		Thread.sleep(15000);
		CC_Reusables.ccMenuNavigation("Policy Details");

		CC_PolicyDetails.PD_EditEntirePolicy();

		CC_PolicyDetails.PD_AddLocations();

		CC_PolicyDetails.PL_AddLocationRisk();
		CC_PolicyDetails.ALR_Coverages();
		CC_PolicyGeneral.PLC_CoverageTerms_AddFinacialCoverageTerm();
		CC_PolicyGeneral.CoverageTerm_ApplicableToTypeListVerify();
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

}
