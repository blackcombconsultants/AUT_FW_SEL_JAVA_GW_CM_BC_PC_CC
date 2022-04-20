package com.pages.Guidewire.PolicyCenter.InlineMarine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class IM_ContractorsEquipment extends SeleniumWebDriver_Commands {

	public IM_ContractorsEquipment(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	private static By ContractorsEquipment_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Contractors Equipment']");

	// Coverage-PartLevelInformation
	private static By C_PLI_ContractorType = By.xpath("//select[contains(@name,'contrEqContractorType')]");

	// Part Level Coverages-Contractors Rented Equipment
	private static By PLI_ContractorsRentedEquipment = By.xpath("//input[contains(@name,'partLevelCovs-0-CoverageInputSet-CovPatternInputGroup-_checkbox')]");
	private static By PLI_CRE_Limit                  = By.xpath("//input[contains(@name,'CovPatternInputGroup-0-CovTermInputSet-CovTermDirectInputSet-DirectTermInput')]");

	// Unscheduled Equipment-Contractors Equipment - Misc. Items
	private static By UE_CE_MiscItems       = By.xpath("//input[contains(@name,'policywideUnscheduledCovs-0-CoverageInputSet-CovPatternInputGroup-_checkbox')]");
	private static By UE_CE_MiscItems_Limit = By.xpath("//input[contains(@name,'policywideUnscheduledCovs-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-CovTermDirectInputSet-DirectTermInput')]");

	// Underwriting Information
	private static By CE_UnderwritingInformation = By.xpath("//div[contains(@id,'ContractorsEquipmentPartPanelSet-uwInfoTab')]//div[@role='tab']");

	private static By UI_Isaguardorwatchpersonserviceemployedwheretheequipmentisoperatedorstored      = By.xpath("//input[contains(@id,'0-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By UI_Areallemployeeincludingtemporariestrainedtohandletheequipmenttheywilloperate = By.xpath("//input[contains(@id,'1-QuestionModalInput-BooleanRadioInput_NoPost_1')]");

	public static void Coverages_PartLevelInformation() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("contractorsEquipment", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", ContractorsEquipment_Header, "equals", "Contractors Equipment");
			GuidewireAutomate("ContractorType", C_PLI_ContractorType, "selectByVisibleText", lhm_TestCase_Table_Data.get("C_PLI_ContractorType"));
		} catch (Exception e) {

		}
	}

	public static void PLI_ContractorsRentedEquipment() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("contractorsEquipment", strTestCaseName);
			GuidewireAutomate("ContractorsRentedEquipment", PLI_ContractorsRentedEquipment, "click", "click");
			GuidewireAutomate("Limit", PLI_CRE_Limit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PLI_CRE_Limit"));
		} catch (Exception e) {

		}
	}

	public static void UnscheduledEquipment_CE_MiscItems() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("contractorsEquipment", strTestCaseName);
			GuidewireAutomate("MiscItems", UE_CE_MiscItems, "click", "click");
			GuidewireAutomate("Limit", UE_CE_MiscItems_Limit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("UE_CE_MiscItems_Limit"));
		} catch (Exception e) {

		}
	}

	public static void UnderwritingInformation() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("contractorsEquipment", strTestCaseName);
			GuidewireAutomate("UnderwritingInformation", CE_UnderwritingInformation, "click", "click");
			GuidewireAutomate("Isaguardorwatchpersonserviceemployedwheretheequipmentisoperatedorstored", UI_Isaguardorwatchpersonserviceemployedwheretheequipmentisoperatedorstored, "click", "click");
			GuidewireAutomate("Areallemployeeincludingtemporariestrainedtohandletheequipmenttheywilloperate", UI_Areallemployeeincludingtemporariestrainedtohandletheequipmenttheywilloperate, "click", "click");

		} catch (Exception e) {

		}
	}
}
