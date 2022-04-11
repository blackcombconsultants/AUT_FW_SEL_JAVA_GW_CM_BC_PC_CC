package com.Test.Guidewire.InlandMarine;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.Utils.Selenium.JiraPolicy;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.InlineMarine.IM_AccountsReceivable;
import com.pages.Guidewire.InlineMarine.IM_BuildingsandLocations;
import com.pages.Guidewire.InlineMarine.IM_ContractorsEquipment;
import com.pages.Guidewire.InlineMarine.IM_CoveragePartSelection;
import com.pages.Guidewire.InlineMarine.IM_Forms;
import com.pages.Guidewire.InlineMarine.IM_Payment;
import com.pages.Guidewire.InlineMarine.IM_PolicyInfo;
import com.pages.Guidewire.InlineMarine.IM_PolicyReview;
import com.pages.Guidewire.InlineMarine.IM_Quote;
import com.pages.Guidewire.InlineMarine.IM_Reusable;
import com.pages.Guidewire.InlineMarine.IM_RiskAnalysis;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Account;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Bound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class GW_PC_IM_Submission extends GW_GetDriver {
	
	@JiraPolicy(logTicketReady = true)
	@Test
	public void AUT_IM_PC_NewSubmission_NewAccount_NewSubmission() throws Throwable {
		// Login
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		
		
		// Create person Account
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
		PolicyCenter_AccountSummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		IM_Reusable.newSubmission_SelectLOB_InlineMarine(); // select // LOB
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		IM_PolicyInfo.dateQuoteNeeded();
		IM_PolicyInfo.primaryNamedInsured();
		IM_PolicyInfo.OfficialID();
		IM_PolicyInfo.businessandOperations();
		IM_PolicyInfo.OrganizationType();
		IM_PolicyInfo.policyDetails();
		IM_PolicyInfo.affinityGroup();
		IM_PolicyInfo.producerOfRecord();

		PolicyCenter_Resuables.clickButton("Next");
		IM_CoveragePartSelection.AddCoveragePart();

		PolicyCenter_Resuables.clickButton("Next");
		IM_BuildingsandLocations.AddNewBuilding();
		IM_BuildingsandLocations.NewBuilding_Details();
		PolicyCenter_Resuables.clickButton("OK");
		PolicyCenter_Resuables.clickButton("Next");

		IM_AccountsReceivable.PartLevelInformation();
		IM_AccountsReceivable.PLI_OffPremisesProperty();
		IM_AccountsReceivable.AccountsReceivableCoverages_Add();

		PolicyCenter_Resuables.clickButton("Next");

		IM_ContractorsEquipment.Coverages_PartLevelInformation();
		IM_ContractorsEquipment.PLI_ContractorsRentedEquipment();
		IM_ContractorsEquipment.UnscheduledEquipment_CE_MiscItems();
		IM_ContractorsEquipment.UnderwritingInformation();

		PolicyCenter_Resuables.clickButton("Next");

		IM_RiskAnalysis.button_Verify();
		PolicyCenter_Resuables.clickButton("Next");

		IM_PolicyReview.PrimaryNamedInsured();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		IM_Quote.QuoteDetails();

		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Resuables.clickButton("Next");
		IM_Forms.pa_forms();
		PolicyCenter_Resuables.clickButton("Next");

		IM_Payment.premiumSummary();
		IM_Payment.payments();
		IM_Payment.invoicing();
		IM_Payment.billing();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Issue Policy");
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	
}
