package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_PolicyGeneral;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_SearchPolicyOrCreatePolicy;

public class CC45_SearchPolicy {
	@Test
	public void CC45_TC001_FirstName() throws Throwable {

		// User Logs into GW CC as an Adjuster

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_FirstName();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	// NewClaim

	@Test
	public void CC45_TC002_LastName() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_LastName();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC45_TC003_Tax() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");

		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_TaxId();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC45_TC004_VinName() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VinName();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC45_TC006_DoesPermissionForCreateBermuda() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");

		CC_Reusables.ccMenuNavigation("Policy General");

		CC_PolicyGeneral.PG_PolicyGeneralTypelist();

		CC_Reusables.clickButton("Back");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		// CC_NewClaimWizard.basicInformation_InsuredDetailsEdit();
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
	public void CC45_TC007_ErrorMsgForCreateBermuda() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_ErrorMsgforcreatebermuda();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC45_TC008_UnderwriterVantageTypeList() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");

		CC_Reusables.ccMenuNavigation("Policy General Direct");

		CC_PolicyGeneral.PG_PolicyGeneralOrgnizationVerify();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC45_TC009_ClaimHistory() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_ClaimHistory();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC45_TC012_LiabilityQuickClaim() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_LiabilityQuickClaim();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
}
