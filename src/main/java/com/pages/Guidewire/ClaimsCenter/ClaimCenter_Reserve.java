package com.pages.Guidewire.ClaimsCenter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ClaimCenter_Reserve extends SeleniumWebDriver_Commands implements ClaimCenter_Reserve_PO {

	public ClaimCenter_Reserve(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	public static void verify_DefaultReserve() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Reserve", strTestCaseName);
		// List<WebElement> ActivityPatterns = getElements(rowCount);
		int rowNum = Integer.parseInt(lhm_TestCase_Table_Data.get("rowNum"));

		for (int i = 0; i < rowNum; i++) {

			By reserve_Coverage = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
			By reserve_CostType = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-CostType')]");
			By reserve_CostCategory = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-CostCategory')]");
			By reserve_CurrentlyAvailable = By
					.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-AvailableReserves')]");
			// Default Reserve Verifying
			oExtentTest.log(Status.INFO,
					"Verifying Row= [" + (i + 1) + "] the defualt Reserve is Created for Coverage ="
							+ lhm_TestCase_Table_Data.get("Coverage" + i) + " and CostTye="
							+ lhm_TestCase_Table_Data.get("CostType" + i));

			GuidewireAutomate_Validation("Reserve Coverage", reserve_Coverage, "equals",
					lhm_TestCase_Table_Data.get("Coverage" + i));
			GuidewireAutomate_Validation("Reserve CostType", reserve_CostType, "equals",
					lhm_TestCase_Table_Data.get("CostType" + i));
			GuidewireAutomate_Validation("Reserve CostCategory", reserve_CostCategory, "equals",
					lhm_TestCase_Table_Data.get("CostCategory" + i));
			GuidewireAutomate_Validation("Reserve CurrentlyAvailable", reserve_CurrentlyAvailable, "equals",
					lhm_TestCase_Table_Data.get("CurrentlyAvailable" + i));

		}

	}

	public static void VerifyCostType_CostCategory() throws Throwable

	{

		int WebElementCostCategory = Integer.parseInt(lhm_TestCase_Table_Data.get("getOptionsSize"));
		int rowNum = Integer.parseInt(lhm_TestCase_Table_Data.get("rowNum"));

		for (int i = rowNum; i <= WebElementCostCategory; i++) {
			By reserve_CheckBox = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-_Checkbox')]");
			By reserve_Exposure = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-Exposure')]");
			By reserve_Collision = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
			By reserve_CostType = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostType')]");
			By reserve_CostCategory = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostCategory')]");
			By reserve_NewAvailableReserves=By.xpath("//input[contains(@name,'EditableReservesLV-"+i+"-NewAmount')]");
			if (i == 2) {

				GuidewireAutomate("CheckBox", reserve_CheckBox, "click", "NA");
				GuidewireAutomate("Exposure", reserve_Exposure, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("Exposure"));
				GuidewireAutomate_Validation("Coverage", reserve_Collision, "equals",
						lhm_TestCase_Table_Data.get("Coverage"));

				GuidewireAutomate_Validation("Verify CostType", reserve_CostType, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostTypeValues"));

				oExtentTest.log(Status.PASS, "The below list is displayed in the same order for Cost Type field " + "["
						+ lhm_TestCase_Table_Data.get("CostTypeValues") + "]");

				GuidewireAutomate("CostType", reserve_CostType, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostType"));

				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum2"));

				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue2"));
				
			
				ClickAddButton();
			} else if (i == 3) {

				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum3"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue3"));
				
				ClickAddButton();
			} else if (i == 4) {
				SelectExposureVerifyCollison(i);
				if(rowNum==i)
				{
					GuidewireAutomate_Validation("Verify CostType", reserve_CostType, "getOptionscontains",
							lhm_TestCase_Table_Data.get("CostTypeValues"));

					oExtentTest.log(Status.PASS, "The below list is displayed in the same order for Cost Type field " + "["
							+ lhm_TestCase_Table_Data.get("CostTypeValues") + "]");
					GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
							lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum4"));
					GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
							lhm_TestCase_Table_Data.get("CostCategoryDropDownValue4"));
				}
				else
				{
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum4"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue4"));
				}
				
				ClickAddButton();
			} else if (i == 5) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum5"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue5"));
				
				ClickAddButton();
			} else if (i == 6) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum6"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue6"));
				
				ClickAddButton();

			} else if (i == 7) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum7"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue7"));
				
				ClickAddButton();
			} else if (i == 8) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum8"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue8"));
				
				ClickAddButton();
			} else if (i == 9) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum9"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue9"));
				
				ClickAddButton();
			} else if (i == 10) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum10"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue10"));
				
				ClickAddButton();
			} else if (i == 11) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum11"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue11"));
				
				ClickAddButton();
			} else if (i == 12) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum12"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue12"));
				
				ClickAddButton();
			} else if (i == 13) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum13"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue13"));
				
				ClickAddButton();
			} else if (i == 14) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum14"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue14"));
				
				ClickAddButton();
			} else if (i == 15) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum15"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue15"));
				
				ClickAddButton();

			}

		}

	}

	public static void SelectExposureVerifyCollison(int i) throws Throwable {
		By reserve_CheckBox = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-_Checkbox')]");
		By reserve_Exposure = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-Exposure')]");
		By reserve_Coverage = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
		By reserve_CostType = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostType')]");

		GuidewireAutomate("CheckBox", reserve_CheckBox, "click", "NA");
		GuidewireAutomate("Exposure", reserve_Exposure, "selectByVisibleText", lhm_TestCase_Table_Data.get("Exposure"));
		GuidewireAutomate_Validation("Reserve Coverage", reserve_Coverage, "equals",
				lhm_TestCase_Table_Data.get("Coverage"));
		GuidewireAutomate("CostType", reserve_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
	}

	public static void ClickAddButton() throws Throwable {
		GuidewireAutomate("Add", Reserve_Add, "click", "NA");

	}

	public static void Saving_Reserves() throws Throwable {
		int WebElementCostCategory = Integer.parseInt(lhm_TestCase_Table_Data.get("getOptionsSize"));
		int lastrow = Integer.parseInt(lhm_TestCase_Table_Data.get("LastRow"));

		if (WebElementCostCategory == lastrow) {
			int getOptionsSize = WebElementCostCategory + 1;
			By reserve_CostCategory = By
					.xpath("//select[contains(@name,'EditableReservesLV-" + getOptionsSize + "-CostCategory')]");
			By reserve_CheckBox = By
					.xpath("//input[contains(@name,'EditableReservesLV-" + getOptionsSize + "-_Checkbox')]");

			SelectExposureVerifyCollison(WebElementCostCategory + 1);
			GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains", ",");

			oExtentTest.log(Status.PASS, "No TypeList Present for CastCategory");
			GuidewireAutomate("Remove", Reserve_Remove, "click", "NA");
			GuidewireAutomate("Save", Reserve_Save, "click", "NA");

		}
	}

	
	
}
