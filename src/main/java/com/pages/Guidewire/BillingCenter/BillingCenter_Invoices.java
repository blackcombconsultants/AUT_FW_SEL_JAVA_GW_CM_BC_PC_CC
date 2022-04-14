package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class BillingCenter_Invoices extends SeleniumWebDriver_Commands implements BillingCenter_Invoices_PO {

	public BillingCenter_Invoices(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}
	/*
	 * Invoices Invoice Stream
	 */

	public static void Invoices_InvoiceInformation_Verify() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_BillingCenter("Invoices");
		GuidewireAutomate_Validation("Screen Header", Invoices_Header, "equals", "Invoices");
		// GuidewireAutomate_Validation("Due Date", Invoices_IInfo_DueDate,
		// "",lhm_TestCase_Table_Data.get("TD_DueDate"));
		//GuidewireAutomate_Validation("Status", Invoices_IInfo_Status, "equals", lhm_TestCase_Table_Data.get("TD_Status"));
		GuidewireAutomate_Validation("Status AdHoc", Invoices_IInfo_Status_AdHoc, "equals", lhm_TestCase_Table_Data.get("TD_AdHoc"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void Invoices_InvoiceInformation_Edit() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_BillingCenter("Invoices");

		GuidewireAutomate("ChangeInvoiceDates", ChangeInvoiceDates, "click", "");
		GuidewireAutomate("BillDate", Invoices_IInfo_BillDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_BillDate"));
		GuidewireAutomate("Update Button", BillingCenter_Resuables.Update_Button, "clickAndwait", "");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void Invoices_InvoiceItems() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_BillingCenter("Invoices");
		GuidewireAutomate("IItems Policy", Invoices_IItems_Policy, "click", "");
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	//Divya
	//30-03-2022
	public static void Invoices_Verify() throws Throwable {
		//lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_BillingCenter("Invoices");
		GuidewireAutomate_Validation("Screen Header", Invoices_Header, "equals", "Invoices");
		GuidewireAutomate_Validation("Invoices_Status", Invoices_Status, "equals", "Due");
		if (Invoices_Status.equals("Due")) {
			//GuidewireAutomate_Validation("Due", Invoices_Status, "visibilityOf", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_Liability_BodilyInjuryPropertyDamage"));
			GuidewireAutomate("Invoices_Status", Invoices_Status, "visibilityOf", lhm_TestCase_Table_Data.get("Invoices"));
		}
	}
	public static void ChargesScreen() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_BillingCenter("Policy");
			GuidewireAutomate_Validation("Charges", Charges_Header, "equals", "Charges");
			GuidewireAutomate_Validation("Date", Date, "fetchValue", lhm_TestCase_Table_Data.get("Date"));
			GuidewireAutomate_Validation("Charge Type", ChargeType, "fetch", lhm_TestCase_Table_Data.get("TD_ChargesType")+"Reversed");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ChargeReversal() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_BillingCenter("Policy");
			GuidewireAutomate_Validation("Charge Reversal Wizard", ChargeReversalWizard_Header, "equals", "Charge Reversal Wizard - Step 1 of 2");
			GuidewireAutomate("Type", Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_ChargesType"));
			GuidewireAutomate("Search", Search, "click", "click");
			GuidewireAutomate("Select Taxes", SelectTaxes, "click", "click");
			//GuidewireAutomate("Next Button", NextButton, "click", "click");
			GuidewireAutomate_Validation("Charge Reversal Wizard - Step 2 of 2", ChargeReversalWizard_Header, "contains", "Charge Reversal");
			//GuidewireAutomate_Validation("New Charge", NewCharge, "equals", lhm_TestCase_Table_Data.get("TD_ChargesType"));
			GuidewireAutomate("Reversal Reason", ReversalReason, "selectByVisibleText", lhm_TestCase_Table_Data.get("Reversal_Reason"));
			GuidewireAutomate("Finish", Finish, "click", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
