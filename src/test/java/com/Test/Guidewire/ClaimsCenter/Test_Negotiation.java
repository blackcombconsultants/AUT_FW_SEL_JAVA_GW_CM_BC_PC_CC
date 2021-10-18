package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_Evaluation;
import com.pages.Guidewire.ClaimsCenter.CC_Negotiations;

public class Test_Negotiation extends GW_GetDriver {
	
	@Test

	public void AUT_CreateNewNegotiation() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// search claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");

		
		//Click Evaluations
		Tab_Menu_Navigation.ccMenuNavigation("PlanofAction Negotiations");
		CC_Negotiations.Negotiation();
		CC_Negotiations.NewNegotiation();
		CC_Negotiations.ValidateNegotiation();
		
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}
	@Test

	public void AUT_DeleteNegotiation() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// search claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");

		
		//Click Evaluations
		Tab_Menu_Navigation.ccMenuNavigation("PlanofAction Negotiations");
		CC_Negotiations.Negotiation();
		CC_Negotiations.NewNegotiation();
		CC_Negotiations.ValidateNegotiation();
		
		CC_Negotiations.DeleteNegotiation();
		
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

}
