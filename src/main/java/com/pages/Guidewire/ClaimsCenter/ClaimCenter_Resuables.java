package com.pages.Guidewire.ClaimsCenter;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Drivers;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyInfo;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyReview;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Qualification;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Reusable;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_RiskAnalysis;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Vehicles;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Account;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class ClaimCenter_Resuables extends SeleniumWebDriver_Commands implements ClaimCenter_Resuables_PO {

	public ClaimCenter_Resuables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void clickButton(String ButtonName) throws Throwable {
		switch (ButtonName) {

		case "Next":
			GuidewireAutomate("Next", Next, "clickAndwait", "");
			break;
		case "Finish":
			GuidewireAutomate("Finish", Finish_Button, "clickAndwait", "");
			break;
		case "Update":
			GuidewireAutomate("Update", Update_Button, "clickAndwait", "");
			break;
		case "Cancel":
			GuidewireAutomate("Cancel", Cancel_Button, "clickAndwait", "");
			break;

		default:
			throw new IOException("No support for Button : " + ButtonName);
		}
	}

	public static String infoBar(String strLabel) throws Throwable {
		String strInfobar = null;

		switch (strLabel) {
		case "InsuredName":
			strInfobar = getText_Element(insuredName);
			Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "InsuredName", strInfobar);
			break;
		default:
			throw new IOException("No support for Label : " + strLabel);
		}
		oExtentTest.log(Status.INFO, " Fetched from Info Bar => " + strLabel + " = " + strInfobar);
		return strInfobar;
	}

	// ---->rename to assignClaimProcess
	public static void assignClaimProcess(String Account, String Job) throws Throwable {

		String strEditLock;

		switch (Account) {
		case "New Claim":
			GuidewireAutomate("Claims Tab", TabCC_Claim_dd, "click", "Null");
			GuidewireAutomate("New Claim", TabCC_Claim_NewClaim, "click", "Null");
			break;

		default:
			throw new IOException("No support for Account : " + Account);
		}

		switch (Job) {
		case "VerifiedPolicy_NewclaimAuto":
			ClaimCenter_SearchPolicy.fnol_Search_Exitsing_Policy();
			ClaimCenter_Resuables.clickButton("Next");
			ClaimCenter_BasicInformation.basicInfo();
			ClaimCenter_Resuables.clickButton("Next");
			ClaimCenter_AddClaimInformation.addClaimInfo();
			ClaimCenter_Resuables.clickButton("Next");
			ClaimCenter_Resuables.services();
			ClaimCenter_Resuables.clickButton("Next");
			ClaimCenter_Resuables.saveandAssign();
			ClaimCenter_Resuables.clickButton("Finish");
			ClaimCenter_Resuables.newClaimSaved();

			break;
		case "VerifiedPolicy_Newclaim_Auto_AutoFirstandFinal":
			ClaimCenter_SearchPolicy.fnol_Search_Exitsing_Policy();
			ClaimCenter_Resuables.clickButton("Next");
			ClaimCenter_AutoFirstandFinal.NewClaim_AutoFirstandFinal();
			ClaimCenter_Resuables.clickButton("Finish");
			ClaimCenter_Resuables.DuplicateClaims_Verify();
			ClaimCenter_Resuables.clickButton("Finish");
			ClaimCenter_Resuables.newClaimSaved();

			break;
		case "VerifiedPolicy_Newclaim_Auto_QuickClaimAuto":
			ClaimCenter_SearchPolicy.fnol_Search_Exitsing_Policy();
			ClaimCenter_Resuables.clickButton("Next");
			ClaimCenter_QuickClaimAuto.New_QuickClaimAuto();
			ClaimCenter_Resuables.clickButton("Finish");
			ClaimCenter_Resuables.DuplicateClaims_Verify();
			ClaimCenter_Resuables.clickButton("Finish");
			ClaimCenter_Resuables.newClaimSaved();


			break;

		}
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
		// ---->Add script to Select a user 09-07-2021 dinesh
		GuidewireAutomate_Validation("Screen Header", saveandassign_Header, "equals",
				"Step 5 of 5: Save and Assign Claim");

	}

	public static void newClaimSaved() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newClaimSaved",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", newClaimSaved_Header, "equals", "New Claim Saved");

		String strDynamicXpath = lhm_TestCase_Table_Data.get("NewClaimSaved");
		By View_the_newly_saved_claim = By.xpath("//div[contains(text(),'" + strDynamicXpath + "')]");
		By Create_another_new_claim = By.xpath("//div[contains(text(),'" + strDynamicXpath + "')]");
		By Add_Reserves_to_the_newly_saved_claim = By.xpath("//div[contains(text(),'" + strDynamicXpath + "')]");
		By Make_Payments_on_the_newly_saved_claim = By.xpath("//div[contains(text(),'" + strDynamicXpath + "')]");

		GuidewireAutomate("View the newly saved claim", View_the_newly_saved_claim, "clickAndwait", "NA");
		GuidewireAutomate_Validation("Screen Header", Summary_Header, "equals", "Summary");

	}

	public static void assignClaim() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", Assign_Header, "equals", "Assign");
		GuidewireAutomate("Assign", Assign_Button, "clickAndwait", "NA");
		GuidewireAutomate_Validation("Screen Header", Summary_Header, "equals", "Summary");

	}

	public static void newExposure() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure",
				strTestCaseName);

		String insuredName = driver
				.findElement(By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']")).getText();

		String strDynamicXpath = lhm_TestCase_Table_Data.get("NewExposure");
		By MedicalPayments = By.xpath(
				"//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item-2-item')]//div[@class='gw-label' and text()='"
						+ strDynamicXpath + "']");

		GuidewireAutomate("Medical Payments", MedicalPayments, "clickAndwait", "NA");
		GuidewireAutomate_Validation("Screen Header", NewExposurMedPay_Header, "equals", "New Exposure - Med Pay");
		GuidewireAutomate("Claimant", NEMP_Claimant, "selectByVisibleText", insuredName);

		GuidewireAutomate(" Injury Incident Overview", Injury_Incident_Overview, "clickAndwait", "NA");

		GuidewireAutomate("IIO NewIncident", IIO_NewIncident, "click", "NA");
		GuidewireAutomate("Loss Party", II_LossParty, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossParty"));
		GuidewireAutomate("Ok", OK, "clickAndwait", "NA");
		GuidewireAutomate("Update", ExposureUpdate_Button, "clickAndwait", "NA");
		GuidewireAutomate_Validation("Screen Header", Exposure_Header, "equals", "Exposures");

	}

	public static void addingReserve() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("reserves", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", EditReserves_Header, "equals", "Edit Reserves");

		GuidewireAutomate("Cost Type", ER_CostType, "selectByVisibleTextAndwait",
				lhm_TestCase_Table_Data.get("CostType"));
		GuidewireAutomate_Validation("Screen Header", EditReserves_Header, "equals", "Edit Reserves");

		GuidewireAutomate("Cost Category", ER_CostCategory, "selectByVisibleTextAndwait",
				lhm_TestCase_Table_Data.get("CostCategory"));

		GuidewireAutomate("New Available Reserves", ER_NewAvailableReserves, "clearANDsendKeys",
				lhm_TestCase_Table_Data.get("NewAvailableReserves"));
		GuidewireAutomate("New Available Reserves", ER_Comments, "clearANDsendKeys", "Automation");

		GuidewireAutomate("Save", ER_Save, "click", "NA");

		GuidewireAutomate_Validation("Screen Header", FinancialsTransactions_Header, "equals",
				"Financials: Transactions");

	}

	public static void selectPolicy() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("selectPolicy",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", PolicyGeneral_Header, "equals", "Policy: General");
		GuidewireAutomate("Select Policy", SelectPolicy, "click", "NA");
		GuidewireAutomate_Validation("Screen Header", SelectPolicy_Header, "equals", "Select Policy");
		GuidewireAutomate("Policy Number", SP_PolicyNumber, "clearANDsendKeys",
				lhm_TestCase_Table_Data.get("PolicyNumber"));
		GuidewireAutomate("Search", SP_Search, "click", "NA");
		GuidewireAutomate("Select", SP_Select, "click", "NA");

	}

	public static void DuplicateClaims_Verify() throws Throwable {
		GuidewireAutomate_Validation("Screen Header", DuplicateClaims_Header, "equals", "Possible Duplicate Claims");
		GuidewireAutomate_Validation("ErrorMsg", DuplicateClaims_ErrorMsg, "contains",
				"Possible duplicate claims found");
		GuidewireAutomate("DuplicateClaims_Close", DuplicateClaims_Close, "click", "NA");

	}

}