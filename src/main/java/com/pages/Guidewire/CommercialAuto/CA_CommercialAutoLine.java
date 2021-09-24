package com.pages.Guidewire.CommercialAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class CA_CommercialAutoLine extends SeleniumWebDriver_Commands {

	public CA_CommercialAutoLine(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	private static By Header = By
			.xpath("//div[contains(@id,'LineWizardStepSet-BALineScreen-ttlBar')]//div[@role='heading']");

	// Coverages Part------------------------------
	private static By Coverages = By.xpath("//div[contains(@id,'BALinePanelSet-CoveragesCardTab')]//div[@role='tab']");
	private static By CoveragesProductSection = By
			.xpath("//div[contains(@id,'PolicyType_Input')]//div[@class='gw-label']");
	private static By CoveragesProduct = By
			.xpath("//select[contains(@name,'BALineCoveragePanelSet-BALineDV-PolicyType')]");
	private static By CoveragesFleetSection = By.xpath("//div[contains(@id,'Fleet_Input')]//div[@class='gw-label']");
	private static By CoveragesFleet = By.xpath("//select[contains(@name,'BALineCoveragePanelSet-BALineDV-Fleet')]");

	// Commercial Auto Owned Liability Group -> Seasonal Trailer Liability
	private static By CommercialAutoOwnedLiabilityGroup = By
			.xpath("//div[contains(@id,'BALinePanelSet-BALineCoveragePanelSet-2')]//div[@class='gw-TitleBar--title']");

	private static By CommercialAutoOwnedLiabilityGroup_SeasonalTrailerLiabilitySection = By
			.xpath("//div[@class='gw-InputGroup--header--label' and text()='Seasonal Trailer Liability']");
	private static By CommercialAutoOwnedLiabilityGroup_SeasonalTrailerLiability = By.xpath(
			"//div[contains(@id,'0-BALiabGroupInputSet-CoverageInputSet')]//input[contains(@name,'CovPatternInputGroup-_checkbox')]");
	private static By CommercialAutoOwnedLiabilityGroup_SeasonalTrailerLiability_Limit = By
			.xpath("//div[contains(@id,'0-BALiabGroupInputSet')]//input[contains(@name,'0-CovTermInputSet')]");
	private static By CommercialAutoOwnedLiabilityGroup_SeasonalTrailerLiability_StartCoverage = By.xpath(
			"//div[contains(@id,'0-BALiabGroupInputSet-CoverageInputSet')]//input[contains(@name,'1-CovTermInputSet-DateTimeTermInput')]");
	private static By CommercialAutoOwnedLiabilityGroup_SeasonalTrailerLiability_EndCoverage = By.xpath(
			"//div[contains(@id,'0-BALiabGroupInputSet-CoverageInputSet')]//input[contains(@name,'2-CovTermInputSet-DateTimeTermInput')]");
	private static By CommercialAutoOwnedLiabilityGroup_SeasonalTrailerLiability_TrailerCount = By.xpath(
			"//div[contains(@id,'3-CovTermInputSet-CovTermDirectInputSet')]//input[contains(@name,'CovTermDirectInputSet')]");
	private static By CommercialAutoOwnedLiabilityGroup_SeasonalTrailerLiability_ProduceTransported = By.xpath(
			"//div[contains(@id,'4-CovTermInputSet-StringTermInput')]//input[contains(@name,'CovTermInputSet-StringTermInput')]");
	private static By CommercialAutoOwnedLiabilityGroup_SeasonalTrailerLiability_DescriptionOfTrailers = By.xpath(
			"//div[contains(@id,'5-CovTermInputSet-StringTermInput')]//input[contains(@name,'CovTermInputSet-StringTermInput')]");

	// Bobtail Liability
	private static By CommercialAutoOwnedLiabilityGroup_BobtailLiability = By.xpath(
			"//div[contains(@id,'1-BALiabGroupInputSet-CoverageInputSet')]//input[contains(@name,'CovPatternInputGroup-_checkbox')]");

	// Commercial Auto Hired Auto Group
	private static By CommercialAutoHiredAutoGroup = By
			.xpath("//div[contains(@id,'BALinePanelSet-BALineCoveragePanelSet-6')]//div[@class='gw-TitleBar--title']");
	private static By CommercialAutoHiredAutoGroup_HiredAutoLiability = By.xpath(
			"//div[contains(@id,'0-BAHiredGroupInputSet-CoverageInputSet')]//input[contains(@name,'0-BAHiredGroupInputSet')]");
	private static By CommercialAutoHiredAutoGroup_HiredAutoLiability_LiabilityBI = By.xpath(
			"//div[contains(@id,'CovPatternInputGroup-0')]//select[contains(@name,'0-CovTermInputSet-PackageTermInput')]");
	private static By CommercialAutoHiredAutoGroup_HiredAutoCollision = By.xpath(
			"//div[contains(@id,'1-BAHiredGroupInputSet-CoverageInputSet')]//input[contains(@name,'BAHiredGroupInputSet')]");
	private static By CommercialAutoHiredAutoGroup_HiredAutoCollision_Deductible = By.xpath(
			"//div[contains(@id,'1-BAHiredGroupInputSet-CoverageInputSet')]//select[contains(@name,'CovPatternInputGroup-0-CovTermInputSet')]");
	private static By CommercialAutoHiredAutoGroup_HiredAutoComprehensive = By.xpath(
			"//div[contains(@id,'2-BAHiredGroupInputSet-CoverageInputSet')]//input[contains(@name,'BAHiredGroupInputSet')]");
	private static By CommercialAutoHiredAutoGroup_HiredAutoComprehensive_Deductible = By.xpath(
			"//div[contains(@id,'2-BAHiredGroupInputSet-CoverageInputSet')]//select[contains(@name,'CovPatternInputGroup-0-CovTermInputSet')]");
	private static By CommercialAutoHiredAutoGroup_HiredAutoSpecifiedCausesOfLoss = By.xpath(
			"//div[contains(@id,'3-BAHiredGroupInputSet-CoverageInputSet')]//input[contains(@name,'BAHiredGroupInputSet')]");
	private static By CommercialAutoHiredAutoGroup_HiredAutoSpecifiedCausesOfLoss_Deductible = By
			.xpath("//div[contains(@id,'3-BAHiredGroupInputSet')]//select[contains(@name,'0-CovTermInputSet')]");
	private static By CommercialAutoHiredAutoGroup_HiredAutoSpecifiedCausesOfLoss_CausesOfLoss = By.xpath(
			"//div[contains(@id,'3-BAHiredGroupInputSet')]//select[contains(@name,'1-CovTermInputSet-TypekeyTermInput')]");
	private static By CommercialAutoHiredAutoGroup_HiredAutoUninsuredMotorist = By.xpath(
			"//div[contains(@id,'4-BAHiredGroupInputSet-CoverageInputSet')]//input[contains(@name,'BAHiredGroupInputSet')]");
	private static By CommercialAutoHiredAutoGroup_HiredAutoUnderinsuredMotorist = By.xpath(
			"//div[contains(@id,'5-BAHiredGroupInputSet-CoverageInputSet')]//input[contains(@name,'BAHiredGroupInputSet')]");

	// Commercial Auto Non-owned Group
	private static By CommercialAutoNonOwnedGroup = By
			.xpath("//div[contains(@id,'BALinePanelSet-BALineCoveragePanelSet-17')]//div[@class='gw-TitleBar--title']");
	private static By CommercialAutoNonOwnedGroup_NonOwnedAutoLiability = By
			.xpath("//div[contains(@id,'0-BANonOwnedGroupInputSet')]//input[contains(@name,'0-BANonOwned')]");
	private static By CommercialAutoNonOwnedGroup_NonOwnedAutoLiability_LiabilityBodilyInjury = By.xpath(
			"//div[contains(@id,'0-BANonOwnedGroupInputSet')]//select[contains(@name,'CovPatternInputGroup-0-CovTermInputSet')]");

	// Hired Auto States
	private static By HiredAutoStates = By
			.xpath("//div[contains(@id,'BALineCoveragePanelSet-11')]//div[@role='heading']");
	private static By HiredAutoStates_SelectState = By.xpath(
			"//div[contains(@id,'BALineCoveragePanelSet-SelectStateHiredAuto')]//select[contains(@name,'SelectStateHiredAuto')]");
	private static By HiredAutoStates_AddStateButton = By
			.xpath("//div[contains(@id,'BALineCoveragePanelSet-Add')]//div[@class='gw-shortcutKey' and text()='A']");
	private static By HiredAutoStates_RemoveStateButton = By
			.xpath("//div[contains(@id,'BALineCoveragePanelSet-Remove')]//div[@class='gw-shortcutKey' and text()='R']");

	// Non-owned Liability States
	private static By NonOwnedLiabilityStates = By
			.xpath("//div[contains(@id,'BALineCoveragePanelSet-22')]//div[@role='heading']");
	private static By NonOwnedLiabilityStates_SelectState = By.xpath(
			"//div[contains(@id,'BALineCoveragePanelSet-SelectStateNonowned')]//select[contains(@name,'SelectStateNonowned')]");
	private static By NonOwnedLiabilityStates_AddStateButton = By
			.xpath("//div[contains(@id,'BALineCoveragePanelSet-Add')]//div[@class='gw-label' and text()='Add State']");
	private static By NonOwnedLiabilityStates_RemoveStateButton = By
			.xpath("//div[contains(@id,'RemoveNonownedState')]//div[@class='gw-label' and text()='Remove State']");

	// Additional Coverages
	private static By AdditionalCoverages = By
			.xpath("//div[contains(@id,'AdditionalCoveragesCardTab')]//div[@role='tab']");
	private static By AdditionalCoverage_AddCoveragesButton = By
			.xpath("//div[contains(@id,'AdditionalCoveragesDV_tb-Add')]//div[@role='button']");
	private static By AdditionalCoverage_Header = By
			.xpath("//div[contains(@id,'CoveragePatternSearchScreen-ttlBar')]//div[@role='heading']");

	// Exclusions & Conditions
	private static By ExclusionsAndConditions = By
			.className("//div[contains(@id,'ExclusionsAndConditionsCardTab')]//div[@role='tab']");
	private static By ExclusionsAndConditions_AddExclusionOrConditionButton = By
			.xpath("//div[contains(@id,'AddExclusionsOrCondition')]//div[@role='button']");
	private static By ExclusionsAndConditions_Header = By
			.xpath("//div[contains(@id,'CoveragePatternSearchScreen-ttlBar')]//div[@role='heading']");

	// Additional Insureds
	private static By AdditionalInsureds = By
			.xpath("//div[contains(@id,'AdditionalInsuredsCardTab')]//div[@role='tab']");
	private static By AdditionalInsureds_AddButton = By.xpath(
			"//div[contains(@id,'AdditionalInsuredLV_tb-AddContactsButton')]//div[@class='gw-label' and text()='Add']");
	private static By AdditionalInsureds_Add_NewCompany = By.xpath(
			"//div[contains(@id,'AdditionalInsuredLV_tb-AddContactsButton')]//div[@class='gw-label' and text()='New Company']");
	private static By AdditionalInsureds_Add_NewPerson = By.xpath(
			"//div[contains(@id,'AdditionalInsuredLV_tb-AddContactsButton')]//div[@class='gw-label' and text()='New Person']");
	private static By AdditionalInsureds_Add_FromAddressBook = By.xpath(
			"//div[contains(@id,'AdditionalInsuredLV_tb-AddContactsButton')]//div[@class='gw-label' and text()='From Address Book']");
	private static By AdditionalInsureds_Add_ExistingAdditionalInsured = By.xpath(
			"//div[contains(@id,'AdditionalInsuredLV_tb-AddContactsButton')]//div[@class='gw-label' and text()='Existing Additional Insured']");
	private static By AdditionalInsureds_Add_ExistingAdditionalInsured_Insurer = By
			.xpath("//div[contains(@id,'ExistingAdditionalInsured')]//div[@role='button']");

	public static void coverages_Product() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CommercialAutoLine",
					strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", Header, "equals", "Commercial Auto Line");
			GuidewireAutomate_Validation("Coverages Title", Coverages, "equals", "Coverages");
			GuidewireAutomate_Validation("Product Section", CoveragesProductSection, "equals", "Product");
			GuidewireAutomate("Product", CoveragesProduct, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("CAL_Product"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void coverages_Fleet() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CommercialAutoLine",
					strTestCaseName);
			GuidewireAutomate_Validation("Fleet Section", CoveragesFleetSection, "equals", "Fleet");
			GuidewireAutomate("Fleet", CoveragesFleet, "selectByVisibleText", lhm_TestCase_Table_Data.get("CAL_Fleet"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void coverages_SeasonalTrailerLiability() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CommercialAutoLine",
					strTestCaseName);
			
			GuidewireAutomate_Validation("Commercial Auto Owned Liability Group Header",
					CommercialAutoOwnedLiabilityGroup, "equals", "Commercial Auto Owned Liability Group");
			GuidewireAutomate("Seasonal Trailer Liability", CommercialAutoOwnedLiabilityGroup_SeasonalTrailerLiability,
					"clickAndwait", "clickAndwait");
			Thread.sleep(2000);
			GuidewireAutomate_Validation("Seasonal Trailer Liability Section",
					CommercialAutoOwnedLiabilityGroup_SeasonalTrailerLiabilitySection, "equals",
					"Seasonal Trailer Liability");
			GuidewireAutomate("Limit", CommercialAutoOwnedLiabilityGroup_SeasonalTrailerLiability_Limit,
					"clearANDsendKeys", lhm_TestCase_Table_Data.get("CAL_STL_Limit"));
			GuidewireAutomate("Start Coverage",
					CommercialAutoOwnedLiabilityGroup_SeasonalTrailerLiability_StartCoverage, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("CAL_STL_StartCoverage"));
			GuidewireAutomate("End Coverage", CommercialAutoOwnedLiabilityGroup_SeasonalTrailerLiability_EndCoverage,
					"clearANDsendKeys", lhm_TestCase_Table_Data.get("CAL_STL_EndCoverage"));

			// Other Codes need to added here

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void coverages_BobtailLiability() throws Throwable {
		try {

			GuidewireAutomate("Bobtail Liability", CommercialAutoOwnedLiabilityGroup_BobtailLiability, "clickAndwait",
					"clickAndwait");

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void coverages_HiredAutoLiability() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CommercialAutoLine",
					strTestCaseName);

			GuidewireAutomate("Hired Auto Liability", CommercialAutoHiredAutoGroup_HiredAutoLiability, "clickAndwait",
					"clickAndwait");
			GuidewireAutomate("Liability BI", CommercialAutoHiredAutoGroup_HiredAutoLiability, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("CAL_HiredAutoLiability _LiabilityBI"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void coverages_HiredAutoCollision() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CommercialAutoLine",
					strTestCaseName);

			GuidewireAutomate("Hired Auto Collision", CommercialAutoHiredAutoGroup_HiredAutoCollision, "clickAndwait",
					"clickAndwait");
			GuidewireAutomate("Hired Auto Collision Deductible",
					CommercialAutoHiredAutoGroup_HiredAutoCollision_Deductible, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("CAL_HiredAutoCollision_Deductible"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void coverages_HiredAutoComprehensive() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CommercialAutoLine",
					strTestCaseName);

			GuidewireAutomate("Hired Auto Comprehensive", CommercialAutoHiredAutoGroup_HiredAutoComprehensive,
					"clickAndwait", "clickAndwait");
			GuidewireAutomate("Hired Auto Comprehensive Deductible",
					CommercialAutoHiredAutoGroup_HiredAutoComprehensive_Deductible, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("CAL_HiredAComprehensive_Deductible"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void coverages_HiredAutoSpecifiedCausesOfLoss() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CommercialAutoLine",
					strTestCaseName);

			GuidewireAutomate("Hired Auto Specified Causes of Loss",
					CommercialAutoHiredAutoGroup_HiredAutoSpecifiedCausesOfLoss, "clickAndwait", "clickAndwait");

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void AdditionalCoverages() throws Throwable {
		try {

			GuidewireAutomate("Additional Coverages", AdditionalCoverages, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Add Coverages", AdditionalCoverage_AddCoveragesButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Search Coverages for Commercial Auto Line", AdditionalCoverage_Header,
					"equals", "Search Coverages for Commercial Auto Line");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void ExclusionsAndConditions() throws Throwable {
		try {

			GuidewireAutomate("Exclusions and Conditions", ExclusionsAndConditions, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Add Exclusions Or Conditions Button",
					ExclusionsAndConditions_AddExclusionOrConditionButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Search Exclusions And Conditions for Commercial Auto Line",
					AdditionalCoverage_Header, "equals", "Search Exclusions And Conditions for Commercial Auto Line");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void AdditionalInsureds() throws Throwable {
		try {

			GuidewireAutomate("Additional Insureds", AdditionalInsureds, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Add Button", AdditionalInsureds_AddButton, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void AdditionalInsuredsNewCompany() throws Throwable {
		try {
			GuidewireAutomate("New Company", AdditionalInsureds_Add_NewCompany, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void AdditionalInsuredsNewPerson() throws Throwable {

		try {

			GuidewireAutomate("New Person", AdditionalInsureds_Add_NewPerson, "clickAndwait", "clickAndwait");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void AdditionalInsuredsFromAddressBook() throws Throwable {

		try {

			GuidewireAutomate("From Address Book", AdditionalInsureds_Add_FromAddressBook, "clickAndwait",
					"clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void AdditionalInsuredsExistingAdditionalInsured() throws Throwable {

		try {

			GuidewireAutomate("Existing Additional Insured", AdditionalInsureds_Add_ExistingAdditionalInsured,
					"moveToElement", "moveToElement");
			GuidewireAutomate("Existing Additional Insured Person",
					AdditionalInsureds_Add_ExistingAdditionalInsured_Insurer, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
}
