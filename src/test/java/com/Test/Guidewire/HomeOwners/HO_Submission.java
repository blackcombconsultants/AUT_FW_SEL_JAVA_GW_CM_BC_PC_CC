package com.Test.Guidewire.HomeOwners;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Account;
import com.pages.Guidewire.PolicyCenter.PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.HomeOwners.HO_Coverages;
import com.pages.Guidewire.PolicyCenter.HomeOwners.HO_Dwelling;
import com.pages.Guidewire.PolicyCenter.HomeOwners.HO_DwellingConstruction;
import com.pages.Guidewire.PolicyCenter.HomeOwners.HO_Modifiers;
import com.pages.Guidewire.PolicyCenter.HomeOwners.HO_PolicyInfo;
import com.pages.Guidewire.PolicyCenter.HomeOwners.HO_PolicyReview;
import com.pages.Guidewire.PolicyCenter.HomeOwners.HO_Qualifications;
import com.pages.Guidewire.PolicyCenter.HomeOwners.HO_Quote;
import com.pages.Guidewire.PolicyCenter.HomeOwners.HO_Reusable;
import com.pages.Guidewire.PolicyCenter.HomeOwners.HO_RiskAnalysis;

public class HO_Submission extends GW_GetDriver {
	
	@Test
	
	public void AUT_HO_PC_NewSubmission_NewAccount_NewSubmission() throws Throwable {
		// Login
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");

		// Create person Account
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.createPersonAccount();
		PC_AccountSummary.detail_Verify();
		
		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		HO_Reusable.newSubmission_SelectLOB_HomeOwners(); // select
																			// LOB
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		
		HO_Qualifications.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);
		HO_PolicyInfo.dateQuoteNeeded();
		HO_PolicyInfo.primaryNamedInsured();
		HO_PolicyInfo.affinityGroup();
		HO_PolicyInfo.pi_OfficialID();
		HO_PolicyInfo.policyDetails();
		HO_PolicyInfo.producerOfRecord();
		
		PolicyCenter_Resuables.clickButton("Next");
		
		HO_Dwelling.DwellingDetails();
		HO_Dwelling.DW_Protection();
		PolicyCenter_Resuables.clickButton("Next");
        
		HO_DwellingConstruction.DwellingConstructionDetails();
		PolicyCenter_Resuables.clickButton("Next");
		
		HO_Coverages.SectionICoverage();
		HO_Coverages.CoverageADwelling();
		HO_Coverages.CoverageDLossofUse();
		HO_Coverages.SectionIICoverage();
		PolicyCenter_Resuables.clickButton("Next");

		HO_Modifiers.ModifiersPolicyDetails();
		HO_Modifiers.ModifiersDwellingDetails();
		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);
		HO_RiskAnalysis.RiskAnalysis();
		PolicyCenter_Resuables.clickButton("Next");

		HO_PolicyReview.PR_PrimaryInsured();
        HO_PolicyReview.PR_policyDetails();
        
        Thread.sleep(2000);
		PolicyCenter_Resuables.clickButton("Quote");
		HO_Quote.quoteDetails();
		
		
        PolicyCenter_Resuables.clickButton("Bind Options");
        PolicyCenter_Resuables.clickButton("Issue Policy");
        strJob = PolicyCenter_Resuables.infoBar("Job");
        strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
        
		PC_Bound.ViewYourPolicy();
		PC_PolicySummary.detail_Verify();
		PC_PolicySummary.account_Verify();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

}
