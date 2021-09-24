package com.pages.Guidewire.HomeOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class HO_RiskAnalysis extends SeleniumWebDriver_Commands {

	public HO_RiskAnalysis(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	

private static By RiskAnalysisHeader = By.xpath("//div[contains(@id,'RiskAnalysisScreen')]//div[@role='heading']");

private static By AddUWIssueButton = By.xpath("//div[contains(@id,'AddManualIssue')]//div[@role='button']");


private static By AddNewContingencyButton = By.xpath("//div[contains(@id,'AddNewContingencyButton')]//div[@role='button']");


private static By RequestApprovalButton = By.xpath("//div[contains(@id,'RequestApproval')]//div[@role='button']");



private static By ContingenciesTab = By.xpath("//div[contains(@id,'ContingenciesCardTab')]//div[@role='tab']");

private static By PriorPoliciesTab = By.xpath("//div[contains(@id,'PriorPolicyCardTab')]//div[@role='tab']");

private static By ClaimsTab = By.xpath("//div[contains(@id,'ClaimsCardTab')]//div[@role='tab']");

private static By PriorLossesTab = By.xpath("//div[contains(@id,'LossHistoryCardTab')]//div[@role='tab']");


public static void RiskAnalysis() throws Throwable {
	
	try {
		
		GuidewireAutomate_Validation("Risk Analysis Header", RiskAnalysisHeader, "equals", "Risk Analysis");		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}

public static void AddUWIssue() throws Throwable {
	
	try {
		
		GuidewireAutomate("Add UW Issue", AddUWIssueButton, "clickAndwait", "clickAndwait");		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}

public static void AddNewContingency() throws Throwable {
	
	try {
		
		GuidewireAutomate("Add New Contingency", AddNewContingencyButton, "clickAndwait", "clickAndwait");		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}
public static void RequestApproval() throws Throwable {
	
	try {
		
		GuidewireAutomate("Request Approval", RequestApprovalButton, "clickAndwait", "clickAndwait");		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}
	
public static void ContingenciesTab() throws Throwable {
	
	try {
		
		GuidewireAutomate("Contingencies Tab", ContingenciesTab, "clickAndwait", "clickAndwait");		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}

public static void PriorPoliciesTab() throws Throwable {
	
	try {
		
		GuidewireAutomate("Prior Policies Tab", PriorPoliciesTab, "clickAndwait", "clickAndwait");		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}
public static void ClaimsTab() throws Throwable {
	
	try {
		
		GuidewireAutomate("Claims Tab", ClaimsTab, "clickAndwait", "clickAndwait");		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}
public static void PriorLossesTab() throws Throwable {
	
	try {
		
		GuidewireAutomate("Prior Losses Tab", PriorLossesTab, "clickAndwait", "clickAndwait");		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}



}
