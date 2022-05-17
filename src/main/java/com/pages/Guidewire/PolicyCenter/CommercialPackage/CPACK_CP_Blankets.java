package com.pages.Guidewire.PolicyCenter.CommercialPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CPACK_CP_Blankets extends SeleniumWebDriver_Commands {

	public CPACK_CP_Blankets(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	private static By ScreenHeader = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");

	private static By AddBuildingButton = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMBuildingsScreen-IMBuildingsAndLocationsLV-0-Actions-ActionsMenuIcon']/div[2]/div[1]");
	private static By AddBuilding       = By.xpath("//div[contains(@id,'IMBuildingsAndLocationsLV-0-Actions-AddBuilding')]//div[@class='gw-label' and text()='Add Building']");
	private static By NewBuilding       = By.xpath("//div[contains(@id,'IMBuildingsAndLocationsLV-0-Actions-AddBuilding')]//div[@class='gw-label' and text()='New Building']");

	private static By OkButton = By.xpath("//div[@id='IMBuildingPopup-Update']//div[@role='button']");

	public static void AddBlanket() throws Throwable {

		try {

			GuidewireAutomate_Validation("Buildings and Locations Header", ScreenHeader, "equals", "Buildings and Locations");
			GuidewireAutomate("Add Building Button", AddBuildingButton, "clickAndwait", "click");
			GuidewireAutomate("Add Building", AddBuilding, "moveToElement", "moveToElement");
			GuidewireAutomate("New Building", NewBuilding, "clickAndwait", "click");
			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

}
