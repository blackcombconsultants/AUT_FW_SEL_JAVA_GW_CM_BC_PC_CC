package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CC_Exposure extends SeleniumWebDriver_Commands {

	public CC_Exposure(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By Ok                = By.xpath("//div[contains(@id,'EditVehicleIncidentScreen-Update')]");
	private static By Update_Button     = By.xpath("//div[contains(@id,'Update')]//div[@role='button']");
	private static By Validation_Header = By.xpath("//div[@class='gw-action--inner gw-hasDivider']//div[@class='gw-label' and text()='Validation Results']");
	private static By Error_Msg         = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[contains(text(),'Vehicle incident description must not be empty')]");
	private static By Ok_Button         = By.xpath("//div[contains(@id,'Update')]//div[@role='button']");

	private static By NO_Error     = By.xpath("//div[@class='gw-message']");
	private static By Clear_Button = By.xpath("//div[contains(@id,'ClearButton')]//div[@role='button']");

	final By summary            = By.xpath("//*[@id='Claim-MenuLinks-Claim_ClaimSummaryGroup']/div[1]/div[2]");
	final By service            = By.xpath("//*[@id='ClaimSummary-ClaimSummaryScreen-ServiceRequestLV']/div/div[1]/div[1]/div[1]");
	final By exposuresLineOne   = By.id("ClaimSummary-ClaimSummaryScreen-ClaimSummaryExposuresLV-0-Type");
	final By exposureCount      = By.xpath("//table//tr[starts-with(@id, 'ClaimSummary-ClaimSummaryScreen-ClaimSummaryExposuresLV')]//div[@data-gw-tooltip='Open']");
	final By exposureOpenCount  = By.xpath("//table//tr[starts-with(@id, 'ClaimSummary-ClaimSummaryScreen-ClaimSummaryExposuresLV')]//div[@data-gw-tooltip='Open']");
	final By openExposureLink   = By.xpath("//div[@class='gw-link gw-label']");
	final By clickCloseExposure = By.xpath("//*[@id='TopLevelExposureDetail-ExposureDetailScreen-ExposureDetailScreen_CloseButton']/div/div[2]");
	final By outcome            = By.name("CloseExposurePopup-CloseExposureScreen-CloseExposureInfoDV-Outcome");
	final By sampleTest1        = By.xpath("//*[@id='CloseExposurePopup-CloseExposureScreen-ttlBar']/div[1]/div");
	final By closeExposure      = By.xpath("//div[@id='CloseExposurePopup-CloseExposureScreen-Update']");

	// @For C
	private static By ChoosebyCoverageType_C                          = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='C']");
	private static By ChoosebyCoverageType_C_Collision                = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Collision']");
	private static By ChoosebyCoverageType_C_CollisionLimitedCoverage = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Collision - Limited Coverage']");
	private static By ChoosebyCoverageType_C_Comprehensive            = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Comprehensive']");

	// @For D
	private static By ChoosebyCoverageType_D                           = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='D']");
	private static By ChoosebyCoverageType_D_DeathandDisabilityBenefit = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Death and Disability Benefit']");

	// @For E
	private static By ChoosebyCoverageType_E                     = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='E']");
	private static By ChoosebyCoverageType_E_ElectronicEquipment = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Electronic Equipment']");

	// @For L
	private static By ChoosebyCoverageType_L                          = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='L']");
	private static By ChoosebyCoverageType_L_LiabilityBodilyInjury    = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Liability - Bodily Injury']");
	private static By ChoosebyCoverageType_L_LiabilityPropertyDamagey = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Liability - Property Damage']");
	private static By ChoosebyCoverageType_L_LiabilityVehicleDamage   = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Liability - Vehicle Damage']");

	// @For M
	private static By ChoosebyCoverageType_M                        = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='M']");
	private static By ChoosebyCoverageType_M_MexicoCoverageLimited  = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Mexico Coverage - Limited']");
	private static By ChoosebyCoverageType_M_MexicoCovBI            = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Mexico Cov - BI']");
	private static By ChoosebyCoverageType_M_MexicoCovPD            = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Mexico Cov - PD']");
	private static By ChoosebyCoverageType_M_MexicoCovVehicleDamage = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Mexico Cov - Vehicle Damage']");
	private static By ChoosebyCoverageType_M_MexicoCovGenDamages    = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Mexico Cov - Gen. Damages']");
	private static By ChoosebyCoverageType_M_MedicalPayments        = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Medical Payments']");

	// @For P
	private static By ChoosebyCoverageType_P                             = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='P']");
	private static By ChoosebyCoverageType_P_PIPArkansas                 = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Arkansas']");
	private static By ChoosebyCoverageType_P_PIPDelaware                 = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Delaware']");
	private static By ChoosebyCoverageType_P_PIPDistrictofColumbia       = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - District of Columbia']");
	private static By ChoosebyCoverageType_P_PIPFlorida                  = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Florida']");
	private static By ChoosebyCoverageType_P_PIPHawaii                   = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Hawaii']");
	private static By ChoosebyCoverageType_P_PIPKansas                   = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Kansas']");
	private static By ChoosebyCoverageType_P_PIPKentucky                 = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Kentucky']");
	private static By ChoosebyCoverageType_P_PIPMaryland                 = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Maryland']");
	private static By ChoosebyCoverageType_P_PIPMassachusetts            = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Massachusetts']");
	private static By ChoosebyCoverageType_P_PIPMichigan                 = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Michigan']");
	private static By ChoosebyCoverageType_P_PIPMinnesota                = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Minnesota']");
	private static By ChoosebyCoverageType_P_PIPNewJersey                = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - New Jersey']");
	private static By ChoosebyCoverageType_P_PIPNewYork                  = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - New York']");
	private static By ChoosebyCoverageType_P_PIPNorthDakota              = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - North Dakota']");
	private static By ChoosebyCoverageType_P_PIPOregon                   = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Oregon']");
	private static By ChoosebyCoverageType_P_PIPPennsylvanian            = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Pennsylvania']");
	private static By ChoosebyCoverageType_P_PIPTexas                    = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Texas']");
	private static By ChoosebyCoverageType_P_PIPUtah                     = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Utah']");
	private static By ChoosebyCoverageType_P_PIPWashington               = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='PIP - Washington']");
	private static By ChoosebyCoverageType_P_PropertyProtectionInsurance = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Property Protection Insurance']");

	// @For R
	private static By ChoosebyCoverageType_R                     = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='R']");
	private static By ChoosebyCoverageType_R_RentalCarLossofUse  = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Rental Car Loss of Use']");
	private static By ChoosebyCoverageType_R_RentalReimbursement = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Rental Reimbursement']");

	// @For T
	private static By ChoosebyCoverageType_T                = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='T']");
	private static By ChoosebyCoverageType_T_TapeDiscMedia  = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Tape / Disc Media']");
	private static By ChoosebyCoverageType_T_TowingandLabor = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Towing and Labor']");

	// @For U
	private static By ChoosebyCoverageType_U                                    = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='U']");
	private static By ChoosebyCoverageType_U_UnderinsuredMotoristBodilyInjury   = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Underinsured Motorist - Bodily Injury']");
	private static By ChoosebyCoverageType_U_UnderinsuredMotoristPropertyDamage = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Underinsured Motorist - Property Damage']");
	private static By ChoosebyCoverageType_U_UninsuredMotoristBodilyInjury      = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Uninsured Motorist - Bodily Injury']");
	private static By ChoosebyCoverageType_U_UninsuredMotorisPropertyDamage     = By.xpath("//div[contains(@id,'ByCoverageType')]//div[@class='gw-label' and text()='Uninsured Motorist - Property Damage']");

	// Choose By Coverage-Vehicle level Coverages
	private static By CBC_Vehicle = By.xpath("//div[@id='Claim-ClaimMenuActions-ClaimMenuActions_NewExposure-NewExposureMenuItemSet-NewExposureMenuItemSet_ByCoverage-1-item']");

	// CBC Vehicle-Collision
	private static By CBC_Vehicle_Collision = By.xpath("//div[@id='Claim-ClaimMenuActions-ClaimMenuActions_NewExposure-NewExposureMenuItemSet-NewExposureMenuItemSet_ByCoverage']//div[@class='gw-label' and text()='Collision']");
	private static By CBC_Vehicle_Header    = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By Expsoure_Header       = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");

	private static By CBC_V_C_Claimant = By.xpath("//select[contains(@name,'NewClaimVehicleDamageDV-Claimant_Picker')]");
	private static By CBC_V_C_Type     = By.xpath("  //select[contains(@name,'NewClaimVehicleDamageDV-Claimant_Type')]");

	private static By CBC_V_C_IncidentOverviewVehicle             = By.xpath("//div[contains(@id,'Vehicle_IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By CBC_V_C_IncidentOverviewEditIncidentDetails = By.xpath("//div[contains(@id,'NewClaimVehicleDamageDV_EditIncidentMenuItem')]//div[@class='gw-label']");
	private static By CBC_VehicleIncident_Header                  = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By CBC_VehicleIncident_                        = By.xpath("//textarea[contains(@name,'VehicleIncidentDV-Description')]");
	private static By CBC_VehicleIncident_DamageDescription       = By.xpath("//textarea[contains(@name,'VehicleIncidentDV-Description')]");
	private static By CBC_VehicleIncident_LossOccurred            = By.xpath("//select[contains(@name,'VehicleIncidentDV-LossOccured')]");
	private static By CBC_VehicleIncident_DriverName              = By.xpath("//select[contains(@name,'VehicleIncidentDV-Driver_Picker')]");

	// New Exposure Page
	private static By ExposureHeader          = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Exposures']");
	private static By NewExposureHeader       = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'New Exposure')]");
	private static By ExposureTitle           = By.xpath("//div[contains(@id,'NewExposureScreen-NewExposureDV')]//div[text()='Exposure']");
	private static By NewExposureUpdateButton = By.xpath("//div[contains(@id,'NewExposure-NewExposureScreen-Update')]//div[@role='button']");

	// New Exposure Page for Edit Incident Vehicle
	private static By EditIncidentClaimantTitle = By.xpath("//div[contains(@id,'NewExposureDV') and @role='group']//div[text()='Claimant' and @class='gw-label gw-boldLabel']");
	private static By EditIncidentClaimant      = By.xpath("//select[contains(@name,'Claimant_Picker')]");

	private static By EditIncident_IncidentOverviewTitle = By.xpath("//div[contains(@id,'NewExposureDV') and @role='group']//div[text()='Incident Overview']");
	private static By EditIncident_VehicleEditButton     = By.xpath("//div[contains(@id,'IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By EditIncident_VehicleNewIncident    = By.xpath("//div[contains(@id,'NewIncidentMenuItem')]//div[@role='menuitem']");
	private static By EditIncident_VehicleEditIncident   = By.xpath("//div[contains(@id,'EditIncidentMenuItem')]//div[@role='menuitem']");

	// Edit Vehicle Incident Page
	private static By EditVehicleIncidentHeader = By.xpath("//div[contains(@id,'IncidentScreen')]//div[@role='heading' and @class='gw-TitleBar--title']");
	private static By InvolvedVehicleTitle      = By.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Involved Vehicle']");

	private static By DriverOfInvolvedVehicleTitle = By.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Driver of Involved Vehicle']");
	private static By DriverName                   = By.xpath("//select[contains(@name,'VehicleIncidentDV-Driver_Picker')]");

	private static By LoanInformationTitle   = By.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Loan Information']");
	private static By ServicesToPerformTitle = By.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Services to Perform']");
	private static By DamageDescriptionTitle = By.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Damage Description']");
	private static By DamageDescription      = By.xpath("//textarea[contains(@name,'VehicleIncidentDV-Description')]");
	private static By DetailsTitle           = By.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Details']");
	private static By DetailsLossOccurred    = By.xpath("//select[contains(@name,'VehicleIncidentDV-LossOccured')]");

	private static By EditIncident_OkButton = By.xpath("//div[contains(@id,'IncidentScreen-Update')]//div[@role='button']");

	// New Exposure Page for New Incident Injury

	private static By NewIncident_InjuryIncidentOverviewTitle = By.xpath("//div[contains(@id,'NewExposureDV')]//div[text()='Injury Incident Overview']");
	private static By NewIncident_InjuryEditButton            = By.xpath("//div[contains(@id,'IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By NewIncident_InjuryNewIncident           = By.xpath("//div[contains(@id,'NewIncidentMenuItem')]//div[@role='menuitem']");

	// New Injury Incident Page
	private static By NewInjuryIncident_InjuryDetailsTitle = By.xpath("//div[contains(@id,'NewInjuryIncidentScreen-InjuryIncidentDV')]//div[text()='Injury Details']");
	private static By NewInjuryIncident_InjuredPerson      = By.xpath("//select[contains(@name,'InjuryIncidentDV-Injured_Picker')]");
	private static By NewInjuryIncident_LossParty          = By.xpath("//select[contains(@name,'InjuryIncidentInputSet-LossParty')]");
	private static By NewInjuryIncident_DescribeInjuries   = By.xpath("//div[contains(@id,'InjuryIncidentInputSet-InjuryDescription')]//textarea[contains(@name,'InjuryIncidentInputSet-InjuryDescription')]");
	private static By NewInjuryIncident_OkButton           = By.xpath("//div[contains(@id,'NewInjuryIncidentScreen-Update')]//div[@role='button']");

	// New Exposure Page for Edit Property
	private static By PropertyEdit_ClaimantTitle          = By.xpath("//div[contains(@id,'NewExposureDV-NewClaimPropertyDamageDV-4') and @role='group']//div[text()='Claimant']");
	private static By PropertyEdit_Claimant               = By.xpath("//select[contains(@name,'Claimant_Picker')]");
	private static By PropertyEdit_IncidentOverviewTitle  = By.xpath("//div[contains(@id,'NewExposureDV-NewClaimPropertyDamageDV') and @role='group']//div[text()='Incident Overview']");
	private static By PropertyEdit_PropertyNameEditButton = By.xpath("//div[contains(@id,'Incident-Property_IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By PropertyEdit_NewIncident            = By.xpath("//div[contains(@id,'NewClaimPropertyDamageDV_NewIncidentMenuItem')]//div[@role='menuitem']");

	// New Property Incident
	private static By NewPropertyIncident_DetailsTitle        = By.xpath("//div[contains(@id,'Vehicle_DetailsCardTab')]//div[text()='Details']");
	private static By NewPropertyIncident_DamageTitle         = By.xpath("//div[contains(@id,'FixedPropertyIncidentDV')]//div[text()='Damage']");
	private static By NewPropertyIncident_PropertyDescription = By.xpath("//div[contains(@id,'PropertyDescription')]//input[contains(@name,'PropertyDescription')]");
	private static By NewPropertyIncident_DamageDescription   = By.xpath("//div[contains(@id,'Description')]//textarea[contains(@name,'Description')]");
	private static By NewPropertyIncident_PropertyTitle       = By.xpath("//div[contains(@id,'FixedPropertyIncidentDV')]//div[text()='Property']");
	private static By NewPropertyIncident_Owner               = By.xpath("//select[contains(@name,'FixedPropertyIncidentDV-Owner')]");
	private static By NewPropertyIncident_PropertyName        = By.xpath("//select[contains(@name,'CCAddressInputSet-globalAddressContainer-Address_Picker')]");
	private static By NewPropertyIncident_State               = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	private static By NewPropertyIncident_OkButton            = By.xpath("//div[contains(@id,'NewFixedPropertyIncidentScreen-Update')]//div[@role='button']");

	// New Vehicle Incident
	private static By NewVehicleIncident_Header        = By.xpath("//div[contains(@id,'IncidentScreen')]//div[@class='gw-TitleBar--title']");
	private static By NewVehicleIncident_DetailsTitle  = By.xpath("//div[contains(@id,'Vehicle_DetailsCardTab')]//div[text()='Details']");
	private static By NewVehicleIncident_SelectVehicle = By.xpath("//select[contains(@name,'VehicleIncidentDV-Vehicle_Picker')]");
	private static By NewVehicleIncident_Year          = By.xpath("//input[contains(@name,'VehicleIncidentDV-Vehicle_Year')]");
	private static By NewVehicleIncident_Make          = By.xpath("//input[contains(@name,'VehicleIncidentDV-Vehicle_Make')]");
	private static By NewVehicleIncident_Model         = By.xpath("//input[contains(@name,'VehicleIncidentDV-Vehicle_Model')]");
	private static By Incident_OkButton                = By.xpath("//div[contains(@id,'IncidentScreen-Update')]//div[@role='button']");

	// New Exposure PIP
	private static By PIPNewExposure_ClaimantTitle               = By.xpath("//div[contains(@id,'NewExposureDV-NewPIPSummaryDV-4') and @role='group']//div[text()='Claimant']");
	private static By PIPNewExposure_Claimant                    = By.xpath("//select[contains(@name,'PIPDamages_Claimant')]");
	private static By PIPNewExposure_InjuryIncidentOverviewTitle = By.xpath("//div[contains(@id,'NewPIPSummaryDV-BIDamageInputSet') and @role='group']//div[text()='Injury Incident Overview']");
	private static By PIPNewExposure_InjuryEditButton            = By.xpath("//div[contains(@id,'Incident-Injury_IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By PIPNewExposure_InjuryNewIncident           = By.xpath("//div[contains(@id,'NewIncidentMenuItem')]//div[@role='menuitem']");

	// New Exposure Rental Car Loss of Use
	private static By NewExposureLocation = By.xpath("//select[contains(@name,'globalAddressContainer-Address_Picker')]");

	// Towing and labor Edit vehicle incident
	private static By TowingAndLabor_ClaimantTitle    = By.xpath("//div[contains(@id,'NewClaimTowOnlyDV-4') and @role='group']//div[text()='Claimant']");
	private static By TowingAndLabor_IncidentOverview = By.xpath("//div[contains(@id,'NewExposureDV-NewClaimTowOnlyDV') and @role='group']//div[text()='Incident Overview']");

	private static By Exposure_Header          = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Exposures')]");
	private static By Exposure_Vehicle         = By.xpath("//div[contains(@id,'ExposuresLV-0-Type')]//div[@class='gw-RangeValue']");
	private static By FirstPartyVehicle_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'1st Party Vehicle')]");

	private static By Edit_Button = By.xpath("//div[contains(@id,'Edit')]//div[@role='button']");

	private static By EditIncident_IncidentOverview = By.xpath("//div[contains(@id,'VehicleDamageDV-7') and @role='group']//div[text()='Incident Overview']");
	private static By IncidentOverview_button       = By.xpath("//div[contains(@id,'Incident-Vehicle_IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By NewIncident_Description       = By.xpath("//div[contains(@id,'Description_Input')]");
	private static By IncidentOverview_EditIncident = By.xpath("//div[@class='gw-action--inner gw-hasDivider']//div[@class='gw-label' and text()='Edit Incident Details...']");
	private static By VehicleIncident_Header        = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Vehicle Incident')]");

	private static By DriverofInvolvedVehicle = By.xpath("//div[contains(@id,'VehicleIncidentDV-3')]//div[@class='gw-label gw-boldLabel']");

	private static By Drivername          = By.xpath("//select[contains(@name,'Driver_Picker')]");
	private static By RelationToInsured   = By.xpath("//select[contains(@name,'RelationToInsured')]");
	private static By Damage_Description  = By.xpath("//div[contains(@id,'Description_Input')]//div[@class='gw-label gw-boldLabel']");
	private static By Damage_Text         = By.xpath("//div[contains(@id,'VehicleIncidentDV-Description')]//textarea[contains(@name,'VehicleIncidentDV-Description')]");
	private static By Details             = By.xpath("//div[contains(@id,'VehicleIncidentDV-10')]");
	private static By Details_lossoccured = By.xpath("//select[contains(@name,'LossOccured')]");
	private static By UptoExposures       = By.xpath("//div[@id='ExposureDetail-ExposureDetail_UpLink']");
	// div[@id='ExposureDetail-ExposureDetail_Up Link']

	private static By FirstPartyVehicle_Header2 = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'1st Party Vehicle')]");

	private static By Adjuster_Top = By.xpath("//div[contains(@id,'Adjuster')]//div[@class='gw-label gw-infoValue']");

	private static By Adjuster_InsideExposure = By.xpath("//div[contains(@id,'ExposuresLV-0-Assignee')]//div[@role='button']");
	private static By NewExposure             = By.xpath("//div[contains(@id,'NewExposureLV_tb-AddExposure')]//div[@role='button']");
	private static By ExposureOp1             = By.xpath("//div[contains(@id,'NewExposureLV_tb-AddExposure-0-item')]//div[@aria-haspopup='true']");
	private static By ExposureOp2             = By.xpath("//div[contains(@id,'AddExposure-0-item-0-item')]//div[@class='gw-label']");
	private static By Adjuster_Exposure       = By.xpath("//div[contains(@id,'ExposuresLV-0-Assignee')]//div[@role='button']");
	private static By Exposure1               = By.xpath("//div[contains(@id,'ClaimExposuresScreen-ExposuresLV-0-Type')]//div[@class='gw-link gw-label']");
	private static By ExposureEditButton      = By.xpath("//div[@id='ExposureDetail-ExposureDetailScreen-Edit']//div[@role='button']");

	/*
	 * NewExposure-MedPay
	 */
	private static By NewExposurMedPay_Header = By.xpath("//div[@id='NewExposure-NewExposureScreen-ttlBar']//div[@class='gw-TitleBar--title']");
	private static By NEMP_Claimant           = By.xpath("//select[contains(@name,'NewExposureDV-Claimant_Picker')]");

	/*
	 * Injury Incident Overview
	 */
	private static By Injury_Incident_Overview = By.xpath("//div[contains(@id,'Injury_IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By IIO_NewIncident          = By.xpath("//div[contains(@id,'NewIncidentMenuItem')]//div[@class='gw-label']");
	private static By II_LossParty             = By.xpath("//select[contains(@name,'InjuryIncidentInputSet-LossParty')]");

	public static void ChoosebyCoverageType_Exposure(String value) throws Throwable {
		switch (value) {
			case "C" :
				GuidewireAutomate("ChoosebyCoverageType_C", ChoosebyCoverageType_C, "moveToElement", " ");
				GuidewireAutomate_Validation("Collision", ChoosebyCoverageType_C_Collision, "isDisplayed", "");
				GuidewireAutomate_Validation("CollisionLimitedCoverage", ChoosebyCoverageType_C_CollisionLimitedCoverage, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("Comprehensive", ChoosebyCoverageType_C_Comprehensive, "isDisplayed", "Element is Displayed");
				break;
			case "D" :
				GuidewireAutomate("ChoosebyCoverageType_D", ChoosebyCoverageType_D, "moveToElement", " ");
				GuidewireAutomate_Validation("DeathandDisabilityBenefit", ChoosebyCoverageType_D_DeathandDisabilityBenefit, "isDisplayed", "Element is Displayed");
				break;
			case "E" :
				GuidewireAutomate("ChoosebyCoverageType_E", ChoosebyCoverageType_E, "moveToElement", " ");
				GuidewireAutomate_Validation("ElectronicEquipment", ChoosebyCoverageType_E_ElectronicEquipment, "isDisplayed", "Element is Displayed");
				break;
			case "L" :
				GuidewireAutomate("ChoosebyCoverageType_L", ChoosebyCoverageType_L, "moveToElement", " ");
				GuidewireAutomate_Validation("LiabilityBodilyInjury", ChoosebyCoverageType_L_LiabilityBodilyInjury, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("LiabilityPropertyDamagey", ChoosebyCoverageType_L_LiabilityPropertyDamagey, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("LiabilityVehicleDamage", ChoosebyCoverageType_L_LiabilityVehicleDamage, "isDisplayed", "Element is Displayed");
				break;
			case "M" :
				GuidewireAutomate("ChoosebyCoverageType_M", ChoosebyCoverageType_M, "moveToElement", " ");
				GuidewireAutomate("MexicoCoverageLimited", ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement", "");
				GuidewireAutomate_Validation("MexicoCovBI", ChoosebyCoverageType_M_MexicoCovBI, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("MexicoCovPD", ChoosebyCoverageType_M_MexicoCovPD, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("MexicoCovVehicleDamage", ChoosebyCoverageType_M_MexicoCovVehicleDamage, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("MexicoCovGenDamages", ChoosebyCoverageType_M_MexicoCovGenDamages, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("MedicalPayments", ChoosebyCoverageType_M_MedicalPayments, "isDisplayed", "Element is Displayed");
				break;
			case "P" :
				GuidewireAutomate("ChoosebyCoverageType_P", ChoosebyCoverageType_P, "moveToElement", " ");

				GuidewireAutomate_Validation("PIPArkansas", ChoosebyCoverageType_P_PIPArkansas, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPDelaware", ChoosebyCoverageType_P_PIPDelaware, "isDisplayed", "Element is Displayed");

				GuidewireAutomate_Validation("PIPDistrictofColumbia", ChoosebyCoverageType_P_PIPDistrictofColumbia, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPFlorida", ChoosebyCoverageType_P_PIPFlorida, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPHawaii", ChoosebyCoverageType_P_PIPHawaii, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPKansas", ChoosebyCoverageType_P_PIPKansas, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPKentucky", ChoosebyCoverageType_P_PIPKentucky, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPMaryland", ChoosebyCoverageType_P_PIPMaryland, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPMassachusetts", ChoosebyCoverageType_P_PIPMassachusetts, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPMichigan", ChoosebyCoverageType_P_PIPMichigan, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPMinnesota", ChoosebyCoverageType_P_PIPMinnesota, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPNewJersey", ChoosebyCoverageType_P_PIPNewJersey, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPNewYork", ChoosebyCoverageType_P_PIPNewYork, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPNorthDakota", ChoosebyCoverageType_P_PIPNorthDakota, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPOregon", ChoosebyCoverageType_P_PIPOregon, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPPennsylvanian", ChoosebyCoverageType_P_PIPPennsylvanian, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPTexas", ChoosebyCoverageType_P_PIPTexas, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPUtah", ChoosebyCoverageType_P_PIPUtah, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPWashington", ChoosebyCoverageType_P_PIPWashington, "isDisplayed", "Element is Displayed");

				break;

			case "R" :
				GuidewireAutomate("ChoosebyCoverageType_R", ChoosebyCoverageType_R, "moveToElement", " ");
				GuidewireAutomate_Validation("RentalCarLossofUse", ChoosebyCoverageType_R_RentalCarLossofUse, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("RentalReimbursement", ChoosebyCoverageType_R_RentalReimbursement, "isDisplayed", "Element is Displayed");
				break;
			case "T" :
				Thread.sleep(2000);
				GuidewireAutomate("ChoosebyCoverageType_T", ChoosebyCoverageType_T, "moveToElement", " ");
				GuidewireAutomate_Validation("TapeDiscMedia", ChoosebyCoverageType_T_TapeDiscMedia, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("TowingandLabor", ChoosebyCoverageType_T_TowingandLabor, "isDisplayed", "Element is Displayed");
				break;
			case "U" :
				GuidewireAutomate("ChoosebyCoverageType_U", ChoosebyCoverageType_U, "moveToElement", " ");
				GuidewireAutomate_Validation("UnderinsuredMotoristBodilyInjury", ChoosebyCoverageType_U_UnderinsuredMotoristBodilyInjury, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("UnderinsuredMotoristPropertyDamage", ChoosebyCoverageType_U_UnderinsuredMotoristPropertyDamage, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("UninsuredMotoristBodilyInjury", ChoosebyCoverageType_U_UninsuredMotoristBodilyInjury, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("UninsuredMotorisPropertyDamag", ChoosebyCoverageType_U_UninsuredMotorisPropertyDamage, "isDisplayed", "Element is Displayed");

				break;

		}

	}

	public static void ChoosebyCoverage_Collison() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");
		GuidewireAutomate("CBC_Vehicle", CBC_Vehicle, "moveToElement", " ");
		GuidewireAutomate("CBC_Vehicle", CBC_Vehicle_Collision, "click", " ");
		GuidewireAutomate_Validation("Screen Header", CBC_Vehicle_Header, "equals", "New Exposure - Vehicle");
		String insuredName = CC_Reusables.infoBar("InsuredName");
		GuidewireAutomate("Claimant", CBC_V_C_Claimant, "selectByVisibleText", insuredName);
		GuidewireAutomate("CBC_Vehicle", CBC_V_C_IncidentOverviewVehicle, "clickAndwait", " ");
		GuidewireAutomate("CBC_Vehicle", CBC_V_C_IncidentOverviewEditIncidentDetails, "clickAndwait", " ");
		GuidewireAutomate_Validation("Screen Header", CBC_VehicleIncident_Header, "equals", "Vehicle Incident");
		GuidewireAutomate("DamageDescription", CBC_VehicleIncident_DamageDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DamageDescription"));
		GuidewireAutomate("LossOccurred", CBC_VehicleIncident_LossOccurred, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossOccurred"));
		GuidewireAutomate("DriverName", CBC_VehicleIncident_DriverName, "selectByVisibleText", insuredName);
		GuidewireAutomate("Ok", Ok, "click", " ");
		GuidewireAutomate_Validation("Screen Header", CBC_Vehicle_Header, "equals", "New Exposure - Vehicle");
		GuidewireAutomate("Update_Button", Update_Button, "click", " ");
		GuidewireAutomate_Validation("Expsoure_Header", Expsoure_Header, "equals", "Exposures");

	}

	public static void Validateclaimexposure() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {

			GuidewireAutomate_Validation("FirstPartyVehicle", FirstPartyVehicle_Header, "contains", "(1) 1st Party Vehicle");
			GuidewireAutomate("Edit", Edit_Button, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate("NewIncident_Description", NewIncident_Description, "moveToElement", "NewIncident_Description");
			GuidewireAutomate_Validation("Description", NewIncident_Description, "equals", "Description");

			GuidewireAutomate("Section", EditIncident_IncidentOverview, "moveToElement", "Incident Overview");
			GuidewireAutomate_Validation("Section", EditIncident_IncidentOverview, "contains", "Incident Overview");
			GuidewireAutomate("IncidentOverviewbutton", IncidentOverview_button, "clickAndwait", "click");
			GuidewireAutomate("IncidentOverview_EditIncident", IncidentOverview_EditIncident, "clickAndwait", "click");

			GuidewireAutomate_Validation("ScreenHeader", VehicleIncident_Header, "contains", "Vehicle Incident");

			GuidewireAutomate("Section", DriverofInvolvedVehicle, "moveToElement", "Driver of InvolvedVehicle");
			GuidewireAutomate_Validation("Section", DriverofInvolvedVehicle, "equals", "Driver of Involved Vehicle");
			GuidewireAutomate("Drivername", Drivername, "selectByVisibleText", lhm_TestCase_Table_Data.get("DriverName"));
			GuidewireAutomate_Validation("RelationToInsured", RelationToInsured, "contains", "Self/Insured");

			GuidewireAutomate("Section", Damage_Description, "moveToElement", " Damage Description");
			GuidewireAutomate_Validation("Section", Damage_Description, "contains", "Damage Description");
			GuidewireAutomate("Damage Value", Damage_Text, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DamageDescription"));

			GuidewireAutomate("Section", Details, "moveToElement", "Details");
			GuidewireAutomate_Validation("Section", Details, "contains", "Details");
			GuidewireAutomate("Details_lossoccured", Details_lossoccured, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossOccurred"));

			GuidewireAutomate("Ok", Ok_Button, "clickAndwait", "click");
			GuidewireAutomate("Update", Update_Button, "clickAndwait", "click");
			Thread.sleep(2000);

			GuidewireAutomate("UptoExposures", UptoExposures, "clickAndwait", "click");

			GuidewireAutomate_Validation("Screen Header", ExposureHeader, "equals", "Exposures");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void AddingExposure(String Exposure) throws Throwable {
		switch (Exposure) {
			case "NewExposure" :
				// Adding NewExposure TowingandLabor
				CC_ChooseCoverage.NewExposureValidation();
				CC_ChooseCoverage.AllClaimant();
				CC_ChooseCoverage.VehicleNewIncident();
				CC_ChooseCoverage.Exposures_Validation();
				break;
			case "AddVehicleDescription" :
				ValidationResults_VehicleIncidentDescription();
				Validateclaimexposure();
				CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ValidationResults_NoValidationErrors();
				break;
			case "VehicleEditIncident_Rental" :
				// Adding NewExposure
				CC_ChooseCoverage.NewExposureValidation();
				CC_ChooseCoverage.AllClaimant();
				CC_ChooseCoverage.VehicleEditIncident();
				CC_ChooseCoverage.ValidationResults();
				break;
			case "VehicleEditIncident" :
				// Adding NewExposure TowingandLabor
				CC_ChooseCoverage.NewExposureValidation();
				CC_ChooseCoverage.AllClaimant();
				CC_ChooseCoverage.VehicleEditIncident();
				CC_ChooseCoverage.Exposures_Validation();
				break;
			case "VehicleNewIncident" :
				// Adding NewExposure TowingandLabor
				CC_ChooseCoverage.NewExposureValidation();
				CC_ChooseCoverage.AllClaimant();
				CC_ChooseCoverage.VehicleNewIncident();
				CC_ChooseCoverage.Exposures_Validation();
				break;
			case "VehicleEditIncident_Electronic" :
				// Adding NewExposure
				CC_ChooseCoverage.NewExposureValidation();
				CC_ChooseCoverage.AllClaimant();
				CC_ChooseCoverage.VehicleEditIncident();
				CC_ChooseCoverage.ValidationResults_ElectronicEquipment();
				break;
			case "InjuryNewIncident_AddBodyPart" :
				// Adding NewExposure
				CC_ChooseCoverage.NewExposureValidation();
				CC_ChooseCoverage.AllClaimant();
				CC_ChooseCoverage.InjuryNewIncident_AddBodyPart();
				CC_ChooseCoverage.Exposures_Validation();
				break;
			case "PropertyNewIncident" :
				CC_ChooseCoverage.NewExposureValidation();
				CC_ChooseCoverage.AllClaimant();
				CC_ChooseCoverage.PropertyNewIncident();
				CC_ChooseCoverage.Exposures_Validation();
				break;
			case "AddingExposureDescription" :
				// Adding NewExposure
				CC_ChooseCoverage.AllClaimant();
				CC_ChooseCoverage.AddDescription();
				CC_ChooseCoverage.Exposures_Validation();
				break;
			case "InjuryNewIncident_PIP" :
				// Adding NewExposure
				CC_ChooseCoverage.NewExposureValidation();
				CC_ChooseCoverage.PIPClaimant();
				CC_ChooseCoverage.InjuryNewIncident();
				CC_ChooseCoverage.Exposures_Validation();
				break;
		}
	}

	public static void ValidationResults_NoValidationErrors() throws Throwable {

		GuidewireAutomate_Validation("Validation Header", Validation_Header, "equals", "Validation Results");
		GuidewireAutomate_Validation("No Validation Error", NO_Error, "equals", "No Validation errors.");
		GuidewireAutomate("Clear", Clear_Button, "clickAndwait", "click");
		Thread.sleep(2000);

	}

	public static void ValidationResults_VehicleIncidentDescription() throws Throwable {
		GuidewireAutomate_Validation("Validation Header", Validation_Header, "equals", "Validation Results");
		GuidewireAutomate_Validation("Error Msg", Error_Msg, "equals", "Vehicle incident description must not be empty");
		GuidewireAutomate("Error Msg", Error_Msg, "clickAndwait", "click");
		GuidewireAutomate("Clear", Clear_Button, "clickAndwait", "click");
		Thread.sleep(2000);

	}

	/*
	 * Owner:Rahul Dixit
	 */
	public static void VerifyAdjustersExposuresPaula() throws Throwable {
		GuidewireAutomate_Validation("Adjuster Top Right", Adjuster_Top, "equals", "Stephen Perrella (US Political Risk & Trade Credit)");
		GuidewireAutomate_Validation("Adjuster Inside Exposure", Adjuster_InsideExposure, "equals", "Paula Zaander");

	}

	/*
	 * Owner:Rahul Dixit
	 */
	public static void Create_Exposure() throws Throwable {

		GuidewireAutomate("New Exposure", NewExposure, "clickAndwait", "click");
		GuidewireAutomate("Option", ExposureOp1, "moveToElement", "moveToElement");
		Thread.sleep(2000);
		GuidewireAutomate("Option2", ExposureOp2, "clickAndwait", "click");

	}
	/*
	 * Owner:Rahul Dixit
	 */
	public static void Verify_ExposureAssigment() throws Throwable {

		GuidewireAutomate_Validation(" Adjuster Top", Adjuster_Top, "equals", "Michael Uzenski (US Healthcare Casualty)");
		GuidewireAutomate_Validation("Validation Header", Adjuster_Exposure, "contains", "Michael Uzenski");

	}

	public static void newExposure() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		String insuredName = driver.findElement(By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']")).getText();

		String strDynamicXpath = lhm_TestCase_Table_Data.get("NewExposure");
		By     MedicalPayments = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item-2-item')]//div[@class='gw-label' and text()='" + strDynamicXpath + "']");

		GuidewireAutomate("Medical Payments", MedicalPayments, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", NewExposurMedPay_Header, "equals", "New Exposure - Med Pay");
		GuidewireAutomate("Claimant", NEMP_Claimant, "selectByVisibleText", insuredName);

		GuidewireAutomate(" Injury Incident Overview", Injury_Incident_Overview, "clickAndwait", "click");

		GuidewireAutomate("IIO NewIncident", IIO_NewIncident, "click", "click");
		GuidewireAutomate("Loss Party", II_LossParty, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossParty"));
		GuidewireAutomate("Ok", CC_Reusables.OK, "clickAndwait", "click");
		GuidewireAutomate("Update", CC_Reusables.ExposureUpdate_Button, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", Exposure_Header, "equals", "Exposures");

	}

	// Autor:Misba
	// Date:02/12/2021
	// Description:Coverage Type is Removed from the exposure
	public static void NewExposure_CoverageTypeIsRemoved() throws Throwable {

		try {

			By CoverageTypeIsRemoved = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Choose by Coverage']");

			VerifyElementNotExist("Choose by Coverage Type Is Removed", CoverageTypeIsRemoved);

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Autor:Misba
	// Date:02/12/2021
	// Description:Coverage Type is Removed from the exposure table in step 4 of 4 save and assign claim
	public static void CoverageTypeIsRemovedFormExposureTable() throws Throwable {

		try {

			By CoverageTypeIsRemovedFromExposureTable = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Choose by Coverage']");

			VerifyElementNotExist(" Step 4 of :4 Save and assign claim Choose by Coverage Type Is Removed from Exposure Table", CoverageTypeIsRemovedFromExposureTable);

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Autor:Misba
	// Date:03/12/2021
	// Description:segment field is hidden in exposure
	public static void NewExposure_SegmentFieldHiddenInExposure() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", ExposureHeader, "equals", "Exposures");
			GuidewireAutomate("Exposure", Exposure1, "clickAndwait", "click");
			GuidewireAutomate("Edit Button", ExposureEditButton, "clickAndwait", "click");
			Thread.sleep(1000);

			By SegmentFieldHiddenInExposure = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Choose by Coverage']");

			VerifyElementNotExist("segment field is hidden in exposure", SegmentFieldHiddenInExposure);

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void PolicyCoverageRemoved() throws Throwable {

		try {

			By PolicyCovergae = By.xpath("//div[@class='gw-label' and text()='PolicyCovergae']");

			VerifyElementNotExist("PolicyCovergae", PolicyCovergae);

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void NewExposureRemoved() throws Throwable {

		try {

			By NewExposure = By.xpath("//div[@class='gw-label' and text()='NewExposure']");

			VerifyElementNotExist("NewExposure", NewExposure);

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}

}
