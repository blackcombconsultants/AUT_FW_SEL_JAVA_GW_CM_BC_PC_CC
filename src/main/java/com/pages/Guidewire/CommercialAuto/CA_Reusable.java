package com.pages.Guidewire.CommercialAuto;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Account;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Bound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class CA_Reusable extends SeleniumWebDriver_Commands {

	public CA_Reusable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	private static By LOB_CommercialAuto = By.xpath("//div[text()='Commercial Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");

	private static By SW_Offering = By.xpath("//div[@id='SubmissionWizard-Offering']/div[@role='menuitem']");
	private static By SW_PreQualification = By.xpath("//div[@id='SubmissionWizard-PreQualification']/div[@role='menuitem']");
	private static By SW_CA_PolicyContract = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup']/div[@role='menuitem']");
	private static By SW_CA_PolicyInfo = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PolicyInfo']/div[@role='menuitem']");
	private static By SW_CA_CommercialAutoLine = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-baLineStep']/div[@role='menuitem']");
	private static By SW_CA_Locations = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-Locations']/div[@role='menuitem']");
	private static By SW_CA_Vehicles = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-BusinessVehicles']/div[@role='menuitem']");
	private static By SW_CA_StateInfo = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-StateInfo']/div[@role='menuitem']");
	private static By SW_CA_Drivers = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-BADrivers']/div[@role='menuitem']");
	private static By SW_CA_CoveredVehicles = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-CoveredAutoSymbols']/div[@role='menuitem']");
	private static By SW_CA_Modifiers = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-Modifiers']/div[@role='menuitem']");
	private static By SW_CA_RiskAnalysis = By.xpath("//div[@id='SubmissionWizard-RiskAnalysis']/div[@role='menuitem']");
	private static By SW_CA_PolicyReview = By.xpath("//div[@id='SubmissionWizard-PolicyReview']/div[@role='menuitem']");
	private static By SW_CA_Quote = By.xpath("//div[@id='SubmissionWizard-ViewQuote']/div[@role='menuitem']");
	private static By SW_CA_Forms = By.xpath("//div[@id='SubmissionWizard-Forms']/div[@role='menuitem']");
	private static By SW_CA_Payment = By.xpath("//div[@id='SubmissionWizard-BillingInfo']/div[@role='menuitem']");

	//Validation Error
	private static By ValidationErrorHeader = By.xpath("//div[contains(@id,'wsTabBar-wsTab')]//div[@role='menuitem']");
	private static By ClearButton = By.xpath("//div[contains(@id,'ClearButton')]//div[@role='button']");


	public static void newSubmission_SelectLOB_CommercialAuto() throws Throwable {
		GuidewireAutomate("LOB CommerciallAuto", LOB_CommercialAuto, "clickAndwait", "click");
	}

	public static void caMenuNavigation(String Menu) throws Throwable {
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
					GuidewireAutomate("Policy Info", SW_CA_CommercialAutoLine, "clickAndwait", "click");
					break;
				case "Locations":
					GuidewireAutomate("Policy Info", SW_CA_Locations, "clickAndwait", "click");
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
	Name:shanta
	 */
	public static void CA_NewSubmission(String LOB) throws Throwable {
		try {

			switch (LOB) {
				case "CA_NewSubmission":
					Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
					PolicyCenter_Account.createPersonAccount();
					PolicyCenter_AccountSummary.detail_Verify();
					Tab_Menu_Navigation.pcMenuNavigation("New Submission");
					PolicyCenter_Resuables.newSubmissions_Verify();
					CA_Reusable.newSubmission_SelectLOB_CommercialAuto();// select
					// LOB

					strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
					strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
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
					CA_RiskAnalysis.RiskAnalysis();
					PolicyCenter_Resuables.clickButton("Next");
					CA_PolicyReview.PolicyReview();
					CA_PolicyReview.PolicyDetails();
					PolicyCenter_Resuables.clickButton("Quote");
					CA_Reusable.CaValidationError();
					CA_Reusable.caMenuNavigation("Commercial Auto Line");
					CA_Reusable.CaValidationError();
					PolicyCenter_Resuables.clickButton("Quote");
					Thread.sleep(2000);
					CA_Quote.quoteDetails();

					PolicyCenter_Resuables.clickButton("Bind Options");
					PolicyCenter_Resuables.clickButton("Issue Policy");
					strJob = PolicyCenter_Resuables.infoBar("Job");
					strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

					PolicyCenter_Bound.ViewYourPolicy();
					PolicyCenter_PolicySummary.detail_Verify();
					PolicyCenter_PolicySummary.account_Verify();
					break;
				default:
					throw new IOException("No support for Menu : " + LOB);
			}
			oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
			oExtentTest.log(Status.INFO, "Navigation to Commercial Auto Menu = " + LOB + " is Succesful");
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
			}


			public static void CaValidationError() throws Throwable {
		try {
			GuidewireAutomate_Validation("Validation Error Header", ValidationErrorHeader, "equals", "Validation Results");
			GuidewireAutomate("Clear Button", ClearButton, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;


		}

	}
}



