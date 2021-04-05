package com.pages.Guidewire.WorkersCompensation;

import org.openqa.selenium.By;

public interface WC_Qualification_PO {

	final By submission_number=By.xpath("//div[@id='SubmissionWizard-MultiQuoteAcceleratedMenuActions']/following-sibling::div[@class='gw-Wizard--titles']/descendant::div[@class='gw-Wizard--Title']");
	final By submission_status=By.xpath("//div[@id='SubmissionWizard-MultiQuoteAcceleratedMenuActions']/following-sibling::div[@class='gw-Wizard--titles']/descendant::div[@class='gw-Wizard--SubTitle']");
	final By Do_employees_deep_fry_foods=By.id("SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost_0");
	final By Does_your_business_handle_fuels_or_any_explosive_materials=By.id("SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_NoPost_0");
	final By Do_any_employees_operate_motorized_vehicles_as_part_of_normal_job_responsibilities=By.id("SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_NoPost_0");
	final By Does_your_business_operate_24_hours_day=By.id("SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_NoPost_0");
	final By Total_annual_payroll=By.xpath("//div[@id='SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-4-QuestionModalInput-IntegerFieldInput_NoPost']/descendant::input[@type='text']");
	final By Is_your_business_unionized=By.id("SubmissionWizard-SubmissionWizard_PreQualificationScreen-PreQualQuestionSetsDV-QuestionSetsDV-0-QuestionSetLV-5-QuestionModalInput-BooleanRadioInput_NoPost_0");
	final By next=By.id("SubmissionWizard-Next");
	final By validation_error=By.id("SubmissionWizard-SubmissionWizard_PreQualificationScreen-_msgs-0");
	final By validation_text=By.xpath("//div[@id='SubmissionWizard-SubmissionWizard_PreQualificationScreen-_msgs-0-0']/descendant::div[@class='gw-message']");

	
	
	
}
