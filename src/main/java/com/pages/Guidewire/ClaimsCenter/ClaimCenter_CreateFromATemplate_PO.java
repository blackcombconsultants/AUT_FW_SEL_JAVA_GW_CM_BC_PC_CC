package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_CreateFromATemplate_PO {
	final By NewDocument_Header = By.xpath("//div[@id='wsTabBar']//div[@class='gw-label' and text()='New Document']");

	final By NewDocument_DocumentTemplate_Search = By.xpath("//div[contains(@id,'SelectTemplatePicker')]");

	final By NewDocument_Type           = By.xpath("//select[contains(@name, 'DocumentTemplateSearchDV-TemplateType')]");
	final By NewDocument_LineOfBusiness = By.xpath("//select[contains(@name, 'DocumentTemplateSearchDV-LossType')]");
	final By NewDocument_Jurisdiction   = By.xpath("//select[contains(@name, 'DocumentTemplateSearchDV-JurisdictionState')]");

	final By NewDocument_DocumentTemplates_Search = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");

	final By NewDocument_Select_AcrobatSample = By.xpath("//div[@class='gw-value-readonly-wrapper' and text()='Acrobat Sample']/ancestor::td[contains(@id,'Template_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");
	final By NewDocument_Select_ExcelSample   = By.xpath("//div[@class='gw-value-readonly-wrapper' and text()='Excel Sample']/ancestor::td[contains(@id,'Template_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");
	final By NewDocument_Select_GosuCSVSample = By.xpath("//div[@class='gw-value-readonly-wrapper' and text()='Gosu CSV Sample']/ancestor::td[contains(@id,'Template_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");
	final By NewDocument_Select_KYSample      = By
			.xpath("//div[@class='gw-value-readonly-wrapper' and text()='KY No Fault App 1-03 - FCCI']/ancestor::td[contains(@id,'Template_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");

	final By NewDocument_CreateDocument = By.xpath("//div[contains(@id,'DocumentCreationInputSet-CreateDocument')]/div[@role='button']");

	final By NewDocument_Update = By.xpath("//div[contains(@id,'NewDocumentFromTemplate_CustomUpdate')]");

}
