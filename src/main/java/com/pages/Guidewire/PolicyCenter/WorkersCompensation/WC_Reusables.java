package com.pages.Guidewire.PolicyCenter.WorkersCompensation;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Account;
import com.pages.Guidewire.PolicyCenter.PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class WC_Reusables extends SeleniumWebDriver_Commands {

	public WC_Reusables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	/*
	 * 
	 */

	private static By LOB_WorkersCompensation = By.xpath("//div[text()='Workers' Compensation']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");

	// Submission Menu
	private static By WC_Qualification  = By.xpath("//div[@id='SubmissionWizard-Qualification']/div[@role='menuitem']");
	private static By WC_PolicyContract = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup']/div[@role='menuitem']");
	private static By WC_PolicyInfo     = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PolicyInfo']/div[@role='menuitem']");
	private static By WC_Location       = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PADrivers']/div[@role='menuitem']");
	private static By WC_Coverages      = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PALine']/div[@role='menuitem']");
	private static By WC_Supplemental   = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PALine']/div[@role='menuitem']");
	private static By WC_Options        = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PADrivers']/div[@role='menuitem']");
	private static By WC_RiskAnalysis   = By.xpath("//div[@id='SubmissionWizard-RiskAnalysis']/div[@role='menuitem']");
	private static By WC_PolicyReview   = By.xpath("//div[@id='SubmissionWizard-PolicyReview']/div[@role='menuitem']");
	private static By WC_Quote          = By.xpath("//div[@id='SubmissionWizard-ViewQuote']/div[@role='menuitem']");
	private static By WC_Forms          = By.xpath("//div[@id='SubmissionWizard-Forms']/div[@role='menuitem']");
	private static By WC_Payment        = By.xpath("//div[@id='SubmissionWizard-BillingInfo']/div[@role='menuitem']");

	/*
	 * 
	 */

	public static void wcMenuNavigation(String Menu) throws Throwable {
		switch (Menu) {
			case "Qualification" :
				GuidewireAutomate("Qualification", WC_Qualification, "clickAndwait", "click");
				break;
			case "Policy Info" :
				GuidewireAutomate("Policy Info", WC_PolicyInfo, "clickAndwait", "click");
				break;
			case "WC Options" :
				GuidewireAutomate("Vehicles", WC_Options, "clickAndwait", "click");
				break;
			case "WC Coverages" :
				GuidewireAutomate("PACoverages", WC_Coverages, "clickAndwait", "click");
				break;
			case "Risk Analysis" :
				GuidewireAutomate("Risk Analysis", WC_RiskAnalysis, "clickAndwait", "click");
				break;
			default :
				throw new IOException("No support for Menu : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to Menu = " + Menu + " is Succesful");
	}

	public static void newSubmission_SelectLOB_WorkersCompensation() throws Throwable {
		try {
			GuidewireAutomate("Workers Compensation", LOB_WorkersCompensation, "clickAndwait", "click");
			oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
			oExtentTest.log(Status.PASS, "Workers Compensation selection is Successful");

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Workers Compensation selection is UnSuccessful");
			e.printStackTrace();
			throw e;
		}
	}

	public void submissionProcess(String Account, String Job) throws Throwable {

		String strEditLock;

		switch (Account) {
			case "New Account" :
				Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
				PC_Account.createPersonAccount();
				PC_AccountSummary.detail_Verify();

				break;
			case "Account Search" :
				PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
				PC_AccountSummary.detail_Verify();

				break;
			case "Rewrite" :

				break;

			default :
				throw new IOException("No support for Account : " + Account);
		}

		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		newSubmission_SelectLOB_WorkersCompensation(); // select
														// LOB
		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.clickButton("Next");

		switch (Job) {

			case "Issue Policy" :

				break;

			case "Rewrite" :

				break;

			default :
				throw new IOException("No support for Job : " + Job);
		}

	}

	public static LinkedHashMap<String, String> getData_WorkersCompensation(String string, String dataSet) {
		// TODO Auto-generated method stub
		return null;
	}

}
