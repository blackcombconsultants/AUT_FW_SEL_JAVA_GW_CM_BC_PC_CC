package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_PolicyReview extends SeleniumWebDriver_Commands implements PersonalAuto_PolicyReview_PO {

	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_PolicyReview(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void pr_policyDetails() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("paPayment", strTestCaseName);

		GuidewireAutomate_Validation("pr Screen title", pr_Screen_title, "equals", "Policy Review");
		GuidewireAutomate_Validation("pr Primary Named Insured", pr_Primary_Named_Insured, "equals",
				lhm_TestCase_Table_Data.get("PrimaryNI_Name"));
		GuidewireAutomate_Validation("pr Country", pr_Country, "equals",
				lhm_TestCase_Table_Data.get("PrimaryNI_County"));
		GuidewireAutomate_Validation("pr AddressType", pr_AddressType, "equals",
				lhm_TestCase_Table_Data.get("PrimaryNI_AddressType"));
		GuidewireAutomate_Validation("pr_effective_date", pr_effective_date, "equals",
				lhm_TestCase_Table_Data.get("PolicyDetails_EffectiveDate"));
		GuidewireAutomate_Validation("pr_effective_date", pr_effective_date, "equals",
				lhm_TestCase_Table_Data.get("PolicyDetails_ExpirationDate"));
	}

	@Override
	public void pr_Coverages() throws Throwable {
		GuidewireAutomate_Validation("pr_Auto_Liability_Package", pr_Auto_Liability_Package, "equals",
				lhm_TestCase_Table_Data.get("pr_Auto_Liability_Package"));
		GuidewireAutomate_Validation("pr_Medical_Limit", pr_Medical_Limit, "equals",
				lhm_TestCase_Table_Data.get("pr_Medical_Limit"));
		GuidewireAutomate_Validation("pr_Uninsured_Motorist_Property_Damage_Limit",
				pr_Uninsured_Motorist_Property_Damage_Limit, "equals",
				lhm_TestCase_Table_Data.get("pr_Uninsured_Motorist _Property_Damage _Limit"));

	}

}
