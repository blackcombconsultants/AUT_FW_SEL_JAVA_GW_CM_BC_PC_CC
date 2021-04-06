package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface CreateManualCheck_PO {
	
	final By clicknAction=By.xpath("//*[@id='Claim-ClaimMenuActions']/div[1]/div[2]/div");
	final By actinSubmenu1=By.xpath("//*[@id='Claim-ClaimMenuActions']/div[3]");
	final By actinSubmenu2=By.xpath("//*[@id='Claim-ClaimMenuActions-ClaimMenuActions_NewTransaction-ClaimMenuActions_NewTransaction_CheckSet']/div/div[2]");
	final By payeeName=By.name("NormalCreateCheckWizard-CheckWizard_CheckPayeesScreen-NewCheckPayeeDV-PrimaryPayee_Name");
	final By type=By.name("NormalCreateCheckWizard-CheckWizard_CheckPayeesScreen-NewCheckPayeeDV-PrimaryPayee_Type");
	final By next=By.id("NormalCreateCheckWizard-Next");



}
