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

	public static void Invoices_InvoiceInformation_Verify() throws Throwable
	{
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Invoices",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", Invoices_Header, "equals","Invoices");
		GuidewireAutomate_Validation("Due Date", Invoices_IInfo_DueDate, "",lhm_TestCase_Table_Data.get("TD_DueDate"));
		GuidewireAutomate_Validation("Status", Invoices_IInfo_Status, "", lhm_TestCase_Table_Data.get("TD_Status"));
		GuidewireAutomate_Validation("Status AdHoc", Invoices_IInfo_Status_AdHoc, "", lhm_TestCase_Table_Data.get("TD_AdHoc"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}
	
	public static void Invoices_InvoiceInformation_Edit() throws Throwable
	{
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Invoices",
				strTestCaseName);
		
		GuidewireAutomate("ChangeInvoiceDates", ChangeInvoiceDates, "click", "");
		GuidewireAutomate("BillDate", Invoices_IInfo_BillDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_BillDate"));
		GuidewireAutomate("Update Button", BillingCenter_Resuables.Update_Button, "clickAndwait", "");
		

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
   }
	
	public static void Invoices_InvoiceItems() throws Throwable{
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Invoices",
				strTestCaseName);
		GuidewireAutomate("IItems Policy", Invoices_IItems_Policy, "click", "");
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}
	
	


}
