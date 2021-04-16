package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Quote extends SeleniumWebDriver_Commands implements PersonalAuto_Quote_PO{

	public PersonalAuto_Quote(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void pa_QuoteDetails() throws Throwable {
		//---->verifying the PA Quote Screen titlebar
		GuidewireAutomate_Validation("PA Quote Screen titlebar", PA_Quote_Screen_titlebar, "equals", "Quote"); 
		//---->verifying the PA Quote Submission Number
		GuidewireAutomate_Validation("Submission Number", PA_Quote_Submission_Number, "equals", "");
		//---->verifying the PA Quote  Policy Period
		GuidewireAutomate_Validation("Policy Period", PA_Quote_Policy_Period, "equals", "");
		//---->verifying the PA Quote Primary Named Insured
		GuidewireAutomate_Validation("Primary Named Insured", PA_Quote_Primary_Named_Insured, "equals", "");
		//----->verifying the PA Quote Address
		GuidewireAutomate_Validation("Address", PA_Quote_Address, "equals", "");
		//------>verifying the PA Quote County
		GuidewireAutomate_Validation("County", PA_Quote_County, "equals", "");
		//------>verifying the PA Quote Address Type
		GuidewireAutomate_Validation("Address Type", PA_Quote_Address_Type, "equals", "");
		//------->verifying the PA Quote Address Description
		GuidewireAutomate_Validation("Address Description", PA_Quote_Address_Description, "equals", "");
		//------->verifying the PA Underwriting Company
		GuidewireAutomate_Validation("Underwriting Company", PA_Quote_Underwriting_Company, "equals", "");
		//-------->verifying the PA Quote Total Premium
		GuidewireAutomate_Validation("Total Premium", PA_Quote_Total_Premium, "equals", "");
		//------->verifying the PA Quote Taxes & Surcharges
		GuidewireAutomate_Validation("Taxes & Surcharges", PA_Quote_Taxes_Surcharges, "equals", "");
		//------>verifying the PA Quote Total Cost
		GuidewireAutomate_Validation("Total Cost", PA_Quote_Total_Cost, "equals", "");
		
		
		 
		
	}

	@Override
	public void pa_PolicyPremium() throws Throwable {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pa_VehicleCoverage() throws Throwable {
		// TODO Auto-generated method stub
		
	}




}
