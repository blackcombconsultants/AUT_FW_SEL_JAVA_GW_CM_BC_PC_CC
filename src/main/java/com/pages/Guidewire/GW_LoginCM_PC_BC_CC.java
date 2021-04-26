package com.pages.Guidewire;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Reporting_Utils;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class GW_LoginCM_PC_BC_CC extends SeleniumWebDriver_Commands implements GW_LoginCM_PC_BC_CC_PO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public GW_LoginCM_PC_BC_CC(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public void login_Guidewire() throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("login", strTestCaseName);

		GuidewireAutomate("Username", GW_Username, "sendkeys", lhm_TestCase_Table_Data.get("GW_Username"));
		GuidewireAutomate("Password", GW_Password, "sendkeys", lhm_TestCase_Table_Data.get("GW_Password"));
		// GuidewireAutomate("Password", Password, "sendkeys", new
		// String(Base64.getEncoder().encode(lhm_Data.get("TD_Password").getBytes())));
		GuidewireAutomate("Login", GW_Login_Button, "click", lhm_TestCase_Table_Data.get("GW_Login_Button"));

		oExtentTest.log(Status.PASS, "Login succesful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));
		// oExtentTest.info((Markup)
		// MediaEntityBuilder.createScreenCaptureFromPath(GW_Utils_Log.getScreenShoFt(driver)));
		// oExtentTest.log(LogStatus.PASS,
		// oExtentTest.addScreenCapture(getscreenshot(driver, Driver.strReportPath)));

	}

	public void logout_Guidewire() throws Throwable {
		GuidewireAutomate("Setting", GW_Setting_Link, "click", "Null");
		GuidewireAutomate("Logout", GW_Logout_Link, "click", "Null");

		oExtentTest.log(Status.PASS, "Logout is succesful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));

	}

	@Override
	public void login_BillingCenter() throws Throwable {
		login_Guidewire();

	}

	@Override
	public void logout_BillingCenter() throws Throwable {
		logout_Guidewire();

	}

	@Override
	public void login_PolicyCenter() throws Throwable {
		login_Guidewire();

	}

	@Override
	public void logout_PolicyCenter() throws Throwable {
		logout_Guidewire();

	}

	@Override
	public void login_ClaimsCenter() throws Throwable {
		login_Guidewire();

	}

	@Override
	public void logout_ClaimsCenter() throws Throwable {
		logout_Guidewire();

	}

}
