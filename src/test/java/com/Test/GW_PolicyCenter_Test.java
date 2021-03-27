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
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Sandbox.LoginGuideware;
import com.pages.Sandbox.MenuNavigation;
import com.pages.Sandbox.PolicyCenter_Resuables;
import com.pages.Sandbox.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GW_PolicyCenter_Test {
	public WebDriver driver;
	JavascriptExecutor js;
	public WebDriverWait oWebDriverWait;
	public static String pConfigproperties = "/src/main/resources/Config.properties";
	public static String pUserdir = System.getProperty("user.dir");

	@BeforeTest
	public void setUp() throws Exception {
		String url = null;

		js = (JavascriptExecutor) driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		File oFile = new File(pUserdir + pConfigproperties);
		FileInputStream oFIS = new FileInputStream(oFile);

		Properties oProperties = new Properties();
		oProperties.load(oFIS);
		String StrBrowser = oProperties.getProperty("Browser");

		switch (StrBrowser.toUpperCase()) {

		case "CHROME":

			try {
				Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
				Runtime.getRuntime().exec("taskkill /F /IM chromeDriverServer.exe");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("launching Chrome browser");

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
				// TODO Auto-generated catch block
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
				// TODO Auto-generated catch block
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
				// TODO Auto-generated catch block
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
				// TODO Auto-generated catch block
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

		if (true) {
			EventFiringWebDriver efDriver = new EventFiringWebDriver(driver);
			WebEventListener wel = new WebEventListener();
			efDriver.register(wel);
			driver = efDriver;
		}

		String strAut_Demo = oProperties.getProperty("Aut_Demo");

		switch (strAut_Demo)

		{
		case "BillingCenter":
			url = oProperties.getProperty("URL_BillingCenter");
			break;

		case "PolicyCenter":
			url = oProperties.getProperty("URL_PolicyCenter");
			break;

		default:
			break;
		}

		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		oWebDriverWait = new WebDriverWait(driver, 20);
	}

	//
	@Test
	public void createAccount() throws Exception {

		LoginGuideware lg = new LoginGuideware(driver);
		PolicyCenter_Resuables gwPC = new PolicyCenter_Resuables(driver);
		MenuNavigation mn = new MenuNavigation(driver);

		// login_PolicyCenter
		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");
		// Verifying the page -
		Assert.assertEquals(gwPC.getHeader_EnterAccountInformation(), "Enter Account Information");
		// pc_SearchAccountInformation
		gwPC.pc_SearchAccountInformation();
		Assert.assertEquals(gwPC.gettext_SearchAccountResultsMessage(),
				"Information for the current page:\n" + "The search returned zero results.");
		// pc_CreatePersonAccount
		gwPC.pc_CreatePersonAccount();
		Assert.assertEquals(gwPC.getHeader_AccountSummary(), "Account Summary");

	}

}
