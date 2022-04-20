package com.pages.Guidewire.ClaimsCenter;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_MaintainFileDocuments extends SeleniumWebDriver_Commands {
	public CC_MaintainFileDocuments(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By NewDocument_Header       = By.xpath("//div[@id='wsTabBar']//div[@class='gw-label' and text()='New Document']");
	private static By DocumentTemplates_Header = By.xpath("//div[@id='DocumentTemplateSearchPopup-DocumentTemplateSearchScreen-ttlBar']//div[@role='heading']");
	private static By DocumentTemplates_Folder = By.xpath("//div[contains(@id,'Section_Input')]//div[@class='gw-label']");

	private static By DocumentTemplates_ResultTableFolder = By.xpath("//td[contains(@id,'SectionHeader_Cell')]//div[contains(@id,'SectionHeader_inner')]//div[@class='gw-label' and text()='Folder']");

	private static By Summary_Header               = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By NewDocument_StatusTypelist   = By.xpath("//select[contains(@name,'DocumentDetailsEditInputSet-Status')]");
	private static By Email_Header                 = By.xpath("//div[@id='wsTabBar']//div[@class='gw-label' and text()='Email']");
	private static By Add_Button                   = By.xpath("//div[contains(@id,'AttachedDocumentsLV_tb-AddDocumentButton')]//div[@role='button']");
	private static By Documents_Folder             = By.xpath("//div[contains(@id,'DocumentExistenceDetailsInputSet-Section_Input')]//div[@class='gw-label']");
	private static By Attachments_Folder           = By.xpath("//div[contains(@id,'ClaimDocumentSearchDV-Section_Input')]//div[@class='gw-label']");
	private static By DocumentsProperties_Folder   = By.xpath("//div[contains(@id,'DocumentDetailsEditInputSet-Section_Input')]//div[@class='gw-label']");
	private static By Upload_StatusTypelist        = By.xpath("//select[contains(@name,'DocumentDetailsEditLV-0-Status')]");
	private static By Upload_Folder                = By.xpath("//select[contains(@name,'DocumentDetailsEditLV-0-Section')]");
	private static By Upload_DocumentType          = By.xpath("//select[contains(@name,'0-Type')]");
	private static By NewDocument_DocumentType     = By.xpath("//div[contains(@id,'DocumentDetailsEditInputSet-Type_Input')]");
	private static By Documents_FolderList         = By.xpath("//select[contains(@name,'DocumentDetailsEditInputSet-Section')]");
	private static By NewDocument_DocumentTypeList = By.xpath("//select[contains(@name,'DocumentDetailsEditInputSet-Type')]");
	private static By NewDocuments_Folder          = By.xpath("//div[contains(@id,'DocumentDetailsEditInputSet-Section_Input')]//div[@class='gw-label']");

	private static By NewDocument_Button          = By.xpath("//div[contains(@id,'DocumentsScreen-DocumentsLV_tb-AddDocuments')]//div[@role='button']");
	private static By IndicateExistingDocument    = By.xpath("//div[contains(@id,'ClaimNewDocumentMenuItemSet_IndicateExists')]//div[@role='menuitem']//div[@class='gw-label']");
	private static By Document_Header             = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By Document_Propertiesicon     = By.xpath("//div[contains(@id,'ViewPropertiesLink')]");
	private static By DocumentProperties_Header   = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By Edit_Button                 = By.xpath("//div[@id='DocumentDetailsPopup-DocumentDetailsScreen-Edit']//div[@role='button']");
	private static By DocumentProperties_FileType = By.xpath("//div[contains(@id,'DocumentDetailsEditInputSet-MimeType')]//div[@class='gw-label' and text()='Open XML word document']");
	private static By DocumentProperties_Status   = By.xpath("//div[contains(@id,'Status_Input')]//div[@class='gw-label' and text()='Status']");
	private static By DocumentProperties_Final    = By.xpath("//div[contains(@id,'Status_Input')]//div[@class='gw-label' and text()='Final']");
	private static By Document_Checkbox           = By.xpath("//div[contains(@id,'0-_Checkbox')]//input[@type='checkbox']");
	private static By DeleteSelected_Button       = By.xpath("//div[contains(@id,'RemoveDocuments')]//div[@role='button']");

	private static By UploadDocuments           = By.xpath("//div[@id='wsTabBar']//div[@class='gw-label']");
	private static By UploadDocuments_AddFiles1 = By.xpath("//div[contains(@id,'browseButton')]");

	private static By UploadDocuments_AddFiles = By.xpath("//input[contains(@id,'FileInput--file')]");
	private static By NewDocument_Searchicon   = By.xpath("//div[contains(@id,'SelectTemplatePicker')]//span[@class='gw-icon']");
	private static By NewDocument_Jurisdiction = By.xpath("//select[contains(@name,'JurisdictionState')]");

	public static void Validate_SummaryHeader() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", Summary_Header, "contains", "Summary");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Autor:Misba
	// Date: 10/01/2022
	// Description:To verify whether "Approved, Approving and Draft" values are Removed from the "Status" typelist in the "New Document" screen.
	public static void NewDocument_ApprovedandApprovingisRemoved() throws Throwable {
		String typeListValue1 = "Approved";
		String typeListValue2 = "Approving and Draft";
		try {

			GuidewireAutomate_Validation("Screen Header", NewDocument_Header, "equals", "New Document");
			String TypeValues = getOptions_Element(NewDocument_StatusTypelist);
			if (TypeValues.contains(typeListValue1) && TypeValues.contains(typeListValue2)) {
				oExtentTest.log(Status.FAIL, " Status TypeList " + typeListValue1 + " , " + typeListValue2 + "  is not Removed");
			} else {
				oExtentTest.log(Status.PASS, " Status TypeList " + typeListValue1 + " , " + typeListValue2 + "  is Removed");

			}
		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Autor:Misba
	// Date: 11/01/2022
	// Description:To verify whether "Approved, Approving and Draft" values are Removed from the "Status" typelist in the "Upload Documents" screen
	public static void UploadDocument_ApprovedandApprovingisRemoved() throws Throwable {
		String typeListValue1 = "Approved";
		String typeListValue2 = "Approving and Draft";
		try {
			String TypeValues = getOptions_Element(Upload_StatusTypelist);
			if (TypeValues.contains(typeListValue1) && TypeValues.contains(typeListValue2)) {
				oExtentTest.log(Status.FAIL, " Status TypeList " + typeListValue1 + " , " + typeListValue2 + "  is not Removed");
			} else {
				oExtentTest.log(Status.PASS, " Status TypeList " + typeListValue1 + " , " + typeListValue2 + "  is Removed");

			}
		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void CreateFormATemplate_NewDocument_SectionisRenamedtoFolder() throws Throwable {

		try {

			GuidewireAutomate_Validation("Screen Header", NewDocument_Header, "equals", "New Document");
			GuidewireAutomate_Validation("Section is Renamed to Folder in  Document screen", NewDocuments_Folder, "contains", "Folder");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Autor:Misba
	// Date: 11/01/2022
	// Description: To verify whether User is able to "create a new document template" without selecting a value for the "Section"
	public static void NewDocument_SectionisMandatorytoCreateFormATemplate() throws Throwable {

		try {

			GuidewireAutomate_Validation("Screen Header", NewDocument_Header, "equals", "New Document");
			GuidewireAutomate_Validation("Section is Mandatory to Create Form A Template", NewDocuments_Folder, "contains", "Folder");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Autor:Misba
	// Date: 11/01/2022
	// Description:To verify whether User is able to "create a new document template" without selecting a value for the "Document Type" field in the
	// "New Document" screen
	public static void NewDocument_DocumentTypeisMandatorytoCreateFormATemplate() throws Throwable {

		try {

			GuidewireAutomate_Validation("Screen Header", NewDocument_Header, "equals", "New Document");
			GuidewireAutomate_Validation("Document Type is Mandatory to Create Form A Template", NewDocument_DocumentType, "contains", "Document Type");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Autor:Misba
	// Date: 11/01/2022
	// Description:To verify whether User is able to "upload a document" without selecting a value for the "Section" field in the "Upload Documents"
	// screen
	public static void UploadDocuments_SectionisMandatorytoUploadDocuments() throws Throwable {

		try {
			GuidewireAutomate("Section is Mandatory to Upload Documents", Upload_Folder, "selectByVisibleText", "Correspondence");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Autor:Misba
	// Date: 11/01/2022
	// Description:To verify whether User is able to "upload a document" without selecting a value for the "Document Type" field in the "Upload
	// Documents" screen
	public static void UploadDocuments_DocumentTypeisMandatorytoUploadDocuments() throws Throwable {

		try {
			GuidewireAutomate("Section ", Upload_Folder, "selectByVisibleText", "Correspondence");
			getStaleElement("Section is Mandatory to Upload Documents", Upload_Folder);
			GuidewireAutomate("Document is Mandatory to Upload Documents", Upload_DocumentType, "selectByVisibleText", "Coverage");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Autor:Misba
	// Date: 13/01/2022
	// Description:To verify whether 'Section' is Renamed to 'Folder' in "Upload Documents" screen
	public static void UploadDocuments_SectionisRenamedtoFolderinTable() throws Throwable {

		try {
			GuidewireAutomate_Validation("Section is Renamed to Folder in UploadDocuments Search Result table", DocumentTemplates_ResultTableFolder, "contains", "Folder");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Autor:Misba
	// Date: 11/01/2022
	// Description:To verify whether "Bermuda" is Added to the "Jurisdiction" typelist in the "Document Templates" screen
	public static void DocumentTemplates_BermudaisAddedintoJurisdictionTypeList() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Documents");

			GuidewireAutomate_Validation("Screen Header", NewDocument_Header, "equals", "New Document");
			GuidewireAutomate("search icon", NewDocument_Searchicon, "clickAndwait", "click");
			GuidewireAutomate_Validation("Document Templates", DocumentTemplates_Header, "equals", "Document Templates");

			GuidewireAutomate("Bermuda is added in Jurisdiction", NewDocument_Jurisdiction, "selectByVisibleText", lhm_TestCase_Table_Data.get("Jurisdiction"));

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Autor:Misba
	// Date: 13/01/2022
	// Description:To verify whether 'Section' is Renamed to 'Folder' in "Document Templates" screen
	public static void DocumentTemplates_SectionisRenamedtoFolderinResultTable() throws Throwable {

		try {

			GuidewireAutomate_Validation("Screen Header", NewDocument_Header, "equals", "New Document");
			GuidewireAutomate("search icon", NewDocument_Searchicon, "clickAndwait", "click");
			GuidewireAutomate_Validation("Document Templates", DocumentTemplates_Header, "equals", "Document Templates");

			GuidewireAutomate_Validation("Section is Renamed to Folder in  DocumentTemplate screen", DocumentTemplates_Folder, "contains", "Folder");
			GuidewireAutomate_Validation("Section is Renamed to Folder in  DocumentTemplate Search Result table", DocumentTemplates_ResultTableFolder, "contains", "Folder");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}

	// Autor:Misba
	// Date: 11/01/2022
	// Description:To verify whether "Approved, Approving and Draft" values are Removed from the "Status" typelist in the "
	public static void UploadDocuments() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Documents");

		GuidewireAutomate_Validation("UploadDocuments", UploadDocuments, "equals", "Upload Documents");
		GuidewireAutomate("AddFiles1", UploadDocuments_AddFiles1, "clickAndwait", "click");
		String strFileType = lhm_TestCase_Table_Data.get("FileType");

		switch (strFileType) {
			case "txt" :
				fileUpload(pUploads + "GuidewireClaimCenter.pdf");
				break;

			default :
				throw new IOException("No support for FileType : " + strFileType);
		}

	}
	// Autor:Misba
	// Date: 11/01/2022
	// Description:To verify whether User is able to "create a new document template" without selecting a value for the "Document Type" field in the
	// "New Document" screen
	public static void CreateFormATemplate_SectionShouldbeSelectForDocumentTypelist() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Documents");

			GuidewireAutomate_Validation("Screen Header", NewDocument_Header, "equals", "New Document");
			GuidewireAutomate("Folder", Documents_FolderList, "selectByVisibleText", "<none>");
			GuidewireAutomate("Document Type", NewDocument_DocumentTypeList, "selectByVisibleText", "<none>");
			GuidewireAutomate_Validation("Screen Header", NewDocument_Header, "equals", "New Document");
			GuidewireAutomate("Folder should be selected for Typelist", Documents_FolderList, "selectByVisibleText", lhm_TestCase_Table_Data.get("Section"));
			getStaleElement("Folder should be selected for Typelist", Documents_FolderList);
			GuidewireAutomate("Document Type list selected", NewDocument_DocumentTypeList, "selectByVisibleText", lhm_TestCase_Table_Data.get("DocumentType1"));
		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Autor:Misba
	// Date: 11/01/2022
	public static void fileUpload(String strfilepath) throws AWTException {

		ClipboardOwner  oClipboardOwner  = null;
		Robot           oRobot           = new Robot();
		StringSelection oStringSelection = new StringSelection(strfilepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(oStringSelection, oClipboardOwner);
		oRobot.setAutoDelay(2000);

		oRobot.keyPress(KeyEvent.VK_CONTROL);
		oRobot.keyPress(KeyEvent.VK_V);

		oRobot.keyRelease(KeyEvent.VK_CONTROL);
		oRobot.keyRelease(KeyEvent.VK_V);

		oRobot.setAutoDelay(2000);

		oRobot.keyPress(KeyEvent.VK_ENTER);
		oRobot.keyRelease(KeyEvent.VK_ENTER);

	}
	public static void Email_SectionisRenamedtoFolder() throws Throwable {

		try {
			GuidewireAutomate_Validation("Email Header", Email_Header, "contains", "Email");
			GuidewireAutomate("Add", Add_Button, "clickAndwait", "click");
			GuidewireAutomate_Validation("Section is Renamed to Folder in New Attachments", Attachments_Folder, "contains", "Folder");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void Documents_SectionisRenamedtoFolderinNewDocumentScreen() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", Document_Header, "contains", "Documents");
			GuidewireAutomate("New Document Button", NewDocument_Button, "clickAndwait", "click");
			GuidewireAutomate("IndicationExistingDocument", IndicateExistingDocument, "clickAndwait", "click");

			GuidewireAutomate_Validation("Section is Renamed to Folder in New Document screen", Documents_Folder, "contains", "Folder");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void Documents_SectionisRenamedtoFolder() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", Document_Header, "contains", "Documents");

			GuidewireAutomate_Validation("Section is Renamed to Folder in  Document screen", Attachments_Folder, "contains", "Folder");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void DocumentProperties_FieldtypeisnotEditable() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", Document_Header, "contains", "Documents");
			GuidewireAutomate("View Document Icon", Document_Propertiesicon, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", DocumentProperties_Header, "contains", "Document Properties");
			GuidewireAutomate("Edit Button", Edit_Button, "clickAndwait", "click");
			getStaleElement("Edit Button", Edit_Button);
			WebElement FileType = getElement(DocumentProperties_FileType);

			if (FileType.isEnabled()) {
				oExtentTest.log(Status.PASS, "File Type is not Editable");
			} else {

				oExtentTest.log(Status.FAIL, "File Type is Editable");
			}

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void DocumentProperties_EditButtonisAddedandStatusisfinal() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", Document_Header, "contains", "Documents");
			GuidewireAutomate("View Document Icon", Document_Propertiesicon, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", DocumentProperties_Header, "contains", "Document Properties");
			GuidewireAutomate_Validation("Edit Button is Added", Edit_Button, "contains", "Edit");
			GuidewireAutomate_Validation("Document Properties Status", DocumentProperties_Status, "contains", "Status");
			GuidewireAutomate_Validation("Document Properties Status", DocumentProperties_Final, "contains", "Final");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void Document_DeleteSelectedisAvailable() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", Document_Header, "contains", "Documents");
			GuidewireAutomate("Document Checkbox", Document_Checkbox, "clickAndwait", "click");
			GuidewireAutomate_Validation("Delete Selected Button is Available", DeleteSelected_Button, "contains", "Delete Selected");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void DocumentProperties_SectionIsRenamedToFolder() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", Document_Header, "contains", "Documents");
			GuidewireAutomate("View Document Icon", Document_Propertiesicon, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", DocumentProperties_Header, "contains", "Document Properties");
			GuidewireAutomate_Validation("Section is Renamed to Folder in  Document Properties screen", DocumentsProperties_Folder, "contains", "Folder");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
}
