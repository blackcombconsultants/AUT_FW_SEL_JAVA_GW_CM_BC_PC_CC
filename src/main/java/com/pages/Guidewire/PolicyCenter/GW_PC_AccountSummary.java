package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class GW_PC_AccountSummary extends SeleniumWebDriver_Commands implements GW_PC_AccountSummary_PO {
	
	public GW_PC_AccountSummary(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void Detail_Verify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Details_Edit() {
		// TODO Auto-generated method stub
		
	}

	public String getHeader_NewSubmission() {
		// TODO Auto-generated method stub
		return getText_Element(NewSubmission_Screen_Header);
	}
	
	@Override
	public void AccountSummary_AccountHolderSummary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AccountSummary_AccountHolderSummary_Edit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AccountSummary_Actions_NewSubmission() {
		// TODO Auto-generated method stub
		GuidewireAutomate("Actions Menu",Account_Actions_Menu, "click", "");
		GuidewireAutomate("Ations New Submission",Account_Actions_NewSubmission,"click", "");
		// ------> Verifying the page -
		Assert.assertEquals(getHeader_NewSubmission(), "New Submission");
	}

	
	
}
	


