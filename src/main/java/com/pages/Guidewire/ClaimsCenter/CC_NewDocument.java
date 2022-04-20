package com.pages.Guidewire.ClaimsCenter;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC_NewDocument extends SeleniumWebDriver_Commands {

	public CC_NewDocument(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By UploadDocuments           = By.xpath("//div[@id='wsTabBar']//div[@class='gw-label']");
	private static By UploadDocuments_AddFiles1 = By.xpath("//div[contains(@id,'browseButton')]");
	private static By UploadDocuments_AddFiles  = By.xpath("//input[contains(@id,'FileInput--file')]");

	private static By UploadDocuments_Name         = By.xpath("//input[contains(@name,'Name')]");
	private static By UploadDocuments_Description  = By.xpath("//input[contains(@name,'Description')]");
	private static By UploadDocuments_FileType     = By.xpath("//select[contains(@name,'DocType')]");
	private static By UploadDocuments_Language     = By.xpath("//select[contains(@name,'Language')]");
	private static By UploadDocuments_Folder       = By.xpath("//select[contains(@name,'Section')]");
	private static By UploadDocuments_RelatedTo    = By.xpath("//select[contains(@name,'RelatedTo')]");
	private static By UploadDocuments_Author       = By.xpath("//input[contains(@name,'Author')]");
	private static By UploadDocuments_Recipient    = By.xpath("//input[contains(@name,'Recipient')]");
	private static By UploadDocuments_Status       = By.xpath("//select[contains(@name,'Status')]");
	private static By UploadDocuments_SecurityType = By.xpath("//select[contains(@name,'SecurityType')]");
	private static By UploadDocuments_DocumentType = By.xpath("//select[contains(@name,'DocumentDetailsEditLV-0-Type')]");
	private static By UploadDocuments_Update       = By.xpath("//div[contains(@id,'CustomUpdate')]/div[@role='button']");

	private static By Documents_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Documents']");
	private static By Documents_Name   = By.xpath("//div[contains(@id,'NameLink')]");
	private static By Documents_Type   = By.xpath("//td[contains(@id,'Type_Cell')]//div[@class='gw-label']");
	private static By Documents_Status = By.xpath("//td[contains(@id,'Status_Cell')]//div[@class='gw-label']");

	private static By NewDocument_Header = By.xpath("//div[@id='wsTabBar']//div[@class='gw-label' and text()='New Document']");

	private static By DT_SearchIcon            = By.xpath("//div[contains(@id,'SelectTemplatePicker')]");
	private static By DocumentTemplates_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Document Templates']");
	private static By DT_Type                  = By.xpath("//select[contains(@name, 'DocumentTemplateSearchDV-TemplateType')]");
	private static By DT_LineOfBusiness        = By.xpath("//select[contains(@name, 'DocumentTemplateSearchDV-LossType')]");
	private static By DT_Jurisdiction          = By.xpath("//select[contains(@name, 'DocumentTemplateSearchDV-JurisdictionState')]");
	private static By DT_Folder                = By.xpath("//select[contains(@name, 'DocumentTemplateSearchDV-Section')]");
	private static By DT_Keywords              = By.xpath("//input[contains(@name, 'DocumentTemplateSearchDV-Keywords')]");
	private static By DT_Date                  = By.xpath("//input[contains(@name, 'DocumentTemplateSearchDV-EffectiveDate')]");
	private static By DT_Identifier            = By.xpath("//input[contains(@name, 'DocumentTemplateSearchDV-Identifier')]");

	private static By DT_Search = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	private static By DT_Reset  = By.xpath("//div[contains(@id,'SearchLinksInputSet-Reset')]");

	// Document Contents

	private static By DC_Name        = By.xpath("//input[contains(@name, 'DocumentDetailsEditInputSet-Name')]");
	private static By DC_Description = By.xpath("//input[contains(@name, 'DocumentDetailsEditInputSet-Description')]");
	private static By DC_FileType    = By.xpath("//input[contains(@name, 'DocumentDetailsEditInputSet-MimeType')]");
	private static By DC_Author      = By.xpath("//input[contains(@name, 'DocumentDetailsEditInputSet-Author')]");
	private static By DC_Recipient   = By.xpath("//input[contains(@name, 'DocumentDetailsEditInputSet-Recipient')]");

	private static By DC_Folder       = By.xpath("//select[contains(@name, 'DocumentDetailsEditInputSet-Section')]");
	private static By DC_RelatedTo    = By.xpath("//select[contains(@name, 'DocumentDetailsEditInputSet-RelatedTo')]");
	private static By DC_Status       = By.xpath("//select[contains(@name, 'DocumentDetailsEditInputSet-Status')]");
	private static By DC_SecurityType = By.xpath("//select[contains(@name, 'DocumentDetailsEditInputSet-SecurityType')]");
	private static By DC_DocumentType = By.xpath("//select[contains(@name, 'DocumentDetailsEditInputSet-Type')]");

	private static By NewDocument_Select_AcrobatSample = By
			.xpath("//div[@class='gw-value-readonly-wrapper' and text()='Acrobat Sample']/ancestor::td[contains(@id,'Template_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");
	private static By NewDocument_Select_ExcelSample   = By
			.xpath("//div[@class='gw-value-readonly-wrapper' and text()='Excel Sample']/ancestor::td[contains(@id,'Template_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");
	private static By NewDocument_Select_GosuCSVSample = By
			.xpath("//div[@class='gw-value-readonly-wrapper' and text()='Gosu CSV Sample']/ancestor::td[contains(@id,'Template_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");
	private static By NewDocument_Select_KYSample      = By
			.xpath("//div[@class='gw-value-readonly-wrapper' and text()='KY No Fault App 1-03 - FCCI']/ancestor::td[contains(@id,'Template_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");

	private static By DC_CreateDocument = By.xpath("//div[contains(@id,'DocumentCreationInputSet-CreateDocument')]/div[@role='button']");

	private static By ND_Update = By.xpath("//div[contains(@id,'NewDocumentFromTemplate_CustomUpdate')]");

	// Link Document
	private static By LinkDocument_Button = By.xpath("//div[contains(@id,'Button_Reserve_LinkDocument')]/div[@role='button']");

	private static By FilterDocumentsHeader = By.xpath("//div[contains(@id,'Claim_DocumentsScreen')]//div[@role='heading' and text()='Filter Documents']");
	private static By FD_RelatedTo          = By.xpath("//select[contains(@name,'ClaimDocumentSearchDV-RelatedTo')]");
	private static By FD_Status             = By.xpath("//select[contains(@name,'ClaimDocumentSearchDV-Status')]");
	private static By FD_Folder             = By.xpath("//select[contains(@name,'ClaimDocumentSearchDV-Section')]");
	private static By FD_Author             = By.xpath("//input[contains(@name,'ClaimDocumentSearchDV-Author')]");
	private static By FD_Name               = By.xpath("//input[contains(@name,'ClaimDocumentSearchDV-NameOrID')]");

	private static By SearchButton = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	private static By SelectButton = By.xpath("//div[contains(@id,'PickExistingDocumentsLV-0-_Select')]//div[@role='button']");

	private static By FDS_Name         = By.xpath("//div[contains(@id,'PickExistingDocumentsLV-0-Name')]//div[@class='gw-value-readonly-wrapper']");
	private static By FDS_RelatedTo    = By.xpath("//div[contains(@id,'PickExistingDocumentsLV-0-RelatedTo')]//div[@class='gw-value-readonly-wrapper']");
	private static By FDS_DocumentType = By.xpath("//div[contains(@id,'PickExistingDocumentsLV-0-Type')]//div[@class='gw-label']");
	private static By FDS_Status       = By.xpath("//div[contains(@id,'PickExistingDocumentsLV-0-Status')]//div[@class='gw-label']");
	private static By FDS_Author       = By.xpath("//div[contains(@id,'PickExistingDocumentsLV-0-Author')]//div[@class='gw-value-readonly-wrapper']");
	private static By FDS_Uploaded     = By.xpath("//div[contains(@id,'PickExistingDocumentsLV-0-DateModified')]//div[@class='gw-value-readonly-wrapper']");

	private static By NewDocumentType = By.xpath("//select[contains(@name,'DocumentDetailsEditInputSet-Type')]");

	private static By DocumentAlertMessage = By.xpath("//div[contains(@id,'DocumentsScreen-Message_Ext')]//div[@class='gw-AlertBar--label']");

	// private static By Inputfile = By.id("ClaimNewDocumentLinkedWorksheet-UploadDocumentScreen-FileInput--file");
	private static By Inputfile = By.cssSelector("input[id='ClaimNewDocumentLinkedWorksheet-UploadDocumentScreen-FileInput--file'][type='file']");

	/*
	 * 
	 */
	public static void addCreateTemplate() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Documents");

		GuidewireAutomate_Validation("Screen Header", NewDocument_Header, "equals", "New Document");

		GuidewireAutomate("Search", DT_SearchIcon, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", DocumentTemplates_Header, "equals", "Document Templates");

		GuidewireAutomate("Type", DT_Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("Type"));
		GuidewireAutomate("LineOfBusiness", DT_LineOfBusiness, "selectByVisibleText", lhm_TestCase_Table_Data.get("LineOfBusiness"));
		GuidewireAutomate("Jurisdiction", DT_Jurisdiction, "selectByVisibleText", lhm_TestCase_Table_Data.get("Jurisdiction"));
		/*
		 * GuidewireAutomate("Folder", DT_Folder, "selectByVisibleText", lhm_TestCase_Table_Data.get("Folder"));
		 */
		GuidewireAutomate("Keywords", DT_Keywords, "sendKeys", lhm_TestCase_Table_Data.get("Keywords"));
		GuidewireAutomate("Date", DT_Date, "sendKeys", lhm_TestCase_Table_Data.get("Date"));
		GuidewireAutomate("Identifier", DT_Identifier, "sendKeys", lhm_TestCase_Table_Data.get("Identifier"));

		GuidewireAutomate("Search", DT_Search, "clickAndwait", "click");
		Thread.sleep(1000);

		By Select = By.xpath("//div[contains(text(),'" + lhm_TestCase_Table_Data.get("Type") + "')]/ancestor::td[contains(@id,'Type_Cell')]/preceding-sibling::td//div[contains(@id,'_Select')]/div[@role='button']");
		GuidewireAutomate("Select Template ", Select, "clickAndwait", "click");
		Thread.sleep(500);

		/*
		 * 
		 * switch (StrTemplate) { case "Acrobat Sample":
		 * 
		 * GuidewireAutomate("Select Acrobat Sample Template ", NewDocument_Select_AcrobatSample, "moveToElement", "click");
		 * 
		 * break; case "Excel Sample": GuidewireAutomate("Select Excel Sample Template", NewDocument_Select_ExcelSample, "moveToElement", "click");
		 * GuidewireAutomate("Select Excel Sample Template", NewDocument_Select_ExcelSample, "clickAndwait", "click"); Thread.sleep(500); break; case
		 * "Gosu CSV Sample": GuidewireAutomate("Select Gosu CSV Sample Template", NewDocument_Select_GosuCSVSample, "moveToElement", "click");
		 * GuidewireAutomate("Select Gosu CSV Sample Template", NewDocument_Select_GosuCSVSample, "clickAndwait", "click"); Thread.sleep(500); break;
		 * case "KY": GuidewireAutomate("Select KY Sample Template", NewDocument_Select_KYSample, "moveToElement", "click");
		 * GuidewireAutomate("Select KY SampleTemplate", NewDocument_Select_KYSample, "clickAndwait", "click"); Thread.sleep(500); break; default:
		 * throw new IOException("No support for Template : " + StrTemplate); }
		 */
		// Document Contents
		GuidewireAutomate_Validation("Name", DC_Name, "equals", lhm_TestCase_Table_Data.get("Name"));
		GuidewireAutomate_Validation("Description", DC_Description, "equals", lhm_TestCase_Table_Data.get("LineOfBusiness"));
		GuidewireAutomate_Validation("FileType", DC_FileType, "equals", lhm_TestCase_Table_Data.get("FileType"));
		GuidewireAutomate_Validation("Author", DC_Author, "equals", lhm_TestCase_Table_Data.get("Author"));
		GuidewireAutomate_Validation("Recipient", DC_Recipient, "equals", lhm_TestCase_Table_Data.get("Recipient"));

		GuidewireAutomate("Folder", DC_Folder, "selectByVisibleText", lhm_TestCase_Table_Data.get("Folder"));
		getStaleElement("RelatedTo", DC_RelatedTo);
		GuidewireAutomate("RelatedTo", DC_RelatedTo, "selectByVisibleText", lhm_TestCase_Table_Data.get("RelatedTo"));
		GuidewireAutomate("Status", DC_Status, "selectByVisibleText", lhm_TestCase_Table_Data.get("Status"));
		GuidewireAutomate("SecurityType", DC_SecurityType, "selectByVisibleText", lhm_TestCase_Table_Data.get("SecurityType"));
		GuidewireAutomate("DocumentType", DC_DocumentType, "selectByVisibleText", lhm_TestCase_Table_Data.get("DocumentType"));

		GuidewireAutomate("createDocument", DC_CreateDocument, "clickAndwait", "click");
		Thread.sleep(1000);
		getStaleElement("Update", ND_Update);
		GuidewireAutomate("Update", ND_Update, "clickAndwait", "click");
		Thread.sleep(5000);
	}

	public static void UploadDocuments() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Documents");

		GuidewireAutomate_Validation("Upload Documents", UploadDocuments, "equals", "Upload Documents");
		String strFileType = lhm_TestCase_Table_Data.get("FileType");
		switch (strFileType) {
			case "txt" :
				fileUpload(pUploads + "LetterReceived.txt");
				break;
			case "PDF" :
				fileUpload(pUploads + "GuidewireClaimCenter.pdf");
				break;
			case "bmp" :
				fileUpload(pUploads + "sample_BitmapImage.bmp");
				break;
			case "csv" :
				fileUpload(pUploads + "sample_CSV.csv");
				break;
			case "gif" :
				fileUpload(pUploads + "sample_GIF.gif");
				break;
			case "html" :
				fileUpload(pUploads + "sample_HTML.html");
				break;
			case "jpeg" :
				fileUpload(pUploads + "sample_JPEG.jpeg");
				break;
			case "mp4" :
				fileUpload(pUploads + "sample_MPEG.mp4");
				break;
			case "OpenXMLspreadsheet" :
				fileUpload(pUploads + "sample_OpenXMLspreadsheet.xlsx");
				break;
			case "png" :
				fileUpload(pUploads + "sample_PNG.png");
				break;
			case "OpenXMLpresentation" :
				fileUpload(pUploads + "sample_PowerPoint.pptx");
				break;
			case "QuickTimeVideo" :
				fileUpload(pUploads + "sample_quicktimevideo.mov");
				break;
			case "TiffImage" :
				fileUpload(pUploads + "sample_TiffImage.tiff");
				break;
			case "XML" :
				fileUpload(pUploads + "sample_XML.xml");
				break;
			case "MicrosoftAudio" :
				fileUpload(pUploads + "sample1_MicrosoftAudio.wma");
				break;
			case "OCTETStream" :
				fileUpload(pUploads + "SampleOCTETStream");
				break;
			case "WaveAudio" :
				fileUpload(pUploads + "sampleWaveAudioFile.wav");
				break;
			case "WordDocument" :
				fileUpload(pUploads + "SampleWordDocument.docx");
				break;
			default :
				throw new IOException("No support for FileType : " + strFileType);

		}

		GuidewireAutomate_Validation("Name", UploadDocuments_Name, "equals", lhm_TestCase_Table_Data.get("Name"));
		GuidewireAutomate("Description", UploadDocuments_Description, "sendKeys", lhm_TestCase_Table_Data.get("Description"));
		GuidewireAutomate("FileType", UploadDocuments_FileType, "selectByVisibleText", lhm_TestCase_Table_Data.get("FileType"));
		GuidewireAutomate("Language", UploadDocuments_Language, "selectByVisibleText", lhm_TestCase_Table_Data.get("Language"));
		GuidewireAutomate("Folder", UploadDocuments_Folder, "selectByVisibleText", lhm_TestCase_Table_Data.get("Folder"));
		GuidewireAutomate("Related To", UploadDocuments_RelatedTo, "selectByVisibleText", lhm_TestCase_Table_Data.get("RelatedTo"));
		GuidewireAutomate("Author", UploadDocuments_Author, "sendKeys", lhm_TestCase_Table_Data.get("Author"));
		GuidewireAutomate("Recipient", UploadDocuments_Recipient, "sendKeys", lhm_TestCase_Table_Data.get("Recipient"));
		GuidewireAutomate("Status", UploadDocuments_Status, "selectByVisibleText", lhm_TestCase_Table_Data.get("Status"));
		GuidewireAutomate("SecurityType", UploadDocuments_SecurityType, "selectByVisibleText", lhm_TestCase_Table_Data.get("SecurityType"));
		GuidewireAutomate("DocumentType", UploadDocuments_DocumentType, "selectByVisibleText", lhm_TestCase_Table_Data.get("DocumentType"));

		GuidewireAutomate("Update", UploadDocuments_Update, "clickAndwait", "click");
		// GuidewireAutomate_Validation("Header", ClaimCenter_Resuables_PO.Screen_Header, "equals", "Workplan");
		Thread.sleep(2000);

	}

	public static void fileUpload(String strfilepath) throws Throwable {

		/*
		 * char backslash = ((char)92); char forwardslash = ((char)47);
		 * 
		 * if ( gstr_OSname.contains("Windows")) { strfilepath = strfilepath.replace(forwardslash, backslash); }else if (
		 * gstr_OSname.contains("Linux")) { strfilepath = strfilepath.replace(backslash, forwardslash); }else{ }
		 */
		System.out.println("Path to upload = " + strfilepath);
		GuidewireAutomate("AddFiles", UploadDocuments_AddFiles1, "clickAndwait", "click");
		Thread.sleep(1000);

		// GuidewireAutomate("Inputfile", Inputfile , "sendKeys",strfilepath);
		oExtentTest.log(Status.INFO, "File UPload =" + strfilepath);

		ClipboardOwner  oClipboardOwner  = null;
		Robot           oRobot           = new Robot();
		StringSelection oStringSelection = new StringSelection(strfilepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(oStringSelection, oClipboardOwner);
		oRobot.setAutoDelay(500);
		oRobot.keyPress(KeyEvent.VK_CONTROL);
		oRobot.keyPress(KeyEvent.VK_V);
		oRobot.keyRelease(KeyEvent.VK_CONTROL);
		oRobot.keyRelease(KeyEvent.VK_V);
		oRobot.setAutoDelay(500);
		oRobot.keyPress(KeyEvent.VK_ENTER);
		oRobot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void verifyDocument() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Documents");

		GuidewireAutomate_Validation("Documents Header", Documents_Header, "equals", "Documents");
		GuidewireAutomate_Validation("Documents Name", Documents_Name, "equals", lhm_TestCase_Table_Data.get("DocumentsName"));
		GuidewireAutomate_Validation("Documents Type", Documents_Type, "equals", lhm_TestCase_Table_Data.get("DocumentType"));
		GuidewireAutomate_Validation("Documents Status", Documents_Status, "equals", lhm_TestCase_Table_Data.get("Status"));
	}

	public static void SelectDocuments() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Documents");

			GuidewireAutomate_Validation("Documents Header", Documents_Header, "equals", "Documents");

			GuidewireAutomate_Validation("Filter Documents Header", FilterDocumentsHeader, "equals", "Filter Documents");

			GuidewireAutomate("Related To", FD_RelatedTo, "selectByVisibleText", lhm_TestCase_Table_Data.get("RelatedTo"));
			GuidewireAutomate("Status", FD_Status, "selectByVisibleText", lhm_TestCase_Table_Data.get("Status"));
			GuidewireAutomate("Folder", FD_Folder, "selectByVisibleText", lhm_TestCase_Table_Data.get("Folder"));
			GuidewireAutomate("Author", FD_Author, "sendKeys", lhm_TestCase_Table_Data.get("Author"));

			GuidewireAutomate("Select", SelectButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void verifyPdfDocument(String value) throws Throwable {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(pUserdir + value);

		String              strCurrentUrl = driver.getCurrentUrl();
		URL                 oURL          = new URL(strCurrentUrl);
		InputStream         oIS           = oURL.openStream();
		BufferedInputStream oBIS          = new BufferedInputStream(oIS);
		PDDocument          oPDDocument   = PDDocument.load(oBIS);
		String              strPDFText    = new PDFTextStripper().getText(oPDDocument);
		System.out.println(strPDFText);
	}
	/*
	 * Author - Pankaj Date - 07/12/2021 Description - Action --> Create from Template "Check New Document Section"
	 */
	public static void ND_VerifyNewDocumentSectionTypelist() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Documents");

			GuidewireAutomate_Validation("Documents Header", NewDocument_Header, "equals", "New Document");
			// GuidewireAutomate_Validation("Documents Section", Section, "getOptionscontains",lhm_TestCase_Table_Data.get("Section"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Author - Pankaj Date - 07/12/2021 Description - Action --> Create from Template "Check New Document Section and Document type"
	 */
	public static void ND_VerifyNewDocumentSectionAndDocumentTypelist() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Documents");

			for (int i = 1; i <= 11; i++) {
				// GuidewireAutomate("Select Section", Section, "selectByVisibleText", lhm_TestCase_Table_Data.get("Section"+i));
				Thread.sleep(500);
				GuidewireAutomate_Validation("Documents Type", NewDocumentType, "getOptionscontains", lhm_TestCase_Table_Data.get("DocumentType" + i));
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Author - Pankaj Date - 07/12/2021 Description - Menu--> Documents "Check Static message
	 */
	public static void VerifyStaticMessage() throws Throwable {
		try {
			GuidewireAutomate_Validation("Document Static Message", DocumentAlertMessage, "equals", "See ImageRight for the complete set of documents for this claim");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void linkDocument() throws Throwable {

		try {

			// GuidewireAutomate_Validation("Screen Header", ClaimCenter_Resuables_PO.Screen_Header, "equals", "Step 3 of 3: Set check instructions");

			GuidewireAutomate("Link Document", LinkDocument_Button, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
