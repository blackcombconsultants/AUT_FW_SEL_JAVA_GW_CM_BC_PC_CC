package com.pages.Guidewire.PolicyCenter.PersonalAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class PA_Drivers extends SeleniumWebDriver_Commands {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PA_Drivers(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By Drivers_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title']");


	/*

	 * 
	 */
	private static By DR_DriversDetails_Add_Button          = By.xpath("//div[contains(@id,'DriversLV_tb-Add')]/div[@role='button']");
	private static By DR_DriversDetails_Add_NewPerson       = By
			.xpath("//div[contains(@id,'DriversListDetailPanel-DriversLV_tb-AddDriver') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	private static By DR_DriversDetails_Add_FromAddressBook = By
			.xpath("//div[contains(@id,'DriversListDetailPanel-DriversLV_tb-AddDriver') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='From Address Book']");
	private static By DR_DriversDetails_Add_ExistingDriver  = By
			.xpath("//div[contains(@id,'DriversListDetailPanel-DriversLV_tb-AddDriver') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Existing Driver']");

	private static By DR_DriversDetails_Remove_Button = By.xpath("//div[contains(@id,'DriversLV_tb-Remove')]/div[@role='button']");

	private static By DR_DriversDetails_RetrieveMVR_Button = By.xpath("//div[contains(@id,'DriversLV_tb-RetrieveMVRButton')]/div[@role='button']");

	/*
	 * DriversDetails
	 */
	private static By DR_DriversDetails_TableHeader = By.xpath("//tr[contains(@id,'DriversListDetailPanel-DriversLV') and contains(@class,'gw-header-row')]");

	private static By DR_DriversDetails_Select = By.xpath("//td[contains(@class,'gw-impl-cell--CB')]/div[@class='gw-cell-inner']/div[contains(@id,'Checkbox')]/input[contains(@name,'Checkbox')]");

	private static By DR_DriversDetails_LicenseNumber = By.xpath("//td[contains(@id,'LicenseNumber_Cell') and contains(@class,'gw-CellWidget')]//div[@class='gw-value-readonly-wrapper' and text()='224242424']");

	private static By DR_DriversDetails_MVRStatus = By.xpath("//td[contains(@id,'MVRStatus_Cell')]//div[@class='gw-value-readonly-wrapper']");

	private static By DR_DriversDetails_StatusDate = By.xpath("//td[contains(@id,'StatusDate')]//div[@class='gw-value-readonly-wrapper' and text()='04/18/2021']");

	/*
	 * ContactDetails
	 */

	private static By DR_Tab_ContatDetails = By.xpath("//div[contains(@id,'DriverDetailsCV-PolicyContactDetailCardTab')]");

	private static By DR_CD_Person      = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Person']");
	private static By DR_CD_P_FirstName = By.xpath("//input[contains(@name,'PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName')]");
	private static By DR_CD_P_LastName  = By.xpath("//input[contains(@name,'PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName')]");

	private static By DR_CD_Address    = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Address']");
	private static By DR_CD_A_Address1 = By.xpath("//input[contains(@name,'AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1')]");

	private static By DR_CD_DateofBirth   = By.xpath("//div[contains(@id,'DateOfBirth_Input')]//div[@class='gw-value']//input[contains(@name,'DateOfBirth')]");
	private static By DR_CD_LicenseNumber = By.xpath("//input[contains(@name,'LicenseInputSet-LicenseNumber')]");
	private static By DR_CD_LicenseState  = By.xpath("//select[contains(@name,'LicenseInputSet-LicenseState')]");

	private static By DR_CD_OfficialIDs = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Official IDs']");
	private static By DR_CD_OI_SSN      = By.xpath("//input[contains(@name,'OfficialIDDV_Input')]");

	/*
	 * Roles
	 */

	private static By DR_Tab_Roles = By.xpath("//div[contains(@id,'DriverDetailsCV-RolesCardTab')]");

	private static By DR_R_PrimaryNamedInsured          = By.xpath("//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Primary Named Insured']");
	private static By DR_R_Driver                       = By.xpath("//div[contains(@class,'gw-TitleBarWidget')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Driver']");
	private static By DR_R_D_DateCompletedTrainingClass = By.xpath("//input[contains(@name,'PolicyContactRolePanelSet-PolicyDriverInfoDV-datecompletedtrainingclass')]");
	private static By DR_R_D_YearFirstLicensed          = By.xpath("//input[contains(@name,'PolicyContactRolePanelSet-PolicyDriverInfoDV-yearlicensed')]");

	private static By DR_R_D_ExcludedYes   = By.xpath("//input[contains(@id,'ExcludedDriver_0')]");
	private static By DR_R_D_ExcludedNo    = By.xpath("//input[contains(@id,'ExcludedDriver_1')]");
	private static By DR_R_D_DoNotOrderMVR = By.xpath("//input[contains(@name,'DoNotOrderMVR')]");

	private static By DR_R_AccidentViolationSummary            = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Accident/Violation Summary']");
	private static By DR_R_AVS_NumberOfAccidents_PolicyLevel   = By.xpath("//select[contains(@name,'PolicyContactRolePanelSet-PolicyDriverNumberOfAccidents')]");
	private static By DR_R_AVS_NumberOfAccidents_AccountLevel  = By.xpath("//select[contains(@name,'PolicyContactRolePanelSet-DriverNumberOfAccidents')]");
	private static By DR_R_AVS_NumberOfViolations_PolicyLevel  = By.xpath("//select[contains(@name,'PolicyContactRolePanelSet-PolicyDriverNumberOfViolations')]");
	private static By DR_R_AVS_NumberOfViolations_AccountLevel = By.xpath("//select[contains(@name,'PolicyContactRolePanelSet-DriverNumberOfViolations')]");

	/*
	 * Address
	 */

	private static By DR_Tab_Addresses            = By.xpath("//div[contains(@id,'AddressDetailCardTab')]/div[@role='tab']");
	private static By DR_A_CurrentlyPolicyAddress = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='This is currently the policy address']");
	private static By DR_A_ADD                    = By.xpath("//div[contains(@id,'AddressesLV_tb-Add')]//div[@role='button']");
	private static By DR_A_Remove                 = By.xpath("//div[contains(@id,'AddressesLV_tb-Remove')]//div[@role='button']");

	private static By DR_A_ADD_Address_Select = By.xpath("//input[contains(@name,'AddressesPanelSet-AddressesLV-1-_Checkbox')]");
	private static By DR_A_ADD_Primary        = By.xpath("//div[contains(@id,'AddressesLV-1-Primary_radio')]");

	private static By DR_A_ADD_Address1           = By.xpath("//div[contains(@id,'AddressLine1')]//input[contains(@name,'GlobalAddressInputSet-AddressLine1')]");
	private static By DR_A_ADD_State              = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	private static By DR_A_ADD_AddressType        = By.xpath("//select[contains(@name,'AddressDetailDV-AddressType')]");
	private static By DR_A_ADD_AddressDescription = By.xpath("//input[contains(@name,'AddressDetailDV-Description')]");
	private static By DR_A_ADD_ValidUntil         = By.xpath("//input[contains(@name,'AddressDetailDV-ValidUntil')]");
	/*
	 * MVRDetail
	 */

	private static By DR_Tab_MotorVehicleRecord = By.xpath("//div[contains(@id,'MVRDetailCardTab')]/div[@role='tab']");
	private static By DR_MVR_Name               = By.xpath("//div[contains(@id,'PersonalMotorVehicleRecordsDV-Name')]//div[@class='gw-value-readonly-wrapper']");

	public static void driver_Add_NewPerson() throws Throwable {
		// TODO Auto-generated method stub
		// GuidewireAutomate("Organization Name", OS_OrganizationName,
		// "sendKeys",
		// lhm_Data.get("TD_OrganizationName"));

	}

	public static void driver_Add_FromAddressBook() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void driver_Add_ExistingDriver() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("drivers");

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Drivers");

		GuidewireAutomate("Add", DR_DriversDetails_Add_Button, "click", lhm_TestCase_Table_Data.get("DR_Add"));
		GuidewireAutomate("Existing Driver", DR_DriversDetails_Add_ExistingDriver, "moveToElement", lhm_TestCase_Table_Data.get("DR_Add_DD_Name"));

		/*
		 * // Hande Dynamic Element - Click Existing driver if (lhm_TestCase_Table_Data.get("DR_Add_DD_Name").contains("refer")) { strAccountName =
		 * lhm_TestCase_Data.get("PrimaryNI_Name"); } else { strAccountName = lhm_TestCase_Table_Data.get("DR_Add_DD_Name"); }
		 */
		By DR_DriversDetails_Add_ExistingDriver_Name = By.xpath(
				"//div[contains(@id,'DriversListDetailPanel-DriversLV_tb-AddDriver') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']/div[contains(@id,'DriversLV_tb-AddDriver-AddExistingContact')]//div[contains(@id,'UnassignedDriver')]//div[@class='gw-label' and text()='"
						+ strAccountName + "']");
		GuidewireAutomate("Existing Driver " + strAccountName, DR_DriversDetails_Add_ExistingDriver_Name, "clickAndwait", strAccountName);
		// Hande Dynamic Element - Click Existing driver - Completed

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void driver_Remove() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("drivers");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void driver_RetrieveMVR() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("drivers");

		// Hande Dynamic Element - Click Existing driver
		if (lhm_TestCase_Table_Data.get("DR_Add_DD_Name").contains("refer")) {
			strAccountName = lhm_TestCase_Data.get("PrimaryNI_Name");
		}

		By DR_DriversDetails_Name = By.xpath("//td[contains(@id,'Name_Cell') and contains(@class,'gw-CellWidget')]//div[text()='" + strAccountName + "']");
		GuidewireAutomate("Driver " + strAccountName, DR_DriversDetails_Name, "click", strAccountName);

		GuidewireAutomate("Driver Select", DR_DriversDetails_Select, "click", "NA");
		GuidewireAutomate("RetrieveMVR", DR_DriversDetails_RetrieveMVR_Button, "clickAndwait", "NA");

		GuidewireAutomate_Validation("MVR Status", DR_DriversDetails_MVRStatus, "equals", "Ordered");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void driver_Edit_ExistingDriver() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("drivers");
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Drivers_Header, "equals", "Drivers");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void driver_ContatDetails(String TestingType) throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("drivers");

		GuidewireAutomate("Contat Details Tab", DR_Tab_ContatDetails, "click", "click");

		String LicenseNumber = lhm_TestCase_Table_Data.get("DR_CD_LicenseNumber");
		switch (TestingType) {
			case "VERIFY" :

				GuidewireAutomate_Validation("Person", DR_CD_Person, "equals", "Person");

				// GuidewireAutomate_Validation("First name", DR_CD_P_FirstName,
				// "valueEquals",
				// lhm_TestCase_Table_Data.get("DR_CD_P_FirstName"));
				// GuidewireAutomate_Validation("Last name", DR_CD_P_LastName,
				// "valueEquals",
				// lhm_TestCase_Table_Data.get("DR_CD_P_LastName"));
				GuidewireAutomate("Date Of Birth", DR_CD_DateofBirth, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DR_CD_DateofBirth"));
				GuidewireAutomate_Validation("Address", DR_CD_Address, "equals", "Address");

				/*
				 * GuidewireAutomate_Validation("Address1", DR_CD_A_Address1, "valueEquals", lhm_TestCase_Table_Data.get("DR_CD_A_Address1"));
				 * 
				 * GuidewireAutomate_Validation("SSN", DR_CD_OI_SSN, "valuecontains", lhm_TestCase_Table_Data.get("DR_CD_OI_SSN"));
				 */
				GuidewireAutomate("LicenseNumber", DR_CD_LicenseNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DR_CD_LicenseNumber"));

				GuidewireAutomate("LicenseState", DR_CD_LicenseState, "selectByVisibleText", lhm_TestCase_Table_Data.get("DR_CD_LicenseState"));

				lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
				lhm_TestCase_Table_Data.clear();
				break;

			case "EDIT" :

				GuidewireAutomate_Validation("Person", DR_CD_Person, "equals", "Person");
				GuidewireAutomate("First name", DR_CD_P_FirstName, "clearAndsendKeys", lhm_TestCase_Table_Data.get("DR_CD_P_FirstName"));
				GuidewireAutomate("Last name", DR_CD_P_LastName, "clearAndsendKeys", lhm_TestCase_Table_Data.get("DR_CD_P_LastName"));
				GuidewireAutomate("DateofBirth", DR_CD_DateofBirth, "clearAndsendKeys", lhm_TestCase_Table_Data.get("DR_CD_DateofBirth"));

				GuidewireAutomate_Validation("Address", DR_CD_Address, "equals", "Address");
				GuidewireAutomate("Address1", DR_CD_A_Address1, "clearAndsendKeys", lhm_TestCase_Table_Data.get("DR_CD_A_Address1"));

				GuidewireAutomate_Validation("Official IDs", DR_CD_OfficialIDs, "equals", "Official IDs");
				GuidewireAutomate("SSN", DR_CD_OI_SSN, "clearAndsendKeys", lhm_TestCase_Table_Data.get("DR_CD_OI_SSN"));

				if (LicenseNumber.equalsIgnoreCase("Random")) {
					LicenseNumber = getRandomAlphabetic(9);
				} else if (LicenseNumber.equalsIgnoreCase("Today")) {
					LicenseNumber = strCurrentDate_ddMMMMyyyy;
				} else if (LicenseNumber.equalsIgnoreCase("CurrentTime")) {
					LicenseNumber = strCurrentDate_ddMMMMyyyyHHmmss;
				} else if (LicenseNumber.equalsIgnoreCase("NowSystem")) {
					LicenseNumber = String.valueOf(System.currentTimeMillis());
				} else {
					LicenseNumber = lhm_TestCase_Table_Data.get("DR_CD_LicenseNumber");
				}

				GuidewireAutomate("LicenseNumber", DR_CD_LicenseNumber, "clearAndsendKeys", LicenseNumber);
				GuidewireAutomate("LicenseState", DR_CD_LicenseState, "selectByVisibleText", lhm_TestCase_Table_Data.get("DR_CD_LicenseState"));

				lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
				lhm_TestCase_Table_Data.clear();
				break;
			default :
				break;

		}

	}

	public static void driver_Roles(String TestingType) throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("drivers");

		GuidewireAutomate("Roles Tab", DR_Tab_Roles, "click", "click");

		GuidewireAutomate_Validation("Primary Named Insured", DR_R_PrimaryNamedInsured, "equals", "Primary Named Insured");

		GuidewireAutomate_Validation("Driver", DR_R_Driver, "equals", "Driver");

		switch (TestingType) {
			case "VERIFY" :

				break;
			case "EDIT" :

				GuidewireAutomate("DateCompletedTrainingClass", DR_R_D_DateCompletedTrainingClass, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DR_R_D_DateCompletedTrainingClass"));
				GuidewireAutomate("YearFirstLicensed", DR_R_D_YearFirstLicensed, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DR_R_D_YearFirstLicensed"));

				GuidewireAutomate("Excluded?", DR_R_D_ExcludedNo, "click", lhm_TestCase_Table_Data.get("DR_R_D_Excluded"));
				// GuidewireAutomate("Do Not Order MVR", DR_R_D_DoNotOrderMVR,
				// "click",
				// lhm_TestCase_Table_Data.get("DR_R_D_DoNotOrderMVR"));

				GuidewireAutomate_Validation("Accident/Violation Summary", DR_R_AccidentViolationSummary, "equals", "Accident/Violation Summary");
				GuidewireAutomate("NumberOfAccidents_PolicyLevel", DR_R_AVS_NumberOfAccidents_PolicyLevel, "selectByVisibleText", lhm_TestCase_Table_Data.get("DR_R_AVS_NumberOfAccidents_PolicyLevel"));
				GuidewireAutomate("NumberOfAccidents_AccountLevel", DR_R_AVS_NumberOfAccidents_AccountLevel, "selectByVisibleText", lhm_TestCase_Table_Data.get("DR_R_AVS_NumberOfAccidents_AccountLevel"));
				GuidewireAutomate("NumberOfViolations_PolicyLevel", DR_R_AVS_NumberOfViolations_PolicyLevel, "selectByVisibleText", lhm_TestCase_Table_Data.get("DR_R_AVS_NumberOfViolations_PolicyLevel"));
				GuidewireAutomate("NumberOfViolations_AccountLevel", DR_R_AVS_NumberOfViolations_AccountLevel, "selectByVisibleText", lhm_TestCase_Table_Data.get("DR_R_AVS_NumberOfViolations_AccountLevel"));

				break;
			default :
				break;
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void driver_Addresses(String TestingType) throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("drivers");

		GuidewireAutomate("Addresses Tab", DR_Tab_Addresses, "click", "click");

		GuidewireAutomate_Validation("This is currently the policy address", DR_A_CurrentlyPolicyAddress, "equals", "This is currently the policy address");

		switch (TestingType) {
			case "VERIFY" :
				GuidewireAutomate_Validation("State", DR_A_ADD_State, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("DR_A_AD_State"));

				break;
			case "EDIT" :

				GuidewireAutomate("Select", DR_A_ADD_Address_Select, "clickAndwait", "NA");

				GuidewireAutomate("Address1", DR_A_ADD_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DR_A_ADD_Address1"));
				GuidewireAutomate("Address Description", DR_A_ADD_AddressDescription, "sendKeys", lhm_TestCase_Table_Data.get("DR_A_ADD_AddressDescription"));
				GuidewireAutomate("Valid Until", DR_A_ADD_ValidUntil, "sendKeys", lhm_TestCase_Table_Data.get("DR_A_ADD_ValidUntil"));
				break;

			case "ADD" :

				GuidewireAutomate("Add", DR_A_ADD, "clickAndwait", "NA");
				GuidewireAutomate("Select", DR_A_ADD_Address_Select, "clickAndwait", "NA");

				GuidewireAutomate("Address1", DR_A_ADD_Address1, "sendKeys", lhm_TestCase_Table_Data.get("DR_A_ADD_Address1"));
				GuidewireAutomate("Address State", DR_A_ADD_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("DR_A_ADD_State"));
				GuidewireAutomate("Address Type", DR_A_ADD_AddressType, "sendKeys", lhm_TestCase_Table_Data.get("DR_A_ADD_AddressType"));
				GuidewireAutomate("Address Description", DR_A_ADD_AddressDescription, "sendKeys", lhm_TestCase_Table_Data.get("DR_A_ADD_AddressDescription"));
				GuidewireAutomate("Valid Until", DR_A_ADD_ValidUntil, "sendKeys", lhm_TestCase_Table_Data.get("DR_A_ADD_ValidUntil"));
				break;
			case "REMOVE" :

				GuidewireAutomate("Select", DR_A_ADD_Address_Select, "clickAndwait", "NA");
				GuidewireAutomate("Add", DR_A_Remove, "clickAndwait", "NA");
				break;

			default :
				break;
		}
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void driver_MotorVehicleRecord(String TestingType) throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("drivers");

		GuidewireAutomate("MotorVehicleRecord Tab", DR_Tab_MotorVehicleRecord, "click", "NA");
		switch (TestingType) {
			case "VERIFY" :
				GuidewireAutomate_Validation("Name", DR_MVR_Name, "equals", strAccountName);

				break;
			case "EDIT" :

				break;
			default :
				break;
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

}
