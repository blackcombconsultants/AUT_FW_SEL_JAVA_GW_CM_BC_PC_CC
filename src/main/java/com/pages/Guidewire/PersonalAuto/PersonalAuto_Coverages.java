package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Coverages extends SeleniumWebDriver_Commands implements PersonalAuto_Coverages_PO {

	public PersonalAuto_Coverages(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void pac_CoveragesAppliedtoallvehicles() throws Throwable {
		  
		//------->Verify the Page Name
	 GuidewireAutomate_Validation("PA_Coverages_Screen_titlebar", PA_Coverages_Screen_titlebar, "equals", "PA Coverages");
	    
	 //--------> 
		
		
	}

	

	

}
