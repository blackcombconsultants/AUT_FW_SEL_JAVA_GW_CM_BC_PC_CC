package com.pages.Guidewire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class GW_MenuNavigation_CM_PC_BC_CC extends SeleniumWebDriver_Commands
		implements GW_MenuNavigation_CM_PC_BC_CC_PO {

	public GW_MenuNavigation_CM_PC_BC_CC(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void click_Menu_Desktop(By Menu_Desktop) {
		gwAutomate(GW_MenuNavigation_CM_PC_BC_CC.Menu_Desktop, "click", "Null");

	}

	@Override
	public void click_SuBMenu_Desktop_Summary(By SuBMenu_Desktop_Summary) {
		gwAutomate(GW_MenuNavigation_CM_PC_BC_CC.SuBMenu_Desktop_Summary, "click", "Null");

	}

	@Override
	public void click_Menu_Account(By Menu_Account) {
		gwAutomate(GW_MenuNavigation_CM_PC_BC_CC.Menu_Account, "click", "Null");

	}

	@Override
	public void click_SubMenu_Account_Newaccount(By SubMenu_Account_Newaccount) {
		gwAutomate(GW_MenuNavigation_CM_PC_BC_CC.SubMenu_Account_Newaccount, "click", "Null");

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
			gwAutomate(Menu_Account, "click", "Null");
			gwAutomate(SubMenu_Account_Newaccount, "click", "Null");
			break;
		case "x":
		case "y":
		case "z":

		default:
			break;
		}
	}

	@Override
	public void gwBillingCenter_MenuNavigation(String strMenuOption) {

		try {

			switch (strMenuOption) {

			case "x":
			case "Account":
				GuidewireAutomate("Menu_Account", Menu_AccountBC, "click", "Null");
				break;
			case "y":
				break;

			case "z":
				break;

			default:
				break;
			}

			oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
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
