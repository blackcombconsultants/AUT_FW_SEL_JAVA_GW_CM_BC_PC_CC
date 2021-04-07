package com.Utils.Selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GW_GetDriver extends Selenium_Reporting {

	String url;
	String StrBrowser;
	String strGW_Application;

	public WebDriver getDriver() throws Throwable {

		try {

			Selenium_Utils_File oGetFile = new Selenium_Utils_File();

			StrBrowser = oGetFile.getValue_PropertiesFile(pConfigproperties, "Browser");
			strGW_Application = oGetFile.getValue_PropertiesFile(pConfigproperties, "GW_Application");

			switch (strGW_Application) {
			case "BillingCenter":
				url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_BillingCenter");
				break;
			case "PolicyCenter":
				url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_PolicyCenter");
				break;
			case "ClaimsCenter":
				url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_ClaimsCenter");
				break;
			default:
				url = oGetFile.getValue_PropertiesFile(pConfigproperties, "URL_ContacttManagement");
				break;
			}

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

				/*
				 * ChromeOptions chromeOptions = new ChromeOptions(); chromeOptions.
				 * setBinary("C:\\Program Files (x86)\\Microsoft\\Edge Dev\\Application\\msedge.exe"
				 * ); EdgeOptions edgeOptions = new EdgeOptions().merge(chromeOptions); driver =
				 * new EdgeDriver(edgeOptions);
				 */
				driver = new EdgeDriver();

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
			case "MOBILE":

				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("openDeviceTimeout", 1);

				break;
			case "HEADLESS":

				HtmlUnitDriver driver = new HtmlUnitDriver();
				break;

			default:

				break;
			}

			oJavascriptExecutor = (JavascriptExecutor) driver;

			efDriver = new EventFiringWebDriver(driver);
			Selenium_WebDriverEventListener wel = new Selenium_WebDriverEventListener();
			efDriver.register(wel);
			driver = efDriver;

			driver.get(url);
			oExtentTest.log(Status.PASS, "Appliaction Launched  " + url);

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			oWebDriverWait = new WebDriverWait(driver, 10);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;
	}

}
