package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;

public class GW_PC_AccountSummary extends SeleniumWebDriver_Commands implements GW_PC_AccountSummary_PO {

	public GW_PC_AccountSummary(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}


	@Override
	public void AccountSummary_Actions_NewSubmission() throws Throwable {
		GW_TabNavigation_CM_PC_BC_CC tab = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		tab.gwPolicyCenter_MenuNavigation("NewSubmission");

	}

	@Override
	public void Detail_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void Details_Edit() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void AccountSummary_AccountHolderSummary() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void AccountSummary_AccountHolderSummary_Edit() throws Throwable {
		// TODO Auto-generated method stub

	}

}
