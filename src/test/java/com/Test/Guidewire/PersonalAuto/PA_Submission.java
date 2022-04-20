package com.Test.Guidewire.PersonalAuto;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Account;
import com.pages.Guidewire.PolicyCenter.PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Coverages;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Drivers;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_PolicyInfo;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_PolicyReview;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Qualification;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Quote;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Reusable;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_RiskAnalysis;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Vehicles;

public class PA_Submission extends GW_GetDriver {

	@BeforeTest
	public void driver_ObjReference_Initiate() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("@BeforeTest");
		System.out.println("-------------------------------------------------------------------------");
	}

	@AfterTest
	public void driver_ObjReference_Garbage() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("@AfterTest");
		System.out.println("-------------------------------------------------------------------------");
	}
	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_Account_OpenPolicyTransaction_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("Account Search", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_NewAccount_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_SearchAccount_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("Account Search", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_Single_FullApplication() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Single_FullApplication_DefaultEffectiveDate_Modify() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();

		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.createPersonAccount();
		PC_AccountSummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("New Submission Desktop");
		PolicyCenter_Resuables.newSubmissions_Edit();
		PA_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																		// LOB
		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
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

		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Issue Policy");
		strJob          = PolicyCenter_Resuables.infoBar("Job");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

		PC_Bound.ViewYourPolicy();
		PC_PolicySummary.detail_Verify();
		PC_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Offering_BasicProgram() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Offering_PremiumProgram() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Offering_StandardProgram() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PA_PreQualification_Yes() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PA_PreQualification_NoNewDriver() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PA_PreQualification_PreviousPolicydidnotrenew() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PA_PreQualification_NotKnown() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PI_QuoteNeeded_BackDated() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PI_QuoteNeeded_FutureDate() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PI_TermType_Annual() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PI_EffectiveDate_BackDated() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PI_EffectiveDate_FutureDated() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PI_WrittenDate_BackDated() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PI_WrittenDate_FutureDated() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PI_UnderwritingCompany() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PA_Driver_Add_ExistingDriver() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PA_CreateVehicle() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PolicyReview_InsuredDetais() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PA_PolicyReview() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Quote_InsuredDetais() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_PA_Quote() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_BillingMethod_DirectBill() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_PaymentSchedule_A() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_PaymentSchedule_B() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_PaymentSchedule_C() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_PaymentSchedule_D() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_PaymentSchedule_E() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_PaymentSchedule_F() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_PaymentSchedule_Compass() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_PaymentSchedule_Monthly10() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_PaymentSchedule_Monthly10AlwaysTransferExcess() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_PaymentSchedule_EveryOtherWeek() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_FixInvoice_BillDate() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_PayUsing_CreditCard() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_UpFrontPayment_HeldByAgent() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_UpFrontPayment_Check() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_UpFrontPayment_Cash() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_Pay_UpFrontPayment_Electronic() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_SaveDraft() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Save Draft");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_BindOption_BindOnly() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Bind Only");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_BindOption_IssuePolicy() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_SubmissionBound_ViewYourPolicy() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_CloseOptions_Withdraw() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Quote");
		PolicyCenter_Resuables.clickButton("Close Options");
		PolicyCenter_Resuables.clickButton("Withdraw Transaction");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

}
