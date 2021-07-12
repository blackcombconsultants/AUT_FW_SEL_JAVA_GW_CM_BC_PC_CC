package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_AssignClaim;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_ClaimExposure;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_CloseClaim;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Contacts;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_CreateManualCheck;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_CreateRecovery;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Resuables;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_UploadDocuments;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Workplan;

public class GW_CC_FNOL_VerifiedPolicy extends GW_GetDriver {

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_AutomatedAssignclaim() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// --->Assigning Claim
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Assign Claim");
		ClaimCenter_Resuables.assignClaim();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_Newclaim_Auto() throws Throwable {

		// ------>Login to CliamCenter

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		/*
		 * // --->Assigning Claim
		 * 
		 * GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Assign Claim");
		 * ClaimCenter_Resuables.assignClaim();
		 * 
		 * // ---->Adding new contact
		 * 
		 * GW_CM_PC_BC_CC_TabNavigation.
		 * ccMenuNavigation("Parties Involved Contacts");
		 * ClaimCenter_Contacts.New_Contact();
		 * ClaimCenter_Contacts.NewContact_DuplicateContactFound_Verify();
		 * ClaimCenter_Resuables.clickButton("Update");
		 * 
		 * // ---->Adding new exposure
		 * 
		 * GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Medical Payments");
		 * ClaimCenter_Resuables.newExposure();
		 * 
		 * // ------>Adding Reserve
		 * 
		 * GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Reserve");
		 * ClaimCenter_Resuables.addingReserve();
		 * 
		 * // ----->Adding manual check
		 * 
		 * GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Manual Check");
		 * ClaimCenter_CreateManualCheck.Enterpayeeinformation();
		 * ClaimCenter_Resuables.clickButton("Next");
		 * ClaimCenter_CreateManualCheck.Enterpaymentinformation();
		 * ClaimCenter_Resuables.clickButton("Next");
		 * ClaimCenter_CreateManualCheck.Setcheckinstructions();
		 * ClaimCenter_Resuables.clickButton("Finish");
		 */

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_Newclaim_Auto_AutoFirstandFinal() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim Auto_AutoFirstandFinal
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_Newclaim_Auto_AutoFirstandFinal");

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_Newclaim_Auto_QuickClaimAuto() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim Auto_QuickClaimAuto
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_Newclaim_Auto_QuickClaimAuto");

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_PartiesInvolved_Contacts() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ---->Adding new contact
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Parties Involved Contacts");
		ClaimCenter_Contacts.New_Contact();
	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_PartiesInvolved_DuplicateContactsVerify() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ---->Adding new contact
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Parties Involved Contacts");
		ClaimCenter_Contacts.New_Contact();
		ClaimCenter_Contacts.NewContact_DuplicateContactFound_Verify();
	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_NewExposure_MedicalPayments() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");
		// ---->Adding new exposure
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Medical Payments");
		ClaimCenter_Resuables.newExposure();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_AddingReserve() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");
		// ------>Adding Reserve
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Reserve");
		ClaimCenter_Resuables.addingReserve();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_ManualAdjusterCheck_Create() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding manual check

		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Manual Check");
		ClaimCenter_CreateManualCheck.Enterpayeeinformation();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_CreateManualCheck.Enterpaymentinformation();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_CreateManualCheck.Setcheckinstructions();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_Recovery_CreateRecovery() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");
		// ------->Recovery

		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Recovery");
		ClaimCenter_CreateRecovery.createRecovery();
		ClaimCenter_Resuables.clickButton("Update");

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocuments() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocuments1() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_ClaimsExposure() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ------->Checking ChoosebyCoverageType_Exposure
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Choose by Coverage Type");

		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("C");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("D");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("E");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("L");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("M");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("P");

		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("R");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("T");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("U");

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_CloseClaim001() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ------>ClosingClaim without any expsosure and validating error
		// message
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Close Claim");
		ClaimCenter_CloseClaim.CloseClaim();
		ClaimCenter_CloseClaim.ValidationResults("WithOutExpsoure");
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Workplan");
		ClaimCenter_Workplan.workPlan();
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Close Claim");
		ClaimCenter_CloseClaim.CloseClaim();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_CloseClaim002() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ------>ClosingClaim without any expsosure and validating error
		// message
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Close Claim");
		ClaimCenter_CloseClaim.CloseClaim();
		ClaimCenter_CloseClaim.ValidationResults("WithOutExpsoure");

		// ------>Adding to exposure
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Choose by Coverage");
		ClaimCenter_ClaimExposure.ChoosebyCoverage_Collison();

		// ------>ClosingClaim with expsosure and validating error message
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Close Claim");
		ClaimCenter_CloseClaim.CloseClaim();
		ClaimCenter_CloseClaim.ValidationResults("WithExposure");

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_CloseClaim003() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		// ------>Creating New Claim
		ClaimCenter_Resuables.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ------>ClosingClaim without any expsosure and validating error
		// message
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Close Claim");
		ClaimCenter_CloseClaim.CloseClaim();
		ClaimCenter_CloseClaim.ValidationResults("WithOutExpsoure");

		// ------>Adding to exposure
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Choose by Coverage");
		ClaimCenter_ClaimExposure.ChoosebyCoverage_Collison();

		// ------>ClosingClaim with expsosure and validating error message
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Close Claim");
		ClaimCenter_CloseClaim.CloseClaim();
		ClaimCenter_CloseClaim.ValidationResults("WithExposure");

		// ----->Adding manual check

		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Check");
		ClaimCenter_CreateManualCheck.Enterpayeeinformation();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_CreateManualCheck.Enterpaymentinformation();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_CreateManualCheck.Setcheckinstructions();

		// ------>ClosingClaim with check and validating error message
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Close Claim");
		ClaimCenter_CloseClaim.CloseClaim();
		ClaimCenter_CloseClaim.ValidationResults("WithCheckPayment");
	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_AssignClaim_RoundRobin_LoadFactor100() throws Throwable

	{

		// Pre-requisite:
		// ------>Login to CliamCenter super user
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();
		// ----->Clicking on Administration Tab
		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("Administration UsersandSecurity Groups", "");
		// ------>Verify the groups
		ClaimCenter_AssignClaim.LoadFactor_VacationStatus_Edit();
		// ----->Login to ClaimCenter bbaker user
		GW_CM_PC_BC_CC_Login.login_Guidewire_Userx("Betty");

	}

}
