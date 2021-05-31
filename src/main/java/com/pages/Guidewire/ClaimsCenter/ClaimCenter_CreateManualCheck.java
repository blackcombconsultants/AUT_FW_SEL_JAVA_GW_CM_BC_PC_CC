package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class ClaimCenter_CreateManualCheck extends SeleniumWebDriver_Commands implements ClaimCenter_CreateManualCheck_PO {

	public ClaimCenter_CreateManualCheck(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}
	
	public static void Enterpayeeinformation() throws Throwable
	{
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("manualCheck",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header",Enterpayeeinformation_Header, "equals", "Step 1 of 3: Enter payee information");
		GuidewireAutomate("Name", CD_PrimaryPayee_Namee, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_Name"));
}

	public static void Enterpaymentinformation() throws Throwable
	{
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("manualCheck",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header",Enterpaymentinformation_Header, "equals", "Step 2 of 3: Enter payment information");
		GuidewireAutomate("Reserve Line", PD_ReserveLine, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_ReserveLine"));
	   try {
		GuidewireAutomate("Payment Type", PD_PaymentType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("TD_PaymentType"));
	   }
	   catch(StaleElementReferenceException e) {
			GuidewireAutomate("Payment Type", PD_PaymentType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("TD_PaymentType"));
    }
		GuidewireAutomate("LineItems Add", PD_LineItems_Add, "clickAndwait", "NA");
		GuidewireAutomate("LineItem Category", PD_LineItem_Category, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_LineItemCategory"));
		GuidewireAutomate("LineItem Amount", PD_LineItem_Amount, "clearANDsendKeys",  lhm_TestCase_Table_Data.get("TD_LineItemAmount"));

	}
	public static void Setcheckinstructions() throws Throwable
	{
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("manualCheck",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header",Setcheckinstructions_Header, "equals", "Step 3 of 3: Set check instructions");
        GuidewireAutomate_Validation("Gross Amount",SI_GrossAmount, "equals", lhm_TestCase_Table_Data.get("TD_GrossAmount"));
		GuidewireAutomate_Validation("Net Amount",SI_NetAmount, "equals", lhm_TestCase_Table_Data.get("TD_NetAmount"));
       
		
		
	}
}
