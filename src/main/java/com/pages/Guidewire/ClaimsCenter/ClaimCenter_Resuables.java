package com.pages.Guidewire.ClaimsCenter;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

			default :
				throw new IOException("No support for Button : " + ButtonName);
		}
	}

	public static String infoBar(String strLabel) throws Throwable {
		String strInfobar = null;

		switch (strLabel) {
			case "PolicyNumber" :
				strInfobar = getText_Element(PolicyNumber);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "Job", strInfobar);

				break;

			case "InsuredName" :
				strInfobar = getText_Element(InsuredName);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "Job", strInfobar);

				break;
			case "LostDate" :
				strInfobar = getText_Element(LostDate);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "Job", strInfobar);

				break;
			case "Adjuster" :
				strInfobar = getText_Element(Adjuster);
				Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "Job", strInfobar);

				break;
			default :
				throw new IOException("No support for Label : " + strLabel);
		}
		oExtentTest.log(Status.INFO, " Fetched from Info Bar => " + strLabel + " = " + strInfobar);
		return strInfobar;
	}

	public static void newExposure() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure", strTestCaseName);

		String insuredName = driver.findElement(By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']")).getText();

		String strDynamicXpath = lhm_TestCase_Table_Data.get("NewExposure");
		By     MedicalPayments = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item-2-item')]//div[@class='gw-label' and text()='" + strDynamicXpath + "']");

		GuidewireAutomate("Medical Payments", MedicalPayments, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", NewExposurMedPay_Header, "equals", "New Exposure - Med Pay");
		GuidewireAutomate("Claimant", NEMP_Claimant, "selectByVisibleText", insuredName);

		GuidewireAutomate(" Injury Incident Overview", Injury_Incident_Overview, "clickAndwait", "click");

		GuidewireAutomate("IIO NewIncident", IIO_NewIncident, "click", "click");
		GuidewireAutomate("Loss Party", II_LossParty, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossParty"));
		GuidewireAutomate("Ok", OK, "clickAndwait", "click");
		GuidewireAutomate("Update", ExposureUpdate_Button, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", Exposure_Header, "equals", "Exposures");

	}

	public static void addingReserve() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("reserves", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", EditReserves_Header, "equals", "Edit Reserves");

		GuidewireAutomate("Cost Type", ER_CostType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CostType"));
		GuidewireAutomate_Validation("Screen Header", EditReserves_Header, "equals", "Edit Reserves");

		GuidewireAutomate("Cost Category", ER_CostCategory, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CostCategory"));

		GuidewireAutomate("New Available Reserves", ER_NewAvailableReserves, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewAvailableReserves"));
		GuidewireAutomate("Comments", ER_Comments, "clearANDsendKeys", "Automation");

		GuidewireAutomate("Save", ER_Save, "click", "click");

		// GuidewireAutomate_Validation("Screen Header",
		// FinancialsTransactions_Header, "equals", "Financials: Transactions");

	}

}