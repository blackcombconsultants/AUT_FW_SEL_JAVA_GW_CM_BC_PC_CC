package com.pages.Guidewire.PersonalAuto;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Vehicles extends SeleniumWebDriver_Commands implements PersonalAuto_VehiclesPO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Vehicles(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void ve_CreateVehicles() throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("vehicle", strTestCaseName);

		PersonalAuto_NewSubmission_Reusable nsr = new PersonalAuto_NewSubmission_Reusable(driver, oExtentTest);

		GuidewireAutomate_Validation("Screen Header", PersonalAuto_NewSubmission_ReusablePO.Screen_Header, "equals",
				"Vehicles");

		GuidewireAutomate("Create_Vehicle", VE_Tab_VehicleDetails, "click", "NA");

		GuidewireAutomate_Validation("Basic Vehicle Information", VE_VD_BasicVehicleInformation, "equals",
				"Basic Vehicle Information");

		GuidewireAutomate("Vehicle Type", VE_VD_BVI_VehicleType, "selectByVisibleText", "Passenger/Light Truck");

		String StrVIN = lhm_TestCase_Table_Data.get("VE_VD_BVI_VIN");

		if (StrVIN.equalsIgnoreCase("Random")) {
			StrVIN = "2B4FK45J3KR" + getRandomNumeric(6);
			StrVIN = "3VW1K7AJ9CM349218";
			// StrVIN = 1+"GC"+"HC231"+"81F"+getRandomNumeric
		} else if (StrVIN.equalsIgnoreCase("vingenerator")) {
			nsr.getRandomVIN("vingenerator");
		} else if (StrVIN.equalsIgnoreCase("randomvin")) {
			nsr.getRandomVIN("randomvin");
		}

		GuidewireAutomate("Vin", VE_VD_BVI_VIN, "sendkeys", StrVIN);
		GuidewireAutomate("Body Type", VE_VD_BVI_BodyType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_BodyType"));
		GuidewireAutomate("License_State", VE_VD_BVI_LicenseState, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_LicenseState"));

		GuidewireAutomate("Cost New", VE_VD_BVI_CostNew, "sendkeys", lhm_TestCase_Table_Data.get("VE_VD_BVI_CostNew"));
		GuidewireAutomate("Stated Value", VE_VD_BVI_StatedValue, "sendkeys",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_StatedValue"));

		GuidewireAutomate("Annual Mileage", VE_VD_BVI_AnnualMileage, "sendkeys",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_AnnualMileage"));

		GuidewireAutomate("Primary Use", VE_VD_BVI_PrimaryUse, "sendkeys",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_PrimaryUse"));

		GuidewireAutomate("Anti Theft Discount", VE_VD_BVI_AntiTheftDiscount, "sendkeys",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_AntiTheftDiscount"));

	}

	@Override
	public void ve_AssaignDriver() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("vehicle", strTestCaseName);

		GuidewireAutomate_Validation("Assign Drivers to Vehicles", VE_AssignDriverstoVehicles, "equals",
				"Assign Drivers to Vehicles");
		GuidewireAutomate_Validation("What percentage does each driver use this vehicle",
				VE_ADV_Percentageeachdriverusethisvehicle, "equals",
				"What percentage does each driver use this vehicle?");

		GuidewireAutomate("Add", VE_ADV_Add_Button, "click", "NA");
		GuidewireAutomate("Driver Select", VE_ADV_Add_Select, "click", "NA");
		GuidewireAutomate_Validation("Driver", VE_ADV_Driver, "click", "NA");
		GuidewireAutomate("Percentage", VE_ADV_Percentage, "clear", "NA");
		GuidewireAutomate("Percentage", VE_ADV_Percentage, "sendkeys",
				lhm_TestCase_Table_Data.get("VE_ADV_Percentage"));

	}

	@Override
	public void ve_AdditionalInterest_Add_NewCompany() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("vehicle", strTestCaseName);

		GuidewireAutomate("Additional Interest", VE_Tab_AdditionalInterest, "click", "NA");
		GuidewireAutomate_Validation("Personal Vehicle Additional Interests", VE_AI_PersonalVehicleAdditionalInterests,
				"equals", "Personal Vehicle Additional Interests");
		GuidewireAutomate("Add", VE_AI_PVAI_Add_Button, "click", "NA");
		GuidewireAutomate("NewCompany", VE_AI_PVAI_Add_NewCompany, "click", "NA");

	}

	@Override
	public void ve_AdditionalInterest_Add_NewPerson() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("vehicle", strTestCaseName);

		GuidewireAutomate("Additional Interest", VE_Tab_AdditionalInterest, "click", "NA");
		GuidewireAutomate_Validation("Personal Vehicle Additional Interests", VE_AI_PersonalVehicleAdditionalInterests,
				"equals", "Personal Vehicle Additional Interests");
		GuidewireAutomate("Add", VE_AI_PVAI_Add_Button, "click", "NA");
		GuidewireAutomate("NewPerson", VE_AI_PVAI_Add_NewPerson, "click", "NA");

	}

	@Override
	public void ve_AdditionalInterest_Add_FromAddressBook() throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("vehicle", strTestCaseName);

		GuidewireAutomate("Additional Interest", VE_Tab_AdditionalInterest, "click", "NA");
		GuidewireAutomate_Validation("Personal Vehicle Additional Interests", VE_AI_PersonalVehicleAdditionalInterests,
				"equals", "Personal Vehicle Additional Interests");
		GuidewireAutomate("Add", VE_AI_PVAI_Add_Button, "click", "NA");
		GuidewireAutomate("FromAddressBook", VE_AI_PVAI_Add_FromAddressBook, "click", "NA");

	}

	@Override
	public void ve_AdditionalInterest_Add_OtherContacts() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("vehicle", strTestCaseName);

		GuidewireAutomate("Additional Interest", VE_Tab_AdditionalInterest, "click", "NA");
		GuidewireAutomate_Validation("Personal Vehicle Additional Interests", VE_AI_PersonalVehicleAdditionalInterests,
				"equals", "Personal Vehicle Additional Interests");
		GuidewireAutomate("Add", VE_AI_PVAI_Add_Button, "click", "NA");
		GuidewireAutomate("OtherContacts", VE_AI_PVAI_Add_OtherContacts, "click", "NA");
		GuidewireAutomate("OtherContacts Name", DR_DriversDetails_Add_OtherContacts_Name, "click", "NA");

		GuidewireAutomate("Additional Interest Select", VE_AI_PVAI_Select, "click", "NA");
		GuidewireAutomate_Validation("Additional Interest Name", VE_AI_PVAI_Name, "equals", "NA");
		GuidewireAutomate("Additional Interest IntrestType", VE_AI_PVAI_IntrestType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("VE_AI_PVAI_IntrestType"));
		GuidewireAutomate("Additional Interest Certificate Required", VE_AI_PVAI_CertificateReq, "click",
				lhm_TestCase_Table_Data.get("CertificateReq"));
		GuidewireAutomate("Additional Interest ContractNo", VE_AI_PVAI_ContractNo, "sendkeys",
				lhm_TestCase_Table_Data.get("VE_AI_PVAI_ContractNo"));

	}

	@Override
	public void ve_RemoveVehicles() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void ve_Garage_NewLocation() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void ve_Garage_EditLocation() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void ve_Edit_Vehicles() throws Throwable {
		// TODO Auto-generated method stub

	}

	public void searchtable(By Locator, String CellValue) throws Throwable {
		// TODO Auto-generated method stub

	}

}
