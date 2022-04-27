package com.pages.Guidewire.PolicyCenter.CommercialAuto;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Account;
import com.pages.Guidewire.PolicyCenter.PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class CA_Reusables extends SeleniumWebDriver_Commands {

	public CA_Reusables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	/*
	 * LOB
	 */
	private static By LOB_CommercialAuto = By.xpath("//div[text()='Commercial Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");

	/*
	 * Menu
	 */
	private static By SW_Offering              = By.xpath("//div[contains(@id,'Offering')]/div[@role='menuitem']");
	private static By SW_PreQualification      = By.xpath("//div[contains(@id,'PreQualification')]/div[@role='menuitem']");
	private static By SW_CA_PolicyContract     = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup']/div[@role='menuitem']");
	private static By SW_CA_PolicyInfo         = By.xpath("//div[contains(@id,'PolicyInfo')]/div[@role='menuitem']");
	private static By SW_CA_CommercialAutoLine = By.xpath("//div[contains(@id,'baLineStep')]/div[@role='menuitem']");
	private static By SW_CA_Locations          = By.xpath("//div[contains(@id,'LOBWizardStepGroup-Locations')]/div[@role='menuitem']");
	private static By SW_CA_Vehicles           = By.xpath("//div[contains(@id,'LOBWizardStepGroup-BusinessVehicles')]/div[@role='menuitem']");
	private static By SW_CA_StateInfo          = By.xpath("//div[contains(@id,'LOBWizardStepGroup-StateInfo')]/div[@role='menuitem']");
	private static By SW_CA_Drivers            = By.xpath("//div[contains(@id,'LOBWizardStepGroup-BADrivers')]/div[@role='menuitem']");
	private static By SW_CA_CoveredVehicles    = By.xpath("//div[contains(@id,'LOBWizardStepGroup-CoveredAutoSymbols')]/div[@role='menuitem']");
	private static By SW_CA_Modifiers          = By.xpath("//div[contains(@id,'LOBWizardStepGroup-Modifiers')]/div[@role='menuitem']");
	private static By SW_CA_RiskAnalysis       = By.xpath("//div[contains(@id,'RiskAnalysis')]/div[@role='menuitem']");
	private static By SW_CA_PolicyReview       = By.xpath("//div[contains(@id,'PolicyReview')]/div[@role='menuitem']");
	private static By SW_CA_Quote              = By.xpath("//div[contains(@id,'ViewQuote')]/div[@role='menuitem']");
	private static By SW_CA_Forms              = By.xpath("//div[contains(@id,'Forms')]/div[@role='menuitem']");
	private static By SW_CA_Payment            = By.xpath("//div[contains(@id,'BillingInfo')]/div[@role='menuitem']");


	// Validation Error
	private static By ValidationErrorHeader = By.xpath("//div[contains(@id,'wsTabBar-wsTab_0')]//div[@role='tab']");
	private static By ClearButton           = By.xpath("//div[contains(@id,'ClearButton')]//div[@role='button']");
	static By Infobar_PolicyNumberLink  = By.xpath("//div[contains(@id,'JobWizardInfoBar-PolicyNumber')]//div[@class='gw-label gw-infoValue']");
	/*
	 * 
	 */

	public static LinkedHashMap<String, String> getData_CommercialAuto(String strTable) throws Throwable {

		return Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_Fillo(pTestDataFile_CommercialAuto, strTable, strTestCaseName);

	}

	public static LinkedHashMap<String, String> getData_Row_CommercialAuto(String strTable, int SecondKey) throws Throwable {

		return Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_DataSet_Fillo(pTestDataFile_CommercialAuto, strTable, strTestCaseName, SecondKey);

	}

	public static void UpdateData_CommercialAuto(String strTable, String strColumn, String strValue) throws Throwable {

		Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Column_Fillo(pTestDataFile_CommercialAuto, strTable, strColumn, strValue);

	}

	public static void newSubmission_SelectLOB_CommercialAuto() throws Throwable {
		GuidewireAutomate("LOB CommerciallAuto", LOB_CommercialAuto, "clickAndwait", "click");
	}

	public static void submissionMenuNavigation(String Menu) throws Throwable {
		try {

			switch (Menu) {
				case "Offering":
					GuidewireAutomate("Offering", SW_Offering, "clickAndwait", "click");
					break;
				case "Qualification":
					GuidewireAutomate("Qualification", SW_PreQualification, "clickAndwait", "click");
					break;
				case "Policy Info":
					GuidewireAutomate("Policy Info", SW_CA_PolicyInfo, "clickAndwait", "click");
					break;
				case "Commercial Auto Line":
					GuidewireAutomate("Commercial Auto Line", SW_CA_CommercialAutoLine, "clickAndwait", "click");
					break;
				case "Locations":
					GuidewireAutomate("Locations", SW_CA_Locations, "clickAndwait", "click");
					break;
				case "Vehicles":
					GuidewireAutomate("Vehicles", SW_CA_Vehicles, "clickAndwait", "click");
					break;
				case "State Info":
					GuidewireAutomate("PACoverages", SW_CA_StateInfo, "clickAndwait", "click");
					break;
				case "Drivers":
					GuidewireAutomate("Drivers", SW_CA_Drivers, "clickAndwait", "click");
					break;
				case "Covered Vehicles":
					GuidewireAutomate("PACoverages", SW_CA_CoveredVehicles, "clickAndwait", "click");
					break;
				case "Modifiers":
					GuidewireAutomate("PACoverages", SW_CA_Modifiers, "clickAndwait", "click");
					break;
				case "Risk Analysis":
					GuidewireAutomate("PACoverages", SW_CA_RiskAnalysis, "clickAndwait", "click");
					break;
				case "Policy Review":
					GuidewireAutomate("PACoverages", SW_CA_PolicyReview, "clickAndwait", "click");
					break;
				case "Quote":
					GuidewireAutomate("PACoverages", SW_CA_Quote, "clickAndwait", "click");
					break;
				case "Forms":
					GuidewireAutomate("PACoverages", SW_CA_Forms, "clickAndwait", "click");
					break;
				case "Payment":
					GuidewireAutomate("PACoverages", SW_CA_Payment, "clickAndwait", "click");
					break;
				default:
					throw new IOException("No support for Menu : " + Menu);
			}
			oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
			oExtentTest.log(Status.INFO, "Navigation to Commercial Auto Menu = " + Menu + " is Succesful");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}


	/*
	 * Name:shanta
	 */

	public static void SubmissionProcess(String Account, String Job) throws Throwable {

		String strEditLock;

		switch (Account) {
			case "New Account" :
				Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
				PC_Account.createPersonAccount();
				PC_AccountSummary.detail_Verify();

				break;
			case "New Company Account" :
				Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
				PC_Account.createCompanyAccount();
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

		switch (Job) {
			case "Save Draft" :

				Tab_Menu_Navigation.pcMenuNavigation("New Submission");
				PolicyCenter_Resuables.newSubmissions_Verify();
				CA_Reusables.newSubmission_SelectLOB_CommercialAuto();// select
				// LOB

				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				PolicyCenter_Resuables.offering();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Qualification.qualification();
				PolicyCenter_Resuables.clickButton("Next");
				CA_PolicyInfo.dateQuoteNeeded();
				CA_PolicyInfo.primaryNamedInsured();
				CA_PolicyInfo.policyAddress();
				CA_PolicyInfo.OfficialID();
				CA_PolicyInfo.OrganizationType();
				CA_PolicyInfo.policyDetails();
				PolicyCenter_Resuables.clickButton("Next");
				CA_CommercialAutoLine.coverages_Product();
				CA_CommercialAutoLine.coverages_Fleet();
				CA_CommercialAutoLine.coverages_SeasonalTrailerLiability();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Locations.Location();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Vehicles.VehicleInformation();
				PolicyCenter_Resuables.clickButton("Next");
				CA_StateInfo.Stateinfo();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Drivers.Driver();
				CA_Drivers.DriverDetails();
				PolicyCenter_Resuables.clickButton("Next");
				CA_CoveredVehicles.CoveredVehicles();
				PolicyCenter_Resuables.clickButton("Next");
				Thread.sleep(2000);
				CA_Modifiers.Modifiers();
				PolicyCenter_Resuables.clickButton("Next");
				Thread.sleep(2000);
				CA_RiskAnalysis.button_Verify();
				PolicyCenter_Resuables.clickButton("Next");
				CA_PolicyReview.PolicyReview();
				CA_PolicyReview.PolicyDetails();
				PolicyCenter_Resuables.clickButton("Quote");
				CA_Reusables.CaValidationError();
				CA_Reusables.submissionMenuNavigation("Commercial Auto Line");
				CA_Reusables.CaValidationError();
				PolicyCenter_Resuables.clickButton("Quote");
				Thread.sleep(2000);
				CA_Quote.quoteDetails();

				PolicyCenter_Resuables.clickButton("Save Draft");

				strJob = PolicyCenter_Resuables.infoBar("Job");
				strLOB = PolicyCenter_Resuables.infoBar("LOB");
				strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

				break;

			case "Quote" :

				Tab_Menu_Navigation.pcMenuNavigation("New Submission");
				PolicyCenter_Resuables.newSubmissions_Verify();
				CA_Reusables.newSubmission_SelectLOB_CommercialAuto();// select
				// LOB

				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				PolicyCenter_Resuables.offering();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Qualification.qualification();
				PolicyCenter_Resuables.clickButton("Next");
				CA_PolicyInfo.dateQuoteNeeded();
				CA_PolicyInfo.primaryNamedInsured();
				CA_PolicyInfo.policyAddress();
				CA_PolicyInfo.OfficialID();
				CA_PolicyInfo.OrganizationType();
				CA_PolicyInfo.policyDetails();
				PolicyCenter_Resuables.clickButton("Next");
				CA_CommercialAutoLine.coverages_Product();
				CA_CommercialAutoLine.coverages_Fleet();
				CA_CommercialAutoLine.coverages_SeasonalTrailerLiability();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Locations.Location();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Vehicles.VehicleInformation();
				PolicyCenter_Resuables.clickButton("Next");
				CA_StateInfo.Stateinfo();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Drivers.Driver();
				CA_Drivers.DriverDetails();
				PolicyCenter_Resuables.clickButton("Next");
				CA_CoveredVehicles.CoveredVehicles();
				PolicyCenter_Resuables.clickButton("Next");
				Thread.sleep(2000);
				CA_Modifiers.Modifiers();
				PolicyCenter_Resuables.clickButton("Next");
				Thread.sleep(2000);
				CA_RiskAnalysis.button_Verify();
				PolicyCenter_Resuables.clickButton("Next");
				CA_PolicyReview.PolicyReview();
				CA_PolicyReview.PolicyDetails();
				PolicyCenter_Resuables.clickButton("Quote");
				CA_Reusables.CaValidationError();
				CA_Reusables.submissionMenuNavigation("Commercial Auto Line");
				CA_Reusables.CaValidationError();
				PolicyCenter_Resuables.clickButton("Quote");
				Thread.sleep(2000);
				CA_Quote.quoteDetails();
				break;

			case "Bind Only" :

				Tab_Menu_Navigation.pcMenuNavigation("New Submission");
				PolicyCenter_Resuables.newSubmissions_Verify();
				CA_Reusables.newSubmission_SelectLOB_CommercialAuto();// select
				// LOB

				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				PolicyCenter_Resuables.offering();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Qualification.qualification();
				PolicyCenter_Resuables.clickButton("Next");
				CA_PolicyInfo.dateQuoteNeeded();
				CA_PolicyInfo.primaryNamedInsured();
				CA_PolicyInfo.policyAddress();
				CA_PolicyInfo.OfficialID();
				CA_PolicyInfo.OrganizationType();
				CA_PolicyInfo.policyDetails();
				PolicyCenter_Resuables.clickButton("Next");
				CA_CommercialAutoLine.coverages_Product();
				CA_CommercialAutoLine.coverages_Fleet();
				CA_CommercialAutoLine.coverages_SeasonalTrailerLiability();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Locations.Location();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Vehicles.VehicleInformation();
				PolicyCenter_Resuables.clickButton("Next");
				CA_StateInfo.Stateinfo();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Drivers.Driver();
				CA_Drivers.DriverDetails();
				PolicyCenter_Resuables.clickButton("Next");
				CA_CoveredVehicles.CoveredVehicles();
				PolicyCenter_Resuables.clickButton("Next");
				Thread.sleep(2000);
				CA_Modifiers.Modifiers();
				PolicyCenter_Resuables.clickButton("Next");
				Thread.sleep(2000);
				CA_RiskAnalysis.button_Verify();
				PolicyCenter_Resuables.clickButton("Next");
				CA_PolicyReview.PolicyReview();
				CA_PolicyReview.PolicyDetails();
				PolicyCenter_Resuables.clickButton("Quote");
				CA_Reusables.CaValidationError();
				CA_Reusables.submissionMenuNavigation("Commercial Auto Line");
				CA_Reusables.CaValidationError();
				PolicyCenter_Resuables.clickButton("Quote");
				Thread.sleep(2000);
				CA_Quote.quoteDetails();

				PolicyCenter_Resuables.clickButton("Bind Options");
				PolicyCenter_Resuables.clickButton("Bind Only");
				strJob = PolicyCenter_Resuables.infoBar("Job");
				strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

				PC_Bound.ViewYourPolicy();
				PC_PolicySummary.detail_Verify();
				PC_PolicySummary.account_Verify();
				break;

			case "Issue Policy" :

				Tab_Menu_Navigation.pcMenuNavigation("New Submission");
				PolicyCenter_Resuables.newSubmissions_Verify();
				CA_Reusables.newSubmission_SelectLOB_CommercialAuto();// select
				// LOB

				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				PolicyCenter_Resuables.offering();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Qualification.qualification();
				PolicyCenter_Resuables.clickButton("Next");
				CA_PolicyInfo.dateQuoteNeeded();
				CA_PolicyInfo.primaryNamedInsured();
				CA_PolicyInfo.policyAddress();
				CA_PolicyInfo.OfficialID();
				CA_PolicyInfo.OrganizationType();
				CA_PolicyInfo.policyDetails();
				PolicyCenter_Resuables.clickButton("Next");
				CA_CommercialAutoLine.coverages_Product();
				CA_CommercialAutoLine.coverages_Fleet();
				CA_CommercialAutoLine.coverages_SeasonalTrailerLiability();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Locations.Location();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Vehicles.VehicleInformation();
				PolicyCenter_Resuables.clickButton("Next");
				CA_StateInfo.Stateinfo();
				PolicyCenter_Resuables.clickButton("Next");
				CA_Drivers.Driver();
				CA_Drivers.DriverDetails();
				PolicyCenter_Resuables.clickButton("Next");
				CA_CoveredVehicles.CoveredVehicles();
				PolicyCenter_Resuables.clickButton("Next");
				Thread.sleep(2000);
				CA_Modifiers.Modifiers();
				PolicyCenter_Resuables.clickButton("Next");
				Thread.sleep(2000);
				CA_RiskAnalysis.button_Verify();
				PolicyCenter_Resuables.clickButton("Next");
				CA_PolicyReview.PolicyReview();
				CA_PolicyReview.PolicyDetails();
				PolicyCenter_Resuables.clickButton("Quote");
				CA_Reusables.CaValidationError();
				CA_Reusables.submissionMenuNavigation("Commercial Auto Line");
				CA_Reusables.CaValidationError();
				PolicyCenter_Resuables.clickButton("Quote");
				Thread.sleep(3000);
				CA_Quote.quoteDetails();
				PolicyCenter_Resuables.clickButton("Bind Options");
				PolicyCenter_Resuables.clickButton("Issue Policy");
				strJob = PolicyCenter_Resuables.infoBar("Job");
				strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
				PC_Bound.ViewYourPolicy();
				PC_PolicySummary.detail_Verify();
				PC_PolicySummary.account_Verify();

				break;

			case "Rewrite" :

				break;

			default :
				throw new IOException("No support for Job : " + Job);
		}

	}

	public static void CaValidationError() throws Throwable {
		try {
			getStaleElement("Validation Error Header", ValidationErrorHeader);
			GuidewireAutomate_Validation("Validation Error Header", ValidationErrorHeader, "equals", "Validation Results");
			GuidewireAutomate("Clear Button", ClearButton, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static void InfoBarPolicyLink() throws Throwable {
		try {

			GuidewireAutomate("Policy Number Link", Infobar_PolicyNumberLink, "clickAndwait", "clickAndwait");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}
}
