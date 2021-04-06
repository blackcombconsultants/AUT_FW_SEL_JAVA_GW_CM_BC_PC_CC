package com.pages.Guidewire;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class GW_MenuNavigation_CM_PC_BC_CC extends SeleniumWebDriver_Commands
		implements GW_MenuNavigation_CM_PC_BC_CC_PO {

	public GW_MenuNavigation_CM_PC_BC_CC(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public void navigate_AccountTab_NewAccount() {
		GuidewireAutomate("Tab_Account", Tab_Account, "click", "Null");
		GuidewireAutomate("AccountTab_NewAccount", AccountTab_NewAccount, "click", "Null");
	}

	public void navigate_AccountTab_AccountNumberSearch(String strValue) {
		GuidewireAutomate("Tab_Account", Tab_Account, "click", "Null");
		GuidewireAutomate("AccountTab_AccountNumber", AccountTab_AccountNumber, "sendkeys", strValue);
		GuidewireAutomate("AccountTab_AccountNumberSearch", AccountTab_AccountNumberSearch, "click", "Null");
	}
	

	/*
	 * -------------------------------------------------------------- menuNavigation
	 * --------------------------------------------------------------
	 */

	@Override
	public void gwContactManagement_MenuNavigation(String strMenuOption) {
		switch (strMenuOption) {

		case "x":
			break;

		case "y":
			break;

		case "z":
			break;

		default:
			break;
		}
	}

	@Override
	public void gwPolicyCenter_MenuNavigation(String strMenuOption) {
		switch (strMenuOption) {
		case "NewAccount":
			navigate_AccountTab_NewAccount();
			break;
		case "AccountNumberSearch":
			navigate_AccountTab_AccountNumberSearch(strMenuOption);
			break;
		default:
			break;
		}
	}

	@Override
	public void gwBillingCenter_MenuNavigation(String strMenuOption) {

		try {

			switch (strMenuOption) {

			case "NewAccount":
				navigate_AccountTab_NewAccount();
				break;
			case "AccountNumberSearch":
				navigate_AccountTab_AccountNumberSearch(strMenuOption);
				break;
			default:
				break;
			}

			oExtentTest.addScreenCaptureFromPath(
					SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		} catch (Exception e) {
			e.printStackTrace();
		}
		oExtentTest.log(Status.INFO, "Navigation to New Account is succesful");

	}

	@Override
	public void gwClaimsCenter_MenuNavigation(String strMenuOption) {
		switch (strMenuOption) {

		case "x":
			break;

		case "y":
			break;

		case "z":
			break;

		default:
			break;
		}
	}

}
