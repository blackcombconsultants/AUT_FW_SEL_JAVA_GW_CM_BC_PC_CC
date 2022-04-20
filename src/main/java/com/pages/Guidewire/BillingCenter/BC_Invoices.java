package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class BC_Invoices extends SeleniumWebDriver_Commands {

	private static By Invoices_Header = By.xpath("//div[@id='AccountDetailInvoices-AccountDetailInvoicesScreen-ttlBar']//div[ @class='gw-TitleBar--title']");

	/*
	 * Invoices InvoiceInformation
	 */
	private static By Invoices_IInfo_DueDate      = By.xpath("//div[contains(@id,'AccountInvoiceInformationInputSet-PaymentDueDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By Invoices_IInfo_Status       = By.xpath("//div[contains(@id,'AccountInvoiceInformationInputSet-Status_Input')]//div[@class='gw-value-readonly-wrapper']");
	private static By Invoices_IInfo_Status_AdHoc = By.xpath("//div[contains(@id,'AccountInvoiceInformationInputSet-AdHoc')]//div[@class='gw-value']//div[@class='gw-label']");

	private static By ChangeInvoiceDates      = By.xpath("//div[contains(@id,'DetailPanel-InvoiceDetailDV_tb-Edit')]//div[@role='button']");
	private static By Invoices_IInfo_BillDate = By.xpath("//input[contains(@name,'InvoiceDetailDV-AccountInvoiceInformationInputSet-InvoiceDate')]");

	/*
	 * Invoices InvoiceItems
	 */
	private static By Invoices_IItems_Policy = By.xpath("//td[contains(@id,'InvoiceItemsLV_Policy')]//div[contains(@id,'InvoiceItemsLV_Policy')]//div[@class='gw-ActionValueWidget']");

	// divya
	private static By Invoices_Status             = By.xpath("//td[contains(@id,'AccountDetailInvoices-AccountDetailInvoicesScreen-DetailPanel-AccountInvoicesLV-0-Status')]//div[text()='Due']");
	private static By ChargeReversalWizard_Header = By.xpath("//div[contains(@id,'-ttlBar')]//div[@class='gw-TitleBar--title']");
	private static By Type                        = By.xpath("//select[contains(@name,'ChargeSearchDV-ChargePatternCriterion')]");
	private static By Search                      = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	private static By SelectTaxes                 = By.xpath("//div[contains(@id,'-0-Select')]");
	private static By NextButton                  = By.xpath("//div[@id='AccountNewChargeReversalWizard-Next']");
	private static By NewCharge                   = By.xpath("//div[contains(@id,'NewChargeReversalConfirmationDV-NewCharge')]//div[@class='gw-value-readonly-wrapper']");
	private static By ReversalReason              = By.xpath("//select[contains(@name,'NewChargeReversalConfirmationDV-Reason')]");
	private static By Finish                      = By.xpath("//div[@id='AccountNewChargeReversalWizard-Finish']");
	private static By Charges_Header              = By.xpath("//div[@id='AccountDetailCharges-AccountDetailChargesScreen-ttlBar']//div[@class='gw-TitleBar--title']");
	private static By Date                        = By.xpath("//div[contains(@id,'ChargeDateHeader_inner')]//div[@class='gw-label']");
	private static By ChargeType                  = By.xpath("//div[contains(@id,'ChargesLV-ChargeTypeHeader_inner')]//div[@class='gw-label']");

	public BC_Invoices(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}
	/*
	 * Invoices Invoice Stream
	 */

	public static void Invoices_InvoiceInformation_Verify() throws Throwable {
		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("Invoices");
		GuidewireAutomate_Validation("Screen Header", Invoices_Header, "equals", "Invoices");
		// GuidewireAutomate_Validation("Due Date", Invoices_IInfo_DueDate,
		// "",lhm_TestCase_Table_Data.get("TD_DueDate"));
		// GuidewireAutomate_Validation("Status", Invoices_IInfo_Status, "equals", lhm_TestCase_Table_Data.get("TD_Status"));
		GuidewireAutomate_Validation("Status AdHoc", Invoices_IInfo_Status_AdHoc, "equals", lhm_TestCase_Table_Data.get("TD_AdHoc"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void Invoices_InvoiceInformation_Edit() throws Throwable {
		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("Invoices");

		GuidewireAutomate("ChangeInvoiceDates", ChangeInvoiceDates, "clickAndwait", "click");
		GuidewireAutomate("BillDate", Invoices_IInfo_BillDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_BillDate"));
		BC_Resuables.clickButton("Update");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void Invoices_InvoiceItems() throws Throwable {
		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("Invoices");
		GuidewireAutomate("IItems Policy", Invoices_IItems_Policy, "clickAndwait", "click");
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	// Divya
	// 30-03-2022
	public static void Invoices_Verify() throws Throwable {
		// lhm_TestCase_Table_Data = BillingCenter_Resuables.getData_BillingCenter("Invoices");
		GuidewireAutomate_Validation("Screen Header", Invoices_Header, "equals", "Invoices");
		GuidewireAutomate_Validation("Invoices_Status", Invoices_Status, "equals", "Due");
		if (Invoices_Status.equals("Due")) {
			// GuidewireAutomate_Validation("Due", Invoices_Status, "visibilityOf",
			// lhm_TestCase_Table_Data.get("PAC_CT_CATAV_Liability_BodilyInjuryPropertyDamage"));
			GuidewireAutomate("Invoices_Status", Invoices_Status, "visibilityOf", lhm_TestCase_Table_Data.get("Invoices"));
		}
	}
	public static void ChargesScreen() throws Throwable {
		try {
			lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("Policy");
			GuidewireAutomate_Validation("Charges", Charges_Header, "equals", "Charges");
			GuidewireAutomate_Validation("Date", Date, "fetchValue", lhm_TestCase_Table_Data.get("Date"));
			GuidewireAutomate_Validation("Charge Type", ChargeType, "fetch", lhm_TestCase_Table_Data.get("TD_ChargesType") + "Reversed");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ChargeReversal() throws Throwable {
		try {
			lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("Policy");
			GuidewireAutomate_Validation("Charge Reversal Wizard", ChargeReversalWizard_Header, "equals", "Charge Reversal Wizard - Step 1 of 2");
			GuidewireAutomate("Type", Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_ChargesType"));
			GuidewireAutomate("Search", Search, "clickAndwait", "click");
			GuidewireAutomate("Select Taxes", SelectTaxes, "clickAndwait", "click");
			// GuidewireAutomate("Next Button", NextButton, "clickAndwait", "click");
			GuidewireAutomate_Validation("Charge Reversal Wizard - Step 2 of 2", ChargeReversalWizard_Header, "contains", "Charge Reversal");
			// GuidewireAutomate_Validation("New Charge", NewCharge, "equals", lhm_TestCase_Table_Data.get("TD_ChargesType"));
			GuidewireAutomate("Reversal Reason", ReversalReason, "selectByVisibleText", lhm_TestCase_Table_Data.get("Reversal_Reason"));
			GuidewireAutomate("Finish", Finish, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
