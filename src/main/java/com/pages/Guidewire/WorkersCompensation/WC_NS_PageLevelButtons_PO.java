package com.pages.Guidewire.WorkersCompensation;

import org.openqa.selenium.By;

public interface WC_NS_PageLevelButtons_PO {
	final By ns_Next_Btn=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]/div[@id='SubmissionWizard-Next']");
	final By ns_Quote_Btn=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[@class='gw-label']/div[contains(text(),'Q')]");
	final By ns_Save_Draft=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[@class='gw-label']/div[contains(text(),'S')]");
	final By ns_CloseO_mainMenu=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[@class='gw-label']/div[contains(text(),'C')]");
	final By ns_CloseO_subM_Withdraw=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[@role='menuitem']/div[@class='gw-label']/div[contains(text(),'W')]");
	final By ns_CloseO_subM_Decline=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[@role='menuitem']/div[@class='gw-label']/div[contains(text(),'e')]");
	final By ns_CloseO_subM_NTaken=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[@role='menuitem']/div[@class='gw-label']/div[contains(text(),'N')]");
	final By ns_Back_Btn=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[@id='SubmissionWizard-Prev']");
	final By ns_Edit_Policy_Btn=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[contains(text(),'EP')]");
	final By ns_BindO_mainMenu=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[@class='gw-label']/div[contains(text(),'B')]");
	final By ns_BindO_subM_BOnly=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[@role='menuitem']/div[contains(text(),'Bind Only')]");
	final By ns_BindO_subM_IssuePolicy=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[@role='menuitem']/div[contains(text(),'Issue Policy')]");
	final By ns_ReleaseLck=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[@class='gw-label']/div[contains(text(),'k')]");
	final By create_Account_UpdateBtn=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[@class='gw-action--inner gw-hasDivider']/div[contains(text(),'pdate')]");
	final By create_Account_CancelBtn=By.xpath("//*[@id='gw-center-title-toolbar']/child::div[2]//div[@class='gw-action--inner gw-hasDivider']/div[contains(text(),'Cance')]");
}
