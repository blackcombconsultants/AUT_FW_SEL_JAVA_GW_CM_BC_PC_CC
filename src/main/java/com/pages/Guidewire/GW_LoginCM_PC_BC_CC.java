package com.pages.Guidewire;

import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.Selenium.Selenium_Reporting_Utils;
import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.codoid.products.exception.FilloException;

public class GW_LoginCM_PC_BC_CC extends SeleniumWebDriver_Commands implements GW_LoginCM_PC_BC_CC_PO {

	public GW_LoginCM_PC_BC_CC(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

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
		return getElement(Login);
	}

	@Override
	public WebElement getpassword_PolicyCenter(By weValue) {
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
		login_Guidewire();

	}

	@Override
	public void login_ContactManagement() {
		login_Guidewire();

	}

	@Override
	public void login_BillingCenter() {

		login_Guidewire();

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
		logout_Guidewire();

	}

	@Override
	public void logout_PolicyCenter() {
		logout_Guidewire();
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
		login_Guidewire();
	}

	@Override
	public void logout_ClaimsCenter() {
		logout_Guidewire();
	}

	public void login_Guidewire() {

		try {
			LinkedHashMap<String, String> lhm_Data = getDataFromSheet_Fillo("Login", "SuperUser");

			GuidewireAutomate("Username", Username, "sendkeys", lhm_Data.get("TD_UserName"));
			GuidewireAutomate("Password", Password, "sendkeys", lhm_Data.get("TD_Password"));
			// GuidewireAutomate("Password", Password, "sendkeys", new
			// String(Base64.getEncoder().encode(lhm_Data.get("TD_Password").getBytes())));
			GuidewireAutomate("Login", Login, "click", "Null");

			oExtentTest.log(Status.PASS, "Login into Billing center is succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));
			// oExtentTest.info((Markup)
			// MediaEntityBuilder.createScreenCaptureFromPath(GW_Utils_Log.getScreenShoFt(driver)));
			// oExtentTest.log(LogStatus.PASS,
			// oExtentTest.addScreenCapture(getscreenshot(driver, Driver.strReportPath)));

		} catch (FilloException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void logout_Guidewire() {
		try {
			GuidewireAutomate("Setting", Setting, "click", "Null");
			GuidewireAutomate("Logout", Logout, "click", "Null");

			oExtentTest.log(Status.PASS, "Login into Billing center is succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
