package com.pages.Guidewire.PolicyCenter.CommercialAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class CA_Forms extends SeleniumWebDriver_Commands {

	public CA_Forms(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	private static By Forms_Validate       = By.xpath("//tr[contains(@id,'FormsScreen-FormsDV-FormsLV-0-0')]//td[1]//div[@class='gw-value-readonly-wrapper']");
	private static By Description_Validate = By.xpath("//tr[contains(@id,'FormsScreen-FormsDV-FormsLV-0-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");

	private static By Endorsement_Validate = By.xpath("//tr[contains(@id,'FormsScreen-FormsDV-FormsLV-0-0')]//td[3]//div[@class='gw-value-readonly-wrapper']");
	private static By Replacement_Validate = By.xpath("//tr[contains(@id,'FormsScreen-FormsDV-FormsLV-0-0')]//td[4]//div[@class='gw-value-readonly-wrapper']");


	public static void ValidateForms() throws Throwable {
		lhm_TestCase_Table_Data = CA_Reusables.getData_CommercialAuto("Forms");
		GuidewireAutomate_Validation("forms Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Forms");
		forms_validate("VERIFY");
		description_validate("VERIFY");

	}

	public static void forms_validate(String testingType) throws Throwable {
		switch (testingType) {
			case "VERIFY" :

				GuidewireAutomate_Validation("forms Validate", Forms_Validate, "equals", lhm_TestCase_Table_Data.get("F_Form1"));
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
