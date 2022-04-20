package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_ClaimActions extends SeleniumWebDriver_Commands {

	private static By BordereauReportNo  = By.xpath("//input[contains(@id,'BordereauReport_Ext_1')]");
	private static By BordereauReportYes = By.xpath("//input[contains(@id,'BordereauReport_Ext_0')]");

	private static By CloseClaim_Header  = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By CloseClaim_Note    = By.xpath("//textarea[contains(@name,'Note')]");
	private static By CloseClaim_Outcome = By.xpath("//select[contains(@name,'CloseClaimInfoDV-Outcome')]");
	private static By CloseClaim_button  = By.xpath("//div[contains(@id,'CloseClaimScreen-Update')]");
	private static By CloseClaim_Cancel  = By.xpath("//div[contains(@id,'CloseClaimScreen-Cancel')]");

	private static By CloseClaim_ValidationResults     = By.xpath("//div[contains(@id,'wsTabBar')]//div[@class='gw-label']");
	private static By CloseClaim_OpenActvitiesErrorMsg = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'This claim has open activities')]");
	private static By CloseClaim_OpenExpsoureErrorMsg  = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'There are still open exposures for this claim')]");
	private static By CloseClaim_FaultRatingMsg        = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'The Fault Rating must be determined')]");

	private static By Expsoure_Header        = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By CloseClaim_Clear       = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]");
	private static By FinancialChecks_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By Summary_Header         = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");

	private static By clicknAction         = By.xpath("//*[@id='Claim-ClaimMenuActions']/div[1]/div[2]/div");
	private static By actinSubmenu1        = By.xpath("//*[@id='Claim-ClaimMenuActions']/div[3]");
	private static By actinSubmenu2        = By.xpath("//*[@id='Claim-ClaimMenuActions-ClaimFileMenuItemSet-ClaimMenuActions_ClaimActions-ClaimMenuActions_CloseClaim']/div/div[2]");
	private static By outcome              = By.name("CloseExposurePopup-CloseExposureScreen-CloseExposureInfoDV-Outcome");
	private static By outcome1             = By.name("CloseExposurePopup-CloseExposureScreen-CloseExposureInfoDV-Outcome");
	private static By closeClaim1          = By.xpath("//*[@id='CloseExposurePopup-CloseExposureScreen-Update']/div/div[2]/div");
	private static By closeClaim           = By.xpath("//div[@id='CloseClaimPopup-CloseClaimScreen-Update'");
	private static By claimStatus          = By.xpath("//*[@id='l--11']");
	private static By accountIcon          = By.xpath("//div[@id='TabBar-AccountTab']//div[@class='gw-action--expand-button']");
	private static By accountSearchTextBox = By.xpath("//input[@name='TabBar-AccountTab-AccountTab_AccountNumberSearchItem']");
	private static By searchIcon           = By.xpath("//div[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem_Button']");
	private static By claimMenu            = By.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_AccountFile_Claims']");
	private static By searchButton         = By.xpath("//div[@id='AccountFile_Claims-AccountFile_ClaimScreen-SearchAndResetInputSet-SearchLinksInputSet-Search']");
	private static By policyStatus         = By.xpath("//tr[@id='AccountFile_Claims-AccountFile_ClaimScreen-AccountClaimsLV-5']/td[6]/ancestor::tr/following-sibling::tr/td[6]");

	private static By CloseClaim_PrimarySecondary   = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[contains(text(),'Enter Primary Loss Cause and Secondary')]");
	private static By CloseClaim_Edit               = By.xpath("//div[contains(@id,'ClaimLossDetailsScreen-Edit')]//div[@class='gw-label']");
	private static By CloseClaim_PrimaryLossCause   = By.xpath("//select[contains(@name,'LossDetailsDV-LossCause')]");
	private static By CloseClaim_SecondaryLossCause = By.xpath("//select[contains(@name,'SecondaryLossCause_Ext')]");
	private static By CloseClaim_Complexity         = By.xpath("//select[contains(@name,'LossDetailsDV-Complexity_Ext')]");
	private static By CloseClaim_Update             = By.xpath("//div[contains(@id,'ClaimLossDetails-ClaimLossDetailsScreen-Update')]//div[@class='gw-action--inner gw-hasDivider']");

	private static By Assign_SelectList = By.xpath("//select[contains(@name,'SelectFromList')]");
	private static By AssignButton      = By.xpath("//div[contains(@id,'AssignmentPopupScreen_ButtonButton')]//div[@role='button']");
	private static By Warning           = By.xpath("//div[@id='wsTabBar-wsTab_0']//div[@role='tab']");
	private static By WarningClear      = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");

	public CC_ClaimActions(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void CloseClaim() throws Throwable {
		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("closeClaim");

			GuidewireAutomate_Validation("Screen Header", CloseClaim_Header, "contains", "Close Claim");

			GuidewireAutomate("Note", CloseClaim_Note, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Note"));
			GuidewireAutomate("Outcome", CloseClaim_Outcome, "selectByVisibleText", lhm_TestCase_Table_Data.get("Outcome"));
			GuidewireAutomate("Close Claim", CloseClaim_button, "clickAndwait", "click");

			By ClaimSummaryGroup_ClaimStatus_Menu = By.xpath("//div[contains(@id,'ClaimSummaryGroup_ClaimStatus')]/div[@role='menuitem']");
			GuidewireAutomate("Status", ClaimSummaryGroup_ClaimStatus_Menu, "clickAndwait", "click");
			By ClaimStatus = By.xpath("//div[@id='ClaimStatus-ClaimStatus']//div[@class='gw-label']");
			GuidewireAutomate_Validation("status", ClaimStatus, "equals", "Closed");

			oExtentTest.log(Status.PASS, "CloseClaim is Successful");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static void CloseClaimWithWaring() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("closeClaim");
		try {

			GuidewireAutomate_Validation("Screen Header", CloseClaim_Header, "contains", "Close Claim");
			GuidewireAutomate("Note", CloseClaim_Note, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Note"));
			GuidewireAutomate("Outcome", CloseClaim_Outcome, "selectByVisibleText", lhm_TestCase_Table_Data.get("Outcome"));
			GuidewireAutomate("CloseClaim_button", CloseClaim_button, "clickAndwait", "click");

			By Warning      = By.xpath("//div[@id='wsTabBar-wsTab_0']//div[@role='tab']");
			By WarningClear = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");
			GuidewireAutomate_Validation("Warning", Warning, "equals", "Validation Results");
			GuidewireAutomate("Clear", WarningClear, "clickAndwait", "click");

			getStaleElement("CloseClaim_button", CloseClaim_button);
			GuidewireAutomate("CloseClaim_button", CloseClaim_button, "clickAndwait", "click");

			oExtentTest.log(Status.PASS, "CloseClaim is Successful");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ValidationResults(String menu) throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("closeClaim");

		switch (menu) {

			case "WithOutExpsoure" :

				GuidewireAutomate_Validation("Screen Header", CloseClaim_ValidationResults, "equals", "Validation Results");
				GuidewireAutomate_Validation("OpenActvitiesErrorMsg", CloseClaim_OpenActvitiesErrorMsg, "contains", "This claim has open activities");
				GuidewireAutomate("Clear", CloseClaim_Clear, "clickAndwait", "click");
				GuidewireAutomate("Cancel", CloseClaim_Cancel, "clickAndwait", "click");
				GuidewireAutomate_Validation("Summary_Header", Summary_Header, "equals", "Summary");

				break;
			case "WithExposure" :
				GuidewireAutomate_Validation("Screen Header", CloseClaim_ValidationResults, "equals", "Validation Results");
				GuidewireAutomate_Validation("OpenExpsoureErrorMsg", CloseClaim_OpenExpsoureErrorMsg, "contains", "There are still open exposures for this claim");
				GuidewireAutomate_Validation("OpenActvitiesErrorMsg", CloseClaim_OpenActvitiesErrorMsg, "contains", "This claim has open activities");
				GuidewireAutomate("Clear", CloseClaim_Clear, "clickAndwait", "click");
				GuidewireAutomate("Cancel", CloseClaim_Cancel, "clickAndwait", "click");
				GuidewireAutomate_Validation("Expsoure_Header", Expsoure_Header, "equals", "Exposures");
				break;

			case "WithCheckPayment" :
				GuidewireAutomate_Handle("alertaccept", "");
				GuidewireAutomate_Validation("Screen Header", CloseClaim_ValidationResults, "equals", "Validation Results");
				GuidewireAutomate_Validation("OpenExpsoureErrorMsg", CloseClaim_OpenExpsoureErrorMsg, "contains", "There are still open exposures for this claim");
				GuidewireAutomate_Validation("OpenActvitiesErrorMsg", CloseClaim_OpenActvitiesErrorMsg, "contains", "This claim has open activities");
				GuidewireAutomate_Validation("FaultRatingMsg", CloseClaim_FaultRatingMsg, "contains", "The Fault Rating must be determined");
				GuidewireAutomate("Clear", CloseClaim_Clear, "clickAndwait", "click");
				GuidewireAutomate("Cancel", CloseClaim_Cancel, "clickAndwait", "click");
				GuidewireAutomate_Validation("FinancialChecks_Header", FinancialChecks_Header, "equals", "Financials: Checks");

				break;

		}
	}

	/*
	 * Owner : Rahul Dixit
	 */
	public static void Outcome() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("closeClaim");

		GuidewireAutomate_Validation("Screen Header", CloseClaim_Header, "contains", "Close Claim");
		GuidewireAutomate("Note", CloseClaim_Note, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Note"));
		GuidewireAutomate_Validation("Outcome", CloseClaim_Outcome, "getOptionscontains", lhm_TestCase_Table_Data.get("Outcome"));

	}

	/*
	 * Owner : Rahul Dixit
	 */
	public static void CloseClaiminfo() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("closeClaim");

			GuidewireAutomate_Validation("Screen Header", CloseClaim_Header, "contains", "Close Claim");
			GuidewireAutomate("Note", CloseClaim_Note, "clearANDsendKeys", "Test");
			// GuidewireAutomate("Outcome",CloseClaim_Outcome, "selectByVisibleText", "Defence verdict");
			GuidewireAutomate("CloseClaim_button", CloseClaim_button, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner : Rahul Dixit
	 */

	public static void Error_primarySecondaryLossDetails() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("closeClaim");

			GuidewireAutomate_Validation("Primary and Secondary Loss Cause Error ", CloseClaim_PrimarySecondary, "equals", "Enter Primary Loss Cause and Secondary Loss Cause on Loss Details");
			GuidewireAutomate("Error Message", CloseClaim_PrimarySecondary, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit
	 */
	/*
	 * Owner : Rahul Dixit
	 */

	public static void LossDetails() throws Throwable {

		try {

			// GuidewireAutomate_Validation("Loss Details Header", CloseClaim_Header, "equals", "Loss Details");
			GuidewireAutomate("Edit", CloseClaim_Edit, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit
	 */

	public static void LossDetailsInformation() throws Throwable {
		// lhm_TestCase_Table_Data = ClaimCenter_Resuables.getData_ClaimsCenter("closeClaim");

		try {
			GuidewireAutomate("Primary Loss Cause", CloseClaim_PrimaryLossCause, "selectByVisibleText", "Diagnosis Issue");

			GuidewireAutomate("Secondary Loss Cause", CloseClaim_SecondaryLossCause, "selectByVisibleText", "Delayed");
			// GuidewireAutomate("Reported Date", CloseClaim_ReportedDate, "clearANDsendKeys", "Fire");
			GuidewireAutomate("Complexity", CloseClaim_Complexity, "selectByVisibleText", "Liability - High Complexity");

			/*
			 * //GuidewireAutomate("Reported Date", CloseClaim_ReportedDate, "clearANDsendKeys", "Fire"); GuidewireAutomate("Loss Date",
			 * CloseClaim_LossDate, "clearANDsendKeys", "22/01/2021"); GuidewireAutomate("Location", CloseClaim_Location, "clearANDsendKeys",
			 * "777 South Washington, Naperville, IL 60540"); GuidewireAutomate("Reported By", CloseClaim_ReportedBy, "clearANDsendKeys",
			 * "Geroge Clooney"); GuidewireAutomate("Relationship to Insured", CloseClaim_Relation, "clearANDsendKeys", "Agent");
			 */
			GuidewireAutomate("Update", CloseClaim_Update, "clickAndwait", "clickAndwait");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void AssignClaim() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("closeClaim");

		try {
			GuidewireAutomate("Select From List", Assign_SelectList, "selectByVisibleText", lhm_TestCase_Table_Data.get("AssignList"));
			GuidewireAutomate("Assign", AssignButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static void AssignClaimwithwarining() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("closeClaim");
		try {
			GuidewireAutomate("Select From List", Assign_SelectList, "selectByVisibleText", lhm_TestCase_Table_Data.get("AssignList"));
			GuidewireAutomate("Assign", AssignButton, "clickAndwait", "click");
			CC_Reusables.ValidationResults_Clear();

			GuidewireAutomate("Assign", AssignButton, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Misba
	public static void LossDetailsInformationBordereuReportYes() throws Throwable {
		try {
			GuidewireAutomate("Primary Loss Cause", CloseClaim_PrimaryLossCause, "selectByVisibleText", "Fire");

			GuidewireAutomate("Secondary Loss Cause", CloseClaim_SecondaryLossCause, "selectByVisibleText", "Animal");
			GuidewireAutomate("Complexity", CloseClaim_Complexity, "selectByVisibleText", "Liability - High Complexity");

			GuidewireAutomate("Bordereau Report Yes", BordereauReportYes, "clickAndwait", "Yes");

			GuidewireAutomate("Update", CloseClaim_Update, "clickAndwait", "clickAndwait");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Misba
	public static void LossDetailsInformationBordereuReportNo() throws Throwable {
		try {
			GuidewireAutomate("Primary Loss Cause", CloseClaim_PrimaryLossCause, "selectByVisibleText", "Fire");

			GuidewireAutomate("Secondary Loss Cause", CloseClaim_SecondaryLossCause, "selectByVisibleText", "Animal");
			GuidewireAutomate("Complexity", CloseClaim_Complexity, "selectByVisibleText", "Liability - High Complexity");

			GuidewireAutomate("Bordereau Report No", BordereauReportNo, "clickAndwait", "No");

			GuidewireAutomate("Update", CloseClaim_Update, "clickAndwait", "clickAndwait");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Misba
	 */
	public static void OutcomeClosingReason() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("closeClaim");

		GuidewireAutomate_Validation("Screen Header", CloseClaim_Header, "contains", "Close Claim");
		GuidewireAutomate_Validation("Closing Claim Reason Updated", CloseClaim_Outcome, "getOptionscontains", lhm_TestCase_Table_Data.get("Outcome"));

	}
}
