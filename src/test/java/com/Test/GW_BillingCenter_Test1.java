package com.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Sandbox.BillingCenter_Resuables;
import com.pages.Sandbox.LoginGuideware;
import com.pages.Sandbox.MenuNavigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GW_BillingCenter_Test1 {
	public WebDriver driver;
	JavascriptExecutor js;
	public WebDriverWait oWebDriverWait;
	public static String pConfigproperties = "/src/main/resources/Config.Properties";
	public static String pUserdir = System.getProperty("user.dir");

	public String strPolicyNumber;
	public String strAccountNumber;
	public String strAccountName;
	public int strAmount;
	String url = "HI";

	@BeforeTest
	public void setUp() throws Exception {

		File oFile = new File(pUserdir + pConfigproperties);
		FileInputStream oFIS = new FileInputStream(oFile);

		Properties oProperties = new Properties();
		oProperties.load(oFIS);
		String StrBrowser = oProperties.getProperty("Browser").toUpperCase();

		switch (StrBrowser) {

		case "CHROME":

			System.out.println("launching Chrome browser");

			try {
				Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
				Runtime.getRuntime().exec("taskkill /F /IM chromeDriverServer.exe");

			} catch (IOException e) {
				e.printStackTrace();
			}

			WebDriverManager.chromedriver().setup();
			/*
			 * ChromeOptions co = new ChromeOptions(); co.setCapability("chrome.binary",
			 * "ChromeBinary"); co.addArguments("disable-infobars");
			 * co.addArguments("disable-extensions");
			 * co.setExperimentalOption("useAutomationExtension", false); driver = new
			 * ChromeDriver(co);
			 */
			driver = new ChromeDriver();
			break;

		case "IE":

			try {
				Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
				Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");

			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("launching IE browser");

			WebDriverManager.iedriver().setup();

			/*
			 * InternetExplorerOptions ieo = new InternetExplorerOptions();
			 * ieo.setCapability(InternetExplorerDriver.
			 * INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			 * ieo.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, true);
			 * ieo.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
			 * ieo.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			 * ieo.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			 * ieo.setCapability(InternetExplorerDriver.NATIVE_EVENTS,false);
			 * InternetExplorerDriver driver = new InternetExplorerDriver(ieo);
			 */

			driver = new InternetExplorerDriver();
			break;

		case "FIREFOX":

			try {
				Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
				Runtime.getRuntime().exec("taskkill /F /IM FirefoxDriverServer.exe");

			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("launching firefox browser");

			WebDriverManager.firefoxdriver().setup();
			/*
			 * FirefoxOptions fo = new FirefoxOptions().setProfile(new FirefoxProfile());
			 * fo.setBinary("binary"); driver = new FirefoxDriver(fo);
			 */
			driver = new FirefoxDriver();
			break;

		case "EDGE":

			try {
				Runtime.getRuntime().exec("taskkill /F /IM msedge.exe");
				Runtime.getRuntime().exec("taskkill /F /IM msedgeDriverServer.exe");

			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("launching EDGE browser");

			WebDriverManager.edgedriver().setup();
			/*
			 * EdgeOptions eo = new EdgeOptions().setProfile(new EdgeProfile());
			 * eo.setBinary("binary"); driver = new EdgeDriver(fo);
			 */

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge Dev\\Application\\msedge.exe");
			EdgeOptions edgeOptions = new EdgeOptions().merge(chromeOptions);
			driver = new EdgeDriver(edgeOptions);

			break;

		case "OPERA":

			try {
				Runtime.getRuntime().exec("taskkill /F /IM opera.exe");
				Runtime.getRuntime().exec("taskkill /F /IM operaDriverServer.exe");

			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("launching opera browser");

			WebDriverManager.operadriver().setup();
			/*
			 * OperaOptions oo = new OperaOptions().setProfile(new OperaProfile());
			 * oo.setBinary("binary"); driver = new OperaDriver(oo);
			 */
			driver = new OperaDriver();
			break;

		case "HTMLUNITDRIVER":
			break;

		default:

			break;
		}

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		/*
		 * EventFiringWebDriver efDriver = new EventFiringWebDriver(driver);
		 * WebEventListener wel = new WebEventListener(); efDriver.register(wel); driver
		 * = efDriver;
		 */

		String strAut_Demo = oProperties.getProperty("Aut_Demo");

		switch (strAut_Demo) {
		case "BillingCenter":
			url = oProperties.getProperty("URL_BillingCenter");
			break;
		case "PolicyCenter":
			url = oProperties.getProperty("PolicyCenter");
			break;
		case "y":
		case "z":

		default:
			url = oProperties.getProperty("URL_BillingCenter");
			break;
		}

		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		oWebDriverWait = new WebDriverWait(driver, 20);
	}

	@Test
	public void BillingTest() throws Exception {

		LoginGuideware lg = new LoginGuideware(driver);
		BillingCenter_Resuables gwPC = new BillingCenter_Resuables(driver);
		MenuNavigation mn = new MenuNavigation(driver);

		// ------> login_PolicyCenter
		lg.login_BillingCenter();
		// ------> navigate to new account
		mn.gwBillingCenter_MenuNavigation("Account");

		// ------> New Account
		gwPC.bc_NewAccount();
		// ------> Verifying the page -
		Assert.assertEquals(gwPC.getHeader_AccountSummary(), "Account Summary");
		// ------> New Policy
		gwPC.bc_NewPolicy_PolicyIssuanceWizard_Step1();
		// ------> Verifying the page -
		gwPC.bc_NewPolicy_PolicyIssuanceWizard_Step2();
		// ------> Verifying the bc_AccountSummary -
		gwPC.bc_AccountSummary();
		// ------> bc_AccountSummary_Invoices
		gwPC.bc_AccountSummary_Invoices();
		// ------> logout_BillingCenter
		lg.logout_BillingCenter();

	}

	@AfterTest
	public void Closure() {
		driver.quit();
	}

}
