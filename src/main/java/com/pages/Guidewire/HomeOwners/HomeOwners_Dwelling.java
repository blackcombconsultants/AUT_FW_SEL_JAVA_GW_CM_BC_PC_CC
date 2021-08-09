package com.pages.Guidewire.HomeOwners;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class HomeOwners_Dwelling  extends SeleniumWebDriver_Commands implements  HomeOwners_Dwelling_PO{

	public HomeOwners_Dwelling(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		
	}
	public static void dwelling() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("dwelling",strTestCaseName);

			//GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Dwelling_Header, "equals",
			//		"Qualification");
			 
			lhm_TestCase_Table_Data.clear();

			oExtentTest.log(Status.PASS, "Search PolicyNumber = [" + strPolicyNumber + "] is succesful");
		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Search PolicyNumber = [" + strPolicyNumber + "] is Unsuccesful");
			e.printStackTrace();
			throw e;
		}

	}

}
