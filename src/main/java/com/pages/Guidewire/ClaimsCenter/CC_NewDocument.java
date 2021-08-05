package com.pages.Guidewire.ClaimsCenter;

import java.awt.AWTException;
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
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC_NewDocument extends SeleniumWebDriver_Commands {

	public CC_NewDocument(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By UploadDocuments           = By.xpath("//div[@id='wsTabBar']//div[@class='gw-label']");
	private static By UploadDocuments_AddFiles1 = By.xpath("//div[contains(@id,'browseButton')]");

	private static By UploadDocuments_AddFiles = By.xpath("//input[contains(@id,'FileInput--file')]");

	private static By UploadDocuments_Status       = By.xpath("//select[contains(@name,'Status')]");
	private static By UploadDocuments_DocumentType = By.xpath("//select[contains(@name,'DocumentDetailsEditLV-0-Type')]");
	private static By UploadDocuments_Update       = By.xpath("//div[contains(@id,'CustomUpdate')]/div[@role='button']");

	private static By Documents_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Documents']");
	private static By Documents_Name   = By.xpath("//div[contains(@id,'NameLink')]");
	private static By Documents_Type   = By.xpath("//td[contains(@id,'Type_Cell')]//div[@class='gw-label']");
	private static By Documents_Status = By.xpath("//td[contains(@id,'Status_Cell')]//div[@class='gw-label']");

	private static By NewDocument_Header = By.xpath("//div[@id='wsTabBar']//div[@class='gw-label' and text()='New Document']");

	private static By NewDocument_DocumentTemplate_Search = By.xpath("//div[contains(@id,'SelectTemplatePicker')]");

	private static By NewDocument_Type           = By.xpath("//select[contains(@name, 'DocumentTemplateSearchDV-TemplateType')]");
	private static By NewDocument_LineOfBusiness = By.xpath("//select[contains(@name, 'DocumentTemplateSearchDV-LossType')]");
	private static By NewDocument_Jurisdiction   = By.xpath("//select[contains(@name, 'DocumentTemplateSearchDV-JurisdictionState')]");

	private static By NewDocument_DocumentTemplates_Search = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");

	private static By NewDocument_Select_AcrobatSample = By
			.xpath("//div[@class='gw-value-readonly-wrapper' and text()='Acrobat Sample']/ancestor::td[contains(@id,'Template_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");
	private static By NewDocument_Select_ExcelSample   = By
			.xpath("//div[@class='gw-value-readonly-wrapper' and text()='Excel Sample']/ancestor::td[contains(@id,'Template_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");
	private static By NewDocument_Select_GosuCSVSample = By
			.xpath("//div[@class='gw-value-readonly-wrapper' and text()='Gosu CSV Sample']/ancestor::td[contains(@id,'Template_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");
	private static By NewDocument_Select_KYSample      = By
			.xpath("//div[@class='gw-value-readonly-wrapper' and text()='KY No Fault App 1-03 - FCCI']/ancestor::td[contains(@id,'Template_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");

	private static By NewDocument_CreateDocument = By.xpath("//div[contains(@id,'DocumentCreationInputSet-CreateDocument')]/div[@role='button']");

	private static By NewDocument_Update = By.xpath("//div[contains(@id,'NewDocumentFromTemplate_CustomUpdate')]");

	public static void addCreateTemplate() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Documents", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", NewDocument_Header, "equals", "New Document");
		GuidewireAutomate("Search", NewDocument_DocumentTemplate_Search, "click", "click");
		// GuidewireAutomate("Type", NewDocument_Type,
		// "selectByVisibleText",lhm_TestCase_Table_Data.get("Type"));
		GuidewireAutomate("LineOfBusiness", NewDocument_LineOfBusiness, "selectByVisibleText", lhm_TestCase_Table_Data.get("LineOfBusiness"));
		GuidewireAutomate("Jurisdiction", NewDocument_Jurisdiction, "selectByVisibleText", lhm_TestCase_Table_Data.get("Jurisdiction"));
		GuidewireAutomate("NewDocument Search", NewDocument_DocumentTemplates_Search, "clickAndwait", "click");

		String StrTemplate = lhm_TestCase_Table_Data.get("Template");
		switch (StrTemplate) {
			case "Acrobat Sample" :
				GuidewireAutomate("Select Acrobat Sample Template ", NewDocument_Select_AcrobatSample, "moveToElement", "click");
				GuidewireAutomate("Select Acrobat Sample Template ", NewDocument_Select_AcrobatSample, "clickAndwait", "click");
				break;
			case "Excel Sample" :
				GuidewireAutomate("Select Excel Sample Template", NewDocument_Select_ExcelSample, "moveToElement", "click");
				GuidewireAutomate("Select Excel Sample Template", NewDocument_Select_ExcelSample, "clickAndwait", "click");
				break;
			case "Gosu CSV Sample" :
				GuidewireAutomate("Select Gosu CSV Sample Template", NewDocument_Select_GosuCSVSample, "moveToElement", "click");
				GuidewireAutomate("Select Gosu CSV Sample Template", NewDocument_Select_GosuCSVSample, "clickAndwait", "click");
				break;
			case "KY" :
				GuidewireAutomate("Select KY Sample Template", NewDocument_Select_KYSample, "moveToElement", "click");
				GuidewireAutomate(" Select KY SampleTemplate", NewDocument_Select_KYSample, "clickAndwait", "click");
				break;
			default :
				throw new IOException("No support for Template : " + StrTemplate);
		}

		GuidewireAutomate("createDocument", NewDocument_CreateDocument, "clickAndwait", "click");
		getStaleElement("Update", NewDocument_Update);
		GuidewireAutomate("Update", NewDocument_Update, "click", "click");
	}

	public static void UploadDocuments() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Documents", strTestCaseName);
		GuidewireAutomate_Validation("UploadDocumentsr", UploadDocuments, "equals", "Upload Documents");
		GuidewireAutomate("AddFiles1", UploadDocuments_AddFiles1, "click", "null");
		String strFileType = lhm_TestCase_Table_Data.get("FileType");

		switch (strFileType) {
			case "txt" :
				fileUpload("\\Upload\\LetterReceived.txt");
				break;
			case "pdf" :
				fileUpload("\\Upload\\GuidewireClaimCenter.pdf");
				break;
			case "bmp" :
				fileUpload("\\Upload\\sample_BitmapImage.bmp");
				break;
			case "csv" :
				fileUpload("\\Upload\\sample_CSV.csv");
				break;
			case "gif" :
				fileUpload("\\Upload\\sample_GIF.gif");
				break;
			case "html" :
				fileUpload("\\Upload\\sample_HTML.html");
				break;
			case "jpeg" :
				fileUpload("\\Upload\\sample_JPEG.jpeg");
				break;
			case "mp4" :
				fileUpload("\\Upload\\sample_MPEG.mp4");
				break;
			case "OpenXMLspreadsheet" :
				fileUpload("\\Upload\\sample_OpenXMLspreadsheet.xlsx");
				break;
			case "png" :
				fileUpload("\\Upload\\sample_PNG.png");
				break;
			case "OpenXMLpresentation" :
				fileUpload("\\Upload\\sample_PowerPoint.pptx");
				break;
			case "QuickTimeVideo" :
				fileUpload("\\Upload\\sample_quicktimevideo.mov");
				break;
			case "TiffImage" :
				fileUpload("\\Upload\\sample_TiffImage.tiff");
				break;
			case "XML" :
				fileUpload("\\Upload\\sample_XML.xml");
				break;
			case "MicrosoftAudio" :
				fileUpload("\\Upload\\sample1_MicrosoftAudio.wma");
				break;
			case "OCTETStream" :
				fileUpload("\\Upload\\SampleOCTETStream");
				break;
			case "WaveAudio" :
				fileUpload("\\Upload\\sampleWaveAudioFile.wav");
				break;
			case "WordDocument" :
				fileUpload("\\Upload\\SampleWordDocument.docx");
				break;
			default :
				throw new IOException("No support for FileType : " + strFileType);

		}

		GuidewireAutomate("Status", UploadDocuments_Status, "sendKeys", lhm_TestCase_Table_Data.get("Status"));
		GuidewireAutomate("DocumentType", UploadDocuments_DocumentType, "sendKeys", lhm_TestCase_Table_Data.get("DocumentType"));

		GuidewireAutomate("Update", UploadDocuments_Update, "click", "null");

	}

	public static void fileUpload(String value) throws AWTException {

		ClipboardOwner  owner           = null;
		Robot           robot           = new Robot();
		StringSelection stringSelection = new StringSelection(pUserdir + value);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, owner);
		robot.setAutoDelay(2000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void verifyDocument() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Documents", strTestCaseName);
		GuidewireAutomate_Validation("Documents Header", Documents_Header, "equals", "Documents");
		GuidewireAutomate_Validation("Documents Name", Documents_Name, "equals", lhm_TestCase_Table_Data.get("DocumentsName"));
		GuidewireAutomate_Validation("Documents Type", Documents_Type, "equals", lhm_TestCase_Table_Data.get("DocumentType"));
		GuidewireAutomate_Validation("Documents Status", Documents_Status, "equals", lhm_TestCase_Table_Data.get("Status"));
	}

	public static void verifyPdfDocument(String value) throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String projectPath = System.getProperty("user.dir");

		driver.get(projectPath + value);

		String currentUrl = driver.getCurrentUrl();

		/* String pp=System.getProperty("user.dir"); */

		URL url = new URL(currentUrl);

		InputStream         is        = url.openStream();
		BufferedInputStream fileparse = new BufferedInputStream(is);
		PDDocument          document  = null;
		document = PDDocument.load(fileparse);
		String pdfContent = new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
	}

}
