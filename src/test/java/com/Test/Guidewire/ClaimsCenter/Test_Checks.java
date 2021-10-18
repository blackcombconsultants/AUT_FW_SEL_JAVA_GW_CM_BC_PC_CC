package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_Financials_SetCheckDetails;
import com.pages.Guidewire.ClaimsCenter.CC_Financials_Summary;
import com.pages.Guidewire.ClaimsCenter.CC_NewDocument;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Resuables;

public class Test_Checks extends GW_GetDriver {

	@Test

	public void AUT_CreateQuickCheck() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// search claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");

		// Prerequisite->upload documents
		// ----->Adding Documents
		/*
		 * Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		 * CC_NewDocument.UploadDocuments();
		 * Tab_Menu_Navigation.ccMenuNavigation("Documents");
		 * CC_NewDocument.verifyDocument();
		 */

		//Click Financials-Summary
		Tab_Menu_Navigation.ccMenuNavigation("Financials Summary");

		CC_Financials_Summary.FinancialsSummaryAutoBodyUSD("Quick Check");
		CC_NewTransaction_Check.PrimaryPayee_AddJointPayees();
		CC_NewTransaction_Check.PaymentMethod();
		CC_NewTransaction_Check.TaxReporting();
		CC_NewTransaction_Check.Payment();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);
		CC_Financials_SetCheckDetails.SetCheckDetails("Quick Check");
		CC_Financials_SetCheckDetails.LinkDocumentButton();
		Thread.sleep(2000);
		CC_NewDocument.SelectDocuments();
		Thread.sleep(2000);
		CC_Financials_SetCheckDetails.SetCheckDetails("Quick Check");
		CC_Financials_SetCheckDetails.LinkedDocuments();
		ClaimCenter_Resuables.clickButton("Finish");
		Thread.sleep(2000);
		CC_NewTransaction_Check.FinancialsChecks();
		
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}
	@Test

	public void AUT_CreateManualCheck() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// search claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");


		//Click Financials-Summary
		Tab_Menu_Navigation.ccMenuNavigation("Financials Summary");

		CC_Financials_Summary.FinancialsSummaryAutoBodyUSD("Create Check");
		
		CC_NewTransaction_Check.PrimaryPayee_AddJointPayees();
		CC_NewTransaction_Check.PaymentMethod();
		CC_NewTransaction_Check.TaxReporting();
			
		ClaimCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);
		CC_NewTransaction_Check.Payment();
		
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);
		CC_Financials_SetCheckDetails.SetCheckDetails("Create Check");
		CC_Financials_SetCheckDetails.LinkDocumentButton();
		Thread.sleep(2000);
		CC_NewDocument.SelectDocuments();
		Thread.sleep(2000);
		CC_Financials_SetCheckDetails.SetCheckDetails("Create Check");
		CC_Financials_SetCheckDetails.LinkedDocuments();
		ClaimCenter_Resuables.clickButton("Finish");
		Thread.sleep(2000);
		CC_NewTransaction_Check.FinancialsChecks();
		
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}
}
