package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewDocument;

public class Test_NewDocument extends GW_GetDriver {

	@Test
	public void AUT_NewDocument_CreateFromaTemplate_AcrobatSample() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ---------->adding create from template
		Tab_Menu_Navigation.ccMenuNavigation("Create from a template");
		CC_NewDocument.addCreateTemplate();

		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_NewDocument_CreateFromaTemplate_ExcelSample() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ---------->adding create from template
		Tab_Menu_Navigation.ccMenuNavigation("Create from a template");
		CC_NewDocument.addCreateTemplate();

		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_NewDocument_CreateFromaTemplate_GosuCSVSample() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ---------->adding create from template
		Tab_Menu_Navigation.ccMenuNavigation("Create from a template");
		CC_NewDocument.addCreateTemplate();

		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_NewDocument_CreateFromaTemplate_KYNoFaultApp1FCCI() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ---------->adding create from template
		Tab_Menu_Navigation.ccMenuNavigation("Create from a template");
		CC_NewDocument.addCreateTemplate();

		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}
	@Test
	public void AUT_NewDocument_CreateFromaTemplate_UploadDocuments() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();

	}

	@Test
	public void AUT_NewDocument_CreateFromaTemplate_UploadDocuments_PDF() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_Txt() throws Throwable {

		// ------>Login to CliamCenter

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();

		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_PDF() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_BitmapImage() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_MicrosoftExcelWorksheet() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_GIFImage() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_HTML() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_JPEGImage() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_MPEGVideo() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_OpenXMLspreadsheet() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_PNGImage() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_OpenXMLpresentation() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_QuickTimeVideo() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_TiffImage() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_XML() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_MicrosoftAudio() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_OCTETStream() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_WaveAudio() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_WordDocument() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

}
