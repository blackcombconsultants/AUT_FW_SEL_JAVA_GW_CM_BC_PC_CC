package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewDocument;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_NewDocument extends GW_GetDriver {

	@Test
	public void AUT_NewDocument_CreateFromaTemplate_AcrobatSample() throws Throwable {
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ---------->adding create from template
		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_NewDocument.addCreateTemplate();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_NewDocument_CreateFromaTemplate_ExcelSample() throws Throwable {
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ---------->adding create from template
		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_NewDocument.addCreateTemplate();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_NewDocument_CreateFromaTemplate_GosuCSVSample() throws Throwable {
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ---------->adding create from template
		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_NewDocument.addCreateTemplate();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_NewDocument_CreateFromaTemplate_KYNoFaultApp1FCCI() throws Throwable {
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ---------->adding create from template
		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_NewDocument.addCreateTemplate();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void AUT_NewDocument_CreateFromaTemplate_UploadDocuments() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();

	}

	@Test
	public void AUT_NewDocument_CreateFromaTemplate_UploadDocuments_PDF() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_Txt() throws Throwable {

		// ------>Login to CliamCenter

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_PDF() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_BitmapImage() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_MicrosoftExcelWorksheet() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_GIFImage() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_HTML() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_JPEGImage() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_MPEGVideo() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_OpenXMLspreadsheet() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_PNGImage() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_OpenXMLpresentation() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_QuickTimeVideo() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_TiffImage() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_XML() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_MicrosoftAudio() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_OCTETStream() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_WaveAudio() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_NewDocument_UploadDocument_WordDocument() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Adding Documents
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_NewDocument.UploadDocuments();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewDocument.verifyDocument();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

}
