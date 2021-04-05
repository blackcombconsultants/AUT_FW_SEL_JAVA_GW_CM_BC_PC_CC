package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ExposureClosure_PO {
	final By summary=By.xpath("//*[@id='Claim-MenuLinks-Claim_ClaimSummaryGroup']/div[1]/div[2]");
	final By service=By.xpath("//*[@id='ClaimSummary-ClaimSummaryScreen-ServiceRequestLV']/div/div[1]/div[1]/div[1]");
	final By exposuresLineOne=By.id("ClaimSummary-ClaimSummaryScreen-ClaimSummaryExposuresLV-0-Type");
	final By exposureCount=By.xpath("//table//tr[starts-with(@id, 'ClaimSummary-ClaimSummaryScreen-ClaimSummaryExposuresLV')]//div[@data-gw-tooltip='Open']");
	final By exposureOpenCount=By.xpath("//table//tr[starts-with(@id, 'ClaimSummary-ClaimSummaryScreen-ClaimSummaryExposuresLV')]//div[@data-gw-tooltip='Open']");
	final By openExposureLink=By.xpath("//div[@class='gw-link gw-label']");
	final By clickCloseExposure=By.xpath("//*[@id='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_CloseButton']/div/div[2]");
	final By outcome=By.name("CloseExposurePopup-CloseExposureScreen-CloseExposureInfoDV-Outcome");
	final By sampleTest1=By.xpath("//*[@id='CloseExposurePopup-CloseExposureScreen-ttlBar']/div[1]/div");
	final By closeExposure=By.xpath("//div[@id='CloseExposurePopup-CloseExposureScreen-Update']");
	

}
