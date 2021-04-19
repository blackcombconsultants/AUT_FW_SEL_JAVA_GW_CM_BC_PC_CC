package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Vehicles extends SeleniumWebDriver_Commands implements PersonalAuto_VehiclesPO {

	public PersonalAuto_Vehicles(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void ve_CreateVehicles() throws Throwable {
        GuidewireAutomate_Validation("Vehicles Header", Screen_Header, "equals", "Vehicles");
        GuidewireAutomate("Create_Vehicle", Create_Vehcile, "click", "NA");
        GuidewireAutomate("Vehicle_type_dropdown", Vehicle_type_dropdown, "selectByVisibleText", "Passenger/Light Truck");
        GuidewireAutomate("Vin No", Vin_NO, "sendkeys", "3VW1K7AJ9CM349218");
        GuidewireAutomate("License_State", License_State, "selectByVisibleText", "Alaska");
        GuidewireAutomate("Cost New", Cost_New, "sendkeys", "10000");
		
	}

	@Override
	public void ve_AssaignDriver() throws Throwable {
        GuidewireAutomate("Vehicle Identified", Vehicle_Identified, "click", "");		
	}

	@Override
	public void ve_AdditionalInterest_Add_NewCompany() throws Throwable {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ve_AdditionalInterest_Add_NewPerson() throws Throwable {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ve_AdditionalInterest_Add_FromAddressBook() throws Throwable {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ve_AdditionalInterest_Add_OtherContacts() throws Throwable {
		// TODO Auto-generated method stub
		
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



}
