package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_Services;

public class CC1324_AddMigratedClaimStatusPage {

	@Test
	public void CC1324_TC001_CC_OpenAnyMigratedClaim_AddFieldMigratedClaim() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Paula");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Summary - Status
		CC_Reusables.ccMenuNavigation("Status");
		CC_Services.Validate_Services_MigratedClaimField();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void CC1324_TC002_CC_CreateMigratedClaim_AddFieldMigratedClaim() throws Throwable {
		CC_Reusables.login_ClaimsCenter_User("Paula");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();

		CC_Reusables.clickButton("Next");
		Thread.sleep(10000);

		CC_NewClaimWizard.ncw_BasicInformation();

		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		// CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_NewClaimWizard.ncw_AddClaimInformation_LossLocation_OtherLocation();
		// CC_NewClaimWizard.ncw_ACI_AddIncident();

		CC_Reusables.clickButton("Next");

		CC_NewClaimWizard.ncw_SaveAndAssignClaim_Assign();
		// CC_ChooseCoverage.newExposure();
		CC_Reusables.clickButton("Finish");
		if (CC_Reusables.ValidationResults_Clear()) {
			CC_Reusables.clickButton("Finish");
		}

		CC_NewClaimWizard.ncw_newClaimSaved();
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();

		// Summary - Status
		CC_Reusables.ccMenuNavigation("Status");
		CC_Services.Validate_Services_MigratedClaimField();
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC1324_TC003_CC_OpenAnyMigratedClaim_MigratedClaimNonEditable() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Paula");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Summary - Status
		CC_Reusables.ccMenuNavigation("Status");
		CC_Services.Verify_CurrencyFieldIsNotEditable();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
}
