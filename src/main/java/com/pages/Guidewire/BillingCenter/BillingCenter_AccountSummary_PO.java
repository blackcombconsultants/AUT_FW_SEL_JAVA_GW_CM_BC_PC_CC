package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.By;

public interface BillingCenter_AccountSummary_PO {

	final By AS_Header=By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-ttlBar']//div[ @class='gw-TitleBar--title']");

	/*
	 * AS Overview
	 */

	final By AS_Overview_AccountName = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-Name']//div[@class='gw-ActionValueWidget']");
    final By AS_Overview_AccountSince=By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-AccountSinceValue']");
	final By AS_Overview_PrimaryContact=By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-PrimaryContact']//div[@class='gw-ActionValueWidget']");
    final By AS_Overview_Address=By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-Address']//div[@class='gw-value-readonly-wrapper']");
    final By  AS_Overview_PhoneEmail=By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-Phone']//div[@class='gw-value-readonly-wrapper']");
    final By  AS_Overview_Delinquencies=By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-description']");
    final By AS_Overview_Currency=By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-Currency']//div[@class='gw-label']");
    final By   AS_Overview_SendInvoicesBy=By.xpath("//div[contains(@id,'SendInvoicesBy')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
    final By  AS_Overview_PaymentInstrument=By.xpath("//div[contains(@id,'PaymentMethod')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");

	/*
	 * AS Financials
	 */
	final By AS_Financials_NextInvoiceDue=By.xpath("//div[contains(@id,'NextInvoiceDue_button')]");
	final By AS_Financials_LastPaymentReceived=By.xpath("//div[contains(@id,'LastPaymentReceived_button')]");
	final By AS_Financials_DefaultUnapplied=By.xpath("//div[contains(@id,'TotalUnappliedAmount_button')]");
	final By AS_Financials_PayoffAmount = By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-PayoffAmount']//div[@class='gw-value-readonly-wrapper']");
	final By AS_Financials_PlannedInvoices=By.xpath("//div[@id='AccountSummary-AccountSummaryScreen-NumPlannedInvoices_button']");

	/*
	 * AS PolicyPeriods
	 */
	final By AS_PolicyPeriods_EffectiveDate=By.xpath("//td[contains(@id,'PolicyPerEffDate_Cell')]//div[@class='gw-value-readonly-wrapper']");
	final By AS_PolicyPeriods_ExpirationDate=By.xpath("");
	final By AS_PolicyPeriods_PolicyNumber = By
			.xpath("//table[@class='gw-ListViewWidget--table gw-table']//td[contains(@id,'PolicyNumber_Cell')]");
	final By AS_PolicyPeriodsTotalValue = By
			.xpath("//table[@class='gw-ListViewWidget--table gw-table']//td[contains(@id,'TotalValue_Cell')]");



}
