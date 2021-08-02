package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface SaveAndAssignClaim_PO {

	final By assignClaimTo = By.name("");
	final By testClickTop  = By.id("gw-center-title-toolbar");
	final By finish        = By.xpath("//*[@id='FNOLWizard-Finish']/div/div[2]/div");
	final By claimNum      = By.id("NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-Header");
	final By clickOnLink   = By.id("NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-GoToClaim");

}
