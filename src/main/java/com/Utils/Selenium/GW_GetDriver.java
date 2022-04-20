package com.Utils.Selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GW_GetDriver extends Selenium_Reporting {

	public WebDriver getDriver() throws Throwable {

		try {

			switch (StrBROWSER) {
				case "CHROME" :

					System.out.println("-------------------------------------------------------------------------");
					System.out.println("launching Chrome browser in OS =" + gstr_OSname);

					try {
						Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
						Runtime.getRuntime().exec("taskkill /F /IM chromeDriverServer.exe");
					} catch (IOException e) {
						e.printStackTrace();
					}

					WebDriverManager.chromedriver().setup();
					ChromeOptions co = new ChromeOptions();
					// co.setCapability("chrome.binary","ChromeBinary");
					// co.setBinary("/path/to/other/chrome/binary");
					co.addArguments("start-maximized");
					co.addArguments("disable-infobars");
					co.addArguments("disable-extensions");

					// co.setExperimentalOption("useAutomationExtension", false);
					driver = new ChromeDriver(co);
					// driver = new ChromeDriver();
					break;

				case "IE" :

					try {
						Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
						Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
					} catch (IOException e) {
						e.printStackTrace();
					}

					System.out.println("launching IE browser");

					WebDriverManager.iedriver().setup();

					/*
					 * InternetExplorerOptions ieo = new InternetExplorerOptions(); ieo.setCapability(InternetExplorerDriver.
					 * INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); ieo.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING,
					 * true); ieo.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
					 * ieo.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
					 * ieo.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
					 * ieo.setCapability(InternetExplorerDriver.NATIVE_EVENTS,false); InternetExplorerDriver driver = new InternetExplorerDriver(ieo);
					 */

					driver = new InternetExplorerDriver();
					break;
				case "FIREFOX" :

					try {
						Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
						Runtime.getRuntime().exec("taskkill /F /IM FirefoxDriverServer.exe");
					} catch (IOException e) {
						e.printStackTrace();
					}

					System.out.println("launching firefox browser");

					WebDriverManager.firefoxdriver().setup();
					/*
					 * FirefoxOptions fo = new FirefoxOptions().setProfile(new FirefoxProfile()); fo.setBinary("binary"); driver = new
					 * FirefoxDriver(fo);
					 */
					driver = new FirefoxDriver();
					break;
				case "EDGE" :
					try {
						Runtime.getRuntime().exec("taskkill /F /IM msedge.exe");
						Runtime.getRuntime().exec("taskkill /F /IM msedgeDriverServer.exe");

					} catch (IOException e) {
						e.printStackTrace();
					}

					System.out.println("launching EDGE browser");

					WebDriverManager.edgedriver().setup();
					/*
					 * EdgeOptions eo = new EdgeOptions().setProfile(new EdgeProfile()); eo.setBinary("binary"); driver = new EdgeDriver(fo);
					 */

					/*
					 * ChromeOptions chromeOptions = new ChromeOptions(); chromeOptions.
					 * setBinary("C:\\Program Files (x86)\\Microsoft\\Edge Dev\\Application\\msedge.exe" ); EdgeOptions edgeOptions = new
					 * EdgeOptions().merge(chromeOptions); driver = new EdgeDriver(edgeOptions);
					 */
					driver = new EdgeDriver();

					break;

				case "OPERA" :

					try {
						Runtime.getRuntime().exec("taskkill /F /IM opera.exe");
						Runtime.getRuntime().exec("taskkill /F /IM operaDriverServer.exe");

					} catch (IOException e) {
						e.printStackTrace();
					}

					System.out.println("launching opera browser");

					WebDriverManager.operadriver().setup();
					/*
					 * OperaOptions oo = new OperaOptions().setProfile(new OperaProfile()); oo.setBinary("binary"); driver = new OperaDriver(oo);
					 */
					driver = new OperaDriver();
					break;
				case "MOBILE" :

					DesiredCapabilities capabilities = new DesiredCapabilities();
					capabilities.setCapability("openDeviceTimeout", 1);

					break;
				case "HtmlUnitDriver" :

					// HtmlUnitDriver driver = new HtmlUnitDriver();
					break;

				case "PhantomJSDriver" :

					/*
					 * File file = new File( "D:/Users/asrikanth/.m2/repository/com/codeborne/phantomjsdriver/1.4.1/phantomjsdriver-1.4.1-sources.jar"
					 * ); System.setProperty("phantomjs.binary.path",
					 * "D:/Users/asrikanth/.m2/repository/com/codeborne/phantomjsdriver/1.4.1/phantomjsdriver-1.4.1-sources.jar" );
					 * 
					 * WebDriver driver = new PhantomJSDriver();
					 */
					break;

				case "HEADLESSCHROME" :

					System.out.println("Headless Mode");

					/*
					 * try { Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
					 * Runtime.getRuntime().exec("taskkill /F /IM chromeDriverServer.exe");
					 * 
					 * } catch (IOException e) { e.printStackTrace(); }
					 */

					WebDriverManager.chromedriver().setup();

					// create object of chrome options
					ChromeOptions options = new ChromeOptions();
					// add the headless argument
					// options.addArguments("headless");
					options.setHeadless(true);
					// System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
					// pass the options parameter in the Chrome driver declaration
					driver = new ChromeDriver(options);
					break;

				default :

					break;
			}

			oJavascriptExecutor = (JavascriptExecutor) driver;

			efDriver = new EventFiringWebDriver(driver);
			Selenium_WebDriverEventListener wel = new Selenium_WebDriverEventListener();
			efDriver.register(wel);
			driver = efDriver;

			driver.get(url);
			oExtentTest.log(Status.PASS, "Launched " + url);

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			oWebDriverWait = new WebDriverWait(driver, 5);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;
	}

}
