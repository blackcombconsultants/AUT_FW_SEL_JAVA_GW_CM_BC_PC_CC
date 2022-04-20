package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CC_SearchClaims extends SeleniumWebDriver_Commands {
	public CC_SearchClaims(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}
	public static By SC_SearchClaim_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Search Claims']");

	private static By SC_PrimaryLossCause    = By.xpath("//div[contains(@id,'PrimaryLossCause_Ext_Input')]//div[@class='gw-label' and text()='Primary Loss Cause']");
	private static By SC_SecondaryLossCause  = By.xpath("//div[contains(@id,'SecondaryLossCause_Ext_Input')]//div[@class='gw-label' and text()='Secondary Loss Cause']");
	private static By SC_OptionalParameters  = By.xpath("//div[contains(@id,'ClaimSearchOptionalInputSet')]//div[@class='gw-label gw-boldLabel' and text()='Optional parameters']");
	public static By  SC_SearchDate          = By.xpath("//div[contains(@id,'DateSearch_Input')]//div[@class='gw-label' and text()='Search For Date']");
	public static By  SC_SearchDate_Any      = By.xpath("//select[contains(@name,'DateSearchRangeValue')]");
	public static By  SC_SearchDate_Since    = By.xpath("//div[contains(@id,'DateSearchRangeChoice_Choice_radio')]");
	public static By  SC_LossDate            = By.xpath("//div[contains(@id,'LossDateHeader')]//div[@class='gw-header-content-wrapper']");
	public static By  SC_Reported            = By.xpath("//div[contains(@id,'ReportedDate_ExtHeader')]//div[@class='gw-header-content-wrapper']");
	public static By  Claim_saved            = By.xpath("//div[contains(@id,'NewClaimSavedDV-GoToClaim')]//div[@class='gw-action']");
	public static By  AssignClaim_SelectList = By.xpath("//select[contains(@name,'SelectFromList')]");
	public static By  AssignClaim_Button     = By.xpath("//div[contains(@id,'ButtonButton')]//div[@class='gw-action--inner gw-hasDivider']");
	public static By  ExposureWarning        = By.xpath("//div[contains(@id,'grpMsgs-0')]//div[@class='gw-message']");

	// SearchClaims for Primary and secondary in Advanced Search
	public static void SearchClaims_AdvancedSearch_PrimaryAndSecondary() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", SC_SearchClaim_Header, "equals", "Search Claims");
			GuidewireAutomate_Validation("Optional Parameters", SC_OptionalParameters, "equals", "Optional parameters");
			GuidewireAutomate_Validation("Primary Loss Cause", SC_PrimaryLossCause, "equals", "Primary Loss Cause");
			GuidewireAutomate_Validation("Secondary Loss Cause", SC_SecondaryLossCause, "equals", "Secondary Loss Cause");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	// SearchClaims for serach date in Advanced Search
	public static void SearchClaims_AdvancedSearch_SearchDate() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("SearchClaims");

			GuidewireAutomate_Validation("Screen Header", SC_SearchClaim_Header, "equals", "Search Claims");
			GuidewireAutomate_Validation("Search Date", SC_SearchDate, "equals", "Search For Date");
			GuidewireAutomate("Search for Date", SC_SearchDate_Any, "selectByVisibleText", lhm_TestCase_Table_Data.get("SearchDate_since"));
			GuidewireAutomate("Search Date Since", SC_SearchDate_Since, "clickAndwait", "clickAndwait");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	// serach claim fo Reported in simple search
	public static void SimpleSearch_Reported() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", SC_SearchClaim_Header, "equals", "Search Claims");
			GuidewireAutomate_Validation("Reported Date column is in between loss date and adjuster", SC_Reported, "equals", "Reported Date");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	// SearchClaims for reported in Advanced Search
	public static void AdvancedSearch_Reported() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", SC_SearchClaim_Header, "equals", "Search Claims");
			GuidewireAutomate_Validation("Reported Date column is in between loss date and adjuster", SC_Reported, "equals", "Reported Date");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	// serach claim for loss date in simple search
	public static void SimpleSearch_LossDate() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", SC_SearchClaim_Header, "equals", "Search Claims");
			GuidewireAutomate_Validation("Loss Date is Renamed to Loss Date/Claims Made Date", SC_LossDate, "equals", "Loss Date/Claims Made Date");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner;Rahul Dixit
	 */
	public static void ViewNewlySavedClaim() throws Throwable {
		try {
			GuidewireAutomate("Link", Claim_saved, "clickAndwait", "clickAndwait");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner;Rahul Dixit
	 */
	public static void AssignClaim() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asSaveAndAssignClaim");

		try {
			GuidewireAutomate("Select From List", AssignClaim_SelectList, "selectByVisibleText", lhm_TestCase_Table_Data.get("Select_From_List"));
			GuidewireAutomate("Assign Claim Button", AssignClaim_Button, "clickAndwait", "clickAndwait");
			// getStaleElement("Assign Claim Button",AssignClaim_Button);

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner;Rahul Dixit
	 */
	public static void VerifyExposureWarning() throws Throwable {

		try {
			GuidewireAutomate_Validation("Exposure warning", ExposureWarning, "equals", "Claim does not have an Exposure. Please create Exposure if possible");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	// SearchClaims for loss date in Advanced Search
	public static void AdvancedSearch_LossDate() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", SC_SearchClaim_Header, "equals", "Search Claims");
			GuidewireAutomate_Validation("Loss Date is Renamed to Loss Date/Claims Made Date", SC_LossDate, "equals", "Loss Date/Claims Made Date");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

}
