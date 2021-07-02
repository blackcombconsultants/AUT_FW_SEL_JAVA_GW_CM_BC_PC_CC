package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class ClaimCenter_Workplan extends SeleniumWebDriver_Commands implements ClaimCenter_Workplan_PO{

	public ClaimCenter_Workplan(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}
	
	
	public static void workPlan() throws Throwable
	{
		GuidewireAutomate_Validation("Screen Header", WorkPlan_Header, "equals", "Workplan");
        GuidewireAutomate("WorkPlan", WorkPlan, "click", "");
        GuidewireAutomate("Complete", WorkPlan_Complete, "click", "");
    }

}
