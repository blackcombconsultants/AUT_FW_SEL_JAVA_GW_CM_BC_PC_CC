package com.Test.Guidewire.BilllingCenter;

import com.pages.Guidewire.BillingCenter.*;
import org.testng.annotations.Test;

public class Smoke_test {

    @Test
    public void Smoke_Test1() throws Throwable {

        BC_Resuables.login_BillingCenter_User("SuperUser");

        BC_Resuables.bcTabNavigation_Acct_Search();
        BC_AccountSummary.AccountSummary();
        BC_Resuables.bcMenuNavigation("Details");
        BC_AccountDetails.AD_AccountBasics_Verify();
        BC_AccountDetails.AD_AccountTotals_Verify();
        BC_Resuables.bcMenuNavigation("Contacts");
        BC_Contacts.C_ContactInfo_Verify();
        BC_Contacts.C_ContactInfo_Edit();
        BC_Resuables.clickButton("Update");
        BC_Resuables.bcMenuNavigation("New Direct Bill Payment");
        BC_Payments.DirectBillPayments();
        BC_Resuables.bcMenuNavigation("Summary");
        Thread.sleep(1000);
        BC_AccountSummary.AccountSummary_Financials();
        BC_Resuables.logout_BillingCenter();
    }
}
