package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CC_CreateRecovery extends SeleniumWebDriver_Commands {

	public CC_CreateRecovery(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By CreateRecovery_Header = By.xpath("//div[contains(@id,'NewRecoveryScreen-ttlBar')]//div[@class='gw-TitleBar--title']");

	/*
	 * Create Recovery
	 */

	private static By CR_Payer                    = By.xpath("//select[contains(@name,'RecoveryDetailDV-Payer')]");
	private static By CR_ReserveLine              = By.xpath("//select[contains(@name,'ReserveLineInputSet-ReserveLine')]");
	private static By PD_CostType                 = By.xpath("//select[contains(@name,'ReserveLineInputSet-CostType')]");
	private static By PD_CostCategory             = By.xpath("//select[contains(@name,'ReserveLineInputSet-CostCategory')]");
	private static By CR_RecoveryCategory         = By.xpath("//select[contains(@name,'RecoveryDetailDV-RecoveryCategory')]");
	private static By CR_Category                 = By.xpath("//select[contains(@name,'LineCategory')]");
	private static By CR_Amount                   = By.xpath("//input[contains(@name,'EditableRecoveryLineItemsLV-0-Amount')]");
	private static By CR_Currency                 = By.xpath("//select[contains(@name,'RecoveryDetailDV-Currency')]");
	/***
	 * Edit Recovery Reserve
	 */
	private static By EditRecoveryReserve_Header  = By.xpath("//div[contains(@id,'NewReserveSetScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	private static By Add_Button                  = By.xpath("//div[@id='NewRecoveryReserveSet-NewReserveSetScreen-Add']//div[@role='button']");
	private static By RR_CostType                 = By.xpath("//select[contains(@name,'EditableRecoveryReservesLV-0-CostType')]");
	private static By RR_CostCategory             = By.xpath("//select[contains(@name,'EditableRecoveryReservesLV-0-CostCategory')]");
	private static By RR_RecoveryCategory         = By.xpath("//select[contains(@name,'EditableRecoveryReservesLV-0-RecoveryCategory')]");
	private static By RR_Amount                   = By.xpath("//input[contains(@name,'EditableRecoveryReservesLV-0-NewOpenRecoveryReserves')]");
	private static By Save_Button                 = By.xpath("//div[@id='NewRecoveryReserveSet-NewReserveSetScreen-Update']//div[@role='button']");
	private static By FinancialTransaction_Header = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	private static By RR_Exposure                 = By.xpath("//select[contains(@name,'ReservesLV-0-Exposure')]");

	public static void createRecovery() throws Throwable {
		String insuredName = CC_Reusables.infoBar("InsuredName");
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("recovery");
		GuidewireAutomate_Validation("Screen Header", CreateRecovery_Header, "equals", "Create Recovery");
		GuidewireAutomate("Payer", CR_Payer, "selectByVisibleText", insuredName);
		GuidewireAutomate("Reserve Line", CR_ReserveLine, "selectByVisibleText", lhm_TestCase_Table_Data.get("ReserveLine"));
		GuidewireAutomate("CostType", PD_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
		GuidewireAutomate_Validation("Screen Header", CreateRecovery_Header, "equals", "Create Recovery");

		GuidewireAutomate("CostCategory", PD_CostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostCategory"));

		GuidewireAutomate("Recovery Category", CR_RecoveryCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("RecoveryCategory"));
		GuidewireAutomate("Category", CR_Category, "selectByVisibleText", lhm_TestCase_Table_Data.get("Category"));
		GuidewireAutomate("Amount", CR_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Amount"));

	}
	// Author:Misba
	public static void ValuesaredisplayedinRecoveryLineCategorytypelist() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("recovery");
			GuidewireAutomate_Validation("Screen Header", EditRecoveryReserve_Header, "equals", "Edit Recovery Reserves");
			GuidewireAutomate("Add Button", Add_Button, "clickAndwait", "click");
			GuidewireAutomate("Exposure", RR_Exposure, "selectByIndex", "1");
			GuidewireAutomate("CostType", RR_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
			getStaleElement("CostType", RR_CostType);
			GuidewireAutomate("CostCategory", RR_CostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostCategory"));
			getStaleElement("CostCategory", RR_CostCategory);
			GuidewireAutomate("Recovery Category", RR_RecoveryCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("RecoveryCategory"));
			getStaleElement("Recovery Category", RR_RecoveryCategory);
			GuidewireAutomate("Amount", RR_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Amount"));
			GuidewireAutomate("Save Button", Save_Button, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", FinancialTransaction_Header, "equals", "Financials: Transactions");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static void CreateRecovery_LineItems() throws Throwable {
		try {
			String insuredName = CC_Reusables.infoBar("InsuredName");
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("recovery");
			GuidewireAutomate_Validation("Screen Header", CreateRecovery_Header, "equals", "Create Recovery");
			GuidewireAutomate("Payer", CR_Payer, "selectByVisibleText", insuredName);
			getStaleElement("Payer", CR_Payer);
			GuidewireAutomate("Reserve Line", CR_ReserveLine, "selectByVisibleText", lhm_TestCase_Table_Data.get("ReserveLine"));
			getStaleElement("Reserve Line", CR_ReserveLine);
			GuidewireAutomate("Recovery Category", CR_RecoveryCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("RecoveryCategory1"));
			GuidewireAutomate_Validation("Category", CR_Category, "getOptionscontains", lhm_TestCase_Table_Data.get("Category"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:21/01/2022
	public static void VerifyCostTypeList() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("recovery");
			GuidewireAutomate_Validation("Screen Header", EditRecoveryReserve_Header, "equals", "Edit Recovery Reserves");
			GuidewireAutomate("Add Button", Add_Button, "clickAndwait", "click");
			GuidewireAutomate_Validation("CostType", RR_CostType, "getOptionscontains", lhm_TestCase_Table_Data.get("CostType"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:21/01/2022
	public static void VerifyCostCategorywithCostTypeIndemnity() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("recovery");
			GuidewireAutomate_Validation("Screen Header", EditRecoveryReserve_Header, "equals", "Edit Recovery Reserves");
			GuidewireAutomate("Add Button", Add_Button, "clickAndwait", "click");
			GuidewireAutomate("CostType", RR_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
			getStaleElement("CostType", RR_CostType);
			GuidewireAutomate_Validation("CostCategory", RR_CostCategory, "getOptionscontains", lhm_TestCase_Table_Data.get("CostCategory"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:21/01/2022
	public static void VerifyCostCategorywithCostTypeExpenseAO() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("recovery");
			GuidewireAutomate_Validation("Screen Header", EditRecoveryReserve_Header, "equals", "Edit Recovery Reserves");
			GuidewireAutomate("Add Button", Add_Button, "clickAndwait", "click");
			GuidewireAutomate("CostType", RR_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
			getStaleElement("CostType", RR_CostType);
			GuidewireAutomate_Validation("CostCategory", RR_CostCategory, "getOptionscontains", lhm_TestCase_Table_Data.get("CostCategory"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:21/01/2022
	public static void VerifyCostCategorywithCostTypeExpenseDCC() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("recovery");

			GuidewireAutomate_Validation("Screen Header", EditRecoveryReserve_Header, "equals", "Edit Recovery Reserves");
			GuidewireAutomate("Add Button", Add_Button, "clickAndwait", "click");
			GuidewireAutomate("CostType", RR_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
			getStaleElement("CostType", RR_CostType);
			GuidewireAutomate("CostCategory", RR_CostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostCategory"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Author:Misba
	// Date:21/01/2022
	public static void VerifyCurrencyAdded() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("recovery");

			GuidewireAutomate_Validation("Screen Header", CreateRecovery_Header, "equals", "Create Recovery");
			GuidewireAutomate_Validation("Currency", CR_Currency, "getOptionscontains", lhm_TestCase_Table_Data.get("CR_Currency"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
