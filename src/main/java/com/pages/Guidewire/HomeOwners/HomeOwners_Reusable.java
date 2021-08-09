package com.pages.Guidewire.HomeOwners;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class HomeOwners_Reusable  extends SeleniumWebDriver_Commands implements HomeOwners_Reusable_PO {

	public HomeOwners_Reusable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		
	}
	public static void newSubmission_SelectLOB_PersonalAuto() throws Throwable {
		GuidewireAutomate("LOB HomeOwners", LOB_HomeOwners, "clickAndwait", "click");
	}

}
