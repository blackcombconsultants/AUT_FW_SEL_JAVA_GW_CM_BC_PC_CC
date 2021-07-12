package com.pages.Guidewire;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Reporting_Utils;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class GW_CM_PC_BC_CC_Login extends SeleniumWebDriver_Commands implements GW_CM_PC_BC_CC_Login_PO {

	public GW_CM_PC_BC_CC_Login(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void login_Guidewire() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("login", strTestCaseName);

		GuidewireAutomate("Username", GW_Username, "sendKeys", lhm_TestCase_Table_Data.get("GW_Username"));
		GuidewireAutomate("Password", GW_Password, "sendKeys", lhm_TestCase_Table_Data.get("GW_Password"));
		// GuidewireAutomate("Password", Password, "sendKeys", new
		// String(Base64.getEncoder().encode(lhm_Data.get("TD_Password").getBytes())));
		GuidewireAutomate("Login", GW_Login_Button, "click", lhm_TestCase_Table_Data.get("GW_Login_Button"));

		oExtentTest.log(Status.PASS, "Login succesful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));

	}

	public static void logout_Guidewire() throws Throwable {
		GuidewireAutomate("Setting", GW_Setting_Link, "click", "Null");
		GuidewireAutomate("Logout", GW_Logout_Link, "click", "Null");

		oExtentTest.log(Status.PASS, "Logout is succesful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));

	}

	public static void login_BillingCenter() throws Throwable {
		login_Guidewire();

	}

	public static void logout_BillingCenter() throws Throwable {
		GuidewireAutomate("Setting", GW_Setting_Link, "click", "Null");
		GuidewireAutomate("Logout", GW_Logout_Link, "click", "Null");
		// GuidewireAutomate_Handle("alertaccept", "NA");

		oExtentTest.log(Status.PASS, "Logout is succesful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));
	}

	public static void login_PolicyCenter() throws Throwable {
		login_Guidewire();

	}

	public static void logout_PolicyCenter() throws Throwable {
		logout_Guidewire();

	}

	public static void login_ClaimsCenter() throws Throwable {
		login_Guidewire();

	}

	public static void logout_ClaimsCenter() throws Throwable {
		logout_Guidewire();

	}

	public static void login_Guidewire_Userx(String strTestCaseName) throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("login", strTestCaseName);

		GuidewireAutomate("Username", GW_Username, "sendKeys", lhm_TestCase_Table_Data.get("GW_Username"));
		GuidewireAutomate("Password", GW_Password, "sendKeys", lhm_TestCase_Table_Data.get("GW_Password"));
		// GuidewireAutomate("Password", Password, "sendKeys", new
		// String(Base64.getEncoder().encode(lhm_Data.get("TD_Password").getBytes())));
		GuidewireAutomate("Login", GW_Login_Button, "click", lhm_TestCase_Table_Data.get("GW_Login_Button"));

		oExtentTest.log(Status.PASS, "Login succesful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));

	}

}
