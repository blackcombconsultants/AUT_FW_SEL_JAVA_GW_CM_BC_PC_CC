package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Reusable extends SeleniumWebDriver_Commands implements PersonalAuto_Reusable_PO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Reusable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void newSubmission_SelectLOB_PersonalAuto() throws Throwable {
		GuidewireAutomate("LOB PersonalAuto", LOB_PersonalAuto, "click", "");
	}

	public String getRandomVIN(String vingenerator) throws Throwable {
		String StrVIN = "sadasd";

		switch (vingenerator) {
		case "vingenerator":
			url = "https://vingenerator.org/";
			break;
		case "randomvin":
			url = "https://randomvin.com/";
			break;

		default:
			driver_ThirdPartyTool = getDriver();
			driver_ThirdPartyTool.navigate().to("https://vingenerator.org/");
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

		return StrVIN;
	}
}
