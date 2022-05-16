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
	private static By LOB_CommercialAuto = By.xpath("//div[contains(@id,'ProductOffersDV-ProductSelectionLV-1-addSubmission')]");

	/*
	 * Menu
	 */
	private static By SW_Offering              = By.xpath("//div[@id='SubmissionWizard-Offering']/div[@role='menuitem']");
	private static By SW_PreQualification      = By.xpath("//div[@id='SubmissionWizard-PreQualification']/div[@role='menuitem']");
	private static By SW_CA_PolicyContract     = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup']/div[@role='menuitem']");
	private static By SW_CA_PolicyInfo         = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PolicyInfo']/div[@role='menuitem']");
	private static By SW_CA_CommercialAutoLine = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-baLineStep']/div[@role='menuitem']");
	private static By SW_CA_Locations          = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-Locations']/div[@role='menuitem']");
	private static By SW_CA_Vehicles           = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-BusinessVehicles']/div[@role='menuitem']");
	private static By SW_CA_StateInfo          = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-StateInfo']/div[@role='menuitem']");
	private static By SW_CA_Drivers            = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-BADrivers']/div[@role='menuitem']");
	private static By SW_CA_CoveredVehicles    = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-CoveredAutoSymbols']/div[@role='menuitem']");
	private static By SW_CA_Modifiers          = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-Modifiers']/div[@role='menuitem']");
	private static By SW_CA_RiskAnalysis       = By.xpath("//div[@id='SubmissionWizard-RiskAnalysis']/div[@role='menuitem']");
	private static By SW_CA_PolicyReview       = By.xpath("//div[@id='SubmissionWizard-PolicyReview']/div[@role='menuitem']");
	private static By SW_CA_Quote              = By.xpath("//div[@id='SubmissionWizard-ViewQuote']/div[@role='menuitem']");
	private static By SW_CA_Forms              = By.xpath("//div[@id='SubmissionWizard-Forms']/div[@role='menuitem']");
	private static By SW_CA_Payment            = By.xpath("//div[@id='SubmissionWizard-BillingInfo']/div[@role='menuitem']");

	// Validation Error
	private static By ValidationErrorHeader = By.xpath("//div[contains(@id,'wsTabBar-wsTab')]//div[@role='menuitem']");
	private static By ClearButton           = By.xpath("//div[contains(@id,'ClearButton')]//div[@role='button']");

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
				case "Offering" :
					GuidewireAutomate("Offering", SW_Offering, "clickAndwait", "click");
					break;
				case "Qualification" :
					GuidewireAutomate("Qualification", SW_PreQualification, "clickAndwait", "click");
					break;
				case "Policy Info" :
					GuidewireAutomate("Policy Info", SW_CA_PolicyInfo, "clickAndwait", "click");
					break;
				case "Commercial Auto Line" :
					GuidewireAutomate("Policy Info", SW_CA_CommercialAutoLine, "clickAndwait", "click");
					break;
				case "Locations" :
					GuidewireAutomate("Policy Info", SW_CA_Locations, "clickAndwait", "click");
					break;
				case "Vehicles" :
					GuidewireAutomate("Vehicles", SW_CA_Vehicles, "clickAndwait", "click");
					break;
				case "State Info" :
					GuidewireAutomate("PACoverages", SW_CA_StateInfo, "clickAndwait", "click");
					break;
				case "Drivers" :
					GuidewireAutomate("Drivers", SW_CA_Drivers, "clickAndwait", "click");
					break;
				case "Covered Vehicles" :
					GuidewireAutomate("PACoverages", SW_CA_CoveredVehicles, "clickAndwait", "click");
					break;
				case "Modifiers" :
					GuidewireAutomate("PACoverages", SW_CA_Modifiers, "clickAndwait", "click");
					break;
				case "Risk Analysis" :
					GuidewireAutomate("PACoverages", SW_CA_RiskAnalysis, "clickAndwait", "click");
					break;
				case "Policy Review" :
					GuidewireAutomate("PACoverages", SW_CA_PolicyReview, "clickAndwait", "click");
					break;
				case "Quote" :
					GuidewireAutomate("PACoverages", SW_CA_Quote, "clickAndwait", "click");
					break;
				case "Forms" :
					GuidewireAutomate("PACoverages", SW_CA_Forms, "clickAndwait", "click");
					break;
				case "Payment" :
					getStaleElement("Payment", SW_CA_Payment);
					getStaleElement("Payment", SW_CA_Payment);
					GuidewireAutomate("Payment", SW_CA_Payment, "clickAndwait", "click");
					break;
				default :
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

				Tab_Menu_Navigation.pcMenuNavigation("New Submission Desktop");
				PolicyCenter_Resuables.newSubmissions_Verify();
				CA_Reusables.newSubmission_SelectLOB_CommercialAuto();// select
				// LOB

				strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		/*PolicyCenter_Resuables.offering();
		PolicyCenter_Resuables.clickButton("Next");*/
				CA_Qualification.qualification();
				PolicyCenter_Resuables.clickButton("Save Next");
				CA_PolicyInfo.dateQuoteNeeded();
				CA_PolicyInfo.primaryNamedInsured();
				CA_PolicyInfo.policyAddress();
				CA_PolicyInfo.OfficialID();
				CA_PolicyInfo.BusinessAndOperations();
				CA_PolicyInfo.OrganizationType();
				CA_PolicyInfo.policyDetails();
				PolicyCenter_Resuables.clickButton("Save Next");
				//CA_CommercialAutoLine.coverages_Product();
				CA_CommercialAutoLine.coverages_Fleet();
				//CA_CommercialAutoLine.coverages_SeasonalTrailerLiability();
				PolicyCenter_Resuables.clickButton("Save Next");
				CA_Locations.Location();
				PolicyCenter_Resuables.clickButton("Save Next");
				CA_Vehicles.AddVehicleDetails();
				PolicyCenter_Resuables.clickButton("Save Next");
				CA_StateInfo.Stateinfo();
				PolicyCenter_Resuables.clickButton("Save Next");
				CA_Drivers.Driver();
				CA_Drivers.DriverDetails();
				PolicyCenter_Resuables.clickButton("Save Next");
				CA_CoveredVehicles.CoveredVehicles();
				PolicyCenter_Resuables.clickButton("Save Next");
				CA_Modifiers.Modifiers();
				PolicyCenter_Resuables.clickButton("Save Next");
				CA_Supplimentary.CA_Supplimentary_GQ();
				PolicyCenter_Resuables.clickButton("Save Next");
				CA_RiskAnalysis.button_Verify();
				PolicyCenter_Resuables.clickButton("Save Next");
				CA_PolicyReview.PolicyReview();
				//CA_PolicyReview.PolicyDetails();
				PolicyCenter_Resuables.clickButton("Quote");
				Thread.sleep(3000);
				CA_Quote.quoteDetails();
				PolicyCenter_Resuables.clickButton("Save Next");
				CA_Forms.ValidateForms();
				PolicyCenter_Resuables.clickButton("Save Next");
				CA_Payment.premiumSummary();
				CA_Payment.payments();
				CA_Payment.invoicing();
				CA_Payment.billing();
				CA_Payment.paymentSchedule();
				PolicyCenter_Resuables.clickButton("Bind Options");
				PolicyCenter_Resuables.clickButton("Issue Policy");
				CA_IssuesTheBlockIssuance.Issuance();
				CA_Reusables.submissionMenuNavigation("Payment");
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
			GuidewireAutomate_Validation("Validation Error Header", ValidationErrorHeader, "equals", "Validation Results");
			GuidewireAutomate("Clear Button", ClearButton, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
