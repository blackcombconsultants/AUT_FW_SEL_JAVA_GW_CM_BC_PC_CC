package com.pages.Guidewire.PolicyCenter.CommercialAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CA_Drivers extends SeleniumWebDriver_Commands {

	public CA_Drivers(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	private static By DriversHeader    = By.xpath("//div[contains(@id,'BADriversScreen-ttlBar')]//div[@role='heading']");
	private static By DriversAddDriver = By.xpath("//div[contains(@id,'AddDriverDirectly')]//div[@role='button']");

	// Driver Details
	private static By DriverDetailsHeader      = By.xpath("//div[@id='BADriverPopup-BADriverScreen-ttlBar']//div[@role='heading']");
	private static By DriverInformationSection = By.xpath("//div[contains(@id,'BADriverScreen-BADriversDV')]//div[@class='gw-label gw-boldLabel']");
	private static By DriverFirstName          = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-FirstName')]");
	private static By DriverLastName           = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-LastName')]");
	private static By DriverDateOfBirth        = By.xpath("//input[contains(@name,'BADriversDV-DateOfBirth')]");
	private static By DriverLicenseNumber      = By.xpath("//input[contains(@name,'BADriversDV-LicenseNumber')]");
	private static By DriverLicenseState       = By.xpath("//select[contains(@name,'BADriversDV-LicenseState')]");
	private static By DriverDetailsOkButton    = By.xpath("//div[contains(@id,'BADriverPopup-BADriverScreen-Update')]//div[@role='button']");

	private static By VerifyDriverLastName     = By.xpath("//div[contains(@id,'LastName_button')]");
	private static By VerifyDriverFirstName    = By.xpath("//div[contains(@id,'FirstName_button')]");
	private static By VerifyDriverLicenseState = By.xpath("//td[contains(@id,'LicenseState_Cell')]//div[@class='gw-RangeValue']");

	public static void Driver() throws Throwable {

		try {

			GuidewireAutomate_Validation("Drivers Header", DriversHeader, "equals", "Drivers");
			GuidewireAutomate("Add Driver", DriversAddDriver, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void DriverDetails() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CA_Reusables.getData_CommercialAuto("CA_DriverDetails");

			GuidewireAutomate_Validation("Driver Details Header", DriverDetailsHeader, "equals", "Driver Details");
			GuidewireAutomate_Validation("Driver Information", DriverInformationSection, "equals", "Driver Information");
			GuidewireAutomate("First Name", DriverFirstName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CA_DriverFirstName"));
			GuidewireAutomate("Last Name", DriverLastName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CA_DriverLastName"));
			GuidewireAutomate("Date of Birth", DriverDateOfBirth, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CA_DriverDateOfBirth"));
			GuidewireAutomate("License Number", DriverLicenseNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CA_DriverLicenseNumber"));
			GuidewireAutomate("License State", DriverLicenseState, "selectByVisibleText", lhm_TestCase_Table_Data.get("CA_DriverLicenseState"));
			GuidewireAutomate("Drivers Details Ok Button", DriverDetailsOkButton, "clickAndwait", "click");

			GuidewireAutomate_Validation("Verify Driver LastName", VerifyDriverLastName, "equals", lhm_TestCase_Table_Data.get("CA_DriverLastName"));
			GuidewireAutomate_Validation("Verify Driver FirsttName", VerifyDriverFirstName, "equals", lhm_TestCase_Table_Data.get("CA_DriverFirstName"));
			GuidewireAutomate_Validation("Verify Driver License State", VerifyDriverLicenseState, "equals", lhm_TestCase_Table_Data.get("CA_DriverLicenseState"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

}
