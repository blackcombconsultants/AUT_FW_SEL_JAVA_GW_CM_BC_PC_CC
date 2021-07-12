package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class ClaimCenter_AutoFirstandFinal extends SeleniumWebDriver_Commands implements ClaimCenter_AutoFirstandFinal_PO {

	public ClaimCenter_AutoFirstandFinal(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void NewClaim_AutoFirstandFinal() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("AutoFirstandFinal",
				strTestCaseName);

		String insured = ClaimCenter_Resuables.infoBar("InsuredName");

		GuidewireAutomate_Validation("Screen Header", AutoFirstandFinal_Header, "equals",
				"Step 2 of 2: Auto First and Final");

		String strDynamicXpath = lhm_TestCase_Table_Data.get("WhoreportedClaim");
		By WhoreportedClaim = By.xpath("//span[@class='gw-label--inner' and text()='" + strDynamicXpath
				+ "']//parent::label[@class='gw-RangeRadioValueWidget--label']//input[contains(@id,'FirstFinalReportedAgencyRadioButton')]");

		GuidewireAutomate("WhoreportedClaim_Insured", WhoreportedClaim, "click", "NA");
		GuidewireAutomate("Name", AFF_Name, "selectByVisibleText", insured);

		GuidewireAutomate("Loss Description", AFF_Damage_LossDescription, "clearANDsendKeys",
				lhm_TestCase_Table_Data.get("LossDescription"));
		GuidewireAutomate("Claimant Name", AFF_Claimant_Name, "selectByVisibleText", insured);
		GuidewireAutomate("Location", Location, "selectByVisibleText", lhm_TestCase_Table_Data.get("Location"));
		GuidewireAutomate("State", State, "selectByVisibleText", lhm_TestCase_Table_Data.get("State"));
		GuidewireAutomate("Repair", AFF_Repair, "click", "NA");

		searchRepairShop();
		GuidewireAutomate("Financials Name", AFF_Financials_Name, "selectByVisibleText", insured);
		GuidewireAutomate_Validation("Screen Header", AutoFirstandFinal_Header, "equals",
				"Step 2 of 2: Auto First and Final");
		GuidewireAutomate("Financials PayeeType", AFF_Financials_PayeeType, "selectByVisibleTextAndwait",
				lhm_TestCase_Table_Data.get("PayeeType"));
		GuidewireAutomate("Financials Amount", AFF_Financials_Amount, "clearANDsendKeys",
				lhm_TestCase_Table_Data.get("FinancialsAmount"));
		GuidewireAutomate("Financials State", AFF_Financials_State, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("FinancialsState"));
		GuidewireAutomate("Finish_Button", Finish_Button, "click", "NA");

	}
	
	//----->Click on DuplicateClaim Cancel 09-07-2021
		public static void newAutobodyRepairShop() throws Throwable {
			//----->Based on Type Of Contact in partiesInvolved we have to select name in line no 164  09-07-2021
			
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("AutoFirstandFinal",
					strTestCaseName);
			GuidewireAutomate("NewAutobodyRepairShop", AFF_NewAutobodyRepairShop, "click", "NA");
			GuidewireAutomate_Validation("Screen Header", NewAutoRepairShop_Header, "equals",
					"New Auto Repair Shop");
			
			//String AutoRepairShopName = lhm_TestCase_Table_Data.get("AutoRepairShopName");
			String AutoRepairShopName = "AutoRepairShopName" + getRandomNumeric(5);
			GuidewireAutomate("AutoRepairShop_Name", AFF_AutoRepairShop_Name,
					  "clearANDsendKeys", AutoRepairShopName); 
			

			String TaxID = lhm_TestCase_Table_Data.get("AutoRepairShopTaxID");
			if (TaxID.equalsIgnoreCase("345-34-310")) {
				String NewTaxId = TaxID + getRandomNumeric(1);
				GuidewireAutomate("Comments", AFF_AutoRepairShop_TaxID, "clearANDsendKeys", NewTaxId);
			} else {
				GuidewireAutomate("Comments", AFF_AutoRepairShop_TaxID, "clearANDsendKeys", TaxID);
			}

			GuidewireAutomate("Address1", AFF_AutoRepairShop_Address1, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("Address1"));
			GuidewireAutomate("City", AFF_AutoRepairShop_City, "clearANDsendKeys", lhm_TestCase_Table_Data.get("City"));
			GuidewireAutomate("County", AFF_AutoRepairShop_County, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("County"));
			GuidewireAutomate("State", AFF_AutoRepairShop_State, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("AutoRepairShop_State"));
			GuidewireAutomate("ZIPCode", AFF_AutoRepairShop_ZIPCode, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("ZIPCode"));
			GuidewireAutomate("Update", Update, "clickAndwait", "NA");
			GuidewireAutomate("Update", Update, "clickAndwait", "NA");
		}

		public static void searchRepairShop() throws Throwable
		{
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("AutoFirstandFinal",
					strTestCaseName);
			GuidewireAutomate("SearchRepairShop", SearchRepairShop, "clickAndwait", "NA");
			GuidewireAutomate_Validation("Screen Header", SearchAddressBook_Header, "equals",
					"Search Address Book For Vendors");
			GuidewireAutomate("SearchAddressBook_Type", SearchAddressBook_Type, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("SearchAddressBookType"));
			GuidewireAutomate("SearchAddressBook_Name", SearchAddressBook_Name, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SearchAddressBookName"));
			GuidewireAutomate("SearchAddressBook_Search", SearchAddressBook_Search, "clickAndwait", "NA");

			String strDynamicXpath = lhm_TestCase_Table_Data.get("SearchAddressBookName");
			By selectVendor = By.xpath("//div[@class='gw-ActionValueWidget' and text()='"+strDynamicXpath+"']/ancestor::td[contains(@id,'DisplayName_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");
			GuidewireAutomate("selectVendor", selectVendor, "clickAndwait", "NA");

		}
	
}
