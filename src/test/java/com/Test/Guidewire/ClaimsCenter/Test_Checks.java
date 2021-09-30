package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_Financials_Summary;
import com.pages.Guidewire.ClaimsCenter.CC_NewDocument;

public class Test_Checks extends GW_GetDriver {

	@Test

	public void AUT_CreateQuickCheck() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// search claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");

		// Prerequisite->upload documents
		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();

		//Click Financials-Summary
		Tab_Menu_Navigation.ccMenuNavigation("Financials Summary");

		CC_Financials_Summary.FinancialsSummary("Quick Check");
		
	}
}
