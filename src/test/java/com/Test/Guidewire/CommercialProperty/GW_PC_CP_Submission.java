package com.Test.Guidewire.CommercialProperty;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.CommercialProperty.CP_Blankets;
import com.pages.Guidewire.CommercialProperty.CP_BuildingsAndLocations;
import com.pages.Guidewire.CommercialProperty.CP_Forms;
import com.pages.Guidewire.CommercialProperty.CP_Modifiers;
import com.pages.Guidewire.CommercialProperty.CP_Payment;
import com.pages.Guidewire.CommercialProperty.CP_PolicyInfo;
import com.pages.Guidewire.CommercialProperty.CP_PolicyReview;
import com.pages.Guidewire.CommercialProperty.CP_Quote;
import com.pages.Guidewire.CommercialProperty.CP_Reusable;
import com.pages.Guidewire.CommercialProperty.CP_RiskAnalysis;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Account;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Bound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class GW_PC_CP_Submission extends GW_GetDriver {
	@Test

	public void AUT_CommercialProperty_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
		PolicyCenter_AccountSummary.detail_Verify();
		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		CP_Reusable.newSubmission_SelectLOB_CommercialProperty(); // select
																	// LOB
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		// Policy Info
		CP_PolicyInfo.dateQuoteNeeded();
		CP_PolicyInfo.primaryNamedInsured();
		CP_PolicyInfo.policyAddress();
		CP_PolicyInfo.OfficialID();
		CP_PolicyInfo.OrganizationType();
		CP_PolicyInfo.policyDetails();
		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);

		// Buildings And Locations
		CP_BuildingsAndLocations.BuildingsAndLocations();
		
		CP_BuildingsAndLocations.NewBuildingDetails();
		CP_BuildingsAndLocations.NewBuildingCoverages();
		PolicyCenter_Resuables.clickButton("Next");
		
		Thread.sleep(2000);

		// Blankets
		CP_Blankets.Blankets();
		CP_Blankets.BlanketDetails();
		PolicyCenter_Resuables.clickButton("Next");
		
		
		Thread.sleep(2000);
		// Modifiers
		CP_Modifiers.RatingInputs();
		PolicyCenter_Resuables.clickButton("Next");
		
		Thread.sleep(2000);
		// Risk Analysis
		CP_RiskAnalysis.RiskAnalysis();
		PolicyCenter_Resuables.clickButton("Next");
		
		Thread.sleep(2000);
		//Policy Review
		CP_PolicyReview.PolicyReview();
		CP_PolicyReview.PolicyDetails();
		CP_Reusable.ClickButton("Rate");
		Thread.sleep(2000);
		CP_Reusable.ClickButton("Finish Quote");

		Thread.sleep(2000);
		// Quote
		CP_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		
		Thread.sleep(2000);
		// Forms
		CP_Forms.pa_forms();
		CP_Forms.forms_validate("VERIFY");
		CP_Forms.description_validate("VERIFY");
		Thread.sleep(2000);
		PolicyCenter_Resuables.clickButton("Next");
		
		Thread.sleep(2000);
		// Payment
		CP_Payment.premiumSummary();
		CP_Payment.payments();
		CP_Payment.invoicing();
		CP_Payment.billing();

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
