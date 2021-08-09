package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_Reserve_PO {

	final By Reserve_Exposure = By.xpath("//select[contains(@name,'Exposure')]");
	final By Reserve_Coverage = By
			.xpath("//td[contains(@id,'Coverage_Cell')]//div[contains(@id,'Coverage')]//div[@class='gw-label']");
	final By Reserve_Add = By.xpath("//div[contains(@id,'Add')]/div[@role='button']");
	final By Reserve_CostType = By.xpath("//select[contains(@name,'CostType')]");
	final By Reserve_CostCategory = By.xpath("//select[contains(@name,'CostCategory')]");

	final By Reserve_Remove = By.xpath("//div[contains(@id,'NewReserveSetScreen-Remove')]/div[@role='button']");

	final By Reserve_Save = By.xpath("//div[contains(@id,'NewReserveSet-NewReserveSetScreen-Update')]/div[@role='button']");

	//div[contains(@id,'NewReserveSetScreen-Remove')]/div[@role='button']
}
