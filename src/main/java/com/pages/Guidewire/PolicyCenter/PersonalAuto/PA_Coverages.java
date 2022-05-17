package com.pages.Guidewire.PolicyCenter.PersonalAuto;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class PA_Coverages extends SeleniumWebDriver_Commands {

	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PA_Coverages(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By PA_Coverages_Screen_titlebar = By.xpath("//div[contains(@id,'PersonalAutoScreen-ttlBar')]//div[1]//div");


	/*
	 * CoveragesTab
	 */
	private static By PACoverages_CoveragesTab = By.xpath("//div[contains(@id,'PersonalAutoScreen-CoveragesTab')]");

	/*
	 * CoveragesAppliedtoAllVehicles
	 */

	private static By PAC_CT_CoveragesAppliedtoAllVehicles = By.xpath("//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Coverages applied to all vehicles')]");

	// --->PA_Coverages_CheckBox xpath
	private static By PAC_CT_CATAV_Liability_BodilyInjuryPropertyDamage = By
			.xpath("//div[@role='heading' and text()='Liability - Bodily Injury and Property Damage']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");

	private static By PAC_CT_CATAV_LBIPD_AutoLiabilityPackage = By.xpath("//div[@class='gw-label' and text()='Auto Liability Package']/parent::div//select[contains(@name,'CoverageInputSet')]");

	private static By PAC_CT_CATAV_MedicalPayments = By.xpath("//div[@role='heading' and text()='Medical Payments']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By PAC_CT_CATAV_MP_MedicalLimit = By.xpath("//div[@class='gw-label' and text()='Medical Limit']/parent::div//select[contains(@name,'CoverageInputSet')]");

	private static By PAC_CT_CATAV_UninsuredMotoristBodilyInjury  = By.xpath("//div[@role='heading' and text()='Uninsured Motorist - Bodily Injury']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By PAC_CT_CATAV_UMBI_UninsuredMotoristBILimits = By.xpath("//div[@class='gw-label' and text()='Uninsured Motorist - BI Limits']/parent::div//select[contains(@name,'CoverageInputSet')]");

	private static By PAC_CT_CATAV_UninsuredMotoristPropertyDamage           = By
			.xpath("//div[@role='heading' and text()='Uninsured Motorist - Property Damage']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By PAC_CT_CATAV_UMPD_UninsuredMotoristPropertyDamageLimit = By.xpath("//div[@class='gw-label' and text()='Uninsured Motorist - Property Damage Limit']/parent::div//select[contains(@name,'CoverageInputSet')]");

	private static By PAC_CT_CATAV_UnderinsuredMotoristPropertyDamage            = By
			.xpath("//div[@role='heading' and text()='Underinsured Motorist - Property Damage']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By PAC_CT_CATAV_UMPD_UnderinsuredMotorist_PropertyDamageLimit = By.xpath("//div[@class='gw-label' and text()='Underinsured Motorist - Property Damage Limit']/parent::div//select[contains(@name,'CoverageInputSet')]");

	private static By PAC_CT_CATAV_MexicoCoverageLimited = By.xpath("//div[@role='heading' and text()='Mexico Coverage - Limited']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	/*
	 * Coverages applied per vehicle in
	 * 
	 */

	private static By PAC_CT_CoveragesAppliedPerVehicleIn = By.xpath("//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Coverages applied per vehicle in')]");

	// --->PA_Coverages_CheckBox xpath
	private static By PAC_CT_CAPV_Comprehensive             = By.xpath("//div[@role='heading' and text()='Comprehensive']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By PAC_CT_CAPV_C_ComprehensiveDeductible = By.xpath("//div[@class='gw-label' and text()='Comprehensive Deductible']/parent::div//select[contains(@name,'CoverageInputSet')]");

	private static By PAC_CT_CAPV_Collision             = By.xpath("//div[@role='heading' and text()='Collision']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By PAC_CT_CAPV_C_CollisionDeductible = By.xpath("//div[@class='gw-label' and text()='Collision Deductible']/parent::div//select[contains(@name,'CoverageInputSet')]");

	private static By PAC_CT_CAPV_TowingLabor         = By.xpath("//div[@role='heading' and text()='Towing and Labor']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By PAC_CT_CAPV_TL_TowingLaborLimit = By.xpath("//div[@class='gw-label' and text()='Towing and Labor Limit']/parent::div//select[contains(@name,'CoverageInputSet')]");

	private static By PAC_CT_CAPV_RentalReimbursement = By.xpath("//div[@role='heading' and text()='Rental Reimbursement']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By PAC_CT_CAPV_RR_RentalPackage    = By.xpath("//div[@class='gw-label' and text()='Rental Package']/parent::div//select[contains(@name,'CoverageInputSet')]");

	/*
	 * AdditionalCoveragesTab
	 */
	private static By PACoverages_AdditionalCoveragesTab = By.xpath("//div[contains(@id,'PersonalAutoScreen-AdditionalCoveragesTab')]");

	/*
	 * CoveragesAppliedtoAllVehicles
	 */

	// --->PA_Coverages_CheckBox tabs
	private static By PAC_ACT_CoveragesAppliedtoAllVehicles = By.xpath("//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Coverages applied to all vehicles')]");

	private static By PAC_ACT_CATAV_RentalCarLossOfUse          = By.xpath("//div[@role='heading' and text()='Rental Car Loss of Use']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By PAC_ACT_CATAV_RCL_RentalCarLossOfUseLimit = By.xpath("//div[@class='gw-label' and text()='Rental Car Loss of Use Limit']/parent::div//select[contains(@name,'CoverageInputSet')]");

	/*
	 * Coverages applied per vehicle in
	 * 
	 */
	private static By PAC_ACT_CoveragesAppliedPerVehicleIn = By.xpath("//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Coverages applied per vehicle in')]");

	private static By PAC_ACT_CAPV_ElectronicEquipment = By.xpath("//div[@role='heading' and text()='Electronic Equipment']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By PAC_ACT_CAPV_EE_IncreasedLimit   = By.xpath("//div[@class='gw-label' and text()='Increased Limit']/parent::div//select[contains(@name,'CoverageInputSet')]");

	private static By PAC_ACT_CAPV_TapeDiscMedia          = By.xpath("//div[@role='heading' and text()='Tape / Disc Media']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	private static By PAC_ACT_CAPV_TDM_TapeDiscMediaLimit = By.xpath("//div[@class='gw-label' and text()='Tape / Disc Media Limit']/parent::div//div[contains(@class,'gw-ValueWidget')]");

	/*
	 * exclusionsAndConditionsCardTab
	 */

	private static By PACoverages_ExclusionsAndConditionsCardTab = By.xpath("//div[contains(@id,'PersonalAutoScreen-exclusionsAndConditionsCardTab')]");

	private static By PAC_ECT_AddExclusionCondition = By.xpath("//div[contains(@id,'AddExclusionsOrCondition')]/div[@role='button']");

	/*
	 * Search Exclusions And Conditions for Personal Auto Line
	 */
	private static By PAC_ECT_Search_Exclusions_And_Conditions_for_Personal_Auto_Line_titlebar = By
			.xpath("//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Search Exclusions And Conditions for Personal Auto Line']");

	private static By PAC_ECT_SEC_PAL_Category                   = By.xpath("//select[contains(@name,'CoveragePatternSearchDV-CoverageCategory')]");
	private static By PAC_ECT_SEC_PAL_Keyword                    = By.xpath("//div[contains(@id,'CoveragePatternSearchDV-Keyword')]//input");
	private static By PAC_ECT_SEC_PAL_Type_Exclusion             = By.xpath("//input[contains(@id,'CoveragePatternSearchDV-SearchType_0')]");
	private static By PAC_ECT_SEC_PAL_Type_Condition             = By.xpath("//input[contains(@id,'CoveragePatternSearchDV-SearchType_1')]");
	private static By PAC_ECT_SEC_PAL_Type_ExclusionandCondition = By.xpath("//input[contains(@id,'CoveragePatternSearchDV-SearchType_2')]");
	private static By PAC_ECT_SEC_PAL_SearchButton               = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");

	private static By PAC_ECT_SEC_PAL_SearchResult_Select = By.xpath(
			"//tr[contains(@id,'CoveragePatternSearchResultsLV') and contains(@class,'gw-standard-row')]/td[contains(@class,'gw-impl-cell--CB')]//div[contains(@id,'_Checkbox') and contains(@class,'gw-IteratorEntryCheckBoxWidget')]/input[@type='checkbox']");

	private static By PAC_ECT_SEC_PAL_AddSelectedExclusionsAndConditions_button = By.xpath("//div[contains(@id,'AddCoverageButton')]");

	public static void coveragesAppliedtoallVehiclesIn() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("paCoverages");

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.PACoverages_Header, "equals", "PA Coverages");
		GuidewireAutomate("Coverages tab", PACoverages_CoveragesTab, "click", "click");
		GuidewireAutomate_Validation("Coverages applied to all vehicles", PAC_CT_CoveragesAppliedtoAllVehicles, "contains", "Coverages applied to all vehicles");

		/*
		 * Liability - Bodily Injury and Property Damage
		 */
		String strPAC_CT_CATAV_Liability_BodilyInjuryPropertyDamage = lhm_TestCase_Table_Data.get("PAC_CT_CATAV_Liability_BodilyInjuryPropertyDamage");
		if (strPAC_CT_CATAV_Liability_BodilyInjuryPropertyDamage.equalsIgnoreCase("Verify")) {
			GuidewireAutomate_Validation("Liability - Bodily Injury and Property Damage", PAC_CT_CATAV_Liability_BodilyInjuryPropertyDamage, "isDisabled", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_Liability_BodilyInjuryPropertyDamage"));
			GuidewireAutomate_Validation("Auto Liability Package", PAC_CT_CATAV_LBIPD_AutoLiabilityPackage, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_LBIPD_AutoLiabilityPackage"));
		} else if (strPAC_CT_CATAV_Liability_BodilyInjuryPropertyDamage.equalsIgnoreCase("Edit")) {
			GuidewireAutomate_Validation("Liability - Bodily Injury and Property Damage", PAC_CT_CATAV_Liability_BodilyInjuryPropertyDamage, "isDisabled", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_Liability_BodilyInjuryPropertyDamage"));
			GuidewireAutomate("Auto Liability Package", PAC_CT_CATAV_LBIPD_AutoLiabilityPackage, "selectByVisibleText", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_LBIPD_AutoLiabilityPackage"));
		} else {
			throw new InterruptedIOException("No supported Type = " + strPAC_CT_CATAV_Liability_BodilyInjuryPropertyDamage);
		}

		/*
		 * Medical Payments
		 */
		String strPAC_CT_CATAV_MedicalPayments = lhm_TestCase_Table_Data.get("PAC_CT_CATAV_MedicalPayments");
		if (strPAC_CT_CATAV_MedicalPayments.equalsIgnoreCase("Add")) {
			GuidewireAutomate("Medical Payments", PAC_CT_CATAV_MedicalPayments, "clickAndwait", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_MedicalPayments"));
			GuidewireAutomate_Validation("Medical Payments", PAC_CT_CATAV_MedicalPayments, "isSelected", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_MedicalPayments"));
			GuidewireAutomate("Medical Limit", PAC_CT_CATAV_MP_MedicalLimit, "selectByVisibleText", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_MP_MedicalLimit"));
		} else if (strPAC_CT_CATAV_MedicalPayments.equalsIgnoreCase("Verify")) {
			GuidewireAutomate_Validation("Medical Payments", PAC_CT_CATAV_MedicalPayments, "isSelected", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_MedicalPayments"));
			GuidewireAutomate_Validation("Medical Limit", PAC_CT_CATAV_MP_MedicalLimit, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_MP_MedicalLimit"));
		} else if (strPAC_CT_CATAV_MedicalPayments.equalsIgnoreCase("Modify")) {
			GuidewireAutomate_Validation("Medical Payments", PAC_CT_CATAV_MedicalPayments, "isSelected", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_MedicalPayments"));
			GuidewireAutomate("Medical Limit", PAC_CT_CATAV_MP_MedicalLimit, "selectByVisibleText", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_MP_MedicalLimit"));
		} else if (strPAC_CT_CATAV_MedicalPayments.equalsIgnoreCase("Remove")) {
			GuidewireAutomate("Medical Payments", PAC_CT_CATAV_MedicalPayments, "clickAndwait", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_MedicalPayments"));
			GuidewireAutomate_Validation("Medical Payments", PAC_CT_CATAV_MedicalPayments, "isNotSelected", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_MedicalPayments"));
		} else {
			throw new InterruptedIOException("Medical Payments - No supported Type = " + strPAC_CT_CATAV_MedicalPayments);
		}

		String strPAC_CT_CATAV_UninsuredMotoristBodilyInjury = lhm_TestCase_Table_Data.get("PAC_CT_CATAV_UninsuredMotoristBodilyInjury");
		if (strPAC_CT_CATAV_UninsuredMotoristBodilyInjury.equalsIgnoreCase("Add")) {
			GuidewireAutomate("Uninsured Motorist - Bodily Injury", PAC_CT_CATAV_UninsuredMotoristBodilyInjury, "clickAndwait", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_UninsuredMotoristBodilyInjury"));
			GuidewireAutomate_Validation("Uninsured Motorist - Bodily Injury", PAC_CT_CATAV_UninsuredMotoristBodilyInjury, "isSelected", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_UninsuredMotoristBodilyInjury"));
			GuidewireAutomate("Uninsured Motorist - BI Limits", PAC_CT_CATAV_UMBI_UninsuredMotoristBILimits, "selectByVisibleText", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_UMBI_UninsuredMotoristBILimits"));
		} else if (strPAC_CT_CATAV_UninsuredMotoristBodilyInjury.equalsIgnoreCase("Verify")) {
			GuidewireAutomate_Validation("Uninsured Motorist - Bodily Injury", PAC_CT_CATAV_UninsuredMotoristBodilyInjury, "isSelected", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_UninsuredMotoristBodilyInjury"));
			GuidewireAutomate_Validation("Uninsured Motorist - BI Limits", PAC_CT_CATAV_UMBI_UninsuredMotoristBILimits, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_UMBI_UninsuredMotoristBILimits"));
		} else if (strPAC_CT_CATAV_UninsuredMotoristBodilyInjury.equalsIgnoreCase("Modify")) {
			GuidewireAutomate_Validation("Uninsured Motorist - Bodily Injury", PAC_CT_CATAV_UninsuredMotoristBodilyInjury, "isSelected", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_UninsuredMotoristBodilyInjury"));
			GuidewireAutomate("Uninsured Motorist - BI Limits", PAC_CT_CATAV_UMBI_UninsuredMotoristBILimits, "selectByVisibleText", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_UMBI_UninsuredMotoristBILimits"));
		} else if (strPAC_CT_CATAV_UninsuredMotoristBodilyInjury.equalsIgnoreCase("Remove")) {
			GuidewireAutomate("Uninsured Motorist - Bodily Injury", PAC_CT_CATAV_UninsuredMotoristBodilyInjury, "clickAndwait", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_UninsuredMotoristBodilyInjury"));
			GuidewireAutomate_Validation("Uninsured Motorist - Bodily Injury", PAC_CT_CATAV_UninsuredMotoristBodilyInjury, "isNotSelected", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_UninsuredMotoristBodilyInjury"));
		} else {
			throw new InterruptedIOException("UninsuredMotoristBodilyInjury - No supported Type = " + strPAC_CT_CATAV_UninsuredMotoristBodilyInjury);
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void coveragesAppliedperVehiclesIn() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("paCoverages");

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.PACoverages_Header, "equals", "PA Coverages");
		GuidewireAutomate("Coverages tab", PACoverages_CoveragesTab, "click", "click");

		GuidewireAutomate_Validation("Coverages applied per vehicle in", PAC_CT_CoveragesAppliedPerVehicleIn, "contains", "Coverages applied per vehicle in");

		/*
		 * Comprehensive
		 */
		String strPAC_CT_CAPV_Comprehensive = lhm_TestCase_Table_Data.get("PAC_CT_CAPV_Comprehensive");
		if (strPAC_CT_CAPV_Comprehensive.equalsIgnoreCase("Add")) {
			GuidewireAutomate("Comprehensive", PAC_CT_CAPV_Comprehensive, "clickAndwait", lhm_TestCase_Table_Data.get("PAC_CT_CAPV_Comprehensive"));
			GuidewireAutomate_Validation("Comprehensive", PAC_CT_CAPV_Comprehensive, "isSelected", lhm_TestCase_Table_Data.get("PAC_CT_CAPV_Comprehensive"));
			GuidewireAutomate("Comprehensive Deductible", PAC_CT_CAPV_C_ComprehensiveDeductible, "selectByVisibleText", lhm_TestCase_Table_Data.get("PAC_CT_CAPV_C_ComprehensiveDeductible"));
		} else if (strPAC_CT_CAPV_Comprehensive.equalsIgnoreCase("Verify")) {
			GuidewireAutomate_Validation("Comprehensive", PAC_CT_CAPV_Comprehensive, "isSelected", lhm_TestCase_Table_Data.get("PAC_CT_CAPV_Comprehensive"));
			GuidewireAutomate_Validation("Comprehensive Deductible", PAC_CT_CAPV_C_ComprehensiveDeductible, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("PAC_CT_CAPV_C_ComprehensiveDeductible"));
		} else if (strPAC_CT_CAPV_Comprehensive.equalsIgnoreCase("Modify")) {
			GuidewireAutomate_Validation("Comprehensive", PAC_CT_CAPV_Comprehensive, "isSelected", lhm_TestCase_Table_Data.get("PAC_CT_CAPV_Comprehensive"));
			GuidewireAutomate("Comprehensive Deductible", PAC_CT_CAPV_C_ComprehensiveDeductible, "selectByVisibleText", lhm_TestCase_Table_Data.get("PAC_CT_CAPV_C_ComprehensiveDeductible"));
		} else if (strPAC_CT_CAPV_Comprehensive.equalsIgnoreCase("Remove")) {
			GuidewireAutomate("Comprehensive", PAC_CT_CAPV_Comprehensive, "clickAndwait", lhm_TestCase_Table_Data.get("PAC_CT_CAPV_Comprehensive"));
			GuidewireAutomate_Validation("Comprehensive", PAC_CT_CAPV_Comprehensive, "isNotSelected", lhm_TestCase_Table_Data.get("PAC_CT_CAPV_Comprehensive"));
		} else {
			throw new InterruptedIOException("Comprehensive - No supported Type = " + strPAC_CT_CAPV_Comprehensive);
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void additionalcoveragesAppliedtoallVehiclesIn() throws Throwable {

		try {

			lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("paCoverages");

			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.PACoverages_Header, "equals", "PA Coverages");

			GuidewireAutomate("Additional Coverages tab", PACoverages_AdditionalCoveragesTab, "clickAndwait", "click");
			getStaleElement("Coverages applied to all vehicles", PAC_ACT_CoveragesAppliedtoAllVehicles);
			GuidewireAutomate_Validation("Coverages applied to all vehicles", PAC_ACT_CoveragesAppliedtoAllVehicles, "contains", "Coverages applied to all vehicles");

			/*
			 * Rental Car Loss of Use
			 */
			String strPAC_ACT_CATAV_RentalCarLossOfUse = lhm_TestCase_Table_Data.get("PAC_ACT_CATAV_RentalCarLossOfUse");

			switch (strPAC_ACT_CATAV_RentalCarLossOfUse) {
				case "Add" :
					GuidewireAutomate("Rental Car Loss of Use", PAC_ACT_CATAV_RentalCarLossOfUse, "clickAndwait", strPAC_ACT_CATAV_RentalCarLossOfUse);
					getStaleElement("Rental Car Loss of Use", PAC_ACT_CATAV_RentalCarLossOfUse);
					GuidewireAutomate_Validation("Rental Car Loss of Use", PAC_ACT_CATAV_RentalCarLossOfUse, "isSelected", strPAC_ACT_CATAV_RentalCarLossOfUse);
					GuidewireAutomate("Rental Car Loss of Use Limit", PAC_ACT_CATAV_RCL_RentalCarLossOfUseLimit, "selectByVisibleText", lhm_TestCase_Table_Data.get("PAC_ACT_CATAV_RCL_RentalCarLossOfUseLimit"));
					break;
				case "Verify" :
					GuidewireAutomate_Validation("Rental Car Loss of Use", PAC_ACT_CATAV_RentalCarLossOfUse, "isSelected", strPAC_ACT_CATAV_RentalCarLossOfUse);
					GuidewireAutomate_Validation("Rental Car Loss of Use Limit", PAC_ACT_CATAV_RCL_RentalCarLossOfUseLimit, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("PAC_ACT_CATAV_RCL_RentalCarLossOfUseLimit"));
					break;
				case "Modify" :
					GuidewireAutomate_Validation("Rental Car Loss of Use", PAC_ACT_CATAV_RentalCarLossOfUse, "isSelected", strPAC_ACT_CATAV_RentalCarLossOfUse);
					GuidewireAutomate("Rental Car Loss of Use Limit", PAC_ACT_CATAV_RCL_RentalCarLossOfUseLimit, "selectByVisibleText", lhm_TestCase_Table_Data.get("PAC_ACT_CATAV_RCL_RentalCarLossOfUseLimit"));
					break;
				case "Remove" :
					GuidewireAutomate("Rental Car Loss of Use", PAC_ACT_CATAV_RentalCarLossOfUse, "clickAndwait", strPAC_ACT_CATAV_RentalCarLossOfUse);
					GuidewireAutomate_Validation("Rental Car Loss of Use", PAC_ACT_CATAV_RentalCarLossOfUse, "isNotSelected", strPAC_ACT_CATAV_RentalCarLossOfUse);
					break;

				default :
					throw new InterruptedIOException("Rental Car Loss of Use - No supported Type = " + strPAC_ACT_CATAV_RentalCarLossOfUse);
			}

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

			oExtentTest.log(Status.PASS, "additionalcoveragesAppliedtoallVehiclesIn is succcesful");

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "additionalcoveragesAppliedtoallVehiclesIn is not succcesful");
			e.printStackTrace();
			throw e;
		}

	}

	public static void additionalcoveragesAppliedperVehiclesIn() throws Throwable {

		try {

			lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("paCoverages");

			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.PACoverages_Header, "equals", "PA Coverages");

			GuidewireAutomate("Additional Coverages tab", PACoverages_AdditionalCoveragesTab, "clickAndwait", "click");

			getStaleElement("Coverages applied per vehicle in", PAC_ACT_CoveragesAppliedPerVehicleIn);
			GuidewireAutomate_Validation("Coverages applied per vehicle in", PAC_ACT_CoveragesAppliedPerVehicleIn, "contains", "Coverages applied per vehicle in");

			/*
			 * Electronic Equipment
			 */
			String strPAC_ACT_CAPV_ElectronicEquipment = lhm_TestCase_Table_Data.get("PAC_ACT_CAPV_ElectronicEquipment");
			if (strPAC_ACT_CAPV_ElectronicEquipment.equalsIgnoreCase("Add")) {
				GuidewireAutomate("Electronic Equipment", PAC_ACT_CAPV_ElectronicEquipment, "clickAndwait", strPAC_ACT_CAPV_ElectronicEquipment);
				getStaleElement("Increased Limit", PAC_ACT_CAPV_EE_IncreasedLimit);
				GuidewireAutomate_Validation("Electronic Equipment", PAC_ACT_CAPV_ElectronicEquipment, "isSelected", strPAC_ACT_CAPV_ElectronicEquipment);
				GuidewireAutomate("Increased Limit", PAC_ACT_CAPV_EE_IncreasedLimit, "selectByVisibleText", lhm_TestCase_Table_Data.get("PAC_ACT_CAPV_EE_IncreasedLimit"));
			} else if (strPAC_ACT_CAPV_ElectronicEquipment.equalsIgnoreCase("Verify")) {
				GuidewireAutomate_Validation("Electronic Equipment", PAC_ACT_CAPV_ElectronicEquipment, "isSelected", strPAC_ACT_CAPV_ElectronicEquipment);
				GuidewireAutomate_Validation("Increased Limit", PAC_ACT_CAPV_EE_IncreasedLimit, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("PAC_ACT_CAPV_EE_IncreasedLimit"));
			} else if (strPAC_ACT_CAPV_ElectronicEquipment.equalsIgnoreCase("Modify")) {
				GuidewireAutomate_Validation("Electronic Equipment", PAC_ACT_CAPV_ElectronicEquipment, "isSelected", strPAC_ACT_CAPV_ElectronicEquipment);
				GuidewireAutomate("Increased Limit", PAC_ACT_CAPV_EE_IncreasedLimit, "selectByVisibleText", lhm_TestCase_Table_Data.get("PAC_ACT_CAPV_EE_IncreasedLimit"));
			} else if (strPAC_ACT_CAPV_ElectronicEquipment.equalsIgnoreCase("Remove")) {
				GuidewireAutomate("Electronic Equipment", PAC_ACT_CAPV_ElectronicEquipment, "clickAndwait", strPAC_ACT_CAPV_ElectronicEquipment);
				GuidewireAutomate_Validation("Electronic Equipment", PAC_ACT_CAPV_ElectronicEquipment, "isNotSelected", strPAC_ACT_CAPV_ElectronicEquipment);
			} else {
				throw new InterruptedIOException("Electronic Equipment - No supported Type = " + strPAC_ACT_CAPV_ElectronicEquipment);
			}

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

			oExtentTest.log(Status.PASS, "additional applied per vehicle in is succcesful");

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "additional applied per vehicle in is not succcesful");
			e.printStackTrace();
			throw e;
		}

	}

	public static void exclusionsAndConditions() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("paCoverages");

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.PACoverages_Header, "equals", "PA Coverages");
		GuidewireAutomate("ExclusionsAndConditionsCardTab", PACoverages_ExclusionsAndConditionsCardTab, "click", "click");

		GuidewireAutomate("AddExclusionCondition", PAC_ECT_AddExclusionCondition, "click", "click");

		SearchAddExclusionorCondition();

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void SearchAddExclusionorCondition() throws Throwable {
		// ------->Verifying Search Exclusions And Conditions for Personal Auto
		// Line
		GuidewireAutomate_Validation("Search Exclusions And Conditions for Personal Auto Line title", PAC_ECT_Search_Exclusions_And_Conditions_for_Personal_Auto_Line_titlebar, "equals", "Search Exclusions And Conditions for Personal Auto Line");
		GuidewireAutomate("Category", PAC_ECT_SEC_PAL_Category, "selectByVisibleText", lhm_TestCase_Table_Data.get("PAC_ECT_SEC_PAL_Category"));
		GuidewireAutomate("Keyword", PAC_ECT_SEC_PAL_Keyword, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PAC_ECT_SEC_PAL_Keyword"));
		// ----->clicking on search button
		GuidewireAutomate("Type_ExclusionandCondition", PAC_ECT_SEC_PAL_Type_ExclusionandCondition, "click", "click");
		GuidewireAutomate("SearchButton", PAC_ECT_SEC_PAL_SearchButton, "click", "click");
		// ------>clicking on Coverage Checkbox
		GuidewireAutomate("Coverage Checkbox", PAC_ECT_SEC_PAL_SearchResult_Select, "click", "click");
		// ----->clicking on Add Selected Exclusions And Conditions button
		GuidewireAutomate("Add Selected Exclusions And Conditions button", PAC_ECT_SEC_PAL_AddSelectedExclusionsAndConditions_button, "click", "click");
	}

}
