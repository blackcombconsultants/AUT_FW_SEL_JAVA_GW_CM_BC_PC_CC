package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.By;

public interface BillingCenter_PolicySummary_PO {

	final By PolicySummary_Header=By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-ttlBar']//div[ @class='gw-TitleBar--title']");
  
	/*
	 * PolicySummary overview
	 */
    
    final By PS_Overview_CancellationStatus=By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-CancellationStatus']//div[@class='gw-value-readonly-wrapper']");
    final By PS_Overview_Currency=By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-Currency']//div[@class='gw-label']");
    final By PS_Overview_BillingMethod=By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-BillingMethod']//div[@class='gw-label']");
    final By PS_Overview_SendInvoicesBy=By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-SendInvoicesBy']//div[@class='gw-label']");
    final By PS_Overview_DefaultPaymentMethod=By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-PaymentMethod']//div[@class='gw-value-readonly-wrapper']");
    final By  PS_Overview_PaymentPlan=By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-PaymentPlan']//div[@class='gw-ActionValueWidget']");




}
