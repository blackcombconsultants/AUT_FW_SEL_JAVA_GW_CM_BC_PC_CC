package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_VehiclesPO {

    final By Create_Vehcile = By.xpath("//div[contains(@id,'PAVehiclesPanelSet-VehiclesListDetailPanel_tb-Add')]");
    final By Screen_Header = By.xpath("//div[@class='gw-TitleBar--title'][contains(text(),'Vehicles')]");
    final By Vehicle_type_dropdown = By.xpath("//select[contains(@name,'PersonalAuto_VehicleDV-Type_DV')]");
    final By Vin_NO = By.xpath("//input[contains(@name,'PersonalAuto_VehicleDV-Vin_DV')]");
    final By License_State = By.xpath("//select[contains(@name, 'VehicleDV-LicenseState_DV')]");
    final By Cost_New = By.xpath("//input[contains(@name,'VehicleDV-CostNew_DV')]");
    final By Vehicle_Identified = By.xpath("div[@class='gw-value-readonly-wrapper' and text()='1FM5K7D81FGA12355']/ancestor::td[contains(@id,'Vin_Cell')]");
    
    
    void ve_CreateVehicles() throws Throwable;

    void ve_Edit_Vehicles() throws Throwable;

    void ve_AssaignDriver() throws Throwable;

    void ve_AdditionalInterest_Add_NewCompany() throws Throwable;

    void ve_AdditionalInterest_Add_NewPerson() throws Throwable;

    void ve_AdditionalInterest_Add_FromAddressBook() throws Throwable;

    void ve_AdditionalInterest_Add_OtherContacts() throws Throwable;
    
    
    

    void ve_RemoveVehicles() throws Throwable;

    void ve_Garage_NewLocation() throws Throwable;

    void ve_Garage_EditLocation() throws Throwable;


}
