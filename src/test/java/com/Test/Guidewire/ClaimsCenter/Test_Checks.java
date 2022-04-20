package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_Financials_SetCheckDetails;
import com.pages.Guidewire.ClaimsCenter.CC_Financials_Summary;
import com.pages.Guidewire.ClaimsCenter.CC_NewDocument;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_Checks extends GW_GetDriver {

	@Test

	public void AUT_CreateQuickCheck() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// search claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// Prerequisite->upload documents
		// ----->Adding Documents
		/*
		 * CC_Resuables.ccMenuNavigation("Upload Documents"); CC_NewDocument.UploadDocuments(); CC_Resuables.ccMenuNavigation("Documents");
		 * CC_NewDocument.verifyDocument();
		 */

		// Click Financials-Summary
		CC_Reusables.ccMenuNavigation("Financials Summary");

		CC_Financials_Summary.FinancialsSummaryAutoBodyUSD("Quick Check");
		CC_NewTransaction_Check.PrimaryPayee_AddJointPayees();
		CC_NewTransaction_Check.PaymentMethod();
		CC_NewTransaction_Check.TaxReporting();
		CC_NewTransaction_Check.Payment();
		CC_Reusables.clickButton("Next");
		CC_Reusables.clickButton("Next");
		Thread.sleep(2000);
		CC_Financials_SetCheckDetails.SetCheckDetails("Quick Check");
		CC_Financials_SetCheckDetails.LinkDocumentButton();
		Thread.sleep(2000);
		CC_NewDocument.SelectDocuments();
		Thread.sleep(2000);
		CC_Financials_SetCheckDetails.SetCheckDetails("Quick Check");
		CC_Financials_SetCheckDetails.LinkedDocuments();
		CC_Reusables.clickButton("Finish");
		Thread.sleep(2000);
		CC_NewTransaction_Check.FinancialsChecks();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test

	public void AUT_CreateManualCheck() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// search claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		// Click Financials-Summary
		CC_Reusables.ccMenuNavigation("Financials Summary");

		CC_Financials_Summary.FinancialsSummaryAutoBodyUSD("Create Check");

		CC_NewTransaction_Check.PrimaryPayee_AddJointPayees();
		CC_NewTransaction_Check.PaymentMethod();
		CC_NewTransaction_Check.TaxReporting();

		CC_Reusables.clickButton("Next");
		Thread.sleep(2000);
		CC_NewTransaction_Check.Payment();

		CC_Reusables.clickButton("Next");
		CC_Reusables.clickButton("Next");
		Thread.sleep(2000);
		CC_Financials_SetCheckDetails.SetCheckDetails("Create Check");
		CC_Financials_SetCheckDetails.LinkDocumentButton();
		Thread.sleep(2000);
		CC_NewDocument.SelectDocuments();
		Thread.sleep(2000);
		CC_Financials_SetCheckDetails.SetCheckDetails("Create Check");
		CC_Financials_SetCheckDetails.LinkedDocuments();
		CC_Reusables.clickButton("Finish");
		Thread.sleep(2000);
		CC_NewTransaction_Check.FinancialsChecks();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
}
