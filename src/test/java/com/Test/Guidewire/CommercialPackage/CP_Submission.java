package com.Test.Guidewire.CommercialPackage;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Account;
import com.pages.Guidewire.PolicyCenter.PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.CommercialPackage.CPACK_CP_BuildingsAndLocations;
import com.pages.Guidewire.PolicyCenter.CommercialPackage.CPACK_CP_LineReview;
import com.pages.Guidewire.PolicyCenter.CommercialPackage.CPACK_CP_Modifiers;
import com.pages.Guidewire.PolicyCenter.CommercialPackage.CPACK_Coverages;
import com.pages.Guidewire.PolicyCenter.CommercialPackage.CPACK_IM_LineReview;
import com.pages.Guidewire.PolicyCenter.CommercialPackage.CPACK_IM_Modifiers;
import com.pages.Guidewire.PolicyCenter.CommercialPackage.CPACK_LineReview;
import com.pages.Guidewire.PolicyCenter.CommercialPackage.CPACK_LineSelection;
import com.pages.Guidewire.PolicyCenter.CommercialPackage.CPACK_Locations;
import com.pages.Guidewire.PolicyCenter.CommercialPackage.CPACK_Offering;
import com.pages.Guidewire.PolicyCenter.CommercialPackage.CPACK_PolicyInfo;
import com.pages.Guidewire.PolicyCenter.CommercialPackage.CPACK_Qualification;
import com.pages.Guidewire.PolicyCenter.CommercialPackage.CPACK_Reusables;
import com.pages.Guidewire.PolicyCenter.CommercialProperty.CP_Blankets;
import com.pages.Guidewire.PolicyCenter.CommercialProperty.CP_BuildingsAndLocations;
import com.pages.Guidewire.PolicyCenter.CommercialProperty.CP_RiskAnalysis;
import com.pages.Guidewire.PolicyCenter.GeneralLiability.GL_Exposures;
import com.pages.Guidewire.PolicyCenter.GeneralLiability.GL_Modifiers;
import com.pages.Guidewire.PolicyCenter.InlineMarine.IM_AccountsReceivable;
import com.pages.Guidewire.PolicyCenter.InlineMarine.IM_ContractorsEquipment;
import com.pages.Guidewire.PolicyCenter.InlineMarine.IM_CoveragePartSelection;
import com.pages.Guidewire.PolicyCenter.InlineMarine.IM_Forms;
import com.pages.Guidewire.PolicyCenter.InlineMarine.IM_Payment;
import com.pages.Guidewire.PolicyCenter.InlineMarine.IM_Quote;

public class CP_Submission extends GW_GetDriver {
	@Test

	public void AUT_CommercialPackage_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.createPersonAccount();
		PC_AccountSummary.detail_Verify();
		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		CPACK_Reusables.newSubmission_SelectLOB_CommercialPackage();// select
																	// LOB
		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		CPACK_Offering.offering();
		CPACK_Offering.CPPOfferingQuestions();
		PolicyCenter_Resuables.clickButton("Next");
		// qualification
		CPACK_Qualification.qualification();
		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);

		// Policy Info
		CPACK_PolicyInfo.dateQuoteNeeded();
		CPACK_PolicyInfo.primaryNamedInsured();
		CPACK_PolicyInfo.policyAddress();
		CPACK_PolicyInfo.pi_OfficialID();
		CPACK_PolicyInfo.OrganizationType();
		CPACK_PolicyInfo.policyDetails();
		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);

		// Line Selection
		CPACK_LineSelection.lineSelection();
		PolicyCenter_Resuables.clickButton("Next");

		// Locations
		CPACK_Locations.Locations_Details();
		PolicyCenter_Resuables.clickButton("Next");

		// Coverages
		CPACK_Coverages.StandardCoverages();
		PolicyCenter_Resuables.clickButton("Next");

		// Exposures
		GL_Exposures.ExposureValuesbylocation_Add();
		PolicyCenter_Resuables.clickButton("Next");

		GL_Modifiers.RatingInputs();
		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);

		// Line Review
		CPACK_LineReview.LR_PrimaryInsured_GL();
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
		CPACK_CP_Modifiers.RatingInputs();
		PolicyCenter_Resuables.clickButton("Next");

		Thread.sleep(2000);
		// Line Review
		CPACK_CP_LineReview.LR_PrimaryInsured_CP();
		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);

		// Coverage part selection
		IM_CoveragePartSelection.AddCoveragePart();
		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);
		// Buildings And Locations
		CPACK_CP_BuildingsAndLocations.BuildingsAndLocations();

		CPACK_CP_BuildingsAndLocations.NewBuildingDetails();

		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);

		// AccountsReceivable
		IM_AccountsReceivable.PartLevelInformation();
		IM_AccountsReceivable.PLI_OffPremisesProperty();
		IM_AccountsReceivable.AccountsReceivableCoverages_Add();
		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);

		// ContractorsEquipment
		IM_ContractorsEquipment.Coverages_PartLevelInformation();
		IM_ContractorsEquipment.PLI_ContractorsRentedEquipment();
		IM_ContractorsEquipment.UnscheduledEquipment_CE_MiscItems();
		IM_ContractorsEquipment.UnderwritingInformation();

		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);

		// Line Review
		CPACK_IM_LineReview.LR_PrimaryInsured();
		PolicyCenter_Resuables.clickButton("Next");
		Thread.sleep(2000);

		// Modifiers
		CPACK_IM_Modifiers.RatingInputs();
		PolicyCenter_Resuables.clickButton("Next");

		// Risk Analysis
		CP_RiskAnalysis.RiskAnalysis();
		PolicyCenter_Resuables.clickButton("Quote");

		IM_Quote.QuoteDetails();

		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		Thread.sleep(2000);
		PolicyCenter_Resuables.clickButton("Next");
		IM_Forms.pa_forms();
		PolicyCenter_Resuables.clickButton("Next");

		IM_Payment.premiumSummary();
		IM_Payment.payments();
		IM_Payment.invoicing();
		IM_Payment.billing();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Issue Policy");
		strJob          = PolicyCenter_Resuables.infoBar("Job");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

		PC_Bound.ViewYourPolicy();
		PC_PolicySummary.detail_Verify();
		PC_PolicySummary.account_Verify();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}
}
