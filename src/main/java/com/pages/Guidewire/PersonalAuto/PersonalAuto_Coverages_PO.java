package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Coverages_PO {

	final By PA_Coverages_Screen_titlebar = By.xpath("//div[contains(@id,'PersonalAutoScreen-ttlBar')]//div[1]//div");

	/*
	 * CoveragesTab
	 */
	final By PACoverages_CoveragesTab = By.xpath("//div[contains(@id,'PersonalAutoScreen-CoveragesTab')]");

	/*
	 * CoveragesAppliedtoAllVehicles
	 */

	final By PAC_CT_CoveragesAppliedtoAllVehicles = By.xpath(
			"//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Coverages applied to all vehicles')]");

	// --->PA_Coverages_CheckBox xpath
	final By PAC_CT_CATAV_Liability_Bodily_Injury_and_Property_Damage = By.xpath(
			"//div[@role='heading' and text()='Liability - Bodily Injury and Property Damage']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	final By PAC_CT_CATAV_LBIPD_AutoLiabilityPackage = By.xpath(
			"//div[@class='gw-label' and text()='Auto Liability Package']/parent::div//select[contains(@name,'CoverageInputSet')]");

	final By PAC_CT_CATAV_MedicalPayments = By.xpath(
			"//div[@role='heading' and text()='Medical Payments']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	final By PAC_CT_CATAV_MP_MedicalLimit = By.xpath(
			"//div[@class='gw-label' and text()='Medical Limit']/parent::div//select[contains(@name,'CoverageInputSet')]");

	final By PAC_CT_CATAV_Uninsured_Motorist_Bodily_Injury = By.xpath(
			"//div[@role='heading' and text()='Uninsured Motorist - Bodily Injury']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	final By PAC_CT_CATAV_UMBI_UninsuredMotorist_BILimits = By.xpath(
			"//div[@class='gw-label' and text()='Uninsured Motorist - BI Limits']/parent::div//select[contains(@name,'CoverageInputSet')]");

	final By PAC_CT_CATAV_Uninsured_Motorist_Property_Damage = By.xpath(
			"//div[@role='heading' and text()='Uninsured Motorist - Property Damage']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	final By PAC_CT_CATAV_UMBD_UninsuredMotorist_PropertyDamageLimit = By.xpath(
			"//div[@class='gw-label' and text()='Uninsured Motorist - Property Damage Limit']/parent::div//select[contains(@name,'CoverageInputSet')]");

	final By PAC_CT_CATAV_Underinsured_Motorist_Property_Damage = By.xpath(
			"//div[@role='heading' and text()='Underinsured Motorist - Property Damage']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	final By PAC_CT_CATAV_UMPD_UnderinsuredMotorist_PropertyDamageLimit = By.xpath(
			"//div[@class='gw-label' and text()='Underinsured Motorist - Property Damage Limit']/parent::div//select[contains(@name,'CoverageInputSet')]");

	final By PAC_CT_CATAV_Mexico_Coverage_Limited = By.xpath(
			"//div[@role='heading' and text()='Mexico Coverage - Limited']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	/*
	 * Coverages applied per vehicle in
	 * 
	 */

	final By PAC_CT_CoveragesAppliedPerVehicleIn = By.xpath(
			"//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Coverages applied per vehicle in')]");

	// --->PA_Coverages_CheckBox xpath
	final By PAC_CT_CAPV_Comprehensive = By.xpath(
			"//div[@role='heading' and text()='Comprehensive']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	final By PAC_CT_CAPV_C_ComprehensiveDeductible = By.xpath(
			"//div[@class='gw-label' and text()='Comprehensive Deductible']/parent::div//select[contains(@name,'CoverageInputSet')]");

	final By PAC_CT_CAPV_Collision = By.xpath(
			"//div[@role='heading' and text()='Collision']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	final By PAC_CT_CAPV_C_CollisionDeductible = By.xpath(
			"//div[@class='gw-label' and text()='Collision Deductible']/parent::div//select[contains(@name,'CoverageInputSet')]");

	final By PAC_CT_CAPV_TowingLabor = By.xpath(
			"//div[@role='heading' and text()='Towing and Labor']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	final By PAC_CT_CAPV_TL_TowingLaborLimit = By.xpath(
			"//div[@class='gw-label' and text()='Towing and Labor Limit']/parent::div//select[contains(@name,'CoverageInputSet')]");

	final By PAC_CT_CAPV_RentalReimbursement = By.xpath(
			"//div[@role='heading' and text()='Rental Reimbursement']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	final By PAC_CT_CAPV_RR_RentalPackage = By.xpath(
			"//div[@class='gw-label' and text()='Rental Package']/parent::div//select[contains(@name,'CoverageInputSet')]");

	/*
	 * AdditionalCoveragesTab
	 */
	final By PACoverages_AdditionalCoveragesTab = By
			.xpath("//div[contains(@id,'PersonalAutoScreen-AdditionalCoveragesTab')]");

	/*
	 * CoveragesAppliedtoAllVehicles
	 */

	// --->PA_Coverages_CheckBox tabs
	final By PAC_ACT_CoveragesAppliedtoAllVehicles = By.xpath(
			"//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Coverages applied to all vehicles')]");

	final By PAC_ACT_CATAV_Rental_Car_Loss_of_Use = By.xpath(
			"//div[@role='heading' and text()='Rental Car Loss of Use']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	final By PAC_ACT_CATAV_RCL_Rental_Car_Loss_of_Use_Limit = By.xpath(
			"//div[@class='gw-label' and text()='Rental Car Loss of Use Limit']/parent::div//select[contains(@name,'CoverageInputSet')]");

	/*
	 * Coverages applied per vehicle in
	 * 
	 */
	final By PAC_ACT_CoveragesAppliedPerVehicleIn = By.xpath(
			"//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Coverages applied per vehicle in')]");

	final By PAC_ACT_CAPV_ElectronicEquipment = By.xpath(
			"//div[@role='heading' and text()='Electronic Equipment']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	final By PAC_ACT_CAPV_EE_IncreasedLimit = By.xpath(
			"//div[@class='gw-label' and text()='Increased Limit']/parent::div//select[contains(@name,'CoverageInputSet')]");

	final By PAC_ACT_CAPV_TapeDiscMedia = By.xpath(
			"//div[@role='heading' and text()='Tape / Disc Media']/preceding-sibling::div//input[contains(@name,'CoverageInputSet-CovPatternInputGroup')]");
	final By PAC_ACT_CAPV_TDM_TapeDiscMediaLimit = By.xpath(
			"//div[@class='gw-label' and text()='Tape / Disc Media Limit']/parent::div//div[contains(@class,'gw-ValueWidget')]");

	/*
	 * exclusionsAndConditionsCardTab
	 */

	final By PACoverages_ExclusionsAndConditionsCardTab = By
			.xpath("//div[contains(@id,'PersonalAutoScreen-exclusionsAndConditionsCardTab')]");

	final By PAC_ECT_AddExclusionCondition = By
			.xpath("//div[contains(@id,'AddExclusionsOrCondition')]/div[@role='button']");

	/*
	 * Search Exclusions And Conditions for Personal Auto Line
	 */
	final By PAC_ECT_Search_Exclusions_And_Conditions_for_Personal_Auto_Line_titlebar = By.xpath(
			"//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Search Exclusions And Conditions for Personal Auto Line']");

	final By PAC_ECT_SEC_PAL_Category = By
			.xpath("//select[contains(@name,'CoveragePatternSearchDV-CoverageCategory')]");
	final By PAC_ECT_SEC_PAL_Keyword = By.xpath("//div[contains(@id,'CoveragePatternSearchDV-Keyword')]//input");
	final By PAC_ECT_SEC_PAL_Type_Exclusion = By.xpath("//input[contains(@id,'CoveragePatternSearchDV-SearchType_0')]");
	final By PAC_ECT_SEC_PAL_Type_Condition = By.xpath("//input[contains(@id,'CoveragePatternSearchDV-SearchType_1')]");
	final By PAC_ECT_SEC_PAL_Type_ExclusionandCondition = By
			.xpath("//input[contains(@id,'CoveragePatternSearchDV-SearchType_2')]");
	final By PAC_ECT_SEC_PAL_SearchButton = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");

	final By PAC_ECT_SEC_PAL_SearchResult_Select = By.xpath(
			"//tr[contains(@id,'CoveragePatternSearchResultsLV') and contains(@class,'gw-standard-row')]/td[contains(@class,'gw-impl-cell--CB')]//div[contains(@id,'_Checkbox') and contains(@class,'gw-IteratorEntryCheckBoxWidget')]/input[@type='checkbox']");

	final By PAC_ECT_SEC_PAL_AddSelectedExclusionsAndConditions_button = By
			.xpath("//div[contains(@id,'AddCoverageButton')]");

	/*
	 * 
	 * 
	 * void pa_Coverages() throws Throwable;
	 * 
	 * void coveragesAppliedtoallVehiclesIn(String testingType) throws Throwable;
	 * 
	 * void coveragesAppliedperVehiclesIn(String testingType) throws Throwable;
	 * 
	 * void additionalcoveragesAppliedtoallVehiclesIn(String testingType) throws
	 * Throwable;
	 * 
	 * void additionalcoveragesAppliedperVehiclesIn(String testingType) throws
	 * Throwable;
	 * 
	 * void exclusionsAndConditions() throws Throwable;
	 * 
	 * void SearchAddExclusionorCondition() throws Throwable;
	 */
}
