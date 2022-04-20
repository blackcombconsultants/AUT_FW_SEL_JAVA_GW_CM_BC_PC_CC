package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.CC_ClaimActions;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.CC_Reserve;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_SearchPolicyOrCreatePolicy;

public class CC73_MutiCurrency {

	@Test
	public void Claim_73_TC001_ValidateMulticurrency_Reserve() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Search Claim
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim

		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		// CC_NewClaimWizard.basicInformation_InsuredDetailsEdit();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");
		// CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved();
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		Thread.sleep(1000);
		CC_Reusables.ccMenuNavigation("Loss Details");
		Thread.sleep(1000);
		CC_ClaimActions.LossDetails();
		CC_ClaimActions.LossDetailsInformation();
		Thread.sleep(1000);
		// Navigate Actions -> Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// verify reserveCurrency dropdown
		CC_Reserve.ER_ReservingCurrency();
		CC_Reusables.clickButton("Save");

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void Claim_73_TC002_ValidateMulticurrency_Check() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		// CC_NewClaimWizard.basicInformation_InsuredDetailsEdit();
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		// CC_PolicyDetails.PD_LocationsAdd();
		// ClaimCenter_Resuables.clickButton("Back");
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_NewClaimWizard.ncw_ACI_AddIncident(1);
		CC_Reusables.clickButton("Next");
		// CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_ChooseCoverage.newExposure(1);

		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved();
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();

		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		CC_ClaimActions.LossDetailsInformation();

		// Adding Reserve
		// Navigate Actions -> Reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		// verify reserveCurrency dropdown
		CC_Reserve.ER_ReservingCurrency();
		CC_Reusables.clickButton("Save");

		// Creating Check
		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_Reusables.clickButton("Next");
		CC_NewTransaction_Check.EPI_PolicyDetails_VerifyCurrencyOptions();
		CC_Reusables.clickButton("Next");
		CC_NewTransaction_Check.Setcheckinstructions();
		CC_Reusables.clickButton("Finish");

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

}
