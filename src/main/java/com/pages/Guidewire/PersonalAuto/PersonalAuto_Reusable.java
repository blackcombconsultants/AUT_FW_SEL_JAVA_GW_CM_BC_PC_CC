package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class PersonalAuto_Reusable extends SeleniumWebDriver_Commands implements PersonalAuto_Reusable_PO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Reusable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void newSubmission_SelectLOB_PersonalAuto() throws Throwable {
		GuidewireAutomate("LOB PersonalAuto", LOB_PersonalAuto, "click", "");
	}

	public static void paMenuNavigation(String Menu) throws Throwable {
		switch (Menu) {
		case "Offering":
			GuidewireAutomate("Offering", SW_Offering, "clickAndwait", "");
			break;
		case "Qualification":
			GuidewireAutomate("Qualification", SW_PreQualification, "clickAndwait", "");
			break;
		case "Policy Info":
			GuidewireAutomate("Policy Info", SW_PA_PolicyInfo, "clickAndwait", "");
			break;
		case "Drivers":
			GuidewireAutomate("Drivers", SW_PA_Drivers, "clickAndwait", "");
			break;
		case "Vehicles":
			GuidewireAutomate("Vehicles", SW_PA_Vehicles, "clickAndwait", "");
			break;
		case "PACoverages":
			GuidewireAutomate("PACoverages", SW_PA_PACoverages, "clickAndwait", "");
			break;
		default:
			break;
		}
		oExtentTest.addScreenCaptureFromPath(
				SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to " + Menu + " is succesful");
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
