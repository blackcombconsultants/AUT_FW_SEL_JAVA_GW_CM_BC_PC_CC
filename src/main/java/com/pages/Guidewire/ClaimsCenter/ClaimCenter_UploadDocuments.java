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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClaimCenter_UploadDocuments extends SeleniumWebDriver_Commands implements ClaimCenter_UploadDocuments_PO {

	public ClaimCenter_UploadDocuments(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void UploadDocuments() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("UploadDocuments",
				strTestCaseName);
		GuidewireAutomate_Validation("UploadDocumentsr", UploadDocuments, "equals", "Upload Documents");
		GuidewireAutomate("AddFiles1", UploadDocuments_AddFiles1, "click", "null");
		String strFileType = lhm_TestCase_Table_Data.get("FileType");

		switch (strFileType) {
		case "txt":
			fileUpload("\\Upload\\LetterReceived.txt");
			break;
		case "pdf":
			fileUpload("\\Upload\\GuidewireClaimCenter.pdf");
			break;
		case "bmp":
			fileUpload("\\Upload\\sample_BitmapImage.bmp");
			break;
		case "csv":
			fileUpload("\\Upload\\sample_CSV.csv");
			break;
		case "gif":
			fileUpload("\\Upload\\sample_GIF.gif");
			break;
		case "html":
			fileUpload("\\Upload\\sample_HTML.html");
			break;
		case "jpeg":
			fileUpload("\\Upload\\sample_JPEG.jpeg");
			break;
		case "mp4":
			fileUpload("\\Upload\\sample_MPEG.mp4");
			break;
		case "OpenXMLspreadsheet":
			fileUpload("\\Upload\\sample_OpenXMLspreadsheet.xlsx");
			break;
		case "png":
			fileUpload("\\Upload\\sample_PNG.png");
			break;
		case "OpenXMLpresentation":
			fileUpload("\\Upload\\sample_PowerPoint.pptx");
			break;
		case "QuickTimeVideo":
			fileUpload("\\Upload\\sample_quicktimevideo.mov");
			break;
		case "TiffImage":
			fileUpload("\\Upload\\sample_TiffImage.tiff");
			break;
		case "XML":
			fileUpload("\\Upload\\sample_XML.xml");
			break;
		case "MicrosoftAudio":
			fileUpload("\\Upload\\sample1_MicrosoftAudio.wma");
			break;
		case "OCTETStream":
			fileUpload("\\Upload\\SampleOCTETStream");
			break;
		case "WaveAudio":
			fileUpload("\\Upload\\sampleWaveAudioFile.wav");
			break;
		case "WordDocument":
			fileUpload("\\Upload\\SampleWordDocument.docx");
			break;
		default:
			throw new IOException("No support for FileType : " + strFileType);

		}

		GuidewireAutomate("Status", UploadDocuments_Status, "sendKeys", lhm_TestCase_Table_Data.get("Status"));
		GuidewireAutomate("DocumentType", UploadDocuments_DocumentType, "sendKeys",
				lhm_TestCase_Table_Data.get("DocumentType"));

		GuidewireAutomate("Update", UploadDocuments_Update, "click", "null");

	}

	public static void fileUpload(String value) throws AWTException {

		ClipboardOwner owner = null;
		Robot robot = new Robot();
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
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("UploadDocuments",
				strTestCaseName);
		GuidewireAutomate_Validation("Documents Header", Documents_Header, "equals", "Documents");
		GuidewireAutomate_Validation("Documents Name", Documents_Name, "equals",
				lhm_TestCase_Table_Data.get("DocumentsName"));
		GuidewireAutomate_Validation("Documents Type", Documents_Type, "equals",
				lhm_TestCase_Table_Data.get("DocumentType"));
		GuidewireAutomate_Validation("Documents Status", Documents_Status, "equals",
				lhm_TestCase_Table_Data.get("Status"));
	}

	public static void verifyPdfDocument(String value) throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String projectPath = System.getProperty("user.dir");

		driver.get(projectPath + value);

		String currentUrl = driver.getCurrentUrl();

		/* String pp=System.getProperty("user.dir"); */

		URL url = new URL(currentUrl);

		InputStream is = url.openStream();
		BufferedInputStream fileparse = new BufferedInputStream(is);
		PDDocument document = null;
		document = PDDocument.load(fileparse);
		String pdfContent = new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
	}

}
