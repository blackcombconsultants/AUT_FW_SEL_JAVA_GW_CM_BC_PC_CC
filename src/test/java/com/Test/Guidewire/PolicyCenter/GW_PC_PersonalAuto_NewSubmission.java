package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_LoginCM_PC_BC_CC;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Drivers;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Forms;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_NewSubmission_Reusable;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Payments;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyInfo;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyReview;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Quote;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_RiskAnalysis;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Submission;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Vehicles;
import com.pages.Guidewire.PolicyCenter.GW_PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.GW_PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.GW_PolicyCenter_Resuables;

public class GW_PC_PersonalAuto_NewSubmission extends GW_GetDriver {

	/*
	 * Creating object reference for the New submission_Bind only
	 */
	GW_LoginCM_PC_BC_CC loginScreen = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
	GW_TabNavigation_CM_PC_BC_CC navigate = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);
	GW_PolicyCenter_Resuables policycenter = new GW_PolicyCenter_Resuables(driver, oExtentTest);
	GW_PC_AccountSummary accountSummary = new GW_PC_AccountSummary(driver, oExtentTest);

	/*
	 * Personal Auto
	 */
	PersonalAuto_NewSubmission_Reusable personalauto = new PersonalAuto_NewSubmission_Reusable(driver, oExtentTest);
	PersonalAuto_PolicyInfo policyinfo = new PersonalAuto_PolicyInfo(driver, oExtentTest);
	PersonalAuto_Drivers padriver = new PersonalAuto_Drivers(driver, oExtentTest);
	PersonalAuto_Vehicles pavehicle = new PersonalAuto_Vehicles(driver, oExtentTest);
	PersonalAuto_Coverages coverages = new PersonalAuto_Coverages(driver, oExtentTest);
	PersonalAuto_RiskAnalysis riskanalysis = new PersonalAuto_RiskAnalysis(driver, oExtentTest);
	PersonalAuto_PolicyReview policyreview = new PersonalAuto_PolicyReview(driver, oExtentTest);
	PersonalAuto_Quote quote = new PersonalAuto_Quote(driver, oExtentTest);
	PersonalAuto_Forms forms = new PersonalAuto_Forms(driver, oExtentTest);
	PersonalAuto_Payments payments = new PersonalAuto_Payments(driver, oExtentTest);
	PersonalAuto_Submission submissionbound = new PersonalAuto_Submission(driver, oExtentTest);

	/*
	 * Testcase = Full Quote Bind only Submission Author = Arun Date Created =
	 * 26/04/21 LOB = Personal Auto Parameter testData
	 * 
	 */

	@BeforeTest
	public void objReference() throws Throwable {

		/*
		 * Creating object reference for the New submission_Bind only
		 */
		GW_LoginCM_PC_BC_CC loginScreen = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC navigate = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables policycenter = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_PolicyCenter_Resuables accountSummary = new GW_PolicyCenter_Resuables(driver, oExtentTest);

		/*
		 * Personal Auto
		 */
		PersonalAuto_NewSubmission_Reusable personalauto = new PersonalAuto_NewSubmission_Reusable(driver, oExtentTest);
		PersonalAuto_PolicyInfo policyinfo = new PersonalAuto_PolicyInfo(driver, oExtentTest);
		PersonalAuto_Drivers padriver = new PersonalAuto_Drivers(driver, oExtentTest);
		PersonalAuto_Vehicles pavehicle = new PersonalAuto_Vehicles(driver, oExtentTest);
		PersonalAuto_Coverages coverages = new PersonalAuto_Coverages(driver, oExtentTest);
		PersonalAuto_RiskAnalysis riskanalysis = new PersonalAuto_RiskAnalysis(driver, oExtentTest);
		PersonalAuto_PolicyReview policyreview = new PersonalAuto_PolicyReview(driver, oExtentTest);
		PersonalAuto_Quote quote = new PersonalAuto_Quote(driver, oExtentTest);
		PersonalAuto_Forms forms = new PersonalAuto_Forms(driver, oExtentTest);
		PersonalAuto_Payments payments = new PersonalAuto_Payments(driver, oExtentTest);
		PersonalAuto_Submission submissionbound = new PersonalAuto_Submission(driver, oExtentTest);

	}

	@Test
	public void AUT_PA_PC_NS_1_BasicProgram() throws Throwable {

		/*
		 * Creating object reference for the New submission_Bind only
		 */
		GW_LoginCM_PC_BC_CC loginScreen = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC navigate = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables policycenter = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_PC_AccountSummary accountSummary = new GW_PC_AccountSummary(driver, oExtentTest);
		GW_PC_PolicySummary policySummary = new GW_PC_PolicySummary(driver, oExtentTest);
		/*
		 * Personal Auto
		 */
		PersonalAuto_NewSubmission_Reusable personalauto = new PersonalAuto_NewSubmission_Reusable(driver, oExtentTest);
		PersonalAuto_PolicyInfo policyinfo = new PersonalAuto_PolicyInfo(driver, oExtentTest);
		PersonalAuto_Drivers padriver = new PersonalAuto_Drivers(driver, oExtentTest);
		PersonalAuto_Vehicles pavehicle = new PersonalAuto_Vehicles(driver, oExtentTest);
		PersonalAuto_Coverages coverages = new PersonalAuto_Coverages(driver, oExtentTest);
		PersonalAuto_RiskAnalysis riskanalysis = new PersonalAuto_RiskAnalysis(driver, oExtentTest);
		PersonalAuto_PolicyReview policyreview = new PersonalAuto_PolicyReview(driver, oExtentTest);
		PersonalAuto_Quote quote = new PersonalAuto_Quote(driver, oExtentTest);
		PersonalAuto_Forms forms = new PersonalAuto_Forms(driver, oExtentTest);
		PersonalAuto_Payments payments = new PersonalAuto_Payments(driver, oExtentTest);
		PersonalAuto_Submission submissionbound = new PersonalAuto_Submission(driver, oExtentTest);

		/*
		 * call the modules/methods
		 */

		// Logging into Policy Center
		loginScreen.login_PolicyCenter();
		policycenter.gwPolicyCenter_TabNavigation_Sub_Search();

		/*
		 * // Search Account policycenter.gwPolicyCenter_TabNavigation_Acct_Search(); //
		 * accountSummary accountSummary.detail_Verify(); // Click Menu - New Submission
		 * navigate.gwPolicyCenter_MenuNavigation("New Submission"); // newSubmissions
		 * screen policycenter.newSubmissions_Verify();// Full Application // select LOB
		 * personalauto.newSubmission_SelectLOB_PersonalAuto();
		 * 
		 * strAccountName = policycenter.infoBar("AccountName"); strAccountNumber =
		 * policycenter.infoBar("AccountNumber");
		 * 
		 */
		policycenter.offering();
		policycenter.clickButton("Next");
		personalauto.qualification();
		policycenter.clickButton("Next");

		policyinfo.primaryNamedInsured();
		policyinfo.pi_OfficialID();
		policyinfo.policyDetails();
		policyinfo.affinityGroup();
		policyinfo.producerOfRecord();
		policyinfo.underWritingCompany();

		policycenter.clickButton("Next");

		padriver.driver_Add_ExistingDriver();
		padriver.driver_ContatDetails("VERIFY");
		padriver.driver_Roles("EDIT"); //
		padriver.driver_RetrieveMVR();
		padriver.driver_Addresses("VERIFY");
		padriver.driver_MotorVehicleRecord("VERIFY");

		policycenter.clickButton("Next");

		pavehicle.createVehicles();
		pavehicle.ve_AssignDriver();
		// pavehicle.additionalInterest_Add_ExistingAdditionalInterest();

		policycenter.clickButton("Next");
		coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		coverages.coveragesAppliedperVehiclesIn("VERIFY");
		coverages.additionalcoveragesAppliedtoallVehiclesIn("VERIFY");
		coverages.additionalcoveragesAppliedperVehiclesIn("VERIFY");
		coverages.exclusionsAndConditions("VERIFY");
		policycenter.clickButton("Next");
		riskanalysis.RA_ApproveUWIssues();
		policycenter.clickButton("Next");
		policyreview.pr_PolicyLevelCoverages();
		policyreview.pr_VehicleLevelCoverages();
		policycenter.clickButton("Quote");
		// quote.pa_QuoteDetails();
		policycenter.clickButton("Next");
		forms.pa_forms();
		payments.premiumSummary();
		payments.payments();
		payments.invoicing();
		payments.billing();
		payments.paymentSchedule();
		payments.invoicingOverrides();
		payments.upFrontPayment();
		policycenter.clickButton("Save Draft");
		policycenter.clickButton("Bind Options");
		policycenter.clickButton("Bind Only");
		// Confirming submission transaction
		submissionbound.submissionBound();
		// EDIT Policy number
		submissionbound.View_your_Policy();
		policySummary.Detail_Verify();
		policySummary.Account_Verify();

		strJob = policycenter.infoBar("Job");
		strWorkflow = policycenter.infoBar("Workflow");
		strLOB = policycenter.infoBar("LOB");
		strEffectiveDate = policycenter.infoBar("EffectiveDate");
		strPolicyNumber = policycenter.infoBar("PolicyNumber");
		strAmount = policycenter.infoBar("AccountName");
		strAccountName = policycenter.infoBar("AccountName");
		strAccountNumber = policycenter.infoBar("AccountNumber");
		// Logout PC
		loginScreen.logout_PolicyCenter();
	}

	/*
	 * Testcase = Full Quote Bind only Submission add additional Insured Author =
	 * Arun Date Created = 26/04/21 LOB = Personal Auto Parameter testData
	 * 
	 */
	@Test
	public void AUT_PersonalAuto_PolicyCenter_NewSubmission_4_AdditionalInsuredAdd() throws Throwable {

		/*
		 * call the modules/methods
		 */

		// Logging into Policy Center
		// Logging into Policy Center
		loginScreen.login_PolicyCenter();
		// Click Tab NewAccount
		navigate.gwPolicyCenter_TabNavigation("New Account", "NA");
		// Search Account and createPersonAccount
		policycenter.createPersonAccount();

		accountSummary.detail_Verify();
		// Click Menu - New Submission
		navigate.gwPolicyCenter_MenuNavigation("NewSubmission");
		// newSubmissions screen
		policycenter.newSubmissions_Verify();// Full Application
		// select LOB
		personalauto.newSubmission_SelectLOB_PersonalAuto();

		strAccountName = policycenter.infoBar("AccountName");
		strAccountNumber = policycenter.infoBar("AccountNumber");

		policycenter.offering();
		policycenter.clickButton("Next");
		personalauto.qualification();
		policycenter.clickButton("Next");

		policyinfo.primaryNamedInsured();
		policyinfo.pi_OfficialID();
		policyinfo.policyDetails();
		policyinfo.affinityGroup();
		policyinfo.producerOfRecord();
		policyinfo.underWritingCompany();
		// Add additional insured
		policyinfo.additionalNamedInsured_Add_NewPerson();
		policyinfo.additionalNamedInsured_Add_NewCompany();
		policyinfo.additionalNamedInsured_Add_FromAddresssBook();
		// Add method for Adding existing Additional name Insured
		policycenter.clickButton("Next");
		// PA LOB line level details
		padriver.driver_Add_ExistingDriver();
		policycenter.clickButton("Next");
		pavehicle.createVehicles();
		// vehicles.ve_AssignDriver();
		pavehicle.additionalInterest_Add_NewPerson();
		policycenter.clickButton("Next");
		riskanalysis.RA_ApproveUWIssues();
		policycenter.clickButton("Next");
		policyreview.pr_policyDetails();
		policyreview.pr_PolicyLevelCoverages();
		policyreview.pr_VehicleLevelCoverages();
		policycenter.clickButton("Next");
		// Policy Review screen*
		policycenter.clickButton("Quote");
		// quote.pa_QuoteDetails();
		policycenter.clickButton("Next");
		forms.pa_forms();
		policycenter.clickButton("Next");
		payments.payments();
		policycenter.clickButton("Bind Options");
		policycenter.clickButton("Bind Only");
		// If the submission blocks due to underwriter issues
		// Add method for 'Issues that block Issuance' screen validation*
		// Click button 'Details'*
		riskanalysis.RA_ApproveUWIssues();
		policycenter.clickButton("Quote");
		policycenter.clickButton("Next");
		// Policy Review screen
		policycenter.clickButton("Next");
		forms.pa_forms();
		policycenter.clickButton("Next");
		payments.payments();
		policycenter.clickButton("Bind Options");
		policycenter.clickButton("Bind Only");
		// Confirming submission transaction
		submissionbound.submissionBound();
		// Verify Policy number
		submissionbound.View_your_Policy();

		strJob = policycenter.infoBar("Job");
		strWorkflow = policycenter.infoBar("Workflow");
		strLOB = policycenter.infoBar("LOB");
		strEffectiveDate = policycenter.infoBar("EffectiveDate");
		strAccountName = policycenter.infoBar("AccountName");
		strAccountNumber = policycenter.infoBar("AccountNumber");
		strPolicyNumber = policycenter.infoBar("PolicyNumber");
		strAmount = policycenter.infoBar("AccountName");

		// Logout PC
		loginScreen.logout_PolicyCenter();
	}

	/*
	 * Testcase = Full Quote Bind only Submission Delete additional Insured Author =
	 * Arun Date Created = 26/04/21 LOB = Personal Auto Parameter testData
	 * 
	 */
	@Test
	public void AUT_PersonalAuto_PolicyCenter_NewSubmission_5_AdditionalInsuredDel() throws Throwable {

		/*
		 * call the modules/methods
		 */

		// Logging into Policy Center
		loginScreen.login_PolicyCenter();
		// Click Tab NewAccount
		navigate.gwPolicyCenter_TabNavigation("New Account", "NA");
		// Search Account and createPersonAccount
		policycenter.createPersonAccount();
		// Click Menu New Submission
		navigate.gwPolicyCenter_MenuNavigation("NewSubmission");
		// New Sub screen
		policycenter.newSubmissions_Verify();// Full Application
		// Change method name "Select_PALOB()"
		// select LOB
		personalauto.newSubmission_SelectLOB_PersonalAuto();
		policycenter.offering();
		policycenter.clickButton("Next");
		personalauto.qualification();
		policycenter.clickButton("Next");
		policyinfo.primaryNamedInsured();
		policyinfo.pi_OfficialID();
		policyinfo.policyDetails();
		policyinfo.affinityGroup();
		policyinfo.producerOfRecord();
		policyinfo.underWritingCompany();
		// Add additional insured
		policyinfo.additionalNamedInsured_Add_NewPerson();
		policyinfo.additionalNamedInsured_Add_NewCompany();
		policyinfo.additionalNamedInsured_Add_FromAddresssBook();
		// Add method for Adding existing Additional name Insured
		// Delete Additional name insured
		policyinfo.additionalNamedInsured_Remove();
		policycenter.clickButton("Next");
		policycenter.clickButton("Save Draft");

		strJob = policycenter.infoBar("Job");
		strWorkflow = policycenter.infoBar("Workflow");
		strLOB = policycenter.infoBar("LOB");
		strEffectiveDate = policycenter.infoBar("EffectiveDate");
		strAccountName = policycenter.infoBar("AccountName");
		strAccountNumber = policycenter.infoBar("AccountNumber");
		strPolicyNumber = policycenter.infoBar("PolicyNumber");
		strAmount = policycenter.infoBar("AccountName");

		// Logout PC
		loginScreen.logout_PolicyCenter();
	}

	/*
	 * Testcase = Full Quote Bind only Submission Edit additional Insured Author =
	 * Arun Date Created = 26/04/21 LOB = Personal Auto Parameter testData
	 * 
	 */
	@Test
	public void AUT_PersonalAuto_PolicyCenter_NewSubmission_6_AdditionalInsuredMod() throws Throwable {

		/*
		 * call the modules/methods
		 */

		// Logging into Policy Center
		loginScreen.login_PolicyCenter();
		// Click Tab NewAccount
		navigate.gwPolicyCenter_TabNavigation("New Account", "NA");
		// Search Account and createPersonAccount
		policycenter.createPersonAccount();
		// Click Menu New Submission
		navigate.gwPolicyCenter_MenuNavigation("NewSubmission");
		// New Sub screen
		policycenter.newSubmissions_Verify();// Full Application
		// Change method name "Select_PALOB()"
		// select LOB
		personalauto.newSubmission_SelectLOB_PersonalAuto();
		policycenter.offering();
		policycenter.clickButton("Next");
		personalauto.qualification();
		policycenter.clickButton("Next");
		policyinfo.primaryNamedInsured();
		policyinfo.pi_OfficialID();
		policyinfo.policyDetails();
		policyinfo.affinityGroup();
		policyinfo.producerOfRecord();
		policyinfo.underWritingCompany();
		// Add additional insured
		policyinfo.additionalNamedInsured_Add_NewPerson();
		policyinfo.additionalNamedInsured_Add_NewCompany();
		policyinfo.additionalNamedInsured_Add_FromAddresssBook();
		// Add method for Adding existing Additional name Insured
		policyinfo.additionalNamedInsured_Edit();
		policycenter.clickButton("Next");
		// PA LOB line level details
		padriver.driver_Add_ExistingDriver();
		policycenter.clickButton("Next");
		pavehicle.createVehicles();
		// vehicles.ve_AssignDriver();
		pavehicle.additionalInterest_Add_NewPerson();
		policycenter.clickButton("Next");
		riskanalysis.RA_ApproveUWIssues();
		policycenter.clickButton("Next");
		policyreview.pr_policyDetails();
		policyreview.pr_PolicyLevelCoverages();
		policyreview.pr_VehicleLevelCoverages();
		policycenter.clickButton("Next");
		// Policy Review screen*
		policycenter.clickButton("Quote");
		// quote.pa_QuoteDetails();
		policycenter.clickButton("Next");
		forms.pa_forms();
		policycenter.clickButton("Next");
		payments.payments();
		policycenter.clickButton("Bind Options");
		policycenter.clickButton("Bind Only");
		// If the submission blocks due to underwriter issues
		// Add method for 'Issues that block Issuance' screen validation*
		// Click button 'Details'*
		riskanalysis.RA_ApproveUWIssues();
		policycenter.clickButton("Quote");
		policycenter.clickButton("Next");
		// Policy Review screen
		policycenter.clickButton("Next");
		forms.pa_forms();
		policycenter.clickButton("Next");
		payments.payments();
		policycenter.clickButton("Bind Options");
		policycenter.clickButton("Bind Only");
		// Confirming submission transaction
		submissionbound.submissionBound();
		// Verify Policy number
		submissionbound.View_your_Policy();

		strJob = policycenter.infoBar("Job");
		strWorkflow = policycenter.infoBar("Workflow");
		strLOB = policycenter.infoBar("LOB");
		strEffectiveDate = policycenter.infoBar("EffectiveDate");
		strAccountName = policycenter.infoBar("AccountName");
		strAccountNumber = policycenter.infoBar("AccountNumber");
		strPolicyNumber = policycenter.infoBar("PolicyNumber");
		strAmount = policycenter.infoBar("AccountName");

		// Logout PC
		loginScreen.logout_PolicyCenter();
	}

	/*
	 * Testcase = Full Quote Bind only Submission Add Secondary Named Insured Author
	 * = Arun Date Created = 26/04/21 LOB = Personal Auto Parameter testData
	 * 
	 */
	@Test
	public void AUT_PersonalAuto_PolicyCenter_NewSubmission_7_SecondaryNamedInsuredAdd() throws Throwable {

		/*
		 * call the modules/methods
		 */

		// Logging into Policy Center
		loginScreen.login_PolicyCenter();
		// Click Tab NewAccount
		navigate.gwPolicyCenter_TabNavigation("New Account", "NA");
		// Search Account and createPersonAccount
		policycenter.createPersonAccount();
		// Click Menu New Submission
		navigate.gwPolicyCenter_MenuNavigation("NewSubmission");
		// New Sub screen
		policycenter.newSubmissions_Verify();// Full Application
		// Change method name "Select_PALOB()"
		// select LOB
		personalauto.newSubmission_SelectLOB_PersonalAuto();
		policycenter.offering();
		policycenter.clickButton("Next");
		personalauto.qualification();
		policycenter.clickButton("Next");
		policyinfo.primaryNamedInsured();
		policyinfo.pi_OfficialID();
		policyinfo.policyDetails();
		policyinfo.affinityGroup();
		policyinfo.producerOfRecord();
		policyinfo.underWritingCompany();
		// Add Secondary Name insured
		policyinfo.secondaryInsured_NewPerson();
		policyinfo.secondaryInsured_FromAddressBook();
		policyinfo.secondaryInsured_ExistingContact();
		policycenter.clickButton("Next");
		// PA LOB line level details
		padriver.driver_Add_ExistingDriver();
		policycenter.clickButton("Next");
		pavehicle.createVehicles();
		// vehicles.ve_AssignDriver();
		pavehicle.additionalInterest_Add_NewPerson();
		policycenter.clickButton("Next");
		riskanalysis.RA_ApproveUWIssues();
		policycenter.clickButton("Next");
		policyreview.pr_policyDetails();
		policyreview.pr_PolicyLevelCoverages();
		policyreview.pr_VehicleLevelCoverages();
		policycenter.clickButton("Next");
		// Policy Review screen*
		policycenter.clickButton("Quote");
		// quote.pa_QuoteDetails();
		policycenter.clickButton("Next");
		forms.pa_forms();
		policycenter.clickButton("Next");
		payments.payments();
		policycenter.clickButton("Bind Options");
		policycenter.clickButton("Bind Only");
		// If the submission blocks due to underwriter issues
		// Add method for 'Issues that block Issuance' screen validation*
		// Click button 'Details'*
		riskanalysis.RA_ApproveUWIssues();
		policycenter.clickButton("Quote");
		policycenter.clickButton("Next");
		// Policy Review screen
		policycenter.clickButton("Next");
		forms.pa_forms();
		policycenter.clickButton("Next");
		payments.payments();
		policycenter.clickButton("Bind Options");
		policycenter.clickButton("Bind Only");
		// Confirming submission transaction
		submissionbound.submissionBound();
		// Verify Policy number
		submissionbound.View_your_Policy();

		strJob = policycenter.infoBar("Job");
		strWorkflow = policycenter.infoBar("Workflow");
		strLOB = policycenter.infoBar("LOB");
		strEffectiveDate = policycenter.infoBar("EffectiveDate");
		strAccountName = policycenter.infoBar("AccountName");
		strAccountNumber = policycenter.infoBar("AccountNumber");
		strPolicyNumber = policycenter.infoBar("PolicyNumber");
		strAmount = policycenter.infoBar("AccountName");

		// Logout PC
		loginScreen.logout_PolicyCenter();
	}

	/*
	 * Testcase = Full Quote Bind only Submission Secondary Named Insured Author =
	 * Arun Date Created = 26/04/21 LOB = Personal Auto Parameter testData
	 * 
	 */
	@Test
	public void AUT_PersonalAuto_PolicyCenter_NewSubmission_9_SecondaryNamedInsuredMod() throws Throwable {

		/*
		 * call the modules/methods
		 */

		// Logging into Policy Center
		loginScreen.login_PolicyCenter();
		// Click Tab NewAccount
		navigate.gwPolicyCenter_TabNavigation("New Account", "NA");
		// Search Account and createPersonAccount
		policycenter.createPersonAccount();
		// Click Menu New Submission
		navigate.gwPolicyCenter_MenuNavigation("NewSubmission");
		// New Sub screen
		policycenter.newSubmissions_Verify();// Full Application
		// Change method name "Select_PALOB()"
		// select LOB
		personalauto.newSubmission_SelectLOB_PersonalAuto();
		policycenter.offering();
		policycenter.clickButton("Next");
		personalauto.qualification();
		policycenter.clickButton("Next");
		policyinfo.primaryNamedInsured();
		policyinfo.pi_OfficialID();
		policyinfo.policyDetails();
		policyinfo.affinityGroup();
		policyinfo.producerOfRecord();
		policyinfo.underWritingCompany();
		// Add Secondary Name insured
		policyinfo.secondaryInsured_NewPerson();
		policyinfo.secondaryInsured_FromAddressBook();
		policyinfo.secondaryInsured_ExistingContact();
		// Modify Secondary name insured
		// Insert Edit Secondary name insured
		policycenter.clickButton("Next");
		policycenter.clickButton("Save Draft");

		strJob = policycenter.infoBar("Job");
		strWorkflow = policycenter.infoBar("Workflow");
		strLOB = policycenter.infoBar("LOB");
		strEffectiveDate = policycenter.infoBar("EffectiveDate");
		strAccountName = policycenter.infoBar("AccountName");
		strAccountNumber = policycenter.infoBar("AccountNumber");
		strPolicyNumber = policycenter.infoBar("PolicyNumber");
		strAmount = policycenter.infoBar("AccountName");

		// Logout PC
		loginScreen.logout_PolicyCenter();
	}

	/*
	 * Testcase = Full Quote Bind only withdraw Submission Author = Arun Date
	 * Created = 26/04/21 LOB = Personal Auto Parameter testData
	 * 
	 */
	@Test
	public void AUT_PersonalAuto_PolicyCenter_NewSubmission_87_Quote_Closeoptions() throws Throwable {

		/*
		 * call the modules/methods
		 */

		// Logging into Policy Center
		loginScreen.login_PolicyCenter();
		// Click Tab NewAccount
		navigate.gwPolicyCenter_TabNavigation("New Account", "NA");
		// Search Account and createPersonAccount
		policycenter.createPersonAccount();
		// Click Menu New Submission
		navigate.gwPolicyCenter_MenuNavigation("NewSubmission");
		// New Sub screen
		policycenter.newSubmissions_Verify();// Full Application
		// select LOB
		personalauto.newSubmission_SelectLOB_PersonalAuto();
		policycenter.offering();
		policycenter.clickButton("Next");
		personalauto.qualification();
		policycenter.clickButton("Next");
		policyinfo.primaryNamedInsured();
		policyinfo.pi_OfficialID();
		policyinfo.policyDetails();
		policyinfo.affinityGroup();
		policyinfo.producerOfRecord();
		policyinfo.underWritingCompany();
		policycenter.clickButton("Next");
		// PA LOB line level details
		padriver.driver_Add_ExistingDriver();
		policycenter.clickButton("Next");
		pavehicle.createVehicles();
		// vehicles.ve_AssignDriver();
		pavehicle.additionalInterest_Add_NewPerson();
		policycenter.clickButton("Next");
		riskanalysis.RA_ApproveUWIssues();
		policycenter.clickButton("Next");
		policyreview.pr_policyDetails();
		policyreview.pr_PolicyLevelCoverages();
		policyreview.pr_VehicleLevelCoverages();
		policycenter.clickButton("Next");
		// Risk Analysis screen
		policycenter.clickButton("Next");
		// Policy Review screen
		policycenter.clickButton("Quote");
		// quote.pa_QuoteDetails();
		riskanalysis.RA_ApproveUWIssues();
		policycenter.clickButton("Quote");
		policycenter.clickButton("Next");
		forms.pa_forms();
		policycenter.clickButton("Next");
		payments.payments();
		// Withdraw transaction
		policycenter.clickButton("Withdraw Transaction");
		// Insert Close Submission method

		strJob = policycenter.infoBar("Job");
		strWorkflow = policycenter.infoBar("Workflow");
		strLOB = policycenter.infoBar("LOB");
		strEffectiveDate = policycenter.infoBar("EffectiveDate");
		strAccountName = policycenter.infoBar("AccountName");
		strAccountNumber = policycenter.infoBar("AccountNumber");
		strPolicyNumber = policycenter.infoBar("PolicyNumber");
		strAmount = policycenter.infoBar("AccountName");

		// Logout PC
		loginScreen.logout_PolicyCenter();
	}

	/*
	 * Testcase = Full Quote Issue Submission Author = Arun Date Created = 26/04/21
	 * LOB = Personal Auto Parameter testData
	 * 
	 */
	@Test
	public void AUT_PersonalAuto_PolicyCenter_NewSubmission_89_SubmissionBound_PolicynumberValidation()
			throws Throwable {

		/*
		 * call the modules/methods
		 */

		// Logging into Policy Center
		loginScreen.login_PolicyCenter();
		// Click Tab NewAccount
		navigate.gwPolicyCenter_TabNavigation("New Account", "NA");
		// Search Account and createPersonAccount
		policycenter.createPersonAccount();
		// Click Menu New Submission
		navigate.gwPolicyCenter_MenuNavigation("NewSubmission");
		// New Sub screen
		policycenter.newSubmissions_Verify();// Full Application
		// select LOB
		personalauto.newSubmission_SelectLOB_PersonalAuto();
		// offering
		policycenter.offering();
		policycenter.clickButton("Next");
		// qualification
		personalauto.qualification();
		policycenter.clickButton("Next");
		// primaryNamedInsured
		policyinfo.primaryNamedInsured();
		policyinfo.pi_OfficialID();
		policyinfo.policyDetails();
		policyinfo.affinityGroup();
		policyinfo.producerOfRecord();
		policyinfo.underWritingCompany();
		policycenter.clickButton("Next");
		// PA LOB line level details
		padriver.driver_Add_ExistingDriver();
		policycenter.clickButton("Next");
		pavehicle.createVehicles();
		// vehicles.ve_AssignDriver();
		pavehicle.additionalInterest_Add_NewPerson();
		policycenter.clickButton("Next");
		riskanalysis.RA_ApproveUWIssues();
		policycenter.clickButton("Next");
		policyreview.pr_policyDetails();
		policyreview.pr_PolicyLevelCoverages();
		policyreview.pr_VehicleLevelCoverages();
		policycenter.clickButton("Next");
		// Policy Review screen*
		policycenter.clickButton("Quote");
		// quote.pa_QuoteDetails();
		policycenter.clickButton("Next");
		forms.pa_forms();
		policycenter.clickButton("Next");
		payments.payments();
		policycenter.clickButton("Bind Options");
		policycenter.clickButton("Issue Policy");
		// If the submission blocks due to underwriter issues
		// Add method for 'Issues that block Issuance' screen validation*
		// Click button 'Details'*
		riskanalysis.RA_ApproveUWIssues();
		policycenter.clickButton("Quote");
		policycenter.clickButton("Next");
		// Policy Review screen
		policycenter.clickButton("Next");
		forms.pa_forms();
		policycenter.clickButton("Next");
		payments.payments();
		policycenter.clickButton("Bind Options");
		policycenter.clickButton("Issue Policy");
		// Confirming submission transaction
		submissionbound.submissionBound();
		// Verify Policy number
		submissionbound.View_your_Policy();

		strJob = policycenter.infoBar("Job");
		strWorkflow = policycenter.infoBar("Workflow");
		strLOB = policycenter.infoBar("LOB");
		strEffectiveDate = policycenter.infoBar("EffectiveDate");
		strAccountName = policycenter.infoBar("AccountName");
		strAccountNumber = policycenter.infoBar("AccountNumber");
		strPolicyNumber = policycenter.infoBar("PolicyNumber");
		strAmount = policycenter.infoBar("AccountName");

		// Logout PC
		loginScreen.logout_PolicyCenter();
	}

}
