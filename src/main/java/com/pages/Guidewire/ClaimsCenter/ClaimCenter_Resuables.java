package com.pages.Guidewire.ClaimsCenter;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ClaimCenter_Resuables extends SeleniumWebDriver_Commands implements ClaimCenter_Resuables_PO {

	public ClaimCenter_Resuables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void clickButton(String ButtonName) throws Throwable {
		switch (ButtonName) {

			case "Next" :
				GuidewireAutomate("Next", Next, "click", "");
				break;
			case "Finish" :
				GuidewireAutomate("Finish", Finish, "clickAndwait", "");
				break;
			case "Update" :
				GuidewireAutomate("Update", Update, "click", "");
				break;

			default :
				break;
		}
	}

	public static String infoBar(String strLabel) throws Throwable {
		String strInfobar = null;

		switch (strLabel) {
			case "InsuredName" :
				strInfobar = getText_Element(insuredName);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "InsuredName", strInfobar);
				break;
			default :
				throw new IOException("No support for Label : " + strLabel);
		}
		oExtentTest.log(Status.INFO, " Fetched from Info Bar => " + strLabel + " = " + strInfobar);
		return strInfobar;
	}

	public static void NewClaim_AutoFirstandFinal() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("AutoFirstandFinal", strTestCaseName);

		String insured = ClaimCenter_Resuables.infoBar("InsuredName");
		// String
		// insuredName=driver.findElement(By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label
		// gw-infoValue']")).getText();

		GuidewireAutomate_Validation("Screen Header", AutoFirstandFinal_Header, "equals", "Step 2 of 2: Auto First and Final");

		String strDynamicXpath  = lhm_TestCase_Table_Data.get("WhoreportedClaim");
		By     WhoreportedClaim = By.xpath("//span[@class='gw-label--inner' and text()='" + strDynamicXpath + "']//parent::label[@class='gw-RangeRadioValueWidget--label']//input[contains(@id,'FirstFinalReportedAgencyRadioButton')]");

		GuidewireAutomate("WhoreportedClaim_Insured", WhoreportedClaim, "click", "NA");
		GuidewireAutomate("Name", AFF_Name, "selectByVisibleText", insured);

		GuidewireAutomate("Loss Description", AFF_Damage_LossDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LossDescription"));
		GuidewireAutomate("Claimant Name", AFF_Claimant_Name, "selectByVisibleText", insured);
		GuidewireAutomate("Location", Location, "selectByVisibleText", lhm_TestCase_Table_Data.get("Location"));
		GuidewireAutomate("State", State, "selectByVisibleText", lhm_TestCase_Table_Data.get("State"));
		try {
			GuidewireAutomate("Repair", AFF_Repair, "click", "NA");
		} catch (WebDriverException e) {
			Thread.sleep(2000);
			GuidewireAutomate("Repair", AFF_Repair, "click", "NA");

		}
		repairShop();
		GuidewireAutomate("Financials Name", AFF_Financials_Name, "selectByVisibleText", insured);
		try {
			GuidewireAutomate("Financials PayeeType", AFF_Financials_PayeeType, "selectByVisibleText", lhm_TestCase_Table_Data.get("PayeeType"));
		} catch (WebDriverException e) {
			GuidewireAutomate("Financials PayeeType", AFF_Financials_PayeeType, "selectByVisibleText", lhm_TestCase_Table_Data.get("PayeeType"));

		}
		GuidewireAutomate("Financials Amount", AFF_Financials_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("FinancialsAmount"));
		GuidewireAutomate("Financials State", AFF_Financials_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("FinancialsState"));

	}

	public static void repairShop() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("AutoFirstandFinal", strTestCaseName);
		GuidewireAutomate("NewAutobodyRepairShop", AFF_NewAutobodyRepairShop, "click", "NA");
		GuidewireAutomate("AutoRepairShop_Name", AFF_AutoRepairShop_Name, "clearANDsendKeys", lhm_TestCase_Table_Data.get("AutoRepairShopName"));
		GuidewireAutomate("AutoRepairShop TaxID", AFF_AutoRepairShop_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("AutoRepairShopTaxID"));
		GuidewireAutomate("Address1", AFF_AutoRepairShop_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Address1"));
		GuidewireAutomate("City", AFF_AutoRepairShop_City, "clearANDsendKeys", lhm_TestCase_Table_Data.get("City"));
		GuidewireAutomate("County", AFF_AutoRepairShop_County, "clearANDsendKeys", lhm_TestCase_Table_Data.get("County"));
		GuidewireAutomate("State", AFF_AutoRepairShop_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("AutoRepairShop_State"));
		GuidewireAutomate("ZIPCode", AFF_AutoRepairShop_ZIPCode, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ZIPCode"));

		try {
			GuidewireAutomate("Update", Update, "click", "NA");
		} catch (WebDriverException e) {
			GuidewireAutomate("Update", Update, "click", "NA");

		}

	}

	public static void New_QuickClaimAuto() throws Throwable {

		String insuredName = driver.findElement(By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']")).getText();

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("QuickClaimAuto", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", QuickClaimAuto_Header, "equals", "Step 2 of 2: Quick Claim Auto");
		GuidewireAutomate("ReportedBy_Name", QCA_ReportedBy_Name, "selectByVisibleText", insuredName);
		GuidewireAutomate("LossCause", QCA_LossDetails_LossCause, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossCause"));
		GuidewireAutomate("State", QCA_LossDetails_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("State"));
		GuidewireAutomate("Location", Location, "selectByVisibleText", lhm_TestCase_Table_Data.get("Location"));

	}

	public static void services() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("services", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", services_Header, "equals", "Step 4 of 5: Services");
		// String strDynamicXpath = lhm_TestCase_Table_Data.get("Rental");
		// By services_Rental = By.xpath("//div[contains(text(),'" +
		// strDynamicXpath+
		// "')]/preceding-sibling::div[contains(@id,'RentalInputGroup-_checkbox')]");
		// GuidewireAutomate("services Rental", services_Rental, "clickAndwait",
		// "NA");
		// GuidewireAutomate("Rental BeginDate", SR_RentalBeginDate,
		// "clearANDsendKeys", lhm_TestCase_Table_Data.get("RentalBeginDate"));
		// GuidewireAutomate("Rental EndDate", SR_RentalEndDate,
		// "clearANDsendKeys", lhm_TestCase_Table_Data.get("RentalEndDate"));
		// GuidewireAutomate("Rental DailyRate", SR_RentalDailyRate,
		// "clearANDsendKeys", lhm_TestCase_Table_Data.get("RentalDailyRate"));
		// GuidewireAutomate("Rental Agency", SR_RentalAgency,
		// "selectByVisibleText", lhm_TestCase_Table_Data.get("RentalAgency"));
		// GuidewireAutomate("Pick upLocation", SR_PickupLocation,
		// "selectByVisibleTextAndwait",
		// lhm_TestCase_Table_Data.get("PickupLocation"));
		//
	}

	public static void saveandAssign() throws Throwable {
		GuidewireAutomate_Validation("Screen Header", saveandassign_Header, "equals", "Step 5 of 5: Save and Assign Claim");

	}

	public static void newClaimSaved() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newClaimSaved", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", newClaimSaved_Header, "equals", "New Claim Saved");

		String strDynamicXpath                        = lhm_TestCase_Table_Data.get("NewClaimSaved");
		By     View_the_newly_saved_claim             = By.xpath("//div[contains(text(),'" + strDynamicXpath + "')]");
		By     Create_another_new_claim               = By.xpath("//div[contains(text(),'" + strDynamicXpath + "')]");
		By     Add_Reserves_to_the_newly_saved_claim  = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By     Make_Payments_on_the_newly_saved_claim = By.xpath("//div[contains(text(),'" + strDynamicXpath);

		GuidewireAutomate("View the newly saved claim", View_the_newly_saved_claim, "clickAndwait", "NA");
	}

	public static void assignClaim() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", assignClaim_Header, "equals", "Assign");
		GuidewireAutomate("Assign", Assign, "click", "NA");
	}

	public static void newExposure() throws Throwable {
		String insuredName = driver.findElement(By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']")).getText();
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure", strTestCaseName);
		String strDynamicXpath = lhm_TestCase_Table_Data.get("NewExposure");
		By     MedicalPayments = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item-2-item')]//div[@class='gw-label' and text()='" + strDynamicXpath + "']");
		GuidewireAutomate("Medical Payments", MedicalPayments, "clickAndwait", "NA");
		GuidewireAutomate_Validation("Screen Header", NewExposurMedPay_Header, "equals", "New Exposure - Med Pay");
		GuidewireAutomate("Claimant", NEMP_Claimant, "selectByVisibleText", insuredName);
		try {
			GuidewireAutomate(" Injury Incident Overview", Injury_Incident_Overview, "Click", "NA");

		} catch (WebDriverException e) {
			GuidewireAutomate(" Injury Incident Overview", Injury_Incident_Overview, "clickAndwait", "NA");

		}
		GuidewireAutomate("IIO NewIncident", IIO_NewIncident, "click", "NA");
		GuidewireAutomate("Loss Party", II_LossParty, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossParty"));
		GuidewireAutomate("Ok", ClaimCenter_Resuables.OK, "clickAndwait", "NA");
		GuidewireAutomate("Update", ClaimCenter_Resuables.Update, "clickAndwait", "NA");

	}

	public static void addingReserve() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("reserves", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", EditReserves_Header, "equals", "Edit Reserves");
		GuidewireAutomate("Cost Type", ER_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
		GuidewireAutomate("Cost Category", ER_CostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostCategory"));
		GuidewireAutomate("New Available Reserves", ER_NewAvailableReserves, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewAvailableReserves"));

		GuidewireAutomate("Save", ER_Save, "click", "NA");
	}
	public static void selectPolicy() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("selectPolicy", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", PolicyGeneral_Header, "equals", "Policy: General");
		GuidewireAutomate("Select Policy", SelectPolicy, "click", "NA");
		GuidewireAutomate_Validation("Screen Header", SelectPolicy_Header, "equals", "Select Policy");
		GuidewireAutomate("Policy Number", SP_PolicyNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PolicyNumber"));
		GuidewireAutomate("Search", SP_Search, "click", "NA");
		GuidewireAutomate("Select", SP_Select, "click", "NA");

	}

}