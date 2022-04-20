package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_SearchPolicyOrCreatePolicy extends SeleniumWebDriver_Commands {
	public CC_SearchPolicyOrCreatePolicy(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By NCW_SearchorCreatePolicy_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Search or Create Policy')]");
	private static By CreateUnverifiedPolicy          = By.xpath("//span[@class='gw-label--inner' and text()='Create Unverified Policy']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ScreenMode')]");

	private static By ReportedDateEditable = By.xpath("//input[contains(@name,'ReportedDate_Ext')]");
	private static By SC_ExtReportingDate  = By.xpath("//div[contains(@id,'NewClaimPolicyGeneralDV-ExtendedRepDate_Ext_Input')]//div[@class='gw-label']");
	private static By ExtReportingDateMsg  = By.xpath("//div[contains(@id,'FindPolicyScreen-_msgs')]//div[(@class='gw-WebMessage')]");

	private static By SC_Organization = By.xpath("//select[contains(@name,'Underwriting_Company')]");

	private static By SC_TaxID             = By.xpath("//div[@class='gw-label' and text()='Tax ID']");
	private static By SC_LossDate          = By.xpath("//div[@class='gw-label' and text()='Loss Date/Claims Made Date']");
	private static By SC_LossDateClaimLoss = By.xpath("//div[@class='gw-label' and text()='Loss Date/Claims Made Date']");
	private static By SC_Search            = By.xpath("//div[contains(@id,'FNOLWizardFindPolicyPanelSet-Search')]");
	private static By SC_PolicySearch      = By.xpath("//input[contains(@name,'policyNumber')]");

	private static By SC_ClaimHistory        = By.xpath("//div[@class='gw-label gw-boldLabel' and text()='Claims History']");
	private static By SC_TypeOfClaim         = By.xpath("//span[@class='gw-label--inner' and text()='Liability']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ClaimMode')]");
	private static By SCP_FP_PolicyType      = By.xpath("//select[contains(@name,'PolicyType')]");
	private static By SCP_FP_Select          = By.xpath("//tr[contains(@id,'PolicyResultLV-0-0')]//td[contains(@id,'Select')]//div[contains(@id,'selectButton')]");
	private static By SCP_FP_ErrorMsgBermuda = By.xpath("//div[@class='gw-message' and text()='You do not have permission to create claims against Bermuda Policies']");
	private static By SCP_NC_LossDate        = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-Claim_LossDate')]");
	// UVP
	private static By UVP_OrganizationErrorMsg   = By.xpath("//div[contains(@id,'FindPolicyScreen-_msgs')]//div[@class='gw-message' and contains(text(),'Organization')]");
	private static By UVP_TypeOfClaimRadioButton = By.xpath("//input[contains(@id,'ClaimLossType_0')]");
	private static By UVP_TypeOfClaim_Liability  = By.xpath("//div[contains(@id,'ClaimLossType')]//span[@class='gw-label--inner' and text()='Liability']");

	private static By ReportedDateBasicInformation = By.xpath("//div[contains(@id,'ReportedDate_Ext_Input')]//div[@class='gw-label']");
	private static By LossDateBasicInformation     = By.xpath("//div[contains(@id,'Claim_LossDate_Input')]//div[@class='gw-label']");
	private static By ReportedDateNotEditable      = By.xpath("//div[contains(@id,'NewLossDetailsGeneralLiabilityDV-ReportedDate_Ext')]//div[@class='gw-value-readonly-wrapper']");

	public static void SearchorCreatePolicy_FirstName() throws Throwable {

		try {

			By FirstName = By.xpath("//div[@class='gw-label' and text()='First name']");

			VerifyElementNotExist("First Name", FirstName);

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// SearchPolicy LastName
	public static void SearchorCreatePolicy_LastName() throws Throwable {

		try {

			By LastName = By.xpath("//div[@class='gw-label' and text()='Last name']");

			VerifyElementNotExist("Last Name", LastName);

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// SearchPolicy Tax
	public static void SearchorCreatePolicy_TaxId() throws Throwable {

		try {

			GuidewireAutomate_Validation("Tax id", SC_TaxID, "equals", "Tax ID");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Author - Misba Date - 26/11/2021 Description - underwriter organisation matched with vantage type list
	 */
	public static void SearchorCreatePolicy_VantageTypeList() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");
			// ------> Verifying the page -
			GuidewireAutomate_Validation("Screen Header", NCW_SearchorCreatePolicy_Header, "contains", "Search or Create Policy");
			GuidewireAutomate("policy search", SC_PolicySearch, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_PolicyNumber"));

			GuidewireAutomate("Search Button", SC_Search, "clickAndwait", "clickAndwait");
			GuidewireAutomate("LossDate", SCP_NC_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_LossDate"));

			GuidewireAutomate("TypeOfClaim", SC_TypeOfClaim, "clickAndwait", "clickAndwait");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Author - Misba Date - 26/11/2021 Description - Error msg displayed does not have permission
	 */

	public static void SearchorCreatePolicy_ErrorMsgforcreatebermuda() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");
			GuidewireAutomate("Policy Type", SCP_FP_PolicyType, "selectByVisibleText", lhm_TestCase_Table_Data.get("SCP_FP_PolicyType"));

			GuidewireAutomate("Search Button", SC_Search, "clickAndwait", "clickAndwait");
			GuidewireAutomate("select Button", SCP_FP_Select, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Error msg displayed", SCP_FP_ErrorMsgBermuda, "contains", "You do not have permission to create ");
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	// SearchPolicy Vin
	public static void SearchorCreatePolicy_VinName() throws Throwable {

		try {

			By VinName = By.xpath("//div[@class='gw-label' and text()='VIN name']");

			VerifyElementNotExist("VIN Name", VinName);

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// SearchPolicy LossDate

	public static void SearchorCreatePolicy_LossDate() throws Throwable {

		try {

			GuidewireAutomate_Validation("Loss Date", SC_LossDate, "equals", "Loss Date/Claims Made Date");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	// SearchPolicy LossDate/ClaimLoss
	public static void SearchorCreatePolicy_LossClaimDate() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");
			GuidewireAutomate("policy search", SC_PolicySearch, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_PolicyNumber"));

			GuidewireAutomate("Search Button", SC_Search, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Loss Date", SC_LossDateClaimLoss, "equals", "Loss Date/Claims Made Date");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	// SearchPolicy Claim History
	public static void SearchorCreatePolicy_ClaimHistory() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");
			GuidewireAutomate("policy search", SC_PolicySearch, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_PolicyNumber"));

			GuidewireAutomate("Search Button", SC_Search, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Claim History", SC_ClaimHistory, "equals", "Claims History");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	// SearchPolicy Liability Quick Claim
	public static void SearchorCreatePolicy_LiabilityQuickClaim() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");
			GuidewireAutomate("policy search", SC_PolicySearch, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_PolicyNumber"));

			GuidewireAutomate("Search Button", SC_Search, "clickAndwait", "clickAndwait");
			GuidewireAutomate("TypeOfClaim", SC_TypeOfClaim, "clickAndwait", "clickAndwait");

			By QuickClaim = By.xpath("//input[contains(@id,'ClaimMode_1')]");

			VerifyElementNotExist("Quick Claim", QuickClaim);

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void UnderWriting_OrganizationErrorMsg() throws Throwable {
		try {
			GuidewireAutomate_Validation("Organization  Error Msg", UVP_OrganizationErrorMsg, "equals", "Organization : Missing required field \"Organization\"");
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	public static void UVP_TypeOfClaim() throws Throwable {
		try {
			// ------> Verifying the page -
			GuidewireAutomate_Validation("Screen Header", NCW_SearchorCreatePolicy_Header, "equals", "Step 1: Search or Create Policy");

			GuidewireAutomate("Create Unverified Policy", CreateUnverifiedPolicy, "clickAndwait", "click");
			GuidewireAutomate_Validation("TypeOfClaim Button", UVP_TypeOfClaimRadioButton, "isSelected", "isSelected");
			GuidewireAutomate_Validation("TypeOfClaim", UVP_TypeOfClaim_Liability, "equals", "Liability");
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Policy_LossAndReportedDate() throws Throwable {
		final By LossDatePolicy = By.xpath("//div[contains(@id,'FindPolicyPanelSet-date_Input')]//div[@class='gw-label']");
		final By ReportedPolicy = By.xpath("//div[contains(@id,'FindPolicyPanelSet-ReportedDate_Ext_Input')]//div[@class='gw-label']");
		// lhm_TestCase_Table_Data = ClaimCenter_Resuables.getData_ClaimsCenter("asFindPolicy");

		try {
			GuidewireAutomate_Validation("Loss Date", LossDatePolicy, "equals", "Loss Date");
			GuidewireAutomate_Validation("Reported Date", ReportedPolicy, "equals", "Reported Date");
			oExtentTest.log(Status.PASS, "Reported,Loss Date is Relabeled In Policy section");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void NewClaim_ReportedDateAndLossDate() throws Throwable {
		final By ReportedDateNewclaim = By.xpath("//div[contains(@id,'Claim_ReportedDate_Ext_Input')]//div[@class='gw-label']");
		final By LossDateNewclaim     = By.xpath("//div[contains(@id,'Claim_LossDate_Input')]//div[@class='gw-label']");
		// lhm_TestCase_Table_Data = ClaimCenter_Resuables.getData_ClaimsCenter("asFindPolicy");

		try {
			GuidewireAutomate_Validation("Reported Date", ReportedDateNewclaim, "equals", "Reported Date");
			GuidewireAutomate_Validation("Loss Date", LossDateNewclaim, "equals", "Loss Date");
			oExtentTest.log(Status.PASS, "Reported,Loss Date is Relabeled in New Claim");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Policy_ReportedDate() throws Throwable {
		final By ReportedDate = By.xpath("//div[contains(@id,'ReportedDate_Ext_Input')]//div[@class='gw-label']");

		// lhm_TestCase_Table_Data = ClaimCenter_Resuables.getData_ClaimsCenter("asFindPolicy");

		try {
			GuidewireAutomate_Validation("Reported Date", ReportedDate, "equals", "Reported Date");
			oExtentTest.log(Status.PASS, "Reported Date is Above Loss Date In Policy Section succesfully");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void NewClaim_ReportedDate() throws Throwable {
		final By ReportedDate = By.xpath("//div[contains(@id,'l--67')]");

		// lhm_TestCase_Table_Data = ClaimCenter_Resuables.getData_ClaimsCenter("asFindPolicy");

		try {

			GuidewireAutomate_Validation("Type of Claim", ReportedDate, "equals", "Type of Claim");
			oExtentTest.log(Status.PASS, "Reported Date is Above Loss Date In New Claim Section succesfull");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void NewClaim_ReportedDateAsMandatory() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");
		final By LossDateNewclaim      = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-Claim_LossDate')]");
		final By ReportedDateDateError = By.xpath("//div[contains(@id,'FindPolicyScreen-_msgs-0-0')]//div[@class='gw-message']");

		try {
			GuidewireAutomate(" Loss Date", LossDateNewclaim, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_LossDate"));
			CC_Reusables.clickButton("Next");

			GuidewireAutomate_Validation("Reported Date Error", ReportedDateDateError, "contains", "Reported Date : Missing required field \"Reported Date\"");
			oExtentTest.log(Status.PASS, "Reported Date is Mandatory");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void NewClaim_MinRetroDate() throws Throwable {
		final By RetroDate_NewClaim = By.xpath("//div[contains(@id,'MinRetroDate_ExtHeader_inner')]//div[@class='gw-label']");

		// lhm_TestCase_Table_Data = ClaimCenter_Resuables.getData_ClaimsCenter("asFindPolicy");

		try {

			GuidewireAutomate_Validation("Reported Date", RetroDate_NewClaim, "equals", "Min Retro Date");
			oExtentTest.log(Status.PASS, "Min Retro  After the Expires");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void NewClaim_ExtReportingDate() throws Throwable {
		final By ExtReportingDate_NewClaim = By.xpath("//div[contains(@id,'ExtendedRepDate_ExtHeader_inner')]//div[@class='gw-label']");

		try {

			GuidewireAutomate_Validation("Reported Date", ExtReportingDate_NewClaim, "equals", "Ext Reporting Date");
			oExtentTest.log(Status.PASS, "Ext Reporting Date is  After the Retro Date Success");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void NewClaim_LineOfbuisness() throws Throwable {
		final By LineOfbuisness_NewClaim = By.xpath("//div[contains(@id,'LineOfBusiness_ExtHeader_inner')]//div[@class='gw-label']");

		try {

			GuidewireAutomate_Validation("Line Of Buisness", LineOfbuisness_NewClaim, "equals", "Line of Business");
			oExtentTest.log(Status.PASS, "Line Of Buisness is  After the Claim Success");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_ReportedDateIsEditable() throws Throwable {

		WebElement DateEnabled = getElement(ReportedDateEditable);
		try {
			if (DateEnabled.isEnabled()) {
				oExtentTest.log(Status.PASS, "Reported  Date is Editable");
			} else {
				oExtentTest.log(Status.FAIL, "Reported Date is not Editable");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_ExtReportedDateIsEditable() throws Throwable {

		WebElement DateEnabled = getElement(SC_ExtReportingDate);
		try {
			if (DateEnabled.isEnabled()) {
				oExtentTest.log(Status.PASS, "Ext Reported  Date is Editable");
			} else {
				oExtentTest.log(Status.FAIL, "Ext Reported Date is not Editable");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_DateOfNoticeNotDisplayed() throws Throwable {
		final By ReportingDateClaimBarInfo = By.xpath("//div[contains(@id,'ReportedDate_Ext')]//div[@class='gw-label']");

		try {

			oExtentTest.log(Status.PASS, "Date of Notice is Not   Displayed ");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit Date: 24/01/2022
	 */
	public static void Verify_TaxIDFieldShouldRemoved() throws Throwable {
		final By TaxID = By.xpath("//div[contains(@id,'ReportedDate_Ext')]//div[@class='gw-label']");

		try {
			VerifyElementNotExist("Tax Id Field", TaxID);
			// oExtentTest.log(Status.PASS, "TaxId is Not Displayed In Search Or Create Policy Screen ");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner :Rahul Dixit Date: 24/01/2022
	 */
	public static void Verify_AddVehicleShouldRemoveInAddClaimInformationScreen() throws Throwable {
		final By AddVehicle = By.xpath("//div[contains(@id,'ReportedDate_Ext')]//div[@class='gw-label']");

		try {

			oExtentTest.log(Status.PASS, "Add Vehicle is Not  Displayed In Claim Info Screen ");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit Date: 24/01/2022
	 */
	public static void Verify_PolicyTypeFieldShouldRemovedInSearchCreatePolicyScreen() throws Throwable {
		final By PolicyType = By.xpath("//div[contains(@id,'PolicyType')]//div[@class='gw-label']");

		try {
			VerifyElementNotExist("Policy Type Field", PolicyType);
			// oExtentTest.log(Status.PASS, "TaxId is Not Displayed In Search Or Create Policy Screen ");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_ReportingDateClaimBarInfo() throws Throwable {
		final By ReportingDateClaimBarInfo = By.xpath("//div[contains(@id,'ReportedDate_Ext')]//div[@class='gw-label']");

		try {

			GuidewireAutomate_Validation("Reported Date", ReportingDateClaimBarInfo, "equals", "Reported:");
			oExtentTest.log(Status.PASS, " Reporting Date is  Displayed in  Claim Bar Info Success");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_LossDateBasicInformation() throws Throwable {

		try {
			Thread.sleep(1000);
			GuidewireAutomate_Validation("Loss Date", LossDateBasicInformation, "equals", "Loss Date");
			getStaleElement("Loss Date", LossDateBasicInformation);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_ReportedDateAboveLossDateBasicInformation() throws Throwable {
		try {
			Thread.sleep(1000);
			GuidewireAutomate_Validation("Reported Date", ReportedDateBasicInformation, "equals", "Reported Date");
			getStaleElement("Reported Date", ReportedDateBasicInformation);
			oExtentTest.log(Status.PASS, "ReportedDateAboveLossDate");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_ReportedDateShouldnotEditable() throws Throwable {

		try {
			Thread.sleep(1000);
			WebElement ReportedDate = driver.findElement(By.xpath("//div[contains(@id,'NewLossDetailsGeneralLiabilityDV-ReportedDate_Ext')]//div[@class='gw-value-readonly-wrapper']"));

			if (ReportedDate.isEnabled()) {

				oExtentTest.log(Status.PASS, "Reported Date is not Editable");
			} else {
				oExtentTest.log(Status.FAIL, "Reported Date is Editable");

			}
		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit
	 */
	public static void SearchorCreatePolicy_IncidentDate() throws Throwable {

		try {

			By FirstName = By.xpath("//div[@class='gw-label' and text()='First name']");

			VerifyElementNotExist("Incident Date", FirstName);

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_OrganisationDropdown() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		try {

			GuidewireAutomate_Validation("Organisation Dropdown", SC_Organization, "getOptionscontains", "Vantage Risk Ltd");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_OrganisationDropdownForUSGroup() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("policyGeneral");

		try {

			GuidewireAutomate_Validation("Organisation Dropdown", SC_Organization, "getOptionscontains", lhm_TestCase_Table_Data.get("PG_UW_Oganisation_Typelist"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_OrganisationDropdownForUS() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("policyGeneral");

		try {

			GuidewireAutomate_Validation("Organisation Dropdown", SC_Organization, "getOptionscontains", lhm_TestCase_Table_Data.get("PG_UW_Oganisation_Typelist"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_ExtReportingDateBelowExpirationDate() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		try {

			GuidewireAutomate_Validation("Ext Reporting Date", SC_ExtReportingDate, "equals", "Ext Reporting Date");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_ExtReportingDateIsMandatory() throws Throwable {

		String ExtReportingDate = getText_Element(ExtReportingDateMsg);
		String Errormessage     = "Reported Date";
		try {

			if (ExtReportingDate.contains(Errormessage)) {
				oExtentTest.log(Status.PASS, "Ext Reporting Date is Mandatory");
			} else {
				oExtentTest.log(Status.FAIL, "Ext Reporting Date is Not Mandatory");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Divya
	// 27/12/2021
	// search policy type
	public static void SearchorCreatePolicy_PolicyType() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");
		try {

			// GuidewireAutomate("Policy Type", SCP_FP_PolicyType, "selectByVisibleText", "Excess FI Blend");
			GuidewireAutomate("Search Button", SC_Search, "clickAndwait", "clickAndwait");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
