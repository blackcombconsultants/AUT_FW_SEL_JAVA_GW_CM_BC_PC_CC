package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_PolicyDetails;
import com.pages.Guidewire.ClaimsCenter.CC_PolicyGeneral;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC368_ViewPolicyGeneralDetails {

	@Test
	public static void Claims368_TC001_VerifiedPolicy_AddColumn_CoverageForm() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy");
		CC_Reusables.ccMenuNavigation("General");

		CC_PolicyGeneral.CoverageForm_Validation();

		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public static void Claims368_TC002_VerifiedPolicy_AddColumn_CoverageForm_IntheRiskLevel() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy");
		CC_Reusables.ccMenuNavigation("Location and Class");

		CC_PolicyDetails.LC_EditPolicyLocation();

		CC_PolicyDetails.PL_AddLocationRisk();

		CC_PolicyDetails.ALR_Coverages();
		CC_PolicyGeneral.CoverageForm_Validation();

		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public static void Claims368_TC003_CC_VerifiedPolicy_Add_EachOffenseInGeneral() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy");
		CC_Reusables.ccMenuNavigation("General");
		CC_PolicyDetails.LC_EditPolicyGeneral();

		CC_PolicyGeneral.PG_PolicyLevelCoverages_Add();
		CC_PolicyGeneral.PLC_CoverageTerms_AddFinacialCoverageTerm();
		CC_PolicyGeneral.CoverageTerm_PerTypeListVerify();
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public static void Claims368_TC004_CC_VerifiedPolicy_Add_EachOffenseInLocation() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy");
		CC_Reusables.ccMenuNavigation("Location and Class");
		CC_PolicyDetails.LC_EditPolicyLocation();

		CC_PolicyDetails.PL_AddLocationRisk();

		CC_PolicyDetails.ALR_Coverages();

		CC_PolicyGeneral.PLC_CoverageTerms_AddFinacialCoverageTerm();
		CC_PolicyGeneral.CoverageTerm_PerTypeListVerify();
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public static void Claims368_TC005_CC_VerifiedPolicyAdd_Offense_PersonalandAdvertisingInjuryInGeneral() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy");
		CC_Reusables.ccMenuNavigation("General");
		CC_PolicyDetails.LC_EditPolicyGeneral();

		CC_PolicyGeneral.PG_PolicyLevelCoverages_Add();

		CC_PolicyGeneral.PLC_CoverageTerms_AddFinacialCoverageTerm();
		CC_PolicyGeneral.CoverageTerm_ApplicableToTypeListVerify();
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}

	@Test
	public static void Claims368_TC006_CC_VerifiedPolicyAdd_Offense_PersonalandAdvertisingInjuryInLocation() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy");
		CC_Reusables.ccMenuNavigation("Location and Class");
		CC_PolicyDetails.LC_EditPolicyLocation();

		CC_PolicyDetails.PL_AddLocationRisk();

		CC_PolicyDetails.ALR_Coverages();
		CC_PolicyGeneral.PLC_CoverageTerms_AddFinacialCoverageTerm();
		CC_PolicyGeneral.CoverageTerm_ApplicableToTypeListVerify();
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
}
