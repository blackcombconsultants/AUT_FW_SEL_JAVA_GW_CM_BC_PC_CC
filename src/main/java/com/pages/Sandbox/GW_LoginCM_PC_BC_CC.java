package com.pages.Sandbox;

import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.codoid.products.exception.FilloException;

public class GW_LoginCM_PC_BC_CC extends GW_Utils_SeleniumWebDriver implements GW_LoginCM_PC_BC_CC_PO {
	public GW_LoginCM_PC_BC_CC(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	WebDriver driver;

	public WebElement getUserName() {
		return getElement(Username);
	}

	public WebElement getPassword() {
		return getElement(Password);
	}

	public WebElement getLogin() {
		return getElement(Login);
	}

	@Override
	public WebElement getUsername_PolicyCenter(By weValue) {
		// TODO Auto-generated method stub
		return getElement(Login);
	}

	@Override
	public WebElement getpassword_PolicyCenter(By weValue) {
		// TODO Auto-generated method stub
		return getElement(Password);
	}

	@Override
	public void setUsername_PolicyCenter(By weValue, String strValue) {
		gwAutomate(Username, "sendkeys", "su");

	}

	@Override
	public void setpassword_PolicyCenter(By weValue, String strValue) {
		gwAutomate(Password, "sendkeys", "gw");

	}

	@Override
	public void clickLogin_PolicyCenter(By weValue) {
		gwAutomate(Login, "click", "Null");

	}

	@Override
	public void login_PolicyCenter() {
		gwAutomate(Username, "sendkeys", "su");
		gwAutomate(Password, "sendkeys", "gw");
		gwAutomate(Login, "click", "Null");
	}

	public void mLoginPolicyCenter2() {
		getUserName().sendKeys("su");
		getPassword().sendKeys("gw");
		getLogin().click();

	}

	public void mLoginPolicyCenter1() {
		sendkeys_Element(Username, "su");
		sendkeys_Element(Password, "gw");
		click_Element(Login);

	}

	public void mLoginPolicyCenter3() {
		gwAutomate(Username, "sendkeys", "su");
		gwAutomate(Password, "sendkeys", "gw");
		gwAutomate(Login, "click", "Null");

	}

	@Override
	public void login_ContactManagement() {
		gwAutomate(Username, "sendkeys", "su");
		gwAutomate(Password, "sendkeys", "gw");
		gwAutomate(Login, "click", "Null");
	}

	@Override
	public void login_BillingCenter() {

		try {
			LinkedHashMap<String, String> lhm_Data = getDataFromSheet_Fillo("Login", "SuperUser");

			gwAutomate(Username, "sendkeys", lhm_Data.get("TD_UserName"));
			gwAutomate(Password, "sendkeys", lhm_Data.get("TD_Password"));
			gwAutomate(Login, "click", "Null");
		} catch (FilloException e) {
			e.printStackTrace();
		}

	}

	@Override
	public WebElement getUsername_ContactManagement(WebElement weValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement getpassword_ContactManagement(WebElement weValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUsername_ContactManagement(WebElement weValue, String strValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setpassword_ContactManagement(WebElement weValue, String strValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickLogin_ContactManagement(WebElement weValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void logout_ContactManagement() {
		// TODO Auto-generated method stub

	}

	@Override
	public WebElement getUsername_BillingCenter(WebElement weValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement getpassword_BillingCenter(WebElement weValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUsername_BillingCenter(WebElement weValue, String strValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setpassword_BillingCenter(WebElement weValue, String strValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickLogin_BillingCenter(WebElement weValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void logout_BillingCenter() {
		try {
			gwAutomate(Setting, "click", "Null");
			gwAutomate(Logout, "click", "Null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void logout_PolicyCenter() {
		try {
			gwAutomate(Setting, "click", "Null");
			gwAutomate(Logout, "click", "Null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public WebElement getUsername_ClaimsCenter(WebElement weValue) {
		return getElement(Username);
	}

	@Override
	public WebElement getpassword_ClaimsCenter(WebElement weValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUsername_ClaimsCenter(WebElement weValue, String strValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setpassword_ClaimsCenter(WebElement weValue, String strValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickLogin_ClaimsCenter(WebElement weValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void login_ClaimsCenter() {
		System.out.println("Username");
		gwAutomate(Username, "sendkeys", "su");
		gwAutomate(Password, "sendkeys", "gw");
		gwAutomate(Login, "click", "Null");
	}

	@Override
	public void logout_ClaimsCenter() {
		try {
			gwAutomate(Setting, "click", "Null");
			gwAutomate(Logout, "click", "Null");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
