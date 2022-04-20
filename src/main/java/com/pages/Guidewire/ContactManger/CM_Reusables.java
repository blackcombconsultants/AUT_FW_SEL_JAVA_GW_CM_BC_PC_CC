package com.pages.Guidewire.ContactManger;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Reporting_Utils;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CM_Reusables extends SeleniumWebDriver_Commands {

	public CM_Reusables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	/*
	 * 
	 */
	private static By GW_Username     = By.xpath("//input[contains(@name,'LoginDV-username')]");
	private static By GW_Password     = By.xpath("//input[contains(@name,'LoginDV-password')]");
	private static By GW_Login_Button = By.xpath("//div[@id='Login-LoginScreen-LoginDV-submit']//div");

	/*
	 * 
	 */
	private static By GW_ToolBar_Link = By.id("TabBar-UnsavedWorkTabBarLink");
	private static By GW_Setting_Link = By.id("gw-TabBarWidget--settings");
	private static By GW_Logout_Link  = By.id("TabBar-LogoutTabBarLink");

	/*
	 * ------------------------------------------------------------------------- ---- ContactManager Tabs
	 * ------------------------------------------------------------------------- ----
	 */

	/*
	 * 
	 * Desktop Tab
	 */
	private static By Menu_ActionsCC = By.xpath("//div[contains(@id,'MenuActions')]/div[@role='button']");
	private static By AdminAction    = By.xpath("//div[contains(@id,'MenuActions')]//div[@class='gw-label gw-hasIcon']");

	private static By TabCC_Desktop                             = By.xpath("//div[@id='TabBar-DesktopTab']//div[@class='gw-label']");
	private static By TabCC_Desktop_dd                          = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	private static By TabCC_Desktop_Activities                  = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopActivities']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_Claims                      = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopClaims']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_NewClaims                   = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopNewClaims_Ext']//div[@role='menuitem']");
	private static By TabCC_Desktop_Exposures                   = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopExposures']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_Subrogations                = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopSubrogations']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_PendingAssignments          = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopAwaitingAssignment']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_Queues                      = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopQueuedActivities']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_Calendar                    = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopCalendarGroup']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_Calendar_MyCalendar         = By.xpath("//div[contains(@id,'DesktopCalendarGroup_Calendar')]//div[@class='gw-action--inner gw-hasDivider']");
	private static By TabCC_Desktop_Calendar_SupervisorCalendar = By.xpath("//div[contains(@id,'DesktopCalendarGroup_SupervisorCalendar')]//div[@class='gw-action--inner gw-hasDivider']");
	private static By TabCC_Desktop_BulkInvoices                = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_BulkPay']//div[@class='gw-label gw-hasIcon']");

	private static By MenuCC_Desktop_Actions_Statistics     = By.xpath("//div[@id='Desktop-DesktopMenuActions-DesktopMenuActions_Statistics']//div[@class='gw-label']");
	private static By MenuCC_Desktop_Actions_Preferences    = By.xpath("//div[@id='Desktop-DesktopMenuActions-DesktopMenuActions_Preferences']//div[@class='gw-label']");
	private static By MenuCC_Desktop_Actions_VacationStatus = By.xpath("//div[@id='Desktop-DesktopMenuActions-DesktopMenuActions_UserVacation']//div[@class='gw-label']");
	private static By MenuCC_Desktop_BulkInvoices           = By.xpath("//div[@id='Desktop-MenuLinks-Desktop_BulkPay']");

	/*
	 * AdministrationTab Tab - SubMenu
	 */
	private static By TabCC_Administration                    = By.xpath("//div[@id='TabBar-AdminTab']/div[@role='menuitem']");
	private static By TabCC_Adminsitration_dd                 = By.xpath("//div[@id='TabBar-AdminTab']//div[@class='gw-action--expand-button']");
	private static By TabCC_Adminsitration_PrintUserGroupTree = By.xpath("//div[@id='TabBar-AdminTab-AdminTab_PrintUserGroupTree']//div[@role='menuitem']");

	private static By MenuCC_Administration_UsersAndSecurity       = By.xpath("//div[@id='Admin-MenuLinks-Admin_UsersAndSecurity']//div[@class='gw-action--expand-button']");
	private static By MenuCC_UserAndSecurity_Users                 = By.xpath("//div[contains(@id,'UsersAndSecurity_AdminUserSearchPage')]//div[@role='menuitem']");
	private static By MenuCC_UserAndSecurity_Groups                = By.xpath("//div[contains(@id,'UsersAndSecurity_AdminGroupSearchPage')]//div[@role='menuitem']");
	private static By MenuCC_UserAndSecurity_Roles                 = By.xpath("//div[contains(@id,'UsersAndSecurity_Roles')]//div[@role='menuitem']");
	private static By MenuCC_UserAndSecurity_Regions               = By.xpath("//div[contains(@id,'UsersAndSecurity_Regions')]//div[@role='menuitem']");
	private static By MenuCC_UserAndSecurity_SecurityZones         = By.xpath("//div[contains(@id,'UsersAndSecurity_SecurityZones')]//div[@role='menuitem']");
	private static By MenuCC_UserAndSecurity_AuthorityLimitProfile = By.xpath("//div[contains(@id,'UsersAndSecurity_AuthorityLimitProfiles')]//div[@role='menuitem']");
	private static By MenuCC_UserAndSecurity_Attributes            = By.xpath("//div[contains(@id,'UsersAndSecurity_Attributes')]//div[@role='menuitem']");

	// Special Handling
	private static By MenuCC_Administration_SpecialHandling = By.xpath("//div[@id='TabBar-AdminTab-Admin_Monitoring']/div[@class='gw-action--expand-button']");
	private static By MenuCC_SpecialHandling_Accounts       = By.xpath("//div[contains(@id,'SpecialHandling_AccountAdmin')]/div[@role='menuitem']");
	private static By MenuCC_SpecialHandling_ServiceTiers   = By.xpath("//div[contains(@id,'SpecialHandling_CustomerServiceTierAdmin')]/div[@role='menuitem']");

	// Business Settings
	private static By MenuCC_Administration_BusinessSettings = By.xpath("//div[contains(@id,'Admin-MenuLinks-Admin_BusinessSettings')]//div[@class='gw-label' and text()='Business Settings']");
	private static By MenuCC_BusinessSettings_Expand         = By.xpath("//div[@id='Admin-MenuLinks-Admin_BusinessSettings']/div[@class='gw-action--expand-button']");
	private static By MenuCC_BusinessSetting_BusinessRules   = By.xpath("//div[contains(@id,'BusinessSettings_BusinessRules')]//div[@role='menuitem']//div[@class='gw-label' and text()='Business Rules']");

	// Monitoring
	private static By MenuCC_Administration_Monitoring = By.xpath("//div[@id='TabBar-AdminTab-Admin_Monitoring']/div[@class='gw-action--expand-button']");
	/* Monitoring SubMenu */
	private static By MenuCC_Monitoring_MessageQueues       = By.xpath("//div[contains(@id,'MessagingDestinationControlList')]/div[@role='menuitem']");
	private static By MenuCC_Monitoring_WorkFlows           = By.xpath("//div[contains(@id,'WorkflowSearch')]/div[@role='menuitem']");
	private static By MenuCC_Monitoring_WorkFlowsStatistics = By.xpath("//div[contains(@id,'WorkflowStats')]/div[@role='menuitem']");

	// Utilities
	private static By MenuCC_Administration_Utilities = By.xpath("//div[@id='TabBar-AdminTab-Admin_Utilities']/div[@class='gw-action--expand-button']");
	/* Utilities SubMenu */
	private static By MenuCC_Utilities_ImportData        = By.xpath("//div[contains(@id,'Utilities_ImportWizard')]/div[@role='menuitem']");
	private static By MenuCC_Utilities_ExportData        = By.xpath("//div[contains(@id,'Utilities_ExportData')]/div[@role='menuitem']");
	private static By MenuCC_Utilities_ScriptParameters  = By.xpath("//div[contains(@id,'Utilities_ScriptParametersPage')]/div[@role='menuitem']");
	private static By MenuCC_Utilities_DataChange        = By.xpath("//div[contains(@id,'Utilities_DataChangePage')]/div[@role='menuitem']");
	private static By MenuCC_Utilities_InboundFiles      = By.xpath("//div[contains(@id,'Utilities_InboundFileSearch')]/div[@role='menuitem']");
	private static By MenuCC_Utilities_OutboundFiles     = By.xpath("//div[contains(@id,'Utilities_OutboundFileSearch')]/div[@role='menuitem']");
	private static By MenuCC_Utilities_RuntimeProperties = By.xpath("//div[contains(@id,'Utilities_Properties')]/div[@role='menuitem']");

	/*
	 * Headers
	 */

	private static By Summary_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Summary']");

	/*
	 * 
	 */

	private static By Next          = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Next']");
	private static By Finish        = By.xpath("//div[contains(@id,'Finish')]//div[@role='button']");
	private static By Finish_Button = By.xpath("//div[@id='FNOLWizard-Finish']/div[@role='button']");
	static By         OK            = By.xpath("//div[contains(@id,'Update')]//div[@role='button']");
	private static By Update        = By.xpath("//div[contains(@id,'CustomUpdateButton')]/div[@role='button']");
	private static By Update_Button = By.xpath("//div[contains(@id,'Update')]//div[@role='button']");
	private static By Cancel_Button = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Cancel']");
	private static By Back_Button   = By.xpath("//div[@id='FNOLWizard-Prev']/div[@role='button']");
	private static By Save_Button   = By.xpath("//div[contains(@id,'Update')]/div[@role='button']");
	private static By Edit_Button   = By.xpath("//div[contains(@id,'Screen-Edit')]//div[@role='button']");

	// validate Error Message
	private static By ValidationResults_Header         = By.xpath("//div[contains(@id,'wsTabBar')]//div[@class='gw-label' and text()='Validation Results']");
	private static By ValidationResults_WarningTitle   = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[text()='Warnings:']");
	private static By ValidationResults_Warning_First  = By
			.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-0')]//div[@class='gw-message' and contains(text(),'Validation errors were found in an object of type ReserveSet that was auto-created by rules:')]");
	private static By ValidationResults_Warning_Second = By
			.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-1')]//div[@class='gw-message' and contains(text(),'Validation errors were found in an object of type ReserveSet that was auto-created by rules:')]");
	private static By ValidationResults_ClearButton    = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");

	private static By Validation_Results = By.xpath("//div[@id='wsTabBar-wsTab_0']//div[@role='tab']");
	private static By Error_Msg          = By.xpath("//div[@id='WebMessageWorksheet-WebMessageWorksheetScreen-grpMsgs-0-0']");

	private static By Nodatatodisplay = By.xpath("//div[@class='gw-ListView--empty-info-row']/div[text()='No data to display']");

	/*
	 * 
	 * 
	 * 
	 * 
	 */

	public static LinkedHashMap<String, String> getData_ContactManager(String strTable) throws Throwable {

		return Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_Fillo(pTestDataFile_ContactManager, strTable, strTestCaseName);

	}

	public static LinkedHashMap<String, String> getData_Row_ContactManager(String strTable, int SecondKey) throws Throwable {

		return Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_DataSet_Fillo(pTestDataFile_ContactManager, strTable, strTestCaseName, SecondKey);

	}

	public static void UpdateData_ContactManager(String strTable, String strColumn, String strValue) throws Throwable {

		Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Column_Fillo(pTestDataFile_ContactManager, strTable, strColumn, strValue);

	}

	public static void login_ContactManager_User(String strUser) throws Throwable {
		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_Fillo(pTestDataFile_ContactManager, "login", strUser);

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

	public static void logout_ContactManager() throws Throwable {
		try {

			GuidewireAutomate("Setting", GW_Setting_Link, "clickAndwait", "click");
			GuidewireAutomate("Logout", GW_Logout_Link, "clickAndwait", "click");

			oExtentTest.log(Status.PASS, "Logout is succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void logout_ContactManagerWithAlert() throws Throwable {
		try {

			GuidewireAutomate("Setting", GW_Setting_Link, "clickAndwait", "click");
			GuidewireAutomate("Logout", GW_Logout_Link, "clickAndwait", "click");

			GuidewireAutomate_Handle("alertaccept", "NA");
			oExtentTest.log(Status.PASS, "Logout is succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ---- ContactManager
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 */
	public static void cmTabNavigation(String Tab, String Value) throws Throwable {

		switch (Tab) {

			/*
			 * Desktop
			 */
			case "Desktop" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop, "clickAndwait", "click");
				break;

			/*
			 * Administration
			 */
			case "Administration" :
				GuidewireAutomate("Administration Tab", TabCC_Administration, "clickAndwait", "click");
				break;

			default :
				throw new IOException("No support for Tab : " + Tab);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to ContactManager Tab : " + Tab + " is succesful");
	}

	public static void cmMenuNavigation(String Menu) throws Throwable {

		/*
		 * Actions
		 */
		switch (Menu) {
			case "Actions" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				break;

			/*
			 * Administration
			 */

			/*
			 * Users&Security
			 */
			case "UsersAndSecurity" :
				GuidewireAutomate("Users and Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				break;
			case "Users" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				Thread.sleep(1000);
				GuidewireAutomate("Users", MenuCC_UserAndSecurity_Users, "clickAndwait", "click");
				break;

			default :
				throw new IOException("No support for ContactManager Menu : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.PASS, "Navigation to ContactManager Menu : " + Menu + " is succesful");
	}

	public static void clickButton(String ButtonName) throws Throwable {
		switch (ButtonName) {

			case "Next" :
				GuidewireAutomate("Next", Next, "clickAndwait", "click");
				break;
			case "Finish" :
				GuidewireAutomate("Finish", Finish, "clickAndwait", "click");
				break;
			case "Update" :
				GuidewireAutomate("Update", Update_Button, "clickAndwait", "click");
				break;
			case "Cancel" :
				GuidewireAutomate("Cancel", Cancel_Button, "clickAndwait", "click");
				break;
			case "OK" :
				GuidewireAutomate("OK", OK, "clickAndwait", "click");
				break;
			case "Back" :
				GuidewireAutomate("Back", Back_Button, "clickAndwait", "click");
				break;
			case "Save" :
				GuidewireAutomate("Save", Save_Button, "clickAndwait", "click");
				break;

			default :
				throw new IOException("No support for Button : " + ButtonName);
		}
	}

	public static String infoBar(String strLabel) throws Throwable {
		String strInfobar = null;

		switch (strLabel) {
			case "Summary" :
				strInfobar = getText_Element(Summary_Header);
				UpdateData_ContactManager("master", "PolicyNumber", strInfobar);
				break;

			default :
				throw new IOException("No support for Label : " + strLabel);
		}
		oExtentTest.log(Status.INFO, " Fetched from Info Bar => " + strLabel + " = " + strInfobar);
		return strInfobar;
	}

	public static void Verify_WarningMessage() throws Throwable {

		try {
			GuidewireAutomate_Validation("Section", Validation_Results, "contains", "Validation Results");

			GuidewireAutomate_Validation(" Validate Error Msg", Error_Msg, "contains", "Warning: Loss Date or CMD/Reported Date");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static boolean ValidationResults_Clear() throws Throwable {
		Boolean bValidationResults = false;
		By      ValidationResults  = By.xpath("//div[@id='wsTabBar-wsTab_0']//div[@role='tab']");
		By      Clear              = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");

		if (IsElementDisplayed("ValidationResults", ValidationResults)) {
			GuidewireAutomate_Validation("Section", ValidationResults, "equals", "Validation Results");
			GuidewireAutomate("Clear", Clear, "clickAndwait", "click");
			bValidationResults = true;
		}

		return bValidationResults;
	}
}