package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class BillingCenter_PolicySummary extends SeleniumWebDriver_Commands implements BillingCenter_PolicySummary_PO {

	public BillingCenter_PolicySummary(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	
	public static void PolicySummary_Overview() throws Throwable
	{

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("PolicySummary",
				strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", PolicySummary_Header, "equals","Policy Summary");
		GuidewireAutomate_Validation("Cancellation Status", PS_Overview_CancellationStatus, "equals",
				lhm_TestCase_Table_Data.get("TD_CancellationStatus"));
		GuidewireAutomate_Validation("Currency", PS_Overview_Currency, "equals",
				lhm_TestCase_Table_Data.get("TD_Currency"));
		GuidewireAutomate_Validation("Billing Method", PS_Overview_BillingMethod, "equals",
				lhm_TestCase_Table_Data.get("TD_BillingMethod"));
		GuidewireAutomate_Validation("Send Invoices By", PS_Overview_SendInvoicesBy, "equals",
				lhm_TestCase_Table_Data.get("TD_SendInvoicesBy"));
		GuidewireAutomate_Validation("Default Payment Method", PS_Overview_DefaultPaymentMethod, "equals",
				lhm_TestCase_Table_Data.get("TD_DefaultPaymentMethod"));
		GuidewireAutomate_Validation("Payment Plan", PS_Overview_PaymentPlan, "equals",
				lhm_TestCase_Table_Data.get("TD_PaymentPlan"));
      
	}

}
