package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_PolicyReview_PO {

	final By pr_Screen_title = By
			.xpath("//div[contains(@id,'PolicyReviewScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By pr_Primary_Named_Insured = By.xpath(
			"//div[contains(@id,'ReviewSummaryDV-PrimaryNamedInsured')]//div[@class='gw-value-readonly-wrapper']");
	final By pr_Country = By
			.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	final By pr_AddressType = By
			.xpath("//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType')]/div[2]//div[@class='gw-label']");
	final By pr_effective_date = By
			.xpath("//div[contains(@id,'ReviewSummaryDV-EffectiveDate')]//div[@class='gw-value-readonly-wrapper']");
	final By pr_Expiration_Date = By
			.xpath("//div[contains(@id,'ReviewSummaryDV-ExpirationDate')]//div[@class='gw-value-readonly-wrapper']");

	final By pr_Auto_Liability_Package = By.xpath(
			"//tr[contains(@id,'PolicyLineSummaryPanelSet-LineLV-CoverageSummaryLV-0-0-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By pr_Medical_Limit = By.xpath(
			"//tr[contains(@id,'PolicyLineSummaryPanelSet-LineLV-CoverageSummaryLV-1-0-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By pr_Uninsured_Motorist_Property_Damage_Limit = By.xpath(
			"//tr[contains(@id,'PolicyLineSummaryPanelSet-LineLV-CoverageSummaryLV-3-0-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");

	void pr_policyDetails() throws Throwable;

	void pr_Coverages() throws Throwable;

}
