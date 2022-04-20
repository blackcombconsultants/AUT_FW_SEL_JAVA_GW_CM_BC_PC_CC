package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Notes;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Claim55_MaintainClaimFileNotes extends GW_GetDriver {

	@Test
	public void Claim_55_TC001_CC_CreateClaim_Increase_Number_Notes() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		// CC_NewClaimWizard.basicInformation_InsuredDetailsEdit();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved();
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Notes");
		CC_Notes.GetNewNote100();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void Claim_55_TC002_CC_CreateClaim_Increase_Size() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		// CC_NewClaimWizard.basicInformation_InsuredDetailsEdit();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved();
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Notes");
		CC_Notes.GetNewNoteTextAreaSize();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void Claim_55_TC003_CC_CreateClaim_VerifyNotesTopics() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		// CC_NewClaimWizard.basicInformation_InsuredDetailsEdit();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved();
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Notes");
		CC_Notes.VerifyNotesTopics();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void Claim_55_TC004_CC_CreateClaim_VerifyNotesTopicsMediclaIssuesRemoved() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		// CC_NewClaimWizard.basicInformation_InsuredDetailsEdit();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_Reusables.clickButton("Finish");
		CC_NewClaimWizard.ncw_newClaimSaved();
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Notes");
		CC_Notes.VerifyNotesMedicalIssuesRemoved();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
}
