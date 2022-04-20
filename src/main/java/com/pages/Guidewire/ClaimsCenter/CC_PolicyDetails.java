package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_PolicyDetails extends SeleniumWebDriver_Commands {

	public CC_PolicyDetails(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}
	private static By PolicyDetails        = By.xpath("//div[@id='FNOLWizard-PolicyWizardStepGroup-PolicyDetails']//div[@class='gw-label']");
	private static By PolicyDetails_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Policy Details']");
	// Policy Details
	private static By PD_EditEntirePolicy = By.xpath("//div[contains(@id,'PolicyDetailsScreen_EditExternalFieldsButton')]//div[@role='button']");
	private static By PD_LocationAdd      = By.xpath("//div[contains(@id,'PolicyLocationsLV_tb-Add')]//div[@role='button']");

	// PolicyLocation
	private static By PolicyLocation_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By PL_Country            = By.xpath("//select[contains(@name,'GlobalAddressInputSet-Country')]");
	private static By PL_Address1           = By.xpath("//input[contains(@name,'AddressLine1')]");
	private static By PL_Address2           = By.xpath("//input[contains(@name,'AddressLine2')]");
	private static By PL_Address3           = By.xpath("//input[contains(@name,'AddressLine3')]");
	private static By PL_City               = By.xpath("//input[contains(@name,'GlobalAddressInputSet-City')]");
	private static By PL_State              = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");

	private static By EditEntirePolicyButton = By.xpath("//div[contains(@id,'EditExternalFieldsButton')]//div[@role='button']");
	private static By LocationEditButton     = By.xpath("//div[contains(@id,'LocationsScreen-Edit')]//div[@class='gw-label']");
	private static By PD_LocationAddButton   = By.xpath("//div[contains(@id,'PolicyLocationLDV_tb-Add')]//div[@role='button']");
	private static By PD_LocationsAddButton  = By.xpath("//div[contains(@id,'PolicyLocationsLV_tb-Add')]//div[@role='button']");
	private static By SCP_LocationAddButton  = By.xpath("//div[contains(@id,'PolicyLocationLDV_tb-Add')]//div[@role='button']");
	private static By GeneralEditButton      = By.xpath("//div[contains(@id,'ClaimPolicyGeneral_EditButton')]//div[@role='button']");
	private static By PL_CoveredRisks        = By.xpath("//div[contains(@id,'PolicyLocationRiskDetailPanelSet')]//div[text()='Covered Risks']");
	// AddLocationRisk->ALR
	private static By AddLocationRiskButton = By.xpath("//div[contains(@id,'AddLocationRisk')]//div[@role='button']");
	private static By ALR_CoveragesTab      = By.xpath("//div[contains(@id,'LocationCoveragesTab')]//div[@role='tab']");

	private static By ALR_Coverages_AddButton = By.xpath("//div[contains(@id,'CoveragesLV_tb-Add')]//div[@role='button']");

	private static By OK_Button   = By.xpath("//div[contains(@id,'Update')]//div[@role='button']");
	private static By PD_Location = By.xpath("//div[contains(@id,'Address_button')]");

	// Xpath for add other risks
	private static By AddOtherRiskButton = By.xpath("//div[contains(@id,'AddMiscLocationRisk')]//div[contains(@class,'gw-action--inner gw-hasDivider')]");

	public static void PD_LocationsAdd() throws Throwable {
		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("CC_PolicyDetails");

			GuidewireAutomate("PolicyDetails", PolicyDetails, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", PolicyDetails_Header, "equals", "Policy Details");
			GuidewireAutomate("EditEntirePolicy", PD_EditEntirePolicy, "clickAndwait", "click");
			GuidewireAutomate_Handle("alertaccept", "alert");
			GuidewireAutomate("PD_LocationAdd", PD_LocationAdd, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", PolicyLocation_Header, "equals", "Policy Location");
			GuidewireAutomate("Country", PL_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("PL_Country"));
			getStaleElement("Address1", PL_Address1);
			GuidewireAutomate("Address1", PL_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PL_Address1"));
			GuidewireAutomate("Address2", PL_Address2, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PL_Address2"));
			GuidewireAutomate("City", PL_City, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PL_City"));
			GuidewireAutomate("OK_Button", OK_Button, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static void PD_LocationsAdd_UVP_Bermuda() throws Throwable {
		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("CC_PolicyDetails");

			GuidewireAutomate("PolicyDetails", PolicyDetails, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", PolicyDetails_Header, "equals", "Policy Details");
			GuidewireAutomate("PD_LocationAdd", PD_LocationAdd, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", PolicyLocation_Header, "equals", "Policy Location");
			GuidewireAutomate("Country", PL_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("PL_Country"));
			getStaleElement("Address1", PL_Address1);
			GuidewireAutomate("Address1", PL_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PL_Address1"));
			GuidewireAutomate("Address2", PL_Address2, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PL_Address2"));
			GuidewireAutomate("City", PL_City, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PL_City"));
			GuidewireAutomate("OK_Button", OK_Button, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void PD_LocationsAdd_UVP_USA() throws Throwable {
		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("CC_PolicyDetails");

			GuidewireAutomate("PolicyDetails", PolicyDetails, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", PolicyDetails_Header, "equals", "Policy Details");
			GuidewireAutomate("PD_LocationAdd", PD_LocationAdd, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", PolicyLocation_Header, "equals", "Policy Location");
			GuidewireAutomate("Country", PL_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("PL_Country"));
			getStaleElement("Address1", PL_Address1);
			GuidewireAutomate("Address1", PL_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PL_Address1"));
			GuidewireAutomate("Address2", PL_Address2, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PL_Address2"));
			GuidewireAutomate("State", PL_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("PL_State"));

			GuidewireAutomate("OK_Button", OK_Button, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 03/12/2021 Description - Policy Details screen-->"Location Edit"
	 */
	public static void LC_EditPolicyLocation() throws Throwable {
		try {
			GuidewireAutomate_Validation("Page Header", PolicyLocation_Header, "equals", "Policy: Locations");
			GuidewireAutomate("Location Edit Button", LocationEditButton, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public static void PD_EditEntirePolicy() throws Throwable {
		try {
			GuidewireAutomate_Validation("Page Header", PolicyDetails_Header, "equals", "Policy Details");
			GuidewireAutomate("Edit Entire Policy Button", EditEntirePolicyButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Handle("alertaccept", "alert");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	// Author:Divya
	// Date:15/12/2021
	// validation for add other risks button
	public static void PL_AddOtherRisk() throws Throwable {

		try {
			GuidewireAutomate_Validation("Covered Risks", PL_CoveredRisks, "equals", "Covered Risks");
			GuidewireAutomate("Add Other RiskButton", AddOtherRiskButton, "clickAndwait", "clickAndwait");
			Thread.sleep(1000);
			getStaleElement("Add Other RiskButton", AddOtherRiskButton);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public static void PD_AddLocation_() throws Throwable {
		try {
			GuidewireAutomate("Location AddButton", PD_LocationAddButton, "clickAndwait", "clickAndwait");
			Thread.sleep(1000);
			GuidewireAutomate_Validation("Page Header", PolicyLocation_Header, "equals", "Policy Location");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}
	public static void PD_AddLocations() throws Throwable {
		try {
			GuidewireAutomate("Location AddButton", PD_LocationsAddButton, "clickAndwait", "clickAndwait");
			Thread.sleep(1000);
			GuidewireAutomate_Validation("Page Header", PolicyLocation_Header, "equals", "Policy Location");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void PL_AddLocationRisk() throws Throwable {

		try {
			GuidewireAutomate_Validation("Covered Risks", PL_CoveredRisks, "equals", "Covered Risks");
			Thread.sleep(2000);
			GuidewireAutomate("Location RiskButton", AddLocationRiskButton, "clickAndwait", "clickAndwait");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public static void ALR_RiskDetails() throws Throwable {
		try {

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}
	/*
	 * Author - Pankaj Date - 03/12/2021 Description - Policy General screen-->"Edit Policy for General"
	 */
	public static void LC_EditPolicyGeneral() throws Throwable {
		try {
			GuidewireAutomate_Validation("Page Header", PolicyLocation_Header, "equals", "Policy: General");
			GuidewireAutomate("General Edit Button", GeneralEditButton, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public static void ALR_Coverages() throws Throwable {
		try {
			GuidewireAutomate("Coverages Tab", ALR_CoveragesTab, "clickAndwait", "clickAndwait");
			Thread.sleep(2000);
			getStaleElement("Coverages Tab", ALR_CoveragesTab);
			GuidewireAutomate("Coverages AddButton", ALR_Coverages_AddButton, "clickAndwait", "clickAndwait");
			getStaleElement("Coverages AddButton", ALR_Coverages_AddButton);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void PolicyDetails_LocationVerified() throws Throwable {

		WebElement Location = getElement(PD_Location);
		try {
			if (Location.isDisplayed()) {
				oExtentTest.log(Status.PASS, "Policy Details Location Displayed");
			} else {
				oExtentTest.log(Status.FAIL, "Policy Details Location not Displayed");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Autor:Misba
	// Date: 29/12/2021
	// Description :Added covered risk
	public static void PD_LocationsAdd_CoveredRisk() throws Throwable {
		try {
			GuidewireAutomate("PolicyDetails", PolicyDetails, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", PolicyDetails_Header, "equals", "Policy Details");
			GuidewireAutomate("Edit Entire Policy Button", EditEntirePolicyButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Handle("alertaccept", "alert");
			GuidewireAutomate("PD_LocationAdd", PD_LocationAdd, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate_Validation("Screen Header", PolicyLocation_Header, "equals", "Policy Location");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
