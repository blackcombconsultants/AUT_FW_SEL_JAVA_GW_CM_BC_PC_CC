package com.Test.Guidewire.ClaimsCenter;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_Litigation;
import com.pages.Guidewire.ClaimsCenter.CC_Negotiations;

import org.testng.annotations.Test;

public class Test_Litigation extends GW_GetDriver {

	@Test

	public void AUT_CreateNewMatter() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// search claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");

		
		//Click Evaluations
		Tab_Menu_Navigation.ccMenuNavigation("Litigation");
		CC_Litigation.Litigation_Matter();
		Thread.sleep(2000);
		CC_Litigation.Litigation_NewMatter();
		
		
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}
	
	
}
