package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface CCC_ClaimActions_CloseClaim_PO {

	final By CloseClaim_Header=By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By CloseClaim_Note=By.xpath("//textarea[contains(@name,'Note')]");
	final By CloseClaim_Outcome=By.xpath("//select[contains(@name,'CloseClaimInfoDV-Outcome')]");
	final By CloseClaim_button=By.xpath("//div[contains(@id,'CloseClaimScreen-Update')]");
	final By CloseClaim_Cancel=By.xpath("//div[contains(@id,'CloseClaimScreen-Cancel')]");

	final By CloseClaim_ValidationResults=By.xpath("//div[contains(@id,'wsTabBar')]//div[@class='gw-label']");
	final By CloseClaim_OpenActvitiesErrorMsg=By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'This claim has open activities')]");
	final By CloseClaim_OpenExpsoureErrorMsg=By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'There are still open exposures for this claim')]");
	final By CloseClaim_FaultRatingMsg=By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'The Fault Rating must be determined')]");

	final By Expsoure_Header=By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By CloseClaim_Clear=By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]");
    final By FinancialChecks_Header=By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By Summary_Header=By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
}
