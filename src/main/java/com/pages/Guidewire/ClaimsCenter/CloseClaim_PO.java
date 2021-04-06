package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface CloseClaim_PO {

	final By clicknAction=By.xpath("//*[@id='Claim-ClaimMenuActions']/div[1]/div[2]/div");
	final By actinSubmenu1=By.xpath("//*[@id='Claim-ClaimMenuActions']/div[3]");
	final By actinSubmenu2=By.xpath("//*[@id='Claim-ClaimMenuActions-ClaimFileMenuItemSet-ClaimMenuActions_ClaimActions-ClaimMenuActions_CloseClaim']/div/div[2]");
	final By outcome=By.name("CloseExposurePopup-CloseExposureScreen-CloseExposureInfoDV-Outcome");
	final By outcome1=By.name("CloseExposurePopup-CloseExposureScreen-CloseExposureInfoDV-Outcome");
	final By closeClaim1=By.xpath("//*[@id='CloseExposurePopup-CloseExposureScreen-Update']/div/div[2]/div");
	final By closeClaim=By.xpath("//div[@id='CloseClaimPopup-CloseClaimScreen-Update'");
	final By claimStatus=By.xpath("//*[@id='l--11']");
	final By accountIcon=By.xpath("//div[@id='TabBar-AccountTab']//div[@class='gw-action--expand-button']");
	final By accountSearchTextBox=By.xpath("//input[@name='TabBar-AccountTab-AccountTab_AccountNumberSearchItem']");
	final By searchIcon=By.xpath("//div[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem_Button']");
	final By claimMenu=By.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_AccountFile_Claims']");
	final By searchButton=By.xpath("//div[@id='AccountFile_Claims-AccountFile_ClaimScreen-SearchAndResetInputSet-SearchLinksInputSet-Search']");
	final By policyStatus=By.xpath("//tr[@id='AccountFile_Claims-AccountFile_ClaimScreen-AccountClaimsLV-5']/td[6]/ancestor::tr/following-sibling::tr/td[6]");
	
	
	
	
	

}
