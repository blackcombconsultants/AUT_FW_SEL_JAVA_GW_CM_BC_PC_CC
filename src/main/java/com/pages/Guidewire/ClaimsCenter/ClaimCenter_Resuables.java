package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class ClaimCenter_Resuables extends SeleniumWebDriver_Commands implements ClaimCenter_Resuables_PO {

	public ClaimCenter_Resuables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void clickButton(String ButtonName) throws Throwable {
		switch (ButtonName) {

		case "Next":
			GuidewireAutomate("Next", Next, "click", "");
			break;
		case "Finish":
			GuidewireAutomate("Next", Finish, "click", "");
			break;
		case "Update":
			GuidewireAutomate("Next", Update, "click", "");
			break;
		default:
			break;
		}
	}


	public static void services() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("services",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header",services_Header, "equals", "Step 4 of 5: Services");
//		String strDynamicXpath = lhm_TestCase_Table_Data.get("TD_Rental");
//		By services_Rental = By.xpath("//div[contains(text(),'" + strDynamicXpath+ "')]/preceding-sibling::div[contains(@id,'RentalInputGroup-_checkbox')]");
//		GuidewireAutomate("services Rental", services_Rental, "clickAndwait", "NA");
//		GuidewireAutomate("Rental BeginDate", SR_RentalBeginDate, "clearANDsendKeys",  lhm_TestCase_Table_Data.get("TD_RentalBeginDate"));
//		GuidewireAutomate("Rental EndDate", SR_RentalEndDate, "clearANDsendKeys",  lhm_TestCase_Table_Data.get("TD_RentalEndDate"));
//		GuidewireAutomate("Rental DailyRate", SR_RentalDailyRate, "clearANDsendKeys",  lhm_TestCase_Table_Data.get("TD_RentalDailyRate"));
//		GuidewireAutomate("Rental Agency", SR_RentalAgency, "selectByVisibleText",  lhm_TestCase_Table_Data.get("TD_RentalAgency"));
//	    GuidewireAutomate("Pick upLocation", SR_PickupLocation, "selectByVisibleTextAndwait",  lhm_TestCase_Table_Data.get("TD_PickupLocation"));
//		
		
		
	}



	public static void saveandAssign() throws Throwable {
		GuidewireAutomate_Validation("Screen Header",saveandassign_Header, "equals", "Step 5 of 5: Save and Assign Claim");

	} 
	
	public static void newClaimSaved() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newClaimSaved",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header",newClaimSaved_Header, "equals", "New Claim Saved");
		
		String strDynamicXpath = lhm_TestCase_Table_Data.get("TD_NewClaimSaved");
		By View_the_newly_saved_claim = By.xpath("//div[contains(text(),'" + strDynamicXpath+ "')]");
		By Create_another_new_claim = By.xpath("//div[contains(text(),'" + strDynamicXpath+ "')]");
		By Add_Reserves_to_the_newly_saved_claim = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		By Make_Payments_on_the_newly_saved_claim = By.xpath("//div[contains(text(),'" + strDynamicXpath);
		
		GuidewireAutomate("View the newly saved claim", View_the_newly_saved_claim, "clickAndwait", "NA");
   }
	
	public static void assignClaim() throws Throwable
	{
		
		GuidewireAutomate_Validation("Screen Header",assignClaim_Header, "equals", "Assign");
		GuidewireAutomate("Assign", Assign, "click", "NA");
	}
	
	public static void newExposure() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure",
				strTestCaseName);
		String strDynamicXpath = lhm_TestCase_Table_Data.get("TD_NewExposure");
		By MedicalPayments=By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item-2-item')]//div[@class='gw-label' and text()='"+strDynamicXpath+"']");
		GuidewireAutomate("Medical Payments", MedicalPayments, "clickAndwait", "NA");
		GuidewireAutomate_Validation("Screen Header",NewExposurMedPay_Header, "equals", "New Exposure - Med Pay");
		GuidewireAutomate("Claimant", NEMP_Claimant, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_Claimant"));
		try
		{
			GuidewireAutomate(" Injury Incident Overview", Injury_Incident_Overview, "Click", "NA");
		
		}
		catch(WebDriverException e)
		{
			GuidewireAutomate(" Injury Incident Overview", Injury_Incident_Overview, "clickAndwait", "NA");

		}
		GuidewireAutomate("IIO NewIncident", IIO_NewIncident, "click", "NA");
		GuidewireAutomate("Loss Party", II_LossParty, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_LossParty"));
		GuidewireAutomate("Ok", ClaimCenter_Resuables.OK, "clickAndwait", "NA");
		GuidewireAutomate("Update", ClaimCenter_Resuables.Update, "clickAndwait", "NA");

	}
  
	public static void addingReserve() throws Throwable
	{
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("reserves",
				strTestCaseName);
		
		GuidewireAutomate_Validation("Screen Header",EditReserves_Header, "equals", "Edit Reserves");
		GuidewireAutomate("Cost Type", ER_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_CostType"));
		GuidewireAutomate("Cost Category", ER_CostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_CostCategory"));
    	GuidewireAutomate("New Available Reserves", ER_NewAvailableReserves, "clearANDsendKeys",  lhm_TestCase_Table_Data.get("TD_NewAvailableReserves"));

		GuidewireAutomate("Save", ER_Save, "click", "NA");
}
	
	

}