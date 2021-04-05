package com.pages.Guidewire.WorkersCompensation;

import org.openqa.selenium.By;

public interface WC_Payment_PO {
	final By Payment_Tab=By.xpath("//*[@id='SubmissionWizard-BillingInfo']/div/div[3]");
	final By billingMethod=By.name("SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-BillingMethod");
	final By workbookError=By.xpath("//div[@id='WebMessageWorksheet-WebMessageWorksheetScreen-grpMsgs-0-0']/descendant::div[@class='gw-message']");

}
