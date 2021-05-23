package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Qualification_PO {

	final By QU_PA_PreQualification = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='PA Pre-Qualification']");

	final By QU_IsApplicantCurrentlyInsured                                                = By.xpath("//select[contains(@name,'QuestionSetLV-0-QuestionModalInput-ChoiceSelectInput_NoPost')]");
	final By QU_IsApplicantLicenseCurrently_suspended_canceled_Revoked                     = By.xpath("//input[contains(@id,'QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	final By QU_Has_the_applicants_license_ever_been_canceled_suspended_or_revoked         = By.xpath("//input[contains(@id,'QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	final By QU_Anydriverswithconvictionsformovingtrafficviolationswithinthepast3years     = By.xpath("//input[contains(@id,'QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_1')]");
	final By QU_Hasanypolicyorcoveragebeendeclined_canceled_NonRenewedduringtheprior3years = By.xpath("//input[contains(@id,'QuestionSetLV-4-QuestionModalInput-BooleanRadioInput_NoPost_1')]");

}
