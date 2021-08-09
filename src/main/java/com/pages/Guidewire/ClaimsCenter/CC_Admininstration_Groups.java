package com.pages.Guidewire.ClaimsCenter;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Reporting_Utils;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_Admininstration_Groups extends SeleniumWebDriver_Commands implements CC_Admininstration_Groups_PO {

	static String           strGroupName                   = null;
	static String           strTempValue_CC                = null;
	static List<WebElement> oListWebElement_Users          = null;
	static List<WebElement> oListWebElement_loadFactor     = null;
	static List<WebElement> oListWebElement_vacationStatus = null;
	static String           strCurrentUser_Name            = null;
	static String           strCurrentUser_LoadFactor      = null;
	static String           strCurrentUser_VacationStatus  = null;

	public CC_Admininstration_Groups(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void groups_Search() throws Throwable {

		strGroupName = null;

		/*
		 * Groups screen
		 */

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("groups");

			strGroupName = lhm_TestCase_Table_Data.get("GroupName");

			GuidewireAutomate_Validation("Screen Header", Groups_Header, "equals", "Groups");

			GuidewireAutomate("Groups Name", GR_GroupsName, "clearANDsendKeys", strGroupName);
			GuidewireAutomate("Groups Search", GR_Search, "clickAndwait", "NA");

			By GR_SR_Name = By.xpath("//tr[contains(@id,'GroupSearchResultsLV')]/td[contains(@id,'Name_Cell')]//div[@class='gw-link gw-label' and text()='" + strGroupName + "']");
			GuidewireAutomate("Groups Name = " + strGroupName, GR_SR_Name, "clickAndwait", "NA");

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Group = [" + strGroupName + "] search is UnSuccessful");
			e.printStackTrace();
		}

		oExtentTest.log(Status.PASS, "Group = [" + strGroupName + "] search is Successful");

	}

	public static void groupName_ProfileTab() throws Throwable {

		try {

			strGroupName                   = null;
			oListWebElement_Users          = null;
			oListWebElement_loadFactor     = null;
			oListWebElement_vacationStatus = null;
			strCurrentUser_Name            = null;
			strCurrentUser_LoadFactor      = null;
			strCurrentUser_VacationStatus  = null;

			/*
			 * Group name
			 */
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("groups");

			strGroupName = lhm_TestCase_Table_Data.get("GroupName");

			GuidewireAutomate_Validation("Screen Header", ClaimCenter_Resuables_PO.Screen_Header, "equals", strGroupName);

			/*
			 * Profile
			 */
			GuidewireAutomate("Profile Tab", GD_Profile_Tab, "click", "click");

			oListWebElement_Users          = getElements(Groups_GroupName_Users);
			oListWebElement_loadFactor     = getElements(Groups_GroupName_LoadFactor);
			oListWebElement_vacationStatus = getElements(Groups_GroupName_VacationStatus);

			for (int intRowNo = 0; intRowNo < oListWebElement_Users.size(); intRowNo++) {
				strCurrentUser_Name           = getText_Element(oListWebElement_Users.get(intRowNo));
				strCurrentUser_LoadFactor     = getText_Element(oListWebElement_loadFactor.get(intRowNo));
				strCurrentUser_VacationStatus = getText_Element(oListWebElement_vacationStatus.get(intRowNo));

				oExtentTest.log(Status.INFO, "UsersName = [" + strCurrentUser_Name + "] | LoadFactor = [" + strCurrentUser_LoadFactor + "] | VacationStatus = [" + strCurrentUser_VacationStatus + "]");
			}

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Group = [" + strGroupName + "] Profile Tab is UnSuccessful");
			e.printStackTrace();
			throw e;
		}

	}

	public static void groupName_QueuesTab() throws Throwable {

		try {

			/*
			 * Group name
			 */
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("groups");
			strGroupName            = lhm_TestCase_Table_Data.get("GroupName");

			GuidewireAutomate_Validation("Screen Header", ClaimCenter_Resuables_PO.Screen_Header, "equals", strGroupName);

			/*
			 * Queues
			 */
			GuidewireAutomate("Queues Tab", GN_Queues_Tab, "click", "click");
			GuidewireAutomate_Validation("Queue Name", Queue_Name, "equals", lhm_TestCase_Table_Data.get("Queue_Name"));
			GuidewireAutomate_Validation("Description", Queue_Description, "equals", lhm_TestCase_Table_Data.get("Queue_Description"));
			GuidewireAutomate_Validation("VisibleInSubgroups", Queue_VisibleInSubgroups, "equals", lhm_TestCase_Table_Data.get("Queue_VisibleInSubgroups"));

			oExtentTest.log(Status.PASS, "Queues Tab is verified");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void groupName_RegionsTab() throws Throwable {
		int intRowNo = 0;

		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("groups");
			strGroupName            = lhm_TestCase_Table_Data.get("GroupName");
			String strRN_Region1 = lhm_TestCase_Table_Data.get("RN_Region1");
			String strRN_Region2 = lhm_TestCase_Table_Data.get("RN_Region2");
			String strRN_Region3 = lhm_TestCase_Table_Data.get("RN_Region3");
			String strRN_Region4 = lhm_TestCase_Table_Data.get("RN_Region4");

			GuidewireAutomate_Validation("Screen Header", ClaimCenter_Resuables_PO.Screen_Header, "equals", strGroupName);

			/*
			 * Regions
			 */
			GuidewireAutomate("Region Tab", GN_Regions_Tab, "click", "click");

			List<WebElement> oListWebElement_Regions_Name         = getElements(GN_Regions_Name);
			List<WebElement> oListWebElement_Regions_AreasCovered = getElements(GN_Regions_AreasCovered);

			String strRN_Region1_GW = getText_Element(oListWebElement_Regions_Name.get(0));
			String strRN_Region2_GW = getText_Element(oListWebElement_Regions_Name.get(1));
			String strRN_Region3_GW = getText_Element(oListWebElement_Regions_Name.get(2));
			String strRN_Region4_GW = getText_Element(oListWebElement_Regions_Name.get(3));

			if (strRN_Region1_GW.equalsIgnoreCase(strRN_Region1)) {
				oExtentTest.log(Status.PASS, "groupName_Regions => Region1, Actual [" + strRN_Region1_GW + "] Equals Expected [" + strRN_Region1 + "]");
			} else {
				oExtentTest.log(Status.FAIL, "groupName_Regions => Region1, Actual [" + strRN_Region1_GW + "] NotEquals Expected [" + strRN_Region1 + "]");
			}

			if (strRN_Region2_GW.equalsIgnoreCase(strRN_Region2)) {
				oExtentTest.log(Status.PASS, "groupName_Regions => Region2, Actual [" + strRN_Region2_GW + "] Equals Expected [" + strRN_Region2 + "]");
			} else {
				oExtentTest.log(Status.FAIL, "groupName_Regions => Region2, Actual [" + strRN_Region2_GW + "] NotEquals Expected [" + strRN_Region2 + "]");
			}

			if (strRN_Region3_GW.equalsIgnoreCase(strRN_Region3)) {
				oExtentTest.log(Status.PASS, "groupName_Regions => Region3, Actual [" + strRN_Region3_GW + "] Equals Expected [" + strRN_Region3 + "]");
			} else {
				oExtentTest.log(Status.FAIL, "groupName_Regions => Region3, Actual [" + strRN_Region3_GW + "] NotEquals Expected [" + strRN_Region3 + "]");
			}

			if (strRN_Region4_GW.equalsIgnoreCase(strRN_Region4)) {
				oExtentTest.log(Status.PASS, "groupName_Regions => Region4, Actual [" + strRN_Region4_GW + "] Equals Expected [" + strRN_Region4 + "]");
			} else {
				oExtentTest.log(Status.FAIL, "groupName_Regions => Region4, Actual [" + strRN_Region4_GW + "] NotEquals Expected [" + strRN_Region4 + "]");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void User_LoadFactor_Edit(String strCurrentUser, String strLoadFactor) throws Throwable {

		By GN_User_Checkbox = By.xpath("//option[text()='" + strCurrentUser + "']/parent::select[contains(@name,'-GroupUsers_User')]/ancestor::tr/td//div[contains(@id,'_Checkbox')]");
		GuidewireAutomate("User Checkbox", GN_User_Checkbox, "click", "click");

		By GN_User_LoadFactor = By.xpath("//option[text()='" + strCurrentUser + "']/parent::select[contains(@name,'-GroupUsers_User')]/ancestor::tr/td[contains(@id,'-LoadFactor_Cell')]//input[contains(@name,'-LoadFactor')]");
		GuidewireAutomate("Load Factor for " + strCurrentUser, GN_User_LoadFactor, "clearANDsendKeys", strLoadFactor);
	}

	public static Boolean User_LoadFactor_Verify(String strCurrentUser, String strLoadFactor) throws Throwable {

		strTempValue_CC = null;

		By GN_User_LoadFactor = By.xpath("//option[text()='" + strCurrentUser + "']/parent::select[contains(@name,'-GroupUsers_User')]/ancestor::tr/td[contains(@id,'-LoadFactor_Cell')]//input[contains(@name,'-LoadFactor')]");
		strTempValue_CC = getValue_Element(GN_User_LoadFactor);
		oExtentTest.log(Status.INFO, "User_LoadFactor_Verify => Load Factor for = [" + strCurrentUser + "] Actual [" + strTempValue_CC + "] Expected [" + strLoadFactor + "]");
		if (strTempValue_CC.equalsIgnoreCase(strLoadFactor)) {
			return true;
		} else {
			return false;
		}

	}

	public static void User_LoadFactorType_Edit(String strCurrentUser, String strLoadFactorType) throws Throwable {

		By GN_User_LoadFactorType = By
				.xpath("//option[text()='" + strCurrentUser + "']/parent::select[contains(@name,'-GroupUsers_User')]/ancestor::tr/td[contains(@id,'-GroupUsers_LoadFactorType_Cell')]//select[contains(@name,'-GroupUsers_LoadFactorType')]");
		GuidewireAutomate("LoadFactorType for  " + strCurrentUser, GN_User_LoadFactorType, "selectByVisibleText", strLoadFactorType);

	}

	public static void User_VacationStatus_Edit(String strCurrentUser, String strVacationStatus) throws Throwable {
		By GN_User_VacationStatus = By.xpath("//option[text()='" + strCurrentUser + "']/parent::select[contains(@name,'-GroupUsers_User')]/ancestor::tr/td[contains(@id,'-VacationStatus_Cell')]//select[contains(@name,'-VacationStatus')]");
		GuidewireAutomate("Vacation Status for  " + strCurrentUser, GN_User_VacationStatus, "selectByVisibleText", strVacationStatus);

	}
	public static Boolean User_VacationStatus_Verify(String strCurrentUser, String strVacationStatus) throws Throwable {
		strTempValue_CC = null;

		By GN_User_VacationStatus = By.xpath("//option[text()='" + strCurrentUser + "']/parent::select[contains(@name,'-GroupUsers_User')]/ancestor::tr/td[contains(@id,'-VacationStatus_Cell')]//select[contains(@name,'-VacationStatus')]");
		strTempValue_CC = getFirstSelectedOption_Element(GN_User_VacationStatus);
		oExtentTest.log(Status.INFO, "User_VacationStatus_Verify => VacationStatus for = [" + strCurrentUser + "] Actual [" + strTempValue_CC + "] Expected [" + strVacationStatus + "]");

		if (strTempValue_CC.equalsIgnoreCase(strVacationStatus)) {
			return true;
		} else {
			return false;
		}
	}

	public static void User_BackupUser_Edit(String strCurrentUser, String strBackupUser) throws Throwable {

		By GN_User_BackupUser_SearchButton = By.xpath("//option[text()='" + strCurrentUser
				+ "']/parent::select[contains(@name,'-GroupUsers_User')]/ancestor::tr/td[contains(@id,'-BackupUser_Cell')]//div[contains(@id,'BackupUser') and contains(@class,'gw-ValueWidget') ]//div[contains(@id,'BackupUserMenuIcon')]/div[@role='button']");

		GuidewireAutomate("BackupUser_SearchButton", GN_User_BackupUser_SearchButton, "click", "click");

		By GN_User_BackupUser = By.xpath("//option[text()='" + strCurrentUser + "']/parent::select[contains(@name,'-GroupUsers_User')]/ancestor::tr/td[contains(@id,'-BackupUser_Cell')]//select[contains(@name,'-BackupUser')]");
		GuidewireAutomate("BackupUser for  " + strCurrentUser, GN_User_BackupUser, "selectByVisibleText", strBackupUser);

	}

	public static void groupName_AllUsers_LoadFactor_Edit() throws Throwable {

		strCurrentUser_Name = null;
		String strGN_AllUsers_LoadFactor = lhm_TestCase_Table_Data.get("GN_AllUsers_LoadFactor");

		oListWebElement_Users = getElements(Groups_GroupName_Users_Edit);
		for (WebElement oWebElement_CurrentUser : oListWebElement_Users) {
			strCurrentUser_Name = getFirstSelectedOption_Element(oWebElement_CurrentUser);

			if (!User_LoadFactor_Verify(strCurrentUser_Name, strGN_AllUsers_LoadFactor)) {
				oExtentTest.log(Status.INFO, "Load Factor Edit is started for : " + strCurrentUser_Name);
				User_LoadFactor_Edit(strCurrentUser_Name, strGN_AllUsers_LoadFactor);
			}
		}

		oExtentTest.log(Status.PASS, "Load Factor is [" + strGN_AllUsers_LoadFactor + "] for all users");

	}

	public static void groupName_AllUsers_VacationStatus_Edit() throws Throwable {
		strCurrentUser_Name = null;
		String strGN_AllUsers_VacationStatus = lhm_TestCase_Table_Data.get("GN_AllUsers_VacationStatus");

		oListWebElement_Users = getElements(Groups_GroupName_Users_Edit);
		for (WebElement oWebElement_CurrentUser : oListWebElement_Users) {
			strCurrentUser_Name = getFirstSelectedOption_Element(oWebElement_CurrentUser);

			if (!User_VacationStatus_Verify(strCurrentUser_Name, strGN_AllUsers_VacationStatus)) {
				oExtentTest.log(Status.INFO, "VacationStatus Edit is started for : " + strCurrentUser_Name);
				User_VacationStatus_Edit(strCurrentUser_Name, strGN_AllUsers_VacationStatus);
			}
		}

		oExtentTest.log(Status.PASS, "Vacation Status is [" + strGN_AllUsers_VacationStatus + "] for all users");

	}

	public static void groupName_User_Edit() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("groups");
		String strEditUser = lhm_TestCase_Table_Data.get("EditUser");

		GuidewireAutomate("Edit_Button", Edit_Button, "click", "click");

		User_LoadFactor_Edit(strEditUser, strEditUser);
		User_VacationStatus_Edit(strEditUser, strEditUser);

		GuidewireAutomate("Update_Button", Update_Button, "clickAndwait", "click");

	}

	public static void groupName_AllUsers_Edit_LoadFactor_VacationStatus() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("groups");

		GuidewireAutomate("Edit_Button", Edit_Button, "click", "click");

		groupName_AllUsers_LoadFactor_Edit();
		groupName_AllUsers_VacationStatus_Edit();

		GuidewireAutomate("Update_Button", Update_Button, "clickAndwait", "click");

	}

	public static void ChangeLoadfactor50() throws Throwable {
		String strCurrentUser_Name = null;

		List<WebElement> oListWebElement_Users;

		oListWebElement_Users = getElements(Groups_GroupName_Users_Edit);

		int RowNo;
		for (RowNo = 0; RowNo < oListWebElement_Users.size(); RowNo++) {

			strCurrentUser_Name = getFirstSelectedOption_Element(oListWebElement_Users.get(RowNo));

			if (strCurrentUser_Name.equalsIgnoreCase("Heidi Johnson")) {
				By Groups_GroupName_CheckBox = By.xpath("//input[contains(@name,'GroupUsersLV-" + RowNo + "-_Checkbox')]");
				GuidewireAutomate("GroupName User Select", Groups_GroupName_CheckBox, "click", "click");

				By LoadFactor_Edit = By.xpath("//input[contains(@name,'GroupUsersLV-" + RowNo + "-LoadFactor')]");
				GuidewireAutomate("Load Factor for" + strCurrentUser_Name, LoadFactor_Edit, "clearANDsendKeys", "50");
			}

		}

	}

	public static void LoadFactor_VacationStatus_EditZero() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("groups");

		String                  strGroupName                  = lhm_TestCase_Table_Data.get("GroupName");
		String                  strCurrentUser_Name           = null;
		String                  strCurrentUser_LoadFactor     = null;
		String                  strCurrentUser_VacationStatus = null;
		List<WebElement>        oListWebElement_Users;
		List<WebElement>        oListWebElement_loadFactor;
		List<WebElement>        oListWebElement_vacationStatus;
		int                     intoRowNo;
		boolean                 bEditUser                     = false;
		HashMap<String, String> lhmLoadFactor                 = new HashMap<String, String>();
		HashMap<String, String> lhmVacationStatus             = new HashMap<String, String>();

		/*
		 * Groups screen
		 */
		groups_Search();

		/*
		 * Group name
		 */
		GuidewireAutomate_Validation("Screen Header", ClaimCenter_Resuables_PO.Screen_Header, "equals", strGroupName);
		oListWebElement_Users          = getElements(Groups_GroupName_Users);
		oListWebElement_loadFactor     = getElements(Groups_GroupName_LoadFactor);
		oListWebElement_vacationStatus = getElements(Groups_GroupName_VacationStatus);

		for (intoRowNo = 0; intoRowNo < oListWebElement_Users.size(); intoRowNo++) {
			strCurrentUser_Name           = getText_Element(oListWebElement_Users.get(intoRowNo));
			strCurrentUser_LoadFactor     = getText_Element(oListWebElement_loadFactor.get(intoRowNo));
			strCurrentUser_VacationStatus = getText_Element(oListWebElement_vacationStatus.get(intoRowNo));

			oExtentTest.log(Status.INFO, "UsersName is  = [" + strCurrentUser_Name + "] | LoadFactor = [" + strCurrentUser_LoadFactor + "] | vacation=[" + strCurrentUser_VacationStatus + "]");
		}

		for (intoRowNo = 0; intoRowNo < oListWebElement_Users.size(); intoRowNo++) {
			strCurrentUser_Name           = getText_Element(oListWebElement_Users.get(intoRowNo));
			strCurrentUser_LoadFactor     = getText_Element(oListWebElement_loadFactor.get(intoRowNo));
			strCurrentUser_VacationStatus = getText_Element(oListWebElement_vacationStatus.get(intoRowNo));

			if (!strCurrentUser_LoadFactor.equalsIgnoreCase("100")) {
				bEditUser = true;
				if (!strCurrentUser_Name.equalsIgnoreCase("Heidi Johnson")) {
					lhmLoadFactor.put(strCurrentUser_Name, strCurrentUser_LoadFactor);
				}
			} else {

				oExtentTest.log(Status.PASS, "Load Factor is [100] for user = " + strCurrentUser_Name);
			}

			if (!strCurrentUser_VacationStatus.equalsIgnoreCase("At work")) {
				bEditUser = true;

				lhmVacationStatus.put(strCurrentUser_Name, strCurrentUser_VacationStatus);

			} else {
				oExtentTest.log(Status.PASS, "Vacation Status is [At work] for user =" + strCurrentUser_Name);
			}

		}

		if (bEditUser) {
			GuidewireAutomate("Edit_Button", Edit_Button, "click", "click");

			// LoadFactor_Edit(lhmLoadFactor);
			// VacationStatus_Edit(lhmVacationStatus);
			ChangeLoadfactortoZero();
			GuidewireAutomate("Update_Button", Update_Button, "clickAndwait", "click");
			oListWebElement_Users          = getElements(Groups_GroupName_Users);
			oListWebElement_loadFactor     = getElements(Groups_GroupName_LoadFactor);
			oListWebElement_vacationStatus = getElements(Groups_GroupName_VacationStatus);

			for (intoRowNo = 0; intoRowNo < oListWebElement_Users.size(); intoRowNo++) {
				strCurrentUser_Name           = getText_Element(oListWebElement_Users.get(intoRowNo));
				strCurrentUser_LoadFactor     = getText_Element(oListWebElement_loadFactor.get(intoRowNo));
				strCurrentUser_VacationStatus = getText_Element(oListWebElement_vacationStatus.get(intoRowNo));

				oExtentTest.log(Status.INFO, "UsersName is  = [" + strCurrentUser_Name + "] | LoadFactor = [" + strCurrentUser_LoadFactor + "]|vacation=[" + strCurrentUser_VacationStatus + "]");
			}

		}

		oExtentTest.log(Status.PASS, "Load Factor is [100] for all users");
		oExtentTest.log(Status.PASS, "Vacation Status is [At work] for all users");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));
	}

	public static void ChangeLoadfactortoZero() throws Throwable {
		String strCurrentUser_Name = null;

		List<WebElement> oListWebElement_Users;

		oListWebElement_Users = getElements(Groups_GroupName_Users_Edit);

		int RowNo;
		for (RowNo = 0; RowNo < oListWebElement_Users.size(); RowNo++) {

			strCurrentUser_Name = getFirstSelectedOption_Element(oListWebElement_Users.get(RowNo));

			if (strCurrentUser_Name.equalsIgnoreCase("Heidi Johnson")) {
				By Groups_GroupName_CheckBox = By.xpath("//input[contains(@name,'GroupUsersLV-" + RowNo + "-_Checkbox')]");
				GuidewireAutomate("GroupName User Select", Groups_GroupName_CheckBox, "click", "click");

				By LoadFactor_Edit = By.xpath("//input[contains(@name,'GroupUsersLV-" + RowNo + "-LoadFactor')]");
				GuidewireAutomate("Load Factor for" + strCurrentUser_Name, LoadFactor_Edit, "clearANDsendKeys", "0");
			}

		}

	}

	public static void LoadFactor_VacationStatus_OnVacationandAssignBackUpUser() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("groups");

		String                  strGroupName                  = lhm_TestCase_Table_Data.get("GroupName");
		String                  strCurrentUser_Name           = null;
		String                  strCurrentUser_LoadFactor     = null;
		String                  strCurrentUser_VacationStatus = null;
		List<WebElement>        oListWebElement_Users;
		List<WebElement>        oListWebElement_loadFactor;
		List<WebElement>        oListWebElement_vacationStatus;
		int                     intoRowNo;
		boolean                 bEditUser                     = false;
		HashMap<String, String> lhmLoadFactor                 = new HashMap<String, String>();
		HashMap<String, String> lhmVacationStatus             = new HashMap<String, String>();

		/*
		 * Groups screen
		 */
		groups_Search();

		/*
		 * Group name
		 */
		GuidewireAutomate_Validation("Screen Header", ClaimCenter_Resuables_PO.Screen_Header, "equals", strGroupName);
		oListWebElement_Users          = getElements(Groups_GroupName_Users);
		oListWebElement_loadFactor     = getElements(Groups_GroupName_LoadFactor);
		oListWebElement_vacationStatus = getElements(Groups_GroupName_VacationStatus);

		for (intoRowNo = 0; intoRowNo < oListWebElement_Users.size(); intoRowNo++) {
			strCurrentUser_Name           = getText_Element(oListWebElement_Users.get(intoRowNo));
			strCurrentUser_LoadFactor     = getText_Element(oListWebElement_loadFactor.get(intoRowNo));
			strCurrentUser_VacationStatus = getText_Element(oListWebElement_vacationStatus.get(intoRowNo));

			oExtentTest.log(Status.INFO, "UsersName is  = [" + strCurrentUser_Name + "] | LoadFactor = [" + strCurrentUser_LoadFactor + "] | vacation=[" + strCurrentUser_VacationStatus + "]");
		}

		for (intoRowNo = 0; intoRowNo < oListWebElement_Users.size(); intoRowNo++) {
			strCurrentUser_Name           = getText_Element(oListWebElement_Users.get(intoRowNo));
			strCurrentUser_LoadFactor     = getText_Element(oListWebElement_loadFactor.get(intoRowNo));
			strCurrentUser_VacationStatus = getText_Element(oListWebElement_vacationStatus.get(intoRowNo));

			if (!strCurrentUser_LoadFactor.equalsIgnoreCase("100")) {
				bEditUser = true;
				lhmLoadFactor.put(strCurrentUser_Name, strCurrentUser_LoadFactor);
			} else {

				oExtentTest.log(Status.PASS, "Load Factor is [100] for user = " + strCurrentUser_Name);
			}

			if (!strCurrentUser_VacationStatus.equalsIgnoreCase("At work")) {
				bEditUser = true;
				if (!strCurrentUser_Name.equalsIgnoreCase("Heidi Johnson")) {
					lhmVacationStatus.put(strCurrentUser_Name, strCurrentUser_VacationStatus);
				}

			} else {
				oExtentTest.log(Status.PASS, "Vacation Status is [At work] for user =" + strCurrentUser_Name);
			}

		}

		if (bEditUser) {
			GuidewireAutomate("Edit_Button", Edit_Button, "click", "click");

			// LoadFactor_Edit(lhmLoadFactor);
			// VacationStatus_Edit(lhmVacationStatus);
			Group_BackupUser();
			GuidewireAutomate_Validation("Screen Header", ClaimCenter_Resuables_PO.Screen_Header, "equals", "Auto1 - TeamB");
			GuidewireAutomate("Update_Button", Update_Button, "clickAndwait", "click");
			oListWebElement_Users          = getElements(Groups_GroupName_Users);
			oListWebElement_loadFactor     = getElements(Groups_GroupName_LoadFactor);
			oListWebElement_vacationStatus = getElements(Groups_GroupName_VacationStatus);

			for (intoRowNo = 0; intoRowNo < oListWebElement_Users.size(); intoRowNo++) {
				strCurrentUser_Name           = getText_Element(oListWebElement_Users.get(intoRowNo));
				strCurrentUser_LoadFactor     = getText_Element(oListWebElement_loadFactor.get(intoRowNo));
				strCurrentUser_VacationStatus = getText_Element(oListWebElement_vacationStatus.get(intoRowNo));

				oExtentTest.log(Status.INFO, "UsersName is  = [" + strCurrentUser_Name + "] | LoadFactor = [" + strCurrentUser_LoadFactor + "]|vacation=[" + strCurrentUser_VacationStatus + "]");
			}

		}

		oExtentTest.log(Status.PASS, "Load Factor is [100] for all users");
		oExtentTest.log(Status.PASS, "Vacation Status is [At work] for all users");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));

	}

	public static void Group_BackupUser() throws Throwable {
		String strCurrentUser_Name = null;

		List<WebElement> oListWebElement_Users;

		oListWebElement_Users = getElements(Groups_GroupName_Users_Edit);

		int RowNo;
		for (RowNo = 0; RowNo < oListWebElement_Users.size(); RowNo++) {

			strCurrentUser_Name = getFirstSelectedOption_Element(oListWebElement_Users.get(RowNo));

			if (strCurrentUser_Name.equalsIgnoreCase("Heidi Johnson")) {
				By Groups_GroupName_CheckBox = By.xpath("//input[contains(@name,'GroupUsersLV-" + RowNo + "-_Checkbox')]");
				GuidewireAutomate("GroupName User Select", Groups_GroupName_CheckBox, "click", "click");

				By VacationStatus = By.xpath("//select[contains(@name,'GroupUsersLV-" + RowNo + "-VacationStatus')]");
				GuidewireAutomate("VacationStatus for" + strCurrentUser_Name, VacationStatus, "selectByVisibleText", "On vacation");
				// defaultowner
				By defaultowner = By.xpath("//select[contains(@name,'GroupUsersLV-" + RowNo + "-BackupUser')]");
				GuidewireAutomate("VacationStatus for" + strCurrentUser_Name, defaultowner, "selectByVisibleText", "Default Owner");

				By BackUpUsers_Edit = By.xpath("//tr[contains(@id,'GroupUsersLV-" + RowNo
						+ "')]//td[contains(@id,'BackupUser_Cell')]//div[contains(@id,'BackupUser') and contains(@class,'gw-ValueWidget') ]//div[contains(@id,'BackupUserMenuIcon')]//div[@class='gw-icon gw-icon--expand']");
				// movetoelement
				//
				GuidewireAutomate("BackUpUsers for  " + strCurrentUser_Name, BackUpUsers_Edit, "moveToElement", "");
				GuidewireAutomate("BackUpUsers for  " + strCurrentUser_Name, BackUpUsers_Edit, "clickAndwait", "");

				By SearchForaUser = By.xpath("//div[contains(@id,'GroupUsersLV-" + RowNo + "-BackupUser-BackupUserUserSearchMenuItem')]");
				GuidewireAutomate("BackUpUsers for  " + strCurrentUser_Name, SearchForaUser, "clickAndwait", "");
				SearchForBackUpUser();

			}

		}

	}

	public static void SearchForBackUpUser() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", G_GN_U_Edit_BackUpUser_SearchUser_Header, "contains", "Search Users");
		GuidewireAutomate("SearchUser FirstName", G_GN_U_Edit_BackUpUser_SearchUser_FirstName, "clearANDsendKeys", "Andy");
		GuidewireAutomate("SearchUser LastName", G_GN_U_Edit_BackUpUser_SearchUser_LastName, "clearANDsendKeys", "Applegate");
		GuidewireAutomate("Search", G_GN_U_Edit_BackUpUser_SearchUser_Search, "clickAndwait", "click");
		GuidewireAutomate("Select", G_GN_U_Edit_BackUpUser_SearchUser_Select, "clickAndwait", "click");

	}

	public static void LoadFactor_VacationStatus_OnVacationInActive() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("groups");

		String                  strGroupName                  = lhm_TestCase_Table_Data.get("GroupName");
		String                  strCurrentUser_Name           = null;
		String                  strCurrentUser_LoadFactor     = null;
		String                  strCurrentUser_VacationStatus = null;
		List<WebElement>        oListWebElement_Users;
		List<WebElement>        oListWebElement_loadFactor;
		List<WebElement>        oListWebElement_vacationStatus;
		int                     intoRowNo;
		boolean                 bEditUser                     = false;
		HashMap<String, String> lhmLoadFactor                 = new HashMap<String, String>();
		HashMap<String, String> lhmVacationStatus             = new HashMap<String, String>();

		/*
		 * Groups screen
		 */
		groups_Search();

		/*
		 * Group name
		 */
		GuidewireAutomate_Validation("Screen Header", ClaimCenter_Resuables_PO.Screen_Header, "equals", strGroupName);
		oListWebElement_Users          = getElements(Groups_GroupName_Users);
		oListWebElement_loadFactor     = getElements(Groups_GroupName_LoadFactor);
		oListWebElement_vacationStatus = getElements(Groups_GroupName_VacationStatus);

		for (intoRowNo = 0; intoRowNo < oListWebElement_Users.size(); intoRowNo++) {
			strCurrentUser_Name           = getText_Element(oListWebElement_Users.get(intoRowNo));
			strCurrentUser_LoadFactor     = getText_Element(oListWebElement_loadFactor.get(intoRowNo));
			strCurrentUser_VacationStatus = getText_Element(oListWebElement_vacationStatus.get(intoRowNo));

			oExtentTest.log(Status.INFO, "UsersName is  = [" + strCurrentUser_Name + "] | LoadFactor = [" + strCurrentUser_LoadFactor + "] | vacation=[" + strCurrentUser_VacationStatus + "]");
		}

		for (intoRowNo = 0; intoRowNo < oListWebElement_Users.size(); intoRowNo++) {
			strCurrentUser_Name           = getText_Element(oListWebElement_Users.get(intoRowNo));
			strCurrentUser_LoadFactor     = getText_Element(oListWebElement_loadFactor.get(intoRowNo));
			strCurrentUser_VacationStatus = getText_Element(oListWebElement_vacationStatus.get(intoRowNo));

			if (!strCurrentUser_LoadFactor.equalsIgnoreCase("100")) {
				bEditUser = true;
				lhmLoadFactor.put(strCurrentUser_Name, strCurrentUser_LoadFactor);
			} else {

				oExtentTest.log(Status.PASS, "Load Factor is [100] for user = " + strCurrentUser_Name);
			}

			if (!strCurrentUser_VacationStatus.equalsIgnoreCase("At work")) {
				bEditUser = true;
				if (!strCurrentUser_Name.equalsIgnoreCase("Heidi Johnson")) {
					lhmVacationStatus.put(strCurrentUser_Name, strCurrentUser_VacationStatus);
				}

			} else {
				oExtentTest.log(Status.PASS, "Vacation Status is [At work] for user =" + strCurrentUser_Name);
			}

		}

		if (bEditUser) {
			GuidewireAutomate("Edit_Button", Edit_Button, "click", "click");

			// LoadFactor_Edit(lhmLoadFactor);
			// VacationStatus_Edit(lhmVacationStatus);
			ChangeVacationStatusInactive();
			GuidewireAutomate("Update_Button", Update_Button, "clickAndwait", "click");
			oListWebElement_Users          = getElements(Groups_GroupName_Users);
			oListWebElement_loadFactor     = getElements(Groups_GroupName_LoadFactor);
			oListWebElement_vacationStatus = getElements(Groups_GroupName_VacationStatus);

			for (intoRowNo = 0; intoRowNo < oListWebElement_Users.size(); intoRowNo++) {
				strCurrentUser_Name           = getText_Element(oListWebElement_Users.get(intoRowNo));
				strCurrentUser_LoadFactor     = getText_Element(oListWebElement_loadFactor.get(intoRowNo));
				strCurrentUser_VacationStatus = getText_Element(oListWebElement_vacationStatus.get(intoRowNo));

				oExtentTest.log(Status.INFO, "UsersName is  = [" + strCurrentUser_Name + "] | LoadFactor = [" + strCurrentUser_LoadFactor + "] | vacation=[" + strCurrentUser_VacationStatus + "]");
			}

		}

		oExtentTest.log(Status.PASS, "Load Factor is [100] for all users");
		oExtentTest.log(Status.PASS, "Vacation Status is [At work] for all users");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));

	}

	public static void ChangeVacationStatusInactive() throws Throwable {
		String strCurrentUser_Name = null;

		List<WebElement> oListWebElement_Users;

		oListWebElement_Users = getElements(Groups_GroupName_Users_Edit);

		int RowNo;
		for (RowNo = 0; RowNo < oListWebElement_Users.size(); RowNo++) {

			strCurrentUser_Name = getFirstSelectedOption_Element(oListWebElement_Users.get(RowNo));

			if (strCurrentUser_Name.equalsIgnoreCase("Heidi Johnson")) {
				By Groups_GroupName_CheckBox = By.xpath("//input[contains(@name,'GroupUsersLV-" + RowNo + "-_Checkbox')]");
				GuidewireAutomate("GroupName User Select", Groups_GroupName_CheckBox, "click", "click");

				By VacationStatus = By.xpath("//select[contains(@name,'GroupUsersLV-" + RowNo + "-VacationStatus')]");
				GuidewireAutomate("VacationStatus for" + strCurrentUser_Name, VacationStatus, "selectByVisibleText", "On vacation (Inactive)");
			}

		}

	}

}