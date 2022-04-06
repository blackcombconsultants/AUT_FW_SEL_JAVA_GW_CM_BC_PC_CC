package com.pages.Guidewire.BillingCenter;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class BillingCenter_NonPayment extends SeleniumWebDriver_Commands {

	public BillingCenter_NonPayment(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}
	
	/******
	 * INVOICES
	 */
	private static By Invoices_Header=By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By NP_InvoiceStream=By.xpath("//select[contains(@name,'InvoiceStreamFilter')]");
	private static By NP_Invoice_Information=By.xpath("//div[contains(@id,'InvoiceDetailDV')]//div[@class='gw-label gw-boldLabel' and text()='Invoice Information']");
	private static By NP_Invoice_BillDate=By.xpath("//div[contains(@id,'AccountInvoiceInformationInputSet-InvoiceDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By NP_Invoice_DueDate=By.xpath("//div[contains(@id,'AccountInvoiceInformationInputSet-PaymentDueDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By Invoices_IInfo_Status=By.xpath("//div[contains(@id,'AccountInvoiceInformationInputSet-Status_Input')]//div[@class='gw-value-readonly-wrapper']");

	/******
	 * Invoice Stream
	 */
	private static By InvoicesStream_Header=By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By InvoicesStream_InvoiceDays=By.xpath("//div[contains(@id,'InvoiceDayLabel_Input')]//div[@class='gw-label gw-boldLabel' and text()='Invoice Days']");
	private static By InvoicesStream_DefaultDayofMonth=By.xpath("//div[contains(@id,'AccountInvoiceDayOfMonth')]//div[@class='gw-value-readonly-wrapper']");
	private static By InvoicesStream_OverrideDayofMonth=By.xpath("//div[contains(@id,'OverridingInvoiceDayOfMonth')]//div[@class='gw-value-readonly-wrapper']");
    private static By InvoicesStream_LeadTime=By.xpath("//div[contains(@id,'LeadTimeLabel')]//div[@class='gw-label gw-boldLabel' and text()='Lead Time']");
	private static By InvoicesStream_Default=By.xpath("//div[contains(@id,'AccountInvoicingLeadTime')]//div[@class='gw-value-readonly-wrapper']");
	private static By Internal_Tools=By.xpath("//div[contains(@id,'TabBar-UnsupportedToolsTab')]//div[@class='gw-icon gw-icon--expand']");
	private static By System_clock=By.xpath("//div[contains(@id,'TabBar-UnsupportedToolsTab-UnsupportedTools_SystemClock')]");

	/****
	 * Delequency
	 */
	private static By InvoicesStream_Delequencies=By.xpath("//div[contains(@id,'DelinquencyProcessesDetailScreen')]//div[@role='heading']");
	private static By BatchScreen_Header=By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");

	private static By Batch_Invoices=By.xpath("//div[text()='Invoice']/ancestor::td/following-sibling::td[contains(@id,'RunBatchWithoutNotifyContent')]//div[contains(@id,'RunBatchWithoutNotify')]");
	//Action
	private static By Action = By.xpath("//div[@id='gw-west-panel--top-section']/div[contains(@id,'MenuActions')]//div[@role='button']");
	private static By Action_ReturnBillingCenter = By.xpath("//div[contains(@id,'ReturnToApp')]//div[text()='Return to BillingCenter']");
	
	
	public static void NonPayment_Invoices() throws Throwable {
		try {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("npInvoices", strTestCaseName);
		
		/*
		 * GuidewireAutomate("Account button", AD_AB_AccountSearch_Button, "click",
		 * "click"); GuidewireAutomate("AccountNumber", AD_AB_AccountNumber,
		 * "clearANDsendKeys", lhm_TestCase_Table_Data.get("AD_AB_AccountNumber"));
		 * GuidewireAutomate("Account Search", AD_AB_AccountNumber_Search, "click",
		 * "click");
		 */
		GuidewireAutomate_Validation("Screen Header", Invoices_Header, "equals", "Invoices");
		GuidewireAutomate("Invoice Stream", NP_InvoiceStream, "selectByVisibleText", lhm_TestCase_Table_Data.get("NP_InvoiceStream"));
		GuidewireAutomate_Validation("Invoice Information", NP_Invoice_Information, "equals", "Invoice Information");
		GuidewireAutomate_Validation("Invoice BillDate", NP_Invoice_BillDate, "equals", lhm_TestCase_Table_Data.get("NP_Invoice_BillDate"));
		GuidewireAutomate_Validation("InvoiceDueDate", NP_Invoice_DueDate, "equals", lhm_TestCase_Table_Data.get("NP_Invoice_DueDate"));
		GuidewireAutomate_Validation("Status", Invoices_IInfo_Status, "equals", lhm_TestCase_Table_Data.get("NP_Status"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;


		
			}
}
	
		public static void NonPayment_InvoicesStream() throws Throwable {
			try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("npInvoices", strTestCaseName);
			
		GuidewireAutomate_Validation("Invoice Stream", InvoicesStream_Header, "equals", "Invoice Streams");
		GuidewireAutomate_Validation("InvoicesStream InvoiceDays", InvoicesStream_InvoiceDays, "equals", "Invoice Days");
		GuidewireAutomate_Validation(" InvoicesStream DefaultDayofMonth", InvoicesStream_DefaultDayofMonth, "equals", lhm_TestCase_Table_Data.get("InvoicesStream_DefaultDayofMonth"));
		GuidewireAutomate_Validation("InvoicesStream InvoiceDays", InvoicesStream_OverrideDayofMonth, "equals", lhm_TestCase_Table_Data.get("InvoicesStream_InvoiceDays"));
		GuidewireAutomate_Validation("InvoicesStream LeadTime", InvoicesStream_LeadTime, "equals", "Lead Time");

		GuidewireAutomate_Validation("InvoicesStream Default", InvoicesStream_Default, "equals", lhm_TestCase_Table_Data.get("InvoicesStream_Default"));
			} catch (Exception e) {
				e.printStackTrace();
				throw e;


			
				}
		}
		public static void InternalTools() throws Throwable {
			GuidewireAutomate(" Internal Tools", Internal_Tools, "clickAndwait", "clickAndwait");
			GuidewireAutomate("System clock", System_clock, "clickAndwait", "clickAndwait");

			try {

			} catch (Exception e) {
				e.printStackTrace();
				throw e;


			
				}
		//GuidewireAutomate_Validation("InvoicesStream Delequencies", InvoicesStream_Delequencies, "equals", "Invoice Streams");
			
	}
		public static void RunBatch_Invoice() throws Throwable {



			try {



			GuidewireAutomate_Validation("Screen Header", BatchScreen_Header, "equals", "Batch Process Info");
			GuidewireAutomate("Invoice Run", Batch_Invoices, "clickAndwait", "clickAndwait");



			} catch (Exception e) {
			e.printStackTrace();
			throw e;



			}



			}
			public static void ReturnToBillingCenter() throws Throwable {

		try {
			getStaleElement("Action Run", Action);
			GuidewireAutomate("Action Run", Action, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Return To Billing Center", Action_ReturnBillingCenter, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;



			}



			}
		
}

