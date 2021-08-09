package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_PolicyInfo_PO {

	final By PolicyInfo_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]/div[text()='Policy Info']");

	final By PI_DateQuoteNeeded                                            = By.xpath("//input[contains(@name,'DateQuoteNeeded')]");
	final By PrimaryNamedInsured_ChangeTo_Button                           = By.xpath("//div[contains(@id,'ChangePrimaryNamedInsuredButtonMenuIcon')]");
	final By PrimaryNamedInsured_ChangeTo_NewPerson                        = By.xpath("//div[contains(@id,'ChangePrimaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	final By PrimaryNamedInsured_ChangeTo_FromAddressBook                  = By.xpath("//div[contains(@id,'ChangePrimaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='From Address Book']");
	final By PrimaryNamedInsured_ChangeTo_ExistingContact                  = By.xpath("//div[contains(@id,'ChangePrimaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Existing Contact']");
	final By PrimaryNamedInsured_Name                                      = By.xpath("//div[contains(@id,'AccountInfoInputSet-Name')]//div[contains(@id,'AccountInfoInputSet-Name_button')]");
	final By PrimaryNamedInsured_Phone                                     = By.xpath("//div[contains(@id,'AccountInfoInputSet-Phone-GlobalPhoneInputSet-PhoneDisplay')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	final By PrimaryNamedInsured_PolicyAddress_ChangeTo_Button             = By.xpath("//div[contains(@id,'ChangePolicyAddressButton-ChangePolicyAddressButtonMenuIcon')]");
	final By PrimaryNamedInsured_PolicyAddress_ChangeTo_NewAdress          = By
			.xpath("//div[contains(@id,'ChangePolicyAddressButton-ChangePolicyAddressButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	final By PrimaryNamedInsured_PolicyAddress_ChangeTo_EditCurrentAddress = By
			.xpath("//div[contains(@id,'ChangePolicyAddressButton-ChangePolicyAddressButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Edit Current Address']");
	final By PrimaryNamedInsured_PolicyAddress                             = By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressSummary')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	final By PrimaryNamedInsured_County                                    = By.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	final By PrimaryNamedInsured_AddressType                               = By.xpath("//div[contains(@id,'AddressType') and contains(@class,'gw-ValueWidget')]//div[contains(@class,'gw-label')]");
	final By PrimaryNamedInsured_AddressDescription                        = By.xpath("//div[contains(@id,'AddressDescription') and contains(@class,'gw-ValueWidget')]//div[contains(@class,'gw-value-readonly-wrapper')]");

	/*
	 * Official IDs
	 */
	final By PI_OfficialID = By.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Official IDs']");
	final By PI_OI_SSN     = By.xpath("//input[contains(@name,'OfficialIDDV_Input')]");

	/*
	 * Secondary Named Insured
	 */
	final By PI_SecondaryNamedInsured = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Secondary Named Insured']");

	final By SecondaryNamedInsured_Add_Button          = By.xpath("//div[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]");
	final By SecondaryNamedInsured_Add_NewPerson       = By.xpath("//div[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	final By SecondaryNamedInsured_Add_FromAddressBook = By.xpath("//div[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='From Address Book']");
	final By SecondaryNamedInsured_Add_ExistingContact = By.xpath("//div[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Existing Contact']");

	/*
	 * Additional Named Insureds
	 */
	final By PI_AdditionalNamedInsureds = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Additional Named Insureds']");

	final By AdditionalNamedInsured_Add_Button          = By.xpath("//div[contains(@id,'AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton')]//div[text()='Add']");
	final By AdditionalNamedInsured_Add_NewPerson       = By.xpath("//div[contains(@id,'AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	final By AdditionalNamedInsured_Add_FromAddressBook = By.xpath("//div[contains(@id,'AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='From Address Book']");
	final By AdditionalNamedInsured_Add_ExistingContact = By.xpath("//div[contains(@id,'AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Existing Contact']");

	/*
	 * Policy Details
	 */
	final By PI_PolicyDetails = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Policy Details']");

	final By PI_PD_TermType           = By.xpath("//select[contains(@name,'PolicyInfoInputSet-TermType')]");
	final By PI_PD_TermNumber         = By.xpath("//div[contains(@id,'PolicyInfoInputSet-TermNumber')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	final By PI_PD_EffectiveDate      = By.xpath("//input[contains(@name,'PolicyInfoInputSet-EffectiveDate')]");
	final By PI_PD_ExpirationDateEdit = By.xpath("//input[contains(@name,'PolicyInfoInputSet-ExpirationDate')]");
	final By PI_PD_ExpirationDate     = By.xpath("//div[contains(@id,'PolicyInfoInputSet-ExpirationDate')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	final By PI_PD_WrittenDate        = By.xpath("//input[contains(@name,'PolicyInfoInputSet-WrittenDate')]");
	final By PI_PD_RateAsOfDate       = By.xpath("//div[contains(@id,'PolicyInfoInputSet-RateAsOfDate')]//div[contains(@class,'gw-value-readonly-wrapper')]");

	final By PI_PD_PrefferedLanguage = By.xpath("//select[contains(@name,'PolicyInfoInputSet-PrimaryLanguage')]");

	/*
	 * Affinity Group
	 */
	final By PI_AffinityGroup = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Affinity Group']");

	final By PI_AG_Name = By.xpath("//input[contains(@name,'PolicyInfoInputSet-AffinityGroup')]");

	/*
	 * Producer of Record
	 */
	final By PI_ProducerofRecord = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Producer of Record']");

	final By PI_PR_Organization = By.xpath("//input[contains(@name,'PolicyInfoProducerOfRecordInputSet-Producer')]");
	final By PI_PR_ProducerCode = By.xpath("//select[contains(@name,'PolicyInfoProducerOfRecordInputSet-ProducerCode')]");

	/*
	 * Underwriting Companies
	 * 
	 */
	final By PI_UnderwritingCompanies = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Underwriting Companies']");

	final By PI_UC_Name = By.xpath("//select[contains(@name,'UWCompanyInputSet-UWCompany')]");

	/*
	 * Modules
	 * 
	 * void policyInfo() throws Throwable;
	 * 
	 * void primaryNamedInsured() throws Throwable;
	 * 
	 * void primaryNamedInsured_ChangeTo_NewPerson() throws Throwable;
	 * 
	 * void primaryNamedInsured_ChangeTo_FromAddressBook() throws Throwable;
	 * 
	 * void primaryNamedInsured_ChangeTo_ExistingContact() throws Throwable;
	 * 
	 * void primaryNamedInsured_Edit() throws Throwable;
	 * 
	 * void policyAddress() throws Throwable;
	 * 
	 * void policyAddress_ChangeTo_NewAddress() throws Throwable;
	 * 
	 * void policyAddress_ChangeTo_EditCurrentAddress() throws Throwable;
	 * 
	 * void pi_OfficialID() throws Throwable;
	 * 
	 * void secondaryInsured_NewPerson() throws Throwable;
	 * 
	 * void secondaryInsured_FromAddressBook() throws Throwable;
	 * 
	 * void secondaryInsured_ExistingContact() throws Throwable;
	 * 
	 * void additionalNamedInsured_Add_NewCompany() throws Throwable;
	 * 
	 * void additionalNamedInsured_Add_NewPerson() throws Throwable;
	 * 
	 * void additionalNamedInsured_Add_FromAddresssBook() throws Throwable;
	 * 
	 * void additionalNamedInsured_Edit() throws Throwable;
	 * 
	 * void additionalNamedInsured_Remove() throws Throwable;
	 * 
	 * void policyDetails() throws Throwable;
	 * 
	 * void affinityGroup() throws Throwable;
	 * 
	 * void producerOfRecord() throws Throwable;
	 * 
	 * void underWritingCompany() throws Throwable;
	 */

}
