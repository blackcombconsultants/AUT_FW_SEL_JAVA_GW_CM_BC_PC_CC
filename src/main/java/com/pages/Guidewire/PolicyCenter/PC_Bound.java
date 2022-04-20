package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PC_Bound extends SeleniumWebDriver_Commands {

	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();
	// ------>submission bound xpaths
	private static By SB_ViewYourSubmission                         = By.xpath("//div[contains(@id,'JobCompleteDV-ViewJob')]//div[contains(text(),'View your submission')]");
	private static By SB_ViewYourPolicy                             = By.xpath("//div[contains(@id,'JobCompleteDV-ViewPolicy')]//div[contains(text(),'View your policy')]");
	private static By SB_ViewChangePolicyLink                       = By.xpath("//div[contains(@id,'-ResolveWithFutureUnboundPeriods')]//div[@class='gw-action']");
	private static By Go_to_the_submission_manager_for_this_account = By.xpath("//div[contains(@id,'JobCompleteDV-SubmissionManager')]//div[text()='Go to the submission manager for this account']");
	private static By Submit_an_application_for_a_different_account = By.xpath("//div[contains(@id,'JobCompleteDV-SubmitAnother')]//div[text()='Submit an application for a different account']");
	private static By PB_ViewUnboundRenewal                         = By.xpath("//div[contains(@id,'ResolveWithFutureUnboundPeriods')]//div[@class='gw-action' and contains(text(),'There is a later unbound renewal')]");
	private static By CloseOption                                   = By.xpath("//div[contains(@id,'PreemptionConflictScreen-CloseButton')]");
	private static By GoToYourDesktop                               = By.xpath("//div[contains(@id,'JobCompleteDV-ReturnToDesktop')]//div[text()='Go to your desktop']");
	private static By ReviewChanges                                 = By.xpath("//div[contains(@id,'ReviewChanges')]//div[text()='Review Changes']");
	private static By SB_ViewYourrenewal                            = By.xpath("//div[contains(@id,'ViewJob')]//div[contains(text(),'View your renewal')]");

	private static By PA_Quote_Screen_titlebar = By.xpath("//div[contains(@id,'QuoteScreen-ttlBar')]//div[1]/div");
	private static By PA_Quote_Address         = By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressSummary_Input')]//div[@class='gw-value-readonly-wrapper']");
	private static By PA_Quote_Model_Year      = By.xpath("//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-vehicleLV-5')]//td[1]//div[@class='gw-value-readonly-wrapper']");
	// ----->summary screen xpaths
	private static By summary_screen_title = By.xpath(" //div[@id='PolicyFile_Summary-ttlBar']//div[@class='gw-TitleBar--title']");
	private static By summary_product      = By.xpath("//div[contains(@id,'PolicyDetailsDetailViewTile_DV-Product')]//div[@class='gw-value-readonly-wrapper']");
	private static By summary_offering     = By.xpath("//div[contains(@id,'PolicyDetailsDetailViewTile_DV-Offering')]//div[@class='gw-value-readonly-wrapper']");
	// ------->submission manager screen xpaths
	private static By submission_title  = By.xpath("//div[@id='SubmissionManager-SubmissionManagerScreen-0']//div[@class='gw-TitleBar--title']");
	private static By submission_filter = By.xpath("//select[contains(@name,'SubmissionManagerLV-submissionFilter')]");

	/*
	 * 
	 * Modules
	 * 
	 * void submissionBound() throws Throwable;
	 * 
	 * void view_your_Submission() throws Throwable;
	 * 
	 * void View_your_Policy() throws Throwable;
	 * 
	 * void Go_to_the_submission(String type) throws Throwable;
	 * 
	 * void Submit_an_application() throws Throwable;
	 * 
	 * void Go_To_Your_Desktop() throws Throwable;
	 * 
	 * void submissionManager() throws Throwable;
	 * 
	 * void NotTaken() throws Throwable;
	 * 
	 * void SubmissionDecline() throws Throwable;
	 */
	public PC_Bound(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void submissionBound() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("submissionBound", strTestCaseName);
		String strDynamicXpath                               = lhm_TestCase_Table_Data.get("SubmissionBound");
		By     View_your_Submission                          = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By     View_your_Policy                              = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By     Go_to_the_submission_manager_for_this_account = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By     Submit_an_application_for_a_different_account = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By     Go_To_Your_Desktop                            = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		GuidewireAutomate("View your Submission", SB_ViewYourSubmission, "clickAndwait", "click");

	}

	// ------>clicking on view_your_SubmissionIt will go to Quote Screen
	public static void viewYourSubmission() throws Throwable {
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Submission Bound");
		GuidewireAutomate("View your Submission", SB_ViewYourSubmission, "clickAndwait", "click");

	}

	/*
	 * name:shanta Date:31/03/2022
	 */
	// ------>clicking on view_your_SubmissionIt will go to Quote Screen
	public static void viewYourSubmissionDeclined() throws Throwable {
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Submission Declined");
		GuidewireAutomate("View your Submission", SB_ViewYourSubmission, "clickAndwait", "click");

	}

	// ------>clicking on View_your_Policy It will go to Summary Screen
	public static void ViewYourPolicy() throws Throwable {
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
		// GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Cancellation Bound");
		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");

	}

	public static void ViewYourPolicy_RenewalNonrenewing() throws Throwable {
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Renewal Non-renewing");
		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");

	}
	/*
	 * Name:shanta Date:31/03/2022
	 */
	public static void RenewalBound_ViewYourPolicy() throws Throwable {
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Renewal Bound");
		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");

	}
	public static void policyChangeBound_ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Policy Change Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");

	}

	public static void Cancellation_ViewYourPolicy() throws Throwable {

		// GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Policy Change Bound");

		// GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Cancellation Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");

	}
	public static void Cancellation_Scheduled_ViewYourPolicy() throws Throwable {
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header1);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header1, "contains", "Cancellation Scheduled");
		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");
	}

	public static void Reinstatement_ViewYourPolicy() throws Throwable {
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Reinstatement Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");

	}
	public static void Reinstatement_ViewYourrenewal() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Renewal Renewing");

		GuidewireAutomate("View your Policy", SB_ViewYourrenewal, "clickAndwait", "click");

	}

	public static void Renewal_ViewYourrenewal() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Renewal Renewing");

		GuidewireAutomate("View your Policy", SB_ViewYourrenewal, "clickAndwait", "click");

	}

	public static void Renewal_ViewTheUnboundRenewal() throws Throwable {
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Policy Change Bound");
		GuidewireAutomate("ViewRenewal", PB_ViewUnboundRenewal, "clickAndwait", "click");
		GuidewireAutomate("closeButton", CloseOption, "clickAndwait", "click");
	}
	public static void RenewalRenewing_ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Renewal Renewing");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");

	}
	/*
	 * Name:shanta Date:31/03/2022
	 */
	public static void RenewalNonRenewing_ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Renewal Non-renewing");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");

	}
	public static void RewriteFullTermBound_ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Rewrite Full Term Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");

	}
	public static void RewriteNewTermBound_ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Rewrite New Term Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");

	}
	public static void RewriteRemainderofTermBound_ViewYourPolicy() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Rewrite Remainder of Term Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");

	}
	public static void RewriteFullTermBound_ReviewChanges() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Cancellation Bound");

		GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");

	}
	public static void RewriteFullTermBound_goToYourDesktop() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Cancellation Bound");

		GuidewireAutomate("View your Policy", GoToYourDesktop, "clickAndwait", "click");

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

	/*
	 * Owner: Rahul Dixit Description: Unbound link at the end policy change
	 */
	public static void policyChangeBound_PolicyChange() throws Throwable {
		getStaleElement("PolicyCenter_Resuables_PO.Screen_Header", PolicyCenter_Resuables_PO.Screen_Header);
		GuidewireAutomate_waitForElement(PolicyCenter_Resuables_PO.Screen_Header, "visibilityOfElementLocated", "");
		GuidewireAutomate_waitForElement(PolicyCenter_Resuables_PO.Screen_Header, "visibilityOfElementLocated", "");
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Policy Change Bound");
		GuidewireAutomate("View your Policy", SB_ViewChangePolicyLink, "clickAndwait", "click");

	}

}
