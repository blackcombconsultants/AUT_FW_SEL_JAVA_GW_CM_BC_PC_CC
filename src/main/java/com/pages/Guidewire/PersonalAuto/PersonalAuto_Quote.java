package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Quote extends SeleniumWebDriver_Commands implements PersonalAuto_Quote_PO {

	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Quote(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void quoteDetails() throws Throwable {
		/// ----->verifying the PA Quote Address
		GuidewireAutomate_Validation("Address", PA_Quote_Address, "equals", lhm_TestCase_Table_Data.get("Address"));
		// ------>verifying the PA Quote County
		GuidewireAutomate_Validation("County", PA_Quote_County, "equals", lhm_TestCase_Table_Data.get("County"));
		// ------>verifying the PA Quote Address Type
		GuidewireAutomate_Validation("Address Type", PA_Quote_Address_Type, "equals",
				lhm_TestCase_Table_Data.get("AddressType"));
	}

	@Override
	public void policyPremium_Garage1() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void policyPremium_Vehicle1() throws Throwable {
		// ---->verifying the PA Quote Model year
		GuidewireAutomate_Validation("Model Year", PA_Quote_Model_Year, "equals",
				lhm_TestCase_Table_Data.get("ModelYear"));
		// ------>verifying the PA Quote Make
		GuidewireAutomate_Validation("Make", PA_Quote_Make, "equals", lhm_TestCase_Table_Data.get("Make"));
		// ------>verifying the PA Quote VIN
		GuidewireAutomate_Validation("VIN", PA_Quote_VIN, "equals", lhm_TestCase_Table_Data.get("VIN"));

		// ------->verifying the PA Quote Comprehensive_Coverage
		GuidewireAutomate_Validation("PA Quote_Comprehensive_Coverage", PA_Quote_Comprehensive_Coverage, "equals",
				lhm_TestCase_Table_Data.get("ComprehensiveCoverage"));
		// ------->verifying the PA Quote Collision_Coverage
		GuidewireAutomate_Validation("PA Quote_Collision_Coverage", PA_Quote_Collision_Coverage, "equals",
				lhm_TestCase_Table_Data.get("CollisionCoverage"));
		// -------->verifying the PA Quote Subtotal
		GuidewireAutomate_Validation("PA Quote_Subtotal", PA_Quote_Subtotal, "equals",
				lhm_TestCase_Table_Data.get("Subtotal"));
	}

	@Override
	public void policyPremium_PremiumSubtotalandTaxes() throws Throwable {
		GuidewireAutomate_Validation("Premium Subtotal", PA_Quote_Comprehensive_Coverage, "equals",
				lhm_TestCase_Table_Data.get("ComprehensiveCoverage"));

	}

}
