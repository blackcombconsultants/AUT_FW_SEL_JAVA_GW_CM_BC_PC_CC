package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_CreateManualCheck;
import com.pages.Guidewire.ClaimsCenter.CC_CreateRecovery;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reserve;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_NewTransaction extends GW_GetDriver {

	@Test
	public void AUT_NewTransaction_Reserve() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ------>Adding Reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.addingReserve();

	}

	@Test
	public void AUT_NewTransaction_Check() throws Throwable {

	}

	@Test
	public void AUT_NewTransaction_ManualCheck() throws Throwable {
		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding manual check

		CC_Reusables.ccMenuNavigation("Manual Check");
		CC_CreateManualCheck.Enterpayeeinformation();
		CC_Reusables.clickButton("Next");
		CC_CreateManualCheck.Enterpaymentinformation();
		CC_Reusables.clickButton("Next");
		CC_Reusables.clickButton("Next");
		CC_CreateManualCheck.Setcheckinstructions();

	}

	@Test
	public void AUT_NewTransaction_Recovery() throws Throwable {
		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ------->Recovery

		CC_Reusables.ccMenuNavigation("Recovery");
		CC_CreateRecovery.createRecovery();
		CC_Reusables.clickButton("Update");

	}

	@Test
	public void AUT_NewTransaction_RecoveryReserve() throws Throwable {

	}

}
