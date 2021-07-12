package com.pages.Guidewire.ClaimsCenter;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Reporting_Utils;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ClaimCenter_AssignClaim extends SeleniumWebDriver_Commands implements ClaimCenter_AssignClaim_PO {

	public ClaimCenter_AssignClaim(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void LoadFactor_VacationStatus_Edit() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("AssignClaim", strTestCaseName);

		String                  strGroupName                  = lhm_TestCase_Table_Data.get("GroupName");
		String                  strCurrentUser_Name           = null;
		String                  strCurrentUser_LoadFactor     = null;
		String                  strCurrentUser_VacationStatus = null;
		boolean                 bEditUser                     = false;
		HashMap<String, String> lhmLoadFactor                 = new HashMap<String, String>();
		HashMap<String, String> lhmVacationStatus             = new HashMap<String, String>();

		GuidewireAutomate_Validation("Screen Header", Groups_Header, "equals", "Groups");

		GuidewireAutomate("Groups Name", Groups_Name, "clearANDsendKeys", strGroupName);
		GuidewireAutomate("Groups Search", Groups_Search, "clickAndwait", "NA");

		By Groups_Auto1_TeamB = By.xpath("//tr[contains(@id,'GroupSearchResultsLV')]/td[contains(@id,'Name_Cell')]//div[@class='gw-link gw-label' and text()='" + strGroupName + "']");
		GuidewireAutomate("Groups Auto1_TeamB", Groups_Auto1_TeamB, "clickAndwait", "NA");

		/*
		 * Group name
		 */
		GuidewireAutomate_Validation("Screen Header", ClaimCenter_Resuables_PO.Screen_Header, "equals", strGroupName);
		List<WebElement> oListWebElement_Users          = getElements(Groups_GroupName_Users);
		List<WebElement> oListWebElement_loadFactor     = getElements(Groups_GroupName_LoadFactor);
		List<WebElement> oListWebElement_vacationStatus = getElements(Groups_GroupName_VacationStatus);

		/*
		 * validation of User LoadFactor, VacationStatus
		 */
		for (int intoRowNo = 0; intoRowNo < oListWebElement_Users.size(); intoRowNo++) {
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
				lhmVacationStatus.put(strCurrentUser_Name, strCurrentUser_VacationStatus);
			} else {
				oExtentTest.log(Status.PASS, "Vacation Status is [At work] for user =" + strCurrentUser_Name);
			}

		}

		if (bEditUser) {
			GuidewireAutomate("Edit_Button", Edit_Button, "click", " ");

			LoadFactor_Edit(lhmLoadFactor);
			VacationStatus_Edit(lhmVacationStatus);

			GuidewireAutomate("Update_Button", Update_Button, "clickAndwait", " ");
		}

		oExtentTest.log(Status.PASS, "Load Factor is [100] for all users");
		oExtentTest.log(Status.PASS, "Vacation Status is [At work] for all users");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_addScreenCaptureFromPath(driver));
	}

	public static void LoadFactor_Edit(HashMap<String, String> lhmLoadFactor) throws Throwable {

		String           strCurrentUser_Name_Edit   = null;
		List<WebElement> oListWebElement_Users_Edit = getElements(Groups_GroupName_Users_Edit);

		for (int intRowNo_Edit = 0; intRowNo_Edit < oListWebElement_Users_Edit.size(); intRowNo_Edit++) {
			strCurrentUser_Name_Edit = getFirstSelectedOption_Element(oListWebElement_Users_Edit.get(intRowNo_Edit));

			for (Entry<String, String> m : lhmLoadFactor.entrySet()) {
				if (strCurrentUser_Name_Edit.equalsIgnoreCase(m.getKey())) {
					oExtentTest.log(Status.INFO, "Load Factor Edit is started for : " + strCurrentUser_Name_Edit);
					By Groups_GroupName_CheckBox = By.xpath("//input[contains(@name,'GroupUsersLV-" + intRowNo_Edit + "-_Checkbox')]");
					GuidewireAutomate("GroupName User Select", Groups_GroupName_CheckBox, "click", " ");

					By LoadFactor_Edit = By.xpath("//input[contains(@name,'GroupUsersLV-" + intRowNo_Edit + "-LoadFactor')]");
					GuidewireAutomate("Load Factor for" + strCurrentUser_Name_Edit, LoadFactor_Edit, "clearANDsendKeys", "100");
				}
			}
		} // For oListWebElement_Users_Edit.size

	}

	public static void VacationStatus_Edit(HashMap<String, String> lhmVacationStatus) throws Throwable {

		String           strCurrentUser_Name_Edit   = null;
		List<WebElement> oListWebElement_Users_Edit = getElements(Groups_GroupName_Users_Edit);

		for (int intRowNo_Edit = 0; intRowNo_Edit < oListWebElement_Users_Edit.size(); intRowNo_Edit++) {
			strCurrentUser_Name_Edit = getFirstSelectedOption_Element(oListWebElement_Users_Edit.get(intRowNo_Edit));

			for (Entry<String, String> m : lhmVacationStatus.entrySet()) {
				if (strCurrentUser_Name_Edit.equalsIgnoreCase(m.getKey())) {
					oExtentTest.log(Status.INFO, "Vacation Status Edit is started for : " + strCurrentUser_Name_Edit);

					By VacationStatus_Edit = By.xpath("//select[contains(@name,'GroupUsersLV-" + intRowNo_Edit + "-VacationStatus')]");
					GuidewireAutomate("Vacation Status for  " + strCurrentUser_Name_Edit, VacationStatus_Edit, "selectByVisibleText", "At work");
				}
			}
		} // For oListWebElement_Users_Edit.size

	}

}
