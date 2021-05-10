package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class PersonalAuto_Quote extends SeleniumWebDriver_Commands implements PersonalAuto_Quote_PO {

	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Quote(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void quoteDetails() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("quote", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Quote_Header, "equals", "Quote");

		GuidewireAutomate_Validation("PrimaryNamedInsured", QU_PrimaryNamedInsured, "equals", strAccountName);
		GuidewireAutomate_Validation("Address", QU_Address, "contains", lhm_TestCase_Table_Data.get("QU_Address"));
		GuidewireAutomate_Validation("Address Type", QU_AddressType, "equals",
				lhm_TestCase_Table_Data.get("QU_AddressType"));
	}

	public static void policyPremium_Garage1() throws Throwable {
		GuidewireAutomate_Validation("Garage 1", QU_PP_Garage1, "equals", "Garage 1");

	}

	public static void policyPremium_Vehicle1() throws Throwable {

		GuidewireAutomate_Validation("Vehicle 1", QU_PP_Vehicle1, "equals", "Vehicle 1");

		/*
		 * GuidewireAutomate_Validation("Model Year", QU_PP_V_Year, "equals",
		 * lhm_TestCase_Table_Data.get("QU_PP_V_Year"));
		 * GuidewireAutomate_Validation("Make", QU_PP_V_Make, "equals",
		 * lhm_TestCase_Table_Data.get("QU_PP_V_Make"));
		 * GuidewireAutomate_Validation("Model", QU_PP_V_Model, "equals",
		 * lhm_TestCase_Table_Data.get("QU_PP_V_Model"));
		 */
		GuidewireAutomate_Validation("VIN", QU_PP_V_VIN, "contains",
				lhm_TestCase_Table_Data.get("QU_PP_V_VIN").substring(1, 10));

		/*
		 * Liability - Bodily Injury and Property Damage Coverage
		 */
		String strLBIPDC = lhm_TestCase_Table_Data.get("QU_PP_V_Liability_BodilyInjuryPropertyDamageCoverage");
		if (!strLBIPDC.isEmpty()) {
			if (strLBIPDC.contains("refer")) {
				strLBIPDC = lhm_TestCase_Data.get("asdsadsa");
			}

			By QU_PP_V_Liability_BodilyInjuryPropertyDamageCoverage = By.xpath(
					"//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Description_Cell')]//div[contains(@id,'Description')]//div[@class='gw-value-readonly-wrapper' and text()='"
							+ strLBIPDC + "']");
			GuidewireAutomate_Validation("Liability - Bodily Injury and Property Damage Coverage",
					QU_PP_V_Liability_BodilyInjuryPropertyDamageCoverage, "equals", strLBIPDC);

			By QU_PP_V_LBIPDC_Premium = By
					.xpath("//div[contains(@id,'Description')]//div[@class='gw-value-readonly-wrapper' and text()='"
							+ strLBIPDC
							+ "']/ancestor::td[contains(@id,'Description_Cell')]/following-sibling::td[contains(@id,'TxAmount_Cell')]//div[contains(@id,'TxAmount')]//div[@class='gw-value-readonly-wrapper']");
			GuidewireAutomate_Validation("Premium", QU_PP_V_LBIPDC_Premium, "fetch",
					lhm_TestCase_Table_Data.get("QU_PP_V_LBIPDC_Premium"));

		}

		GuidewireAutomate_Validation("Sub total", QU_PP_Coverage_Subtotal, "fetch",
				lhm_TestCase_Table_Data.get("QU_PP_Coverage_Subtotal"));

	}

	public static void policyPremium_PremiumSubtotalandTaxes() throws Throwable {
		GuidewireAutomate_Validation("Premium Subtotal and Taxes", QU_PP_PremiumSubtotalandTaxes, "equals",
				"Premium Subtotal and Taxes");

		GuidewireAutomate_Validation("Premium Subtotal", QU_PP_PST_PremiumSubtotal, "fetch",
				lhm_TestCase_Table_Data.get("QU_PP_PST_PremiumSubtotal"));
		GuidewireAutomate_Validation("AK Tax", QU_PP_PST_AKTax, "fetch",
				lhm_TestCase_Table_Data.get("QU_PP_PST_AKTax"));

	}

}
