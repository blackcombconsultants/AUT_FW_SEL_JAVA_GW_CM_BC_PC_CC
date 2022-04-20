package com.pages.Guidewire.PolicyCenter.CommercialAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CA_Vehicles extends SeleniumWebDriver_Commands {

	public CA_Vehicles(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By VehiclesHeader     = By.xpath("//div[contains(@id,'BAVehiclesScreen-ttlBar')]//div[@role='heading']");
	private static By CreateVehicle      = By.xpath("//div[contains(@id,'BAVehiclesLV_tb-Add')]//div[@role='button']");
	private static By VehicleInformation = By.xpath("//div[contains(@id,'VehicleScreen-ttlBar')]//div[@role='heading']");

	// Vehicle Details
	private static By VehicleDetailsSection          = By.xpath("//div[contains(@id,'VehicleDetailCardTab')]//div[@role='tab']");
	private static By VehicleDetailsGaragedAtSection = By.xpath("//div[contains(@id,'BAGarageLocationInput_Input')]//div[@class='gw-label' and text()='Garaged At']");
	private static By VehicleDetailsGaragedAt        = By.xpath("//select[contains(@name,'BAGarageLocationInput')]");

	private static By BasicVehicleInformationSection = By.xpath("//div[@class='gw-label gw-boldLabel' and text()='Basic Vehicle Information']");
	private static By VehicleDetailsVehicleType      = By.xpath("//select[@name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-Type']");
	private static By VehicleDetailsVin              = By.xpath("//input[@name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-Vin']");
	private static By VehicleDetailsCost             = By.xpath("//input[@name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-Cost']");

	private static By VehicleDetailsClassificationInformationSection = By.xpath("//div[@class='gw-label gw-boldLabel' and text()='Classification Information']");
	private static By VehicleDetailsClass                            = By.xpath("//input[@name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-ClassCode']");
	private static By VehicleDetailsClassSearchButton                = By.xpath("//div[contains(@class,'gw-ImageButtonWidget gw-styleTag--ValueWidget')]//span[@class='gw-icon']");
	private static By VehicleDetailsOkButton                         = By.xpath("//div[@id='BAVehiclePopup-VehicleScreen-Update']//div[@role='button']");

	private static By VehicleType  = By.xpath("//div[contains(@class,'gw-link gw-label')]");
	private static By LocationName = By.xpath("//div[contains(@id,'EULocationInput')]//div[@class='gw-RangeValue']");
	private static By ModelYear    = By.xpath("//div[contains(@id,'Year_button') and @class='gw-ActionValueWidget']");
	private static By Make         = By.xpath("//div[contains(@id,'Make_button') and @class='gw-ActionValueWidget']");
	private static By Model        = By.xpath("//div[contains(@id,'Model_button') and @class='gw-ActionValueWidget']");
	private static By Vin          = By.xpath("//div[contains(@id,'Vin_button') and @class='gw-ActionValueWidget']");

	public static void VehicleInformation() throws Throwable {

		try {

			lhm_TestCase_Table_Data = CA_Reusables.getData_CommercialAuto("CA_VehicleInformation");

			GuidewireAutomate_Validation("Vehicles Heading", VehiclesHeader, "equals", "Vehicles");
			GuidewireAutomate("Create Vehicle Button", CreateVehicle, "clickAndwait", "click");
			GuidewireAutomate_Validation("Vehicle Information Heading", VehicleInformation, "equals", "Vehicle Information");
			GuidewireAutomate_Validation("Vehicle Details Section", VehicleDetailsSection, "equals", "Vehicle Details");
			GuidewireAutomate_Validation("Garaged At Section", VehicleDetailsGaragedAtSection, "equals", "Garaged At");
			GuidewireAutomate("Garaged At", VehicleDetailsGaragedAt, "selectByIndex", "1");
			GuidewireAutomate("Vehicle Type", VehicleDetailsVehicleType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CA_VehicleType"));
			GuidewireAutomate("VIN", VehicleDetailsVin, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CA_VIN"));
			Thread.sleep(2000);
			GuidewireAutomate("Cost", VehicleDetailsCost, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CA_Cost"));

			GuidewireAutomate_Validation("Classification Information Section", VehicleDetailsClassificationInformationSection, "equals", "Classification Information");
			GuidewireAutomate("Class", VehicleDetailsClass, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CA_Class"));
			getStaleElement("Ok Button", VehicleDetailsOkButton);
			GuidewireAutomate("Ok Button", VehicleDetailsOkButton, "clickAndwait", "click");

			GuidewireAutomate_Validation("Verify Vehicle Type", VehicleType, "equals", lhm_TestCase_Table_Data.get("CA_VehicleType"));
			// GuidewireAutomate_Validation("Verify Location Name", LocationName, "equals", lhm_TestCase_Table_Data.get("CA_VerifyLocationName"));
			GuidewireAutomate_Validation("Verify Model Year", ModelYear, "equals", lhm_TestCase_Table_Data.get("CA_VerifyModelYear"));
			GuidewireAutomate_Validation("Verify Make", Make, "equals", lhm_TestCase_Table_Data.get("CA_VerifyMake"));
			GuidewireAutomate_Validation("Verify Model", Model, "equals", lhm_TestCase_Table_Data.get("CA_VerifyModel"));
			GuidewireAutomate_Validation("Verify Vin", Vin, "equals", lhm_TestCase_Table_Data.get("CA_VIN"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}