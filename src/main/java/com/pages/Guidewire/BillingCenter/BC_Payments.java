package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class BC_Payments extends SeleniumWebDriver_Commands {

	public BC_Payments(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By Payment_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");

	private static By Amount1 = By.xpath("//input[contains(@name,'NewSuspensePaymentDV-amount')]");

	private static By NewSuspensePayment_Header = By.xpath("//div[@id='NewSuspensePayment-NewSuspensePaymentScreen-0']//div[@class='gw-TitleBar--title']");
	private static By PaymentDate               = By.xpath("//input[contains(@name,'-paymentDate')]");
	private static By NewPayment                = By.xpath("//div[contains(@id,'-NewPayment')]//div[@role='button']");
	private static By ActionButton              = By.xpath("//div[contains(@id,'AccountDBPaymentsLV-i-ActionButton')]//div[@role='button']");
	private static By ReversePayment            = By.xpath("//table/tbody/tr[10]/td[1]//div[text()='Actions']");

	/*
	 * FundsTracking xpath
	 *
	 */
	private static By FundsTracking_Header = By.xpath("//div[@id='AccountDetailFundsTracking-AccountDetailFundsTrackingScreen-ttlBar']//div[ @class='gw-TitleBar--title' and text()='Funds Tracking']");
	private static By FT_FundsSources_Tab  = By.xpath("//div[contains(@id,'FundsSourcesCardTab')]//div[@role='tab']");
	private static By FT_FundsUses_Tab     = By.xpath("//div[contains(@id,'FundsUsesCardTab')]//div[@role='tab']");

	private static By Payments_Header               = By.xpath("//div[@id='AccountPayments-AccountDetailPaymentsScreen-ttlBar']//div[ @class='gw-TitleBar--title' and text()='Payments']");
	private static By Payments_PaymentDetails_Tab   = By.xpath("//div[contains(@id,'AccountPaymentDistributionItemsCV-PaymentDetailsTab')]//div[@role='tab']");
	private static By Payments_SuspenseItems_Tab    = By.xpath("//div[contains(@id,'AccountPaymentDistributionItemsCV-suspenseItemsCardTab')]//div[@role='tab']");
	private static By Payments_PreviousVersions_Tab = By.xpath("//div[contains(@id,'AccountPaymentDistributionItemsCV-reversedMoniesTab')]//div[@role='tab']");

	/*
	 * Direct Bill Payment
	 */
	private static By ADirectBillPayment_Header         = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By Amount                            = By.xpath("//input[contains(@name,'PaymentDetailsDV-Amount')]");
	private static By PaymentInstrument                 = By.xpath("//select[contains(@name,'-PaymentInstrument')]");
	private static By ExecuteWithoutDistribution_button = By.xpath("//div[contains(@id,'ExecuteWithoutDistribution')]//div[@role='button']");

	private static By DBP_Header                     = By.xpath("//div[@id='NewDirectBillPayment-EditDBPaymentScreen-ttlBar']//div[ @class='gw-TitleBar--title']");
	private static By DBP_Amount                     = By.xpath("//input[contains(@name,'NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-Amount')]");
	private static By DBP_PaymentInstrument          = By.xpath("//select[contains(@name,'PaymentInstrument')]");
	private static By DBP_Description                = By.xpath("//input[contains(@name,'PaymentDetailsDV-Description')]");
	private static By DBP_ExecuteWithoutDistribution = By.xpath("//div[contains(@id,'ExecuteWithoutDistribution')]//div[@role='button']/div[text()='Execute Without Distribution']");

	/******
	 * INVOICES
	 */
	private static By Invoices_Header        = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By NP_InvoiceStream       = By.xpath("//select[contains(@name,'InvoiceStreamFilter')]");
	private static By NP_Invoice_Information = By.xpath("//div[contains(@id,'InvoiceDetailDV')]//div[@class='gw-label gw-boldLabel' and text()='Invoice Information']");
	private static By NP_Invoice_BillDate    = By.xpath("//div[contains(@id,'AccountInvoiceInformationInputSet-InvoiceDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By NP_Invoice_DueDate     = By.xpath("//div[contains(@id,'AccountInvoiceInformationInputSet-PaymentDueDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By Invoices_IInfo_Status  = By.xpath("//div[contains(@id,'AccountInvoiceInformationInputSet-Status_Input')]//div[@class='gw-value-readonly-wrapper']");

	/******
	 * Invoice Stream
	 */
	private static By InvoicesStream_Header             = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By InvoicesStream_InvoiceDays        = By.xpath("//div[contains(@id,'InvoiceDayLabel_Input')]//div[@class='gw-label gw-boldLabel' and text()='Invoice Days']");
	private static By InvoicesStream_DefaultDayofMonth  = By.xpath("//div[contains(@id,'AccountInvoiceDayOfMonth')]//div[@class='gw-value-readonly-wrapper']");
	private static By InvoicesStream_OverrideDayofMonth = By.xpath("//div[contains(@id,'OverridingInvoiceDayOfMonth')]//div[@class='gw-value-readonly-wrapper']");
	private static By InvoicesStream_LeadTime           = By.xpath("//div[contains(@id,'LeadTimeLabel')]//div[@class='gw-label gw-boldLabel' and text()='Lead Time']");
	private static By InvoicesStream_Default            = By.xpath("//div[contains(@id,'AccountInvoicingLeadTime')]//div[@class='gw-value-readonly-wrapper']");

	/****
	 * Delequency
	 */
	private static By InvoicesStream_Delequencies = By.xpath("//div[contains(@id,'DelinquencyProcessesDetailScreen')]//div[@role='heading']");

	/*
	 * 
	 * 
	 * 
	 */
	public static void DirectBillPayments() throws Throwable {
		try {
			lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("payment");
			GuidewireAutomate_Validation("Direct Bill Payment", ADirectBillPayment_Header, "equals", "Direct Bill Payment");

			GuidewireAutomate("Amount", Amount, "sendKeys", lhm_TestCase_Table_Data.get("Amount"));
			GuidewireAutomate("PaymentInstrument", PaymentInstrument, "moveToElement", "moveToElement");

			GuidewireAutomate("PaymentInstrument", PaymentInstrument, "selectByVisibleText", lhm_TestCase_Table_Data.get("PaymentInstrument"));
			GuidewireAutomate("Execute Without Distribution", ExecuteWithoutDistribution_button, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void DirectBillPayment() throws Throwable {
		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("DirectBillPayment");

		GuidewireAutomate_Validation("Screen Header", DBP_Header, "equals", "Direct Bill Payment");
		GuidewireAutomate("Amount", DBP_Amount, "sendKeys", lhm_TestCase_Table_Data.get("TD_Amount"));
		GuidewireAutomate("Payment Instrument", DBP_PaymentInstrument, "selectByVisibleText", "Cash");
		GuidewireAutomate("Amount", DBP_Description, "sendKeys", "Automation");
		// Code to click by using Action Class
		WebElement dbp_button = getElement(DBP_ExecuteWithoutDistribution);
		Actions    build      = new Actions(driver);
		build.moveToElement(dbp_button).click(dbp_button);
		build.perform();

		// GuidewireAutomate("Execute Without Distribution", DBP_ExecuteWithoutDistribution, "clickAndwait", "click");
		// GuidewireAutomate("Execute Without Distribution", DBP_ExecuteWithoutDistribution, "click", "");

	}

	public static void SuspensePaymentProcess() throws Throwable {
		try {
			lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("payment");

			getStaleElement("New Payment", NewPayment);
			GuidewireAutomate("New Payment", NewPayment, "click", "click");
			GuidewireAutomate_Validation("New Suspense Payment", NewSuspensePayment_Header, "equals", "New Suspense Payment");
			getStaleElement("Payment Date", PaymentDate);
			GuidewireAutomate("Payment Date", PaymentDate, "sendKeys", lhm_TestCase_Table_Data.get("PaymentDate"));
			GuidewireAutomate("Amount1", Amount1, "sendKeys", lhm_TestCase_Table_Data.get("Amount"));
			GuidewireAutomate("PaymentInstrument", PaymentInstrument, "selectByVisibleText", lhm_TestCase_Table_Data.get("PaymentInstrument"));
			getStaleElement("PaymentInstrument", PaymentInstrument);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void FundsTracking() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", FundsTracking_Header, "equals", "Funds Tracking");
		GuidewireAutomate("FundsSources", FT_FundsSources_Tab, "click", "");
		GuidewireAutomate("FundsUses", FT_FundsUses_Tab, "click", "");

	}

	public static void Payments() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", Payments_Header, "equals", "Payments");
		GuidewireAutomate("Payment Details", Payments_PaymentDetails_Tab, "click", "");
		GuidewireAutomate("Suspense Items", Payments_SuspenseItems_Tab, "click", "");

		GuidewireAutomate("Previous Versions", Payments_PreviousVersions_Tab, "clickAndwait", "");

	}

	public static void Payments2() throws Throwable {
		try {
			lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("payment");
			GuidewireAutomate_Validation("Payments", Payment_Header, "equals", "Payments");
			GuidewireAutomate("ActionButton", ActionButton, "click", "click");
			GuidewireAutomate("Reverse Payment", ReversePayment, "click", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void NonPayment_Invoices() throws Throwable {
		try {
			lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("npInvoices");

			/*
			 * GuidewireAutomate("Account button", AD_AB_AccountSearch_Button, "click", "click"); GuidewireAutomate("AccountNumber",
			 * AD_AB_AccountNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("AD_AB_AccountNumber")); GuidewireAutomate("Account Search",
			 * AD_AB_AccountNumber_Search, "click", "click");
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
			lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("npInvoices");

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

	public static void PaymentReverse() throws Throwable {
		try {
			lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("payment");
			GuidewireAutomate_Validation("Payments", Payment_Header, "equals", "Payments");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void PaymentsScreen_ReverseMethods() throws Throwable {
		GuidewireAutomate_Validation("Screen Header", Payments_Header, "equals", "Payments");
		GuidewireAutomate("ActionButton", ActionButton, "click", "");
		GuidewireAutomate("Reverse payment", ReversePayment, "click", "");
		Thread.sleep(2000);
		GuidewireAutomate("Previous Versions", Payments_PreviousVersions_Tab, "clickAndwait", "");

	}

	public static void PaymentSchedule() {
		// TODO Auto-generated method stub

	}
}
