package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.CC_ClaimActions;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_PolicyGeneral;
import com.pages.Guidewire.ClaimsCenter.CC_Reserve;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_SearchPolicyOrCreatePolicy;

public class CC68_ProcessReserves {
	@Test
	public void CC68_TC001_Reserve_VerifyCostTypeList() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
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
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		// Step6 : Click Loss details Edit
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		// Step7 : Fill Loss Details Info
		CC_ClaimActions.LossDetailsInformation();
		// reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.VerifyCostTypeList();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC68_TC002_Reserve_VerifyCostCategorywithCostTypeIndemnity() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
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
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		// Step6 : Click Loss details Edit
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		// Step7 : Fill Loss Details Info
		CC_ClaimActions.LossDetailsInformation();
		// reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.VerifyCostCategorywithCostTypeIndemnity();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC68_TC003_Reserve_VerifyCostCategorywithCostTypeExpenseAO() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
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
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		// Step6 : Click Loss details Edit
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		// Step7 : Fill Loss Details Info
		CC_ClaimActions.LossDetailsInformation();
		// rseserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.VerifyCostCategorywithCostTypeExpenseAO();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC68_TC004_Reserve_VerifyCostCategorywithCostTypeExpenseDCC() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
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
		CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		// Step6 : Click Loss details Edit
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		// Step7 : Fill Loss Details Info
		CC_ClaimActions.LossDetailsInformation();
		// rseserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.VerifyCostCategorywithCostTypeExpenseDCC();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC68_TC005_ReserveatExposureLevelBordereuReport() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Click Loss details Edit
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		// Fill Loss Details Info
		CC_ClaimActions.LossDetailsInformationBordereuReportNo();
		// reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reusables.clickButton("Reserve Cancel");
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.VerifyExposureField();
		// Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Click Loss details Edit
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		// Fill Loss Details Info
		CC_ClaimActions.LossDetailsInformationBordereuReportYes();
		// reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reusables.clickButton("Reserve Cancel");
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.VerifyExposureFieldNoneClaimLevel();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public void CC68_TC007_ValidateWarningMessageOutofCoveragePeriod() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// rseserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.EnterAllRequirementsInEditReserves();
		CC_Reusables.Verify_WarningMessage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}

	/*
	 * TestCaseID: Claim68_TC008 owner: Rahul Dixit Description:verifySystemDisplaysWarningMessageLossDateCMDReportedDateOutsideCoveragePeriod Date:
	 * 24/01/2022
	 */
	@Test
	public void Claim68_TC008_verifySystemDisplaysWarningMessageLossDateCMDReportedDateOutsideCoveragePeriod() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");

		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy General");
		CC_Reusables.clickButton("Policy Edit");
		CC_PolicyGeneral.PolicyGeneral_BasicInformation();
		CC_ChooseCoverage.AddPolicylevelCoverage();
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.EditReserve_EnterAllRequirments();
		CC_Reusables.clickButton("Save");
		CC_Reusables.Verify_WarningMessage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	/*
	 * TestCaseID: Claim68_TC009 owner: Rahul Dixit Description:verifySystemDisplaysWarningMessageLossDateCMDReportedDateOutsideCoveragePeriod Date:
	 * 24/01/2022
	 */
	@Test
	public void Claim68_TC009_verifySystemDisplaysWarningWhenReportedDateNotBetweenPolicyEffectiveAndExtendedDate() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy General Direct");
		CC_Reusables.clickButton("Policy Edit");
		CC_PolicyGeneral.PolicyGeneral_BasicInformation();
		CC_ChooseCoverage.AddPolicylevelCoverage();
		CC_Reusables.clickButton("Update");
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.EditReserve_EnterAllRequirments();
		CC_Reusables.clickButton("Save");
		CC_Reusables.Verify_WarningMessage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	/*
	 * TestCaseID: Claim68_TC0010 owner: Rahul Dixit Description:verifySystemDisplaysWarningWhenLossDateNotBetweenPolicyEffectiveAndExtendedDate Date:
	 * 24/01/2022
	 */
	@Test
	public void Claim68_TC0010_verifySystemDisplaysWarningWhenLossDateNotBetweenPolicyEffectiveAndExtendedDate() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy General Direct");
		CC_Reusables.clickButton("Policy Edit");
		CC_PolicyGeneral.PolicyGeneral_BasicInformation();
		CC_ChooseCoverage.AddPolicylevelCoverage();
		CC_Reusables.clickButton("Update");
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.EditReserve_EnterAllRequirments();
		CC_Reusables.clickButton("Save");
		CC_Reusables.Verify_WarningMessage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	/*
	 * TestCaseID: Claim68_TC0011 owner: Rahul Dixit Description:verifySystemDisplaysWarningMessageLossDateCMDReportedDateOutsideCoveragePeriod Date:
	 * 24/01/2022
	 */
	@Test
	public void Claim68_TC0011_verifySystemDisplaysWarningWhenLossDateNotBetweenPolicyEffectiveAndRetroDate() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy General Direct");
		CC_Reusables.clickButton("Policy Edit");
		CC_PolicyGeneral.PolicyGeneral_BasicInformation();
		CC_ChooseCoverage.AddPolicylevelCoverage();
		CC_Reusables.clickButton("Update");
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.EditReserve_EnterAllRequirments();
		CC_Reusables.clickButton("Save");
		CC_Reusables.Verify_WarningMessage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	/*
	 * TestCaseID: Claim68_TC0012 owner: Misba Description:verifySystemDisplaysWarningMessageLossDateCMDReportedDateOutsideCoveragePeriod Date:
	 * 24/01/2022
	 */
	@Test
	public void Claim68_TC0012_verifySystemDisplaysWarningWhenReportedDateNotBetweenPolicyEffectiveExtendedReportedAnDExpiration() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Policy General Direct");
		CC_Reusables.clickButton("Policy Edit");
		CC_PolicyGeneral.PolicyGeneral_BasicInformation();
		Thread.sleep(2000);
		CC_ChooseCoverage.AddPolicylevelCoverage();
		CC_Reusables.clickButton("Update");
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.EditReserve_EnterAllRequirments();
		CC_Reusables.clickButton("Save");
		CC_Reusables.Verify_WarningMessage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC68_TC015_verifywhetherReasoniscreatedinbetweenChangeandComments() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.ReasoniscreatedinbetweenChangeandComments();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public void CC68_TC016_verifyReasonTypeList() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.verifyReasonTypeList();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public void CC68_TC017_ReasonisMandatoryfortheFirstExposureandReserve() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.ReasonisMandatoryfortheFirstExposureandReserve();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public void CC68_TC018_ReasonisMandatoryfortheFirstExposureandReservelineisIncreasing() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.ReasonisMandatoryfortheFirstExposureandReserveisIncreasing();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public void CC68_TC022_CommentisMandatorywhenReasonisOther() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.CommentisMandatorywhenReasonisOther();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public void CC68_TC020_ReasonisNotEditableforExpenseAOAndExpenseDCC() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.ReasonisNotEditableforExpenseAO();
		CC_Reusables.clickButton("Reserve Cancel");
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.ReasonisNotEditableforExpenseDCC();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
}
