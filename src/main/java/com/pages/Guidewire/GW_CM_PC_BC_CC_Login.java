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
		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("login", strTestCaseName);

			GuidewireAutomate("Username", GW_Username, "sendKeys", lhm_TestCase_Table_Data.get("GW_Username"));
			GuidewireAutomate("Password", GW_Password, "sendKeys", lhm_TestCase_Table_Data.get("GW_Password"));
			// GuidewireAutomate("Password", Password, "sendKeys", new
			// String(Base64.getEncoder().encode(lhm_Data.get("TD_Password").getBytes())));
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

			GuidewireAutomate("Login", GW_Login_Button, "clickAndwait", "click");

			oExtentTest.log(Status.PASS, "Login succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void login_Guidewire_User(String strUser) throws Throwable {
		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("login", strUser);

			GuidewireAutomate("Username", GW_Username, "sendKeys", lhm_TestCase_Table_Data.get("GW_Username"));
			GuidewireAutomate("Password", GW_Password, "sendKeys", lhm_TestCase_Table_Data.get("GW_Password"));
			// GuidewireAutomate("Password", Password, "sendKeys", new
			// String(Base64.getEncoder().encode(lhm_Data.get("TD_Password").getBytes())));
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

			GuidewireAutomate("Login", GW_Login_Button, "clickAndwait", "click");

			oExtentTest.log(Status.PASS, "Login succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void logout_Guidewire() throws Throwable {
		try {
			getStaleElement("Setting", GW_Setting_Link);
			GuidewireAutomate("Setting", GW_Setting_Link, "clickAndwait", "click");
			GuidewireAutomate("Logout", GW_Logout_Link, "clickAndwait", "click");

			oExtentTest.log(Status.PASS, "Logout is succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void login_PolicyCenter() throws Throwable {
		login_Guidewire();
	}

	public static void login_PolicyCenter_User(String strUser) throws Throwable {
		login_Guidewire_User(strUser);
	}

	public static void logout_PolicyCenter() throws Throwable {
		logout_Guidewire();
	}

}
