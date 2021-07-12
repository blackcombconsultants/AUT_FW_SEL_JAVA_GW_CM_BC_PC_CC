package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_Workplan_PO {

	final By WorkPlan_Header=By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By WorkPlan=By.xpath("//input[contains(@name,'WorkplanLV-_Checkbox')]");
	final By WorkPlan_Complete=By.xpath("//div[contains(@id,'ClaimWorkplan_CompleteButton')]");
}
