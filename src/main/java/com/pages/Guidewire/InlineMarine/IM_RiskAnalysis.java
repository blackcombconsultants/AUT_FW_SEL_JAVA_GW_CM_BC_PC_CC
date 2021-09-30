package com.pages.Guidewire.InlineMarine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class IM_RiskAnalysis extends SeleniumWebDriver_Commands {

	
	public IM_RiskAnalysis(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}
	private static By RA_AddUWIssue_Button    = By.xpath("//div[contains(@id,'RiskAnalysisCV_tb-AddManualIssue')]//div[@class='gw-label' and text()='Add UW Issue']");
	private static By RA_AddContingency_Button = By.xpath("//div[contains(@id,'RiskAnalysisCV_tb-AddNewContingencyButton')]//div[@class='gw-label' and text()='Add Contingency']");
	private static By RA_RequestApproval_Button = By.xpath("//div[@class='gw-label' and text()='Request Approval']");

	public static void button_Verify() throws Throwable {
		// Validating Risk Analysis screen
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.RiskAnalysis_Header, "equals", "Risk Analysis");

		GuidewireAutomate_Validation("Add UWIssue", RA_AddUWIssue_Button, "isDisplayed", "true");
		GuidewireAutomate_Validation("Add Contingency", RA_AddContingency_Button, "isDisplayed", "true");
		GuidewireAutomate_Validation("Request Approval", RA_RequestApproval_Button, "isDisplayed", "true");
}

}
