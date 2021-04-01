package com.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pages.Sandbox.GW_Base;
import com.pages.Sandbox.GW_BillingCenter_Resuables;
import com.pages.Sandbox.GW_LoginCM_PC_BC_CC;
import com.pages.Sandbox.GW_MenuNavigation_CM_PC_BC_CC;
import com.pages.Sandbox.GW_Utils_Log;

public class GW_BillingCenter_Test1 extends GW_Base {
	WebDriver driver;

	@Test
	public void BillingTest() throws Exception {

		try {

			driver = getDriver();
			

			GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
			GW_BillingCenter_Resuables gwPC = new GW_BillingCenter_Resuables(driver, oExtentTest);
			GW_MenuNavigation_CM_PC_BC_CC mn = new GW_MenuNavigation_CM_PC_BC_CC(driver, oExtentTest);

			// ------> login_PolicyCenter
			lg.login_BillingCenter();


			// ------> navigate to new account
			mn.gwBillingCenter_MenuNavigation("Account");
			oExtentTest.addScreenCaptureFromPath(GW_Utils_Log.getScreenShoFt(driver));			
			oExtentTest.log(Status.INFO, "Navigation to New Account is succesful");

			// ------> New Account
			gwPC.bc_NewAccount();

			// ------> Verifying the page -
			Assert.assertEquals(gwPC.getHeader_AccountSummary(), "Account Summary");
			oExtentTest.addScreenCaptureFromPath(GW_Utils_Log.getScreenShoFt(driver));			
			oExtentTest.log(Status.PASS,
					"Expectd = " + gwPC.getHeader_AccountSummary() + " Actual = " + "Account Summary");

			// ------> New Policy
			gwPC.bc_NewPolicy_PolicyIssuanceWizard_Step1();
			oExtentTest.addScreenCaptureFromPath(GW_Utils_Log.getScreenShoFt(driver));			
			oExtentTest.log(Status.INFO, "PolicyIssuanceWizard_Step1 is succesful");

			// ------> Verifying the page -
			gwPC.bc_NewPolicy_PolicyIssuanceWizard_Step2();
			oExtentTest.addScreenCaptureFromPath(GW_Utils_Log.getScreenShoFt(driver));			
			oExtentTest.log(Status.INFO, "NewPolicy_PolicyIssuanceWizard_Step2 is succesful");

			// ------> Verifying the bc_AccountSummary -
			gwPC.bc_AccountSummary();
			oExtentTest.addScreenCaptureFromPath(GW_Utils_Log.getScreenShoFt(driver));			
			oExtentTest.log(Status.INFO, "AccountSummary is succesful");

			// ------> bc_AccountSummary_Invoices
			gwPC.bc_AccountSummary_Invoices();
			oExtentTest.addScreenCaptureFromPath(GW_Utils_Log.getScreenShoFt(driver));
			
			oExtentTest.log(Status.INFO, "Invoices verification is succesful");

			// ------> logout_BillingCenter
			lg.logout_BillingCenter();
			oExtentTest.log(Status.INFO, "logout BillingCenter is succesful");

			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
