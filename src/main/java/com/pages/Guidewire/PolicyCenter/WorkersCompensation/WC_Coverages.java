package com.pages.Guidewire.PolicyCenter.WorkersCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class WC_Coverages extends SeleniumWebDriver_Commands {

	public WC_Coverages(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}


	private static By PolicyInfo_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Policy Info']");

	private static By addClass_Table                    = By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-13']//table/tbody/tr[2]");
	private static By add_Class                         = By.xpath("//div[contains(text(),'Add C')]");
	private static By add_Class_Get_Row_Count           = By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-13']//table/tbody/tr/td[1]");
	private static By add_Class_Get_Cl_Count            = By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-13']//table/tbody/tr/td[8]");
	private static By BureauID                          = By
			.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-officialIDs-0-ANI_OfficialIDEntry']/div/input");
	private static By Governing_Law                     = By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-SpecialCoverage");
	private static By Location                          = By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-Loc");
	private static By Class_Code_Input                  = By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-ClassCode");
	private static By Employee                          = By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-NumEmployees");
	private static By Basis                             = By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV-0-AnnualRenum");
	private static By RefClick                          = By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV']/div/div[1]");
	private static By modifer_Contractor_Class_Eligible = By
			.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-UnsplitModifiers-WCModifiersInputSet-ModIteratorEligible-1-EligibilityInputGroup-_checkbox");
	private static By Contract_Class_Value              = By.name(
			"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-UnsplitModifiers-WCModifiersInputSet-ModIteratorEligible-1-EligibilityInputGroup-ModifierInput");
	private static By RefClick2                         = By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-6']");

	public static void dateQuoteNeeded() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", PolicyInfo_Header, "equals", "Policy Info");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

}
