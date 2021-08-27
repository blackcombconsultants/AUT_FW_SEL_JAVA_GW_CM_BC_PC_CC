package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.Tab_Menu_Navigation;

public class ClaimCenter_Reserve extends SeleniumWebDriver_Commands implements ClaimCenter_Reserve_PO {

	public ClaimCenter_Reserve(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	public static void EditReserve_VerifyDefaultReserve_Add_AllItems() throws Throwable {
		// Navigate Actions -> Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");
		// Verify DefaultReserve is Already available
		EditReserves_DefaultReserve_Verify();
		// Add Items
		EditReserves_Add_AllItems();
	}

	public static void EditReserve_VerifyDefaultReserve_Add_Item() throws Throwable {
		// Navigate Actions -> Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");
		// Verify whether a default reserve is created
		EditReserves_DefaultReserve_Verify();
		EditReserves_Add_Item();
	}

	public static void AddingReserve_EachCostCategory_Rental() throws Throwable {
		// Verify whether a default reserve is created
		EditReserves_DefaultReserve_Payment();
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// "CostCategory" is displayed with the below list and in the same order.
		EditReserves_Add_Item();
		EditReserves_ValidationResults();

		// verifying financial transaction-> Reserve should be created successfully.
		CC_Financials.FT_DefaultReserve_Verify_Payment();
		CC_Financials.FT_Item_Verify();
	}

	public static void AddingReserve_EachCostCategory() throws Throwable {
		// Verify whether a default reserve is created
		EditReserves_DefaultReserve_Payment();
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// "CostCategory" is displayed with the below list and in the same order.
		EditReserves_Add_Item();

		// verifying financial transaction-> Reserve should be created successfully.
		CC_Financials.FT_DefaultReserve_Verify_Payment();
		CC_Financials.FT_Item_Verify();
	}

	public static void verify_DefaultReserve() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("Reserve");

		int intRow_DefaultReserve = Integer.parseInt(lhm_TestCase_Table_Data.get("rowNum"));

		for (int i = 0; i < intRow_DefaultReserve; i++) {

			By ER_Coverage           = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
			By ER_CostType           = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-CostType')]");
			By ER_CostCategory       = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-CostCategory')]");
			By ER_CurrentlyAvailable = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-AvailableReserves')]");

			oExtentTest.log(Status.INFO, "Verifying DefaultReserve Row = [" + (i + 1) + "]");

			GuidewireAutomate_Validation("Coverage", ER_Coverage, "equals", lhm_TestCase_Table_Data.get("Coverage" + i));
			GuidewireAutomate_Validation("CostType", ER_CostType, "equals", lhm_TestCase_Table_Data.get("CostType" + i));
			GuidewireAutomate_Validation("CostCategory", ER_CostCategory, "equals", lhm_TestCase_Table_Data.get("CostCategory" + i));
			GuidewireAutomate_Validation("Reserve Currently Available", ER_CurrentlyAvailable, "equals", lhm_TestCase_Table_Data.get("CurrentlyAvailable" + i));

		}

	}

	public static void EditReserves_DefaultReserve_Payment() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("Payment");

		// List<WebElement> ActivityPatterns = getElements(rowCount);
		int DR_EndRowNo = Integer.parseInt(lhm_TestCase_Table_Data.get("DefaultRow"));

		GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");

		for (int i = 0; i < DR_EndRowNo; i++) {

			By reserve_Coverage           = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
			By reserve_CostType           = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-CostType')]");
			By reserve_CostCategory       = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-CostCategory')]");
			By reserve_CurrentlyAvailable = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-AvailableReserves')]");

			oExtentTest.log(Status.INFO, "Verifying DefaultReserve Row = [" + (i + 1) + "]");

			GuidewireAutomate_Validation("Reserve Coverage", reserve_Coverage, "equals", lhm_TestCase_Table_Data.get("DR_Coverage" + (i + 1)));
			GuidewireAutomate_Validation("Reserve CostType", reserve_CostType, "equals", lhm_TestCase_Table_Data.get("DR_CostType" + (i + 1)));
			GuidewireAutomate_Validation("Reserve CostCategory", reserve_CostCategory, "equals", lhm_TestCase_Table_Data.get("DR_CostCategory" + (i + 1)));
			GuidewireAutomate_Validation("Reserve CurrentlyAvailable", reserve_CurrentlyAvailable, "equals", lhm_TestCase_Table_Data.get("DR_CurrentlyAvailable" + (i + 1)));

		}
	}

	public static void EditReserves_DefaultReserve_Verify() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("Reserve");

		int DR_EndRowNo = Integer.parseInt(lhm_TestCase_Table_Data.get("rowNum"));

		GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");

		for (int i = 0; i < DR_EndRowNo; i++) {

			By ER_Coverage           = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
			By ER_CostType           = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-CostType')]");
			By ER_CostCategory       = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-CostCategory')]");
			By ER_CurrentlyAvailable = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-AvailableReserves')]");

			oExtentTest.log(Status.INFO, "Verifying DefaultReserve Row = [" + (i + 1) + "]");

			GuidewireAutomate_Validation("Coverage", ER_Coverage, "equals", lhm_TestCase_Table_Data.get("Coverage" + i));
			GuidewireAutomate_Validation("CostType", ER_CostType, "equals", lhm_TestCase_Table_Data.get("CostType" + i));
			GuidewireAutomate_Validation("CostCategory", ER_CostCategory, "equals", lhm_TestCase_Table_Data.get("CostCategory" + i));
			GuidewireAutomate_Validation("Reserve Currently Available", ER_CurrentlyAvailable, "equals", lhm_TestCase_Table_Data.get("CurrentlyAvailable" + i));

		}

	}

	public static void EditReserves_Add_AllItems() throws Throwable

	{

		int StartRowNo = Integer.parseInt(lhm_TestCase_Table_Data.get("rowNum"));
		int EndRowNo   = Integer.parseInt(lhm_TestCase_Table_Data.get("getOptionsSize"));

		for (int i = StartRowNo; i <= EndRowNo; i++) {
			By ER_CheckBox             = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-_Checkbox')]");
			By ER_Exposure             = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-Exposure')]");
			By ER_Coverage             = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
			By ER_CostType             = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostType')]");
			By ER_CostCategory         = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostCategory')]");
			By ER_NewAvailableReserves = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-NewAmount')]");
			By ER_Comments             = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-Comments')]");

			if (i > StartRowNo) {
				try {
					GuidewireAutomate("Add", Reserve_Add, "clickAndwait", "Click");
				} catch (ElementClickInterceptedException e) {
					GuidewireAutomate("Add", Reserve_Add, "clickAndwait", "click");
				}
			}

			GuidewireAutomate("CheckBox", ER_CheckBox, "clickAndwait", "click");
			GuidewireAutomate("Exposure", ER_Exposure, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("Exposure"));
			GuidewireAutomate_Validation("Coverage", ER_Coverage, "equals", lhm_TestCase_Table_Data.get("Coverage"));
			GuidewireAutomate_Validation("Cost Type Values", ER_CostType, "getOptionscontains", lhm_TestCase_Table_Data.get("CostTypeValues"));
			GuidewireAutomate("Cost Type", ER_CostType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CostType"));
			getStaleElement("Cost Category", ER_CostCategory);
			GuidewireAutomate_Validation("Cost Category Values", ER_CostCategory, "getOptionscontains", lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum" + i));
			GuidewireAutomate("Cost Category", ER_CostCategory, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CostCategoryDropDownValue" + i));
			GuidewireAutomate("New Available Reserves", ER_NewAvailableReserves, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewAvailableReserves"));
			GuidewireAutomate("Comments", ER_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Comment"));

			if (i == EndRowNo) {
				GuidewireAutomate("Save", Reserve_Save, "clickAndwait", "click");
			}
		}

	}

	public static void VerifyCostType_CostCategory() throws Throwable

	{

		int StartRowNo = Integer.parseInt(lhm_TestCase_Table_Data.get("rowNum"));
		int EndRowNo   = Integer.parseInt(lhm_TestCase_Table_Data.get("getOptionsSize"));

		for (int i = StartRowNo; i <= EndRowNo; i++) {
			By ER_CheckBox             = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-_Checkbox')]");
			By ER_Exposure             = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-Exposure')]");
			By ER_Coverage             = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
			By ER_CostType             = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostType')]");
			By ER_CostCategory         = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostCategory')]");
			By ER_NewAvailableReserves = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-NewAmount')]");
			By ER_Comments             = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-Comments')]");

			if (i > StartRowNo) {
				try {
					GuidewireAutomate("Add", Reserve_Add, "clickAndwait", "Click");
				} catch (ElementClickInterceptedException e) {
					GuidewireAutomate("Add", Reserve_Add, "clickAndwait", "click");
				}
			}

			GuidewireAutomate("CheckBox", ER_CheckBox, "clickAndwait", "click");
			GuidewireAutomate("Exposure", ER_Exposure, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("Exposure"));
			GuidewireAutomate_Validation("Coverage", ER_Coverage, "equals", lhm_TestCase_Table_Data.get("Coverage"));
			GuidewireAutomate_Validation("Cost Type Values", ER_CostType, "getOptionscontains", lhm_TestCase_Table_Data.get("CostTypeValues"));
			GuidewireAutomate("Cost Type", ER_CostType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CostType"));
			getStaleElement("Cost Category", ER_CostCategory);
			GuidewireAutomate_Validation("Cost Category Values", ER_CostCategory, "getOptionscontains", lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum" + i));
			GuidewireAutomate("Cost Category", ER_CostCategory, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CostCategoryDropDownValue" + i));
			GuidewireAutomate("New Available Reserves", ER_NewAvailableReserves, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewAvailableReserves"));
			GuidewireAutomate("Comments", ER_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Comment"));

			if (i == EndRowNo) {
				GuidewireAutomate("Save", Reserve_Save, "clickAndwait", "click");
			}
		}

	}

	public static void EditReserves_Add_Item() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("Payment");
		int i = Integer.parseInt(lhm_TestCase_Table_Data.get("DefaultRow"));

		By ER_CheckBox             = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-_Checkbox')]");
		By ER_Exposure             = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-Exposure')]");
		By ER_Coverage             = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
		By ER_CostType             = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostType')]");
		By ER_CostCategory         = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostCategory')]");
		By ER_NewAvailableReserves = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-NewAmount')]");
		By ER_Comments             = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-Comments')]");

		GuidewireAutomate("CheckBox", ER_CheckBox, "clickAndwait", "click");
		GuidewireAutomate("Exposure", ER_Exposure, "selectByVisibleText", lhm_TestCase_Table_Data.get("Exposure"));
		GuidewireAutomate_Validation("Coverage", ER_Coverage, "equals", lhm_TestCase_Table_Data.get("Coverage"));
		GuidewireAutomate_Validation("Cost Type Values", ER_CostType, "getOptionscontains", lhm_TestCase_Table_Data.get("CostTypeValues"));
		oExtentTest.log(Status.PASS, "The below list is displayed in the same order for Cost Type field " + "[" + lhm_TestCase_Table_Data.get("CostTypeValues") + "]");
		GuidewireAutomate("CostType", ER_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
		getStaleElement("Cost Category", ER_CostCategory);
		GuidewireAutomate_Validation("Cost Category Values", ER_CostCategory, "getOptionscontains", lhm_TestCase_Table_Data.get("CostCategoryValues"));
		GuidewireAutomate("Cost Category", ER_CostCategory, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CostCategory"));
		GuidewireAutomate("New Available Reserves", ER_NewAvailableReserves, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewAvailableReserves"));
		GuidewireAutomate("Comments", ER_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Comment"));

		GuidewireAutomate("Save", Reserve_Save, "clickAndwait", "click");

	}

	public static void SelectExposureVerifyCollison(int i) throws Throwable {
		By reserve_Exposure = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-Exposure')]");
		By reserve_Coverage = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
		By reserve_CostType = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostType')]");
		GuidewireAutomate("Exposure", reserve_Exposure, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("Exposure"));
		GuidewireAutomate_Validation("Coverage", reserve_Coverage, "equals", lhm_TestCase_Table_Data.get("Coverage"));
		GuidewireAutomate("CostType", reserve_CostType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CostType"));
	}

	public static void AddNewAvailableReserves_Comment(int i) throws Throwable {
		By Reserve_NewAvailableReserves = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-NewAmount')]");
		By Reserve_Comments             = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-Comments')]");
		GuidewireAutomate("NewAvailableReserves", Reserve_NewAvailableReserves, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewAvailableReserves"));
		GuidewireAutomate("Comment", Reserve_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Comment"));
	}

	public static void EditReserves_Save() throws Throwable {
	}
	public static void EditReserves_Save1() throws Throwable {
		int WebElementCostCategory = Integer.parseInt(lhm_TestCase_Table_Data.get("getOptionsSize"));
		int lastrow                = Integer.parseInt(lhm_TestCase_Table_Data.get("LastRow"));

		if (WebElementCostCategory == lastrow) {
			int getOptionsSize       = WebElementCostCategory + 1;
			By  reserve_CostCategory = By.xpath("//select[contains(@name,'EditableReservesLV-" + getOptionsSize + "-CostCategory')]");
			By  reserve_CheckBox     = By.xpath("//input[contains(@name,'EditableReservesLV-" + getOptionsSize + "-_Checkbox')]");

			GuidewireAutomate("CheckBox", reserve_CheckBox, "clickAndwait", "click");

			SelectExposureVerifyCollison(WebElementCostCategory + 1);
			GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains", "");

			oExtentTest.log(Status.PASS, "No TypeList Present for CostCategory");
			GuidewireAutomate("Remove", Reserve_Remove, "clickAndwait", "click");
			GuidewireAutomate("Save", Reserve_Save, "clickAndwait", "click");

		}
	}

	public static void EditReserves_ValidationResults() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");

			GuidewireAutomate_Validation("ValidationResults Header", EditReserve_ValidationResults, "equals", "Validation Results");
			GuidewireAutomate_Validation("Warnings Title", EditReserve_ValidationResults_Warning, "equals", "Warnings:");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_First, "contains", "Gross incurred on exposure");
			GuidewireAutomate_Validation("Warnings Second", ValidationResults_Warning_Second, "contains", "Gross incurred for");
			GuidewireAutomate("Clear", ValidationResults_ClearButton, "clickAndwait", "click");
			GuidewireAutomate("Save", Reserve_Save, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void EditReserves_ValidationResultsElectronicEquipment() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
			String strChoosebyCoverage_Vehicle = lhm_TestCase_Table_Data.get("BI_IV_Select");

			GuidewireAutomate_Validation("ValidationResults Header", EditReserve_ValidationResults, "equals", "Validation Results");
			GuidewireAutomate_Validation("Warnings Title", EditReserve_ValidationResults_Warning, "equals", "Warnings:");

			By ValidationResults_Warning_First = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'Gross incurred for " + strChoosebyCoverage_Vehicle + "')]");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_First, "contains", "Gross incurred for 2000 Honda Civic");

			GuidewireAutomate("Clear", ValidationResults_ClearButton, "clickAndwait", "click");
			GuidewireAutomate("Save", Reserve_Save, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void clickAddButton() throws Throwable {

		try {
			GuidewireAutomate("Add", Reserve_Add, "clickAndwait", "click");
		} catch (ElementClickInterceptedException e) {
			GuidewireAutomate("Add", Reserve_Add, "clickAndwait", "click");

		}

	}

}
