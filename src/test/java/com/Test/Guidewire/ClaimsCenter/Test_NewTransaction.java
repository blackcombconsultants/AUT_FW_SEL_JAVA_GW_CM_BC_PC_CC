package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_CreateManualCheck;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_CreateRecovery;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Resuables;

public class Test_NewTransaction extends GW_GetDriver {

	@Test
	public void AUT_NewTransaction_Reserve() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "NewclaimAuto");
		// ------>Adding Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");
		ClaimCenter_Resuables.addingReserve();

	}

	@Test
	public void AUT_NewTransaction_Check() throws Throwable {

	}

	@Test
	public void AUT_NewTransaction_ManualCheck() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "NewclaimAuto");

		// ----->Adding manual check

		Tab_Menu_Navigation.ccMenuNavigation("Manual Check");
		ClaimCenter_CreateManualCheck.Enterpayeeinformation();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_CreateManualCheck.Enterpaymentinformation();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_CreateManualCheck.Setcheckinstructions();

	}

	@Test
	public void AUT_NewTransaction_Recovery() throws Throwable {
		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "NewclaimAuto");
		// ------->Recovery

		Tab_Menu_Navigation.ccMenuNavigation("Recovery");
		ClaimCenter_CreateRecovery.createRecovery();
		ClaimCenter_Resuables.clickButton("Update");

	}

	@Test
	public void AUT_NewTransaction_RecoveryReserve() throws Throwable {

	}

}
