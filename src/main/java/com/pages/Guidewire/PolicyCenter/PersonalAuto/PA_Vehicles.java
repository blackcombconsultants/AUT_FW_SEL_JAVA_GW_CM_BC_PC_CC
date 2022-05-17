package com.pages.Guidewire.PolicyCenter.PersonalAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class PA_Vehicles extends SeleniumWebDriver_Commands {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();


	private static By VehicleDetails = By.xpath("//div[contains(@class,'gw-panelRefWidget--titleArea')]//div[@class='gw-TitleBar--title']");

	private static By CreateVehicle_Button = By.xpath("//div[contains(@id,'VehiclesListDetailPanel_tb-Add')]//div[@class='gw-label']");
	private static By RemoveVehicle_Button = By.xpath("//div[contains(@id,'VehiclesListDetailPanel_tb-Remove')]//div[@class='gw-label']");

	private static By TableRowCellHeader        = By.xpath("//tr[contains(@class,'gw-row gw-header-row')]/td[contains(@class,'gw-HeaderCellWidget')]");
	private static By TableRowCellSmartHeader   = By.xpath("//tr[contains(@class,'gw-row gw-isSmartHeader')]/td[contains(@class,'gw-CellWidget')]");
	private static By TableRowCellValue         = By.xpath("//tr[contains(@class,'gw-RowWidget')]/td[contains(@class,'gw-CellWidget')]");
	private static By TableStandardRowCellValue = By.xpath("//tr[contains(@class,'gw-row gw-standard-row')]/td[contains(@class,'gw-CellWidget')]");
	private static By VehicleDetails_Select     = By.xpath("//td[contains(@class,'gw-impl-cell--CB')]/div[@class='gw-cell-inner']/div[contains(@id,'Checkbox')]/input[contains(@name,'Checkbox')]");

	private static By VehicleDetails_Vin = By.xpath("div[@class='gw-value-readonly-wrapper' and text()='1FM5K7D81FGA12355']/ancestor::td[contains(@id,'Vin_Cell')]");

	/*
	 * Vehicle Details
	 */

	private static By VE_Tab_VehicleDetails = By.xpath("//div[contains(@id,'VehiclesDetailsCV-VehicleDetailCardTab')]");

	private static By VE_VD_BasicVehicleInformation = By.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Basic Vehicle Information']");

	private static By VE_VD_BVI_VehicleType  = By.xpath("//select[contains(@name,'VehiclesDetailsCV-PersonalAuto_VehicleDV-Type_DV')]");
	private static By VE_VD_BVI_VIN          = By.xpath("//input[contains(@name,'VehiclesDetailsCV-PersonalAuto_VehicleDV-Vin_DV')]");
	private static By VE_VD_BVI_BodyType     = By.xpath("//select[contains(@name, 'VehiclesDetailsCV-PersonalAuto_VehicleDV-BodyType_DV')]");
	private static By VE_VD_BVI_LicenseState = By.xpath("//select[contains(@name, 'VehiclesDetailsCV-PersonalAuto_VehicleDV-LicenseState_DV')]");

	private static By VE_VD_BVI_CostNew     = By.xpath("//input[contains(@name,'VehiclesDetailsCV-PersonalAuto_VehicleDV-CostNew_DV')]");
	private static By VE_VD_BVI_StatedValue = By.xpath("//input[contains(@name,'PersonalAuto_VehicleDV-StatedValue_DV')]");

	private static By VE_VD_BVI_AnnualMileage     = By.xpath("//input[contains(@name,'PersonalAuto_VehicleDV-annualmiles_DV')]");
	private static By VE_VD_BVI_PrimaryUse        = By.xpath("//select[contains(@name,'PersonalAuto_VehicleDV-primaryuse_DV')]");
	private static By VE_VD_BVI_AntiTheftDiscount = By.xpath("//select[contains(@name,'PAVehicleModifiersInputSet-2-TypeKeyModifier')]");

	private static By VE_VD_BVI_VehicleRateModifiers = By.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Vehicle Rate Modifiers']");

	private static By VE_VD_BVI_VRM_AntiLockBrakesDiscount_No = By.xpath("//input[contains(@id,'PAVehicleModifiersInputSet-0-BooleanModifier_1')]");
	private static By VE_VD_BVI_VRM_PassiveRestraintSystem    = By.xpath("//select[contains(@name,'PAVehicleModifiersInputSet-1-TypeKeyModifier')]");
	private static By VE_VD_BVI_VRM_AntiTheftDiscount         = By.xpath("//select[contains(@name,'PAVehicleModifiersInputSet-2-TypeKeyModifier')]");

	private static By VE_AssignDriverstoVehicles = By.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Assign Drivers to Vehicles']");

	private static By VE_ADV_Percentageeachdriverusethisvehicle = By.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='What percentage does each driver use this vehicle?']");

	private static By VE_ADV_Add_Button               = By.xpath("//div[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-Add')]/div[@role='button']");
	private static By VE_AssignDrivers_Remove_Button  = By.xpath("//div[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-Remove')]/div[@role='button']");
	private static By VE_AssignDrivers_Add_DriverName = By.xpath(
			"//div[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']/div[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver')]//div[@class='gw-label']");

	private static By VE_ADV_Add_Select = By.xpath(
			"//tr[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV') and contains(@class,'gw-standard-row')]/td[contains(@class,'gw-impl-cell--CB')]//div[contains(@id,'_Checkbox') and contains(@class,'gw-IteratorEntryCheckBoxWidget')]/input[@type='checkbox']");

	private static By VE_ADV_Driver = By.xpath(
			"//tr[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Driver_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Driver') and contains(@class,'gw-actionValue')]//div[contains(@id,'Driver_button')]");

	private static By VE_ADV_Percentage = By.xpath(
			"//tr[contains(@id,'PersonalAuto_AssignDriversInputSet-DriverPctLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Percentage_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Percentage') and contains(@class,'gw-editable')]//input[contains(@name,'Percentage')]");

	/*
	 * Additional Interest
	 */

	private static By VE_Tab_AdditionalInterest = By.xpath("//div[contains(@id,'VehiclesDetailsCV-AdditionalInterestCardTab')]");

	private static By VE_AI_PersonalVehicleAdditionalInterests = By.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Personal Vehicle Additional Interests']");

	private static By VE_AI_PVAI_Add_Button    = By.xpath("//div[contains(@id,'AdditionalInterestLV_tb-Add')]/div[@role='button']");
	private static By VE_AI_PVAI_Remove_Button = By.xpath("//div[contains(@id,'AdditionalInterestLV_tb-Remove')]/div[@role='button']");

	private static By VE_AI_PVAI_Add_NewCompany                 = By
			.xpath("//div[contains(@id,'AdditionalInterestLV_tb-AddContactsButton') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Company']");
	private static By VE_AI_PVAI_Add_NewPerson                  = By
			.xpath("//div[contains(@id,'AdditionalInterestLV_tb-AddContactsButton') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	private static By VE_AI_PVAI_Add_FromAddressBook            = By
			.xpath("//div[contains(@id,'AdditionalInterestLV_tb-AddContactsButton') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='From Address Book']");
	private static By VE_AI_PVAI_Add_ExistingAdditionalInterest = By
			.xpath("//div[contains(@id,'AdditionalInterestLV_tb-AddContactsButton') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Existing Additional Interest']");

	private static By VE_AI_PVAI_Select = By.xpath(
			"//tr[contains(@id,'AdditionalInterestLV') and contains(@class,'gw-standard-row')]/td[contains(@class,'gw-impl-cell--CB')]//div[contains(@id,'_Checkbox') and contains(@class,'gw-IteratorEntryCheckBoxWidget')]/input[@type='checkbox']");

	private static By VE_AI_PVAI_Name = By.xpath(
			"//tr[contains(@id,'AdditionalInterestLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Name_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Name') and contains(@class,'gw-actionValue')]//div[contains(@id,'Name_button')]");

	private static By VE_AI_PVAI_IntrestType = By.xpath(
			"//tr[contains(@id,'AdditionalInterestLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Type_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Type') and contains(@class,'gw-editable')]//select[contains(@name,'Type')]");

	private static By VE_AI_PVAI_CertificateReq = By.xpath(
			"//tr[contains(@id,'AdditionalInterestLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'CertRequired_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'CertRequired') and contains(@class,'gw-editable')]//input[contains(@id,'CertRequired_0')]");

	private static By VE_AI_PVAI_ContractNo = By.xpath(
			"//tr[contains(@id,'AdditionalInterestLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'ContractNumber_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'ContractNumber') and contains(@class,'gw-editable')]//input[contains(@name,'ContractNumber')]");

	/*
	 * Modules
	 * 
	 * void createVehicles() throws Throwable;
	 * 
	 * void vehicle_Edit() throws Throwable;
	 * 
	 * void vehicle_Remove() throws Throwable;
	 * 
	 * void assignDriver() throws Throwable;
	 * 
	 * void additionalInterest_Add_NewCompany() throws Throwable;
	 * 
	 * void additionalInterest_Add_NewPerson() throws Throwable;
	 * 
	 * void additionalInterest_Add_FromAddressBook() throws Throwable;
	 * 
	 * void additionalInterest_Add_ExistingAdditionalInterest() throws Throwable;
	 * 
	 * void garage_NewLocation() throws Throwable;
	 * 
	 * void garage_EditLocation() throws Throwable;
	 */

	public PA_Vehicles(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void createVehicles() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("vehicles");
		PA_Reusable nsr = new PA_Reusable(driver, oExtentTest);

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Vehicles");

		GuidewireAutomate("Create Vehicle", CreateVehicle_Button, "clickAndwait", "click");

		GuidewireAutomate("VehicleDetails Tab", VE_Tab_VehicleDetails, "clickAndwait", "click");

		GuidewireAutomate_Validation("Basic Vehicle Information", VE_VD_BasicVehicleInformation, "equals", "Basic Vehicle Information");

		GuidewireAutomate("Vehicle Type", VE_VD_BVI_VehicleType, "selectByVisibleText", lhm_TestCase_Table_Data.get("VE_VD_BVI_VehicleType"));

		String StrVIN = lhm_TestCase_Table_Data.get("VE_VD_BVI_VIN");

		if (StrVIN.equalsIgnoreCase("Random")) {
			StrVIN = "2B4FK45J3KR" + getRandomNumeric(6);
			// StrVIN = "3VW1K7AJ9CM349218";
			// StrVIN = 1+"GC"+"HC231"+"81F"+getRandomNumeric
		} else if (StrVIN.equalsIgnoreCase("vingenerator")) {
			StrVIN = nsr.getRandomVIN("vingenerator");
		} else if (StrVIN.equalsIgnoreCase("randomvin")) {
			StrVIN = nsr.getRandomVIN("randomvin");
		}

		GuidewireAutomate("Vin", VE_VD_BVI_VIN, "sendKeys", StrVIN);
		GuidewireAutomate("Body Type", VE_VD_BVI_BodyType, "selectByVisibleText", lhm_TestCase_Table_Data.get("VE_VD_BVI_BodyType"));
		GuidewireAutomate("License_State", VE_VD_BVI_LicenseState, "selectByVisibleText", lhm_TestCase_Table_Data.get("VE_VD_BVI_LicenseState"));

		GuidewireAutomate("Cost New", VE_VD_BVI_CostNew, "sendKeys", lhm_TestCase_Table_Data.get("VE_VD_BVI_CostNew"));
		GuidewireAutomate("Stated Value", VE_VD_BVI_StatedValue, "sendKeys", lhm_TestCase_Table_Data.get("VE_VD_BVI_StatedValue"));

		GuidewireAutomate("Annual Mileage", VE_VD_BVI_AnnualMileage, "sendKeys", lhm_TestCase_Table_Data.get("VE_VD_BVI_AnnualMileage"));

		GuidewireAutomate("Primary Use", VE_VD_BVI_PrimaryUse, "sendKeys", lhm_TestCase_Table_Data.get("VE_VD_BVI_PrimaryUse"));

		GuidewireAutomate_Validation("Vehicle Rate Modifiers", VE_VD_BVI_VehicleRateModifiers, "equals", "Vehicle Rate Modifiers");
		GuidewireAutomate("Anti-Lock Brakes Discount", VE_VD_BVI_VRM_AntiLockBrakesDiscount_No, "click", lhm_TestCase_Table_Data.get("VE_VD_BVI_VRM_AntiLockBrakesDiscount"));
		GuidewireAutomate("Passive Restraint System", VE_VD_BVI_VRM_PassiveRestraintSystem, "sendKeys", lhm_TestCase_Table_Data.get("VE_VD_BVI_VRM_PassiveRestraintSystem"));
		GuidewireAutomate("Anti Theft Discount", VE_VD_BVI_VRM_AntiTheftDiscount, "sendKeys", lhm_TestCase_Table_Data.get("VE_VD_BVI_VRM_AntiTheftDiscount"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void Vehicles_Edit() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("vehicles");
		PA_Reusable nsr = new PA_Reusable(driver, oExtentTest);

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Vehicles_Header, "equals", "Vehicles");

		GuidewireAutomate("Select", VehicleDetails_Select, "clickAndwait", "click");

		GuidewireAutomate("VehicleDetails Tab", VE_Tab_VehicleDetails, "clickAndwait", "click");

		GuidewireAutomate("Body Type", VE_VD_BVI_BodyType, "selectByVisibleText", lhm_TestCase_Table_Data.get("VE_VD_BVI_BodyType"));

		String strVE_VD_BVI_CostNew = lhm_TestCase_Table_Data.get("VE_VD_BVI_CostNew");
		if (strVE_VD_BVI_CostNew.equalsIgnoreCase("Random")) {
			strVE_VD_BVI_CostNew = getRandomNumeric(5);
		}

		GuidewireAutomate("Cost New", VE_VD_BVI_CostNew, "clearANDsendKeys", strVE_VD_BVI_CostNew);

		String strVE_VD_BVI_AnnualMileage = lhm_TestCase_Table_Data.get("VE_VD_BVI_AnnualMileage");
		if (strVE_VD_BVI_AnnualMileage.equalsIgnoreCase("Random")) {
			strVE_VD_BVI_AnnualMileage = getRandomNumeric(5);
		}
		GuidewireAutomate("Annual Mileage", VE_VD_BVI_AnnualMileage, "clearANDsendKeys", strVE_VD_BVI_AnnualMileage);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void Vehicles_Verify() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("vehicles");
		PA_Reusable nsr = new PA_Reusable(driver, oExtentTest);

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Vehicles");

		GuidewireAutomate("VehicleDetails Tab", VE_Tab_VehicleDetails, "clickAndwait", "click");

		GuidewireAutomate_Validation("Vehicle Type", VE_VD_BVI_VehicleType, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("VE_VD_BVI_VehicleType"));
		GuidewireAutomate_Validation("Body Type", VE_VD_BVI_BodyType, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("VE_VD_BVI_BodyType"));
		GuidewireAutomate_Validation("Passive Restraint System", VE_VD_BVI_VRM_PassiveRestraintSystem, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("VE_VD_BVI_VRM_PassiveRestraintSystem"));
		GuidewireAutomate_Validation("Anti Theft Discount", VE_VD_BVI_VRM_AntiTheftDiscount, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("VE_VD_BVI_VRM_AntiTheftDiscount"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void assignDriver() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("vehicles");

		GuidewireAutomate_Validation("Assign Drivers to Vehicles", VE_AssignDriverstoVehicles, "equals", "Assign Drivers to Vehicles");
		GuidewireAutomate_Validation("What percentage does each driver use this vehicle?", VE_ADV_Percentageeachdriverusethisvehicle, "equals", "What percentage does each driver use this vehicle?");

		GuidewireAutomate("Add", VE_ADV_Add_Button, "clickAndwait", "click");

		By VE_ADV_Driver = By.xpath("//div[@class='gw-subMenu gw-open']//div[contains(@id,'DriverPctLV_tb-AddDriver') and contains(@class,'gw-AddMenuItemWidget')]//div[@class='gw-label' and text()='" + strAccountName + "']");
		GuidewireAutomate("Driver " + strAccountName, VE_ADV_Driver, "clickAndwait", lhm_TestCase_Table_Data.get("VE_ADV_Driver"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void additionalInterest_Add_NewCompany() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("vehicles");

		GuidewireAutomate("Additional Interest", VE_Tab_AdditionalInterest, "clickAndwait", "click");
		GuidewireAutomate_Validation("Personal Vehicle Additional Interests", VE_AI_PersonalVehicleAdditionalInterests, "equals", "Personal Vehicle Additional Interests");
		GuidewireAutomate("Add", VE_AI_PVAI_Add_Button, "clickAndwait", "click");
		GuidewireAutomate("NewCompany", VE_AI_PVAI_Add_NewCompany, "clickAndwait", "click");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void additionalInterest_Add_NewPerson() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("vehicles");

		GuidewireAutomate("Additional Interest", VE_Tab_AdditionalInterest, "clickAndwait", "click");
		GuidewireAutomate_Validation("Personal Vehicle Additional Interests", VE_AI_PersonalVehicleAdditionalInterests, "equals", "Personal Vehicle Additional Interests");
		GuidewireAutomate("Add", VE_AI_PVAI_Add_Button, "clickAndwait", "click");
		GuidewireAutomate("NewPerson", VE_AI_PVAI_Add_NewPerson, "clickAndwait", "click");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void additionalInterest_Add_FromAddressBook() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("vehicles");

		GuidewireAutomate("Additional Interest", VE_Tab_AdditionalInterest, "clickAndwait", "click");
		GuidewireAutomate_Validation("Personal Vehicle Additional Interests", VE_AI_PersonalVehicleAdditionalInterests, "equals", "Personal Vehicle Additional Interests");
		GuidewireAutomate("Add", VE_AI_PVAI_Add_Button, "clickAndwait", "click");
		GuidewireAutomate("FromAddressBook", VE_AI_PVAI_Add_FromAddressBook, "clickAndwait", "click");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void additionalInterest_Add_ExistingAdditionalInterest() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("vehicles");

		GuidewireAutomate("Additional Interest", VE_Tab_AdditionalInterest, "clickAndwait", "click");
		GuidewireAutomate_Validation("Personal Vehicle Additional Interests", VE_AI_PersonalVehicleAdditionalInterests, "equals", "Personal Vehicle Additional Interests");

		GuidewireAutomate("Add", VE_AI_PVAI_Add_Button, "clickAndwait", "click");
		GuidewireAutomate("ExistingAdditionalInteres", VE_AI_PVAI_Add_ExistingAdditionalInterest, "moveToElement", "NA");

		// Hande Dynamic Element - Click Existing
		if (lhm_TestCase_Table_Data.get("VE_AI_PVAI_Name").contains("refer")) {
			strAccountName = lhm_TestCase_Data.get("PrimaryNI_Name");
		} else {
			strAccountName = lhm_TestCase_Table_Data.get("VE_AI_PVAI_Name");
		}

		By DR_DriversDetails_Add_ExistingAdditionalInterest_Name = By
				.xpath("//div[@class='gw-subMenu gw-open']//div[contains(@id,'ExistingAdditionalInterest-AddDriver') and contains(@class,'gw-AddMenuItemWidget')]//div[@class='gw-label' and text()='" + strAccountName + "']");
		GuidewireAutomate("ExistingAdditionalInterest_Name" + strAccountName, DR_DriversDetails_Add_ExistingAdditionalInterest_Name, "click", strAccountName);
		// Hande Dynamic Element - Click Existing - Completed

		GuidewireAutomate("Additional Interest Select", VE_AI_PVAI_Select, "clickAndwait", "click");
		GuidewireAutomate_Validation("Additional Interest Name", VE_AI_PVAI_Name, "equals", "NA");
		GuidewireAutomate("Additional Interest IntrestType", VE_AI_PVAI_IntrestType, "selectByVisibleText", lhm_TestCase_Table_Data.get("VE_AI_PVAI_IntrestType"));
		GuidewireAutomate("Additional Interest Certificate Required", VE_AI_PVAI_CertificateReq, "click", lhm_TestCase_Table_Data.get("CertificateReq"));
		GuidewireAutomate("Additional Interest ContractNo", VE_AI_PVAI_ContractNo, "sendKeys", lhm_TestCase_Table_Data.get("VE_AI_PVAI_ContractNo"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void vehicle_Remove() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("vehicles");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void garage_NewLocation() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("vehicles");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void garage_EditLocation() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("vehicles");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void searchtable(By Locator, String CellValue) throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("vehicles");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

}
