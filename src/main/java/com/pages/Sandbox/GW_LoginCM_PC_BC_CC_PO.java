
/*
 * sadsadasd
 * asdasdas
 */

package com.pages.Sandbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface GW_LoginCM_PC_BC_CC_PO {

	final By Username = By.xpath("//input[contains(@name,'LoginDV-username')]");
	final By Password = By.xpath("//input[contains(@name,'LoginDV-password')]");
	final By Login = By.xpath("//div[@id='Login-LoginScreen-LoginDV-submit']//div");
	
	final By ToolBar = By.id("TabBar-UnsavedWorkTabBarLink");
	final By Setting = By.id("gw-TabBarWidget--settings");
	final By Logout = By.id("TabBar-LogoutTabBarLink");

	/*
	 * ContactManagement
	 */
	WebElement getUsername_ContactManagement(WebElement weValue);

	WebElement getpassword_ContactManagement(WebElement weValue);

	void setUsername_ContactManagement(WebElement weValue, String strValue);

	void setpassword_ContactManagement(WebElement weValue, String strValue);

	void clickLogin_ContactManagement(WebElement weValue);

	void login_ContactManagement();

	void logout_ContactManagement();

	/*
	 * BillingCenter
	 */
	WebElement getUsername_BillingCenter(WebElement weValue);

	WebElement getpassword_BillingCenter(WebElement weValue);

	void setUsername_BillingCenter(WebElement weValue, String strValue);

	void setpassword_BillingCenter(WebElement weValue, String strValue);

	void clickLogin_BillingCenter(WebElement weValue);

	void login_BillingCenter();

	void logout_BillingCenter();

	/*
	 * PolicyCenter
	 */

	WebElement getUsername_PolicyCenter(By weValue);

	WebElement getpassword_PolicyCenter(By weValue);

	void setUsername_PolicyCenter(By weValue, String strValue);

	void setpassword_PolicyCenter(By weValue, String strValue);

	void clickLogin_PolicyCenter(By weValue);

	void login_PolicyCenter();

	void logout_PolicyCenter();

	/*
	 * ClaimsCenter
	 */

	WebElement getUsername_ClaimsCenter(WebElement weValue);

	WebElement getpassword_ClaimsCenter(WebElement weValue);

	void setUsername_ClaimsCenter(WebElement weValue, String strValue);

	void setpassword_ClaimsCenter(WebElement weValue, String strValue);

	void clickLogin_ClaimsCenter(WebElement weValue);

	void login_ClaimsCenter();

	void logout_ClaimsCenter();

}
