package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_Litigation extends SeleniumWebDriver_Commands {

	public CC_Litigation(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}
	private static By Screen_Header   = By.xpath("//div[@class='gw-TitleBar--title']");
	private static By NewMatterButton = By.xpath("//div[contains(@id,'NewMatterButton')]//div[@role='button']");

	private static By MatterType          = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-MatterType']");
	private static By Name                = By.xpath("//input[@name='NewMatter-NewMatterScreen-NewMatterDV-Matter_Name']");
	private static By CaseNumber          = By.xpath("//input[@name='NewMatter-NewMatterScreen-NewMatterDV-Matter_CaseNumber']");
	private static By PlaintiffMenuIcon   = By.xpath("//div[contains(@id,'PlaintiffMenuIcon')]/div[@class='gw-action--expand-button']/div[@class='gw-icon gw-icon--expand']");
	private static By PlaintiffNewPerson  = By.xpath("//div[contains(@id,'Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson')]//div[text()='New Person']");
	private static By PlaintiffNewVendor  = By.xpath("//div[contains(@id,'Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor')]//div[text()='New Vendor']");
	private static By PlaintiffNewCompany = By.xpath("//div[contains(@id,'Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany')]//div[text()='New Company']");
	private static By PlaintiffNewLegal   = By.xpath("//div[contains(@id,'Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal')]//div[text()='New Legal']");
	private static By PlaintiffSearch     = By.xpath("//div[contains(@id,'Plaintiff-MenuItem_Search')]//div[@role='menuitem']");
	private static By Plaintiff           = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Plaintiff']");

	private static By DefendantMenuIcon   = By.xpath("//div[contains(@id,'DefendantMenuIcon')]/div[@class='gw-action--expand-button']/div[@class='gw-icon gw-icon--expand']");
	private static By DefendantNewPerson  = By.xpath("//div[contains(@id,'Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson')]//div[text()='New Person']");
	private static By DefendantNewVendor  = By.xpath("//div[contains(@id,'Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor')]//div[text()='New Vendor']");
	private static By DefendantNewCompany = By.xpath("//div[contains(@id,'Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany')]//div[text()='New Company']");
	private static By DefendantNewLegal   = By.xpath("//div[contains(@id,'Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal')]//div[text()='New Legal']");
	private static By DefendantSearch     = By.xpath("//div[contains(@id,'Defendant-MenuItem_Search')]//div[@role='menuitem']");
	private static By Defendant           = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Defendant']");

	private static By RelatedToSubrogationYes = By.xpath("//input[contains(@id,'TrialDetails_SubroRelated_0')]");
	private static By RelatedToSubrogationNo  = By.xpath("//input[contains(@id,'TrialDetails_SubroRelated_1')]");
	private static By CourtType               = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-CourtType']");
	private static By CourtDistrict           = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-CourtDistrict']");
	private static By LegalSpecialty          = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-LegalSpecialty']");
	private static By PrimaryCause            = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-TrialDetails_PrimaryCause']");

	private static By PlaintiffAttorney = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney']");
	private static By PlaintiffLawFirm  = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm']");
	private static By DefenseAttorney   = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney']");
	private static By DefenseLawFirm    = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm']");

	private static By Owner        = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Matter_AssignActivity']");
	private static By UpdateButton = By.xpath("//div[@id='NewMatter-NewMatterScreen-Update']//div[@role='button']");

	private static By NewMatter_Name               = By.xpath("//input[@name='NewMatter-NewMatterScreen-NewMatterDV-Matter_Name']");
	private static By Contact_AddButton            = By.xpath("//div[contains(@id,'EditableClaimContactRolesLV_tb-Add')]//div[@role='button']");
	private static By Contact_Role                 = By.xpath("//select[contains(@name,'EditableClaimContactRolesLV-1-Role')]");
	private static By DefenceAttorney_Error        = By.xpath("//div[contains(@id,'ClaimContacts-ClaimContactsScreen-_msgs-0-0')]//div[@class='gw-message']");
	private static By Contact_EditButton           = By.xpath("//div[contains(@id,'ClaimContacts-ClaimContactsScreen-_msgs-0-0')]//div[@class='gw-message']");
	private static By Plaintiff_OptionButton       = By.xpath("//div[contains(@id,'Counsel_PlaintiffAttorneyMenuIcon')]//div[@role='button']");
	private static By Plaintiff_NewPerson          = By.xpath("//div[contains(@id,'ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem')]//div[@role='menuitem']");
	private static By LawFirm_OptionButton         = By.xpath("//div[contains(@id,'Counsel_PlaintiffLawFirmMenuIcon')]//div[@role='button']");
	private static By LawFirm_NewCompany           = By.xpath("//div[contains(@id,'NewCompanyOnlyPickerMenuItemSet_NewCompanyMenuItem')]//div[@role='menuitem']");
	private static By DefenceAttorney_OptionButton = By.xpath("//div[contains(@id,'Counsel_DefenseAttorneyMenuIcon')]//div[@role='button']");
	private static By DefenceAttorney_NewCompany   = By.xpath("//div[contains(@id,'NewPersonAttorneyPicker_ExtMenuItemSet_NewPerson')]//div[@role='menuitem']");
	private static By Matter_ArbitrationDate       = By.xpath("//input[@name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-ArbitrationDetails_TrialDate']");
	private static By Matter_HearingDate           = By.xpath("//input[@name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-HearingDetails_HearingDate']");
	private static By Matter_SelectedLink          = By.xpath("//div[contains(@id,'MattersLV-0-Name_button')]");
	private static By Mediation_Date               = By.xpath("//input[(@name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_MediationDate')]");
	private static By Contact_PlaintiffLawFirm     = By.xpath("//select[contains(@name,'Counsel_PlaintiffLawFirm')]");
	private static By Contact_PlaintiffAttorney    = By.xpath("//select[contains(@name,'Counsel_PlaintiffAttorney')]");
	private static By Contact_DefenceLawFirm       = By.xpath("//select[contains(@name,'MatterDetailsDV-Counsel_DefenseLawFirm')]");
	private static By Contact_DefenceAttorney      = By.xpath("//select[contains(@name,'MatterDetailsDV-Counsel_DefenseAttorney')]");
	private static By TrialVenue                   = By.xpath("//div[@class='gw-label' and text()='Coverage In Question']");
	private static By ArbitrayionVenue             = By.xpath("//div[@class='gw-label' and text()='Coverage In Question']");
	private static By HearingVenue                 = By.xpath("//div[@class='gw-label' and text()='Coverage In Question']");
	private static By Litigation_venue             = By.xpath("//div[contains(@id,'MatterDetailsDV-Venue_Ext_Input')]//div[@class='gw-label' and text()='Venue']");
	private static By Venue_OptionButton           = By.xpath("//div[contains(@id,'MatterDetailsDV-Venue_Ext-Venue_ExtMenuIcon')]//div[@role='button' ]");
	private static By Venue_NewLegal               = By.xpath("//div[@id='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-Venue_Ext-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal']//div[text()='New Legal' ]");
	private static By Venue_Search                 = By.xpath("//div[contains(@id,'MatterDetailsDV-Venue_Ext-Venue_ExtMenuIcon')]//div[text()='Search' ]");
	private static By Venue_ContactDetails         = By.xpath("//div[contains(@id,'MatterDetailsDV-Venue_Ext-Venue_ExtMenuIcon')]//div[text()='View Contact Details' ]");
	private static By Matter_MediationDate         = By.xpath("//input[@name='MatterDetailPage-MatterDetailScreen-MatterDetailsDV-MediationDetails_MediationDate']");
	private static By Matter_Room                  = By.xpath("//div[contains(@id,'MediationDetails_Room_Input')]");
	private static By Matter_Mediator              = By.xpath("//div[contains(@id,'MediationDetails_Mediator_Input')]//div[@class='gw-label' and text()='Mediator']");
	private static By Matter_Type                  = By.xpath("//select[contains(@name,'NewMatterDV-MatterType')]");
	private static By Matter_Exposure              = By.xpath("//div[contains(@id,'EditableMatterExposures_ExtLV')]//div[@role='heading']");
	private static By Matter_Exposure_AddButton    = By.xpath("//div[contains(@id,'EditableMatterExposures_ExtLV_tb-Add')]//div[@role='button']");
	private static By Matter_Exposure1             = By.xpath("//select[contains(@name,'EditableMatterExposures_ExtLV-0-Exposure')]");
	private static By Matter_Exposure2             = By.xpath("//select[contains(@name,'EditableMatterExposures_ExtLV-1-Exposure')]");
	private static By ExposureLV                   = By.xpath("//div[contains(@id,'EditableMatterExposures_ExtLV')]");
	private static By Matter_ExposureCheck         = By.xpath("//input[contains(@name,'EditableMatterExposures_ExtLV-0-_Checkbox')]");
	private static By Matter_ExposureRemoveButton  = By.xpath("//div[contains(@id,'EditableMatterExposures_ExtLV_tb-Remove')]//div[@role='button']");

	public static void Litigation_Matter() throws Throwable {

		try {

			GuidewireAutomate_Validation("Header", Screen_Header, "equals", "Matters");
			GuidewireAutomate("New Matter Button", NewMatterButton, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void Litigation_NewMatter() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Litigation");

		try {

			GuidewireAutomate_Validation("Header", Screen_Header, "equals", "New Matter");

			GuidewireAutomate_Validation("Matter Type", MatterType, "getOptionscontains", lhm_TestCase_Table_Data.get("MatterTypeDropDown"));
			GuidewireAutomate("Matter Type Select", MatterType, "selectByVisibleText", lhm_TestCase_Table_Data.get("MatterTypeSelect"));
			GuidewireAutomate("Name", Name, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Name"));
			GuidewireAutomate("Case Number", CaseNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CaseNumber"));
			GuidewireAutomate("Plaintiff Menu Icon", PlaintiffMenuIcon, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Plaintiff New Person", PlaintiffNewPerson, "equals", "New Person");
			GuidewireAutomate_Validation("Plaintiff New Vendor", PlaintiffNewVendor, "equals", "New Vendor");
			GuidewireAutomate_Validation("Plaintiff New Company", PlaintiffNewCompany, "equals", "New Company");
			GuidewireAutomate_Validation("Plaintiff New Legal", PlaintiffNewLegal, "equals", "New Legal");
			GuidewireAutomate_Validation("Plaintiff Search", PlaintiffSearch, "equals", "Search");
			GuidewireAutomate("Plaintiff Select", Plaintiff, "selectByVisibleText", lhm_TestCase_Table_Data.get("Plaintiff"));
			GuidewireAutomate("Plaintiff Select", Defendant, "selectByVisibleText", lhm_TestCase_Table_Data.get("Defendant"));
			GuidewireAutomate("Related To Subrogation No", RelatedToSubrogationNo, "clickAndwait", "clickAndwait");

			GuidewireAutomate("Court Type", CourtType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CourtType"));
			GuidewireAutomate("Court District", CourtDistrict, "selectByVisibleText", lhm_TestCase_Table_Data.get("CourtDistrict"));
			GuidewireAutomate("Legal Specialty", LegalSpecialty, "selectByVisibleText", lhm_TestCase_Table_Data.get("LegalSpecialty"));
			GuidewireAutomate("Primary Cause", PrimaryCause, "selectByVisibleText", lhm_TestCase_Table_Data.get("PrimaryCause"));

			GuidewireAutomate("Owner", Owner, "selectByVisibleText", lhm_TestCase_Table_Data.get("Owner"));

			GuidewireAutomate("Update Button", UpdateButton, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	/*
	 * Owner: Rahul Dixit Date : 24/01/22
	 */
	public static void NewMatterInfo() throws Throwable {
		try {
			GuidewireAutomate("Name ", NewMatter_Name, "clearANDsendKeys", "Automation");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 10/02/22
	 */
	public static void VerifyLVDisplayExposures() throws Throwable {
		try {
			GuidewireAutomate_Validation("ExposureLV", ExposureLV, "contains", "Exposures");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 11/02/22
	 */
	public static void VerifyErrorMessageDefenseAttorney() throws Throwable {
		try {
			GuidewireAutomate("Edit Button", Contact_EditButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Add Button", Contact_AddButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Contact Role", Contact_Role, "selectByVisibleText", "Primary Defence Attorney");
			CC_Reusables.clickButton("Update");
			GuidewireAutomate_Validation("Defence Attorney Error", DefenceAttorney_Error, "contains", "Primary Defense Attorney");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 11/02/22
	 */
	public static void VerifyNewLegalReplacedWithNewPersonInPlaintiffAttorney() throws Throwable {
		try {
			GuidewireAutomate("Plaintiff Options Button", Plaintiff_OptionButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Plaintiff new Person", Plaintiff_NewPerson, "equals", "New Person");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 11/02/22
	 */
	public static void VerifyNewLegalReplacedWithNewCompanyInLawFirm() throws Throwable {
		try {
			GuidewireAutomate("LawFirm Options Button", LawFirm_OptionButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Plaintiff new Person", LawFirm_NewCompany, "equals", "New Company");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 11/02/22
	 */
	public static void VerifyNewLegalReplacedWithNewPersonInDefenceAttorney() throws Throwable {
		try {
			GuidewireAutomate("Defence Attorney Options Button", DefenceAttorney_OptionButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Defence Attorney new Person", DefenceAttorney_NewCompany, "equals", "New Person");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 10/02/22
	 */
	public static void VerifyLVExposureRemovedByRemoveButton() throws Throwable {
		try {
			GuidewireAutomate("Matter_ExposureCheck", Matter_ExposureCheck, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Matter_ExposureRemoveButton", Matter_ExposureRemoveButton, "clickAndwait", "clickAndwait");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * Owner: Rahul Dixit Date : 10/02/22
	 */
	public static void VerifyMatterTypeIsDefaultedToGeneral() throws Throwable {
		try {
			GuidewireAutomate_Validation("Matter Type", Matter_Type, "contains", "General");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 10/02/22
	 */
	public static void VerifyNewLVCreatedAboveStatusLine() throws Throwable {
		try {
			getStaleElement("Matter_Exposure", Matter_Exposure);
			GuidewireAutomate_Validation("Matter Exposure", Matter_Exposure, "equals", "Exposures");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 10/02/22
	 */
	public static void VerifyExposureLVHasAddButton() throws Throwable {
		try {
			getStaleElement("Matter_Exposure_AddButton", Matter_Exposure_AddButton);
			GuidewireAutomate_Validation("Matter Exposure Add Button", Matter_Exposure_AddButton, "equals", "Add");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * Owner: Rahul Dixit Date : 10/02/22
	 */
	public static void VerifyLawSuitMediationArbitrationHearingRetiredFromMatterType() throws Throwable {
		String typeListValue1 = "Law Suit";
		String typeListValue2 = "Arbitration";
		String typeListValue3 = "Mediation";
		String typeListValue4 = "Hearing";
		try {
			// GuidewireAutomate("Coverage Section", Coverages, "clickAndwait", "click");
			String MatterType = getOptions_Element(Matter_Type);
			if (MatterType.contains(typeListValue1) && MatterType.contains(typeListValue2) && MatterType.contains(typeListValue3) && MatterType.contains(typeListValue4)) {
				oExtentTest.log(Status.FAIL, "Law Suit , Arbitration,mediation,Hearing Fields Not  Retired From Matter Type");
			} else {
				oExtentTest.log(Status.PASS, "Law Suit , Arbitration,mediation,Hearing Fields Retired From Matter Type");;

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}
	/*
	 * Owner: Rahul Dixit Date : 10/02/2022
	 */
	public static void VerifyMediationRoomMediatorFieldsAdded() throws Throwable {
		try {
			GuidewireAutomate_Validation("Mediation Date", Mediation_Date, "contains", "");
			GuidewireAutomate_Validation("Room", Matter_Room, "equals", "Room");
			getStaleElement("Room", Matter_Room);
			GuidewireAutomate_Validation("Mediator", Matter_Mediator, "contains", "Mediator");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 14/02/2022
	 */
	public static void LitigationDatesInfoForError() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Litigation");

		try {
			GuidewireAutomate("Matter selected", Matter_SelectedLink, "clickAndwait", "clickAndwait");
			CC_Reusables.clickButton("Edit");
			GuidewireAutomate("Mediation Date", Matter_MediationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Mediation_Date"));
			GuidewireAutomate("Arbitration Date", Matter_ArbitrationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Arbitration_Date"));
			GuidewireAutomate("Hearing Date", Matter_HearingDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Hearing_Date"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 14/02/2022
	 */
	public static void VerifyPlantiffLawFirmDropdownIncludeAllCompanyContact() throws Throwable {

		try {
			GuidewireAutomate("Matter selected", Matter_SelectedLink, "clickAndwait", "clickAndwait");
			CC_Reusables.clickButton("Edit");
			GuidewireAutomate_Validation("Plantiff Law Firm", Contact_PlaintiffLawFirm, "contains", "Plantiff Law Firm");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 14/02/2022
	 */
	public static void VerifyPlantiffAttorneyDropdownIncludeAllPersonContact() throws Throwable {

		try {
			GuidewireAutomate("Matter selected", Matter_SelectedLink, "clickAndwait", "clickAndwait");
			CC_Reusables.clickButton("Edit");
			GuidewireAutomate_Validation("Plantiff Attorney", Contact_PlaintiffAttorney, "contains", "Primary Defense Law Firm");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 14/02/2022
	 */
	public static void VerifyDefenceLawFirmDropdownIncludeAllPersonContact() throws Throwable {

		try {
			GuidewireAutomate("Matter selected", Matter_SelectedLink, "clickAndwait", "clickAndwait");
			CC_Reusables.clickButton("Edit");
			GuidewireAutomate_Validation("Defence Law Firm", Contact_DefenceLawFirm, "contains", "Defence Law Firm");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 14/02/2022
	 */
	public static void VerifyVenueFieldIsAddedInLitigationDetails() throws Throwable {

		try {
			GuidewireAutomate("Matter selected", Matter_SelectedLink, "clickAndwait", "clickAndwait");
			CC_Reusables.clickButton("Edit");
			GuidewireAutomate_Validation("Venue Field", Litigation_venue, "equals", "Venue");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 14/02/2022
	 */
	public static void VerifyVenueFieldOptions() throws Throwable {

		try {
			GuidewireAutomate("Matter selected", Matter_SelectedLink, "clickAndwait", "clickAndwait");
			CC_Reusables.clickButton("Edit");
			GuidewireAutomate("Venue Field option Button", Venue_OptionButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("VenueNewLegal", Venue_NewLegal, "equals", "New Legal");
			GuidewireAutomate_Validation("Venue_Search", Venue_Search, "equals", "Search");
			GuidewireAutomate_Validation("Venue_ContactDetails", Venue_ContactDetails, "equals", "View Contact Details");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner: Rahul Dixit Date : 14/02/2022
	 */
	public static void VerifyTrialArbitrationHearingVenueRemoved() throws Throwable {

		try {
			GuidewireAutomate("Matter selected", Matter_SelectedLink, "clickAndwait", "clickAndwait");
			CC_Reusables.clickButton("Edit");
			VerifyElementNotExist("Trial Venue", TrialVenue);
			VerifyElementNotExist("Arbitration Venue", ArbitrayionVenue);
			VerifyElementNotExist("Hearing Venue", HearingVenue);

			oExtentTest.log(Status.PASS, " Trial Arbitration and Hearing Venue Fields is Removed");
		} catch (NoSuchElementException e) {
			oExtentTest.log(Status.FAIL, " Trial Arbitration and Hearing Venue Fields is Not  Removed");
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner: Rahul Dixit Date : 14/02/2022
	 */
	public static void VerifyDefenceAttorneyDropdownIncludeAllPersonContact() throws Throwable {

		try {
			GuidewireAutomate("Matter selected", Matter_SelectedLink, "clickAndwait", "clickAndwait");
			CC_Reusables.clickButton("Edit");
			GuidewireAutomate_Validation("Defense Attorney", Contact_DefenceAttorney, "contains", "Defense Attorney");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	/*
	 * Owner : Rahul Dixit
	 */
	public static void VerifyUserCanSelectMultipleMatterExposure() throws Throwable {
		try {

			GuidewireAutomate("MatterExposure_AddButton", Matter_Exposure_AddButton, "clickAndwait", "click");
			GuidewireAutomate("Exposure1", Matter_Exposure1, "selectByVisibleText", "(1) 1st Party General - Cyber E&O");
			GuidewireAutomate("MatterExposure_AddButton", Matter_Exposure_AddButton, "clickAndwait", "click");
			GuidewireAutomate("Exposure2", Matter_Exposure2, "selectByVisibleText", "(2) 1st Party General - Hans Molman");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

}
