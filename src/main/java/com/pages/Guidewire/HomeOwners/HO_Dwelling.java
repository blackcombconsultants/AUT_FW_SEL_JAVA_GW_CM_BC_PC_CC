package com.pages.Guidewire.HomeOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class HO_Dwelling extends SeleniumWebDriver_Commands {

	public HO_Dwelling(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	private static By Dwelling_Header = By.xpath("//div[contains(@id,'HOPDwellingScreen-ttlBar')]");
	private static By Dwelling_General = By.xpath("//div[contains(@id,'HOPDwellingInputSet-0')]");
	private static By Dwelling_Location = By.xpath(
			"//div[contains(@id,'HOPDwellingInputSet-Location_Input')]//select[contains(@name,'HOPDwellingDetailsDV-HOPDwellingInputSet-Location')]");
	private static By Dwelling_General_Button = By.xpath("//div[contains(@id,'LocationMenuIcon')]");
	private static By Dwelling_LocationTo_NewLocation = By.xpath("//div[contains(@id,'NewDwellingLocation')]");
	private static By Dwelling_LocationTo_EditLocation = By.xpath("//div[contains(@id,'EditDwellingLocation')]");

	private static By Dwelling_General_AutoFillCodes = By.xpath("//div[contains(@id,'AutofillLink')]");
	private static By Dwelling_TerritoryCodefordwellingLine = By.xpath("//input[contains(@name,'TerritoryCode')]");
	private static By Dwelling_LocationType = By.xpath("//select[contains(@name,'LocationType')]");
	private static By Dwelling_ResidenceType = By.xpath("//select[contains(@name,'ResidenceType')]");
	private static By Dwelling_EstimatedReplacementCost = By.xpath("//input[contains(@name,'ReplacementCost')]");
	private static By Dwelling_NumberOfUnitsBetweenFirewall = By
			.xpath("//input[contains(@name,'NumberOfUnitsBetweenFirewall')]");
	private static By Dwelling_NumberofInsuredUnits = By.xpath("//input[contains(@name,'NumberOfInsuredUnits')]");
	/****
	 * Occupancy
	 *****/
	private static By Dwelling_Occupancy_Header = By
			.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Occupancy']");
	private static By Dwelling_Usage = By.xpath("//select[contains(@name,'DwellingUsageType')]");
	private static By Dwelling_OccupancyType = By.xpath("//select[contains(@name,'DwellingOccupancyType')]");
	/****
	 * Protection
	 ****/
	private static By Dwelling_Protection_Header = By
			.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Protection']");
	private static By Dwelling_BurgerAlarm = By.xpath("//select[contains(@name,'BurglarAlarmType')]");
	private static By Dwelling_DistanceToFireHydrant = By.xpath("//input[contains(@name,'DistanceToFireHydrant')]");
	private static By Dwelling_DistanceToFireStation = By.xpath("//input[contains(@name,'DistanceToFireStation')]");
	private static By Dwelling_ProtectionClass = By.xpath("//select[contains(@name,'ProtectionClass')]");
	private static By Dwelling_AutoFillProtClass = By
			.xpath("//div[contains(@id,'AutoFillProtClass')]//div[@class='gw-value']//div[@role='button']");
	private static By Dwelling_FireAlarm = By.xpath("//select[contains(@name,'FireAlarm')]");

	private static By Dwelling_NumberOfFireExtinguishers = By
			.xpath("//input[contains(@name,'NumberOfFireExtinguishers')]");
	/**
	 * Swimming pool
	 *******/
	private static By Dwelling_SwimmingPool_Header = By.xpath(
			"//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Swimming Pool']");
	private static By Dwelling_HOPSwimmingPoolInputSet = By
			.xpath("//input[contains(@name,'HOPSwimmingPoolInputSet-SwimmingPool')]");
	private static By Dwelling_SwimminpoolType = By.xpath("//select[contains(@name,'HOPSwimmingPoolInputSet-Type')]");
	private static By Dwelling_Swimminpool_AdditionalInformation = By
			.xpath("//input[contains(@name,'AdditionalInformation')]");
	/***
	 * Hazard
	 ******/
	private static By Dwelling_Hazard = By.xpath("//div[@role='heading' and text()='Hazards']");
	private static By Dwelling_Add = By
			.xpath("//div[contains(@id,'HOPDwellingHazardsInputSet-Add')]//div[@role='button']");
	/**
	 *
	 * Animals *******
	 */
	private static By Dwelling_Animal = By.xpath("//div[@role='heading' and text()='Animal']");
	private static By Dwelling_AnimalAdd = By
			.xpath("//div[contains(@id,'HOPDwellingAnimalsInputSet-Add')]//div[@role='button']");
	/*
	 * AdditionalInterestsandInsuredsTab
	 ****/
	private static By Dwelling_AdditionalInterestsandInsuredsTab = By
			.xpath("//div[contains(@id,'AdditionalInterestCardTab')]");
	/****
	 * AdditionalInterestsandInsureds
	 */
	private static By Dwelling_AdditionalInterests_Header = By
			.xpath("//div[contains(@id,'HOPDwellingAdditionalInterestDetailsDV-1')]");
	private static By AdditionalInterestsandInsureds_Add_Button = By.xpath(
			"//div[contains(@id,'AdditionalInterestLV_tb-AddContactsButton')]//div[@class='gw-label'and text()='Add']");
	private static By Dwelling_NewCompany = By.xpath(
			"//div[contains(@id,'AdditionalInterestLV_tb-AddContactsButton')]//div[@class='gw-label'and text()='New Company']");
	private static By Dwelling_NewPerson = By.xpath(
			"//div[contains(@id,'AdditionalInterestLV_tb-AddContactsButton')]//div[@class='gw-label'and text()='New Person']");
	private static By Dwelling_FromAddressBook = By.xpath(
			"//div[contains(@id,'AdditionalInterestLV_tb-AddContactsButton')]//div[@class='gw-label'and text()='From Address Book']");
	private static By Dwelling_OtherContacts = By.xpath(
			"//div[contains(@id,'AdditionalInterestLV_tb-AddContactsButton')]//div[@class='gw-label'and text()='Other Contacts']");
	/****
	 * AdditionalInsured
	 ****/
	private static By Dwelling_AdditionalInsured_Header = By.xpath("//div[contains(@id,'AdditionalInsuredsDV-1')]");
	private static By AdditionalsInsureds_Add_Button = By.xpath(
			"//div[contains(@id,'AdditionalInsuredLV_tb-AddContactsButton')]//div[@class='gw-label'and text()='Add']");
	private static By Dwelling_InsuredsNewCompany = By.xpath(
			"//div[contains(@id,'AdditionalInsuredLV_tb-AddContactsButton')]//div[@class='gw-label'and text()='New Company']");
	private static By Dwelling_InsuredsNewPerson = By.xpath(
			"//div[contains(@id,'AdditionalInsuredLV_tb-AddContactsButton')]//div[@class='gw-label'and text()='New Person']");
	private static By Dwelling_InsuredsFromAddressBook = By.xpath(
			"//div[contains(@id,'AdditionalInsuredLV_tb-AddContactsButton')]//div[@class='gw-label'and text()='From Address Book']");
	private static By Dwelling_InsuredsOtherContacts = By.xpath(
			"//div[contains(@id,'AdditionalInsuredLV_tb-AddContactsButton')]//div[@class='gw-label'and text()='Other Contacts']");

	public static void DwellingDetails() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling",
					strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", Dwelling_Header, "equals", "Dwelling");

			GuidewireAutomate_Validation("Dwelling General", Dwelling_General, "equals", "General");
			
			GuidewireAutomate("Dwelling Location", Dwelling_Location, "selectByIndex","0");
			
			GuidewireAutomate_Validation("Territory Code for dwelling Line", Dwelling_TerritoryCodefordwellingLine,
					"valueEquals", lhm_TestCase_Table_Data.get("TerritoryCode"));

			GuidewireAutomate("Dwelling LocationType", Dwelling_LocationType, "sendKeys",
					lhm_TestCase_Table_Data.get("Dwelling_LocationType"));

			GuidewireAutomate("Dwelling ResidenceType", Dwelling_ResidenceType, "sendKeys",
					lhm_TestCase_Table_Data.get("Dwelling_ResidenceType"));

			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void Dwelling_LocationTo_NewLocation() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);
		try {
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void Dwelling_LocationTo_EditLocation() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void Ho_Occupancy() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);

		GuidewireAutomate_Validation("Occupancy ", Dwelling_Occupancy_Header, "equals", "Occupancy ");

		GuidewireAutomate("Dwelling Usage", Dwelling_Usage, "sendKeys", lhm_TestCase_Table_Data.get("Dwelling_Usage"));
		GuidewireAutomate("Dwelling OccupancyType", Dwelling_OccupancyType, "sendKeys",
				lhm_TestCase_Table_Data.get("Dwelling_OccupancyType"));
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void DW_Protection() throws Throwable {
		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling",
					strTestCaseName);

			GuidewireAutomate_Validation("Protection ", Dwelling_Protection_Header, "equals", "Protection");

			GuidewireAutomate("Dwelling ProtectionClass ", Dwelling_ProtectionClass, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("Dwelling_ProtectionClass"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void Ho_SwimmingPool() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);

		GuidewireAutomate_Validation("SwimmingPool", Dwelling_SwimmingPool_Header, "equals", "SwimmingPool ");

		GuidewireAutomate("Dwelling HOPSwimmingPoolInputSet", Dwelling_HOPSwimmingPoolInputSet, "sendKeys",
				lhm_TestCase_Table_Data.get("Dwelling_HOPSwimmingPoolInputSet"));
		GuidewireAutomate("Dwelling SwimminpoolType", Dwelling_SwimminpoolType, "sendKeys",
				lhm_TestCase_Table_Data.get("Dwelling_SwimminpoolType"));
		GuidewireAutomate("Dwelling wimminpool AdditionalInformation", Dwelling_Swimminpool_AdditionalInformation,
				"sendKeys", lhm_TestCase_Table_Data.get("Dwelling_Swimminpool_AdditionalInformation"));
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void Ho_Hazard() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);

		GuidewireAutomate_Validation("Hazard", Dwelling_Hazard, "equals", " Hazard");

		GuidewireAutomate("Dwelling_Add ", Dwelling_Add, "clickAndwait", "Add");

		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void Ho_Animal() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);

		GuidewireAutomate_Validation("Hazard", Dwelling_Animal, "equals", " Hazard");

		GuidewireAutomate(" Dwelling AnimalAdd", Dwelling_AnimalAdd, "clickAndwait", "AnimalAdd");

		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void AdditionalInterestsAndInsuredTab() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling",
					strTestCaseName);

			GuidewireAutomate("AdditionalInterestsandInsureds", Dwelling_AdditionalInterestsandInsuredsTab,
					"clickAndwait", "click");

			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	public static void AdditionalInterests() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling",
					strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", Dwelling_AdditionalInterests_Header, "equals",
					"Additional Interests");

			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	public static void AdditionalInsured() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling",
					strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", Dwelling_AdditionalInsured_Header, "equals",
					"Additional Insureds");

			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	public static void AdditionalInterestNewCompany() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);

		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void AdditionalInterestNewPerson() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);

		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void AdditionalInterestFromAddressBook() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);

		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void AdditionalInterestOtherContacts() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);

		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void AdditionalInsureds() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);

		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void AdditionalInsuredsNewCompany() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);

		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void AdditionalInsuredsNewPerson() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);

		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void AdditionalInsuredsFromAdress() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);

		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void AdditionalInsuredsOtherContacts() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling", strTestCaseName);

		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
}
