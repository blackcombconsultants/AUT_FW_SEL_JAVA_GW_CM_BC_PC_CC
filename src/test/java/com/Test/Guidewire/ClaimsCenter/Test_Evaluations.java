package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_Evaluation;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_Evaluations extends GW_GetDriver {
	@Test

	public void AUT_CreateNewEvaluation() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// search claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// Click Evaluations
		CC_Reusables.ccMenuNavigation("PlanofAction Evaluations");

		CC_Evaluation.CreateNewEvaluation();
		Thread.sleep(2000);
		CC_Evaluation.NE_LiabilityDistribution();
		CC_Evaluation.NE_EconomicDamages();
		CC_Evaluation.NE_PunitiveDamages();
		CC_Evaluation.NE_TotalValue();
		Thread.sleep(2000);
		CC_Evaluation.EvaluationsValidation();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test

	public void AUT_DeleteEvaluation() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// search claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// Click Evaluations
		CC_Reusables.ccMenuNavigation("PlanofAction Evaluations");

		CC_Evaluation.CreateNewEvaluation();
		Thread.sleep(2000);
		CC_Evaluation.NE_LiabilityDistribution();
		CC_Evaluation.NE_EconomicDamages();
		CC_Evaluation.NE_PunitiveDamages();
		CC_Evaluation.NE_TotalValue();
		Thread.sleep(2000);
		CC_Evaluation.EvaluationsValidation();
		CC_Evaluation.DeleteEvaluation();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

}
