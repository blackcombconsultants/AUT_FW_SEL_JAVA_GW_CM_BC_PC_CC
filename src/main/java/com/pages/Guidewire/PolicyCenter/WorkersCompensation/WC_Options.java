package com.pages.Guidewire.PolicyCenter.WorkersCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class WC_Options extends SeleniumWebDriver_Commands {

	public WC_Options(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}


	private static By PolicyInfo_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Policy Info']");

	private static By PI_DateQuoteNeeded = By.xpath("//input[contains(@name,'DateQuoteNeeded')]");

	private static By add_Optn_btn          = By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-OptionIteratorButton']/div[1]");
	private static By subMenu               = By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-OptionIteratorButton-0-CurrentOption']/div/div[2]");
	private static By submenu1              = By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-OptionIteratorButton']/div[3]/div");
	private static By fl_WC_Act             = By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-GoverningAct");
	private static By fl_WC_Accident        = By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-FedEmpLiabLimit");
	private static By fl_WC_Disease_Lmt     = By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-FELADiseaseLimit");
	private static By fl_add_Get_Row_Count  = By
			.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV']//table/tbody/tr/td[1]");
	private static By RefClick              = By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV']/div/div[1]");
	private static By fl_Add                = By
			.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV_tb-Add']/div/div[2]/div");
	private static By location              = By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-Loc");
	private static By classCode             = By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-ClassCode");;
	private static By employee              = By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-NumEmployees");;
	private static By basis                 = By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-AnnualRenum");;
	private static By classCodeSearchButton = By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-ClassCode-SelectClassCode");
	private static By classCodeSearch       = By.name("WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-Code");
	private static By classCodeSearchIcon   = By.id("WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search");
	private static By searchResult          = By.id("WCClassCodeSearchPopup-WCClassCodeSearchScreen-ClassCodeSearchResultsLV-0-_Select");

	public static void dateQuoteNeeded() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", PolicyInfo_Header, "equals", "Policy Info");

		GuidewireAutomate("Date Quote Needed", PI_DateQuoteNeeded, "sendKeys", lhm_TestCase_Table_Data.get("PI_DateQuoteNeeded"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

}
