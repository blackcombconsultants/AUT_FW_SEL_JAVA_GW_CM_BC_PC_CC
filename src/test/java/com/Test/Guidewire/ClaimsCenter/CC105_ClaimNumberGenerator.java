package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_PolicyGeneral;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_SearchPolicyOrCreatePolicy;

public class CC105_ClaimNumberGenerator extends GW_GetDriver {

	@Test
	public void Claim_105_TC001_CC_VP_GPCN_VRL_Bermuda() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		Thread.sleep(30000);
		CC_Reusables.ccMenuNavigation("Policy General Direct");
		Thread.sleep(1000);
		CC_PolicyGeneral.PG_PolicyGeneralTypelist();
		Thread.sleep(1000);
		CC_Reusables.clickButton("Back");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved_ClaimNumberVerify("Bermuda");
		Thread.sleep(1000);
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void Claim_105_TC002_CC_VP_GPCN_VGH_USA() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		Thread.sleep(30000);
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
		CC_NewClaimWizard.ncw_newClaimSaved_ClaimNumberVerify("USA");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void Claim_105_TC003_CC_UVP_GPCN_VRL_Bermuda() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Unverified Policy
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
		Thread.sleep(2000);
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ncw_CUP_Underwriting();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_InsuredName();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_OtherLocation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved_ClaimNumberVerify("Bermuda");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void Claim_105_TC004_CC_UVP_GPCN_VGH_USA() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Unverified Policy

		CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ncw_CUP_Underwriting();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_InsuredName();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_OtherLocation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved_ClaimNumberVerify("USA");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void Claim_105_TC005_CC_VP_GenerateDraftClaimNumber_Bermuda() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");
		Thread.sleep(1000);
		CC_Reusables.ccMenuNavigation("Policy General Direct");
		Thread.sleep(1000);
		CC_PolicyGeneral.PG_PolicyGeneralTypelist();
		Thread.sleep(1000);
		CC_Reusables.clickButton("Back");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_NewClaimWizard.Verify_DraftClaimNumber();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void Claim_105_TC006_CC_VP_GenerateDraftClaimNumber_USA() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");
		Thread.sleep(1000);
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_NewClaimWizard.Verify_DraftClaimNumber();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void Claim_105_TC007_CC_UVP_GenerateDraftClaimNumber_Bermuda() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Unverified Policy

		CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
		Thread.sleep(1000);
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ncw_CUP_Underwriting();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_InsuredName();
		Thread.sleep(1000);
		CC_NewClaimWizard.Verify_DraftClaimNumber();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void Claim_105_TC008_CC_UVP_GenerateDraftClaimNumber_USA() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Unverified Policy
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ncw_CUP_Underwriting();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_InsuredName();
		Thread.sleep(1000);
		CC_NewClaimWizard.Verify_DraftClaimNumber();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test()
	public void Claim_105_TC009_CC_ViewtheUnsavedwork_VP_GPCN_Bermuda() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_Reusables.ccTabNavigation("Unsaved Work", "NA");
		CC_NewClaimWizard.ncw_ViewUnsavedWork();

		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");
		Thread.sleep(1000);
		CC_Reusables.ccMenuNavigation("Policy General Direct");
		Thread.sleep(1000);
		CC_PolicyGeneral.PG_PolicyGeneralTypelist();
		Thread.sleep(1000);
		CC_Reusables.clickButton("Back");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved_ClaimNumberVerify("Bermuda");
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void Claim_105_TC010_CC_DuplicateClaimNumber() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();

		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaimGenerator();
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
}
