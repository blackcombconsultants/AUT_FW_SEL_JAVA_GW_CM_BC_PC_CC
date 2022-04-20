package com.pages.Guidewire.PolicyCenter.PersonalAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class PA_Forms extends SeleniumWebDriver_Commands {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PA_Forms(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By Forms_Validate       = By.xpath("//tr[contains(@id,'FormsScreen-FormsDV-FormsLV-0-0')]//td[1]//div[@class='gw-value-readonly-wrapper']");
	private static By Description_Validate = By.xpath("//tr[contains(@id,'FormsScreen-FormsDV-FormsLV-0-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");

	private static By Endorsement_Validate = By.xpath("//tr[contains(@id,'FormsScreen-FormsDV-FormsLV-0-0')]//td[3]//div[@class='gw-value-readonly-wrapper']");
	private static By Replacement_Validate = By.xpath("//tr[contains(@id,'FormsScreen-FormsDV-FormsLV-0-0')]//td[4]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * 
	 * Modules
	 * 
	 * void pa_forms() throws Throwable;
	 * 
	 * void forms_validate(String testtingType) throws Throwable;
	 * 
	 * void description_validate(String testtingType) throws Throwable;
	 */

	public static void pa_forms() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("forms");
		GuidewireAutomate_Validation("forms Header", PolicyCenter_Resuables_PO.Forms_Header, "equals", "Forms");
		forms_validate("VERIFY");
		description_validate("VERIFY");

	}

	public static void forms_validate(String testingType) throws Throwable {
		switch (testingType) {
			case "VERIFY" :

				GuidewireAutomate_Validation("forms Validate", Forms_Validate, "equals", lhm_TestCase_Table_Data.get("F_Form_ID1"));
				break;
			default :
				break;
		}
	}

	public static void description_validate(String testingType) throws Throwable {
		switch (testingType) {
			case "VERIFY" :
				GuidewireAutomate_Validation("Description Validate", Description_Validate, "equals", lhm_TestCase_Table_Data.get("F_Form_Description1"));

				break;
			default :
				break;
		}
	}

}
