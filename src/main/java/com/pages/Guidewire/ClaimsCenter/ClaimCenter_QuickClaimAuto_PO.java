package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_QuickClaimAuto_PO {
	final By QuickClaimAuto_Header = By
			.xpath("//div[contains(@id,'NewQuickClaimScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	/*
	 * QuickClaimAuto
	 */
	final By QCA_ReportedBy_Name = By.xpath("//select[contains(@name,'ReportedBy_Name')]");
	final By QCA_LossDetails_LossCause = By.xpath("//select[contains(@name,'LossCause')]");
	final By QCA_LossDetails_State = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By QCA_Location = By.xpath("//select[contains(@name,'Address_Picker')]");
}
