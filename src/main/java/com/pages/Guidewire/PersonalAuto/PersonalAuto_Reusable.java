package com.pages.Guidewire.PersonalAuto;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Account;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Bound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
public class PersonalAuto_Reusable extends SeleniumWebDriver_Commands implements PersonalAuto_Reusable_PO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Reusable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void newSubmission_SelectLOB_PersonalAuto() throws Throwable {
		GuidewireAutomate("LOB PersonalAuto", LOB_PersonalAuto, "clickAndwait", "click");
	}

	public static void newSubmission_SelectLOB_GeneralLiability() throws Throwable {
		GuidewireAutomate("LOB GeneralLiability", LOB_GeneralLiability, "clickAndwait", "click");
	}
	
	public static void paMenuNavigation(String Menu) throws Throwable {
		switch (Menu) {
			case "Offering" :
				GuidewireAutomate("Offering", SW_Offering, "clickAndwait", "click");
				break;
			case "Qualification" :
				GuidewireAutomate("Qualification", SW_PreQualification, "clickAndwait", "click");
				break;
			case "Policy Info" :
				GuidewireAutomate("Policy Info", SW_PA_PolicyInfo, "clickAndwait", "click");
				break;
			case "Drivers" :
				GuidewireAutomate("Drivers", SW_PA_Drivers, "clickAndwait", "click");
				break;
			case "Vehicles" :
				GuidewireAutomate("Vehicles", SW_PA_Vehicles, "clickAndwait", "click");
				break;
			case "PACoverages" :
				GuidewireAutomate("PACoverages", SW_PA_PACoverages, "clickAndwait", "click");
				break;
			default :
				throw new IOException("No support for Menu : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to Personal Auto Menu = " + Menu + " is Succesful");
	}

	public String getRandomVIN(String vingenerator) throws Throwable {
		String StrVIN = "sadasd";

		switch (vingenerator) {
			case "vingenerator" :
				url = "https://vingenerator.org/";
				break;
			case "randomvin" :
				url = "https://randomvin.com/";
				break;

			default :
				driver_ThirdPartyTool = getDriver();
				driver_ThirdPartyTool.navigate().to("https://vingenerator.org/");
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

		return StrVIN;
	}

	public static void submissionProcess(String Account, String Job) throws Throwable {

		String strEditLock;

		switch (Account) {
			case "New Account" :
				Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
				PolicyCenter_Account.createPersonAccount();
				PolicyCenter_AccountSummary.detail_Verify();

				break;
			case "Account Search" :
				PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
				PolicyCenter_AccountSummary.detail_Verify();

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
				PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																				// LOB
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				PolicyCenter_Resuables.offering();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Qualification.qualification();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_PolicyInfo.dateQuoteNeeded();
				PersonalAuto_PolicyInfo.primaryNamedInsured();
				PersonalAuto_PolicyInfo.pi_OfficialID();
				PersonalAuto_PolicyInfo.policyDetails();
				PersonalAuto_PolicyInfo.affinityGroup();
				PersonalAuto_PolicyInfo.producerOfRecord();
				PersonalAuto_PolicyInfo.underWritingCompany();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Drivers.driver_Add_ExistingDriver();
				PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
				PersonalAuto_Drivers.driver_Roles("EDIT"); //

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Vehicles.createVehicles();
				PersonalAuto_Vehicles.assignDriver();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
				PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_RiskAnalysis.button_Verify();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_PolicyReview.policyDetails();
				PersonalAuto_PolicyReview.policyLevelCoverages();
				PersonalAuto_PolicyReview.vehicleLevelCoverages();

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
				PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																				// LOB

				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				PolicyCenter_Resuables.offering();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Qualification.qualification();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_PolicyInfo.dateQuoteNeeded();
				PersonalAuto_PolicyInfo.primaryNamedInsured();
				PersonalAuto_PolicyInfo.pi_OfficialID();
				PersonalAuto_PolicyInfo.policyDetails();
				PersonalAuto_PolicyInfo.affinityGroup();
				PersonalAuto_PolicyInfo.producerOfRecord();
				PersonalAuto_PolicyInfo.underWritingCompany();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Drivers.driver_Add_ExistingDriver();
				PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
				PersonalAuto_Drivers.driver_Roles("EDIT"); //

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Vehicles.createVehicles();
				PersonalAuto_Vehicles.assignDriver();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
				PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_RiskAnalysis.button_Verify();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_PolicyReview.policyDetails();
				PersonalAuto_PolicyReview.policyLevelCoverages();
				PersonalAuto_PolicyReview.vehicleLevelCoverages();

				PolicyCenter_Resuables.clickButton("Save Draft");
				PolicyCenter_Resuables.clickButton("Quote");
				PersonalAuto_Quote.quoteDetails();
				PersonalAuto_Quote.policyPremium_Garage1();
				PersonalAuto_Quote.policyPremium_Vehicle1();
				PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();

				strJob = PolicyCenter_Resuables.infoBar("Job");
				strLOB = PolicyCenter_Resuables.infoBar("LOB");
				strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
				strEditLock = PolicyCenter_Resuables.infoBar("EditLock");
				break;

			case "Bind Only" :

				Tab_Menu_Navigation.pcMenuNavigation("New Submission");
				PolicyCenter_Resuables.newSubmissions_Verify();
				PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																				// LOB
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				PolicyCenter_Resuables.offering();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Qualification.qualification();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_PolicyInfo.dateQuoteNeeded();
				PersonalAuto_PolicyInfo.primaryNamedInsured();
				PersonalAuto_PolicyInfo.pi_OfficialID();
				PersonalAuto_PolicyInfo.policyDetails();
				PersonalAuto_PolicyInfo.affinityGroup();
				PersonalAuto_PolicyInfo.producerOfRecord();
				PersonalAuto_PolicyInfo.underWritingCompany();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Drivers.driver_Add_ExistingDriver();
				PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
				PersonalAuto_Drivers.driver_Roles("EDIT"); //

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Vehicles.createVehicles();
				PersonalAuto_Vehicles.assignDriver();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
				PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_RiskAnalysis.button_Verify();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_PolicyReview.policyDetails();
				PersonalAuto_PolicyReview.policyLevelCoverages();
				PersonalAuto_PolicyReview.vehicleLevelCoverages();

				PolicyCenter_Resuables.clickButton("Save Draft");
				PolicyCenter_Resuables.clickButton("Quote");
				PersonalAuto_Quote.quoteDetails();
				PersonalAuto_Quote.policyPremium_Garage1();
				PersonalAuto_Quote.policyPremium_Vehicle1();
				PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();

				strJob = PolicyCenter_Resuables.infoBar("Job");
				strLOB = PolicyCenter_Resuables.infoBar("LOB");
				strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Forms.pa_forms();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Payments.premiumSummary();
				PersonalAuto_Payments.payments();
				PersonalAuto_Payments.invoicing();
				PersonalAuto_Payments.billing();
				PersonalAuto_Payments.paymentSchedule();
				PersonalAuto_Payments.upFrontPayment();

				PolicyCenter_Resuables.clickButton("Bind Options");
				PolicyCenter_Resuables.clickButton("Bind Only");
				strJob = PolicyCenter_Resuables.infoBar("Job");
				strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

				PolicyCenter_Bound.ViewYourPolicy();
				PolicyCenter_PolicySummary.detail_Verify();
				PolicyCenter_PolicySummary.account_Verify();

				break;

			case "Issue Policy" :

				Tab_Menu_Navigation.pcMenuNavigation("New Submission");
				PolicyCenter_Resuables.newSubmissions_Verify();
				PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																				// LOB
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				PolicyCenter_Resuables.offering();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Qualification.qualification();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_PolicyInfo.dateQuoteNeeded();
				PersonalAuto_PolicyInfo.primaryNamedInsured();
				PersonalAuto_PolicyInfo.pi_OfficialID();
				PersonalAuto_PolicyInfo.policyDetails();
				PersonalAuto_PolicyInfo.affinityGroup();
				PersonalAuto_PolicyInfo.producerOfRecord();
				PersonalAuto_PolicyInfo.underWritingCompany();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Drivers.driver_Add_ExistingDriver();
				PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
				PersonalAuto_Drivers.driver_Roles("EDIT"); //

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Vehicles.createVehicles();
				PersonalAuto_Vehicles.assignDriver();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
				PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_RiskAnalysis.button_Verify();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_PolicyReview.policyDetails();
				PersonalAuto_PolicyReview.policyLevelCoverages();
				PersonalAuto_PolicyReview.vehicleLevelCoverages();

				PolicyCenter_Resuables.clickButton("Save Draft");
				PolicyCenter_Resuables.clickButton("Quote");
				PersonalAuto_Quote.quoteDetails();
				PersonalAuto_Quote.policyPremium_Garage1();
				PersonalAuto_Quote.policyPremium_Vehicle1();
				PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();

				strJob = PolicyCenter_Resuables.infoBar("Job");
				strLOB = PolicyCenter_Resuables.infoBar("LOB");
				strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Forms.pa_forms();

				PolicyCenter_Resuables.clickButton("Next");
				PersonalAuto_Payments.premiumSummary();
				PersonalAuto_Payments.payments();
				PersonalAuto_Payments.invoicing();
				PersonalAuto_Payments.billing();
				PersonalAuto_Payments.paymentSchedule();
				PersonalAuto_Payments.upFrontPayment();
				PolicyCenter_Resuables.clickButton("Bind Options");
				PolicyCenter_Resuables.clickButton("Issue Policy");
				strJob = PolicyCenter_Resuables.infoBar("Job");
				strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

				PolicyCenter_Bound.ViewYourPolicy();
				PolicyCenter_PolicySummary.detail_Verify();
				PolicyCenter_PolicySummary.account_Verify();

				break;

			case "Rewrite" :

				break;

			default :
				throw new IOException("No support for Job : " + Job);
		}

	}

	public static void cancellationProcess() throws Throwable {
		PersonalAuto_Reusable.submissionProcess("New Account", "Issue Policy");
		// PolicyCenter_Resuables.pcTabNavigation_Policy_Search();
		PolicyCenter_PolicySummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("Cancel Policy");
		PolicyCenter_Resuables.startCancellationForPolicy();
		PolicyCenter_Resuables.Confirmation();
		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Cancel Now");
		PolicyCenter_Bound.Cancellation_ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("Status");

	}

}
