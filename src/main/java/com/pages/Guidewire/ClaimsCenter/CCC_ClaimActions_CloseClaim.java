package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CCC_ClaimActions_CloseClaim extends SeleniumWebDriver_Commands implements CCC_ClaimActions_CloseClaim_PO {

	public CCC_ClaimActions_CloseClaim(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void CloseClaim() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("closeClaim",
				strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", CloseClaim_Header, "contains", "Close Claim");
		GuidewireAutomate("Note", CloseClaim_Note, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Note"));
		GuidewireAutomate("Outcome", CloseClaim_Outcome, "selectByVisibleText", lhm_TestCase_Table_Data.get("Outcome"));
		GuidewireAutomate("CloseClaim_button", CloseClaim_button, "click", "");
	}

	public static void ValidationResults(String menu) throws Throwable {

		switch (menu) {

		case "WithOutExpsoure":

			GuidewireAutomate_Validation("Screen Header", CloseClaim_ValidationResults, "equals", "Validation Results");
			GuidewireAutomate_Validation("OpenActvitiesErrorMsg", CloseClaim_OpenActvitiesErrorMsg, "contains",
					"This claim has open activities");
			GuidewireAutomate("Clear", CloseClaim_Clear, "click", "");
			GuidewireAutomate("Cancel", CloseClaim_Cancel, "click", "");
			GuidewireAutomate_Validation("Summary_Header", Summary_Header, "equals", "Summary");

			break;
		case "WithExposure":
			GuidewireAutomate_Validation("Screen Header", CloseClaim_ValidationResults, "equals", "Validation Results");
			GuidewireAutomate_Validation("OpenExpsoureErrorMsg", CloseClaim_OpenExpsoureErrorMsg, "contains",
					"There are still open exposures for this claim");
			GuidewireAutomate_Validation("OpenActvitiesErrorMsg", CloseClaim_OpenActvitiesErrorMsg, "contains",
					"This claim has open activities");
			GuidewireAutomate("Clear", CloseClaim_Clear, "click", "");
			GuidewireAutomate("Cancel", CloseClaim_Cancel, "click", "");
		    GuidewireAutomate_Validation("Expsoure_Header", Expsoure_Header, "equals", "Exposures");
			break;

		case "WithCheckPayment":
			GuidewireAutomate_Handle("alertaccept", "");
            GuidewireAutomate_Validation("Screen Header", CloseClaim_ValidationResults, "equals", "Validation Results");
			GuidewireAutomate_Validation("OpenExpsoureErrorMsg", CloseClaim_OpenExpsoureErrorMsg, "contains",
					"There are still open exposures for this claim");
			GuidewireAutomate_Validation("OpenActvitiesErrorMsg", CloseClaim_OpenActvitiesErrorMsg, "contains",
					"This claim has open activities");
			GuidewireAutomate_Validation("FaultRatingMsg", CloseClaim_FaultRatingMsg, "contains",
					"The Fault Rating must be determined");
			GuidewireAutomate("Clear", CloseClaim_Clear, "click", "");
			GuidewireAutomate("Cancel", CloseClaim_Cancel, "click", "");
			GuidewireAutomate_Validation("FinancialChecks_Header", FinancialChecks_Header, "equals", "Financials: Checks");

			break;

		}
	}

}
