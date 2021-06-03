package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_Resuables_PO {

	final By Next = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Next']");
	final By  Finish=By.xpath("//div[contains(@id,'Finish')]//div[@role='button']");
	final By OK=By.xpath("//div[contains(@id,'NewInjuryIncidentScreen-Update')]//div[@role='button']");
	final By Update=By.xpath("//div[contains(@id,'Update')]");


	final By insuredName=By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']");


	/*
	 * Headers
	 */

	final By  AutoFirstandFinal_Header=By.xpath("//div[contains(@id,'AutoFirstAndFinalScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By  QuickClaimAuto_Header=By.xpath("//div[contains(@id,'NewQuickClaimScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By  services_Header=By.xpath("//div[contains(@id,'ServicesScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By  saveandassign_Header=By.xpath("//div[contains(@id,'AssignSaveScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By  newClaimSaved_Header=By.xpath("//div[contains(@id,'NewClaimSavedScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By  assignClaim_Header=By.xpath("//div[contains(@id,'AssignmentPopupScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By EditReserves_Header=By.xpath("//div[contains(@id,'NewReserveSetScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By PolicyGeneral_Header=By.xpath("//div[contains(@id,'ClaimPolicyGeneralScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By SelectPolicy_Header=By.xpath("//div[contains(@id,'ClaimPolicySelectPolicyScreen-ttlBar')]//div[@class='gw-TitleBar--title']");

	/*
	 * AutoFirstandFinal
	 */
	final By AFF_Name=By.xpath("//select[contains(@name,'FirstAndFinalScreenInsuredClaimant')]");
	final By AFF_Damage_LossDescription=By.xpath("//textarea[contains(@name,'Description')]");
	final By Location=By.xpath("//select[contains(@name,'Address_Picker')]");
	final By State=By.xpath("//div[contains(@id,'AutoFirstAndFinalScreen-22')]//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By AFF_Claimant_Name=By.xpath("//select[contains(@name,'Claimant_Picker')]");
	final By AFF_Repair=By.xpath("//div[contains(@id,'RepairShop_PickerMenuIcon')]//div[@class='gw-action--expand-button']");
	final By AFF_NewAutobodyRepairShop=By.xpath("//div[contains(@id,'AutoRepairShop')]//div[@class='gw-label' and text()='New Autobody Repair Shop']");
	final By AFF_AutoRepairShop_Name=By.xpath("//input[contains(@name,'Name')]");
	final By AFF_AutoRepairShop_TaxID=By.xpath("//input[contains(@name,'ContactBasicsDV-V_EIN')]");
	
	final By AFF_AutoRepairShop_Address1=By.xpath("//input[contains(@name,'AddressLine1')]");
    final By AFF_AutoRepairShop_City=By.xpath("//input[contains(@name,'City')]");
    final By AFF_AutoRepairShop_County=By.xpath("//input[contains(@name,'County')]");
    final By AFF_AutoRepairShop_State=By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
    final By AFF_AutoRepairShop_ZIPCode=By.xpath("//input[contains(@name,'PostalCode')]");
	
	final By AFF_Financials_Name=By.xpath("//select[contains(@name,'FNOLWizardCheckDV-Payee_Picker')]");
	final By AFF_Financials_PayeeType=By.xpath("//select[contains(@name,'PayeeRole')]");

	final By AFF_Financials_Amount=By.xpath("//input[contains(@name,'CheckAmount')]");
	final By AFF_Financials_State=By.xpath("//div[contains(@id,'FNOLWizardCheckDV')]//select[contains(@name,'GlobalAddressInputSet-State')]");

  /*
 * QuickClaimAuto
 */
	final By QCA_ReportedBy_Name=By.xpath("//select[contains(@name,'ReportedBy_Name')]");
	final By QCA_LossDetails_LossCause=By.xpath("//select[contains(@name,'LossCause')]");
	final By QCA_LossDetails_State=By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	/*
	 * services Rental
	 */
	final By Assign=By.xpath("//div[contains(@id,'AssignmentPopupScreen_ButtonButton')]//div[@role='button']");

	final By SR_RentalBeginDate=By.xpath("//input[contains(@name,'RentalInputGroup-RentalBeginDate')]");
	final By SR_RentalEndDate=By.xpath("//input[contains(@name,'RentalInputGroup-RentalEndDate')]");
	final By SR_RentalDailyRate=By.xpath("//input[contains(@name,'RentalInputGroup-RentalRate')]");
	final By SR_RentalAgency=By.xpath("//select[contains(@name,'RentalInputGroup-RentalAgency')]");
	final By SR_PickupLocation=By.xpath("//select[contains(@name,'ServiceAddressPicker')]");

	/*
	 *  NewExposure-MedPay
	 */
	final By NewExposurMedPay_Header=By.xpath("//div[@id='NewExposure-NewExposureScreen-ttlBar']//div[@class='gw-TitleBar--title']");
	final By NEMP_Claimant=By.xpath("//select[contains(@name,'NewExposureDV-Claimant_Picker')]");

	/*
	 * Injury Incident Overview
	 */
	final By Injury_Incident_Overview=By.xpath("//div[contains(@id,'Injury_IncidentMenuIcon')]//div[@role='button']");
	final By IIO_NewIncident=By.xpath("//div[contains(@id,'NewIncidentMenuItem')]//div[@class='gw-label']");
	final By II_LossParty=By.xpath("//select[contains(@name,'InjuryIncidentInputSet-LossParty')]");

	/*
	 * Edit reserve
	 */

	final By ER_CostType=By.xpath("//select[contains(@name,'CostType')]");
	final By ER_CostCategory=By.xpath("//select[contains(@name,'CostCategory')]");
	final By ER_NewAvailableReserves=By.xpath("//input[contains(@name,'NewAmount')]");
	final By ER_Save=By.xpath("//div[contains(@id,'Update')]//div[@role='button']");

	/*
	 * Select Policy
	 */
	final By SelectPolicy=By.xpath("//div[contains(@id,'SelectPolicyButton')]//div[@role='button']");
	final By SP_PolicyNumber=By.xpath("//input[contains(@name,'PolicyNumber')]");
	final By  SP_Search=By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By SP_Select=By.xpath("//div[contains(@id,'PolicySearchResultLV-0-_Select')]");		
}
