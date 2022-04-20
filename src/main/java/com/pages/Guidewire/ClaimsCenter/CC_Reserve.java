package com.pages.Guidewire.ClaimsCenter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_Reserve extends SeleniumWebDriver_Commands {

	public CC_Reserve(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	private static By Reserve_Exposure     = By.xpath("//select[contains(@name,'Exposure')]");
	private static By Reserve_Coverage     = By.xpath("//td[contains(@id,'Coverage_Cell')]//div[contains(@id,'Coverage')]//div[@class='gw-label']");
	private static By Reserve_Add          = By.xpath("//div[contains(@id,'Add')]/div[@role='button']");
	private static By Reserve_CostType     = By.xpath("//select[contains(@name,'EditableReservesLV-0-CostType')]");
	private static By Reserve_CostCategory = By.xpath("//select[contains(@name,'EditableReservesLV-0-CostCategory')]");
	private static By Reserve_Reason       = By.xpath("//select[contains(@name,'EditableReservesLV-0-Reason_Ext')]");
	private static By Reserve_Currency     = By.xpath("//select[contains(@name,'EditableReservesLV-0-ReservingCurrency')]");

	private static By Reserve_NewAvailableReserves2 = By.xpath("//input[contains(@name,'EditableReservesLV-2-NewAmount')]");
	private static By Reserve_Reason0               = By.xpath("//select[contains(@name,'EditableReservesLV-0-Reason_Ext')]");
	private static By Reserve_Reason2               = By.xpath("//select[contains(@name,'EditableReservesLV-2-Reason_Ext')]");
	private static By Reserve_ReasonVaidation       = By.xpath("//div[contains(@id,'Reason_ExtHeader_inner')]//div[@class='gw-label' and text()='Reason']");
	private static By Changes_Validtaion            = By.xpath("//div[contains(@id,'EditableReservesLV-ChangeAmountHeader')]//div[contains(@id,'ChangeAmountHeader_inner')]");
	private static By Reason_Validtaion             = By.xpath("//div[contains(@id,'EditableReservesLV-Reason_ExtHeader')]//div[contains(@id,'Reason_ExtHeader_inner')]");
	private static By Comments_Validtaion           = By.xpath("//div[contains(@id,'EditableReservesLV-CommentsHeader')]//div[contains(@id,'CommentsHeader_inner')]");
	private static By Reserve_NewAvailableReserves  = By.xpath("//input[contains(@name,'EditableReservesLV-2-NewAmount')]");
	private static By Reserve_Comments              = By.xpath("//input[contains(@name,'EditableReservesLV-2-Comments')]");

	private static By Reserve_Remove = By.xpath("//div[contains(@id,'NewReserveSetScreen-Remove')]/div[@role='button']");

	private static By Reserve_Save = By.xpath("//div[contains(@id,'Update')]/div[@role='button']");

	private static By EditReserve_Header   = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Edit Reserves')]");
	private static By EditReserve_Currency = By.xpath("//div[contains(@id,'EditableReservesLV-0-ReservingCurrency')]");
	// div[contains(@id,'NewReserveSetScreen-Remove')]/div[@role='button']
	private static By ReserveDetails_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Reserve Details')]");
	private static By ReserveDetailsEdit    = By.xpath("//div[contains(@id,'EditButton')]//div[@role='button']");
	private static By EditReservingCurrency = By.xpath("//select[contains(@name,'Currency')]");
	private static By Reserve_CurrencyUSD   = By.xpath("//div[contains(@id,'EditableReservesLV-1-ReservingCurrency')]//div[@class='gw-RangeValue']");

	/*
	 * Edit reserve
	 */

	private static By ER_ExposureSelect       = By.xpath("//tr[contains(@id,'EditableReservesLV-0-1')]//div[contains(@id,'_Checkbox')]/input");
	private static By ER_Exposure             = By.xpath("//tr[contains(@id,'EditableReservesLV-0-1')]//td[contains(@id,'Exposure_Cell')]//select[contains(@name,'Exposure')]");
	private static By ER_Coverage             = By.xpath("//tr[contains(@id,'EditableReservesLV-0-1')]//td[contains(@id,'Coverage_Cell')]//select[contains(@name,'Coverage')]");
	private static By ER_CostType             = By.xpath("//tr[contains(@id,'EditableReservesLV-0-1')]//td[contains(@id,'CostType_Cell')]//select[contains(@name,'CostType')]");
	private static By ER_CostCategory         = By.xpath("//tr[contains(@id,'EditableReservesLV')]//td[contains(@id,'CostCategory_Cell')]//select[contains(@name,'CostCategory')]");
	private static By ER_NewAvailableReserves = By.xpath("//tr[contains(@id,'EditableReservesLV-0-1')]//td[contains(@id,'NewAmount_Cell')]//input[contains(@name,'NewAmount')]");
	private static By ER_Comments             = By.xpath("//tr[contains(@id,'EditableReservesLV-0-1')]//td[contains(@id,'Comments_Cell')]//input[contains(@name,'Comments')]");
	private static By ER_Save                 = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Save']");

	// Validation Results
	// validate Error Message
	private static By EditReserve_ValidationResults         = By.xpath("//div[contains(@id,'wsTabBar')]//div[@class='gw-label' and text()='Validation Results']");
	private static By EditReserve_ValidationResults_Warning = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[text()='Warnings:']");
	private static By ValidationResults_Warning_First       = By
			.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-0')]//div[@class='gw-message' and contains(text(),'Gross incurred on exposure (2) 1st Party Vehicle - PGNUtwMRX Automation')]");
	private static By ValidationResults_Warning_Second      = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-1')]//div[@class='gw-message' and contains(text(),'Gross incurred for')]");

	private static By ValidationResults_ClearButton = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");
	private static By EditReserve_SystemWarning     = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-1')]//div[@class='gw-message']");

	public static void EditReserve_VerifyDefaultReserve_Add_AllItems() throws Throwable {
		// Navigate Actions -> Reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		// Verify DefaultReserve is Already available
		EditReserves_DefaultReserve_Verify();
		// Add Items
		EditReserves_Add_AllItems();
	}

	public static void EditReserve_VerifyDefaultReserve_Add_Item() throws Throwable {
		// Navigate Actions -> Reserve
		CC_Reusables.ccMenuNavigation("Reserve");
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

	public static void AddingReserve_EachCostCategory_Electronic() throws Throwable {
		// Verify whether a default reserve is created
		EditReserves_DefaultReserve_Payment();
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// "CostCategory" is displayed with the below list and in the same order.
		EditReserves_Add_Item();
		// error msg for Electronic
		CC_Reserve.EditReserves_ValidationResultsElectronicEquipment();
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Financials.FT_DefaultReserve_Verify_Payment();
		CC_Financials.FT_Item_Verify();
	}

	public static void verify_DefaultReserve() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");

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
	/*
	 * Owner: Rahul Dixit Date: 25/01/2022
	 */
	public static void EditReserve_EnterAllRequirments() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("reserves1");

		try {
			GuidewireAutomate("Exposure", Reserve_Exposure, "selectByVisibleText", lhm_TestCase_Table_Data.get("Exposure"));

			GuidewireAutomate("Cost Type", Reserve_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
			getStaleElement("Cost Type", Reserve_CostType);
			GuidewireAutomate("Cost Category", Reserve_CostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostCategory"));
			getStaleElement("Cost Category", Reserve_CostCategory);
			GuidewireAutomate("Reason", Reserve_Reason, "selectByVisibleText", lhm_TestCase_Table_Data.get("Reason0"));

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner: Rahul Dixit Date: 25/01/2022
	 */
	public static void Verify_SystemWarningOutsideTheCoveragePeriod() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("reserves1");

		try {
			GuidewireAutomate_Validation("Warning Message", EditReserve_SystemWarning, "contains", "Loss Date or CMD/Reported Date");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void EditReserves_DefaultReserve_Payment() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Payment");

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

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");

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

	public static void EditReserves_Add_AllItems() throws Throwable {

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
					Thread.sleep(500);
					GuidewireAutomate("Add", Reserve_Add, "clickAndwait", "Click");
				} catch (ElementClickInterceptedException e) {
					GuidewireAutomate("Add", Reserve_Add, "clickAndwait", "click");
				}
			}
			Thread.sleep(500);
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

	public static void VerifyCostType_CostCategory() throws Throwable {

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
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Payment");
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
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asBasicInfo");

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
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asBasicInfo");
			String strChoosebyCoverage_Vehicle = lhm_TestCase_Table_Data.get("BI_IV_Select");

			GuidewireAutomate_Validation("ValidationResults Header", EditReserve_ValidationResults, "equals", "Validation Results");
			GuidewireAutomate_Validation("Warnings Title", EditReserve_ValidationResults_Warning, "equals", "Warnings:");

			By ValidationResults_Warning_First = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'Gross incurred for " + strChoosebyCoverage_Vehicle + "')]");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_First, "contains", "Gross incurred for");

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

	public static void verify_ReserveMutiCurrency() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("reserves1");
		By               rowCount  = By.xpath("//div[contains(@id,'EditableReservesLV')]//table[@class='gw-ListViewWidget--table gw-table']/tbody/tr");
		List<WebElement> TotalRows = getElements(rowCount);
		int              exactRow  = TotalRows.size() - 3;
		System.out.println(exactRow);
		By ER_CheckBox             = By.xpath("//input[contains(@name,'EditableReservesLV-" + exactRow + "-_Checkbox')]");
		By ER_CostType             = By.xpath("//select[contains(@name,'EditableReservesLV-" + exactRow + "-CostType')]");
		By ER_CostCategory         = By.xpath("//select[contains(@name,'EditableReservesLV-" + exactRow + "-CostCategory')]");
		By ER_ReservingCurrency    = By.xpath("//select[contains(@name,'EditableReservesLV-" + exactRow + "-ReservingCurrency')]");
		By ER_NewAvailableReserves = By.xpath("//input[contains(@name,'EditableReservesLV-" + exactRow + "-NewAmount')]");
		By ER_Comments             = By.xpath("//input[contains(@name,'EditableReservesLV-" + exactRow + "-Comments')]");

		GuidewireAutomate("CheckBox", ER_CheckBox, "clickAndwait", "click");
		GuidewireAutomate("Cost Type", ER_CostType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CostType"));
		Thread.sleep(500);
		GuidewireAutomate("Cost Category", ER_CostCategory, "selectByIndex", "1");

		GuidewireAutomate_Validation("Reserving Currency", ER_ReservingCurrency, "getOptionscontains", lhm_TestCase_Table_Data.get("ReservingCurrency"));
		GuidewireAutomate("New Available Reserves", ER_NewAvailableReserves, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewAvailableReserves"));
		GuidewireAutomate("Comments", ER_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Comment"));

	}

	public static void ER_ReservingCurrency() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("reserves1");
		int exactRow                = 0;
		By  ER_CheckBox             = By.xpath("//input[contains(@name,'EditableReservesLV-" + exactRow + "-_Checkbox')]");
		By  ER_Exposure             = By.xpath("//select[contains(@name,'EditableReservesLV-" + exactRow + "-Exposure')]");
		By  ER_CostType             = By.xpath("//select[contains(@name,'EditableReservesLV-" + exactRow + "-CostType')]");
		By  ER_CostCategory         = By.xpath("//select[contains(@name,'EditableReservesLV-" + exactRow + "-CostCategory')]");
		By  ER_ReservingCurrency    = By.xpath("//select[contains(@name,'EditableReservesLV-" + exactRow + "-ReservingCurrency')]");
		By  ER_NewAvailableReserves = By.xpath("//input[contains(@name,'EditableReservesLV-" + exactRow + "-NewAmount')]");
		By  ER_Reason               = By.xpath("//select[contains(@name,'EditableReservesLV-" + exactRow + "-Reason')]");
		By  ER_Comments             = By.xpath("//input[contains(@name,'EditableReservesLV-" + exactRow + "-Comments')]");

		GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
		GuidewireAutomate("CheckBox", ER_CheckBox, "clickAndwait", "click");
		GuidewireAutomate("Exposure", ER_Exposure, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("Exposure"));
		Thread.sleep(500);
		GuidewireAutomate("Cost Type", ER_CostType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CostType"));
		Thread.sleep(500);
		GuidewireAutomate("Cost Category", ER_CostCategory, "selectByIndex", "1");

		// GuidewireAutomate_Validation("Reserving Currency", ER_ReservingCurrency, "getOptionscontains",
		// lhm_TestCase_Table_Data.get("ReservingCurrency"));
		GuidewireAutomate("New Available Reserves", ER_NewAvailableReserves, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewAvailableReserves"));
		GuidewireAutomate("Reason", ER_Reason, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("Reason0"));
		GuidewireAutomate("Comments", ER_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Comment"));

	}

	/*
	 * Author:Pankaj Date :08/12/2021 Description: Create Reserve for Claim Cost and Expense d&CC
	 */
	public static void CreateReserve_ClaimCostAndExpenceDCC() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("reserves1");
		try {
			for (int i = 0; i <= 1; i++) {
				By ER_Exposure             = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-Exposure')]");
				By ER_CostType             = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostType')]");
				By ER_CostCategory         = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostCategory')]");
				By ER_NewAvailableReserves = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-NewAmount')]");
				By ER_Reason               = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-Reason_Ext')]");
				By ER_Comments             = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-Comments')]");
				getStaleElement("Exposure", ER_Exposure);
				GuidewireAutomate("Exposure", ER_Exposure, "selectByIndex", "1");
				getStaleElement("Cost Type", ER_CostType);
				GuidewireAutomate("Cost Type", ER_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType" + i));
				getStaleElement("Cost Category", ER_CostCategory);
				GuidewireAutomate("Cost Category", ER_CostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostCategory" + i));
				getStaleElement("Available Reserves", ER_NewAvailableReserves);
				GuidewireAutomate("Available Reserves", ER_NewAvailableReserves, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewAvailableReserves" + i));
				getStaleElement("Comments", ER_Comments);
				GuidewireAutomate("Comments", ER_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Comment"));

				if (i == 0) {
					getStaleElement("Reason", ER_Reason);
					GuidewireAutomate("Reason", ER_Reason, "selectByVisibleText", lhm_TestCase_Table_Data.get("Reason" + i));
				}

				if (i == 0) {
					getStaleElement("Add", Reserve_Add);
					GuidewireAutomate("Add", Reserve_Add, "clickAndwait", "Click");
				} else {
					getStaleElement("Save", Reserve_Save);
					GuidewireAutomate("Save", Reserve_Save, "clickAndwait", "click");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:21/01/2022
	public static void VerifyCostTypeList() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate_Validation("CostType", Reserve_CostType, "getOptionscontains", lhm_TestCase_Table_Data.get("CostType"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:21/01/2022
	public static void VerifyNewCurrencyAdded() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate_Validation("Currency", EditReservingCurrency, "getOptionscontains", lhm_TestCase_Table_Data.get("Currency"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Author:Pankaj
	// Date:23/01/2022
	public static void ReserveDetails_VerifyNewCurrencyAdd() throws Throwable {
		try {
			// lhm_TestCase_Table_Data = ClaimCenter_Resuables.getData_ClaimsCenter("Reserve");

			GuidewireAutomate_Validation("Screen Header", ReserveDetails_Header, "equals", "Reserve Details");
			GuidewireAutomate("Edit", ReserveDetailsEdit, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			Thread.sleep(1000);
			GuidewireAutomate("Add", Reserve_Add, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Author:Pankaj
	// Date:23/01/2022
	public static void ReserveDetails_VerifyNewCurrencyAdded() throws Throwable {
		try {
			Thread.sleep(1000);
			String Typelist1   = "CHF";
			String Typelist2   = "DKK";
			String Typelist3   = "ILS";
			String Typelist4   = "NOK";
			String Typelist5   = "NZD";
			String Typelist6   = "SEK";
			String Typelist7   = "SGD";
			String AllTypeList = getOptions_Element(EditReservingCurrency);

			if (AllTypeList.contains(Typelist1) && AllTypeList.contains(Typelist2) && AllTypeList.contains(Typelist3) && AllTypeList.contains(Typelist4) && AllTypeList.contains(Typelist5) && AllTypeList.contains(Typelist6)
					&& AllTypeList.contains(Typelist7)) {
				oExtentTest.log(Status.PASS, "Currency TypeList Dropdown contains " + Typelist1 + " and " + Typelist2 + " and " + Typelist3 + " and " + Typelist4 + " and " + Typelist5 + " and " + Typelist6 + " and " + Typelist7 + "");
			} else {
				oExtentTest.log(Status.FAIL, "Currency TypeList Dropdown Not contains " + Typelist1 + " and " + Typelist2 + " and " + Typelist3 + Typelist4 + " and " + Typelist5 + " and " + Typelist6 + " and " + Typelist7 + "");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Author:Misba
	// Date:24/01/2022
	public static void VerifyCostCategorywithCostTypeIndemnity() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate("CostType", Reserve_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));

			GuidewireAutomate_Validation("Currency", Reserve_Currency, "getOptionscontains", lhm_TestCase_Table_Data.get("Currency"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:24/01/2022
	public static void VerifyCostCategorywithCostTypeExpenseAO() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate("CostType", Reserve_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
			getStaleElement("CostType", Reserve_CostType);
			GuidewireAutomate_Validation("CostCategory", Reserve_CostCategory, "getOptionscontains", lhm_TestCase_Table_Data.get("CostCategory"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:24/01/2022
	public static void VerifyCostCategorywithCostTypeExpenseDCC() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate("CostType", Reserve_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
			getStaleElement("CostType", Reserve_CostType);
			GuidewireAutomate("CostCategory", Reserve_CostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostCategory"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:24/01/2022
	public static void VerifyExposureField() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate("Exposure", Reserve_Exposure, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("Exposure"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Author:Misba
	// Date:24/01/2022
	public static void VerifyExposureFieldNoneClaimLevel() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate("Exposure", Reserve_Exposure, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("Exposure1"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:24/01/2022
	public static void EnterAllRequirementsInEditReserves() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate("CostType", Reserve_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
			getStaleElement("CostType", Reserve_CostType);
			GuidewireAutomate("CostCategory", Reserve_CostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostCategory"));
			GuidewireAutomate("New Available Reserves", Reserve_NewAvailableReserves2, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewAvailableReserves"));
			GuidewireAutomate("Reason", Reserve_Reason0, "selectByVisibleText", lhm_TestCase_Table_Data.get("Reason0"));
			GuidewireAutomate("Reason", Reserve_Reason2, "selectByVisibleText", lhm_TestCase_Table_Data.get("Reason2"));
			GuidewireAutomate("Save", Reserve_Save, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:25/01/2022
	public static void ReasoniscreatedinbetweenChangeandComments() throws Throwable {
		try {

			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate_Validation(" Changes Validtaion", Changes_Validtaion, "contains", "Change");
			GuidewireAutomate_Validation("Reason is Created Between chnage and Comments", Reason_Validtaion, "contains", "Reason");
			GuidewireAutomate_Validation("Comments Validtaion", Comments_Validtaion, "contains", "Comments");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:25/01/2022
	public static void verifyReasonTypeList() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");

			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate_Validation("Reason", Reserve_Reason2, "getOptionscontains", lhm_TestCase_Table_Data.get("Reason2"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:24/01/2022
	public static void ReasonisMandatoryfortheFirstExposureandReserve() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate("CostType", Reserve_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
			getStaleElement("CostType", Reserve_CostType);
			GuidewireAutomate("CostCategory", Reserve_CostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostCategory"));
			GuidewireAutomate("Reason", Reserve_Reason2, "selectByVisibleText", lhm_TestCase_Table_Data.get("Reason2"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:27

	public static void ReasonisMandatoryfortheFirstExposureandReserveisIncreasing() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate("CostType", Reserve_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
			getStaleElement("CostType", Reserve_CostType);
			GuidewireAutomate("CostCategory", Reserve_CostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostCategory"));
			GuidewireAutomate("New Available Reserves", Reserve_NewAvailableReserves, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewAvailableReserves"));
			GuidewireAutomate("Reason is mandatory for increasing reserve line", Reserve_Reason0, "selectByVisibleText", lhm_TestCase_Table_Data.get("Reason0"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner: Rahul Dixit Date: 25/01/2022
	 */
	/*
	 * public static void EditReserve_EnterAllRequirments() throws Throwable { lhm_TestCase_Table_Data =
	 * ClaimCenter_Resuables.getData_ClaimsCenter("reserves1");
	 * 
	 * try { GuidewireAutomate("Exposure",Reserve_Exposure,"selectByVisibleText",lhm_TestCase_Table_Data.get("Exposure"));
	 * 
	 * GuidewireAutomate("Cost Type",Reserve_CostType,"selectByVisibleText",lhm_TestCase_Table_Data.get("CostType"));
	 * getStaleElement("Cost Type",Reserve_CostType);
	 * GuidewireAutomate("Cost Category",Reserve_CostCategory,"selectByVisibleText",lhm_TestCase_Table_Data.get("CostCategory"));
	 * getStaleElement("Cost Category",Reserve_CostCategory);
	 * GuidewireAutomate("Reason",Reserve_Reason0,"selectByVisibleText",lhm_TestCase_Table_Data.get("Reason0"));
	 * 
	 * } catch (NoSuchElementException e) {
	 * 
	 * e.printStackTrace(); throw e; } }
	 */

	// Author:Misba
	// Date:27/01/2022
	public static void CommentisMandatorywhenReasonisOther() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate("CostType", Reserve_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
			getStaleElement("CostType", Reserve_CostType);
			GuidewireAutomate("CostCategory", Reserve_CostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostCategory"));
			GuidewireAutomate("New Available Reserves", Reserve_NewAvailableReserves, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewAvailableReserves"));
			GuidewireAutomate("Reason ", Reserve_Reason0, "selectByVisibleText", lhm_TestCase_Table_Data.get("Reason0"));
			getStaleElement("Reason ", Reserve_Reason0);
			GuidewireAutomate("Comments is Mandatory", Reserve_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Comment"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:27/01/2022
	public static void ReasonisNotEditableforExpenseAO() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate("CostType", Reserve_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));

			GuidewireAutomate_Validation("Reason ", Reserve_ReasonVaidation, "equals", "Reason");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:27/01/2022
	public static void ReasonisNotEditableforExpenseDCC() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");
			GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate("CostType", Reserve_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType1"));

			GuidewireAutomate_Validation("Reason ", Reserve_ReasonVaidation, "equals", "Reason");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static void ER_CurrencyFieldisDefaultedToReserveScreen() throws Throwable {
		GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
		GuidewireAutomate_Validation("Defaulted Currency Reserve", EditReserve_Currency, "equals", "USD");

	}

	public static void Verify_CurrencyFieldIsNotEditable() throws Throwable {

		WebElement CurrencyEnabled = getElement(EditReserve_Currency);
		try {
			if (CurrencyEnabled.isEnabled()) {
				oExtentTest.log(Status.PASS, "Currency Field is not Editable");

			} else {
				oExtentTest.log(Status.FAIL, "Currency Field is Editable");

			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void CalculatoriconisHiddenNexttotheAvailableReserve() throws Throwable {

		try {
			By Calculator = By.xpath("//div[@class='gw-label' and text()='First name']");
			VerifyElementNotExist("Calculator icon isHidden Next to the Available Reserve", Calculator);

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ReserveDetails_VerifyNewCurrencyAddedUSD() throws Throwable {
		try {
			// GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
			GuidewireAutomate_Validation("CostType", Reserve_CurrencyUSD, "equals", "USD");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void addingReserve() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("reserves");

		GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");

		GuidewireAutomate("Cost Type", ER_CostType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CostType"));
		GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");

		GuidewireAutomate("Cost Category", ER_CostCategory, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CostCategory"));

		GuidewireAutomate("New Available Reserves", ER_NewAvailableReserves, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewAvailableReserves"));
		GuidewireAutomate("Comments", ER_Comments, "clearANDsendKeys", "Automation");

		GuidewireAutomate("Save", ER_Save, "click", "click");

		// GuidewireAutomate_Validation("Screen Header",
		// FinancialsTransactions_Header, "equals", "Financials: Transactions");

	}
}
