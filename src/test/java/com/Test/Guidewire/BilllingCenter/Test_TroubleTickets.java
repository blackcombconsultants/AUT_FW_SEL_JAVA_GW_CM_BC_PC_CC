package com.Test.Guidewire.BilllingCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.BillingCenter.BC_AccountSummary;
import com.pages.Guidewire.BillingCenter.BC_Invoices;
import com.pages.Guidewire.BillingCenter.BC_Resuables;
import com.pages.Guidewire.BillingCenter.BC_TroubleTickets;

public class Test_TroubleTickets extends GW_GetDriver {

	@Test
	public void AUT_TroubleTickets() throws Throwable {

		BC_Resuables.login_BillingCenter_User("SuperUser");

		BC_Resuables.bcTabNavigation_Acct_Search();
		BC_AccountSummary.AccountSummary();
		BC_Resuables.bcMenuNavigation("Invoices");
		BC_Invoices.Invoices_Verify();
		// BC_Resuables.Tab_Bar("Desktop");
		BC_Resuables.bcMenuNavigation("My Trouble Tickets");
		Thread.sleep(2000);
		BC_TroubleTickets.MyTroubleTickets();
		BC_TroubleTickets.TroubleTicketWizard1();
		BC_Resuables.clickButton("Next");
		BC_TroubleTickets.TroubleTicketWizard2();
		BC_Resuables.clickButton("Next");
		BC_TroubleTickets.TroubleTicketWizard3();
		BC_Resuables.clickButton("Next");
		Thread.sleep(2000);
		BC_Resuables.clickButton("Next");
		BC_Resuables.clickButton("Finish");

		BC_Resuables.logout_BillingCenter();

	}

}
