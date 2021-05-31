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
}
