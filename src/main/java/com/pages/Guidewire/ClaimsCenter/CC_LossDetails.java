package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_LossDetails extends SeleniumWebDriver_Commands {
	public CC_LossDetails(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By SearchICDCodesHeader = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Search ICD Codes']");
	// Liability
	private static By Liability_AddInjuryButton = By.xpath(" //div[contains(@id,'AddInjuryButton')]//div[@role='button']");
	private static By InjuryIncidentHeader      = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Injury Incident']");

	private static By BodyPartsAddButton = By.xpath("//div[contains(@id,'EditableBodyPartDetailsLV_tb-Add')]//div[@role='button']");

	private static By MedicalDiagnosisAddButton = By.xpath("//div[contains(@id,'MedicalDiagnosisLV_tb-Add')]//div[@role='button']");
	private static By MedicalDiagnosisSearch    = By.xpath("//div[contains(@id,'ICDCode-SelectICDCode')]//span[@role='img']");
	private static By BodyStream                = By.xpath("//select[@name='ICDCodePopup-Find_Body_System']");
	private static By BodyStreamSearchButton    = By.xpath("//div[@id='ICDCodePopup-SearchButton']//div[@role='button']");

	private static By AddClaimInformation_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Step 3 of 4: Add claim information']");

	// Existing Claim
	private static By LossDetailsHeader  = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Loss Details']");
	private static By PrimaryLossCause   = By.xpath("//div[contains(@id,'LossDetailsDV-LossCause_Input')]//div[text()='Alleged Cause']");
	private static By SecondaryLossCause = By.xpath("//div[contains(@id,'SecondaryLossCause_Ext_Input')]//div[text()='Detailed Cause']");

	private static By EditButton                    = By.xpath("//div[@id='ClaimLossDetails-ClaimLossDetailsScreen-Edit']//div[@role='button']");
	private static By Complexity                    = By.xpath("//select[contains(@name,'LossDetailsDV-Complexity')]");
	private static By VehicleSection                = By.xpath("//div[contains(@id,'EditableVehicleIncidentsLV--label')]");
	private static By GeneralDamageSection          = By.xpath("//div[contains(@id,'EditableGeneralDamageIncidents_ExtLV--label')]");
	private static By WarningOutside_CP             = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-0')]//div[@class='gw-message']");
	private static By CloseClaim_PrimaryLossCause   = By.xpath("//select[contains(@name,'LossDetailsDV-LossCause')]");
	private static By CloseClaim_SecondaryLossCause = By.xpath("//select[contains(@name,'SecondaryLossCause_Ext')]");
	private static By CloseClaim_Complexity         = By.xpath("//select[contains(@name,'LossDetailsDV-Complexity_Ext')]");
	private static By CloseClaim_ReportedDate       = By.xpath("//div[contains(@class,'gw-vw--value')]//input[contains(@name,'LossDetailsDV-ReportedDate_Ext')]");
	private static By ReportedDateEditable          = By.xpath("//input[contains(@name,'ReportedDate_Ext')]");
	private static By CloseClaim_LossDate           = By.xpath("//input[contains(@name,'LossDetailsDV-LossDate') and @aria-label='date input']");
	private static By CloseClaim_Update             = By.xpath("//div[contains(@id,'ClaimLossDetails-ClaimLossDetailsScreen-Update')]//div[@class='gw-action--inner gw-hasDivider']");
	private static By ComplexityError               = By.xpath("//div[contains(@id,'msgs')]//div[contains(text(),'Complexity')]");
	private static By ComplexityDropdown            = By.xpath("//select[contains(@name,'Complexity_Ext')]");
	private static By ReportedDateError             = By.xpath("//div[contains(@id,'msgs')]//div[@class='gw-message']");
	private static By LossDetails                   = By.xpath("//div[contains(@id,'LossDate_Input')]//div[@class='gw-label']");
	private static By ReportedDate                  = By.xpath("//div[contains(@id,'ReportedDate_Ext_Input')]//div[@class='gw-label']");
	private static By HistoryType                   = By.xpath("//div[contains(@id,'HistoryLV-1-Type')]//div[@class='gw-value-readonly-wrapper']");
	private static By HistoryDescription            = By.xpath("//div[contains(@id,'HistoryLV-1-Description')]//div[@class='gw-value-readonly-wrapper']");
	private static By Matter_HistoryType            = By.xpath("//div[contains(@id,'ClaimHistoryScreen-HistoryLV-0-Type')]//div[@class='gw-value-readonly-wrapper']");
	private static By Matter_HistoryDescription     = By.xpath("//div[contains(@id,'ClaimHistoryScreen-HistoryLV-0-Description')]//div[@class='gw-value-readonly-wrapper']");
	private static By Matter_Link                   = By.xpath("//div[contains(@id,'ClaimHistoryScreen-HistoryLV-0-RelatedTo')]//div[@class='gw-ActionValueWidget']");
	private static By Matter_Header                 = By.xpath("//div[contains(@id,'MatterDetailScreen-ttlBar')]//div[@role='heading']");
	private static By LossDeatils_AddInjury         = By.xpath("//div[contains(@id,'EditableInjuryIncidentsLV_tb-Add')]//div[@role='button']");
	private static By HistoryTypes                  = By.xpath("//div[contains(@id,'HistoryLV-4-Type')]//div[@class='gw-value-readonly-wrapper']");
	private static By HistoryDescriptions           = By.xpath("//div[contains(@id,'HistoryLV-4-Description')]//div[@class='gw-value-readonly-wrapper']");

	public static void LossDetails_Liability_AddInjury() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate("Add Injury Button", Liability_AddInjuryButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void LossDetails_Liability_SearchMedicalDiagnosis() throws Throwable {

		try {

			GuidewireAutomate_Validation("Screen Header", InjuryIncidentHeader, "equals", "Injury Incident");
			GuidewireAutomate("Medical Diagnosis Button", MedicalDiagnosisAddButton, "clickAndwait", "click");
			GuidewireAutomate("Medical Diagnosis Search", MedicalDiagnosisSearch, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void LossDetails_Liability_MedicalDiagnosis_ICDCodeSelect() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asAddClaimInfo");
		try {

			GuidewireAutomate_Validation("Screen Header", SearchICDCodesHeader, "equals", "Search ICD Codes");
			GuidewireAutomate("Body Stream", BodyStream, "selectByVisibleText", lhm_TestCase_Table_Data.get("SelectBodyStream"));
			GuidewireAutomate("Body Stream Search", BodyStreamSearchButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void LossDetails_Liability_MedicalDiagnosis_ICDCodeVerify() throws Throwable {
		String format = "ICD10";
		// lhm_TestCase_Table_Data = ClaimCenter_Resuables.getData_ClaimsCenter("asAddClaimInfo");
		try {

			GuidewireAutomate_Validation("Screen Header", SearchICDCodesHeader, "equals", "Search ICD Codes");

			String dropDownValues = getOptions_Element(BodyStream);
			if (dropDownValues.contains(format)) {
				oExtentTest.log(Status.PASS, "All DropDown Values Contains " + format);
			} else {
				oExtentTest.log(Status.FAIL, "All DropDown Values Contains " + format);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * Author - Pankaj Date - 26/11/2021 Description - Check in Loss Details screen-->"Validate Primary and secondary Loss cause "
	 */
	public static void LossDetails_Verify_PrimaryAndSecondaryLossCause() throws Throwable {

		try {

			GuidewireAutomate_Validation("Screen Header", LossDetailsHeader, "equals", "Loss Details");
			GuidewireAutomate_Validation("Primary Loss Cause Section", PrimaryLossCause, "equals", "Alleged Cause");
			GuidewireAutomate_Validation("Secondary Loss Cause Section", SecondaryLossCause, "equals", "Detailed Cause");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	} /*
		 * Author - Pankaj Date - 26/11/2021 Description - Check in Loss Details screen-->"Validate Complexity dropdown value"
		 */
	public static void LossDetails_Verify_Complexity() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("lossDetails");
		try {

			GuidewireAutomate_Validation("Screen Header", LossDetailsHeader, "equals", "Loss Details");
			GuidewireAutomate("Edit Button", EditButton, "clickAndwait", "click");
			Thread.sleep(1000);
			GuidewireAutomate_Validation("Complexity", Complexity, "getOptionscontains", lhm_TestCase_Table_Data.get("Complexity"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Author - Pankaj Date - 26/11/2021 Description - Check in Loss Details screen-->"Validate Vehicle Section"
	 */
	public static void LossDetails_Verify_VehicleSection() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", LossDetailsHeader, "equals", "Loss Details");
			GuidewireAutomate_Validation("Vehicles Section", VehicleSection, "equals", "Vehicles");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Author - Pankaj Date - 26/11/2021 Description - Check in Loss Details screen-->"Validate General damages Section"
	 */

	public static void LossDetails_Verify_GeneralDamageSection() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", LossDetailsHeader, "equals", "Loss Details");
			GuidewireAutomate_Validation("General Damage Section", GeneralDamageSection, "equals", "General Damages");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void VerifyComplexityAboveLossDate() throws Throwable {

		try {

			GuidewireAutomate_Validation("Complexity", Complexity, "equals", "Complexity");

			oExtentTest.log(Status.PASS, "Complexity Is Above Loss Date Field");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner : Rahul Dixit
	 */

	public static void LossDetailsInformation() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("lossDetails");

		try {
			GuidewireAutomate("Primary Loss Cause", CloseClaim_PrimaryLossCause, "selectByVisibleText", lhm_TestCase_Table_Data.get("PrimaryLossCause"));
			getStaleElement("Primary Loss Cause", CloseClaim_PrimaryLossCause);
			GuidewireAutomate("Secondary Loss Cause", CloseClaim_SecondaryLossCause, "selectByVisibleText", lhm_TestCase_Table_Data.get("SecondaryLossCause"));
			GuidewireAutomate("Complexity", CloseClaim_Complexity, "selectByVisibleText", "Liability - High Complexity");
			getStaleElement("Secondary Loss Cause", CloseClaim_SecondaryLossCause);

			GuidewireAutomate("Reported Date", CloseClaim_ReportedDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ReportedDate"));
			getStaleElement("Reported Date", CloseClaim_ReportedDate);
			GuidewireAutomate("Update", CloseClaim_Update, "clickAndwait", "clickAndwait");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit
	 */
	public static void VerifyComplexityIsMandatory() throws Throwable {

		try {

			GuidewireAutomate_Validation("Complexity Error Message", ComplexityError, "contains", "Complexity : Missing required field");

			oExtentTest.log(Status.PASS, "Complexity Is Mandatory Field");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit
	 */
	public static void VerifyReportedDateMandatory() throws Throwable {

		try {

			GuidewireAutomate_Validation("Reported Date Error Message", ReportedDateError, "contains", "Reported Date : Missing required field");

			oExtentTest.log(Status.PASS, "Reported Date Is Mandatory");

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
	public static void Verify_CoverageInQuestionNotDisplayed() throws Throwable {

		try {

			By CoverageInQuestion = By.xpath("//div[@class='gw-label' and text()='Coverage In Question']");

			VerifyElementNotExist("Coverage In Question", CoverageInQuestion);
			oExtentTest.log(Status.PASS, " Coverage In Quesion is Removed");
		} catch (NoSuchElementException e) {
			oExtentTest.log(Status.FAIL, " Coverage In Quesion is Not  Removed");
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * /* Owner :Rahul Dixit
	 */
	public static void VerifyComplexityDropdown() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("lossDetails");

		try {

			GuidewireAutomate_Validation("Complexity Dropdown", ComplexityDropdown, "getOptionscontains", lhm_TestCase_Table_Data.get("Complexity"));

			oExtentTest.log(Status.PASS, "Complexity Is Above Loss Date Field");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit Date: 11/01/22
	 */
	public static void ChangeComplexityValue() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("lossDetails");

		try {

			GuidewireAutomate("Complexity Dropdown", ComplexityDropdown, "selectByVisibleText", lhm_TestCase_Table_Data.get("Complexity"));
			CC_Reusables.clickButton("Update");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit Date: 11/01/22
	 */
	public static void VerifyComplexityChangedInHistoryScreen() throws Throwable {

		try {

			GuidewireAutomate_Validation("History Type", HistoryTypes, "equals", "Complexity Changed");
			GuidewireAutomate_Validation("History Description", HistoryDescriptions, "contains", "Complexity was changed from Liability");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit Date: 11/01/22
	 */
	public static void VerifyDocumentDeletedInHistoryScreen() throws Throwable {

		try {

			GuidewireAutomate_Validation("History Type", HistoryType, "equals", "Document Deleted");
			GuidewireAutomate_Validation("History Description", HistoryDescription, "contains", "Document");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit Date: 11/01/22
	 */
	public static void VerifyMatterCreatedInHistoryScreen() throws Throwable {

		try {

			GuidewireAutomate_Validation("History Type", Matter_HistoryType, "equals", "Opened");
			GuidewireAutomate_Validation("History Description", Matter_HistoryDescription, "equals", "New matter created");
			GuidewireAutomate("link", Matter_Link, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Testing Header", Matter_Header, "equals", "Automation");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit Date: 24/01/2022
	 */
	public static void Verify_VehicleShouldRemoveInLossDetailsScreen() throws Throwable {
		final By Vehicle = By.xpath("//div[contains(@id,'ReportedDate_Ext')]//div[@class='gw-label']");

		try {

			oExtentTest.log(Status.PASS, " Vehicle is Not  Displayed In Loss Details Screen ");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit
	 */
	public static void VerifyLossDetailsRenamed() throws Throwable {

		try {

			GuidewireAutomate_Validation("Loss Details", LossDetails, "equals", "Loss Date");
			oExtentTest.log(Status.PASS, "Loss Date is Renamed");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner :Rahul Dixit
	 */
	public static void VerifyReportedDateAboveLossDate() throws Throwable {

		try {

			// GuidewireAutomate_Validation("EditButton",EditButton,"clickAndwait","clickAndwait");
			GuidewireAutomate_Validation("Reported Date", ReportedDate, "equals", "Reported Date");
			oExtentTest.log(Status.PASS, "Reported Date  is Above Loss date");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner : Rahul Dixit
	 */
	public static void IncidentDateRemoved() throws Throwable {

		try {

			By IncidentDate = By.xpath("//div[@class='gw-label' and text()='First name']");

			VerifyElementNotExist("Incident Date", IncidentDate);
			oExtentTest.log(Status.PASS, "Incident Field is Removed");
		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner : Rahul Dixit
	 */

	public static void LossDetailsInformationForError() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		try {

			GuidewireAutomate("Complexity", CloseClaim_Complexity, "selectByVisibleText", "Liability - High Complexity");
			Thread.sleep(2000);
			GuidewireAutomate("Reported Date", CloseClaim_ReportedDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_ReportedDate"));
			Thread.sleep(2000);
			GuidewireAutomate("Loss Date", CloseClaim_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_LossDate"));
			/*
			 * GuidewireAutomate("Location", CloseClaim_Location, "clearANDsendKeys", "777 South Washington, Naperville, IL 60540");
			 * GuidewireAutomate("Reported By", CloseClaim_ReportedBy, "clearANDsendKeys", "Geroge Clooney");
			 * GuidewireAutomate("Relationship to Insured", CloseClaim_Relation, "clearANDsendKeys", "Agent");
			 */
			GuidewireAutomate("Update", CloseClaim_Update, "clickAndwait", "clickAndwait");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixits
	 */
	public static void VerifyWarningOutsideCoveragePeriod() throws Throwable {

		try {

			GuidewireAutomate_Validation(" Error Message", WarningOutside_CP, "contains", "Warning: Loss Date or CMD");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void LossDetails_AddInjuries() throws Throwable {

		try {
			GuidewireAutomate("Add", LossDeatils_AddInjury, "clickAndwait", "clickAndwait");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
