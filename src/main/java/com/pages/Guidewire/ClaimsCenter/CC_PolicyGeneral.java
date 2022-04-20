package com.pages.Guidewire.ClaimsCenter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_PolicyGeneral extends SeleniumWebDriver_Commands {

	public CC_PolicyGeneral(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By PolicyGeneral_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Policy General']");
	private static By PolicyGeneral        = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Policy: General']");

	private static By PG_EditEntirePolicy_Button = By.xpath("//div[contains(@id,'EditExternalFieldsButton')]//div[@role='button']");
	private static By PG_Back_Button             = By.xpath("//div[contains(@id,'Prev')]/div[@role='button']");

	// Basic Information
	private static By PG_BasicInformation             = By.xpath("//div[@class='gw-label gw-boldLabel' and text()='Basic Information']");
	private static By PG_EEP_BI_EffectiveDate         = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-EffectiveDate')]");
	private static By PG_EEP_BI_ExpirationDate        = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-ExpirationDate')]");
	private static By PG_EEP_BI_ExtReportedDate       = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-ExtendedRepDate_Ext')]");
	private static By PG_EEP_BI_CancellationDate      = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-CancellationDate')]");
	private static By PG_EEP_BI_OriginalEffectiveDate = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-OrigEffectiveDate')]");
	private static By PG_EEP_BI_Status                = By.xpath("//select[contains(@name,'NewClaimPolicyGeneralDV-Status')]");
	private static By PG_EEP_BI_Currency              = By.xpath("//select[contains(@name,'NewClaimPolicyGeneralDV-Currency')]");

	// Insured
	private static By PG_Insured             = By.xpath("//div[@class='gw-label gw-boldLabel' and text()='Insured']");
	private static By PG_EEP_I_Name          = By.xpath("//select[contains(@name,'NewClaimPolicyGeneralDV-Insured_Name')]");
	private static By PG_EEP_I_AccountNumber = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-AccountNumber')]");

	// Additional Insured
	private static By PG_AdditionalInsured      = By.xpath("//div[@class='gw-ListView--UI--title' and text()='Additional Insured']");
	private static By PG_EEP_AI_Nodatatodisplay = By.xpath("//div[contains(@id,'EditableAdditionalInsuredLV')]//div[@class='gw-ListView--empty-info-row']/div[text()='No data to display']");
	private static By PG_EEP_AI_Add             = By.xpath("//div[contains(@id,'EditableAdditionalInsuredLV_tb-Add')]/div[@role='button']");

	// Excluded Parties
	private static By PG_ExcludedParties        = By.xpath("//div[@class='gw-ListView--UI--title' and text()='Excluded Parties']");
	private static By PG_EEP_EP_Nodatatodisplay = By.xpath("//div[contains(@id,'EditableExcludedPartiesLV')]//div[@class='gw-ListView--empty-info-row']/div[text()='No data to display']");
	private static By PG_EEP_EP_Add             = By.xpath("//div[contains(@id,'EditableExcludedPartiesLV_tb-Add')]/div[@role='button']");

	// Agent
	private static By PG_Agent              = By.xpath("//div[@class='gw-label gw-boldLabel' and text()='Agent']");
	private static By PG_EEP_A_Name         = By.xpath("//select[contains(@name,'NewClaimPolicyGeneralDV-Agent_Name')]");
	private static By PG_EEP_A_ProducerCode = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-ProducerCode')]");

	// Underwriting
	private static By PG_Underwriting        = By.xpath("//div[@class='gw-label gw-boldLabel' and text()='Underwriting']");
	private static By PG_EEP_UW_Underwriter  = By.xpath("//select[contains(@name,'NewClaimPolicyGeneralDV-Underwriter_Name')]");
	private static By PG_EEP_UW_Organization = By.xpath("//select[contains(@name,'NewClaimPolicyGeneralDV-Underwriting_Company')]");

	// Other
	private static By PG_Other                = By.xpath("//div[@class='gw-label gw-boldLabel' and text()='Other']");
	private static By PG_EEP_O_VerifiedPolicy = By.xpath("//div[contains(@id,'NewClaimPolicyGeneralDV-Other_VerifiedPolicy') and contains(@class,'ValueWidget')]//div[@class='gw-label']");
	private static By PG_EEP_O_Notes          = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-Other_Notes')]");

	// Policy-level Coverages
	private static By PG_CoverageForm               = By.xpath("//div[contains(@id,'EditableGeneralLiabilityPolicyCoveragesLV')]//div[@class='gw-header-content-wrapper']//div[@class='gw-label']");
	private static By PG_PolicylevelCoverages       = By.xpath("//div[@class='gw-TitleBar--title' and text()='Policy-level Coverages']");
	private static By PG_ClickSpecificCoverage      = By.xpath("//div[@class='gw-TitleBar--subtitle' and text()='Click a specific coverage to see additional coverage terms (if any)']");
	private static By PG_EEP_PLC_Add                = By.xpath("//div[contains(@id,'EditableGeneralLiabilityPolicyCoveragesLV_tb-Add')]/div[@role='button']");
	private static By PG_EEP_PLC_Nodatatodisplay    = By.xpath("//div[contains(@id,'EditableExcludedPartiesLV')]//div[@class='gw-ListView--empty-info-row']/div[text()='No data to display']");
	private static By PG_EEP_PLC_Retrodate_Header   = By.xpath("//div[contains(@id,'RetroActiveDate_ExtHeader_inner')]//div[@class='gw-label']");
	private static By PG_EEP_PLC_Type               = By.xpath("//select[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-0-CoverageType')]");
	private static By PG_EEP_PLC_CoverageForm       = By.xpath("//select[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-0-coverageForm_Ext')]");
	private static By PG_EEP_PLC_Currency           = By.xpath("//select[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-0-Currency')]");
	private static By PG_EEP_PLC_IncidentLimit      = By.xpath("//input[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-0-IncidentLimit')]");
	private static By PG_EEP_PLC_Retrodate          = By.xpath("//input[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-0-RetroActiveDate_Ext')]");
	private static By PG_EEP_PLC_Notes              = By.xpath("//input[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-0-Notes')]");
	private static By PG_CoverageFormPolicyLocation = By.xpath("//div[contains(@id,'EditablePropertyCoveragesLV')]//div[@class='gw-header-content-wrapper']//div[@class='gw-label']");

	private static By PG_EEP_PLC_Type2          = By.xpath("//select[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-1-CoverageType')]");
	private static By PG_EEP_PLC_CoverageForm2  = By.xpath("//select[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-1-coverageForm_Ext')]");
	private static By PG_EEP_PLC_Currency2      = By.xpath("//select[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-1-Currency')]");
	private static By PG_EEP_PLC_IncidentLimit2 = By.xpath("//input[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-1-IncidentLimit')]");
	private static By PG_EEP_PLC_Retrodate2     = By.xpath("//input[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-1-RetroActiveDate_Ext')]");
	private static By PG_EEP_PLC_Notes2         = By.xpath("//input[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-1-Notes')]");

	// Coverage Terms
	private static By PG_PLC_CoverageTerms                     = By.xpath("//div[@class='gw-ListView--UI--title' and text()='Coverage Terms']");
	private static By PG_PLC_CoverageTerms_Add                 = By.xpath("//div[contains(@id,'ClaimPolicyCovTermsLV_tb-AddCovTerm')]/div[@role='button']");
	private static By PG_PLC_CT_Add_ClassificationCoverageTerm = By.xpath("//div[contains(@id,'CovTermMenuItem')]/div[@role='menuitem']/div[@class='gw-label' and text()='Classification Coverage Term']");
	private static By PG_PLC_CT_Add_FinancialCoverageTerm      = By.xpath("//div[contains(@id,'CovTermMenuItem')]/div[@role='menuitem']/div[@class='gw-label' and text()='Financial Coverage Term']");
	private static By PG_PLC_CT_Add_NumericCoverageTerm        = By.xpath("//div[contains(@id,'CovTermMenuItem')]/div[@role='menuitem']/div[@class='gw-label' and text()='Numeric Coverage Term']");

	/*
	 * Coverage Terms
	 */
	private static By PG_CoverageTerm_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Coverage Term']");
	private static By PG_CT_Subject          = By.xpath("//select[@name='CovTermPopup-CovTermPattern']");
	private static By PG_CT_ApplicableTo     = By.xpath("//select[@name='CovTermPopup-ModelRestriction']");
	private static By PG_CT_Per              = By.xpath("//select[@name='CovTermPopup-ModelAggregation']");
	// Financial Coverage Term
	private static By PG_CT_FCT_Amount = By.xpath("//input[@name='CovTermPopup-CovTermTypeDetailsInputSet-CovTermTypeDetailsInputSet-FinancialAmount']");
	// Classification Coverage Term
	private static By PG_CT_CCT_Code        = By.xpath("//input[@name='CovTermPopup-CovTermTypeDetailsInputSet-CovTermTypeDetailsInputSet-Code']");
	private static By PG_CT_CCT_Description = By.xpath("//input[@name='CovTermPopup-CovTermTypeDetailsInputSet-CovTermTypeDetailsInputSet-Description']");
	// Numeric Coverage Term
	private static By PG_CT_NCT_Value = By.xpath("//input[@name='CovTermPopup-CovTermTypeDetailsInputSet-CovTermTypeDetailsInputSet-NumericValue']");
	private static By PG_CT_NCT_Term  = By.xpath("//select[@name='CovTermPopup-CovTermTypeDetailsInputSet-CovTermTypeDetailsInputSet-Units']");
	private static By PG_CT_OK        = By.xpath("//div[@id='CovTermPopup-Update']/div[@role='button']");

	// policy general->Export Policy
	public static By PolicyExport_Button = By.xpath("//div[contains(@id,'ClaimPolicyGeneral_ExportPolicyButton')]//div[@role='button']");
	public static By Policy_Header       = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Policy']");
	public static By Policy_xml          = By.xpath("//div[@id='MessagePopup-Details']//div[@class='gw-value-readonly-wrapper']");

	private static By Coverages = By.xpath("//div[contains(@id,'LocationCoveragesTab')]//div[@role='tab']");
	private static By Add       = By.xpath("//div[contains(@id,'EditablePropertyCoveragesLV_tb-Add')]//div[@role='button']");
	private static By Edit      = By.xpath("//div[contains(@id,'ClaimPolicyGeneral_EditButton')]//div[@role='button']");

	private static By ErrorMessage = By.xpath("//div[@class='gw-WebMessage']/div[contains(@id,'Screen-_msgs-0-0')]//div[@class='gw-message']");

	/*
	
	 */

	public static void EditEntirePolicy() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("policyGeneral");
		try {
			GuidewireAutomate_Validation("Page Header", PolicyGeneral_Header, "equals", "Policy General");
			GuidewireAutomate("Edit Entire Policy", PG_EditEntirePolicy_Button, "clickAndwait", "click");
			GuidewireAutomate_Handle("alertaccept", "alert");

			GuidewireAutomate_Validation("Section", PG_BasicInformation, "equals", "Basic Information");
			GuidewireAutomate("Effective Date", PG_EEP_BI_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("EffectiveDate"));
			GuidewireAutomate("Expiration Date", PG_EEP_BI_ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ExpirationDate"));
			GuidewireAutomate("EXTReported Date", PG_EEP_BI_ExtReportedDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("EXTReportedDate"));
			GuidewireAutomate("Cancellation Date", PG_EEP_BI_CancellationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CancellationDate"));
			GuidewireAutomate("Original Effective Date", PG_EEP_BI_OriginalEffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("OriginalEffectiveDate"));
			GuidewireAutomate("Status", PG_EEP_BI_Status, "selectByVisibleText", lhm_TestCase_Table_Data.get("Status"));
			GuidewireAutomate("Currency", PG_EEP_BI_Currency, "selectByVisibleText", lhm_TestCase_Table_Data.get("Currency"));

			GuidewireAutomate_Validation("Section", PG_Insured, "equals", "Insured");
			GuidewireAutomate("Name", PG_EEP_I_Name, "selectByVisibleText", lhm_TestCase_Table_Data.get("InsuredName"));
			GuidewireAutomate("Account Number", PG_EEP_I_AccountNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("AccountNumber"));

			GuidewireAutomate_Validation("Section", PG_AdditionalInsured, "equals", "Additional Insured");
			GuidewireAutomate_Validation("No data to display", PG_EEP_AI_Nodatatodisplay, "equals", "No data to display");

			GuidewireAutomate_Validation("Section", PG_ExcludedParties, "equals", "Excluded Parties");
			GuidewireAutomate_Validation("No datato display", PG_EEP_EP_Nodatatodisplay, "equals", "No data to display");

			GuidewireAutomate_Validation("Section", PG_Agent, "equals", "Agent");
			GuidewireAutomate("Name", PG_EEP_A_Name, "selectByVisibleText", lhm_TestCase_Table_Data.get("AgentName"));
			GuidewireAutomate("Producer Code", PG_EEP_A_ProducerCode, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ProducerCode"));

			GuidewireAutomate_Validation("Section", PG_Underwriting, "equals", "Underwriting");
			GuidewireAutomate("Underwriter", PG_EEP_UW_Underwriter, "selectByVisibleText", lhm_TestCase_Table_Data.get("Underwriter"));
			GuidewireAutomate("Organization", PG_EEP_UW_Organization, "selectByVisibleText", lhm_TestCase_Table_Data.get("Organization"));

			GuidewireAutomate_Validation("Section", PG_Other, "equals", "Other");
			GuidewireAutomate_Validation("Verified Policy", PG_EEP_O_VerifiedPolicy, "equals", lhm_TestCase_Table_Data.get("VerifiedPolicy"));
			GuidewireAutomate("Notes", PG_EEP_O_Notes, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Notes"));

			GuidewireAutomate_Validation("Section", PG_PolicylevelCoverages, "equals", "Policy-level Coverages");
			// GuidewireAutomate_Validation("No datato display", PG_EEP_PLC_Nodatatodisplay, "equals", "No data to display");
			if (IsElementDisplayed("No data to display", PG_EEP_PLC_Nodatatodisplay)) {
				GuidewireAutomate("Add", PG_EEP_PLC_Add, "clickAndwait", "click");

				GuidewireAutomate("Type", PG_EEP_PLC_Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("Type"));
				getStaleElement("Coverage Form", PG_EEP_PLC_CoverageForm);
				GuidewireAutomate("Coverage Form", PG_EEP_PLC_CoverageForm, "selectByVisibleText", lhm_TestCase_Table_Data.get("CoverageForm"));
				getStaleElement("Coverage Form", PG_EEP_PLC_CoverageForm);
				GuidewireAutomate("Currency", PG_EEP_PLC_Currency, "selectByVisibleText", lhm_TestCase_Table_Data.get("Currency"));
				GuidewireAutomate("Producer Code", PG_EEP_PLC_IncidentLimit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("IncidentLimit"));
				GuidewireAutomate("Retro date", PG_EEP_PLC_Retrodate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RetroDate"));
				GuidewireAutomate("Notes", PG_EEP_PLC_Notes, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Notes"));
			}

			GuidewireAutomate_Validation("Section", PG_PLC_CoverageTerms, "equals", "Coverage Terms");
			if (IsElementDisplayed("No data to display", PG_EEP_PLC_Nodatatodisplay)) {
				GuidewireAutomate("Add", PG_PLC_CoverageTerms_Add, "clickAndwait", "click");
				switch (lhm_TestCase_Table_Data.get("CoverageTerms")) {
					case "Classification" :
						GuidewireAutomate("Classification CoverageTerm", PG_PLC_CT_Add_ClassificationCoverageTerm, "clickAndwait", "click");
						break;
					case "Financial" :
						GuidewireAutomate("Financial CoverageTerm", PG_PLC_CT_Add_FinancialCoverageTerm, "clickAndwait", "click");
						break;
					case "Numeric" :
						GuidewireAutomate("Numeric CoverageTerm", PG_PLC_CT_Add_NumericCoverageTerm, "clickAndwait", "click");
						break;

				}

				GuidewireAutomate("Subject", PG_CT_Subject, "selectByVisibleText", lhm_TestCase_Table_Data.get("Subject"));
				GuidewireAutomate("ApplicableTo", PG_CT_ApplicableTo, "selectByVisibleText", lhm_TestCase_Table_Data.get("ApplicableTo"));
				GuidewireAutomate("Per", PG_CT_Per, "selectByVisibleText", lhm_TestCase_Table_Data.get("Per"));
				switch (lhm_TestCase_Table_Data.get("CoverageTerms")) {
					case "Classification" :
						GuidewireAutomate("Code", PG_CT_CCT_Code, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Code"));
						GuidewireAutomate("Description", PG_CT_CCT_Description, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Description"));
						break;
					case "Financial" :
						GuidewireAutomate("Amount", PG_CT_FCT_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Amount"));
						break;
					case "Numeric" :
						GuidewireAutomate("Units", PG_CT_NCT_Term, "selectByVisibleText", lhm_TestCase_Table_Data.get("Term"));
						GuidewireAutomate("Value", PG_CT_NCT_Value, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Value"));
						break;

				}
				GuidewireAutomate("OK", PG_CT_OK, "clickAndwait", "click");
				GuidewireAutomate_Validation("Section", PG_PLC_CoverageTerms, "equals", "Coverage Terms");

			}
			GuidewireAutomate("Back", PG_Back_Button, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void PG_PolicyLevelCoverages() throws Throwable {
		try {
			GuidewireAutomate_Validation("Page Header", PolicyGeneral_Header, "equals", "Policy General");
			GuidewireAutomate_Validation("Policy level Coverages Section", PG_PolicylevelCoverages, "equals", "Policy-level Coverages");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void CoverageForm_Validation() throws Throwable {

		try {
			List<WebElement> PLC_Headers = getElements(PG_CoverageForm);
			for (int i = 0; i < PLC_Headers.size(); i++) {

				String header1 = PLC_Headers.get(0).getText();
				String header3 = PLC_Headers.get(2).getText();
				if (header1.equals("Type") && PLC_Headers.get(1).getText().equals("Coverage Form") && header3.equals("Currency")) {
					oExtentTest.log(Status.PASS, "Coverage Form field is displayed in the 'Policy Level Coverages' between " + header1 + " and " + header3 + " column");
					break;
				} else {
					oExtentTest.log(Status.FAIL, "Coverage Form field is not displayed in the 'Policy Level Coverages' between " + header1 + " and " + header3 + " column");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * Author - Misba Date - 27/11/2021 Description - organisation matched with vantage type list
	 */
	public static void PG_PolicyGeneralTypelist() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("policyGeneral");

			GuidewireAutomate_Validation("Page Header", PolicyGeneral_Header, "equals", "Policy General");
			GuidewireAutomate("Edit Entire Policy Button", PG_EditEntirePolicy_Button, "clickAndwait", "click");
			GuidewireAutomate_Handle("alertaccept", "alert");
			Thread.sleep(1000);

			GuidewireAutomate_Validation("underwriting", PG_Underwriting, "equals", "Underwriting");
			GuidewireAutomate("Organization", PG_EEP_UW_Organization, "selectByVisibleText", lhm_TestCase_Table_Data.get("Organization"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Pankaj
	public static void PG_PolicyGeneralOrgnizationVerify() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("policyGeneral");

			GuidewireAutomate_Validation("Page Header", PolicyGeneral_Header, "equals", "Policy General");
			GuidewireAutomate("Edit Entire Policy Button", PG_EditEntirePolicy_Button, "clickAndwait", "click");
			GuidewireAutomate_Handle("alertaccept", "alert");
			Thread.sleep(1000);

			GuidewireAutomate_Validation("underwriting", PG_Underwriting, "equals", "Underwriting");
			String TypeList1   = "Superior Specialty Insurance Company";
			String TypeList2   = "Vantage Risk Ltd";
			String TypeList3   = "Acme Insurance Parent Co.";
			String AllTypeList = getOptions_Element(PG_EEP_UW_Organization);
			if (AllTypeList.contains(TypeList1) || AllTypeList.contains(TypeList2) || AllTypeList.contains(TypeList3)) {
				oExtentTest.log(Status.PASS, "UW Company (Organization) dropdown list should match with the Vantage values  " + TypeList1 + ", " + TypeList2 + ", " + TypeList3);
			} else {
				oExtentTest.log(Status.FAIL, "UW Company (Organization) dropdown list not match with the Vantage values  " + TypeList1 + ", " + TypeList2 + ", " + TypeList3);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Divya
	public static void CoverageForm_Retrodate_Validation() throws Throwable {

		try {
			List<WebElement> PLC_Headers = getElements(PG_PolicylevelCoverages);

			for (int i = 0; i < PLC_Headers.size(); i++) {
				String header1 = PLC_Headers.get(3).getText();
				String header3 = PLC_Headers.get(5).getText();
				if (header1.equals("Incident Limit") && PLC_Headers.get(4).getText().equals("Retro Date") && header3.equals("Notes")) {
					oExtentTest.log(Status.PASS, "Retro date field is displayed After  " + header1);
					break;
				} else {
					oExtentTest.log(Status.FAIL, "Retro date field is not displayed After  " + header1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	// divya
	public static void PG_PolicyLevelCoverages_RetroDateEditable() throws Throwable {
		WebElement Retrodate = driver.findElement(By.xpath("//div[contains(@class,'gw-vw--value')]//input[contains(@name,'RetroActiveDate_Ext')]"));
		try {
			if (Retrodate.isEnabled()) {
				oExtentTest.log(Status.PASS, "Retro date is Editable");
			} else {
				oExtentTest.log(Status.FAIL, "Retro date is not Editable");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	// divya
	public static void PG_PolicyLevelCoverages_RetroDateNotMandatory() throws Throwable {
		WebElement Retrodate    = driver.findElement(By.xpath("//div[contains(@class,'gw-vw--value')]//input[contains(@name,'RetroActiveDate_Ext')]"));
		String     ErrorMessage = "RetroDate";
		try {
			if (Retrodate.equals(ErrorMessage)) {
				oExtentTest.log(Status.PASS, ErrorMessage + "is Mandatory");
			} else {
				oExtentTest.log(Status.PASS, ErrorMessage + "is not Mandatory");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void PG_EditEntirePolicy() throws Throwable {
		GuidewireAutomate_Validation("Page Header", PolicyGeneral_Header, "equals", "Policy General");
		GuidewireAutomate("Edit Entire Policy Button", PG_EditEntirePolicy_Button, "clickAndwait", "click");
		GuidewireAutomate_Handle("alertaccept", "alert");
	}

	public static void PG_PolicyLevelCoverages_Add() throws Throwable {
		try {
			GuidewireAutomate_Validation("Section", PG_PolicylevelCoverages, "equals", "Policy-level Coverages");
			GuidewireAutomate("Add", PG_EEP_PLC_Add, "clickAndwait", "click");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void PLC_CoverageTerms_AddFinacialCoverageTerm() throws Throwable {
		try {
			GuidewireAutomate_Validation("CoverageTerm_Header", PG_PLC_CoverageTerms, "equals", "Coverage Terms");
			GuidewireAutomate("Add", PG_PLC_CoverageTerms_Add, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate("Financial Coverage Term", PG_PLC_CT_Add_FinancialCoverageTerm, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Author:Divya
	// date:15/12/2021
	public static void CoverageTerm_AmountVerify() throws Throwable {
		// lhm_TestCase_Table_Data = ClaimCenter_Resuables.getData_ClaimsCenter("asBasicInfo");
		try {
			GuidewireAutomate_Validation("CoverageTerm_Header", PG_PLC_CoverageTerms, "equals", "Coverage Term");
			GuidewireAutomate("Amount", PG_CT_FCT_Amount, "clearANDsendKeys", "100");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void CoverageTerm_PerTypeListVerify() throws Throwable {
		String typeListValue = "Each offense";
		try {
			GuidewireAutomate_Validation("CoverageTerm_Header", PG_CoverageTerm_Header, "equals", "Coverage Term");
			String perTypeValues = getOptions_Element(PG_CT_Per);
			if (perTypeValues.contains(typeListValue)) {
				oExtentTest.log(Status.PASS, "PerTypeList Dropdown contains " + typeListValue + " Value");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void CoverageTerm_ApplicableToTypeListVerify() throws Throwable {

		String typeListValue1 = "Offense";
		String typeListValue2 = "Personal and advertising injury";
		try {
			GuidewireAutomate_Validation("CoverageTerm_Header", PG_CoverageTerm_Header, "equals", "Coverage Term");
			String perTypeValues = getOptions_Element(PG_CT_ApplicableTo);
			if (perTypeValues.contains(typeListValue1) && perTypeValues.contains(typeListValue2)) {
				oExtentTest.log(Status.PASS, "ApplicableTo TypeList Dropdown contains " + typeListValue1 + " and " + typeListValue2 + " Value");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void PolicyGeneral_PolicyExport() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", PolicyGeneral, "equals", "Policy: General");
			GuidewireAutomate("PolicyExport Button", PolicyExport_Button, "clickAndwait", "click");

			GuidewireAutomate_Validation("Screen Header", Policy_Header, "equals", "Policy");
			GuidewireAutomate_Validation("policy xml format", Policy_xml, "contains", "<?xml version=\"1.0\"?>");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Rahul Dixit
	public static void PolicyGeneral_BasicInformation() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("policyGeneral");

		try {
			GuidewireAutomate("Effective Date", PG_EEP_BI_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("EffectiveDate"));
			GuidewireAutomate("Expiration Date", PG_EEP_BI_ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ExpirationDate"));
			GuidewireAutomate("EXTReported Date", PG_EEP_BI_ExtReportedDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("EXTReportedDate"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Rahul Dixit
	 * 
	 */

	public static void ncw_VerifyError() throws Throwable {
		try {
			GuidewireAutomate_Validation("Error Message", ErrorMessage, "equals", "Warning: Loss Date or CMD/Reported Date is outside the Coverage Period");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Rahul Dixit
	 * 
	 */
	public static void ncw_PolicyGeneral_PolicyLevelCoverage_AddCoverage() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Coverage");
		try {
			GuidewireAutomate("Coverage Type", PG_EEP_PLC_Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("CoverageType"));
			GuidewireAutomate("Coverage Form", PG_EEP_PLC_CoverageForm, "selectByVisibleText", lhm_TestCase_Table_Data.get("CoverageForm"));
			GuidewireAutomate("Back Button", PG_Back_Button, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Rahul Dixit
	 * 
	 */
	public static void ncw_PolicyGeneral_PolicyLevelCoverage_AddCoverage2() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Coverage");
		try {
			GuidewireAutomate("Coverage Type", PG_EEP_PLC_Type2, "selectByVisibleText", "Credit Insurance Coverage");
			GuidewireAutomate("Coverage Form", PG_EEP_PLC_CoverageForm2, "selectByVisibleText", "Claims Made");
			GuidewireAutomate("Back Buttom", PG_Back_Button, "clickAndwait", "click");
			GuidewireAutomate_Validation("Error Message", ErrorMessage, "equals", "Warning: Loss Date or CMD/Reported Date is outside the Coverage Period");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_ExtendedReportingDateDisplayedBelowPolicyExpirationDate() throws Throwable {

		By ExtReportingDate_Label = By.xpath("//div[contains(@id,'-ExtendedRepDate_Ext_Input')]//div[@class='gw-label']");
		try {
			GuidewireAutomate_Validation("Ext Reporting Date", ExtReportingDate_Label, "equals", "Ext Reporting Date");
			oExtentTest.log(Status.PASS, "Extended Reporting Date Displayed Below Policy Expiration Date");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Rahul Dixt/
	public static void Verify_ExtendedReportingDateIsEditable() throws Throwable {

		WebElement ExtReportedDate = getElement(PG_EEP_BI_ExtReportedDate);
		try {
			if (ExtReportedDate.isEnabled()) {
				oExtentTest.log(Status.PASS, "Ext Reporting Date is Editable");
			} else {
				oExtentTest.log(Status.FAIL, "Ext Reporting Date is not Editable");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_ExtendedReportingDateIsNotMandatory() throws Throwable {

		String strExtReportedDate = getValue_Element(PG_EEP_BI_ExtReportedDate);
		try {
			GuidewireAutomate("ExtReportedDate", PG_EEP_BI_ExtReportedDate, "clear", "clear");
			CC_Reusables.clickButton("Back");
			if (strExtReportedDate.contains("Ext Reporting Date : Missing required field Ext Reporting Date")) {
				oExtentTest.log(Status.FAIL, "Ext Reporting Date is Mandatory");
			} else {
				oExtentTest.log(Status.PASS, "Ext Reporting Date is Not Mandatory");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_RetroDateDisplayedAfterIncidentLimit() throws Throwable {

		try {
			GuidewireAutomate_Validation("Retro date", PG_EEP_PLC_Retrodate_Header, "equals", "Retro Date");
			oExtentTest.log(Status.PASS, "Retro Date is After The Incident Limit");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_RetroDateIsEditable() throws Throwable {

		WebElement DateEnabled = getElement(PG_EEP_PLC_Retrodate);
		try {
			if (DateEnabled.isEnabled()) {
				oExtentTest.log(Status.PASS, "Retro Date is Editable");
			} else {
				oExtentTest.log(Status.FAIL, "Retro Date is not Editable");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void Verify_RetroDateIsNotMandatory() throws Throwable {

		try {
			String strErrorMessage = getText_Element(ErrorMessage);
			if (strErrorMessage.contains("Retro Date")) {
				oExtentTest.log(Status.FAIL, "Ext Retro Date is Mandatory");
			} else {
				oExtentTest.log(Status.PASS, "Ext Retro Date is Not Mandatory");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void Clear_Dates() throws Throwable {

		try {
			GuidewireAutomate("Effective Date", PG_EEP_BI_EffectiveDate, "clear", "clear");
			GuidewireAutomate("Expiration Date", PG_EEP_BI_ExpirationDate, "clear", "clear");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void PolicyGeneral_ExtendedReportingDateIsNotMandatory() throws Throwable {

		try {
			GuidewireAutomate("Effective Date", PG_EEP_BI_EffectiveDate, "clear", "clear");
			GuidewireAutomate("Expiration Date", PG_EEP_BI_ExpirationDate, "clear", "clear");

			CC_Reusables.clickButton("Update");
			String strErrorMessage = getElement(ErrorMessage).getText();
			if (strErrorMessage.contains("Ext Reporting Date")) {
				oExtentTest.log(Status.FAIL, "Ext Reporting Date is Mandatory");
			} else {
				oExtentTest.log(Status.PASS, "Ext Reporting Date is Not Mandatory");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void PolicyGeneral_RetroDateIsNotMandatory() throws Throwable {

		try {
			Thread.sleep(1000);
			CC_Reusables.clickButton("Update");
			String strErrorMessage = getElement(ErrorMessage).getText();
			if (strErrorMessage.contains("Retro Date")) {
				oExtentTest.log(Status.FAIL, "Ext Retro Date is Mandatory");
			} else {
				oExtentTest.log(Status.PASS, "Ext Retro Date is Not Mandatory");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit
	 */
	public static void LocationRemoved() throws Throwable {

		try {
			By Location = By.xpath("//div[@class='gw-label' and text()='Location']");
			VerifyElementNotExist("Location", Location);
			oExtentTest.log(Status.PASS, "Location Field is Removed");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit Date : 28/01/2022
	 */
	public static void LossDateNotPresentBetweenPolicyExpirationAndEffectiveDate() throws Throwable {

		try {
			By LossDate = By.xpath("//div[@class='gw-label' and text()='Location']");
			VerifyElementNotExist("LossDate", LossDate);
			oExtentTest.log(Status.PASS, "LossDate Field is Not Present In Between Expiration And Effective Date");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit Date : 28/01/2022
	 */
	public static void LossDateNotPresentBetweenPolicyExpirationAndRetroDate() throws Throwable {

		try {
			By LossDate = By.xpath("//div[@class='gw-label' and text()='Location']");
			VerifyElementNotExist("LossDate", LossDate);
			oExtentTest.log(Status.PASS, "LossDate Field is Not Present In Between Expiration,Effective,Retro Date");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
	}
	// Divya
	// 22/12/2021
	// verify the Occurrance in coverage form

	public static void PLC_CoverageForm() throws Throwable {
		try {
			GuidewireAutomate("PLC_CoverageForm", PG_EEP_PLC_CoverageForm, "selectByVisibleText", "Occurrence");
			String strTypeList = getOptions_Element(PG_EEP_PLC_CoverageForm);
			if (strTypeList.contains("Occurrence")) {
				oExtentTest.log(Status.PASS, "CoverageForm is select to Occurrence");
			} else {
				oExtentTest.log(Status.FAIL, "CoverageForm is not selected to Occurrence");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	// Divya
	// 22/12/2021
	// Verify the coverage in location section
	public static void LocationCoverages() throws Throwable {
		try {
			GuidewireAutomate_Validation("Section", PG_PolicylevelCoverages, "equals", "Policy-level Coverages");
			GuidewireAutomate("Coverages", Coverages, "click", "click");
			GuidewireAutomate("Add", Add, "click", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	// Divya
	// 22/12/2021
	// verify the OOTBvalues in coverage form

	public static void OOTBvalues() throws Throwable {
		String typeListValue1 = "Claims-made cov-basic no retro cov";
		String typeListValue2 = "Claims-made cov-extended rptg period (no retro cov)";
		String typeListValue3 = "Claims-made cov-basic with retroactive cov";
		String typeListValue4 = "Claims-made cov-extended rptg period (w/retro cov)";
		String typeListValue5 = "Occurrence coverage (prior acts)";
		try {
			// GuidewireAutomate("Coverage Section", Coverages, "clickAndwait", "click");
			String TypeValues = getOptions_Element(PG_EEP_PLC_CoverageForm);
			if (TypeValues.contains(typeListValue1) && TypeValues.contains(typeListValue2) && TypeValues.contains(typeListValue3) && TypeValues.contains(typeListValue4) && TypeValues.contains(typeListValue5)) {
				oExtentTest.log(Status.FAIL, " Coverage Form TypeList Dropdown  " + typeListValue1 + " and " + typeListValue2 + " and " + typeListValue3 + " and " + typeListValue4 + " and " + typeListValue5 + "  typelist is not retired");
			} else {
				oExtentTest.log(Status.PASS, " Coverage Form TypeList Dropdown  " + typeListValue1 + " and " + typeListValue2 + " and " + typeListValue3 + " and " + typeListValue4 + " and " + typeListValue5 + " typelist is  retired");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void PG_CoverageFormTypelist() throws Throwable {
		String typeListValue1 = "Claims Made";
		String typeListValue2 = "Claims Made and Reported";
		String typeListValue3 = "Occurrence Reported";

		try {
			// GuidewireAutomate("Coverage Type", CoverageType, "selectByVisibleText", "Excess FI Blend - Banks (follow form)");
			// GuidewireAutomate("CoverageForm", Coverages, "click", "click");
			String TypeValues = getOptions_Element(PG_EEP_PLC_CoverageForm);
			if (TypeValues.contains(typeListValue1) && TypeValues.contains(typeListValue2) && TypeValues.contains(typeListValue3)) {
				oExtentTest.log(Status.PASS, " Coverage Form TypeList Dropdown  " + typeListValue1 + " and " + typeListValue2 + " and " + typeListValue3 + "  typelist is verified");
			} else {
				oExtentTest.log(Status.FAIL, " Coverage Form TypeList Dropdown  " + typeListValue1 + " and " + typeListValue2 + " and " + typeListValue3 + "  typelist is not verified");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void CoverageFormPolicyLocation_Validation() throws Throwable {

		try {
			List<WebElement> PLC_Headers = getElements(PG_CoverageFormPolicyLocation);
			for (int i = 0; i < PLC_Headers.size(); i++) {

				String header1 = PLC_Headers.get(0).getText();
				String header3 = PLC_Headers.get(2).getText();
				if (header1.equals("Type") && PLC_Headers.get(1).getText().equals("Coverage Form") && header3.equals("Currency")) {
					oExtentTest.log(Status.PASS, "Coverage Form field is displayed in the 'Policy Level Coverages' between " + header1 + " and " + header3 + " column");
					break;
				} else {
					oExtentTest.log(Status.FAIL, "Coverage Form field is not displayed in the 'Policy Level Coverages' between " + header1 + " and " + header3 + " column");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}