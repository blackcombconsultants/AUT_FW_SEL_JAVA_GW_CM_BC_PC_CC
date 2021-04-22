package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Submission extends SeleniumWebDriver_Commands implements PersonalAuto_SubmissionBoud_PO {

	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Submission(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void submissionBound() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("pasubmissionBound", strTestCaseName);
		String strDynamicXpath = lhm_TestCase_Table_Data.get("SubmissionBound");
		By View_your_Submission = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By View_your_Policy = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By Go_to_the_submission_manager_for_this_account = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By Submit_an_application_for_a_different_account = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By Go_To_Your_Desktop = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		GuidewireAutomate("View your Submission", View_your_Submission, "click", "");

	}

	@Override
	// ------>clicking on view_your_SubmissionIt will go to Quote Screen
	public void view_your_Submission() throws Throwable {

		GuidewireAutomate_Validation("PA Quote Screen titlebar", PA_Quote_Screen_titlebar, "equals", "Quote");
		/// ----->verifying the PA Quote Address
		GuidewireAutomate_Validation("Address", PA_Quote_Address, "equals", lhm_TestCase_Table_Data.get("Address"));
		// ---->verifying the PA Quote Model year
		GuidewireAutomate_Validation("Model Year", PA_Quote_Model_Year, "equals",
				lhm_TestCase_Table_Data.get("ModelYear"));
	}

	@Override
	// ------>clicking on View_your_Policy It will go to Summary Screen
	public void View_your_Policy() throws Throwable {

		// ---->verifying summary screen title
		GuidewireAutomate_Validation("summary_screen_title", summary_screen_title, "equals",
				"Policy Summary: 8462126871");
		// -------->verifying summary product
		GuidewireAutomate_Validation("summary_product", summary_product, "equals",
				lhm_TestCase_Table_Data.get("summaryProduct"));
		// -------->verifying summary offering
		GuidewireAutomate_Validation("summary_offering", summary_offering, "equals",
				lhm_TestCase_Table_Data.get("Offering"));

	}

	@Override
	// ------>clicking on submission manager
	public void Go_to_the_submission(String type) throws Throwable {
		// ---->verifying summary screen title
		GuidewireAutomate_Validation("submission_title", submission_title, "equals", "Submission Manager");
		GuidewireAutomate("submission_filter", submission_filter, "click", type);
		switch (type) {
		case "All Submissions":
			GuidewireAutomate("submission_filtert", submission_filter, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("submissionfilter"));
			break;
		case "Open Submissions":
			GuidewireAutomate("submission_filtert", submission_filter, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("submissionfilter"));
			break;
		case "Complete Submissions":
			GuidewireAutomate("submission_filtert", submission_filter, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("submissionfilter"));
			break;
		default:
			break;

		}
	}

	@Override
	// ------->clicking on new submission screen
	public void Submit_an_application() throws Throwable {
		GuidewireAutomate("Submit an_application_for_a_different_account",
				Submit_an_application_for_a_different_account, "click", "");

	}

	@Override
	public void Go_To_Your_Desktop() throws Throwable {
		GuidewireAutomate("Go_To_Your_Desktop", Go_To_Your_Desktop, "click", "");

	}

}
