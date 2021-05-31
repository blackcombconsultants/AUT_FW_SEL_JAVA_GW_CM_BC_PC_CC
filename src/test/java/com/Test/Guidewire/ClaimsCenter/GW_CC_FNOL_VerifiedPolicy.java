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

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_Newclaim_Auto_01() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter();

		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("NewClaim", "NA");
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

		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("Claim Search", "");

		// --->Assigning Claim
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Assign Claim");
		ClaimCenter_Resuables.assignClaim();

		// ---->Adding new exposure
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Medical Payments");
		ClaimCenter_Resuables.newExposure();

		// ---->Adding new contact
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Contacts");
		ClaimCenter_Contacts.New_Contact();

		// ------>Adding Reserve
		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Reserve");
		ClaimCenter_Resuables.addingReserve();

		// ----->Adding manual check

		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Manual Check");
		ClaimCenter_CreateManualCheck.Enterpayeeinformation();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_CreateManualCheck.Enterpaymentinformation();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_CreateManualCheck.Setcheckinstructions();
		ClaimCenter_Resuables.clickButton("Finish");

		// ------->Recovery

		GW_CM_PC_BC_CC_TabNavigation.ccMenuNavigation("Recovery");
		ClaimCenter_CreateRecovery.createRecovery();
		ClaimCenter_Resuables.clickButton("Update");

	}

}
