package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.CC_ClaimActions;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewDocument;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.CC_ReopenClaim;
import com.pages.Guidewire.ClaimsCenter.CC_Reserve;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_Workplan;

public class Smoke_Test extends GW_GetDriver {

	@Test
	public void ClaimE2EProcess() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		CC_NewClaimWizard.fnolProcess("New Claim", "Assign");

		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_ClaimActions.LossDetails();
		CC_ClaimActions.LossDetailsInformation();

		CC_Reusables.ccMenuNavigation("Policy Level Coverage Excess Casualty");
		CC_ChooseCoverage.CreateNewExposure();
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.CreateReserve_ClaimCostAndExpenceDCC();

		CC_Reusables.ccMenuNavigation("Assign Claim");
		CC_ClaimActions.AssignClaim();

		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_NewDocument.addCreateTemplate();
		Thread.sleep(2000);
		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_Reusables.clickButton("Next");
		Thread.sleep(2000);
		CC_NewTransaction_Check.EPI_PolicyDetails_VerifyCurrencyOptions();
		CC_Reusables.clickButton("Next");
		CC_NewTransaction_Check.Setcheckinstructions();
		CC_NewDocument.linkDocument();
		CC_NewDocument.SelectDocuments();
		CC_Reusables.clickButton("Finish");
		Thread.sleep(2000);
		// Step9 : Choose to complete workplan activities
		CC_Reusables.ccMenuNavigation("Workplan");
		CC_Workplan.workPlan();

		CC_Reusables.ccMenuNavigation("Exposures");
		CC_ChooseCoverage.CloseExposure(1);

		CC_Reusables.ccMenuNavigation("Close Claim");
		CC_ClaimActions.CloseClaim();

		CC_Reusables.ccMenuNavigation("Reopen Claim");
		CC_ReopenClaim.ReopenClaim();
		// Logout
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void HealthTest() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("migration");
		// Logout
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void SanityTest() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Logout
		CC_Reusables.logout_ClaimsCenter();

	}

}
