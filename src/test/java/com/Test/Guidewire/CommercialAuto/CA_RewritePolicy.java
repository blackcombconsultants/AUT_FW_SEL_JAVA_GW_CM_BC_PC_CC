package com.Test.Guidewire.CommercialAuto;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.*;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Reusable;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.Tab_Menu_Navigation;
import org.testng.annotations.Test;

public class CA_RewritePolicy extends GW_GetDriver {

    @Test
    public void AUT_PC_CA_RewriteDraft() throws Throwable {

    }
    @Test
    public void AUT_PC_CA_RewriteQuote() throws Throwable {

    }
    @Test
    public void AUT_PC_CA_RewriteIssue() throws Throwable {

    }

    @Test
    public void AUT_PC_CA_Rewrite_FullTerm() throws Throwable {

    }
    @Test
    public void AUT_PC_CA_Rewrite_NewTerm() throws Throwable {
        GW_CM_PC_BC_CC_Login.login_PolicyCenter();
        PolicyCenter_Resuables.Policytransactions("CancelPolicy_CancelNow");

        Tab_Menu_Navigation.pcMenuNavigation("Rewrite New Term");

        strJob              = PolicyCenter_Resuables.infoBar("Job");
        strLOB              = PolicyCenter_Resuables.infoBar("LOB");
        strEffectiveDate    = PolicyCenter_Resuables.infoBar("EffectiveDate");
        strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
        strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
        strPolicyNumber     = PolicyCenter_Resuables.infoBar("PolicyNumber");
        strUnderwriter      = PolicyCenter_Resuables.infoBar("Underwriter");
        strSubmissionNumber = PolicyCenter_Resuables.infoBar("RewriteNumber");

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
        Thread.sleep(3000);
        CA_Quote.quoteDetails();
        CA_Quote.policyPremium();
        PolicyCenter_Resuables.clickButton("Issue Policy for Rewrite New Term Bound");

    }

    @Test
    public void AUT_PC_CA_ReminderOfTheTerm() throws Throwable {

    }
    @Test
    public void AUT_PC_CA_WithdrawTransaction() throws Throwable {

    }
    @Test
    public void AUT_PC_CA_Rewrite_Quote_MultiVersion() throws Throwable {

    }
    @Test
    public void AUT_PC_CA_Rewrite_Quote_SideBySide() throws Throwable {

    }

}
