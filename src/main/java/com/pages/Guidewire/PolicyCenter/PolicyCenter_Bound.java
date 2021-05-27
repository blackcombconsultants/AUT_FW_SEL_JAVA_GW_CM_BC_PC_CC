package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PolicyCenter_Bound extends SeleniumWebDriver_Commands implements PolicyCenter_Bound_PO {

	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PolicyCenter_Bound(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void submissionBound() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("submissionBound", strTestCaseName);
		String strDynamicXpath                               = lhm_TestCase_Table_Data.get("SubmissionBound");
		By     View_your_Submission                          = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By     View_your_Policy                              = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By     Go_to_the_submission_manager_for_this_account = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By     Submit_an_application_for_a_different_account = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By     Go_To_Your_Desktop                            = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		GuidewireAutomate("View your Submission", SB_ViewYourSubmission, "clickAndwait", "NA");

	}

	// ------>clicking on view_your_SubmissionIt will go to Quote Screen
	public static void viewYourSubmission() throws Throwable {
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Submission Bound");
		GuidewireAutomate("View your Submission", SB_ViewYourSubmission, "clickAndwait", "NA");

	}

	// ------>clicking on View_your_Policy It will go to Summary Screen
	public static void ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Submission Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "NA");

	}
	public static void policyChangeBound_ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Policy Change Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "NA");

	}

	public static void Cancellation_ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Cancellation Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "NA");

	}
	public static void Reinstatement_ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Reinstatement Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "NA");

	}
	public static void Reinstatement_ViewYourrenewal() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Renewal Renewing");

		GuidewireAutomate("View your Policy", SB_ViewYourrenewal, "clickAndwait", "NA");

	}
	public static void RenewalRenewing_ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Renewal Renewing");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "NA");

	}
	public static void RewriteFullTermBound_ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Rewrite Full Term Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "NA");

	}
	public static void RewriteNewTermBound_ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Rewrite New Term Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "NA");

	}
	public static void RewriteRemainderofTermBound_ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Rewrite Remainder of Term Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "NA");

	}
	public static void RewriteFullTermBound_ReviewChanges() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Cancellation Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "NA");

	}
	public static void RewriteFullTermBound_goToYourDesktop() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Cancellation Bound");

		GuidewireAutomate("View your Policy", GoToYourDesktop, "clickAndwait", "NA");

	}
	// ------>clicking on submission manager
	public static void GoToTheSubmissionManagerforthisAccount(String type) throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Submission Bound");

		// ---->verifying summary screen title
		GuidewireAutomate_Validation("submission_title", submission_title, "equals", "Submission Manager");
		GuidewireAutomate("submission_filter", submission_filter, "click", type);
		switch (type) {
			case "All Submissions" :
				GuidewireAutomate("submission_filtert", submission_filter, "selectByVisibleText", lhm_TestCase_Table_Data.get("submissionfilter"));
				break;
			case "Open Submissions" :
				GuidewireAutomate("submission_filtert", submission_filter, "selectByVisibleText", lhm_TestCase_Table_Data.get("submissionfilter"));
				break;
			case "Complete Submissions" :
				GuidewireAutomate("submission_filtert", submission_filter, "selectByVisibleText", lhm_TestCase_Table_Data.get("submissionfilter"));
				break;
			default :
				break;

		}
	}

	// ------->clicking on new submission screen
	public static void submitApplicationForDifferentAccount() throws Throwable {
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Submission Bound");

		GuidewireAutomate("Submit an_application_for_a_different_account", Submit_an_application_for_a_different_account, "clickAndwait", "");

	}

	public static void goToYourDesktop() throws Throwable {
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Submission Bound");
		GuidewireAutomate("Go_To_Your_Desktop", GoToYourDesktop, "clickAndwait", "");

	}

	public static void submissionManager() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void NotTaken() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void SubmissionDecline() throws Throwable {
		// TODO Auto-generated method stub

	}

}
