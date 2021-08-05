package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface CCC_ClaimActions_CloseClaim_PO {

	final By CloseClaim_Header  = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By CloseClaim_Note    = By.xpath("//textarea[contains(@name,'Note')]");
	final By CloseClaim_Outcome = By.xpath("//select[contains(@name,'CloseClaimInfoDV-Outcome')]");
	final By CloseClaim_button  = By.xpath("//div[contains(@id,'CloseClaimScreen-Update')]");
	final By CloseClaim_Cancel  = By.xpath("//div[contains(@id,'CloseClaimScreen-Cancel')]");

	final By CloseClaim_ValidationResults     = By.xpath("//div[contains(@id,'wsTabBar')]//div[@class='gw-label']");
	final By CloseClaim_OpenActvitiesErrorMsg = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'This claim has open activities')]");
	final By CloseClaim_OpenExpsoureErrorMsg  = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'There are still open exposures for this claim')]");
	final By CloseClaim_FaultRatingMsg        = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'The Fault Rating must be determined')]");

	final By Expsoure_Header        = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By CloseClaim_Clear       = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]");
	final By FinancialChecks_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By Summary_Header         = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");

	final By clicknAction         = By.xpath("//*[@id='Claim-ClaimMenuActions']/div[1]/div[2]/div");
	final By actinSubmenu1        = By.xpath("//*[@id='Claim-ClaimMenuActions']/div[3]");
	final By actinSubmenu2        = By.xpath("//*[@id='Claim-ClaimMenuActions-ClaimFileMenuItemSet-ClaimMenuActions_ClaimActions-ClaimMenuActions_CloseClaim']/div/div[2]");
	final By outcome              = By.name("CloseExposurePopup-CloseExposureScreen-CloseExposureInfoDV-Outcome");
	final By outcome1             = By.name("CloseExposurePopup-CloseExposureScreen-CloseExposureInfoDV-Outcome");
	final By closeClaim1          = By.xpath("//*[@id='CloseExposurePopup-CloseExposureScreen-Update']/div/div[2]/div");
	final By closeClaim           = By.xpath("//div[@id='CloseClaimPopup-CloseClaimScreen-Update'");
	final By claimStatus          = By.xpath("//*[@id='l--11']");
	final By accountIcon          = By.xpath("//div[@id='TabBar-AccountTab']//div[@class='gw-action--expand-button']");
	final By accountSearchTextBox = By.xpath("//input[@name='TabBar-AccountTab-AccountTab_AccountNumberSearchItem']");
	final By searchIcon           = By.xpath("//div[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem_Button']");
	final By claimMenu            = By.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_AccountFile_Claims']");
	final By searchButton         = By.xpath("//div[@id='AccountFile_Claims-AccountFile_ClaimScreen-SearchAndResetInputSet-SearchLinksInputSet-Search']");
	final By policyStatus         = By.xpath("//tr[@id='AccountFile_Claims-AccountFile_ClaimScreen-AccountClaimsLV-5']/td[6]/ancestor::tr/following-sibling::tr/td[6]");

}
