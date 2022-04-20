package com.pages.Guidewire.PolicyCenter.CommercialAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class CA_Qualification extends SeleniumWebDriver_Commands {

	public CA_Qualification(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By QU_CA_PreQualification = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Commercial Auto Pre-Qualification']");

	private static By QU_Did_Agent_Inspect_Vehicles                                                                                               = By.xpath("//input[contains(@id,'QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_1')]");
	private static By QU_Any_Vehicles_Customized_Altered_Or_Which_Have_Special_Equipment                                                          = By.xpath("//input[contains(@id,'QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_With_Exception_Of_Encumbrances_Are_Any_Vehicles_Not_Solely_OwnedBy_And_Registered_To_Applicant                           = By.xpath("//input[contains(@id,'QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Any_Past_Present_Or_Planned_Operation_Including_Manufacture_Installation_Removal_Encasement_Or_Encapsulation_Of_Asbestos = By.xpath("//input[contains(@id,'QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_How_Many_Hours_Per_Day_Are_Vehicles_In_Use                                                                               = By.xpath("//select[contains(@name,'QuestionSetLV-4-QuestionModalInput-ChoiceSelectInput_NoPost')]");
	private static By QU_Does_Applicant_Hav_A_Specific_Driver_Recruiting_Method                                                                   = By.xpath("//input[contains(@id,'QuestionSetLV-5-QuestionModalInput-BooleanRadioInput_NoPost_0')]");
	private static By QU_Do_Over_50Persent_Of_Employees_Use_Their_Autos_For_Business_Purposes                                                     = By.xpath("//input[contains(@id,'QuestionSetLV-6-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Are_Any_Vehicles_Used_By_Family_Members                                                                                  = By.xpath("//input[contains(@id,'QuestionSetLV-7-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Do_Operations_Involve_Transporting_Hazardous_Material                                                                    = By.xpath("//input[contains(@id,'QuestionSetLV-8-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Does_Applicant_HaveAny_Hold_Harmless_Agreements                                                                          = By.xpath("//input[contains(@id,'QuestionSetLV-9-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Any_Vehicles_Leased_To_Others                                                                                            = By.xpath("//input[contains(@id,'QuestionSetLV-10-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Did_Applicant_Obtain_MVR_Verifications                                                                                   = By.xpath("//input[contains(@id,'QuestionSetLV-11-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Any_Drivers_With_Convictions_For_Moving_Traffic_Violations                                                               = By.xpath("//input[contains(@id,'QuestionSetLV-12-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Are_ICC_PUC_Or_Other_Filings_Required                                                                                    = By.xpath("//input[contains(@id,'QuestionSetLV-13-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Does_The_Applicant_Own_Any_Vehicles                                                                                      = By.xpath("//input[contains(@id,'QuestionSetLV-14-QuestionModalInput-BooleanRadioInput_1')]");
	private static By QU_Does_Applicant_Do_Spraying_Or_Pruning                                                                                    = By.xpath("//input[contains(@id,'QuestionSetLV-15-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Any_Vehicle_Maintenance_Program_In_Operation                                                                             = By.xpath("//input[contains(@id,'QuestionSetLV-16-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Are_Any_Drivers_Not_Covered_By_Work_Comp                                                                                 = By.xpath("//input[contains(@id,'QuestionSetLV-17-QuestionModalInput-BooleanRadioInput_NoPost_1')]");

	public static void qualification() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CA_Reusables.getData_CommercialAuto("qualification");

			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Qualification_Header, "equals", "Qualification");

			GuidewireAutomate_Validation("PA Pre-Qualification", QU_CA_PreQualification, "equals", "Commercial Auto Pre-Qualification");

			GuidewireAutomate("Did agent inspect vehicles?", QU_Did_Agent_Inspect_Vehicles, "click", lhm_TestCase_Table_Data.get("QU_DidAgentInspectVehicles"));

			GuidewireAutomate("Any vehicles customized, altered or which have special equipment?", QU_Any_Vehicles_Customized_Altered_Or_Which_Have_Special_Equipment, "click", lhm_TestCase_Table_Data.get("QU_AnyVehiclesCustomizedAltered"));

			GuidewireAutomate("With exception of encumbrances, are any vehicles not solely owned by and registered to applicant?", QU_With_Exception_Of_Encumbrances_Are_Any_Vehicles_Not_Solely_OwnedBy_And_Registered_To_Applicant, "click",
					lhm_TestCase_Table_Data.get("QU_WithExceptionOfEncumbrances"));

			GuidewireAutomate("Any past, present or planned operation including manufacture, installation, removal, encasement, or encapsulation of asbestos?",
					QU_Any_Past_Present_Or_Planned_Operation_Including_Manufacture_Installation_Removal_Encasement_Or_Encapsulation_Of_Asbestos, "click", lhm_TestCase_Table_Data.get("QU_AnyPastPresentOrPlannedOperation"));

			GuidewireAutomate("How many hours per day are vehicles in use?", QU_How_Many_Hours_Per_Day_Are_Vehicles_In_Use, "selectByVisibleText", lhm_TestCase_Table_Data.get("QU_HowManyHoursPerDayAreVehiclesInUse"));

			GuidewireAutomate("Does applicant have a specific driver recruiting method?", QU_Does_Applicant_Hav_A_Specific_Driver_Recruiting_Method, "click", lhm_TestCase_Table_Data.get("QU_DoesApplicantHavASpecific"));

			GuidewireAutomate("Do over 50% of employees use their autos for business purposes?", QU_Do_Over_50Persent_Of_Employees_Use_Their_Autos_For_Business_Purposes, "click", lhm_TestCase_Table_Data.get("QU_DoOver50PersentOfEmployees"));

			GuidewireAutomate("Are any vehicles used by family members?", QU_Are_Any_Vehicles_Used_By_Family_Members, "click", lhm_TestCase_Table_Data.get("QU_AreAnyVehiclesUsedBy"));

			/*
			 * GuidewireAutomate("Do operations involve transporting hazardous material?", QU_Do_Operations_Involve_Transporting_Hazardous_Material,
			 * "click", lhm_TestCase_Table_Data.get("QU_DoOperationsInvolveTransporting"));
			 * 
			 * GuidewireAutomate("Does applicant have any hold harmless agreements?", QU_Does_Applicant_HaveAny_Hold_Harmless_Agreements, "click",
			 * lhm_TestCase_Table_Data.get("QU_DoesApplicantHaveAnyHold"));
			 * 
			 * GuidewireAutomate("Any vehicles leased to others?", QU_Any_Vehicles_Leased_To_Others, "click",
			 * lhm_TestCase_Table_Data.get("QU_AnyVehiclesLeasedToOthers"));
			 * 
			 * GuidewireAutomate("Did applicant obtain MVR verifications?", QU_Did_Applicant_Obtain_MVR_Verifications, "click",
			 * lhm_TestCase_Table_Data.get("QU_DidApplicantObtainMVR"));
			 * 
			 * GuidewireAutomate("Any drivers with convictions for moving traffic violations?" ,
			 * QU_Any_Drivers_With_Convictions_For_Moving_Traffic_Violations, "click", lhm_TestCase_Table_Data.get("QU_AnyDriversWithConvictions"));
			 * 
			 * GuidewireAutomate("Are ICC, PUC or other filings required?", QU_Are_ICC_PUC_Or_Other_Filings_Required, "click",
			 * lhm_TestCase_Table_Data.get("QU_AreICCPUCOrOtherFilings"));
			 * 
			 * GuidewireAutomate("Does the applicant own any vehicles?", QU_Does_The_Applicant_Own_Any_Vehicles, "click",
			 * lhm_TestCase_Table_Data.get("QU_DoesTheApplicantOwnAnyVehicles"));
			 * 
			 * GuidewireAutomate("Does applicant do spraying or pruning?", QU_Does_Applicant_Do_Spraying_Or_Pruning, "click",
			 * lhm_TestCase_Table_Data.get("QU_DoesApplicantDoSpraying"));
			 * 
			 * GuidewireAutomate("Any vehicle maintenance program in operation?", QU_Any_Vehicle_Maintenance_Program_In_Operation, "click",
			 * lhm_TestCase_Table_Data.get("QU_AnyVehicleMaintenanceProgram"));
			 * 
			 * GuidewireAutomate("Are any drivers not covered by work comp?", QU_Are_Any_Drivers_Not_Covered_By_Work_Comp, "click",
			 * lhm_TestCase_Table_Data.get("QU_AreAnyDriversNotCovered"));
			 */

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

			oExtentTest.log(Status.PASS, "Commercial Auto Pre-Qualification is succesful");
		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Commercial Auto Pre-Qualification is Unsuccesful");
			e.printStackTrace();
			throw e;
		}

	}

}
