package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Resuables;

public class Test_ClaimActions_AssignClaim_FNOLVerifiedPolicy extends GW_GetDriver {

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_AutomatedAssignclaim() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "NewclaimAuto");

		// --->Assigning Claim
		Tab_Menu_Navigation.ccMenuNavigation("Assign Claim");
		ClaimCenter_Resuables.assignClaim();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_Newclaim_Auto() throws Throwable {

		// ------>Login to CliamCenter

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "NewclaimAuto");

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
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim Auto_AutoFirstandFinal
		CC_NewClaimWizard.assignClaimProcess("New Claim", "Newclaim_Auto_AutoFirstandFinal");

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_Newclaim_Auto_QuickClaimAuto() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim Auto_QuickClaimAuto
		CC_NewClaimWizard.assignClaimProcess("New Claim", "Newclaim_Auto_QuickClaimAuto");

	}

}
