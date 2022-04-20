package com.pages.Guidewire.PolicyCenter.PersonalAuto;

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
public class PA_Reusable extends SeleniumWebDriver_Commands {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PA_Reusable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By LOB_PersonalAuto = By.xpath("//div[text()='Personal Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");

	private static By SW_Offering          = By.xpath("//div[@id='SubmissionWizard-Offering']/div[@role='menuitem']");
	private static By SW_PreQualification  = By.xpath("//div[@id='SubmissionWizard-PreQualification']/div[@role='menuitem']");
	private static By SW_PA_PolicyContract = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup']/div[@role='menuitem']");
	private static By SW_PA_PolicyInfo     = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PolicyInfo']/div[@role='menuitem']");
	private static By SW_PA_Drivers        = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PADrivers']/div[@role='menuitem']");
	private static By SW_PA_Vehicles       = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PersonalVehicles']/div[@role='menuitem']");
	private static By SW_PA_PACoverages    = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PALine']/div[@role='menuitem']");
	private static By SW_RiskAnalysis      = By.xpath("//div[@id='SubmissionWizard-RiskAnalysis']/div[@role='menuitem']");
	private static By SW_PolicyReview      = By.xpath("//div[@id='SubmissionWizard-PolicyReview']/div[@role='menuitem']");
	private static By SW_Quote             = By.xpath("//div[@id='SubmissionWizard-ViewQuote']/div[@role='menuitem']");
	private static By SW_Forms             = By.xpath("//div[@id='SubmissionWizard-Forms']/div[@role='menuitem']");
	private static By SW_Payment           = By.xpath("//div[@id='SubmissionWizard-BillingInfo']/div[@role='menuitem']");

	/*
	 * 
	 */

	/*
	 * 
	 */

	public static LinkedHashMap<String, String> getData_PersonalAuto(String strTable) throws Throwable {

		return Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_Fillo(pTestDataFile_ClaimsCenter, strTable, strTestCaseName);

	}

	public static LinkedHashMap<String, String> getData_Row_PersonalAuto(String strTable, int SecondKey) throws Throwable {

		return Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_DataSet_Fillo(pTestDataFile_ClaimsCenter, strTable, strTestCaseName, SecondKey);

	}

	public static void UpdateData_PersonalAuto(String strTable, String strColumn, String strValue) throws Throwable {

		Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Column_Fillo(pTestDataFile_ClaimsCenter, strTable, strColumn, strValue);

	}

	public static void newSubmission_SelectLOB_PersonalAuto() throws Throwable {
		GuidewireAutomate("LOB PersonalAuto", LOB_PersonalAuto, "clickAndwait", "click");
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

		switch (Job) {
			case "Save Draft" :

				Tab_Menu_Navigation.pcMenuNavigation("New Submission");
				PolicyCenter_Resuables.newSubmissions_Verify();
				PA_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																				// LOB
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				PolicyCenter_Resuables.offering();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Qualification.qualification();

				PolicyCenter_Resuables.clickButton("Next");
				PA_PolicyInfo.dateQuoteNeeded();
				PA_PolicyInfo.primaryNamedInsured();
				PA_PolicyInfo.pi_OfficialID();
				PA_PolicyInfo.policyDetails();
				PA_PolicyInfo.affinityGroup();
				PA_PolicyInfo.producerOfRecord();
				PA_PolicyInfo.underWritingCompany();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Drivers.driver_Add_ExistingDriver();
				PA_Drivers.driver_ContatDetails("VERIFY");
				PA_Drivers.driver_Roles("EDIT"); //

				PolicyCenter_Resuables.clickButton("Next");
				PA_Vehicles.createVehicles();
				PA_Vehicles.assignDriver();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Coverages.coveragesAppliedtoallVehiclesIn();
				PA_Coverages.coveragesAppliedperVehiclesIn();

				PolicyCenter_Resuables.clickButton("Next");
				PA_RiskAnalysis.button_Verify();

				PolicyCenter_Resuables.clickButton("Next");
				PA_PolicyReview.policyDetails();
				PA_PolicyReview.policyLevelCoverages();
				PA_PolicyReview.vehicleLevelCoverages();

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
				PA_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																				// LOB

				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				PolicyCenter_Resuables.offering();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Qualification.qualification();

				PolicyCenter_Resuables.clickButton("Next");
				PA_PolicyInfo.dateQuoteNeeded();
				PA_PolicyInfo.primaryNamedInsured();
				PA_PolicyInfo.pi_OfficialID();
				PA_PolicyInfo.policyDetails();
				PA_PolicyInfo.affinityGroup();
				PA_PolicyInfo.producerOfRecord();
				PA_PolicyInfo.underWritingCompany();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Drivers.driver_Add_ExistingDriver();
				PA_Drivers.driver_ContatDetails("VERIFY");
				PA_Drivers.driver_Roles("EDIT"); //

				PolicyCenter_Resuables.clickButton("Next");
				PA_Vehicles.createVehicles();
				PA_Vehicles.assignDriver();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Coverages.coveragesAppliedtoallVehiclesIn();
				PA_Coverages.coveragesAppliedperVehiclesIn();

				PolicyCenter_Resuables.clickButton("Next");
				PA_RiskAnalysis.button_Verify();

				PolicyCenter_Resuables.clickButton("Next");
				PA_PolicyReview.policyDetails();
				PA_PolicyReview.policyLevelCoverages();
				PA_PolicyReview.vehicleLevelCoverages();

				PolicyCenter_Resuables.clickButton("Save Draft");
				PolicyCenter_Resuables.clickButton("Quote");
				PA_Quote.quoteDetails();
				PA_Quote.policyPremium_Garage1();
				PA_Quote.policyPremium_Vehicle1();
				PA_Quote.policyPremium_PremiumSubtotalandTaxes();

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
				PA_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																				// LOB
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				PolicyCenter_Resuables.offering();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Qualification.qualification();

				PolicyCenter_Resuables.clickButton("Next");
				PA_PolicyInfo.dateQuoteNeeded();
				PA_PolicyInfo.primaryNamedInsured();
				PA_PolicyInfo.pi_OfficialID();
				PA_PolicyInfo.policyDetails();
				PA_PolicyInfo.affinityGroup();
				PA_PolicyInfo.producerOfRecord();
				PA_PolicyInfo.underWritingCompany();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Drivers.driver_Add_ExistingDriver();
				PA_Drivers.driver_ContatDetails("VERIFY");
				PA_Drivers.driver_Roles("EDIT"); //

				PolicyCenter_Resuables.clickButton("Next");
				PA_Vehicles.createVehicles();
				PA_Vehicles.assignDriver();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Coverages.coveragesAppliedtoallVehiclesIn();
				PA_Coverages.coveragesAppliedperVehiclesIn();

				PolicyCenter_Resuables.clickButton("Next");
				PA_RiskAnalysis.button_Verify();

				PolicyCenter_Resuables.clickButton("Next");
				PA_PolicyReview.policyDetails();
				PA_PolicyReview.policyLevelCoverages();
				PA_PolicyReview.vehicleLevelCoverages();

				PolicyCenter_Resuables.clickButton("Save Draft");
				PolicyCenter_Resuables.clickButton("Quote");
				PA_Quote.quoteDetails();
				PA_Quote.policyPremium_Garage1();
				PA_Quote.policyPremium_Vehicle1();
				PA_Quote.policyPremium_PremiumSubtotalandTaxes();

				strJob = PolicyCenter_Resuables.infoBar("Job");
				strLOB = PolicyCenter_Resuables.infoBar("LOB");
				strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

				PolicyCenter_Resuables.clickButton("Next");
				PA_Forms.pa_forms();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Payments.premiumSummary();
				PA_Payments.payments();
				PA_Payments.invoicing();
				PA_Payments.billing();
				PA_Payments.paymentSchedule();
				PA_Payments.upFrontPayment();

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
				PA_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																				// LOB
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				PolicyCenter_Resuables.offering();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Qualification.qualification();

				PolicyCenter_Resuables.clickButton("Next");
				PA_PolicyInfo.dateQuoteNeeded();
				PA_PolicyInfo.primaryNamedInsured();
				PA_PolicyInfo.pi_OfficialID();
				PA_PolicyInfo.policyDetails();
				PA_PolicyInfo.affinityGroup();
				PA_PolicyInfo.producerOfRecord();
				PA_PolicyInfo.underWritingCompany();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Drivers.driver_Add_ExistingDriver();
				PA_Drivers.driver_ContatDetails("VERIFY");
				PA_Drivers.driver_Roles("EDIT"); //

				PolicyCenter_Resuables.clickButton("Next");
				PA_Vehicles.createVehicles();
				PA_Vehicles.assignDriver();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Coverages.coveragesAppliedtoallVehiclesIn();
				PA_Coverages.coveragesAppliedperVehiclesIn();

				PolicyCenter_Resuables.clickButton("Next");
				PA_RiskAnalysis.button_Verify();

				PolicyCenter_Resuables.clickButton("Next");
				PA_PolicyReview.policyDetails();
				PA_PolicyReview.policyLevelCoverages();
				PA_PolicyReview.vehicleLevelCoverages();

				PolicyCenter_Resuables.clickButton("Save Draft");
				PolicyCenter_Resuables.clickButton("Quote");
				PA_Quote.quoteDetails();
				PA_Quote.policyPremium_Garage1();
				PA_Quote.policyPremium_Vehicle1();
				PA_Quote.policyPremium_PremiumSubtotalandTaxes();

				strJob = PolicyCenter_Resuables.infoBar("Job");
				strLOB = PolicyCenter_Resuables.infoBar("LOB");
				strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

				PolicyCenter_Resuables.clickButton("Next");
				PA_Forms.pa_forms();

				PolicyCenter_Resuables.clickButton("Next");
				PA_Payments.premiumSummary();
				PA_Payments.payments();
				PA_Payments.invoicing();
				PA_Payments.billing();
				PA_Payments.paymentSchedule();
				PA_Payments.upFrontPayment();
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

	public static void cancellationProcess() throws Throwable {
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		// PolicyCenter_Resuables.pcTabNavigation_Policy_Search();
		PC_PolicySummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("Cancel Policy");
		PolicyCenter_Resuables.startCancellationForPolicy();
		PolicyCenter_Resuables.Confirmation();
		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Cancel Now");
		PC_Bound.Cancellation_ViewYourPolicy();
		PC_PolicySummary.detail_Verify();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("Status");

	}

}
