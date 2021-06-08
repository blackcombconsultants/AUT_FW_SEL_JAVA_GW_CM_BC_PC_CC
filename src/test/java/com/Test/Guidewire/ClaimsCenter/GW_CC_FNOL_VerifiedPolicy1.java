package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_AddClaimInformation;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_BasicInformation;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Contacts;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_CreateManualCheck;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_CreateRecovery;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Resuables;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_SearchPolicy;

public class GW_CC_FNOL_VerifiedPolicy extends GW_GetDriver {

	@Test()
	public void AUT_PA_CC_FNOL_VerifiedPolicy_Assignclaim() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA");
		ClaimCenter_SearchPolicy.fnol_Search_Exitsing_Policy();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_BasicInformation.basicInfo();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_AddClaimInformation.addClaimInfo();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.services();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.saveandAssign();
		ClaimCenter_Resuables.clickButton("Finish");
		ClaimCenter_Resuables.newClaimSaved();

		// --->Assigning Claim
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Assign Claim");
		ClaimCenter_Resuables.assignClaim();

	}

	@Test()
	public void AUT_PA_CC_FNOL_VerifiedPolicy_Newclaim_Auto() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA");
		ClaimCenter_SearchPolicy.fnol_Search_Exitsing_Policy();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_BasicInformation.basicInfo();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_AddClaimInformation.addClaimInfo();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.services();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.saveandAssign();
		ClaimCenter_Resuables.clickButton("Finish");
		ClaimCenter_Resuables.newClaimSaved();

	}

	@Test()
	public void AUT_PA_CC_FNOL_VerifiedPolicy_Newclaim_Auto_AutoFirstandFinal() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA");
		ClaimCenter_SearchPolicy.fnol_Search_Exitsing_Policy();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.NewClaim_AutoFirstandFinal();
		ClaimCenter_Resuables.clickButton("Finish");
		ClaimCenter_Resuables.DuplicateClaims_Verify();
		ClaimCenter_Resuables.clickButton("Finish");
		ClaimCenter_Resuables.newClaimSaved();

	}

	@Test()
	public void AUT_PA_CC_FNOL_VerifiedPolicy_Newclaim_Auto_QuickClaimAuto() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA");
		ClaimCenter_SearchPolicy.fnol_Search_Exitsing_Policy();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.New_QuickClaimAuto();
		ClaimCenter_Resuables.clickButton("Finish");
		ClaimCenter_Resuables.DuplicateClaims_Verify();
		ClaimCenter_Resuables.clickButton("Finish");
		ClaimCenter_Resuables.newClaimSaved();

	}

	@Test()
	public void AUT_PA_CC_FNOL_VerifiedPolicy_PartiesInvolved_Contacts() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		
		
		/*
		 * GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA"); //
		 * ClaimCenter_SearchPolicy.fnol_Search_Exitsing_Policy(); //
		 * ClaimCenter_Resuables.clickButton("Next"); //
		 * ClaimCenter_BasicInformation.basicInfo(); //
		 * ClaimCenter_Resuables.clickButton("Next"); //
		 * ClaimCenter_AddClaimInformation.addClaimInfo(); //
		 * ClaimCenter_Resuables.clickButton("Next"); //
		 * ClaimCenter_Resuables.services(); //
		 * ClaimCenter_Resuables.clickButton("Next"); //
		 * ClaimCenter_Resuables.saveandAssign(); //
		 * ClaimCenter_Resuables.clickButton("Finish"); //
		 * ClaimCenter_Resuables.newClaimSaved(); //
		 */		 		
		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("Claim Search", "");

		// ---->Adding new contact
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Parties Involved Contacts");
		ClaimCenter_Contacts.New_Contact();
	}

	@Test()
	public void AUT_PA_CC_FNOL_VerifiedPolicy_PartiesInvolved_DuplicateContactsVerify() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA");
		ClaimCenter_SearchPolicy.fnol_Search_Exitsing_Policy();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_BasicInformation.basicInfo();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_AddClaimInformation.addClaimInfo();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.services();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.saveandAssign();
		ClaimCenter_Resuables.clickButton("Finish");
		ClaimCenter_Resuables.newClaimSaved();

		// GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("Claim Search","");

		// ---->Adding new contact
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Parties Involved Contacts");
		ClaimCenter_Contacts.New_Contact();
		ClaimCenter_Contacts.NewContact_DuplicateContactFound_Verify();
	}

	@Test()
	public void AUT_PA_CC_FNOL_VerifiedPolicy_NewExposure_MedicalPayments() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		
		
		  GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA"); //
		  ClaimCenter_SearchPolicy.fnol_Search_Exitsing_Policy(); //
		  ClaimCenter_Resuables.clickButton("Next"); //
		  ClaimCenter_BasicInformation.basicInfo(); //
		  ClaimCenter_Resuables.clickButton("Next"); //
		  ClaimCenter_AddClaimInformation.addClaimInfo(); //
		  ClaimCenter_Resuables.clickButton("Next"); //
		  ClaimCenter_Resuables.services(); //
		  ClaimCenter_Resuables.clickButton("Next"); //
		  ClaimCenter_Resuables.saveandAssign(); //
		  ClaimCenter_Resuables.clickButton("Finish"); //
		  ClaimCenter_Resuables.newClaimSaved();
		 
		 
		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("Claim Search", "");

		// ---->Adding new exposure
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Medical Payments");
		ClaimCenter_Resuables.newExposure();

	}
	@Test()
	public void AUT_PA_CC_FNOL_VerifiedPolicy_AddingReserve() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		
		  GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA"); //
		  ClaimCenter_SearchPolicy.fnol_Search_Exitsing_Policy(); //
		  ClaimCenter_Resuables.clickButton("Next"); //
		  ClaimCenter_BasicInformation.basicInfo(); //
		  ClaimCenter_Resuables.clickButton("Next"); //
		  ClaimCenter_AddClaimInformation.addClaimInfo(); //
		  ClaimCenter_Resuables.clickButton("Next"); //
		  ClaimCenter_Resuables.services(); //
		  ClaimCenter_Resuables.clickButton("Next"); //
		  ClaimCenter_Resuables.saveandAssign(); //
		  ClaimCenter_Resuables.clickButton("Finish"); //
		  ClaimCenter_Resuables.newClaimSaved();
		 
		// ------>Adding Reserve
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Reserve");
		ClaimCenter_Resuables.addingReserve();

	}
	@Test()
	public void AUT_PA_CC_FNOL_VerifiedPolicy_ManualAdjusterCheck_Create() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		
		
		  GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA"); //
		  ClaimCenter_SearchPolicy.fnol_Search_Exitsing_Policy(); //
		  ClaimCenter_Resuables.clickButton("Next"); //
		  ClaimCenter_BasicInformation.basicInfo(); //
		  ClaimCenter_Resuables.clickButton("Next"); //
		  ClaimCenter_AddClaimInformation.addClaimInfo(); //
		  ClaimCenter_Resuables.clickButton("Next"); //
		  ClaimCenter_Resuables.services(); //
		  ClaimCenter_Resuables.clickButton("Next"); //
		  ClaimCenter_Resuables.saveandAssign(); //
		  ClaimCenter_Resuables.clickButton("Finish"); //
		  ClaimCenter_Resuables.newClaimSaved();
		 
		 
		// ----->Adding manual check
		

		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Manual Check");
		ClaimCenter_CreateManualCheck.Enterpayeeinformation();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_CreateManualCheck.Enterpaymentinformation();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_CreateManualCheck.Setcheckinstructions();
		ClaimCenter_Resuables.clickButton("Finish");

	}
	@Test()
	public void AUT_PA_CC_FNOL_VerifiedPolicy_Recovery_CreateRecovery() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		
		  GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("New Claim", "NA");
		  ClaimCenter_SearchPolicy.fnol_Search_Exitsing_Policy();
		  ClaimCenter_Resuables.clickButton("Next");
		  ClaimCenter_BasicInformation.basicInfo();
		  ClaimCenter_Resuables.clickButton("Next");
		  ClaimCenter_AddClaimInformation.addClaimInfo();
		  ClaimCenter_Resuables.clickButton("Next");
		  ClaimCenter_Resuables.services();
		  ClaimCenter_Resuables.clickButton("Next");
		  ClaimCenter_Resuables.saveandAssign();
		  ClaimCenter_Resuables.clickButton("Finish");
		  ClaimCenter_Resuables.newClaimSaved();
		 

		// ------->Recovery

		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Recovery");
		ClaimCenter_CreateRecovery.createRecovery();
		ClaimCenter_Resuables.clickButton("Update");

	}

}
