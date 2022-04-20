package com.pages.Guidewire.ClaimsCenter;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Reporting_Utils;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_Reusables extends SeleniumWebDriver_Commands {

	public CC_Reusables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	/*
	 * 
	 */
	private static By GW_Username     = By.xpath("//input[contains(@name,'LoginDV-username')]");
	private static By GW_Password     = By.xpath("//input[contains(@name,'LoginDV-password')]");
	private static By GW_Login_Button = By.xpath("//div[@id='Login-LoginScreen-LoginDV-submit']//div");

	/*
	 * 
	 */
	private static By GW_ToolBar_Link = By.id("TabBar-UnsavedWorkTabBarLink");
	private static By GW_Setting_Link = By.id("gw-TabBarWidget--settings");
	private static By GW_Logout_Link  = By.id("TabBar-LogoutTabBarLink");

	/*
	 * ------------------------------------------------------------------------- ---- ClaimsCenter Tabs
	 * ------------------------------------------------------------------------- ----
	 */

	/*
	 * 
	 * Desktop Tab
	 */
	private static By Menu_ActionsCC = By.xpath("//div[contains(@id,'MenuActions')]/div[@role='button']");
	private static By AdminAction    = By.xpath("//div[contains(@id,'MenuActions')]//div[@class='gw-label gw-hasIcon']");

	private static By TabCC_Desktop                             = By.xpath("//div[@id='TabBar-DesktopTab']//div[@class='gw-label']");
	private static By TabCC_Desktop_dd                          = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	private static By TabCC_Desktop_Activities                  = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopActivities']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_Claims                      = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopClaims']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_NewClaims                   = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopNewClaims_Ext']//div[@role='menuitem']");
	private static By TabCC_Desktop_Exposures                   = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopExposures']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_Subrogations                = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopSubrogations']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_PendingAssignments          = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopAwaitingAssignment']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_Queues                      = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopQueuedActivities']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_Calendar                    = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_DesktopCalendarGroup']//div[@class='gw-label gw-hasIcon']");
	private static By TabCC_Desktop_Calendar_MyCalendar         = By.xpath("//div[contains(@id,'DesktopCalendarGroup_Calendar')]//div[@class='gw-action--inner gw-hasDivider']");
	private static By TabCC_Desktop_Calendar_SupervisorCalendar = By.xpath("//div[contains(@id,'DesktopCalendarGroup_SupervisorCalendar')]//div[@class='gw-action--inner gw-hasDivider']");
	private static By TabCC_Desktop_BulkInvoices                = By.xpath("//div[@id='TabBar-DesktopTab-Desktop_BulkPay']//div[@class='gw-label gw-hasIcon']");

	private static By MenuCC_Desktop_Actions_Statistics     = By.xpath("//div[@id='Desktop-DesktopMenuActions-DesktopMenuActions_Statistics']//div[@class='gw-label']");
	private static By MenuCC_Desktop_Actions_Preferences    = By.xpath("//div[@id='Desktop-DesktopMenuActions-DesktopMenuActions_Preferences']//div[@class='gw-label']");
	private static By MenuCC_Desktop_Actions_VacationStatus = By.xpath("//div[@id='Desktop-DesktopMenuActions-DesktopMenuActions_UserVacation']//div[@class='gw-label']");
	private static By MenuCC_Desktop_BulkInvoices           = By.xpath("//div[@id='Desktop-MenuLinks-Desktop_BulkPay']");

	/*
	 * Claims Tab
	 */
	private static By TabCC_Claim                                       = By.xpath("//div[@id='TabBar-ClaimTab']//div[@class='gw-label']");
	private static By TabCC_Claim_dd                                    = By.xpath("//div[@id='TabBar-ClaimTab']//div[3]");
	private static By TabCC_Claim_NewClaim                              = By.xpath("//div[@id='TabBar-ClaimTab-ClaimTab_FNOLWizard']//div[@class='gw-label']");
	private static By TabCC_Claim_ClaimNumber                           = By.xpath("//input[@name='TabBar-ClaimTab-ClaimTab_FindClaim']");
	private static By TabCC_Claim_ClaimNumber_Search                    = By.xpath("//div[@id='TabBar-ClaimTab-ClaimTab_FindClaim_Button']//span");
	private static By Washington                                        = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-1-item')]//div[@class='gw-label' and text()='1:444 South Washington']");
	private static By OPtion1                                           = By.xpath("//div[contains(@id,'-0-item-0-item')]//div[@class='gw-label']");
	private static By MenuCC_Claim_Actions_ExcessCasualty               = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-1-item')]//div[@class='gw-label' and text()='Excess Casualty (follow form)'] ");
	private static By MenuCC_Claim_Actions_ExcessCasualty_GeneralDamage = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-1-item-1-item')]//div[@class='gw-label' and text()='Excess Casualty - General Damage'] ");

	/*
	 * New
	 */
	private static By MenuCC_Claim_Actions_NewNote         = By.xpath("//div[contains(@id,'ClaimMenuActions_NewNote')]//div[@class='gw-label']");
	private static By MenuCC_Claim_Actions_New_Email       = By.xpath("//div[contains(@id,'ClaimMenuActions_NewEmail')]//div[@class='gw-label']");
	private static By MenuCC_Claim_Actions_New_Matter      = By.xpath("//div[contains(@id,'ClaimMenuActions_NewMatter')]//div[@class='gw-label']");
	private static By MenuCC_Claim_Actions_New_Evaluation  = By.xpath("//div[contains(@id,'ClaimMenuActions_NewEvaluation')]//div[@class='gw-label']");
	private static By MenuCC_Claim_Actions_New_Negotiation = By.xpath("//div[contains(@id,'ClaimMenuActions_NewNegotiation')]//div[@class='gw-label']");
	private static By MenuCC_Claim_Actions_New_Service     = By.xpath("//div[contains(@id,'ClaimMenuActions_NewServiceRequest')]//div[@class='gw-label']");
	private static By MenuCC_Claim_Actions_Email           = By.xpath("//div[contains(@id,'ClaimMenuActions_Email')]//div[text()='Email']");
	private static By MenuCC_Claim_Actions_Matter          = By.xpath("//div[contains(@id,'ClaimMenuActions_NewMatter')]");
	// Administration Action
	private static By MenuCC_AdminActionNewGroup = By.xpath("//div[contains(@id,'AdminMenuActions_NewGroup')]//div[@class='gw-label']");
	/*
	 * New Transaction
	 */
	private static By MenuCC_Claim_Actions_NewTransaction_Reserve               = By.xpath("//div[contains(@id,'ClaimMenuActions_NewTransaction_ReserveSet')]//div[@class='gw-label']");
	private static By MenuCC_Claim_Actions_NewTransaction_Check                 = By.xpath("//div[contains(@id,'ClaimMenuActions_NewTransaction_CheckSet')]//div[@class='gw-label']");
	private static By MenuCC_Claim_Actions_NewTransaction_Other                 = By.xpath("//div[@id='Claim-ClaimMenuActions-ClaimMenuActions_NewTransaction-ClaimMenuActions_NewOtherTrans']");
	private static By MenuCC_Claim_Actions_NewTransaction_Other_ManualCheck     = By.xpath("//div[contains(@id,'NewTransaction_Check')]//div[text()='Manual Check']");
	private static By MenuCC_Claim_Actions_NewTransaction_Other_Recovery        = By.xpath("//div[contains(@id,'NewTransaction_RecoverySet')]//div[text()='Recovery']");
	private static By MenuCC_Claim_Actions_NewTransaction_Other_RecoveryReserve = By.xpath("//div[contains(@id,'ClaimMenuActions_NewTransaction_RecoveryReserveSet')]//div[text()='Recovery Reserve']");

	private static By PolicyDetails = By.xpath("//div[contains(@id,'PolicyDetails')]//div[@class='gw-label' and text()='Policy Details']");

	/*
	 * New Document
	 */
	private static By MenuCC_Claim_Actions_NewDocument_Createfromatemplate          = By.xpath("//div[contains(@id,'ClaimNewDocumentMenuItemSet_Create')]//div[@class='gw-label']");
	private static By MenuCC_Claim_Actions_NewDocument_UploadDocuments              = By.xpath("//div[contains(@id,'ClaimNewDocumentMenuItemSet_Link')]//div[@class='gw-label']");
	private static By MenuCC_Claim_Actions_NewDocument_Indicateexistenceofadocument = By.xpath("//div[contains(@id,'ClaimNewDocumentMenuItemSet_IndicateExists')]//div[@class='gw-label']");
	/*
	 * New Activity
	 */
	private static By MenuCC_Claim_Actions_NewActivity_Correspondence                                       = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='Correspondence']");
	private static By MenuCC_Claim_Actions_NewActivity_Correspondence_SendclaimAcknowledgementLetter        = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Send claim acknowledgement letter']");
	private static By MenuCC_Claim_Actions_NewActivity_Correspondence_SendLetterConfirmingClosureOfExposure = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Send letter confirming closure of exposure']");
	private static By MenuCC_Claim_Actions_NewActivity_Correspondence_SendReservationOfRightsLetter         = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Send reservation of rights letter']");

	private static By MenuCC_Claim_Actions_NewActivity_Interview                               = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='Interview']");
	private static By MenuCC_Claim_Actions_NewActivity_Interview_GetAStatementFromWitness      = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Get a statement from witness']");
	private static By MenuCC_Claim_Actions_NewActivity_Interview_MakeInitialContactWithInsured = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Make initial contact with insured']");

	private static By MenuCC_Claim_Actions_NewActivity_NewMail                       = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='New Mail']");
	private static By MenuCC_Claim_Actions_NewActivity_NewMail_ReviewNewBillReceived = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Review new bill received']");
	private static By MenuCC_Claim_Actions_NewActivity_NewMail_ReviewNewMail         = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Review new mail']");

	private static By MenuCC_Claim_Actions_NewActivity_Reminder            = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='Reminder']");
	private static By MenuCC_Claim_Actions_NewActivity_Reminder_30DayDiary = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='30 day diary']");
	private static By MenuCC_Claim_Actions_NewActivity_Reminder_60DayDiary = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='60 day diary']");
	private static By MenuCC_Claim_Actions_NewActivity_Reminder_90DayDiary = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='90 day diary']");

	private static By MenuCC_Claim_Actions_NewActivity_Request                                  = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='Request']");
	private static By MenuCC_Claim_Actions_NewActivity_Request_AdditionalLivingExpensesRequired = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Additional living expenses required']");
	private static By MenuCC_Claim_Actions_NewActivity_Request_CreateRecoveryEmailBill1         = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Create Recovery email bill1']");
	private static By MenuCC_Claim_Actions_NewActivity_Request_CreateRecoveryEmailBill2         = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[text()='Create Recovery email bill2']");

	private static By MenuCC_Claim_Actions_NewActivity_Warning                                    = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='Warning']");
	private static By MenuCC_Claim_Actions_NewActivity_Warning_UnableToCloseTheClaimOrTheExposure = By.xpath("//div[contains(@id,'NewActivityMenuItemSet_Category')]//div[@class='gw-label' and text()='Unable to close the claim or the exposure']");
	/*
	 * New Exposure
	 */
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType                            = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Choose by Coverage Type']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C                          = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='C']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_Collision                = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Collision']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_CollisionLimitedCoverage = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Collision - Limited Coverage']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_Comprehensive            = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Comprehensive']");

	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_D                           = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='D']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_D_DeathAndDisabilityBenefit = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Death and Disability Benefit']");

	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_E                     = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='E']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_E_ElectronicEquipment = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Electronic Equipment']");

	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L                         = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='L']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityBodilyInjury   = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Liability - Bodily Injury']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityPropertyDamage = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Liability - Property Damage']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityVehicleDamage  = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Liability - Vehicle Damage']");

	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M                                              = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='M']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited                        = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Mexico Coverage - Limited']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovBI            = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Mexico Cov - BI']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovPD            = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Mexico Cov - PD']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovVehicleDamage = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Mexico Cov - Vehicle Damage']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovGenDamages    = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Mexico Cov - Gen. Damages']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MedicalPayments                              = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Medical Payments']");

	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P                             = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='P']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPArkansas                 = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Arkansas']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPDelaware                 = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Delaware']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPDistrictOfColumbia       = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - District of Columbia']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPFlorida                  = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Florida']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPHawaii                   = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Hawaii']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPKansas                   = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Kansas']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPKentucky                 = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Kentucky']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMaryland                 = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Maryland']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMassachusetts            = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Massachusetts']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMichigan                 = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Michigan']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMinnesota                = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Minnesota']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNewJersey                = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - New Jersey']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNewYork                  = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - New York']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNorthDakota              = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - North Dakota']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPOregon                   = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Oregon']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPPennsylvania             = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Pennsylvania']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPTexas                    = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Texas']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPUtah                     = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Utah']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPWashington               = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='PIP - Washington']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PropertyProtectionInsurance = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Property Protection Insurance']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R                             = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='R']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R_RentalCarLossOfUse          = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Rental Car Loss of Use']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R_RentalReimbursement         = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Rental Reimbursement']");

	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T                = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='T']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T_TapeDiscMedia  = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Tape / Disc Media']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T_TowingAndLabor = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Towing and Labor']");

	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U                                    = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='U']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UnderinsuredMotoristBodilyInjury   = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Underinsured Motorist - Bodily Injury']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UnderinsuredMotoristPropertyDamage = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Underinsured Motorist - Property Damage']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UninsuredMotoristBodilyInjury      = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Uninsured Motorist - Bodily Injury']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UninsuredMotoristPropertyDamage    = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverageType')]//div[@class='gw-label' and text()='Uninsured Motorist - Property Damage']");

	// Policy level coverage - insured party
	private static By MenuCC_Claim_Actions_NewExposure_PolicyLevelCoverage_Insured = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0')]//div[contains(text(),'Insured Party')]");

	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage                                                                                    = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Choose by Coverage']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage                                                                = By.xpath("//div[@class='gw-label' and text()='Policy Level Coverage']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage                         = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Liability - Bodily Injury and Property Damage']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityBodilyInjury   = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Liability - Bodily Injury']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityPropertyDamage = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Liability - Property Damage']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityVehicleDamage  = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Liability - Vehicle Damage']");

	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited                        = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Mexico Coverage - Limited']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovBI            = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Mexico Cov - BI']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovPD            = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Mexico Cov - PD']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovVehicleDamage = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Mexico Cov - Vehicle Damage']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovGenDamages    = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Mexico Cov - Gen. Damages']");

	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MedicalPayments                    = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Medical Payments']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UninsuredMotoristBodilyInjury      = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Uninsured Motorist - Bodily Injury']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UninsuredMotoristPropertyDamage    = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Uninsured Motorist - Property Damage']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UnderinsuredMotoristPropertyDamage = By
			.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage-0-item')]//div[@class='gw-label' and text()='Underinsured Motorist - Property Damage']");
	/*
	 * Claim Actions
	 */

	private static By MenuCC_Claim_Actions_ClaimActions_AssignClaim = By.xpath("//div[contains(@id,'ClaimActions-ClaimMenuActions_Assign')]//div[@class='gw-label' and text()='Assign Claim']");
	// Divya
	private static By MenuCC_Claim_Actions_ClaimActions_ReopenClaim                                 = By.xpath("//div[contains(@id,'ClaimMenuActions_ReopenClaim')]/div[@role='menuitem']");
	private static By MenuCC_Claim_Actions_ClaimActions_CloseClaim                                  = By.xpath("//div[contains(@id,'ClaimActions-ClaimMenuActions_CloseClaim')]/div[@role='menuitem']");
	private static By MenuCC_Claim_Actions_ClaimActions_PrintClaim                                  = By.xpath("//div[contains(@id,'ClaimActions-ClaimMenuActions_Print')]//div[@class='gw-label' and text()='Print Claim']");
	private static By MenuCC_Claim_Actions_ClaimActions_SyncStatus                                  = By.xpath("//div[contains(@id,'ClaimActions-ClaimMenuActions_SyncStatus')]//div[@class='gw-label' and text()='Sync Status']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly                           = By.xpath("//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimValidation')]//div[@class='gw-label' and text()='Validate Claim Only']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_LoadAndSave               = By.xpath("//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimValidation')]//div[@class='gw-label' and text()='Load and save']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_NewLossCompletion         = By.xpath("//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimValidation')]//div[@class='gw-label' and text()='New loss completion']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_ValidForISO               = By.xpath("//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimValidation')]//div[@class='gw-label' and text()='Valid for ISO']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_SendToExternalSystem      = By.xpath("//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimValidation')]//div[@class='gw-label' and text()='Send to external system']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_AbilityToPay              = By.xpath("//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimValidation')]//div[@class='gw-label' and text()='Ability to pay']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures                      = By
			.xpath("//div[contains(@id,'ClaimActions-ClaimMenuActions_ClaimExposureValidation')]//div[@class='gw-label' and text()='Validate Claim + Exposures']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_LoadAndSave          = By.xpath("//div[contains(@id,'ClaimMenuActions_ClaimExposureValidation')]//div[@class='gw-label' and text()='Load and save']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_NewLossCompletion    = By.xpath("//div[contains(@id,'ClaimMenuActions_ClaimExposureValidation')]//div[@class='gw-label' and text()='New loss completion']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_ValidForISO          = By.xpath("//div[contains(@id,'ClaimMenuActions_ClaimExposureValidation')]//div[@class='gw-label' and text()='Valid for ISO']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_SendToExternalSystem = By.xpath("//div[contains(@id,'ClaimMenuActions_ClaimExposureValidation')]//div[@class='gw-label' and text()='Send to external system']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_AbilityToPay         = By.xpath("//div[contains(@id,'ClaimMenuActions_ClaimExposureValidation')]//div[@class='gw-label' and text()='Ability to pay']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidatePolicy                              = By.xpath("//div[contains(@id,'ClaimActions-ClaimMenuActions_PolicyValidation')]//div[@class='gw-label' and text()='Validate Policy']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_LoadAndSave                  = By.xpath("//div[contains(@id,'ClaimMenuActions_PolicyValidation')]//div[@class='gw-label' and text()='Load and save']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_NewLossCompletion            = By.xpath("//div[contains(@id,'ClaimMenuActions_PolicyValidation')]//div[@class='gw-label' and text()='New loss completion']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_ValidForISO                  = By.xpath("//div[contains(@id,'ClaimMenuActions_PolicyValidation')]//div[@class='gw-label' and text()='Valid for ISO']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_SendToExternalSystem         = By.xpath("//div[contains(@id,'ClaimMenuActions_PolicyValidation')]//div[@class='gw-label' and text()='Send to external system']");
	private static By MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_AbilityToPay                 = By.xpath("//div[contains(@id,'ClaimMenuActions_PolicyValidation')]//div[@class='gw-label' and text()='Ability to pay']");

	/*
	 * Claim MenuLinks
	 */
	private static By MenuCC_Claim_Summary                                 = By.xpath("//div[contains(@id,'ClaimSummaryGroup')]//div[@class='gw-label gw-hasIcon' and text()='Summary']");
	private static By MenuCC_Claim_Summary_Overview                        = By.xpath("//div[contains(@id,'ClaimSummaryGroup_ClaimSummary')]//div[@class='gw-label' and text()='Overview']");
	private static By MenuCC_Claim_Summary_Status                          = By.xpath("//div[contains(@id,'ClaimSummaryGroup_ClaimStatus')]//div[@class='gw-label' and text()='Status']");
	private static By MenuCC_Claim_Summary_HealthMetrics                   = By.xpath("//div[contains(@id,'ClaimSummaryGroup_ClaimKeyMetrics')]//div[@class='gw-label' and text()='Health Metrics']");
	private static By MenuCC_Claim_Workplan                                = By.xpath("//div[contains(@id,'Claim_ClaimWorkplan')]//div[@class='gw-label gw-hasIcon' and text()='Workplan']");
	private static By MenuCC_Claim_LossDetails                             = By.xpath("//div[contains(@id,'Claim_ClaimLossDetailsGroup')]//div[@class='gw-label gw-hasIcon' and text()='Loss Details']");
	private static By MenuCC_Claim_LossDetails_General                     = By.xpath("//div[contains(@id,'ClaimLossDetailsGroup_ClaimLossDetails')]//div[@class='gw-label' and text()='General']");
	private static By MenuCC_Claim_LossDetails_Asociations                 = By.xpath("//div[contains(@id,'ClaimLossDetailsGroup_ClaimAssociations')]//div[@class='gw-label']");
	private static By MenuCC_Claim_LossDetails_SpecialInvestigationDetails = By.xpath("//div[contains(@id,'ClaimLossDetailsGroup_SIDetails')]//div[@class='gw-label' and text()='Special I']");
	private static By MenuCC_Claim_MedicalDetails                          = By.xpath("//div[@id='Claim-MenuLinks-0-Claim_TopLevelExposureDetail']//div[@class='gw-action--inner']");
	private static By MenuCC_Claim_Indemnity                               = By.xpath("//div[@id='Claim-MenuLinks-1-Claim_TopLevelExposureDetail']//div[@class='gw-action--inner']");
	private static By MenuCC_Claim_Exposures                               = By.xpath("//div[contains(@id,'Claim_ClaimExposures')]//div[@class='gw-label gw-hasIcon' and text()='Exposures']");
	private static By MenuCC_Claim_Reinsurance                             = By.xpath("//div[contains(@id,'Claim_ReinsuranceSummary')]//div[@class='gw-label gw-hasIcon' and text()='Reinsurance']");
	private static By MenuCC_Claim_PartiesInvolved                         = By.xpath("//div[@id='Claim-MenuLinks-Claim_ClaimPartiesGroup']//div[@role='menuitem']//div[@class='gw-label gw-hasIcon' and text()='Parties Involved']");
	private static By MenuCC_Claim_PartiesInvolved_Contacts                = By.xpath("//div[contains(@id,'ClaimPartiesGroup_ClaimContacts')]/div[@role='menuitem']");
	private static By MenuCC_Claim_PartiesInvolved_Users                   = By.xpath("//div[contains(@id,'ClaimPartiesGroup_ClaimUsers')]/div[@role='menuitem']");
	private static By MenuCC_Claim_Policy                                  = By.xpath("//div[contains(@id,'Claim_ClaimPolicyGroup')]//div[@class='gw-label gw-hasIcon' and text()='Policy']");
	private static By MenuCC_Policy_General                                = By.xpath("//div[contains(@id,'ClaimPolicyGroup_ClaimPolicyGeneral')]//div[@class='gw-label']");
	private static By MenuCC_Policy_LocationClass                          = By.xpath("//div[contains(@id,'ClaimPolicyGroup_ClaimPolicyLocations')]//div[@class='gw-label']");
	private static By MenuCC_Claim_Policy_General                          = By.xpath("//div[contains(@id,'PolicyGeneral')]/div[@role='menuitem']");
	private static By MenuCC_Claim_PolicyGeneral                           = By.xpath("//div[contains(@id,'PolicyGeneral')]/div[@role='menuitem']");

	private static By MenuCC_Claim_Policy_Vehicle                = By.xpath("//div[contains(@id,'Claim_ClaimPolicyGroup')]//div[@class='gw-label gw-hasIcon' and text()='Policy']");
	private static By MenuCC_Claim_Policy_Endorsements           = By.xpath("//div[contains(@id,'Claim_ClaimPolicyGroup')]//div[@class='gw-label gw-hasIcon' and text()='Policy']");
	private static By MenuCC_Claim_Policy_AggregateLimits        = By.xpath("//div[contains(@id,'ClaimPolicyAggregateLimits')]//div[@role='menuitem']");
	private static By MenuCC_Claim_Financials                    = By.xpath("//div[contains(@id,'Claim_ClaimFinancialsGroup')]//div[@class='gw-label gw-hasIcon' and text()='Financials']");
	private static By MenuCC_Claim_Financials_Summary            = By.xpath("//div[contains(@id,'ClaimFinancialsSummary')]//div[@role='menuitem' and @class='gw-action--inner']");
	private static By MenuCC_Claim_Financials_Transactions       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactions')]//div[@role='menuitem' and @class='gw-action--inner']");
	private static By MenuCC_Claim_Financials_Checks             = By.xpath("//div[contains(@id,'ClaimFinancialsChecks')]//div[@role='menuitem' and @class='gw-action--inner']");
	private static By MenuCC_Claim_Notes                         = By.xpath("//div[contains(@id,'Claim_ClaimNotes')]//div[@class='gw-label gw-hasIcon' and text()='Notes']");
	private static By MenuCC_Claim_Documents                     = By.xpath("//div[contains(@id,'Claim_ClaimDocuments')]//div[@class='gw-label gw-hasIcon' and text()='Documents']");
	private static By MenuCC_Claim_PlanofAction                  = By.xpath("//div[contains(@id,'Claim_ClaimPlanOfActionGroup')]//div[@class='gw-label gw-hasIcon' and text()='Plan of Action']");
	private static By MenuCC_Claim_PlanofAction_Evaluations      = By.xpath("//div[contains(@id,'ClaimEvaluations')]//div[@class='gw-action--inner' and @role='menuitem']");
	private static By MenuCC_Claim_PlanofAction_Negotiations     = By.xpath("//div[contains(@id,'ClaimNegotiations')]//div[@class='gw-action--inner' and @role='menuitem']");
	private static By MenuCC_Claim_Services                      = By.xpath("//div[contains(@id,'Claim_ClaimServiceRequests')]//div[@class='gw-label gw-hasIcon' and text()='Services']");
	private static By MenuCC_Claim_Litigation                    = By.xpath("//div[contains(@id,'Claim_ClaimMatters')]//div[@class='gw-label gw-hasIcon' and text()='Litigation']");
	private static By MenuCC_Claim_History                       = By.xpath("//div[contains(@id,'Claim_ClaimHistory')]//div[@class='gw-label gw-hasIcon' and text()='History']");
	private static By MenuCC_Claim_FNOLSnapshot                  = By.xpath("//div[contains(@id,'Claim_ClaimSnapshotGroup')]//div[@class='gw-label gw-hasIcon' and text()='FNOL Snapshot']");
	private static By MenuCC_Claim_FNOLSnapshot_LossDetials      = By.xpath("//div[contains(@id,'ClaimSnapshotLossDetails')]//div[@role='menuitem' and @class='gw-action--inner']");
	private static By MenuCC_Claim_FNOLSnapshot_PartiesInvolced  = By.xpath("//div[contains(@id,'ClaimSnapshotPartiesInvolved')]//div[@role='menuitem' and @class='gw-action--inner']");
	private static By MenuCC_Claim_FNOLSnapshot_Policy           = By.xpath("//div[contains(@id,'ClaimSnapshotPolicy')]//div[@role='menuitem' and @class='gw-action--inner']");
	private static By MenuCC_Claim_FNOLSnapshot_Exposure         = By.xpath("//div[contains(@id,'ClaimSnapshotExposures')]//div[@role='menuitem' and @class='gw-action--inner']");
	private static By MenuCC_Claim_FNOLSnapshot_Notes            = By.xpath("//div[contains(@id,'ClaimSnapshotNotes')]//div[@role='menuitem' and @class='gw-action--inner']");
	private static By MenuCC_Claim_FNOLSnapshot_Document         = By.xpath("//div[contains(@id,'ClaimSnapshotDocuments')]//div[@role='menuitem' and @class='gw-action--inner']");
	private static By MenuCC_Claim_FNOLSnapshot_AdditionalFileds = By.xpath("//div[contains(@id,'ClaimSnapshotExtraFields')]//div[@role='menuitem' and @class='gw-action--inner']");
	private static By MenuCC_Claim_Calendar                      = By.xpath("//div[contains(@id,'Claim_ClaimCalendarGroup')]//div[@class='gw-label gw-hasIcon']");
	private static By MenuCC_Claim_Calendar_MyCalender           = By.xpath("//div[contains(@id,'ClaimCalendarGroup_ClaimCalendar')]//div[@class='gw-action--inner']");
	private static By MenuCC_Claim_Calendar_SupervisorCalender   = By.xpath("//div[contains(@id,'ClaimCalendarGroup_SupervisorClaimCalendar')]//div[@class='gw-action--inner']");

	/*
	 * Search Tab
	 */
	private static By TabCC_Search        = By.xpath("//div[@id='TabBar-SearchTab']//div[@class='gw-label' and text()='Searc']");
	private static By TabCC_Search_dd     = By.xpath("//div[@id='TabBar-SearchTab']/div[3]");
	private static By TabCC_Search_Claims = By.xpath("//div[@id='TabBar-SearchTab-Search_ClaimSearchesGroup']//div[@class='gw-label']");

	private static By TabCC_Search_Claims_SimpleSearch = By.xpath("//div[@id='TabBar-SearchTab-Search_ClaimSearchesGroup-ClaimSearchesGroup_SimpleClaimSearch']//div[@class='gw-label']");

	private static By TabCC_Search_Claims_AdvancedSearch = By.xpath("//div[@id='TabBar-SearchTab-Search_ClaimSearchesGroup-ClaimSearchesGroup_ClaimSearch']//div[@class='gw-label']");

	private static By TabCC_Search_Activities   = By.xpath("//div[@id='TabBar-SearchTab-Search_ActivitySearch']//div[@class='gw-label']");
	private static By TabCC_Search_Checks       = By.xpath("//div[@id='TabBar-SearchTab-Search_PaymentSearch']//div[@class='gw-label']");
	private static By TabCC_Search_Recoveries   = By.xpath("//div[@id='TabBar-SearchTab-Search_RecoverySearch']//div[@class='gw-label']");
	private static By TabCC_Search_BulkInvoices = By.xpath("//div[@id='TabBar-SearchTab-Search_BulkInvoiceSearch']//div[@class='gw-label']");

	/*
	 * Team Tab - SubMenu
	 */

	private static By TabCC_Team = By.xpath("//div[@id='TabBar-TeamTab']//div[@class='gw-label']");

	/*
	 * AdministrationTab Tab - SubMenu
	 */
	private static By TabCC_Administration                    = By.xpath("//div[@id='TabBar-AdminTab']/div[@role='menuitem']");
	private static By TabCC_Adminsitration_dd                 = By.xpath("//div[@id='TabBar-AdminTab']//div[@class='gw-action--expand-button']");
	private static By TabCC_Adminsitration_PrintUserGroupTree = By.xpath("//div[@id='TabBar-AdminTab-AdminTab_PrintUserGroupTree']//div[@role='menuitem']");

	/*
	 * Unsaved Work
	 */
	private static By UnsavedWork = By.xpath("//div[@id='TabBar-UnsavedWorkTabBarLink']");
	// User And Security SubMenu

	private static By MenuCC_Administration_UsersAndSecurity       = By.xpath("//div[@id='Admin-MenuLinks-Admin_UsersAndSecurity']//div[@class='gw-action--expand-button']");
	private static By MenuCC_UserAndSecurity_Users                 = By.xpath("//div[contains(@id,'UsersAndSecurity_AdminUserSearchPage')]//div[@role='menuitem']");
	private static By MenuCC_UserAndSecurity_Groups                = By.xpath("//div[contains(@id,'UsersAndSecurity_AdminGroupSearchPage')]//div[@role='menuitem']");
	private static By MenuCC_UserAndSecurity_Roles                 = By.xpath("//div[contains(@id,'UsersAndSecurity_Roles')]//div[@role='menuitem']");
	private static By MenuCC_UserAndSecurity_Regions               = By.xpath("//div[contains(@id,'UsersAndSecurity_Regions')]//div[@role='menuitem']");
	private static By MenuCC_UserAndSecurity_SecurityZones         = By.xpath("//div[contains(@id,'UsersAndSecurity_SecurityZones')]//div[@role='menuitem']");
	private static By MenuCC_UserAndSecurity_AuthorityLimitProfile = By.xpath("//div[contains(@id,'UsersAndSecurity_AuthorityLimitProfiles')]//div[@role='menuitem']");
	private static By MenuCC_UserAndSecurity_Attributes            = By.xpath("//div[contains(@id,'UsersAndSecurity_Attributes')]//div[@role='menuitem']");

	// Special Handling
	private static By MenuCC_Administration_SpecialHandling = By.xpath("//div[@id='TabBar-AdminTab-Admin_Monitoring']/div[@class='gw-action--expand-button']");
	private static By MenuCC_SpecialHandling_Accounts       = By.xpath("//div[contains(@id,'SpecialHandling_AccountAdmin')]/div[@role='menuitem']");
	private static By MenuCC_SpecialHandling_ServiceTiers   = By.xpath("//div[contains(@id,'SpecialHandling_CustomerServiceTierAdmin')]/div[@role='menuitem']");

	// Business Settings
	private static By MenuCC_Administration_BusinessSettings = By.xpath("//div[contains(@id,'Admin-MenuLinks-Admin_BusinessSettings')]//div[@class='gw-label' and text()='Business Settings']");
	private static By MenuCC_BusinessSettings_Expand         = By.xpath("//div[@id='Admin-MenuLinks-Admin_BusinessSettings']/div[@class='gw-action--expand-button']");
	private static By MenuCC_BusinessSetting_BusinessRules   = By.xpath("//div[contains(@id,'BusinessSettings_BusinessRules')]//div[@role='menuitem']//div[@class='gw-label' and text()='Business Rules']");
	/* Business Rules SubMenu */
	private static By MenuCC_BusinessSettings_BusinessRules                    = By.xpath("//div[contains(@id,'BusinessSettings_BusinessRules')]/div[@class='gw-action--expand-button']");
	private static By MenuCC_BusinessSettings_BusinessRules_ActvityRules       = By.xpath("//div[contains(@id,'BusinessRules_ActivityRules')]/div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_BusinessRules_ExposureRules      = By.xpath("//div[contains(@id,'BusinessRules_ExposureRules')]/div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_BusinessRules_ReserveRules       = By.xpath("//div[contains(@id,'BusinessRules_ReserveRules')]/div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_BusinessRules_ExportImportStatus = By.xpath("//div[contains(@id,'BusinessRules_CCRulesExportImportStatus')]/div[@role='menuitem']");

	private static By MenuCC_BusinessSettings_ActivityPatterns     = By.xpath("//div[contains(@id,'BusinessSettings_ActivityPatterns')]//div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_BusinessWeek         = By.xpath("//div[contains(@id,'BusinessSettings_BusinessWeek')]//div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_Catastrophes         = By.xpath("//div[contains(@id,'BusinessSettings_Catastrophes')]//div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_CoverageVerification = By.xpath("//div[contains(@id,'BusinessSettings_CoverageDetermination')]/div[@class='gw-action--expand-button']");
	/* Coverage Verification SubMenu */
	private static By MenuCC_BusinessSettings_CoverageVerification_InvalidCoverageForCause = By.xpath("//div[contains(@id,'CoverageDetermination_InvalidCoverageForCause')]/div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_CoverageVerification_IncompatibleNewExposure = By.xpath("//div[contains(@id,'CoverageDetermination_IncompatibleNewExposure')]/div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_CoverageVerification_PossibleInvalidCoverage = By.xpath("//div[contains(@id,'CoverageDetermination_InvalidCoverageForFault')]/div[@role='menuitem']");

	private static By MenuCC_BusinessSettings_Holidays              = By.xpath("//div[contains(@id,'BusinessSettings_Holidays')]//div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_ICDCodes              = By.xpath("//div[contains(@id,'BusinessSettings_ICD')]//div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_MetricsAndThresholds  = By.xpath("//div[contains(@id,'BusinessSettings_KeyMetrics')]//div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_ReinsuranceThresholds = By.xpath("//div[contains(@id,'BusinessSettings_ReinsuranceThresholds')]//div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_WCParameters          = By.xpath("//div[contains(@id,'BusinessSettings_WCParms')]/div[@class='gw-action--expand-button']");
	/* WC Parameters SubMenu */
	private static By MenuCC_BusinessSettings_WCParameters_BenefitParameters        = By.xpath("//div[contains(@id,'WCParms-WCParms_WCBenefitParameterSet')]/div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_WCParameters_PPDMinMax                = By.xpath("//div[contains(@id,'WCParms-WCParms_WCPDBenefits')]/div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_WCParameters_PPDWeeks                 = By.xpath("//div[contains(@id,'WCParms-WCParms_WCPDWeeksAndLimits')]/div[@role='menuitem']");
	private static By MenuCC_BusinessSettings_WCParameters_CompensabilityParameters = By.xpath("//div[contains(@id,'WCParms-WCParms_DenialPeriods')]/div[@role='menuitem']");

	// Monitoring
	private static By MenuCC_Administration_Monitoring = By.xpath("//div[@id='TabBar-AdminTab-Admin_Monitoring']/div[@class='gw-action--expand-button']");
	/* Monitoring SubMenu */
	private static By MenuCC_Monitoring_MessageQueues       = By.xpath("//div[contains(@id,'MessagingDestinationControlList')]/div[@role='menuitem']");
	private static By MenuCC_Monitoring_WorkFlows           = By.xpath("//div[contains(@id,'WorkflowSearch')]/div[@role='menuitem']");
	private static By MenuCC_Monitoring_WorkFlowsStatistics = By.xpath("//div[contains(@id,'WorkflowStats')]/div[@role='menuitem']");

	// Utilities
	private static By MenuCC_Administration_Utilities = By.xpath("//div[@id='TabBar-AdminTab-Admin_Utilities']/div[@class='gw-action--expand-button']");
	/* Utilities SubMenu */
	private static By MenuCC_Utilities_ImportData        = By.xpath("//div[contains(@id,'Utilities_ImportWizard')]/div[@role='menuitem']");
	private static By MenuCC_Utilities_ExportData        = By.xpath("//div[contains(@id,'Utilities_ExportData')]/div[@role='menuitem']");
	private static By MenuCC_Utilities_ScriptParameters  = By.xpath("//div[contains(@id,'Utilities_ScriptParametersPage')]/div[@role='menuitem']");
	private static By MenuCC_Utilities_DataChange        = By.xpath("//div[contains(@id,'Utilities_DataChangePage')]/div[@role='menuitem']");
	private static By MenuCC_Utilities_InboundFiles      = By.xpath("//div[contains(@id,'Utilities_InboundFileSearch')]/div[@role='menuitem']");
	private static By MenuCC_Utilities_OutboundFiles     = By.xpath("//div[contains(@id,'Utilities_OutboundFileSearch')]/div[@role='menuitem']");
	private static By MenuCC_Utilities_RuntimeProperties = By.xpath("//div[contains(@id,'Utilities_Properties')]/div[@role='menuitem']");

	/*
	 *
	 */
	private static By CCMedicalDetails    = By.xpath("//div[@id='Claim-MenuLinks-0-Claim_TopLevelExposureDetail']//div[@class='gw-label gw-hasIcon']");
	private static By CCIndemnity         = By.xpath("//div[@id='Claim-MenuLinks-1-Claim_TopLevelExposureDetail']//div[@class='gw-label gw-hasIcon']");
	private static By CCEmployerLiability = By.xpath("//div[@id='Claim-MenuLinks-2-Claim_TopLevelExposureDetail']//div[@class='gw-label gw-hasIcon']");

	private static By Tab_Producer    = By.xpath("//div[@id='TabBar-ProducersTab']//div[@class='gw-label']");
	private static By Tab_Producer_dd = By.xpath("//div[contains(@id,'TabBar-ProducersTab')]//div[3]");

	/* Address Tab */
	private static By TabCC_AddressBook = By.xpath("//div[@id='TabBar-AddressBookTab']//div[@role='tab']");

	/* DashBoard Tab */
	private static By TabCC_DashBoard = By.xpath("//div[@id='TabBar-DashboardTab']//div[@role='tab']");

	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelCollision           = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Collision']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelComprehensive       = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Comprehensive']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelRentalReimbursement = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Rental Reimbursement']");
	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelTowingAndLabor      = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Towing and Labor']");

	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelElectronicEquipment = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Electronic Equipment']");

	private static By MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelTapeDiscMedia = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='Tape / Disc Media']");

	/*
	 * Headers
	 */

	static By         Screen_Header            = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By AutoFirstandFinal_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Auto First and Final']");
	private static By NewPerson_Header         = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='New Person']");
	private static By EditReserves_Header      = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Edit Reserves']");
	private static By NewAutoRepairShop_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='New Auto Repair Shop']");
	private static By QuickClaimAuto_Header    = By.xpath("//div[contains(@id,'NewQuickClaimScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	private static By PolicyGeneral_Header     = By.xpath("//div[contains(@id,'ClaimPolicyGeneralScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	private static By SelectPolicy_Header      = By.xpath("//div[contains(@id,'ClaimPolicySelectPolicyScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	static By         Summary_Header           = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Summary']");

	/*
	 * 
	 */

	private static By Next                  = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Next']");
	private static By Finish                = By.xpath("//div[contains(@id,'Finish')]//div[@role='button']");
	private static By Finish_Button         = By.xpath("//div[@id='FNOLWizard-Finish']/div[@role='button']");
	static By         OK                    = By.xpath("//div[contains(@id,'Update')]//div[@role='button']");
	private static By Update                = By.xpath("//div[contains(@id,'CustomUpdateButton')]/div[@role='button']");
	private static By Update_Button         = By.xpath("//div[contains(@id,'Update')]//div[@role='button']");
	static By         ExposureUpdate_Button = By.xpath("//div[contains(@id,'NewExposure-NewExposureScreen-Update')]//div[@role='button']");
	private static By Cancel_Button         = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Cancel']");
	private static By CoverageTermCancel    = By.xpath("//div[@id='CovTermPopup-Cancel']//div[@role='button']");
	private static By Back_Button           = By.xpath("//div[@id='FNOLWizard-Prev']/div[@role='button']");
	private static By Save_Button           = By.xpath("//div[contains(@id,'Update')]/div[@role='button']");
	private static By Edit_Button           = By.xpath("//div[contains(@id,'Screen-Edit')]//div[@role='button']");
	private static By Policy_EditButton     = By.xpath("//div[contains(@id,'EditButton')]//div[@role='button']");
	private static By ExposureCancel_Button = By.xpath("//div[contains(@id,'Cancel')]//div[@role='button']");
	private static By StatusEdit_Button     = By.xpath("//div[contains(@id,'ClaimStatus-Edit')]//div[@role='button']");

	private static By DraftClaimNumber     = By.xpath("//div[contains(@id,'ClaimNumber')]//div[@class='gw-label gw-infoValue']");
	private static By PolicyNumber         = By.xpath("//div[contains(@id,'PolicyNumber')]//div[@class='gw-label gw-infoValue']");
	private static By InsuredName          = By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']");
	private static By LostDate             = By.xpath("//div[contains(@id,'LossDate')]//div[@class='gw-label gw-infoValue']");
	private static By Adjuster             = By.xpath("//div[contains(@id,'Adjuster')]//div[@class='gw-label gw-infoValue']");
	private static By ReserveCancel_Button = By.xpath("//div[@id='NewReserveSet-NewReserveSetScreen-Cancel']//div[@role='button']");

	private static By SR_RentalBeginDate = By.xpath("//input[contains(@name,'RentalInputGroup-RentalBeginDate')]");
	private static By SR_RentalEndDate   = By.xpath("//input[contains(@name,'RentalInputGroup-RentalEndDate')]");
	private static By SR_RentalDailyRate = By.xpath("//input[contains(@name,'RentalInputGroup-RentalRate')]");
	private static By SR_RentalAgency    = By.xpath("//select[contains(@name,'RentalInputGroup-RentalAgency')]");
	private static By SR_PickupLocation  = By.xpath("//select[contains(@name,'ServiceAddressPicker')]");

	// validate Error Message
	private static By ValidationResults_Header         = By.xpath("//div[contains(@id,'wsTabBar')]//div[@class='gw-label' and text()='Validation Results']");
	private static By ValidationResults_WarningTitle   = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[text()='Warnings:']");
	private static By ValidationResults_Warning_First  = By
			.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-0')]//div[@class='gw-message' and contains(text(),'Validation errors were found in an object of type ReserveSet that was auto-created by rules:')]");
	private static By ValidationResults_Warning_Second = By
			.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-1')]//div[@class='gw-message' and contains(text(),'Validation errors were found in an object of type ReserveSet that was auto-created by rules:')]");
	private static By ValidationResults_ClearButton    = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");

	private static By Validation_Results = By.xpath("//div[@id='wsTabBar-wsTab_0']//div[@role='tab']");
	private static By Error_Msg          = By.xpath("//div[@id='WebMessageWorksheet-WebMessageWorksheetScreen-grpMsgs-0-0']");

	private static By Nodatatodisplay = By.xpath("//div[@class='gw-ListView--empty-info-row']/div[text()='No data to display']");

	/*
	 * 
	 * 
	 * 
	 * 
	 */

	public static LinkedHashMap<String, String> getData_ClaimsCenter(String strTable) throws Throwable {

		return Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_Fillo(pTestDataFile_ClaimsCenter, strTable, strTestCaseName);

	}

	public static LinkedHashMap<String, String> getData_Row_ClaimsCenter(String strTable, int SecondKey) throws Throwable {

		return Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_DataSet_Fillo(pTestDataFile_ClaimsCenter, strTable, strTestCaseName, SecondKey);

	}

	public static void UpdateData_ClaimsCenter(String strTable, String strColumn, String strValue) throws Throwable {

		Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Column_Fillo(pTestDataFile_ClaimsCenter, strTable, strColumn, strValue);

	}

	public static void login_ClaimsCenter_User(String strUser) throws Throwable {
		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_Fillo(pTestDataFile_ClaimsCenter, "login", strUser);

			GuidewireAutomate("Username", GW_Username, "sendKeys", lhm_TestCase_Table_Data.get("GW_Username"));
			GuidewireAutomate("Password", GW_Password, "sendKeys", lhm_TestCase_Table_Data.get("GW_Password"));
			// GuidewireAutomate("Password", Password, "sendKeys", new
			// String(Base64.getEncoder().encode(lhm_Data.get("TD_Password").getBytes())));
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

			GuidewireAutomate("Login", GW_Login_Button, "clickAndwait", "click");

			oExtentTest.log(Status.PASS, "Login succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void logout_ClaimsCenter() throws Throwable {
		try {

			GuidewireAutomate("Setting", GW_Setting_Link, "clickAndwait", "click");
			GuidewireAutomate("Logout", GW_Logout_Link, "clickAndwait", "click");

			oExtentTest.log(Status.PASS, "Logout is succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void logout_ClaimsCenterWithAlert() throws Throwable {
		try {

			GuidewireAutomate("Setting", GW_Setting_Link, "clickAndwait", "click");
			GuidewireAutomate("Logout", GW_Logout_Link, "clickAndwait", "click");

			GuidewireAutomate_Handle("alertaccept", "NA");
			oExtentTest.log(Status.PASS, "Logout is succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ---- ClaimsCenter
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ----
	 */
	public static void ccTabNavigation(String Tab, String Value) throws Throwable {

		switch (Tab) {

			/*
			 * Desktop
			 */
			case "Desktop" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop, "clickAndwait", "click");
				break;
			case "Activities" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Activities", TabCC_Desktop_Activities, "clickAndwait", "click");
				break;
			case "Claims" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Claims", TabCC_Desktop_Claims, "clickAndwait", "click");
				break;
			case "New Claims" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("New Claims", TabCC_Desktop_NewClaims, "clickAndwait", "click");
				break;
			case "Subrogations" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Subrogations", TabCC_Desktop_Subrogations, "clickAndwait", "click");
				break;
			case "Exposures" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Exposures", TabCC_Desktop_Exposures, "clickAndwait", "click");
				break;
			case "Pending Assignments" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("PendingAssignments", TabCC_Desktop_PendingAssignments, "clickAndwait", "click");
				break;
			case "Queues" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Queues", TabCC_Desktop_Queues, "clickAndwait", "click");
				break;
			case "Calendar" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Calendar", TabCC_Desktop_Calendar, "clickAndwait", "click");
				break;
			case "Bulk Invoices" :
				GuidewireAutomate("Desktop Tab", TabCC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("BulkInvoices", TabCC_Desktop_BulkInvoices, "clickAndwait", "click");
				break;

			/*
			 * Claims
			 */
			case "Claim" :
				GuidewireAutomate("Claim Tab", TabCC_Claim, "clickAndwait", "click");
				break;
			case "New Claim" :
				GuidewireAutomate("Claims Tab", TabCC_Claim_dd, "clickAndwait", "click");
				GuidewireAutomate("New Claim", TabCC_Claim_NewClaim, "clickAndwait", "click");
				break;
			case "Claim Search" :
				String strClaimNumber = null;
				lhm_TestCase_Table_Data = getData_ClaimsCenter("master");

				strClaimNumber = lhm_TestCase_Table_Data.get("ClaimsNumber");
				GuidewireAutomate("Claims Tab", TabCC_Claim_dd, "clickAndwait", "click");
				GuidewireAutomate("Claim Number", TabCC_Claim_ClaimNumber, "clearANDsendKeys", strClaimNumber);
				GuidewireAutomate("Claim Number Search", TabCC_Claim_ClaimNumber_Search, "clickAndwait", "click");
				Thread.sleep(1000);
				lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
				lhm_TestCase_Table_Data.clear();
				break;
			/*
			 * Search
			 */
			case "Search" :
				GuidewireAutomate("Claim Tab", TabCC_Search, "clickAndwait", "click");
				break;
			case "Search Claims" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Claims", TabCC_Search_Claims, "clickAndwait", "click");
				break;
			case "Search Claims Advanced Search" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Claims", TabCC_Search_Claims, "moveToElement", "moveToElement");
				GuidewireAutomate("Advanced Search", TabCC_Search_Claims_AdvancedSearch, "clickAndwait", "clickAndwait");
				break;
			case "Search Claims Simple Search" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Claims", TabCC_Search_Claims, "moveToElement", "moveToElement");
				GuidewireAutomate("Advanced Search", TabCC_Search_Claims_SimpleSearch, "clickAndwait", "clickAndwait");
				break;
			case "Search Activities" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Activities", TabCC_Search_Activities, "clickAndwait", "click");
				break;
			case "Search Checks" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Checks", TabCC_Search_Checks, "clickAndwait", "click");
				break;
			case "Search Recoveries" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Recoveries", TabCC_Search_Recoveries, "clickAndwait", "click");
				break;
			case "Search Bulk Invoices" :
				GuidewireAutomate("Search Tab", TabCC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Bulk Invoices", TabCC_Search_BulkInvoices, "clickAndwait", "click");
				break;

			/*
			 * Address Book
			 */
			case "Address Book" :
				GuidewireAutomate("Address Search Tab", TabCC_AddressBook, "click", "Null");
				break;
			/*
			 * DashBoard
			 */
			case "Dashboard" :
				GuidewireAutomate("DashBoard Tab", TabCC_DashBoard, "click", "Null");
				break;
			/*
			 * Team
			 */
			case "Team" :
				GuidewireAutomate("Team Tab", TabCC_Team, "click", "Null");
				break;
			/*
			 * Administration
			 */
			case "Administration" :
				GuidewireAutomate("Administration Tab", TabCC_Administration, "clickAndwait", "click");
				break;

			case "Print User Group Tree" :
				GuidewireAutomate("AdministrationTab dd", TabCC_Adminsitration_dd, "click", "Null");
				GuidewireAutomate("Print User Group Tree", TabCC_Adminsitration_PrintUserGroupTree, "click", "Null");
				break;

			case "Unsaved Work" :
				GuidewireAutomate("Unsaved Work", UnsavedWork, "clickAndwait", "click");

				break;
			default :
				throw new IOException("No support for Tab : " + Tab);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to ClaimsCenter Tab : " + Tab + " is succesful");
	}

	public static void ccMenuNavigation(String Menu) throws Throwable {

		/*
		 * Actions
		 */
		switch (Menu) {
			case "Actions" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				break;

			case "Statistics" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Statistics", MenuCC_Desktop_Actions_Statistics, "clickAndwait", "click");
				break;
			case "Preferences" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Preferences", MenuCC_Desktop_Actions_Preferences, "clickAndwait", "click");
				break;
			case "VacationStatus" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("VacationStatus", MenuCC_Desktop_Actions_VacationStatus, "clickAndwait", "click");
				break;

			case "Bulk Invoices" :
				GuidewireAutomate("BulkInvoices", MenuCC_Desktop_BulkInvoices, "clickAndwait", "click");
				break;

			// New
			case "New Note" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Note", MenuCC_Claim_Actions_NewNote, "clickAndwait", "click");
				break;
			// Divya
			// 16/12/2021
			case "Email" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				Thread.sleep(1000);
				GuidewireAutomate("Email", MenuCC_Claim_Actions_Email, "clickAndwait", "click");
				break;

			case "New Email" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Email", MenuCC_Claim_Actions_New_Email, "clickAndwait", "click");
				break;
			case "New Matter" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Matter", MenuCC_Claim_Actions_New_Matter, "clickAndwait", "click");
				break;
			case "New Evaluation" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Evaluation", MenuCC_Claim_Actions_New_Evaluation, "clickAndwait", "click");
				break;
			case "New Negotiation" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Negotiation", MenuCC_Claim_Actions_New_Negotiation, "clickAndwait", "click");
				break;
			case "New Service" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Service", MenuCC_Claim_Actions_New_Service, "clickAndwait", "click");
				break;
			case "Policy Details" :
				GuidewireAutomate("PolicyDetails", PolicyDetails, "clickAndwait", "click");

				break;
			// New Transaction
			case "Reserve" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				Thread.sleep(1000);
				GuidewireAutomate("Reserve", MenuCC_Claim_Actions_NewTransaction_Reserve, "clickAndwait", "click");
				break;
			case "Check" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				Thread.sleep(1000);
				GuidewireAutomate("Reserve", MenuCC_Claim_Actions_NewTransaction_Check, "clickAndwait", "click");
				break;
			case "Other" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Other", MenuCC_Claim_Actions_NewTransaction_Other, "moveToElement", "click");
				break;
			case "Manual Check" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Other", MenuCC_Claim_Actions_NewTransaction_Other, "moveToElement", "moveToElement");
				GuidewireAutomate("Manual Check", MenuCC_Claim_Actions_NewTransaction_Other_ManualCheck, "clickAndwait", "click");
				break;
			case "Recovery" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "clickAndwait");
				GuidewireAutomate("Other", MenuCC_Claim_Actions_NewTransaction_Other, "moveToElement", "moveToElement");
				GuidewireAutomate("Recovery", MenuCC_Claim_Actions_NewTransaction_Other_Recovery, "clickAndwait", "click");
				break;
			case "Recovery Reserve" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "clickAndwait");
				GuidewireAutomate("Other", MenuCC_Claim_Actions_NewTransaction_Other, "moveToElement", "moveToElement");
				GuidewireAutomate("Recovery Reserve", MenuCC_Claim_Actions_NewTransaction_Other_RecoveryReserve, "click", "click");
				break;
			case "Create from a template" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Create from a template", MenuCC_Claim_Actions_NewDocument_Createfromatemplate, "click", "click");
				break;
			case "Upload Documents" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Upload Documents", MenuCC_Claim_Actions_NewDocument_UploadDocuments, "clickAndwait", "click");
				break;
			case "Indicate existence of a document" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Indicate existence of a document", MenuCC_Claim_Actions_NewDocument_Indicateexistenceofadocument, "clickAndwait", "click");
				break;

			// Administration Action
			case "New Group" :
				GuidewireAutomate("Actions", AdminAction, "clickAndwait", "click");
				Thread.sleep(1000);
				GuidewireAutomate("New Group", MenuCC_AdminActionNewGroup, "clickAndwait", "click");
				break;

			// New Activity
			case "Correspondence" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Correspondence", MenuCC_Claim_Actions_NewActivity_Correspondence, "moveToElement", "moveToElement");
				break;
			case "Send claim acknowledgement letter" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Correspondence", MenuCC_Claim_Actions_NewActivity_Correspondence, "moveToElement", "moveToElement");
				GuidewireAutomate("Send claim acknowledgement letter", MenuCC_Claim_Actions_NewActivity_Correspondence_SendclaimAcknowledgementLetter, "clickAndwait", "click");
				break;
			case "Send letter confirming closure of exposure" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Correspondence", MenuCC_Claim_Actions_NewActivity_Correspondence, "moveToElement", "moveToElement");
				GuidewireAutomate("Send letter confirming closure of exposure", MenuCC_Claim_Actions_NewActivity_Correspondence_SendLetterConfirmingClosureOfExposure, "click", "click");
				break;
			case "Send reservation of rights letter" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Correspondence", MenuCC_Claim_Actions_NewActivity_Correspondence, "moveToElement", "moveToElement");
				GuidewireAutomate("Send reservation of rights letter", MenuCC_Claim_Actions_NewActivity_Interview_GetAStatementFromWitness, "clickAndwait", "click");
				break;
			case "Interview" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Interview", MenuCC_Claim_Actions_NewActivity_Interview, "moveToElement", "moveToElement");
				break;
			case "Get a statement from witness" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Interview", MenuCC_Claim_Actions_NewActivity_Interview, "moveToElement", "moveToElement");
				GuidewireAutomate("Get a statement from witness", MenuCC_Claim_Actions_NewActivity_Interview_GetAStatementFromWitness, "clickAndwait", "click");
				break;
			case "Make initial contact with insured" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Interview", MenuCC_Claim_Actions_NewActivity_Interview, "moveToElement", "moveToElement");
				GuidewireAutomate("Make initial contact with insured", MenuCC_Claim_Actions_NewActivity_Interview_MakeInitialContactWithInsured, "clickAndwait", "click");
				break;
			case "New Mail" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Mail", MenuCC_Claim_Actions_NewActivity_NewMail, "moveToElement", "moveToElement");
				break;
			case "Review new bill received" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Mail", MenuCC_Claim_Actions_NewActivity_NewMail, "moveToElement", "moveToElement");
				GuidewireAutomate("Review new bill received", MenuCC_Claim_Actions_NewActivity_NewMail_ReviewNewBillReceived, "clickAndwait", "click");
				break;
			case "Review new mail" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("New Mail", MenuCC_Claim_Actions_NewActivity_NewMail, "moveToElement", "moveToElement");
				GuidewireAutomate("Review new mail", MenuCC_Claim_Actions_NewActivity_NewMail_ReviewNewMail, "click", "click");
				break;

			case "Reminder" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Reminder", MenuCC_Claim_Actions_NewActivity_Reminder, "moveToElement", "moveToElement");
				break;
			case "30 day diary" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Reminder", MenuCC_Claim_Actions_NewActivity_Reminder, "moveToElement", "moveToElement");
				GuidewireAutomate("30 day diary", MenuCC_Claim_Actions_NewActivity_Reminder_30DayDiary, "clickAndwait", "click");
				break;
			case "60 day diary" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Reminder", MenuCC_Claim_Actions_NewActivity_Reminder, "moveToElement", "moveToElement");
				GuidewireAutomate("60 day diary", MenuCC_Claim_Actions_NewActivity_Reminder_60DayDiary, "clickAndwait", "click");
				break;
			case "90 day diary" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Reminder", MenuCC_Claim_Actions_NewActivity_Reminder, "moveToElement", "moveToElement");
				GuidewireAutomate("90 day diary", MenuCC_Claim_Actions_NewActivity_Reminder_90DayDiary, "clickAndwait", "click");
				break;
			// Other Reminder Sub-menu Cases need to be added here

			case "Request" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Request", MenuCC_Claim_Actions_NewActivity_Request, "moveToElement", "moveToElement");
				break;
			case "Additional living expenses required" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Request", MenuCC_Claim_Actions_NewActivity_Request, "moveToElement", "moveToElement");
				GuidewireAutomate("Additional living expenses required", MenuCC_Claim_Actions_NewActivity_Request_AdditionalLivingExpensesRequired, "clickAndwait", "click");
				break;
			case "Create Recovery email bill1" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Request", MenuCC_Claim_Actions_NewActivity_Request, "moveToElement", "moveToElement");
				GuidewireAutomate("Create Recovery email bill1", MenuCC_Claim_Actions_NewActivity_Request_CreateRecoveryEmailBill1, "clickAndwait", "click");
				break;
			case "Create Recovery email bill2" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Request", MenuCC_Claim_Actions_NewActivity_Request, "moveToElement", "moveToElement");
				GuidewireAutomate("Create Recovery email bill2", MenuCC_Claim_Actions_NewActivity_Request_CreateRecoveryEmailBill2, "clickAndwait", "click");
				break;
			// Other Request Sub-menu Cases need to be added here

			case "Warning" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Warning", MenuCC_Claim_Actions_NewActivity_Warning, "moveToElement", "moveToElement");
				break;
			case "Unable to close the claim or the exposure" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Warning", MenuCC_Claim_Actions_NewActivity_Warning, "moveToElement", "moveToElement");
				GuidewireAutomate("Unable to close the claim or the exposure", MenuCC_Claim_Actions_NewActivity_Warning_UnableToCloseTheClaimOrTheExposure, "clickAndwait", "click");
				break;

			// Choose by Coverage Vehicle

			case "ChoosebyCoverage Collision" :
				lhm_TestCase_Table_Data = getData_ClaimsCenter("asBasicInfo");
				String strChoosebyCoverage_Vehicle = lhm_TestCase_Table_Data.get("BI_IV_Select");

				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");

				By ChoosebyCoverage_Vehicle = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='" + strChoosebyCoverage_Vehicle + "']");

				GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_Vehicle, "moveToElement", "moveToElement");

				GuidewireAutomate("Collision", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelCollision, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage Comprehensive" :
				lhm_TestCase_Table_Data = getData_ClaimsCenter("asBasicInfo");
				String strChoosebyCoverage_VehicleComprehensive = lhm_TestCase_Table_Data.get("BI_IV_Select");

				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				By ChoosebyCoverage_VehicleComprehensive = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='" + strChoosebyCoverage_VehicleComprehensive + "']");

				GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleComprehensive, "moveToElement", "moveToElement");
				GuidewireAutomate("Comprehensive", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelComprehensive, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage ElectronicEquipment" :
				lhm_TestCase_Table_Data = getData_ClaimsCenter("asBasicInfo");
				String strChoosebyCoverage_VehicleElectronicEquipment = lhm_TestCase_Table_Data.get("BI_IV_Select");

				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				By ChoosebyCoverage_VehicleElectronicEquipment = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='" + strChoosebyCoverage_VehicleElectronicEquipment + "']");

				GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleElectronicEquipment, "moveToElement", "moveToElement");
				GuidewireAutomate("Electronic Equipment", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelElectronicEquipment, "click", "click");
				break;

			case "ChoosebyCoverage RentalReimbursement" :
				lhm_TestCase_Table_Data = getData_ClaimsCenter("asBasicInfo");
				String strChoosebyCoverage_VehicleRentalReimbursement = lhm_TestCase_Table_Data.get("BI_IV_Select");

				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");

				By ChoosebyCoverage_VehicleRentalReimbursement = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='" + strChoosebyCoverage_VehicleRentalReimbursement + "']");

				GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleRentalReimbursement, "moveToElement", "moveToElement");
				GuidewireAutomate("Rental Reimbursement", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelRentalReimbursement, "click", "click");
				break;

			case "ChoosebyCoverage TapeDiscMedia" :
				lhm_TestCase_Table_Data = getData_ClaimsCenter("asBasicInfo");
				String strChoosebyCoverage_VehicleTapeDiscMedia = lhm_TestCase_Table_Data.get("BI_IV_Select");

				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");

				By ChoosebyCoverage_VehicleTapeDiscMedia = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='" + strChoosebyCoverage_VehicleTapeDiscMedia + "']");

				GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleTapeDiscMedia, "moveToElement", "moveToElement");
				GuidewireAutomate("Tape Disc Media", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelTapeDiscMedia, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage TowingAndLabor" :
				lhm_TestCase_Table_Data = getData_ClaimsCenter("asBasicInfo");
				String strChoosebyCoverage_VehicleTowingAndLabor = lhm_TestCase_Table_Data.get("BI_IV_Select");

				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");

				By ChoosebyCoverage_VehicleTowingAndLabor = By.xpath("//div[contains(@id,'NewExposureMenuItemSet_ByCoverage')]//div[@class='gw-label' and text()='" + strChoosebyCoverage_VehicleTowingAndLabor + "']");

				GuidewireAutomate("ChoosebyCoverage Vehicle", ChoosebyCoverage_VehicleTowingAndLabor, "moveToElement", "moveToElement");
				GuidewireAutomate("Towing and Labor", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_VehicleLevelTowingAndLabor, "clickAndwait", "click");
				break;

			// Choose by Coverage Policy Level Coverage

			case "ChoosebyCoverage Liability Bodily Injury" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Bodily Injury and Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Bodily Injury", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityBodilyInjury, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage Liability Property Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Bodily Injury and Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityPropertyDamage, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage Liability Vehicle Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Bodily Injury and Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Vehicle Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_LiabilityBodilyInjuryAndPropertyDamage_LiabilityVehicleDamage, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage Mexico Cov BI" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov BI", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovBI, "clickAndwait", "click");
				break;
			case "ChoosebyCoverage Mexico Cov PD" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov PD", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovPD, "clickAndwait", "click");
				break;
			case "ChoosebyCoverage Mexico Cov Vehicle Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov Vehicle Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovVehicleDamage, "clickAndwait", "click");
				break;
			case "ChoosebyCoverage Mexico Cov Gen Damages" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov Gen Damages", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MexicoCoverageLimited_MexicoCovGenDamages, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage Medical Payments" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Medical Payments", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_MedicalPayments, "click", "click");
				break;

			case "ChoosebyCoverage Underinsured Motorist - Property Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Underinsured Motorist - Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UnderinsuredMotoristPropertyDamage, "clickAndwait", "click");
				break;

			case "ChoosebyCoverage Uninsured Motorist Bodily Injury" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Uninsured Motorist Bodily Injury", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UninsuredMotoristBodilyInjury, "clickAndwait", "click");
				break;
			case "ChoosebyCoverage Uninsured Motorist Property Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Uninsured Motorist Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage_UninsuredMotoristPropertyDamage, "clickAndwait", "click");
				break;
			// Choose by Coverage Policy Level Coverage
			case "Policy Level Coverage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				Thread.sleep(1000);
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				// GuidewireAutomate("General Damage", OPtion1, "clickAndwait", "clickAndwait");

				break;
			case "Policy Level Coverage Excess Casualty" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				Thread.sleep(1000);
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Excess Casualty", MenuCC_Claim_Actions_ExcessCasualty, "moveToElement", "moveToElement");

				GuidewireAutomate("General Damage", MenuCC_Claim_Actions_ExcessCasualty_GeneralDamage, "clickAndwait", "clickAndwait");
				break;

			// Pankaj
			case "Policy Level Coverage Insured Party" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				getStaleElement("Actions", Menu_ActionsCC);
				GuidewireAutomate("Policy Level Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverage_PolicyLevelCoverage, "moveToElement", "moveToElement");
				GuidewireAutomate("Policy Level Coverage Insured Party", MenuCC_Claim_Actions_NewExposure_PolicyLevelCoverage_Insured, "clickAndwait", "clickAndwait");
				break;

			// Choose By Coverage Type
			case "Choose by Coverage Type" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by Coverage Type", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				break;

			case "Collision" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType C", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C, "moveToElement", "moveToElement");
				GuidewireAutomate("Collision", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_Collision, "click", "click");
				break;
			case "Collision Limited Coverage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType C", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C, "moveToElement", "moveToElement");
				GuidewireAutomate("Collision Limited Coverage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_CollisionLimitedCoverage, "clickAndwait", "click");
				break;
			case "Comprehensive" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType C", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C, "moveToElement", "moveToElement");
				GuidewireAutomate("Comprehensive", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_C_Comprehensive, "clickAndwait", "click");
				break;
			case "Death and Disability Benefit" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType D", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_D, "moveToElement", "moveToElement");
				GuidewireAutomate("Death and Disability Benefit", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_D_DeathAndDisabilityBenefit, "click", "click");
				break;
			case "Electronic Equipment" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType E", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_E, "moveToElement", "moveToElement");
				GuidewireAutomate("Electronic Equipment", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_E_ElectronicEquipment, "clickAndwait", "click");
				break;
			case "Liability Bodily Injury" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType L", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Bodily Injury", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityBodilyInjury, "clickAndwait", "click");
				break;
			case "Liability Property Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType L", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityPropertyDamage, "clickAndwait", "click");
				break;
			case "Liability Vehicle Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType L", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L, "moveToElement", "moveToElement");
				GuidewireAutomate("Liability Vehicle Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_L_LiabilityVehicleDamage, "clickAndwait", "click");
				break;
			case "Mexico Cov BI" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov BI", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovBI, "click", "click");
				break;
			case "Mexico Cov PD" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov PD", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovPD, "click", "click");
				break;
			case "Mexico Cov Vehicle Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov Vehicle Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovVehicleDamage, "clickAndwait", "click");
				break;
			case "Mexico Cov Gen Damages'" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Cov Gen Damages", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MexicoCoverageLimited_MexicoCovGenDamages, "clickAndwait", "click");
				break;

			case "Medical Payments" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType M", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M, "moveToElement", "moveToElement");
				GuidewireAutomate("Mexico Coverage Limited", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_M_MedicalPayments, "clickAndwait", "click");
				break;

			case "PIP Arkansas" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Arkansas", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPArkansas, "clickAndwait", "click");
				break;
			case "PIP Delaware" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Delaware", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPDelaware, "clickAndwait", "click");
				break;
			case "PIP District of Columbia" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP District of Columbia", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPDistrictOfColumbia, "clickAndwait", "click");
				break;
			case "PIP Florida" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Florida", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPFlorida, "clickAndwait", "click");
				break;
			case "PIP Hawaii" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Hawaii", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPHawaii, "click", "click");
				break;
			case "PIP Kansas" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Kansas", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPKansas, "click", "click");
				break;
			case "PIP Kentucky" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Kentucky", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPKentucky, "clickAndwait", "click");
				break;
			case "PIP Maryland" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Maryland", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMaryland, "clickAndwait", "click");
				break;
			case "PIP Massachusetts" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Massachusetts", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMassachusetts, "clickAndwait", "click");
				break;
			case "PIP Michigan" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Michigan", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMichigan, "clickAndwait", "click");
				break;
			case "PIP Minnesota" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Michigan", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPMinnesota, "clickAndwait", "click");
				break;
			case "PIP NewJersey" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP New Jersey", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNewJersey, "clickAndwait", "click");
				break;
			case "PIP NewYork" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP New York", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNewYork, "clickAndwait", "click");
				break;
			case "PIP NorthDakota" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP North Dakota", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPNorthDakota, "clickAndwait", "click");
				break;
			case "PIP Oregon" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Oregon", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPOregon, "click", "click");
				break;
			case "PIP Pennsylvania" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Pennsylvania", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPPennsylvania, "clickAndwait", "click");
				break;
			case "PIP Texas" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Texas", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPTexas, "click", "click");
				break;
			case "PIP Utah" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Utah", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPUtah, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Utah", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPUtah, "click", "click");
				break;
			case "PIP Washington" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Utah", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPUtah, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Washington", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPWashington, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Washington", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPWashington, "clickAndwait", "click");
				break;
			case "Property Protection Insurance" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType P", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Utah", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPUtah, "moveToElement", "moveToElement");
				GuidewireAutomate("PIP Washington", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PIPWashington, "moveToElement", "moveToElement");
				GuidewireAutomate("Property Protection Insurance", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_P_PropertyProtectionInsurance, "click", "click");
				break;

			case "Rental Car Loss of Use" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType R", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R, "moveToElement", "moveToElement");
				GuidewireAutomate("Rental Car Loss of Use", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R_RentalCarLossOfUse, "clickAndwait", "click");
				break;
			case "Rental Reimbursement" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType R", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R, "moveToElement", "moveToElement");
				GuidewireAutomate("Rental Reimbursement", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_R_RentalReimbursement, "clickAndwait", "click");
				break;
			case "Tape Disc Media" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType T", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T, "moveToElement", "moveToElement");
				GuidewireAutomate("Tape Disc Media", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T_TapeDiscMedia, "clickAndwait", "click");
				break;
			case "Towing and Labor" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType T", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T, "moveToElement", "moveToElement");
				GuidewireAutomate("Towing and Labor", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_T_TowingAndLabor, "clickAndwait", "click");
				break;
			case "Underinsured Motorist Bodily Injury" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType U", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U, "moveToElement", "moveToElement");
				GuidewireAutomate("Underinsured Motorist Bodily Injury", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UnderinsuredMotoristBodilyInjury, "click", "click");
				break;
			case "Underinsured Motorist Property Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType U", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U, "moveToElement", "moveToElement");
				GuidewireAutomate("Underinsured Motorist Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UnderinsuredMotoristPropertyDamage, "click", "click");
				break;
			case "Uninsured Motorist Bodily Injury" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType U", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U, "moveToElement", "moveToElement");
				GuidewireAutomate("Uninsured Motorist Bodily Injury", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UninsuredMotoristBodilyInjury, "click", "click");
				break;
			case "Uninsured Motorist Property Damage" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Choose by CoverageType", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType, "moveToElement", "moveToElement");
				GuidewireAutomate("Choose by CoverageType U", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U, "moveToElement", "moveToElement");
				GuidewireAutomate("Uninsured Motorist Property Damage", MenuCC_Claim_Actions_NewExposure_ChoosebyCoverageType_U_UninsuredMotoristPropertyDamage, "click", "click");
				break;

			// Claim Actions
			case "Assign Claim" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				Thread.sleep(1000);
				GuidewireAutomate("Assign Claim", MenuCC_Claim_Actions_ClaimActions_AssignClaim, "clickAndwait", "click");
				break;
			// Divya
			// 16/12/2021
			case "Close Claim" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				Thread.sleep(1000);
				GuidewireAutomate("Close Claim", MenuCC_Claim_Actions_ClaimActions_CloseClaim, "clickAndwait", "click");
				break;
			case "Reopen Claim" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				getStaleElement("Reopen Claim", MenuCC_Claim_Actions_ClaimActions_ReopenClaim);
				GuidewireAutomate("Reopen Claim", MenuCC_Claim_Actions_ClaimActions_ReopenClaim, "clickAndwait", "click");
				break;
			case "Print Claim" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Print Claim", MenuCC_Claim_Actions_ClaimActions_PrintClaim, "clickAndwait", "click");
				break;
			case "Sync Status" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Sync Status", MenuCC_Claim_Actions_ClaimActions_SyncStatus, "clickAndwait", "click");
				break;
			case "Validate Claim Only" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly, "moveToElement", "moveToElement");
				break;
			case "ValidateClaimOnly Loadandsave" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimOnly Loadandsave", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_LoadAndSave, "clickAndwait", "click");
				break;
			case "ValidateClaimOnly NewLossCompletion" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimOnly NewLossCompletion", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_NewLossCompletion, "clickAndwait", "click");
				break;
			case "ValidateClaimOnly ValidForISO" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimOnly ValidForISO", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_ValidForISO, "clickAndwait", "click");
				break;
			case "ValidateClaimOnly SendToExternalSystem" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimOnly SendToExternalSystem", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_SendToExternalSystem, "clickAndwait", "click");
				break;
			case "ValidateClaimOnly AbilityToPay" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Only", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimOnly AbilityToPay", MenuCC_Claim_Actions_ClaimActions_ValidateClaimOnly_AbilityToPay, "clickAndwait", "click");
				break;
			case "Validate Claim Exposures" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures, "clickAndwait", "click");
				break;
			case "ValidateClaimExposures Loadandsave" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimExposures Loadandsave", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_LoadAndSave, "clickAndwait", "click");
				break;
			case "ValidateClaimExposures NewLossCompletion" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimExposures NewLossCompletion", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_NewLossCompletion, "clickAndwait", "click");
				break;
			case "ValidateClaimExposures ValidForISO" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimExposures ValidForISO", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_ValidForISO, "clickAndwait", "click");
				break;
			case "ValidateClaimExposures SendToExternalSystem" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimExposures SendToExternalSystem", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_SendToExternalSystem, "clickAndwait", "click");
				break;
			case "ValidateClaimExposures AbilityToPay" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Claim Exposures", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidateClaimExposures AbilityToPay", MenuCC_Claim_Actions_ClaimActions_ValidateClaimExposures_AbilityToPay, "clickAndwait", "click");
				break;
			case "Validate Policy" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "clickAndwait", "click");
				break;
			case "ValidatePolicy Loadandsave" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidatePolicy Loadandsave", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_LoadAndSave, "clickAndwait", "click");
				break;
			case "ValidatePolicy NewLossCompletion" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidatePolicy NewLossCompletion", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_NewLossCompletion, "clickAndwait", "click");
				break;
			case "ValidatePolicy ValidForISO" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidatePolicy ValidForISO", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_ValidForISO, "clickAndwait", "click");
				break;
			case "ValidatePolicy SendToExternalSystem" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidatePolicy SendToExternalSystem", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_SendToExternalSystem, "clickAndwait", "click");
				break;
			case "ValidatePolicy AbilityToPay" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("Validate Policy", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy, "moveToElement", "moveToElement");
				GuidewireAutomate("ValidatePolicy AbilityToPay", MenuCC_Claim_Actions_ClaimActions_ValidatePolicy_AbilityToPay, "clickAndwait", "click");
				break;

			/*
			 * Claim Details - Menu Links
			 */
			case "Summary" :
				GuidewireAutomate("Summary", MenuCC_Claim_Summary, "clickAndwait", "click");
				break;
			case "Overview" :
				GuidewireAutomate("Summary Overview", MenuCC_Claim_Summary_Overview, "clickAndwait", "click");
				break;
			case "Status" :
				GuidewireAutomate("Summary Status", MenuCC_Claim_Summary_Status, "clickAndwait", "click");
				break;
			case "Health Metrics" :
				GuidewireAutomate("Summary Health Metrics", MenuCC_Claim_Summary_HealthMetrics, "clickAndwait", "click");
				break;
			case "Workplan" :
				GuidewireAutomate("Workplan", MenuCC_Claim_Workplan, "clickAndwait", "click");
				getStaleElement("Workplan", MenuCC_Claim_Workplan);
				break;
			case "Loss Details" :
				GuidewireAutomate("Loss Details", MenuCC_Claim_LossDetails, "clickAndwait", "click");
				getStaleElement("Loss Details", MenuCC_Claim_LossDetails);
				break;
			case "Loss Details General" :
				GuidewireAutomate("Loss Details", MenuCC_Claim_LossDetails, "clickAndwait", "click");
				GuidewireAutomate("General", MenuCC_Claim_LossDetails_General, "clickAndwait", "click");
				break;
			case "Loss Details Asociations" :
				GuidewireAutomate("Loss Details", MenuCC_Claim_LossDetails, "clickAndwait", "click");
				GuidewireAutomate("Asociations", MenuCC_Claim_LossDetails_Asociations, "clickAndwait", "click");
				break;
			case "Loss Details SpecialInvestigationDetails" :
				GuidewireAutomate("Loss Details", MenuCC_Claim_LossDetails, "clickAndwait", "click");
				GuidewireAutomate("Special Investigation Details", MenuCC_Claim_LossDetails_SpecialInvestigationDetails, "clickAndwait", "click");
				break;
			case "Business Settings" :
				GuidewireAutomate("Business Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				break;
			case "Medical Details" :
				GuidewireAutomate("Medical Details", MenuCC_Claim_MedicalDetails, "clickAndwait", "click");
				break;
			case "Indemnity" :
				GuidewireAutomate("Indemnity", MenuCC_Claim_Indemnity, "clickAndwait", "click");
				break;
			case "Exposures" :
				GuidewireAutomate("Exposures", MenuCC_Claim_Exposures, "clickAndwait", "click");
				break;
			case "Reinsurance" :
				GuidewireAutomate("Reinsurance", MenuCC_Claim_Reinsurance, "clickAndwait", "click");
				break;
			case "Parties Involved" :
				GuidewireAutomate("PartiesInvolved", MenuCC_Claim_PartiesInvolved, "clickAndwait", "click");
				break;
			case "Parties Involved Contacts" :
				GuidewireAutomate("Parties Involved", MenuCC_Claim_PartiesInvolved, "clickAndwait", "click");
				GuidewireAutomate("Contacts", MenuCC_Claim_PartiesInvolved_Contacts, "clickAndwait", "click");
				break;
			case "Parties Involved Users" :
				GuidewireAutomate("PartiesInvolved", MenuCC_Claim_PartiesInvolved, "clickAndwait", "click");
				GuidewireAutomate("Users", MenuCC_Claim_PartiesInvolved_Users, "clickAndwait", "click");
				break;
			case "Policy" :
				GuidewireAutomate("Policy", MenuCC_Claim_Policy, "clickAndwait", "click");
				Thread.sleep(1000);
				break;
			case "General" :
				GuidewireAutomate("General", MenuCC_Policy_General, "clickAndwait", "click");
				break;
			case "Location and Class" :
				GuidewireAutomate("Location and Class", MenuCC_Policy_LocationClass, "clickAndwait", "click");
				Thread.sleep(1000);
				break;
			case "Policy General" :
				GuidewireAutomate("Policy", MenuCC_Claim_Policy, "clickAndwait", "click");
				GuidewireAutomate("General", MenuCC_Claim_Policy_General, "clickAndwait", "click");
				break;
			case "Policy General Direct" :
				GuidewireAutomate("Policy General", MenuCC_Claim_Policy_General, "clickAndwait", "click");
				break;
			case "PolicyGeneral" :
				GuidewireAutomate("Policy", MenuCC_Claim_Policy, "clickAndwait", "click");
				Thread.sleep(1000);
				GuidewireAutomate("General", MenuCC_Claim_PolicyGeneral, "clickAndwait", "click");
				getStaleElement("General", MenuCC_Claim_PolicyGeneral);
				break;
			case "Policy Vehicles" :
				GuidewireAutomate("Policy", MenuCC_Claim_Policy, "clickAndwait", "click");
				GuidewireAutomate("Vehicles", MenuCC_Claim_Policy_Vehicle, "clickAndwait", "click");
				break;
			case "Policy Endorsements" :
				GuidewireAutomate("Policy", MenuCC_Claim_Policy, "clickAndwait", "click");
				GuidewireAutomate("Endorsements", MenuCC_Claim_Policy_Endorsements, "clickAndwait", "click");
				break;
			case "Policy Aggregate Limits" :
				GuidewireAutomate("Policy", MenuCC_Claim_Policy, "clickAndwait", "click");
				Thread.sleep(2000);
				GuidewireAutomate("Aggregate Limits", MenuCC_Claim_Policy_AggregateLimits, "clickAndwait", "click");
				break;
			case "Financials" :
				GuidewireAutomate("Financials", MenuCC_Claim_Financials, "clickAndwait", "click");
				break;
			case "Financials Summary" :
				GuidewireAutomate("Financials", MenuCC_Claim_Financials, "clickAndwait", "click");
				Thread.sleep(2000);
				GuidewireAutomate("Summary", MenuCC_Claim_Financials_Summary, "clickAndwait", "click");
				break;
			case "Financials Transactions" :
				GuidewireAutomate("Financials", MenuCC_Claim_Financials, "clickAndwait", "click");
				Thread.sleep(2000);
				GuidewireAutomate("Transactions", MenuCC_Claim_Financials_Transactions, "clickAndwait", "click");
				break;
			case "Financials Checks" :
				GuidewireAutomate("Financials", MenuCC_Claim_Financials, "clickAndwait", "click");
				Thread.sleep(2000);
				GuidewireAutomate("Checks", MenuCC_Claim_Financials_Checks, "clickAndwait", "click");
				break;
			case "Notes" :
				GuidewireAutomate("Notes", MenuCC_Claim_Notes, "clickAndwait", "click");
				break;
			case "Documents" :
				GuidewireAutomate("Documents", MenuCC_Claim_Documents, "clickAndwait", "click");
				break;
			case "Plan of Action" :
				GuidewireAutomate("Plan of Action", MenuCC_Claim_PlanofAction, "clickAndwait", "click");
				break;
			case "PlanofAction Evaluations" :
				GuidewireAutomate("Plan of Action", MenuCC_Claim_PlanofAction, "clickAndwait", "clickAndwait");
				Thread.sleep(2000);
				GuidewireAutomate("Evaluations", MenuCC_Claim_PlanofAction_Evaluations, "clickAndwait", "click");
				break;
			case "PlanofAction Negotiations" :
				GuidewireAutomate("Plan of Action", MenuCC_Claim_PlanofAction, "clickAndwait", "click");
				Thread.sleep(2000);
				GuidewireAutomate("Negotiations", MenuCC_Claim_PlanofAction_Negotiations, "clickAndwait", "click");
				break;
			case "Services" :
				GuidewireAutomate("Services", MenuCC_Claim_Services, "clickAndwait", "click");
				break;
			case "Litigation" :
				GuidewireAutomate("Litigation", MenuCC_Claim_Litigation, "clickAndwait", "click");
				break;
			case "History" :
				GuidewireAutomate("History", MenuCC_Claim_History, "clickAndwait", "click");
				break;
			case "FNOL Snapshot" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				break;
			case "FNOLSnapshot LossDetails" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Loss Details", MenuCC_Claim_FNOLSnapshot_LossDetials, "clickAndwait", "click");
				break;
			case "FNOLSnapshot PartiesesInvolved" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Partieses Involved", MenuCC_Claim_FNOLSnapshot_PartiesInvolced, "clickAndwait", "click");
				break;
			case "FNOLSnapshot Policy" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Policy", MenuCC_Claim_FNOLSnapshot_Policy, "clickAndwait", "click");
				break;
			case "FNOLSnapshot Exposures" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Exposures", MenuCC_Claim_FNOLSnapshot_Exposure, "clickAndwait", "click");
				break;
			case "FNOLSnapshot Notes" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Notes", MenuCC_Claim_FNOLSnapshot_Notes, "clickAndwait", "click");
				break;
			case "FNOLSnapshot Documents" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Documents", MenuCC_Claim_FNOLSnapshot_Document, "clickAndwait", "click");
				break;
			case "FNOLSnapshot AdditionalFileds" :
				GuidewireAutomate("FNOL Snapshot", MenuCC_Claim_FNOLSnapshot, "clickAndwait", "click");
				GuidewireAutomate("Additional Fileds", MenuCC_Claim_FNOLSnapshot_AdditionalFileds, "clickAndwait", "click");
				break;
			case "Calendar" :
				GuidewireAutomate("Calendar", MenuCC_Claim_Calendar, "clickAndwait", "click");
				break;
			case "My Calendar" :
				GuidewireAutomate("Calendar", MenuCC_Claim_Calendar, "clickAndwait", "click");
				GuidewireAutomate("My Calendar", MenuCC_Claim_Calendar_MyCalender, "clickAndwait", "click");
				break;
			case "Supervisor Calender" :
				GuidewireAutomate("Calendar", MenuCC_Claim_Calendar, "clickAndwait", "click");
				GuidewireAutomate("Supervisor Calender", MenuCC_Claim_Calendar_SupervisorCalender, "clickAndwait", "click");
				break;

			/*
			 * Administration
			 */

			/*
			 * Users&Security
			 */
			case "UsersAndSecurity" :
				GuidewireAutomate("Users and Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				break;
			case "Users" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				Thread.sleep(1000);
				GuidewireAutomate("Users", MenuCC_UserAndSecurity_Users, "clickAndwait", "click");
				break;
			case "Groups" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				GuidewireAutomate("Groups", MenuCC_UserAndSecurity_Groups, "clickAndwait", "click");
				break;
			case "Roles" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				Thread.sleep(1000);
				GuidewireAutomate("Roles", MenuCC_UserAndSecurity_Roles, "clickAndwait", "click");
				break;
			case "Regions" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				GuidewireAutomate("Regions", MenuCC_UserAndSecurity_Regions, "clickAndwait", "click");
				break;
			case "Security Zones" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				GuidewireAutomate("Security Zones", MenuCC_UserAndSecurity_SecurityZones, "clickAndwait", "click");
				break;
			case "Authority Limit Profile" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				GuidewireAutomate("Authority Limit Profile", MenuCC_UserAndSecurity_AuthorityLimitProfile, "click", "click");
				break;
			case "Attributes" :
				GuidewireAutomate("Users_and_Security", MenuCC_Administration_UsersAndSecurity, "clickAndwait", "click");
				GuidewireAutomate("Attributes", MenuCC_UserAndSecurity_Attributes, "clickAndwait", "click");
				break;

			/*
			 * SpecialHandling
			 */
			case "Accounts" :
				GuidewireAutomate("Special Handling", MenuCC_Administration_SpecialHandling, "clickAndwait", "click");
				GuidewireAutomate("Accounts", MenuCC_SpecialHandling_Accounts, "clickAndwait", "click");
				break;
			case "Service Tiers" :
				GuidewireAutomate("Special Handling", MenuCC_Administration_SpecialHandling, "clickAndwait", "click");
				GuidewireAutomate("Service Tiers", MenuCC_SpecialHandling_ServiceTiers, "clickAndwait", "click");
				break;

			/*
			 * BusinessSettings
			 */
			case "Business Rules" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "clickAndwait", "click");
				break;
			case "Business Rules Direct" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				getStaleElement("Business_Settings", MenuCC_Administration_BusinessSettings);
				GuidewireAutomate("Business Rules", MenuCC_BusinessSetting_BusinessRules, "clickAndwait", "click");
				break;
			case "Activity Rules" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "clickAndwait", "click");
				GuidewireAutomate("Activity Rules", MenuCC_BusinessSettings_BusinessRules_ActvityRules, "clickAndwait", "click");
				break;
			case "Exposure Rules" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "clickAndwait", "click");
				GuidewireAutomate("Exposure Rules", MenuCC_BusinessSettings_BusinessRules_ExposureRules, "clickAndwait", "click");
				break;
			case "Reserve Rules" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "clickAndwait", "click");
				GuidewireAutomate("Reserve Rules", MenuCC_BusinessSettings_BusinessRules_ReserveRules, "clickAndwait", "click");
				break;
			case "Import Export Status" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Business Rules", MenuCC_BusinessSettings_BusinessRules, "clickAndwait", "click");
				GuidewireAutomate("Import Export Status", MenuCC_BusinessSettings_BusinessRules_ExportImportStatus, "click", "click");
				break;
			case "Activity Patterns" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				getStaleElement("Buisness Setting", MenuCC_Administration_BusinessSettings);
				GuidewireAutomate("Activity Patterns", MenuCC_BusinessSettings_ActivityPatterns, "clickAndwait", "click");
				break;
			case "Business Week" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Business Week", MenuCC_BusinessSettings_BusinessWeek, "clickAndwait", "click");
				break;
			case "Catastrophes" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Catastrophes", MenuCC_BusinessSettings_Catastrophes, "clickAndwait", "click");
				break;
			case "Coverage Verification" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Coverage Verification", MenuCC_BusinessSettings_CoverageVerification, "clickAndwait", "click");
				break;
			case "Invalid Coverage For Cause" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Coverage Verification", MenuCC_BusinessSettings_CoverageVerification, "clickAndwait", "click");
				GuidewireAutomate("Invalid Coverage For Cause", MenuCC_BusinessSettings_CoverageVerification_InvalidCoverageForCause, "clickAndwait", "click");
				break;
			/*
			 * Owner:Rahul Dixit
			 */
			case "New Exposure" :
				GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
				GuidewireAutomate("South Washington", Washington, "moveToElement", "moveToElement");
				Thread.sleep(2000);
				GuidewireAutomate("General Damage Insured party", OPtion1, "clickAndwait", "clickAndwait");

				break;
			case "Incompatible New Exposure" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Coverage Verification", MenuCC_BusinessSettings_CoverageVerification, "clickAndwait", "click");
				GuidewireAutomate("Incompatible New Exposure", MenuCC_BusinessSettings_CoverageVerification_IncompatibleNewExposure, "clickAndwait", "click");
				break;
			case "Possible Invalid Coverage" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Coverage Verification", MenuCC_BusinessSettings_CoverageVerification, "clickAndwait", "click");
				GuidewireAutomate("Possible Invalid Coverage", MenuCC_BusinessSettings_CoverageVerification_PossibleInvalidCoverage, "clickAndwait", "click");
				break;
			case "Holidays" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Holidays", MenuCC_BusinessSettings_Holidays, "clickAndwait", "click");
				break;
			case "ICD Codes" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("ICD Codes", MenuCC_BusinessSettings_ICDCodes, "clickAndwait", "click");
				break;
			case "Metrics & Thresholds" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Metrics & Thresholds", MenuCC_BusinessSettings_MetricsAndThresholds, "clickAndwait", "click");
				break;
			case "Reinsurance Thresholds" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("Reinsurance Thresholds", MenuCC_BusinessSettings_ReinsuranceThresholds, "click", "click");
				break;
			case "WC Parameters" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "clickAndwait", "click");
				break;
			case "Benefit Parameters" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "clickAndwait", "click");
				GuidewireAutomate("Benefit Parameters", MenuCC_BusinessSettings_WCParameters_BenefitParameters, "click", "click");
				break;
			case "PPD Min Max" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "clickAndwait", "click");
				GuidewireAutomate("PPD Min Max", MenuCC_BusinessSettings_WCParameters_PPDMinMax, "clickAndwait", "click");
				break;
			case "PPD Weeks" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "clickAndwait", "click");
				GuidewireAutomate("PPD Weeks", MenuCC_BusinessSettings_WCParameters_PPDWeeks, "clickAndwait", "click");
				break;
			case "Compensability Parameters" :
				GuidewireAutomate("Business_Settings", MenuCC_Administration_BusinessSettings, "clickAndwait", "click");
				GuidewireAutomate("WC Parameters", MenuCC_BusinessSettings_WCParameters, "clickAndwait", "click");
				GuidewireAutomate("Compensability Parameters", MenuCC_BusinessSettings_WCParameters_CompensabilityParameters, "clickAndwait", "click");
				break;
			// Monitoring SubMenu
			case "Message Queues" :
				GuidewireAutomate("Monitoring", MenuCC_Administration_Monitoring, "clickAndwait", "click");
				GuidewireAutomate("Message Queues", MenuCC_Monitoring_MessageQueues, "clickAndwait", "click");
				break;
			case "Workflows" :
				GuidewireAutomate("Monitoring", MenuCC_Administration_Monitoring, "clickAndwait", "click");
				GuidewireAutomate("Workflows", MenuCC_Monitoring_WorkFlows, "clickAndwait", "click");
				break;
			case "Workflow Statistics" :
				GuidewireAutomate("Monitoring", MenuCC_Administration_Monitoring, "clickAndwait", "click");
				GuidewireAutomate("Workflow Statistics", MenuCC_Monitoring_WorkFlowsStatistics, "clickAndwait", "click");
				break;
			// Utilities SubMenu
			case "Import Data" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Import Data", MenuCC_Utilities_ImportData, "clickAndwait", "click");
				break;
			case "Export Data" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Export Data", MenuCC_Utilities_ExportData, "clickAndwait", "click");
				break;
			case "Script Parameters" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Script Parameters", MenuCC_Utilities_ScriptParameters, "clickAndwait", "click");
				break;
			case "Data Change" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Data Change", MenuCC_Utilities_DataChange, "clickAndwait", "click");
				break;
			case "Inbound Files" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Inbound Files", MenuCC_Utilities_InboundFiles, "clickAndwait", "click");
				break;
			case "Outbound Files" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Outbound Files", MenuCC_Utilities_OutboundFiles, "clickAndwait", "click");
				break;
			case "Runtime Properties" :
				GuidewireAutomate("Utilities", MenuCC_Administration_Utilities, "clickAndwait", "click");
				GuidewireAutomate("Runtime Properties", MenuCC_Utilities_RuntimeProperties, "clickAndwait", "click");
				break;

			default :
				throw new IOException("No support for ClaimsCenter Menu : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.PASS, "Navigation to ClaimsCenter Menu : " + Menu + " is succesful");
	}

	public static void clickButton(String ButtonName) throws Throwable {
		switch (ButtonName) {

			case "Next" :
				GuidewireAutomate("Next", Next, "clickAndwait", "click");
				break;
			case "Finish" :
				GuidewireAutomate("Finish", Finish, "clickAndwait", "click");
				break;
			case "Update" :
				GuidewireAutomate("Update", Update_Button, "clickAndwait", "click");
				break;
			case "Cancel" :
				GuidewireAutomate("Cancel", Cancel_Button, "clickAndwait", "click");
				break;
			case "OK" :
				GuidewireAutomate("OK", OK, "clickAndwait", "click");
				break;
			case "Back" :
				GuidewireAutomate("Back", Back_Button, "clickAndwait", "click");
				break;
			case "Save" :
				GuidewireAutomate("Save", Save_Button, "clickAndwait", "click");
				break;
			case "Reserve Cancel" :
				GuidewireAutomate("Cancel", ReserveCancel_Button, "clickAndwait", "click");
				break;
			// Author - Pankaj
			case "NewExposure Cancel Button" :
				GuidewireAutomate("Cancel", ExposureCancel_Button, "clickAndwait", "click");
				break;
			case "Edit" :
				GuidewireAutomate("Edit", Edit_Button, "clickAndwait", "click");
				break;
			case "Policy Edit" :
				GuidewireAutomate("Edit", Policy_EditButton, "clickAndwait", "click");
				break;
			case "CoverageTermCancel" :
				GuidewireAutomate("Cancel", CoverageTermCancel, "clickAndwait", "click");
				break;
			case "Status Edit" :
				GuidewireAutomate("Edit", StatusEdit_Button, "clickAndwait", "click");
				break;
			case "Policy Edit Alert" :
				GuidewireAutomate("Edit", Policy_EditButton, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "alert");

				break;
			default :
				throw new IOException("No support for Button : " + ButtonName);
		}
	}

	public static String infoBar(String strLabel) throws Throwable {
		String strInfobar = null;

		switch (strLabel) {
			case "PolicyNumber" :
				strInfobar = getText_Element(PolicyNumber);
				UpdateData_ClaimsCenter("master", "PolicyNumber", strInfobar);
				break;
			case "DraftClaimNumber" :
				strInfobar = getText_Element(DraftClaimNumber);
				UpdateData_ClaimsCenter("master", "ClaimNumber", strInfobar);
				break;
			case "InsuredName" :
				strInfobar = getText_Element(InsuredName);
				UpdateData_ClaimsCenter("master", "InsuredName", strInfobar);
				break;
			case "LostDate" :
				strInfobar = getText_Element(LostDate);
				UpdateData_ClaimsCenter("master", "Date", strInfobar);
				break;
			case "Adjuster" :
				strInfobar = getText_Element(Adjuster);
				UpdateData_ClaimsCenter("master", "Adjuster", strInfobar);
				break;
			default :
				throw new IOException("No support for Label : " + strLabel);
		}
		oExtentTest.log(Status.INFO, " Fetched from Info Bar => " + strLabel + " = " + strInfobar);
		return strInfobar;
	}

	public static void Verify_WarningMessage() throws Throwable {

		try {
			GuidewireAutomate_Validation("Section", Validation_Results, "contains", "Validation Results");

			GuidewireAutomate_Validation(" Validate Error Msg", Error_Msg, "contains", "Warning: Loss Date or CMD/Reported Date");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static boolean ValidationResults_Clear() throws Throwable {
		Boolean bValidationResults = false;
		By      ValidationResults  = By.xpath("//div[@id='wsTabBar-wsTab_0']//div[@role='tab']");
		By      Clear              = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");

		if (IsElementDisplayed("ValidationResults", ValidationResults)) {
			GuidewireAutomate_Validation("Section", ValidationResults, "equals", "Validation Results");
			GuidewireAutomate("Clear", Clear, "clickAndwait", "click");
			bValidationResults = true;
		}

		return bValidationResults;
	}
}