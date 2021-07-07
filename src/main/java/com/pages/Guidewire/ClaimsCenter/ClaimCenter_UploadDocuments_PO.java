package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_UploadDocuments_PO {

	final By UploadDocuments=By.xpath("//div[@id='wsTabBar']//div[@class='gw-label']");
	final By UploadDocuments_AddFiles1=By.xpath("//div[contains(@id,'browseButton')]");

	final By UploadDocuments_AddFiles=By.xpath("//input[contains(@id,'FileInput--file')]");
	
	final By UploadDocuments_Status=By.xpath("//select[contains(@name,'Status')]");
	final By UploadDocuments_DocumentType=By.xpath("//select[contains(@name,'DocumentDetailsEditLV-0-Type')]");
    final By  UploadDocuments_Update=By.xpath("//div[contains(@id,'CustomUpdate')]/div[@role='button']");
    
    final By Documents_Header=By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Documents']");
    final By Documents_Name=By.xpath("//div[contains(@id,'NameLink')]");
    final By Documents_Type=By.xpath("//td[contains(@id,'Type_Cell')]//div[@class='gw-label']");
    final By Documents_Status=By.xpath("//td[contains(@id,'Status_Cell')]//div[@class='gw-label']");

}
