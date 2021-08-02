package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_CreateFromATemplate;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_UploadDocuments;

public class Test_NewDocument extends GW_GetDriver {

	@Test
	public void AUT_PA_CC_CreateFromaTemplate_DocumentTemplate_AcrobatSample() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");

		// ---------->adding create from template
		Tab_Menu_Navigation.ccMenuNavigation("Create from a template");
		ClaimCenter_CreateFromATemplate.addCreateTemplate();

	}

	@Test
	public void AUT_PA_CC_CreateFromaTemplate_DocumentTemplate_ExcelSample() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");

		// ---------->adding create from template
		Tab_Menu_Navigation.ccMenuNavigation("Create from a template");
		ClaimCenter_CreateFromATemplate.addCreateTemplate();

	}

	@Test
	public void AUT_PA_CC_CreateFromaTemplate_DocumentTemplate_GosuCSVSample() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");

		// ---------->adding create from template
		Tab_Menu_Navigation.ccMenuNavigation("Create from a template");
		ClaimCenter_CreateFromATemplate.addCreateTemplate();

	}

	@Test
	public void AUT_PA_CC_CreateFromaTemplate_DocumentTemplate_KYNoFaultApp1FCCI() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");

		// ---------->adding create from template
		Tab_Menu_Navigation.ccMenuNavigation("Create from a template");
		ClaimCenter_CreateFromATemplate.addCreateTemplate();

	}
	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocuments() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocuments_PDF() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();

	}

}
