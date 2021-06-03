package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_CreateRecovery_PO {

	
	final By  CreateRecovery_Header=By.xpath("//div[contains(@id,'NewRecoveryScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	/*
	 * Create Recovery
	 */
	
	final By CR_Payer=By.xpath("//select[contains(@name,'RecoveryDetailDV-Payer')]");
	final By CR_ReserveLine=By.xpath("//select[contains(@name,'ReserveLineInputSet-ReserveLine')]");
	final By PD_CostType=By.xpath("//select[contains(@name,'ReserveLineInputSet-CostType')]");
	final By PD_CostCategory=By.xpath("//select[contains(@name,'ReserveLineInputSet-CostCategory')]");
	final By CR_RecoveryCategory=By.xpath("//select[contains(@name,'RecoveryDetailDV-RecoveryCategory')]");
	final By CR_Category=By.xpath("//select[contains(@name,'LineCategory')]");
	final By CR_Amount=By.xpath("//input[contains(@name,'EditableRecoveryLineItemsLV-0-Amount')]");
}
