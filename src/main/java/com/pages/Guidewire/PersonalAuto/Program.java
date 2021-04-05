package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.*;
import com.pages.Guidewire.PersonalAuto.*;

public class Program extends SeleniumWebDriver_Commands implements Program_PO {

	public Program(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public void pc_NewSubmissions() {

		String ExstDriver = null;
		By Add_ExistingDriver_Menu_Select = By.xpath(
				"//div[contains(@id,'AddDriver-AddExistingContact')]//div[normalize-space()='" + ExstDriver + "']");

		String AllocateDriver = null;
		By Allocate_Driver_to_Vehicle = By.xpath("//div[@aria-label='" + AllocateDriver + "']");
		boolean AccountHolderNameMatches = true;

		/*
		 * Thread.sleep(1000); gwAutomate(NewSubmissions_PALob_Button, "click", "");
		 * Thread.sleep(1000); gwAutomate(PAuto_NewSubmission_Offering,
		 * "selectByVisibleText", "BasicProgram"); Thread.sleep(1000);
		 * gwAutomate(Next_Button, "click", ""); Thread.sleep(1000);
		 * gwAutomate(Qualification_CurrentlyInsured, "selectByVisibleText",
		 * "No - New Driver"); Thread.sleep(1000); gwAutomate(Next_Button, "click", "");
		 * Thread.sleep(1000); gwAutomate(Next_Button, "click", ""); Thread.sleep(1000);
		 * gwAutomate(DriverScreen_AddDriver_Button, "click", ""); Thread.sleep(1000);
		 * gwAutomate(Add_ExistingDriver, "click", ""); Thread.sleep(1000);
		 * gwAutomate(Add_ExistingDriver, "click", ""); Thread.sleep(1000);
		 * 
		 * ExstDriver = "srikanth akula"; Thread.sleep(1000);
		 * gwAutomate(Add_ExistingDriver_Menu_Select, "click", "");
		 * 
		 * Thread.sleep(1000); gwAutomate(License_No, "sendkeys", "AB123456");
		 * Thread.sleep(1000); gwAutomate(License_State, "selectByVisibleText", "Ohio");
		 * Thread.sleep(1000); gwAutomate(Roles_Tab, "click", ""); Thread.sleep(1000);
		 * gwAutomate(Year_First_Licensed, "sendkeys", "2010"); Thread.sleep(1000);
		 * 
		 * gwAutomate(No_of_Accidents_Policy_Level,"selectByVisibleText", "0");
		 * Thread.sleep(1000);
		 * gwAutomate(No_of_Accidents_Account_Level,"selectByVisibleText", "0");
		 * Thread.sleep(1000);
		 * gwAutomate(No_of_Violations_Policy_Level,"selectByVisibleText", "0");
		 * Thread.sleep(1000);
		 * gwAutomate(No_of_Violations_Account_Level,"selectByVisibleText", "0");
		 * Thread.sleep(1000);
		 * 
		 * gwAutomate(Next_Button, "click", ""); Thread.sleep(1000);
		 * gwAutomate(Create_Vehicle, "click", ""); Thread.sleep(1000); gwAutomate(VIN,
		 * "sendkeys", "1FMZU73KX2ZC99878"); Thread.sleep(1000);
		 * gwAutomate(License_State, "selectByVisibleText", "Ohio"); Thread.sleep(1000);
		 * gwAutomate(Add_Driver_to_Vehicles_Button, "click", ""); Thread.sleep(1000);
		 * 
		 * 
		 * AllocateDriver = "srikanth akula"; gwAutomate(Allocate_Driver_to_Vehicle,
		 * "click", ""); Thread.sleep(1000);
		 * 
		 * gwAutomate(Cost_New, "sendkeys", "20000"); Thread.sleep(1000);
		 * gwAutomate(Next_Button, "click", ""); // From driver to coverages
		 * Thread.sleep(1000); gwAutomate(Next_Button, "click", ""); // coverages to
		 * risk analysis Thread.sleep(1000); gwAutomate(Next_Button, "click", ""); //
		 * risk analysis to policy review Thread.sleep(1000);
		 * gwAutomate(Quote_New_Submission, "click", ""); // policy quoted
		 * Thread.sleep(1000); gwAutomate(Next_Button, "click", ""); // quote to forms
		 * Thread.sleep(1000); gwAutomate(Next_Button, "click", ""); // forms to payment
		 * Thread.sleep(1000); gwAutomate(Payment_Screen_Billing_Method,
		 * "selectByVisibleText", "Direct Bill"); Thread.sleep(1000);
		 * gwAutomate(Payment_Schedule_Monthly_Schedule, "click", "");
		 * Thread.sleep(1000); gwAutomate(Bind_Options_Button, "click", "");
		 * Thread.sleep(1000); gwAutomate(Bind_Options_Issue_Policy, "click", "");
		 * Thread.sleep(1000);
		 */

		/*
		 * 
		 * gwAutomate(confirm_alert_OK, "Alert", ""); gwAutomate(View_Your_Policy,
		 * "click", ""); getText_Element(Policy_Summary_Policy_Number);
		 */
	}
}
