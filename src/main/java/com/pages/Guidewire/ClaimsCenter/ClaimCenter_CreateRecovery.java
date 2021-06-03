package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class ClaimCenter_CreateRecovery extends SeleniumWebDriver_Commands implements ClaimCenter_CreateRecovery_PO {

	public ClaimCenter_CreateRecovery(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void createRecovery() throws Throwable {
		String insuredName =ClaimCenter_Resuables.infoBar("InsuredName");
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("recovery", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", CreateRecovery_Header, "equals", "Create Recovery");
		GuidewireAutomate("Payer", CR_Payer, "selectByVisibleText", insuredName);
		GuidewireAutomate("Reserve Line", CR_ReserveLine, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("ReserveLine"));
		GuidewireAutomate("CostType", PD_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
		GuidewireAutomate("CostCategory", PD_CostCategory, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("CostCategory"));

		GuidewireAutomate("Recovery Category", CR_RecoveryCategory, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("RecoveryCategory"));
		GuidewireAutomate("Category", CR_Category, "selectByVisibleText", lhm_TestCase_Table_Data.get("Category"));
		GuidewireAutomate("Amount", CR_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Amount"));

	}

}
