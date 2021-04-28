package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class GW_PC_PolicySummary extends SeleniumWebDriver_Commands implements GW_PC_PolicySummary_PO {

	public GW_PC_PolicySummary(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void Detail_Verify() throws Throwable {

	}

	@Override
	public void new_Transaction(String type) throws Throwable {

		switch (type) {
		case "Issue Policy":
			break;

		case "Cancel Policy":
			break;

		default:
			break;
		}
	}

	@Override
	public void Account_Verify() throws Throwable {

	}

}
