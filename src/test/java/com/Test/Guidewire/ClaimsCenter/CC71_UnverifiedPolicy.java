package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_SearchPolicyOrCreatePolicy;

public class CC71_UnverifiedPolicy {

	@Test
	public void Claim71_TC001_CC_UVP_OrganizationFeild() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Unverified Policy

		CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();

		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
		CC_Reusables.clickButton("Update");
		CC_Reusables.clickButton("Next");
		CC_SearchPolicyOrCreatePolicy.UnderWriting_OrganizationErrorMsg();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void Claim71_TC002_CC_UVP_TypeOfClaim() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Unverified Policy
		CC_SearchPolicyOrCreatePolicy.UVP_TypeOfClaim();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void Claim71_TC003_CC_UVP_ExposureSection() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
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
		CC_NewClaimWizard.ncw_SaveAndAssignClaim_ExposureValidation();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

}
