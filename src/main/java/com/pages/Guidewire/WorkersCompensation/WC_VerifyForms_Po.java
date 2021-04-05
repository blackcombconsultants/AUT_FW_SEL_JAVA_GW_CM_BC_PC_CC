package com.pages.Guidewire.WorkersCompensation;

import org.openqa.selenium.By;

public interface WC_VerifyForms_Po {
	final By Form_Tab=By.id("SubmissionWizard-Forms");
	final By Table_Size=By.xpath("//tr[@id='SubmissionWizard-FormsScreen-FormsDV-FormsLV-3']/following-sibling::tr");
	final By Lob_Text=By.xpath("//div[@id='SubmissionWizard-FormsScreen-FormsDV-FormsLV-\"+i+\"-FormNumber']/descendant::div[@class='gw-value-readonly-wrapper']");

}
