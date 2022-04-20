package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_MaintainFileDocuments;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC97_MaintainFileDocuments {

	// Autor:Misba
	// Date: 10/01/2022
	// Description:To verify whether "Approved, Approving and Draft" values are Removed from the "Status" typelist in the "New Document" screen.
	@Test
	public void CC97_TC001_Approved_ApprovingAndDraftisRemovedfromStatus() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// create from a template
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_MaintainFileDocuments.NewDocument_ApprovedandApprovingisRemoved();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	// Autor:Misba
	// Date: 11/01/2022
	// Description:To verify whether "Approved, Approving and Draft" values are Removed from the "Status" typelist in the "Upload Documents" screen

	@Test
	public void CC97_TC002_UploadDocuments_ApprovedApprovingAndDraftisRemovedfromStatus_txt() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// upload documents
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_MaintainFileDocuments.UploadDocuments();
		CC_MaintainFileDocuments.UploadDocument_ApprovedandApprovingisRemoved();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	// Autor:Misba
	// Date: 11/01/2022
	// Description: To verify whether User is able to "create a new document template" without selecting a value for the "Section"
	@Test
	public void CC97_TC003_NewDocument_SectionisMandatorytoCreateFormATemplate() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// create from a template
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_MaintainFileDocuments.NewDocument_SectionisMandatorytoCreateFormATemplate();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

	// Autor:Misba
	// Date: 11/01/2022
	// Description:To verify whether User is able to "upload a document" without selecting a value for the "Section" field in the "Upload Documents"
	// screen
	@Test
	public void CC97_TC004_UploadDocuments_SectionisMandatorytoUploadDocuments() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// upload documents
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_MaintainFileDocuments.UploadDocuments();
		CC_MaintainFileDocuments.UploadDocuments_SectionisMandatorytoUploadDocuments();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	// Autor:Misba
	// Date: 11/01/2022
	// Description:To verify whether User is able to "create a new document template" without selecting a value for the "Document Type" field in the
	// "New Document" screen
	@Test
	public void CC97_TC005_NewDocument_DocumentTypeisMandatorytoCreateFormATemplate() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// create from a template
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_MaintainFileDocuments.NewDocument_DocumentTypeisMandatorytoCreateFormATemplate();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	// Autor:Misba
	// Date: 11/01/2022
	// Description:To verify whether User is able to "upload a document" without selecting a value for the "Document Type" field in the "Upload
	// Documents" screen
	@Test
	public void CC97_TC006_UploadDocuments_DocumentTypeisMandatorytoUploadDocuments() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Upload documents
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_MaintainFileDocuments.UploadDocuments();
		CC_MaintainFileDocuments.UploadDocuments_DocumentTypeisMandatorytoUploadDocuments();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	// Autor:Misba
	// Date: 11/01/2022
	// Description:To verify whether "Bermuda" is Added to the "Jurisdiction" typelist in the "Document Templates" screen
	@Test
	public void CC97_TC007_DocumentTemplates_BermudaisAddedintoJurisdictionTypeList() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// create from a template
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_MaintainFileDocuments.DocumentTemplates_BermudaisAddedintoJurisdictionTypeList();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	// Autor:Misba
	// Date: 13/01/2022
	// Description:select a value from the "Document Type" field, even by not selecting a value from "Section"
	@Test
	public void CC97_TC008_CreateFromTemplate_SectionShouldbeSelectForDocumentTypelist() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// create from a template
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_MaintainFileDocuments.CreateFormATemplate_SectionShouldbeSelectForDocumentTypelist();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	// Autor:Misba
	// Date: 13/01/2022
	// Description:To verify whether 'Section' is Renamed to 'Folder' in "Document Templates" screen
	@Test
	public void CC97_TC009_CreateFromTemplate_SectionShouldbeSelectForDocumentTypelist() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// create from a template
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_MaintainFileDocuments.DocumentTemplates_SectionisRenamedtoFolderinResultTable();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC97_TC010_CreateFromATemplate_SectionisRenamedToFolder() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// create from a template
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Create from a template");
		CC_MaintainFileDocuments.CreateFormATemplate_NewDocument_SectionisRenamedtoFolder();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	// Autor:Misba
	// Date: 13/01/2022
	// Description:To verify whether 'Section' is Renamed to 'Folder' in "Upload Documents" screen
	@Test
	public void CC97_TC011_UploadDocuments_SectionisRenamedtoFolderinTable() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// validate summary header
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Upload Documents");
		CC_MaintainFileDocuments.UploadDocuments();
		CC_MaintainFileDocuments.UploadDocuments_SectionisRenamedtoFolderinTable();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC97_TC012_DocumentProperties_SectionisRenamedtoFolder() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// validate summary header
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_MaintainFileDocuments.DocumentProperties_SectionIsRenamedToFolder();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC97_TC013_SectionisRenamedtoFolderinDocumentScreen() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// validate summary header
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_MaintainFileDocuments.Documents_SectionisRenamedtoFolder();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC97_TC014_SectionisRenamedtoFolderinNewDocumentScreen() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// validate summary header
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_MaintainFileDocuments.Documents_SectionisRenamedtoFolderinNewDocumentScreen();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC97_TC015_SectionisRenamedtoFolder() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// validate summary header
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Email");
		CC_MaintainFileDocuments.Email_SectionisRenamedtoFolder();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC97_TC016_DocumentProperties_DeleteSelectedAvailable() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// validate summary header
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_MaintainFileDocuments.Document_DeleteSelectedisAvailable();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC97_TC017_DocumentProperties_EditButtonisAddedandStatusisfinal() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// validate summary header
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_MaintainFileDocuments.DocumentProperties_EditButtonisAddedandStatusisfinal();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC97_TC020_DocumentProperties_FieldtypeisnotEditable() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Existing claim search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// validate summary header
		CC_MaintainFileDocuments.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Documents");
		CC_MaintainFileDocuments.DocumentProperties_FieldtypeisnotEditable();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

}
