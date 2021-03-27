package com.pages.Sandbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuNavigation extends WebDriverUtils implements IMenuNavigation {

	public MenuNavigation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void click_Menu_Desktop(By Menu_Desktop) {
		gwAutomate(MenuNavigation.Menu_Desktop, "click", "Null");

	}

	@Override
	public void click_SuBMenu_Desktop_Summary(By SuBMenu_Desktop_Summary) {
		gwAutomate(MenuNavigation.SuBMenu_Desktop_Summary, "click", "Null");

	}

	@Override
	public void click_Menu_Account(By Menu_Account) {
		gwAutomate(MenuNavigation.Menu_Account, "click", "Null");

	}

	@Override
	public void click_SubMenu_Account_Newaccount(By SubMenu_Account_Newaccount) {
		gwAutomate(MenuNavigation.SubMenu_Account_Newaccount, "click", "Null");

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
		switch (strMenuOption) {

		case "x":
		case "NewAccount":
			gwAutomate(Menu_AccountBC, "click", "Null");
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
