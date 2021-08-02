package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_UploadDocuments;

public class GW_CC_UploadDocument {

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_Txt() throws Throwable {

		// ------>Login to CliamCenter

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();

		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_PDF() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_BitmapImage() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_MicrosoftExcelWorksheet() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_GIFImage() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_HTML() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_JPEGImage() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_MPEGVideo() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_OpenXMLspreadsheet() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_PNGImage() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_OpenXMLpresentation() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_QuickTimeVideo() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_TiffImage() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_XML() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_MicrosoftAudio() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_OCTETStream() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_WaveAudio() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PA_CC_FNOL_VerifiedPolicy_UploadDocument_WordDocument() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "VerifiedPolicy_NewclaimAuto");

		// ----->Adding Documents
		Tab_Menu_Navigation.ccMenuNavigation("Upload Documents");
		ClaimCenter_UploadDocuments.UploadDocuments();
		Tab_Menu_Navigation.ccMenuNavigation("Documents");
		ClaimCenter_UploadDocuments.verifyDocument();
		// ----->Logout ClaimCenter
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

}
