package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_PolicyReview_PO {

	/*
	 * Primary Named Insured
	 */

	final By PR_PrimaryNamedInsured = By.xpath(
			"//div[contains(@id,'ReviewSummaryDV-PrimaryNamedInsured')]//div[@class='gw-value-readonly-wrapper']");
	final By PR_Address = By.xpath(
			"//div[contains(@id,'GlobalAddressInputSet-AddressSummary')]//div[@class='gw-value-readonly-wrapper']");
	final By PR_County = By
			.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	final By PR_AddressType = By.xpath(
			"//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType') and contains(@class,'gw-ValueWidget')]//div[@class='gw-label']");
	final By PR_AddressDescription = By.xpath(
			"//div[contains(@id,'AddressDescription') and contains(@class,'gw-ValueWidget')]//div[@class='gw-value-readonly-wrapper']");
	final By PR_DateQuoteNeeded = By.xpath(
			"//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-DateQuoteNeeded')]//div[@class='gw-value-readonly-wrapper']");
	final By PR_EffectiveDate = By.xpath(
			"//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-EffectiveDate')]//div[@class='gw-value-readonly-wrapper']");
	final By PR_ExpirationDate = By.xpath(
			"//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-ExpirationDate_Input')]//div[@class='gw-value-readonly-wrapper']");
	final By PR_Product = By.xpath(
			"//div[contains(@id,'SubmissionWizard_ReviewSummaryDV-Product')]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * Personal Auto Line
	 */
	final By PR_PersonalAutoLine = By
			.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Personal Auto Line']");

	/*
	 * Policy Level Coverages
	 */

	final By PR_PAL_PolicyLevelCoverages = By
			.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Policy Level Coverages']");

	final By PR_PAL_PLC_AutoLiabilityPackage = By.xpath(
			"//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Description_Cell')]//div[@class='gw-value-readonly-wrapper' and text()='Auto Liability Package']");

	final By PR_PAL_PLC_AutoLiabilityPackage_Value = By.xpath(
			"//div[@class='gw-value-readonly-wrapper' and text()='Auto Liability Package']/ancestor::td[contains(@id,'Description_Cell')]/following-sibling::td//div[@class='gw-value-readonly-wrapper']");

	final By PR_PAL_PLC_MedicalLimit = By.xpath(
			"//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Description_Cell')]//div[@class='gw-value-readonly-wrapper' and text()='Medical Limit']");

	final By PR_PAL_PLC_MedicalLimit_Value = By.xpath(
			"//div[@class='gw-value-readonly-wrapper' and text()='Medical Limit']/ancestor::td[contains(@id,'Description_Cell')]/following-sibling::td//div[@class='gw-value-readonly-wrapper']");

	/*
	 * Vehicle Level Coverages
	 */

	final By PR_PAL_VehicleLevelCoverages = By
			.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Vehicle Level Coverages']");
	final By PR_PAL_VLC_Garage1 = By
			.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Garage 1']");
	final By PR_PAL_VLC_Vehicle1 = By
			.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Vehicle 1']");

	final By PR_PAL_VLC_V_Year = By.xpath(
			"//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Year_Cell')]//div[@class='gw-value-readonly-wrapper']");
	final By PR_PAL_VLC_V_VIN = By.xpath(
			"//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Vin_Cell')]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * PrimaryDrivers
	 */
	final By PR_PAL_VLC_PrimaryDriver = By
			.xpath("//div[@class='gw-VerbatimWidget--inner' and contains(text(),'Primary Driver')]");

	/*
	 * AssignedDrivers
	 */
	final By PR_PAL_VLC_AssignedDrivers = By
			.xpath("//div[@class='gw-VerbatimWidget--inner' and text()='Assigned Drivers']");
	final By PR_PAL_VLC_AD_Driver = By.xpath(
			"//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Driver_Cell')]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * VehicleRateModifiers
	 */
	final By PR_PAL_VLC_V_VehicleRateModifiers = By
			.xpath("//div[@class='gw-VerbatimWidget--inner' and text()='Vehicle Rate Modifiers']");
	final By PR_PAL_VLC_V_VRM_AntiLockBrakesDiscount = By.xpath(
			"//td[contains(@id,'VehicleModifierCell_Cell')]//div[contains(@id,'PolicyLineSummaryPanelSet-0-0-ModIterator-0-BooleanModifier')]");
	final By PR_PAL_VLC_V_VRM_PassiveRestraintSystem = By.xpath(
			"//td[contains(@id,'VehicleModifierCell_Cell')]//div[contains(@id,'PolicyLineSummaryPanelSet-0-0-ModIterator-1-TypeKeyModifier')]");
	final By PR_PAL_VLC_V_VRM_AntiTheftDiscount = By.xpath(
			"//td[contains(@id,'VehicleModifierCell_Cell')]//div[contains(@id,'PolicyLineSummaryPanelSet-0-0-ModIterator-2')]//div[contains(@id,'ModIterator-2-TypeKeyModifier')]");

	/*
	 * VehicleCoverages
	 */
	final By PR_PAL_VLC_V_VehicleCoverages = By
			.xpath("//div[@class='gw-VerbatimWidget--inner' and text()='Vehicle Coverages']");

	final By PR_PAL_VLC_V_VC_ComprehensiveDeductible = By.xpath(
			"//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Description_Cell')]//div[@class='gw-value-readonly-wrapper' and text()='Comprehensive Deductible']");

	final By PR_PAL_VLC_V_VC_ComprehensiveDeductible_Value = By.xpath(
			"//div[@class='gw-value-readonly-wrapper' and text()='Comprehensive Deductible']/ancestor::td[contains(@id,'Description_Cell')]/following-sibling::td//div[@class='gw-value-readonly-wrapper']");

	final By PR_PAL_VLC_V_VC_TowingandLaborLimit = By.xpath(
			"//tr[contains(@class,'gw-standard-row')]/td[contains(@id,'Description_Cell')]//div[@class='gw-value-readonly-wrapper' and text()='Towing and Labor Limit']");

	final By PR_PAL_VLC_V_VC_TowingandLaborLimit_Value = By.xpath(
			"//div[@class='gw-value-readonly-wrapper' and text()='Towing and Labor Limit']/ancestor::td[contains(@id,'Description_Cell')]/following-sibling::td//div[@class='gw-value-readonly-wrapper']");

	/*
	 * Exclusions
	 */
	final By PR_PAL_ExclusionsConditions = By
			.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Exclusions and Conditions']");

	/*
	 * 
	 * 
	 * void policyDetails() throws Throwable;
	 * 
	 * void policyLevelCoverages() throws Throwable;
	 * 
	 * void vehicleLevelCoverages() throws Throwable;
	 */
}
