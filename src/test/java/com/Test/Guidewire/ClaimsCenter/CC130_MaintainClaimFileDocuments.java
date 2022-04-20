package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_NewDocument;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC130_MaintainClaimFileDocuments {

	@Test
	public void CC130_TC001_VerifyDocumentSectionTypeList() throws Throwable {
		// Step1 : User Logs into GW CC as an SuperUser
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_NewDocument.ND_VerifyNewDocumentSectionTypelist();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC130_TC002_VerifyDocument() throws Throwable {
		// Step1 : User Logs into GW CC as an SuperUser
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_NewDocument.ND_VerifyNewDocumentSectionTypelist();
		CC_NewDocument.ND_VerifyNewDocumentSectionAndDocumentTypelist();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC130_TC003_VerifyStaticMessageInDocumentPage() throws Throwable {
		// Step1 : User Logs into GW CC as an SuperUser
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.VerifyStaticMessage();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
}
