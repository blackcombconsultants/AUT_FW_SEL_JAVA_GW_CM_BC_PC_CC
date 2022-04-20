package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class BC_PolicySummary extends SeleniumWebDriver_Commands {

	private static By PolicySummary_Header = By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-ttlBar']//div[ @class='gw-TitleBar--title']");

	/*
	 * PolicySummary overview
	 */

	private static By PS_Overview_CancellationStatus   = By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-CancellationStatus']//div[@class='gw-value-readonly-wrapper']");
	private static By PS_Overview_Currency             = By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-Currency']//div[@class='gw-label']");
	private static By PS_Overview_BillingMethod        = By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-BillingMethod']//div[@class='gw-label']");
	private static By PS_Overview_SendInvoicesBy       = By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-SendInvoicesBy']//div[@class='gw-label']");
	private static By PS_Overview_DefaultPaymentMethod = By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-PaymentMethod']//div[@class='gw-value-readonly-wrapper']");
	private static By PS_Overview_PaymentPlan          = By.xpath("//div[@id='PolicySummary-PolicySummaryScreen-PaymentPlan']//div[@class='gw-ActionValueWidget']");

	public BC_PolicySummary(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void PolicySummary_Overview() throws Throwable {

		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("PolicySummary");

		GuidewireAutomate_Validation("Screen Header", PolicySummary_Header, "equals", "Policy Summary");

		GuidewireAutomate_Validation("Cancellation Status", PS_Overview_CancellationStatus, "equals", lhm_TestCase_Table_Data.get("TD_CancellationStatus"));
		GuidewireAutomate_Validation("Currency", PS_Overview_Currency, "equals", lhm_TestCase_Table_Data.get("TD_Currency"));
		GuidewireAutomate_Validation("Billing Method", PS_Overview_BillingMethod, "equals", lhm_TestCase_Table_Data.get("TD_BillingMethod"));
		GuidewireAutomate_Validation("Send Invoices By", PS_Overview_SendInvoicesBy, "equals", lhm_TestCase_Table_Data.get("TD_SendInvoicesBy"));
		GuidewireAutomate_Validation("Default Payment Method", PS_Overview_DefaultPaymentMethod, "equals", lhm_TestCase_Table_Data.get("TD_DefaultPaymentMethod"));
		GuidewireAutomate_Validation("Payment Plan", PS_Overview_PaymentPlan, "equals", lhm_TestCase_Table_Data.get("TD_PaymentPlan"));

	}

	public static void PolicySummary_BillingSummary_Validation() throws Throwable {

		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("PolicySummary");

		GuidewireAutomate_Validation("Screen Header", PolicySummary_Header, "equals", "Policy Summary");

	}

}
