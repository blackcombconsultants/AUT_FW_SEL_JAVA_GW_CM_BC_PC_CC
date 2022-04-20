package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.CC_Exposure;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_SearchClaims;
import com.pages.Guidewire.ClaimsCenter.CC_SearchPolicyOrCreatePolicy;

public class CC61_ClaimAssignment {

	/*
	 * Testcase ID : CC61_TC002_AutomaticAssignmentClaims Decription : AutomaticAssignmentClaims Owner : Rahul Dixit Date : 03-01-2022
	 */
	@Test
	public void CC61_TC002_AutomaticAssignmentClaims() throws Throwable {
		// User Logs into GW CC as an Paula
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_SearchPolicyOrCreatePolicy.SearchorCreatePolicy_VantageTypeList();
		CC_NewClaimWizard.ncw_AddClaimInfo_ForSearch();
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_NewClaimWizard.ncw_ACI_AddIncident(1);
		CC_Reusables.clickButton("Next");
		// ClaimCenter_ClaimExposure.Create_Exposure();
		// CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_ChooseCoverage.newExposure(1);

		// ClaimCenter_Resuables.clickButton("OK");
		CC_Reusables.clickButton("Finish");
		CC_SearchClaims.ViewNewlySavedClaim();

		CC_Reusables.ccMenuNavigation("Assign Claim");
		CC_SearchClaims.AssignClaim();

		CC_Reusables.ccMenuNavigation("Exposures");
		CC_Exposure.Verify_ExposureAssigment();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	/*
	 * Testcase ID : CC61_TC003_ExposureAssignment_createdDuringFNOL Decription : ExposureAssignment_createdDuringFNOL Owner : Rahul Dixit Date :
	 * 04-01-2022
	 */
	@Test
	public void CC61_TC003_ExposureAssignment_createdDuringFNOL() throws Throwable {
		// User Logs into GW CC as an Paula
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_AddClaimInfo_ForSearch();
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");
		Thread.sleep(200);
		CC_Reusables.clickButton("Finish");
		CC_SearchClaims.ViewNewlySavedClaim();

		CC_Reusables.ccMenuNavigation("New Exposure");
		CC_ChooseCoverage.AllClaimantInfo();
		CC_ChooseCoverage.AddInjuryAfterFNOL();
		CC_Reusables.clickButton("Update");
		CC_Reusables.ccMenuNavigation("Assign Claim");
		CC_SearchClaims.AssignClaim();

		CC_Reusables.ccMenuNavigation("Exposures");
		CC_Exposure.Verify_ExposureAssigment();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	/*
	 * Testcase ID : CC61_TC004_ExposureAssignmentLOBNotEditable Decription : ExposureAssignmentLOBNotEditable Owner : Rahul Dixit Date : 05-01-2022
	 */
	@Test
	public void CC61_TC004_ExposureAssignmentLOBNotEditable() throws Throwable {
		// User Logs into GW CC as an Paula
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_AddClaimInfo_ForSearch();
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_NewClaimWizard.ncw_ACI_AddIncident(1);
		CC_Reusables.clickButton("Next");
		// CC_NewClaimWizard.ncw_SaveAndAssignClaim();
		CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
		CC_ChooseCoverage.newExposure(1);

		// ClaimCenter_Resuables.clickButton("OK");
		CC_Reusables.clickButton("Finish");
		CC_SearchClaims.ViewNewlySavedClaim();

		CC_Reusables.ccMenuNavigation("Assign Claim");
		CC_SearchClaims.AssignClaim();

		CC_Reusables.ccMenuNavigation("Status");
		CC_Reusables.clickButton("Status Edit");
		CC_NewClaimWizard.Verify_LOBNotEditable();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	/*
	 * Testcase ID : CC61_TC005_Automatic Assignment of Claims Decription : Automatic Assignment of Claims Owner : Rahul Dixit Date : 05-01-2022
	 */
	@Test
	public void CC61_TC005_AutomaticAssignmentOfClaims() throws Throwable {
		// User Logs into GW CC as an Paula
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_AddClaimInfo_ForSearch();
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation();
		CC_Reusables.clickButton("Next");

		CC_Reusables.clickButton("Finish");
		CC_SearchClaims.ViewNewlySavedClaim();
		CC_Reusables.ccMenuNavigation("Assign Claim");
		CC_SearchClaims.AssignClaim();
		CC_SearchClaims.VerifyExposureWarning();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

}
