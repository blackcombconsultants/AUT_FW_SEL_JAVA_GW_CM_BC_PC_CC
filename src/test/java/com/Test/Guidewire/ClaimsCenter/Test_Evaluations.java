package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_Evaluation;
import com.pages.Guidewire.ClaimsCenter.CC_Financials_SetCheckDetails;
import com.pages.Guidewire.ClaimsCenter.CC_Financials_Summary;
import com.pages.Guidewire.ClaimsCenter.CC_NewDocument;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Resuables;

public class Test_Evaluations extends GW_GetDriver {
	@Test

	public void AUT_CreateNewEvaluation() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// search claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");

		
		//Click Evaluations
		Tab_Menu_Navigation.ccMenuNavigation("PlanofAction Evaluations");
		
		CC_Evaluation.CreateNewEvaluation();
		Thread.sleep(2000);
		CC_Evaluation.NE_LiabilityDistribution();
		CC_Evaluation.NE_EconomicDamages();
		CC_Evaluation.NE_PunitiveDamages();
		CC_Evaluation.NE_TotalValue();
		Thread.sleep(2000);
		CC_Evaluation.EvaluationsValidation();
		
		
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}
	@Test

	public void AUT_DeleteEvaluation() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// search claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");

		
		//Click Evaluations
		Tab_Menu_Navigation.ccMenuNavigation("PlanofAction Evaluations");
		
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
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

}
