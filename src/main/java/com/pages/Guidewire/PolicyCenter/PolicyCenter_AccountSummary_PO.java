package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;

public interface PolicyCenter_AccountSummary_PO {

	final By AS_Details = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Details']");

	final By AS_D_AccountNo = By.xpath(
			"//div[contains(@id,'AccountDetailsDetailViewTile_DV-AccountNumber')]//div[@class='gw-value-readonly-wrapper']");
	final By AS_D_AccountHolder = By.xpath(
			"//div[contains(@id,'AccountHolder_button')]");
	final By AS_D_HomeAddress = By.xpath(
			"//div[contains(@id,'AccountDetailsDetailViewTile_DV-Address')]//div[@class='gw-value-readonly-wrapper']");
	final By AS_D_Description = By.xpath(
			"//div[contains(@id,'AccountDetailsDetailViewTile_DV-AddressDescription')]//div[@class='gw-value-readonly-wrapper']");
	final By AS_D_Status = By.xpath(
			"//div[contains(@id,'AccountDetailsDetailViewTile_DV-AccountStatus')]//div[@class='gw-value-readonly-wrapper']");

	final By AS_CurrentActivities = By
			.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Current Activities']");
	final By AS_PolicyTerms = By
			.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Policy Terms']");
	final By AS_OpenPolicyTransactions = By
			.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Open Policy Transactions']");
	final By AS_Claims = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Claims']");
	final By AS_Overview = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Overview']");
	final By AS_Billing = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Billing']");
	final By AS_Contacts = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Contacts']");
	final By AS_Producer = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Producer']");
	final By AS_Locations = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Locations']");
	final By AS_RelatedAccounts = By
			.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Related Accounts']");
	final By AS_Notes = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Notes']");

}
