package com.pages.Guidewire.PolicyCenter.WorkersCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class WC_Supplemental extends SeleniumWebDriver_Commands {

	public WC_Supplemental(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By PolicyInfo_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Policy Info']");


	private static By Any_employees_under_16_or_over_60_years_of_age  = By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompSupplementalScreen-QuestionSetsDV-0-QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost_0");
	private static By Are_athletic_teams_sponsored                    = By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompSupplementalScreen-QuestionSetsDV-0-QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_NoPost_0");
	private static By Any_work_performed_underground_or_above_15_feet = By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompSupplementalScreen-QuestionSetsDV-0-QuestionSetLV-4-QuestionModalInput-BooleanRadioInput_NoPost_0");
	private static By Do_employees_travel_out_of_state                = By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompSupplementalScreen-QuestionSetsDV-0-QuestionSetLV-12-QuestionModalInput-BooleanRadioInput_NoPost_0");
	private static By Any_seasonal_employees                          = By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompSupplementalScreen-QuestionSetsDV-0-QuestionSetLV-17-QuestionModalInput-BooleanRadioInput_NoPost_0");
	private static By Is_there_any_volunteer_or_donated_labor         = By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompSupplementalScreen-QuestionSetsDV-0-QuestionSetLV-21-QuestionModalInput-BooleanRadioInput_NoPost_0");
	private static By Do_any_employees_predominantly_work_at_home     = By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompSupplementalScreen-QuestionSetsDV-0-QuestionSetLV-22-QuestionModalInput-BooleanRadioInput_NoPost_0");

	public static void dateQuoteNeeded() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", PolicyInfo_Header, "equals", "Policy Info");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

}
