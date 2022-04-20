package com.pages.Guidewire.ClaimsCenter;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_Administration extends SeleniumWebDriver_Commands {
	public CC_Administration(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By Groups_Header   = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By VantageRiskMenu = By.xpath("//td[contains(@id,'AdminMenuTree-AdminMenuTree')]//div[text()='Vantage Risk']");

	private static By NewGroup_Type         = By.xpath("//select[contains(@name,'NewGroupDetailDV-Type')]");
	private static By NewGroup_SecurityZone = By.xpath("//select[contains(@name,'NewGroupDetailDV-SecurityZone')]");

	private static By Users_SearchButton         = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	private static By UsersName                  = By.xpath("//div[contains(@id,'DisplayName_button') and @role='button']");
	private static By ActivityPatternHeader      = By.xpath("//div[contains(@id,'ActivityPatternsTitle')]//div[@role='heading']");
	private static By OOTBACtivities             = By.xpath("//div[contains(@id,'ActivityPatternsScreen-1')]//div[@class='gw-panelRefWidget--children gw-inner--spacing--none']");
	private static By Users_searchButton         = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	private static By Supervisor_StephenPerrella = By.xpath("//tr[contains(@id,'AdminUserSearchResultsLV-7-1')]");
	private static By Supervisor_PaulaZaander    = By.xpath("//tr[contains(@id,'AdminUserSearchResultsLV-13-1')]");
	private static By Supervisor_CeceliaPuglio   = By.xpath("//tr[contains(@id,'AdminUserSearchResultsLV-8-1')]");

	// misba
	private static By ActivityRules_contactInsured             = By.xpath("//div[@id='ActivityRules-CCRulesListScreen-RulesLV-2-Name']");
	private static By ActivityRules_Thirtydayreview            = By.xpath("//div[@id='ActivityRules-CCRulesListScreen-RulesLV-3-Name']");
	private static By ActivityRules_Verifycoverage             = By.xpath("//div[@id='ActivityRules-CCRulesListScreen-RulesLV-4-Name']");
	private static By ActivityRules_Sceneinspection            = By.xpath("//div[@id='ActivityRules-CCRulesListScreen-RulesLV-5-Name']");
	private static By ActivityRules_Propertyinspection         = By.xpath("//div[@id='ActivityRules-CCRulesListScreen-RulesLV-7-Name']");
	private static By ActivityRules_GetEmployeeInjuryNotice    = By.xpath("//div[@id='ActivityRules-CCRulesListScreen-RulesLV-9-Name']");
	private static By ActivityRules_CreateSIUscalationActivity = By.xpath("//div[@id='ActivityRules-CCRulesListScreen-RulesLV-11-Name']");
	private static By Clerical_NextPage                        = By.xpath("//input[@id='RoleDetailPage-RoleDetailScreen-RoleDetailDV-RolePrivilegesLV-_ListPaging-input']");
	private static By Clerical_actqueuepick                    = By.xpath("//tr[@id='RoleDetailPage-RoleDetailScreen-RoleDetailDV-RolePrivilegesLV-7-0']");
	private static By QueuedActivity_Checkbox                  = By.xpath("//input[contains(@name,'DesktopQueuedActivitiesLV-3-_Checkbox')]");
	private static By AssignedSelectedMe_Button                = By.xpath("//div[contains(@id,'DesktopQueuedActivities_AssignSelectedButton')]//div[@role='button']");
	private static By Roles_Clerical                           = By.xpath("//div[@id='Roles-RolesScreen-RolesLV-12-Name']//div[@role='button']");

	public static void exposurerulesHidden() throws Throwable {

		try {
			By ExposureRules = By.xpath("//div[@class='gw-label' and text()='Exposure Rules']");
			GuidewireAutomate_Validation("ExposureRules", ExposureRules, "notexist", "notexist");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void validateAdministrationHeader() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", Groups_Header, "equals", "Catastrophes");
		} catch (Exception e) {

		}
	}

	public static void reserverulesHidden() throws Throwable {

		try {
			By ReserveRules = By.xpath("//div[@class='gw-label' and text()='Reserve Rules']");
			GuidewireAutomate_Validation("Reserve Rules", ReserveRules, "notexist", "notexist");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Author - Pankaj Date - 15/12/2021 Description - Check Left Menu -->"Vantage Risk"
	 */
	public static void VantageRiskScreen() throws Throwable {

		try {
			GuidewireAutomate_Validation("Menu Vantage Risk", VantageRiskMenu, "equals", "Vantage Risk");
			GuidewireAutomate_Validation("Screen Header", Groups_Header, "equals", "Vantage Risk");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Author - Pankaj Date - 15/12/2021 Description - Admin Actions -->New Group -->"Verify Type"
	 */
	public static void VerifyNewGroup_Type() throws Throwable {
		String typeListValue = "Finance";
		try {
			GuidewireAutomate_Validation("Screen Header", Groups_Header, "equals", "New Group");
			String perTypeValues = getOptions_Element(NewGroup_Type);
			if (perTypeValues.contains(typeListValue)) {
				oExtentTest.log(Status.PASS, "Type Dropdown contains " + typeListValue + " Value");
			}

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void goNextPage(String strPageNo) throws Throwable {
		switch (strPageNo) {

			case "Page4" :
				GuidewireAutomate(strPageNo, Clerical_NextPage, "clearsendKeysoJavascriptExecutor", "4");
				GuidewireAutomate_Validation(strPageNo, Clerical_NextPage, "valueEqualsAssert", "4");

				break;
			default :
				throw new IOException("No support for Page : " + strPageNo);
		}

		oExtentTest.log(Status.PASS, "Navigated to Page No : " + strPageNo);

	}
	/*
	 * Author - Pankaj Date - 15/12/2021 Description - Admin Actions -->New Group -->"Verify Security Zone"
	 */
	public static void VerifyNewGroup_SecurityZone() throws Throwable {
		String typeListValue1 = "Bermuda";
		String typeListValue2 = "Global";
		String typeListValue3 = "US";
		try {
			GuidewireAutomate_Validation("Screen Header", Groups_Header, "equals", "New Group");
			String perTypeValues = getOptions_Element(NewGroup_SecurityZone);
			if (perTypeValues.contains(typeListValue1) && perTypeValues.contains(typeListValue2) && perTypeValues.contains(typeListValue3)) {
				oExtentTest.log(Status.PASS, "Security Zone Dropdown contains " + typeListValue1 + " ," + typeListValue2 + " ," + typeListValue3 + " Value");
			}

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner: Rahul Dixit Date: 21/01/2022
	 */
	public static void Verify_RetiredActivitysShouldNotDisplayed() throws Throwable {

		try {

			By RetiredActivities = By.xpath("//div[@class='gw-label' and text()='First name']");
			GuidewireAutomate_Validation("Retired Avtivities", RetiredActivities, "notexist", "notexist");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner: Rahul Dixit Date: 1/02/2022
	 */
	public static void Verify_StephenCeceliaAndPaulaAddedWithRoleOfSupervisorInUserAndSecurityScreen() throws Throwable {

		try {
			GuidewireAutomate("Search Button", Users_searchButton, "clickAndwait", "clickAndwait");

			GuidewireAutomate_Validation("Stephen Perrella Supervisor", Supervisor_StephenPerrella, "contains", "Bermuda Political Risk and Trade Credit");
			GuidewireAutomate_Validation(" Paula Zaander Supervisor", Supervisor_PaulaZaander, "contains", "US Underwriting");
			GuidewireAutomate_Validation("Cecelia Puglio Supervisor", Supervisor_CeceliaPuglio, "contains", "US Operations");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 15/12/2021 Description - Menu Users and Security -->Users"Verify Users"
	 */
	public static void VerifyGroupUsers() throws Throwable {
		String typeListValue1 = "Stephen Perrella";
		String typeListValue2 = "Cecelia Puglio";
		String typeListValue3 = "Michael Uzenski";
		String typeListValue4 = "Paula Zaander";
		try {
			GuidewireAutomate_Validation("Screen Header", Groups_Header, "equals", "Users");
			GuidewireAutomate("Search Button", Users_SearchButton, "clickAndwait", "click");
			Thread.sleep(1000);
			List<WebElement> perTypeValues = getElements(UsersName);
			for (WebElement UserName : perTypeValues) {
				String allusersName = UserName.getText();

				if (allusersName.contains(typeListValue1) || allusersName.contains(typeListValue2) || allusersName.contains(typeListValue3) || allusersName.contains(typeListValue4)) {
					oExtentTest.log(Status.PASS, "Users " + typeListValue1 + " ," + typeListValue2 + " ," + typeListValue3 + ", " + typeListValue4 + ", are Available");
					break;
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	// Misba
	public static void validateHeader() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", Groups_Header, "equals", "Vantage Risk");
			getStaleElement("Screen Header", Groups_Header);
		} catch (Exception e) {

		}
	}
	/*
	 * Owner: Rahul Dixit Date: 16/02/2022
	 */
	public static void VerifyPermissionActQueuePickAssignedToRoleClerical() throws Throwable {

		try {
			GuidewireAutomate("Roles Clerical", Roles_Clerical, "clickAndwait", "clickAndwait");
			CC_Administration.goNextPage("Page4");
			GuidewireAutomate_Validation("Activity From Queue", Clerical_actqueuepick, "contains", "actqueuepick");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner: Rahul Dixit Date: 16/02/2022
	 */
	public static void VerifyUserWithRoleClericalCanAssignTheSelectedActivity() throws Throwable {

		try {
			GuidewireAutomate("Queued Activity Checkbox", QueuedActivity_Checkbox, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Assigned Selected To Me Button", AssignedSelectedMe_Button, "equals", "Assign Selected To Me");
			GuidewireAutomate("Assigned Selected To Me Button", AssignedSelectedMe_Button, "clickAndwait", "clickAndwait");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Misba
	public static void DisabletheOOTBActivityBusinessRules() throws Throwable {
		try {
			GuidewireAutomate_Validation("contact Insured", ActivityRules_contactInsured, "contains", "CLW01000 - Contact insured");
			getStaleElement("contact Insured", ActivityRules_contactInsured);
			GuidewireAutomate_Validation("Thirty day review", ActivityRules_Thirtydayreview, "contains", "CLW02000 - Thirty day review");
			GuidewireAutomate_Validation("Verify coverage", ActivityRules_Verifycoverage, "contains", "CLW03100 - Verify coverage");
			GuidewireAutomate_Validation("Scene inspection", ActivityRules_Sceneinspection, "contains", "CLW04100 - Scene inspection");
			GuidewireAutomate_Validation("Property inspection", ActivityRules_Propertyinspection, "contains", "CLW05100 - Property inspection");
			GuidewireAutomate_Validation("Get Employee Injury Notice", ActivityRules_GetEmployeeInjuryNotice, "contains", "CLW07310 - Get Employee Injury Notice");
			GuidewireAutomate_Validation("Create SIU Escalation Activity", ActivityRules_CreateSIUscalationActivity, "contains", "CPU06000 - SI - Create SIU Escalation Activity");

		}

		catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}

	}
}
