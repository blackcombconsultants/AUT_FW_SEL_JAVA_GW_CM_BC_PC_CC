package com.pages.Guidewire.PolicyCenter.HomeOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class HO_Coverages extends SeleniumWebDriver_Commands {
	public HO_Coverages(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By HO_Coverages_Screen_titlebar = By.xpath("//div[contains(@id,'HOPCoveragesScreen-ttlBar')]//div[1]//div");

	/*
	 * CoveragesTab
	 */
	private static By Coverages_CoveragesTab = By.xpath("//div[contains(@id,'HOPCoveragesScreen-HOPMainCoveragesTab')]");

	/***
	 * Section I
	 */

	private static By HO_CT_CoveragesSectionICoverages = By.xpath("//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Section I Coverages')]");

	// --->HO_Coverages_CheckBox xpath
	private static By HO_CT_CATAV_CoverageADwelling = By.xpath("//div[@role='heading' and text()='Coverage A - Dwelling']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By HO_CT_CATAV_CovALimit         = By.xpath("//input[contains(@name,'HOPCovALimit')]");

	private static By HO_CT_CATAV_ValuationMethod = By.xpath("//div[@class='gw-label' and text()='Valuation Method']/parent::div//select[contains(@name,'CoverageInputSet')]");
	private static By HO_CT_CATAV_Coinsurance     = By.xpath("//div[@class='gw-label' and text()='Coinsurance']/parent::div//select[contains(@name,'CoverageInputSet')]");

	private static By HOC_CT_CATAV_CoverageBOtherStructures = By.xpath("//div[@role='heading' and text()='Coverage B - Other Structures']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By HOC_CT_CATAV_CovBLimitPct             = By.xpath("//div[@class='gw-label' and text()='CovB Limit Pct']/parent::div//select[contains(@name,'CoverageInputSet')]");

	private static By HOC_CT_CATAV_CoverageCPersonalProperty = By.xpath("//div[@role='heading' and text()='Coverage C - Personal Property']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By HOC_CT_CATAV_SelfStorageUnits          = By.xpath("//div[@class='gw-label' and text()='Self Storage Units']/parent::div//select[contains(@name,'CoverageInputSet')]");
	private static By HOC_CT_CATAV_PropertyatOtherResidence  = By.xpath("//div[@class='gw-label' and text()='Property at Other Residence']/parent::div//select[contains(@name,'CoverageInputSet')]");

	private static By HOC_CT_CATAV_CoverageDLossofUse          = By.xpath("//div[@role='heading' and text()='Coverage D - Loss of Use']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By HOC_CT_CATAV_CovDLimitPct                = By.xpath("//div[@class='gw-label' and text()='CovD Limit Pct']/parent::div//select[contains(@name,'CoverageInputSet')]");
	private static By HOC_CT_CATAV_LossofRentalIncome          = By.xpath("//div[@class='gw-label' and text()='Loss of Rental Income']/parent::div //input[@type='radio' and @value='true']");
	private static By HOC_CT_CATAV_ProhibitedUseCivilAuthority = By.xpath("//div[@class='gw-label' and text()='Prohibited Use - Civil Authority']/parent::div//select[contains(@name,'CoverageInputSet')]");

	private static By HOC_CT_CATAV_SectionIDeductibles       = By.xpath("//div[@role='heading' and text()='Section I Deductibles']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By HOC_CT_CATAV_AllPerils                 = By.xpath("//div[@class='gw-label' and text()='All Perils']/parent::div//select[contains(@name,'CoverageInputSet')]");
	/***
	 * Section II
	 */
	private static By HOC_CT_CoveragesSectionIICoverages     = By.xpath("//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Section II Coverages')]");
	private static By HOC_CT_CATAV_CoveragePersonalLiability = By.xpath("//div[@role='heading' and text()='Coverage E - Personal Liability']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By HOC_CT_CATAV_CovELimit                 = By.xpath("//div[@class='gw-label' and text()='CovE Limit Pct']/parent::div//select[contains(@name,'CoverageInputSet')]");
	private static By HOC_CT_CATAV_PersonalInjury            = By.xpath("//input[contains(@id,'BooleanTermInput_0')]");

	private static By HOC_CT_CATAV_CoverageFMedicalPaymentsToOthers = By.xpath("//div[@role='heading' and text()='Coverage F - Medical Payments To Others']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By HOC_CT_CATAV_CovFLimitPct                     = By.xpath("//div[@class='gw-label' and text()='CovF Limit Pct']/parent::div//select[contains(@name,'CoverageInputSet')]");

	/*
	 * AdditionalCoveragesTab
	 */
	private static By Coverages_AdditionalCoveragesTab = By.xpath("//div[contains(@id,'HOPAdditionalCoveragesTab')]");

	/*
	 * OptionalCoveragesTab
	 */
	private static By Coverages_OptionalCoveragesTab = By.xpath("//div[contains(@id,'HOPOptionalCoveragesTab')]");
	private static By Coverages_PolicyLineCoverages  = By.xpath("//div[contains(@id,'HOPOptionalCoveragesPanelSet')]//div[@class='gw-TitleBar--title' and text()='Policy Line Coverages']");
	private static By Coverages_DwellingCoverages    = By.xpath("//div[contains(@id,'HOPOptionalCoveragesPanelSet')]//div[@class='gw-TitleBar--title' and text()='Dwelling Coverages']");

	/*
	 * ConditionsAndExclusionTab
	 */
	private static By Coverages_ConditionsAndExclusionTab = By.xpath("//div[contains(@id,'HOPConditionsAndExclusionsTab')]");
	private static By Coverages_Conditions                = By.xpath("//div[contains(@id,'HOPConditionsAndExclusionsPanelSet')]//div[@class='gw-TitleBar--title' and text()='Conditions']");
	private static By Coverages_Exclusions                = By.xpath("//div[contains(@id,'HOPConditionsAndExclusionsPanelSet')]//div[@class='gw-TitleBar--title' and text()='Exclusions']");

	public static void SectionICoverage() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Coverages", strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", HO_Coverages_Screen_titlebar, "equals", "Coverages");
			GuidewireAutomate("Coverages tab", Coverages_CoveragesTab, "click", "click");
			GuidewireAutomate_Validation("Section I Coverages", HO_CT_CoveragesSectionICoverages, "contains", "Section I Coverages");
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	/***
	 * Coverage A - Dwelling
	 */
	public static void CoverageADwelling() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Coverages", strTestCaseName);

			GuidewireAutomate_Validation("Coverage A Dwelling", HO_CT_CATAV_CoverageADwelling, "equals", "");
			GuidewireAutomate("CovA Limit", HO_CT_CATAV_CovALimit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CovALimit"));
			GuidewireAutomate("Coinsurance", HO_CT_CATAV_Coinsurance, "selectByVisibleText", lhm_TestCase_Table_Data.get("Coinsurance"));
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void CoverageBOtherStructures() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Coverages", strTestCaseName);

			GuidewireAutomate_Validation("Coverage B - Other Structures", HOC_CT_CATAV_CoverageBOtherStructures, "equals", "Coverage B - Other Structures");
			GuidewireAutomate("CovB Limit", HOC_CT_CATAV_CovBLimitPct, "selectByVisibleText", lhm_TestCase_Table_Data.get("CovBLimit"));

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void CoverageCPersonalProperty() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Coverages", strTestCaseName);

			GuidewireAutomate_Validation("Coverage C - Personal Property", HOC_CT_CATAV_CoverageCPersonalProperty, "equals", "Coverage C - Personal Property");
			GuidewireAutomate("SelfStorageUnits", HOC_CT_CATAV_SelfStorageUnits, "selectByVisibleText", lhm_TestCase_Table_Data.get("SelfStorageUnits"));

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void CoverageDLossofUse() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Coverages", strTestCaseName);

			GuidewireAutomate_Validation("Coverage D - Loss of Use", HOC_CT_CATAV_CoverageDLossofUse, "equals", "");
			GuidewireAutomate("CovDLimitPct", HOC_CT_CATAV_CovDLimitPct, "selectByVisibleText", lhm_TestCase_Table_Data.get("CovDLimitPct"));
			GuidewireAutomate("LossofRentalIncome", HOC_CT_CATAV_LossofRentalIncome, "clickAndwait", lhm_TestCase_Table_Data.get("LossofRentalIncome"));
			GuidewireAutomate("ProhibitedUseCivilAuthority", HOC_CT_CATAV_ProhibitedUseCivilAuthority, "selectByVisibleText", lhm_TestCase_Table_Data.get("ProhibitedUseCivilAuthority"));

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void SectionIDeductibles() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Coverages", strTestCaseName);

			GuidewireAutomate_Validation("Section I Deductibles", HOC_CT_CATAV_SectionIDeductibles, "equals", "Section I Deductibles");
			GuidewireAutomate("All Perils", HOC_CT_CATAV_AllPerils, "selectByVisibleText", lhm_TestCase_Table_Data.get("AllPerils"));

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void SectionIICoverage() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Coverages", strTestCaseName);

			GuidewireAutomate_Validation("Section II Coverages", HOC_CT_CoveragesSectionIICoverages, "equals", "Section II Coverages");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void CoverageEPersonalLiability() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Coverages", strTestCaseName);

			GuidewireAutomate_Validation("Coverage E - Personal Liability", HOC_CT_CATAV_CoveragePersonalLiability, "equals", "Coverage E - Personal Liability");
			GuidewireAutomate("CovELimit", HOC_CT_CATAV_CovELimit, "selectByVisibleText", lhm_TestCase_Table_Data.get("CovELimit"));

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void CoverageFMedicalPaymentsToOthers() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Coverages", strTestCaseName);

			GuidewireAutomate_Validation("Coverage F - Medical Payments To Others", HOC_CT_CATAV_CoverageFMedicalPaymentsToOthers, "equals", "Coverage F - Medical Payments To Others");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void additionalcoverages() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Coverages", strTestCaseName);

			GuidewireAutomate("Additional Coverages tab", Coverages_AdditionalCoveragesTab, "clickAndwait", "click");
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void optionalcoverages() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Coverages", strTestCaseName);

			GuidewireAutomate("Optional Coverages tab", Coverages_OptionalCoveragesTab, "clickAndwait", "click");
			GuidewireAutomate_Validation("PolicyLineCoverages", Coverages_PolicyLineCoverages, "equals", "Policy Line Coverages");

			GuidewireAutomate_Validation("DwellingCoverages", Coverages_DwellingCoverages, "equals", "Dwelling Coverages");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void ConditionsAndExclusioncoverages() throws Throwable {

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Coverages", strTestCaseName);

			GuidewireAutomate("ConditionsAndExclusion Coverages tab", Coverages_ConditionsAndExclusionTab, "clickAndwait", "click");
			GuidewireAutomate_Validation("Conditions", Coverages_Conditions, "equals", "Conditions");
			GuidewireAutomate_Validation("Exclusions", Coverages_Exclusions, "equals", "Exclusions");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}
}
