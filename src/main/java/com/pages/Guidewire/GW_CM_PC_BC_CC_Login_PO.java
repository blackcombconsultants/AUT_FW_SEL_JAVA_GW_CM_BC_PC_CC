
/*
 * sadsadasd
 * asdasdas
 */

package com.pages.Guidewire;

import org.openqa.selenium.By;

public interface GW_CM_PC_BC_CC_Login_PO {

	final By GW_Username = By.xpath("//input[contains(@name,'LoginDV-username')]");
	final By GW_Password = By.xpath("//input[contains(@name,'LoginDV-password')]");
	final By GW_Login_Button = By.xpath("//div[@id='Login-LoginScreen-LoginDV-submit']//div");

	final By GW_ToolBar_Link = By.id("TabBar-UnsavedWorkTabBarLink");
	final By GW_Setting_Link = By.id("gw-TabBarWidget--settings");
	final By GW_Logout_Link = By.id("TabBar-LogoutTabBarLink");

	/*
	 * ContactManagement
	 * 
	 * 
	 * WebElement getUsername_ContactManagement(WebElement weValue);
	 * 
	 * WebElement getpassword_ContactManagement(WebElement weValue);
	 * 
	 * void setUsername_ContactManagement(WebElement weValue, String strValue);
	 * 
	 * void setpassword_ContactManagement(WebElement weValue, String strValue);
	 * 
	 * void clickLogin_ContactManagement(WebElement weValue);
	 * 
	 * 
	 * 
	 * BillingCenter
	 * 
	 * 
	 * WebElement getUsername_BillingCenter(WebElement weValue);
	 * 
	 * WebElement getpassword_BillingCenter(WebElement weValue);
	 * 
	 * void setUsername_BillingCenter(WebElement weValue, String strValue);
	 * 
	 * void setpassword_BillingCenter(WebElement weValue, String strValue);
	 * 
	 * void clickLogin_BillingCenter(WebElement weValue);
	 * 
	 * 
	 * void login_BillingCenter() throws Throwable;
	 * 
	 * void logout_BillingCenter() throws Throwable;
	 * 
	 * 
	 * PolicyCenter
	 * 
	 * 
	 * 
	 * WebElement getUsername_PolicyCenter(By weValue);
	 * 
	 * WebElement getpassword_PolicyCenter(By weValue);
	 * 
	 * void setUsername_PolicyCenter(By weValue, String strValue);
	 * 
	 * void setpassword_PolicyCenter(By weValue, String strValue);
	 * 
	 * void clickLogin_PolicyCenter(By weValue);
	 * 
	 * void login_PolicyCenter() throws Throwable;
	 * 
	 * void logout_PolicyCenter() throws Throwable;
	 * 
	 * 
	 * ClaimsCenter
	 * 
	 * 
	 * 
	 * WebElement getUsername_ClaimsCenter(WebElement weValue);
	 * 
	 * WebElement getpassword_ClaimsCenter(WebElement weValue);
	 * 
	 * void setUsername_ClaimsCenter(WebElement weValue, String strValue);
	 * 
	 * void setpassword_ClaimsCenter(WebElement weValue, String strValue);
	 * 
	 * void clickLogin_ClaimsCenter(WebElement weValue);
	 * 
	 * void login_ClaimsCenter() throws Throwable;
	 * 
	 * void logout_ClaimsCenter() throws Throwable;
	 */
}
