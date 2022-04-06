package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.By;

public interface BillingCenter_Invoices_PO {

	final By Invoices_Header=By.xpath("//div[@id='AccountDetailInvoices-AccountDetailInvoicesScreen-ttlBar']//div[ @class='gw-TitleBar--title']");
	
	/*
	 *   Invoices InvoiceInformation
    */
	final By Invoices_IInfo_DueDate=By.xpath("//div[contains(@id,'AccountInvoiceInformationInputSet-PaymentDueDate')]//div[@class='gw-value-readonly-wrapper']");
	final By Invoices_IInfo_Status=By.xpath("//div[contains(@id,'AccountInvoiceInformationInputSet-Status_Input')]//div[@class='gw-value-readonly-wrapper']");
	final By Invoices_IInfo_Status_AdHoc=By.xpath("//div[contains(@id,'AccountInvoiceInformationInputSet-AdHoc')]//div[@class='gw-value']//div[@class='gw-label']");
	
	final By ChangeInvoiceDates=By.xpath("//div[contains(@id,'DetailPanel-InvoiceDetailDV_tb-Edit')]//div[@role='button']");
	final By Invoices_IInfo_BillDate=By.xpath("//input[contains(@name,'InvoiceDetailDV-AccountInvoiceInformationInputSet-InvoiceDate')]");

	/*
	 * Invoices InvoiceItems
	 */
	final By Invoices_IItems_Policy=By.xpath("//td[contains(@id,'InvoiceItemsLV_Policy')]//div[contains(@id,'InvoiceItemsLV_Policy')]//div[@class='gw-ActionValueWidget']");

	//divya
	final By Invoices_Status=By.xpath("//td[contains(@id,'AccountDetailInvoices-AccountDetailInvoicesScreen-DetailPanel-AccountInvoicesLV-0-Status')]//div[text()='Due']");
	final By ChargeReversalWizard_Header = By.xpath("//div[contains(@id,'-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By Type = By.xpath("//select[contains(@name,'ChargeSearchDV-ChargePatternCriterion')]");
	final By Search = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By SelectTaxes = By.xpath("//div[contains(@id,'-0-Select')]");
	final By NextButton = By.xpath("//div[@id='AccountNewChargeReversalWizard-Next']");
	final By NewCharge = By.xpath("//div[contains(@id,'NewChargeReversalConfirmationDV-NewCharge')]//div[@class='gw-value-readonly-wrapper']");
	final By ReversalReason = By.xpath("//select[contains(@name,'NewChargeReversalConfirmationDV-Reason')]");
	final By Finish = By.xpath("//div[@id='AccountNewChargeReversalWizard-Finish']");
	final By Charges_Header = By.xpath("//div[@id='AccountDetailCharges-AccountDetailChargesScreen-ttlBar']//div[@class='gw-TitleBar--title']");
	final By Date = By.xpath("//div[contains(@id,'ChargeDateHeader_inner')]//div[@class='gw-label']");
	final By ChargeType = By.xpath("//div[contains(@id,'ChargesLV-ChargeTypeHeader_inner')]//div[@class='gw-label']");



}
