package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;

public interface GW_PC_PolicySummary_PO {

	final By Screen_Header = By.xpath("//div[@id='gw-center-title-toolbar']//div[@class='gw-TitleBar--title']");

	void Detail_Verify() throws Throwable;

	void new_Transaction(String type) throws Throwable;

	void Account_Verify() throws Throwable;

}
