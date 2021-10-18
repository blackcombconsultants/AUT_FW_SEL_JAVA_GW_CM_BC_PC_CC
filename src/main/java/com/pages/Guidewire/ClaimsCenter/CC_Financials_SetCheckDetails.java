package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CC_Financials_SetCheckDetails extends SeleniumWebDriver_Commands {

	public CC_Financials_SetCheckDetails(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	
	}
	private static By SetCheckDetailsHeader = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By PayToTheOrderOf = By.xpath("//div[contains(@id,'CheckWizardCheckSummaryInputSet-Check_PayTo')]//div[@class='gw-value-readonly-wrapper']");
	private static By MailingAddress = By.xpath("//div[contains(@id,'CheckWizardCheckSummaryInputSet-Check_MailTo')]//div[@class='gw-value-readonly-wrapper']");
	private static By GrossAmount = By.xpath("//div[contains(@id,'CheckWizardCheckSummaryInputSet-Amount_Gross')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By Deductions = By.xpath("//div[contains(@id,'CheckWizardCheckSummaryInputSet-Check_Deductions')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By NetAmount = By.xpath("//div[contains(@id,'CheckWizardCheckSummaryInputSet-Amount_Net')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By Claimant = By.xpath("//div[contains(@id,'CheckWizardCheckSummaryInputSet-Check_Claimant')]//div[@class='gw-RangeValue']");
	private static By DateOfService = By.xpath("//input[contains(@name,'CheckWizardCheckSummaryInputSet-Check_DateOfService')]");
	private static By InvoiceNumber = By.xpath("//input[contains(@name,'Check_InvoiceNumber')]");
	private static By Memo = By.xpath("//input[contains(@name,'Check_Memo')]");
	private static By InstructionsSection = By.xpath("//div[contains(@id,'NewPaymentInstructionsDV')]//div[@class='gw-label gw-boldLabel']");
	private static By PaymentMethod = By.xpath("//div[contains(@id,'PaymentMethod')]//div[@class='gw-RangeValue']");
	private static By CheckBatching = By.xpath("//select[contains(@name,'NewPaymentInstructionsDV-CheckBatching')]");
	private static By CheckInstructions = By.xpath("//select[contains(@name,'NewPaymentInstructionsDV-CheckInstructions')]");
	private static By Recurrence = By.xpath("//select[contains(@name,'CheckRecurrenceInputSet-RecurrenceType')]");
	private static By PaymentDate = By.xpath("//input[contains(@name,'CheckRecurrenceDetailInputSet-ScheduledSendDate')]");
	private static By LinkDocumentButton = By.xpath("//div[contains(@id,'LinkDocument')]//div[@role='button']");
	
	private static By LinkedDocumentsSection = By.xpath("//div[contains(@id,'TransactionSetDocumentsLV')]//div[@class='gw-ListView--UI--title']");
	private static By DocumentName = By.xpath("//div[contains(@id,'TransactionSetDocumentsLV-0-NameLink')]");
	private static By DocumentType = By.xpath("//div[contains(@id,'TransactionSetDocumentsLV-0-Type')]//div[@class='gw-label']");
	private static By DocumentStatus = By.xpath("//div[contains(@id,'TransactionSetDocumentsLV-0-Status')]//div[@class='gw-label']");
	private static By DocumentAuthor = By.xpath("//div[contains(@id,'TransactionSetDocumentsLV-0-Author')]//div[@class='gw-value-readonly-wrapper']");
	private static By DocumentUploaded = By.xpath("//div[contains(@id,'TransactionSetDocumentsLV-0-DateModified')]//div[@class='gw-value-readonly-wrapper']");
	

	
	
	public static void SetCheckDetails(String menu) throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("SetCheckDetails",
					strTestCaseName);
			
			switch (menu) {
			case "Quick Check":
				GuidewireAutomate_Validation("Set Check Details Header", SetCheckDetailsHeader, "equals","Step 2 of 2: Set check details");
				GuidewireAutomate_Validation("Pay To The Order Of", PayToTheOrderOf, "equals",lhm_TestCase_Table_Data.get("PayToTheOrderOf"));
				GuidewireAutomate_Validation("Mailing Address", MailingAddress, "contains",lhm_TestCase_Table_Data.get("MailingAddress"));
				GuidewireAutomate_Validation("Gross Amount", GrossAmount, "equals",lhm_TestCase_Table_Data.get("GrossAmount"));
				GuidewireAutomate_Validation("Deductions", Deductions, "equals",lhm_TestCase_Table_Data.get("Deductions"));
				GuidewireAutomate_Validation("Net Amount", NetAmount, "equals",lhm_TestCase_Table_Data.get("NetAmount"));
				GuidewireAutomate_Validation("Claimant", Claimant, "equals",lhm_TestCase_Table_Data.get("Claimant"));
				GuidewireAutomate("Date of Service", DateOfService, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DateOfService"));
				GuidewireAutomate("Invoice Number", InvoiceNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("InvoiceNumber"));
				GuidewireAutomate("Memo", Memo, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Memo"));
				
				GuidewireAutomate_Validation("Instructions Section", InstructionsSection, "equals","Instructions");
				GuidewireAutomate_Validation("Payment Method", PaymentMethod, "equals",lhm_TestCase_Table_Data.get("PaymentMethod"));
				GuidewireAutomate_Validation("Verify Check Batching", CheckBatching, "getOptionscontains",lhm_TestCase_Table_Data.get("CheckBatchingDropDown"));
				GuidewireAutomate("Check Batching", CheckBatching, "selectByVisibleText", lhm_TestCase_Table_Data.get("CheckBatching"));
				GuidewireAutomate_Validation("Verify Check Instructions", CheckInstructions, "getOptionscontains",lhm_TestCase_Table_Data.get("CheckInstructionsDropDown"));
				GuidewireAutomate("Check Instructions", CheckInstructions, "selectByVisibleText", lhm_TestCase_Table_Data.get("CheckInstructions"));
				GuidewireAutomate_Validation("Verify Recurrence", Recurrence, "getOptionscontains",lhm_TestCase_Table_Data.get("RecurrenceDropDown"));
				GuidewireAutomate("Recurrence", Recurrence, "selectByVisibleText", lhm_TestCase_Table_Data.get("Recurrence"));
				GuidewireAutomate("Payment Date", PaymentDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PaymentDate"));

				break;
			case "Create Check":
				GuidewireAutomate_Validation("Set Check Details Header", SetCheckDetailsHeader, "equals","Step 3 of 3: Set check instructions");
				GuidewireAutomate_Validation("Pay To The Order Of", PayToTheOrderOf, "equals",lhm_TestCase_Table_Data.get("PayToTheOrderOf"));
				GuidewireAutomate_Validation("Mailing Address", MailingAddress, "contains",lhm_TestCase_Table_Data.get("MailingAddress"));
				GuidewireAutomate_Validation("Gross Amount", GrossAmount, "equals",lhm_TestCase_Table_Data.get("GrossAmount"));
				GuidewireAutomate_Validation("Deductions", Deductions, "equals",lhm_TestCase_Table_Data.get("Deductions"));
				GuidewireAutomate_Validation("Net Amount", NetAmount, "equals",lhm_TestCase_Table_Data.get("NetAmount"));
				GuidewireAutomate_Validation("Claimant", Claimant, "equals",lhm_TestCase_Table_Data.get("Claimant"));
				GuidewireAutomate("Date of Service", DateOfService, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DateOfService"));
				GuidewireAutomate("Invoice Number", InvoiceNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("InvoiceNumber"));
				GuidewireAutomate("Memo", Memo, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Memo"));
				
				GuidewireAutomate_Validation("Instructions Section", InstructionsSection, "equals","Instructions");
				GuidewireAutomate_Validation("Payment Method", PaymentMethod, "equals",lhm_TestCase_Table_Data.get("PaymentMethod"));
				GuidewireAutomate_Validation("Verify Check Batching", CheckBatching, "getOptionscontains",lhm_TestCase_Table_Data.get("CheckBatchingDropDown"));
				GuidewireAutomate("Check Batching", CheckBatching, "selectByVisibleText", lhm_TestCase_Table_Data.get("CheckBatching"));
				GuidewireAutomate_Validation("Verify Check Instructions", CheckInstructions, "getOptionscontains",lhm_TestCase_Table_Data.get("CheckInstructionsDropDown"));
				GuidewireAutomate("Check Instructions", CheckInstructions, "selectByVisibleText", lhm_TestCase_Table_Data.get("CheckInstructions"));
				GuidewireAutomate_Validation("Verify Recurrence", Recurrence, "getOptionscontains",lhm_TestCase_Table_Data.get("RecurrenceDropDown"));
				GuidewireAutomate("Recurrence", Recurrence, "selectByVisibleText", lhm_TestCase_Table_Data.get("Recurrence"));
				GuidewireAutomate("Payment Date", PaymentDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PaymentDate"));
			
				break;
			
			}
			
			
			
			
									
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
		
	public static void LinkDocumentButton() throws Throwable {
		try {
			
			GuidewireAutomate("Link Document Button", LinkDocumentButton, "clickAndwait", "clickAndwait");
		
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
		
	}
		public static void LinkedDocuments() throws Throwable {
			try {
				lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Documents",
						strTestCaseName);
			
				GuidewireAutomate_Validation("LinkedDocumentsSection", LinkedDocumentsSection, "equals","Linked Documents");
				
				GuidewireAutomate_Validation("Document Name", DocumentName, "equals",lhm_TestCase_Table_Data.get("DocumentsName"));
				GuidewireAutomate_Validation("Document Type", DocumentType, "equals",lhm_TestCase_Table_Data.get("DocumentType"));
				GuidewireAutomate_Validation("Document Status", DocumentStatus, "equals",lhm_TestCase_Table_Data.get("Status"));
				GuidewireAutomate_Validation("Document Author", DocumentAuthor, "equals",lhm_TestCase_Table_Data.get("Author"));
				GuidewireAutomate_Validation("Document Uploaded", DocumentUploaded, "contains",lhm_TestCase_Table_Data.get("Uploaded"));
				
				
		
			} catch (Exception e) {

				e.printStackTrace();
				throw e;
			}	
		
	}
	
}
