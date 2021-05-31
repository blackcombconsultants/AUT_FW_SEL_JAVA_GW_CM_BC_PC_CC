package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_Resuables_PO {

	final By Next = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Next']");
	final By  Finish=By.xpath("//div[contains(@id,'Finish')]//div[@role='button']");
	final By OK=By.xpath("//div[contains(@id,'NewInjuryIncidentScreen-Update')]//div[@role='button']");
	final By Update=By.xpath("//div[contains(@id,'Update')]");
	/*
	 * Headers
	 */
	
	final By  services_Header=By.xpath("//div[contains(@id,'ServicesScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By  saveandassign_Header=By.xpath("//div[contains(@id,'AssignSaveScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By  newClaimSaved_Header=By.xpath("//div[contains(@id,'NewClaimSavedScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
    final By  assignClaim_Header=By.xpath("//div[contains(@id,'AssignmentPopupScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
    final By EditReserves_Header=By.xpath("//div[contains(@id,'NewReserveSetScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
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
	final By Injury_Incident_Overview=By.xpath("//div[contains(@id,'Injury_IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	final By IIO_NewIncident=By.xpath("//div[contains(@id,'NewIncidentMenuItem')]//div[@class='gw-label']");
    final By II_LossParty=By.xpath("//select[contains(@name,'InjuryIncidentInputSet-LossParty')]");

    /*
     * Edit reserve
     */
   
    final By ER_CostType=By.xpath("//select[contains(@name,'CostType')]");
    final By ER_CostCategory=By.xpath("//select[contains(@name,'CostCategory')]");
    final By ER_NewAvailableReserves=By.xpath("//input[contains(@name,'EditableReservesLV-1-NewAmount')]");
    final By ER_Save=By.xpath("//div[contains(@id,'Update')]//div[@role='button']");
}
