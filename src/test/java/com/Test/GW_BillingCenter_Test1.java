package com.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pages.Sandbox.*;

public class GW_BillingCenter_Test1 extends GW_Base {
	WebDriver driver;
	String url;

	@BeforeTest
	public void setUp() throws Exception {

		File oFile = new File(pUserdir + pConfigproperties);
		FileInputStream oFIS = new FileInputStream(oFile);

		Properties oProperties = new Properties();
		oProperties.load(oFIS);
		String StrBrowser = oProperties.getProperty("Browser").toUpperCase();

		driver = getDriver();

		String strAut_Demo = oProperties.getProperty("Aut_Demo");

		switch (strAut_Demo) {
		case "BillingCenter":
			url = oProperties.getProperty("URL_BillingCenter");
			break;
		case "PolicyCenter":
			url = oProperties.getProperty("PolicyCenter");
			break;
		case "y":
		case "z":

		default:
			url = oProperties.getProperty("URL_BillingCenter");
			break;
		}

		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		oWebDriverWait = new WebDriverWait(driver, 20);

	}

	@Test
	public void BillingTest() throws Exception {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentReports);
		oExtentTest.addScreenCaptureFromBase64String("login");

		GW_BillingCenter_Resuables gwPC = new GW_BillingCenter_Resuables(driver, oExtentReports);
		GW_MenuNavigation_CM_PC_BC_CC mn = new GW_MenuNavigation_CM_PC_BC_CC(driver, oExtentReports);

		// ------> login_PolicyCenter
		lg.login_BillingCenter();
		oExtentTest.log(Status.PASS, "Login into Billing center is succesful");
		oExtentTest.addScreenCaptureFromBase64String("login");

		// ------> navigate to new account
		mn.gwBillingCenter_MenuNavigation("Account");
		oExtentTest.log(Status.INFO, "Navigation to New Account is succesful");

		// ------> New Account
		gwPC.bc_NewAccount();
		oExtentTest.log(Status.INFO, "New Account creation is succesful" + strAccountNumber);

		// ------> Verifying the page -
		Assert.assertEquals(gwPC.getHeader_AccountSummary(), "Account Summary");
		oExtentTest.log(Status.PASS, "Expectd = " + gwPC.getHeader_AccountSummary() + " Actual = " + "Account Summary");

		// ------> New Policy
		gwPC.bc_NewPolicy_PolicyIssuanceWizard_Step1();
		oExtentTest.log(Status.INFO, "PolicyIssuanceWizard_Step1 is succesful");

		// ------> Verifying the page -
		gwPC.bc_NewPolicy_PolicyIssuanceWizard_Step2();
		oExtentTest.log(Status.INFO, "NewPolicy_PolicyIssuanceWizard_Step2 is succesful");

		// ------> Verifying the bc_AccountSummary -
		gwPC.bc_AccountSummary();
		oExtentTest.log(Status.INFO, "AccountSummary is succesful");

		// ------> bc_AccountSummary_Invoices
		gwPC.bc_AccountSummary_Invoices();
		oExtentTest.log(Status.INFO, "Invoices verification is succesful");

		// ------> logout_BillingCenter
		lg.logout_BillingCenter();
		oExtentTest.log(Status.INFO, "logout BillingCenter is succesful");

	}

	@AfterTest
	public void Closure() {
		driver.quit();
	}

}
