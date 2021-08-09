package com.pages.Guidewire.CommercialAuto;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Account;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Bound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class CommercialAuto_Reusable extends SeleniumWebDriver_Commands implements CommercialAuto_Reusable_PO {

	public CommercialAuto_Reusable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	public static void newSubmission_SelectLOB_CommercialAuto() throws Throwable {
		GuidewireAutomate("LOB CommerciallAuto", LOB_CommercialAuto, "clickAndwait", "click");
	}

	public static void caMenuNavigation(String Menu) throws Throwable {
		try {

			switch (Menu) {
			case "Offering":
				GuidewireAutomate("Offering", SW_Offering, "clickAndwait", "click");
				break;
			case "Qualification":
				GuidewireAutomate("Qualification", SW_PreQualification, "clickAndwait", "click");
				break;
			case "Policy Info":
				GuidewireAutomate("Policy Info", SW_CA_PolicyInfo, "clickAndwait", "click");
				break;
			case "Commercial Auto Line":
				GuidewireAutomate("Policy Info", SW_CA_CommercialAutoLine, "clickAndwait", "click");
				break;
			case "Locations":
				GuidewireAutomate("Policy Info", SW_CA_Locations, "clickAndwait", "click");
				break;
			case "Vehicles":
				GuidewireAutomate("Vehicles", SW_CA_Vehicles, "clickAndwait", "click");
				break;
			case "State Info":
				GuidewireAutomate("PACoverages", SW_CA_StateInfo, "clickAndwait", "click");
				break;
			case "Drivers":
				GuidewireAutomate("Drivers", SW_CA_Drivers, "clickAndwait", "click");
				break;
			case "Covered Vehicles":
				GuidewireAutomate("PACoverages", SW_CA_CoveredVehicles, "clickAndwait", "click");
				break;
			case "Modifiers":
				GuidewireAutomate("PACoverages", SW_CA_Modifiers, "clickAndwait", "click");
				break;
			case "Risk Analysis":
				GuidewireAutomate("PACoverages", SW_CA_RiskAnalysis, "clickAndwait", "click");
				break;
			case "Policy Review":
				GuidewireAutomate("PACoverages", SW_CA_PolicyReview, "clickAndwait", "click");
				break;
			case "Quote":
				GuidewireAutomate("PACoverages", SW_CA_Quote, "clickAndwait", "click");
				break;
			case "Forms":
				GuidewireAutomate("PACoverages", SW_CA_Forms, "clickAndwait", "click");
				break;
			case "Payment":
				GuidewireAutomate("PACoverages", SW_CA_Payment, "clickAndwait", "click");
				break;
			default:
				throw new IOException("No support for Menu : " + Menu);
			}
			oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
			oExtentTest.log(Status.INFO, "Navigation to Commercial Auto Menu = " + Menu + " is Succesful");
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
		
	}

	public String getRandomVIN(String vingenerator) throws Throwable {
		
		try {

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
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
		
	}

}
