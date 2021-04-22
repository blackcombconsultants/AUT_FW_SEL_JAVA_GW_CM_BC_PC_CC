package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Forms extends SeleniumWebDriver_Commands implements PersonalAuto_Forms_PO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Forms(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pa_forms() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("paForms", strTestCaseName);
		GuidewireAutomate_Validation("forms Header", Forms_Header, "equals", "Forms");
		forms_validate("VERIFY");
		description_validate("VERIFY");

	}

	@Override
	public void forms_validate(String testingType) throws Throwable {
		switch (testingType) {
		case "VERIFY":

			GuidewireAutomate_Validation("forms Validate", Forms_Validate, "equals",
					lhm_TestCase_Table_Data.get("form"));
			break;
		default:
			break;
		}
	}

	@Override
	public void description_validate(String testingType) throws Throwable {
		switch (testingType) {
		case "VERIFY":
			GuidewireAutomate_Validation("Description Validate", Description_Validate, "equals",
					lhm_TestCase_Table_Data.get("Description"));

			break;
		default:
			break;
		}
	}

}
