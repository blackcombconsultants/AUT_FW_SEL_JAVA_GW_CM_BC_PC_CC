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
	public void pa_QuoteScreen_Validate() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("paQuote", strTestCaseName);
		// ---->verifying the PA Quote Screen titlebar
		GuidewireAutomate_Validation("PA Quote Screen titlebar", PA_Quote_Screen_titlebar, "equals", "Quote");
		Quote_Details("VERIFY");
		Quote_Vehicles_Validate("VERIFY");
		Quote_Premium_Validate("VERIFY");

	}

	@Override
	public void Quote_Details(String testingType) throws Throwable {
		switch (testingType) {
		case "VERIFY":

			/// ----->verifying the PA Quote Address
			GuidewireAutomate_Validation("Address", PA_Quote_Address, "equals", lhm_TestCase_Table_Data.get("Address"));
			// ------>verifying the PA Quote County
			GuidewireAutomate_Validation("County", PA_Quote_County, "equals", lhm_TestCase_Table_Data.get("County"));
			// ------>verifying the PA Quote Address Type
			GuidewireAutomate_Validation("Address Type", PA_Quote_Address_Type, "equals",
					lhm_TestCase_Table_Data.get("AddressType"));
			break;
		default:
			break;
		}

	}

	@Override
	public void Quote_Vehicles_Validate(String testingType) throws Throwable {
		switch (testingType) {
		case "VERIFY":

			// ---->verifying the PA Quote Model year
			GuidewireAutomate_Validation("Model Year", PA_Quote_Model_Year, "equals",
					lhm_TestCase_Table_Data.get("ModelYear"));
			// ------>verifying the PA Quote Make
			GuidewireAutomate_Validation("Make", PA_Quote_Make, "equals", lhm_TestCase_Table_Data.get("Make"));
			// ------>verifying the PA Quote VIN
			GuidewireAutomate_Validation("VIN", PA_Quote_VIN, "equals", lhm_TestCase_Table_Data.get("VIN"));
			break;
		default:
			break;
		}
	}

	@Override
	public void Quote_Premium_Validate(String testingType) throws Throwable {
		switch (testingType) {
		case "VERIFY":
			// ------->verifying the PA Quote Comprehensive_Coverage
			GuidewireAutomate_Validation("PA Quote_Comprehensive_Coverage", PA_Quote_Comprehensive_Coverage, "equals",
					lhm_TestCase_Table_Data.get("ComprehensiveCoverage"));
			// ------->verifying the PA Quote Collision_Coverage
			GuidewireAutomate_Validation("PA Quote_Collision_Coverage", PA_Quote_Collision_Coverage, "equals",
					lhm_TestCase_Table_Data.get("CollisionCoverage"));
			// -------->verifying the PA Quote Subtotal
			GuidewireAutomate_Validation("PA Quote_Subtotal", PA_Quote_Subtotal, "equals",
					lhm_TestCase_Table_Data.get("Subtotal"));
			break;
		default:
			break;
		}

	}

}
