package com.pages.Sandbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GW_Base {

	WebDriver driver;
	EventFiringWebDriver efDriver;
	public static JavascriptExecutor oJavascriptExecutor;
	public static WebDriverWait oWebDriverWait;

	public static ExtentHtmlReporter oExtentHtmlReporter;
	public static ExtentSparkReporter oExtentSparkReporter;
	public static ExtentReports oExtentReports;
	public static ExtentTest oExtentTest;

	public static Properties oProperties;
	public static FileInputStream oFileInputStream;
	public static File oFile;

	public static String pConfigproperties = "/src/main/resources/Config.Properties";
	public static String pUserdir = System.getProperty("user.dir");
	public static String gstrHostname = System.getProperty("hostname");
	public static String gstrUsername = System.getProperty("user.name");
	public static String gstrOSname = System.getProperty("os.name");
	public static String pFilePath = pUserdir + "\\testdata\\BillingCenter.xlsx";

	public static SimpleDateFormat sdf_ddMMMMyyyy = new SimpleDateFormat("ddMMMMyyyy");
	public static SimpleDateFormat sdf_ddMMMMyyyyHHmmss = new SimpleDateFormat("ddMMMMyyyy HHmmss");

	public static String strCurrentDate_ddMMMMyyyy = sdf_ddMMMMyyyy.format(new Date());
	public static String strCurrentDate_ddMMMMyyyyHHmmss = sdf_ddMMMMyyyyHHmmss.format(new Date());

	public static String pExtentReport_TodayFile = pUserdir + "\\test-output\\extentreports\\ExtentReport_"
			+ strCurrentDate_ddMMMMyyyy + ".html";
	public static String pExtentReport_indexFile = pUserdir + "\\test-output\\extentreports\\index.html";

	public String strPolicyNumber = strCurrentDate_ddMMMMyyyyHHmmss;
	public String strAccountNumber;
	public String strAccountName;
	public String strAmount;

	String url;

	public WebDriver getDriver() {

		GW_Selenium_WebDriverEventListener wel = new GW_Selenium_WebDriverEventListener();

		// String StrBrowser = getValue_PropertiesFile(pConfigproperties, "Browser");

		try {
			oFile = new File(pUserdir + pConfigproperties);
			oProperties = new Properties();
			oFileInputStream = new FileInputStream(oFile);
			oProperties.load(oFileInputStream);

			String StrBrowser = oProperties.getProperty("Browser").toUpperCase();
			String strGW_Application = oProperties.getProperty("GW_Application");
			
			switch (strGW_Application) {
			case "BillingCenter":
				url = oProperties.getProperty("URL_BillingCenter");
				break;
			case "PolicyCenter":
				url = oProperties.getProperty("URL_PolicyCenter");
				break;
			case "ClaimsCenter":
				url = oProperties.getProperty("URL_ClaimsCenter");
				break;
			default:
				url = oProperties.getProperty("URL_BillingCenter");
				break;
			}

			StrBrowser = "CHROME";

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

			case "HEADLESS":

				HtmlUnitDriver driver = new HtmlUnitDriver();
				break;

			default:

				break;
			}

			efDriver = new EventFiringWebDriver(driver);
			efDriver.register(wel);
			driver = efDriver;

			driver.get(url);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			oWebDriverWait = new WebDriverWait(driver, 20);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;
	}

}
