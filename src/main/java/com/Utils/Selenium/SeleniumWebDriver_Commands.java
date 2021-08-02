package com.Utils.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.base.Verify;

public class SeleniumWebDriver_Commands extends Selenium_Utils_File {

	protected static WebDriver  driver;
	protected static ExtentTest oExtentTest;

	static List<WebElement> oList_WebElement;
	static WebElement       oWebElement;
	static String           LogMsg;
	static By               Locator;
	static Robot            oRobot;
	static Action           oAction;
	static String           strActual = null;

	public SeleniumWebDriver_Commands(WebDriver driver, ExtentTest oExtentTest) {
		SeleniumWebDriver_Commands.driver      = driver;
		SeleniumWebDriver_Commands.oExtentTest = oExtentTest;
	}

	protected static WebElement getElement(By Locator) throws Throwable {

		oWebElement = null;

		try {
			oWebElement = driver.findElement(Locator);
		} catch (StaleElementReferenceException e) {
			System.out.println(e.getMessage());
			oWebElement = driver.findElement(Locator);
			oWebElement = driver.findElement(Locator);
		}

		oWebDriverWait.until(ExpectedConditions.visibilityOf(oWebElement));
		// Highlight the Element.
		oJavascriptExecutor.executeScript("arguments[0].setAttribute('style','background: palegreen; border: 8px solid red:')", oWebElement);
		Thread.sleep(500);
		oJavascriptExecutor.executeScript("arguments[0].setAttribute('style','border: solid 2px white')", oWebElement);

		return oWebElement;

	}

	public static void getStaleElement(String Element, By Locator) throws Throwable {

		oWebElement = null;

		try {
			oWebElement = driver.findElement(Locator);
			oWebElement = driver.findElement(Locator);
		} catch (StaleElementReferenceException e) {
			oWebElement = driver.findElement(Locator);
			oWebElement = driver.findElement(Locator);
		} catch (Exception e) {
			System.out.println("getStaleElement");
		}

		try {
			oWebDriverWait.until(ExpectedConditions.visibilityOf(oWebElement));
		} catch (StaleElementReferenceException e) {
			oWebElement = driver.findElement(Locator);
			oWebElement = driver.findElement(Locator);
		} catch (Exception e) {
			System.out.println("getStaleElement");
		}

		try {
			// Highlight the Element.
			oJavascriptExecutor.executeScript("arguments[0].setAttribute('style','background: palegreen; border: 8px solid red:')", oWebElement);
			Thread.sleep(500);
			oJavascriptExecutor.executeScript("arguments[0].setAttribute('style','border: solid 2px white')", oWebElement);
		} catch (StaleElementReferenceException e) {
			oWebElement = driver.findElement(Locator);
			oWebElement = driver.findElement(Locator);
		} catch (Exception e) {
			System.out.println("getStaleElement");
		}

	}

	public static WebElement getElement(WebElement oWebElement) throws Throwable {

		try {
			oWebDriverWait.until(ExpectedConditions.visibilityOf(oWebElement));
			// Highlight the Element.
			oJavascriptExecutor.executeScript("arguments[0].setAttribute('style','background: palegreen; border: 8px solid red:')", oWebElement);
			Thread.sleep(250);
			oJavascriptExecutor.executeScript("arguments[0].setAttribute('style','border: solid 2px white')", oWebElement);
		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "getElement Highlight Failed");
			e.printStackTrace();
			throw e;
		}

		return oWebElement;
	}

	public static List<WebElement> getElements(By Locator) throws Throwable {

		oWebElement = null;

		try {

			// Find the Element.
			oList_WebElement = driver.findElements(Locator);

			int intsize = oList_WebElement.size();
			if (intsize <= 0) {
				oList_WebElement = null;
				throw new NoSuchElementException(Locator.toString());
			} else if (intsize >= 1) {
				for (WebElement oWebElement : oList_WebElement) {

					// Wait for the Element.
					oWebDriverWait.until(ExpectedConditions.visibilityOf(oWebElement));

					// Highlight the Element.
					oJavascriptExecutor.executeScript("arguments[0].setAttribute('style','background: palegreen; border: 8px solid red:')", oWebElement);

					Thread.sleep(500);

					oJavascriptExecutor.executeScript("arguments[0].setAttribute('style','border: solid 2px white')", oWebElement);
				}
			}

		} catch (Exception e) {
			LogMsg = "Element not found ";
			oExtentTest.log(Status.FAIL, LogMsg);
			e.printStackTrace();
			throw e;
		}

		return oList_WebElement;

	}

	public static void GuidewireAutomate(String ElementName, WebElement oWebElement, String command, String strValue) throws Throwable {

		Actions oActions = new Actions(driver);
		oAction = null;
		oRobot  = new Robot();

		try {
			if (!strValue.isBlank()) {

				switch (command) {
					case "keyDownF12" :
						oAction = oActions.keyDown(oWebElement, Keys.F12).build();
						oAction.perform();
						break;
					case "keyUpF12" :
						oAction = oActions.keyUp(oWebElement, Keys.F12).build();
						oAction.perform();
						break;
					case "ALTSHIFTP" :
						oAction = oActions.keyUp(oWebElement, Keys.F12).build();
						oAction.perform();
						break;
					case "ALTSHIFTF" :
						oAction = oActions.keyUp(oWebElement, Keys.F12).build();
						oAction.perform();
						break;
					case "RobotTAB" :
						oRobot.keyPress(KeyEvent.VK_TAB);
						oRobot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						break;
					case "doubleClick" :
						oAction = oActions.doubleClick(oWebElement).build();
						oAction.perform();
						LogMsg = command + "ed Field" + ElementName;
						break;
					case "mouseClick" :
						oActions.click(oWebElement);
						LogMsg = command + " ed Field" + ElementName;
						break;
					case "moveToElement" :
						oAction = oActions.moveToElement(oWebElement).build();
						oAction.perform();
						LogMsg = command + " = " + ElementName;
						break;
					case "clear" :
						oWebElement.clear();
						LogMsg = command + " value in  = " + ElementName;
						break;
					case "click" :
						oWebDriverWait.until(ExpectedConditions.elementToBeClickable(oWebElement));
						oWebElement.click();
						LogMsg = command + "ed Field = " + ElementName;
						break;
					case "clickAndwait" :
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
						oWebDriverWait = new WebDriverWait(driver, 20);

						oWebDriverWait.until(ExpectedConditions.elementToBeClickable(oWebElement));
						oWebElement.click();

						LogMsg = "Clicked = " + ElementName;
						break;
					case "sendKeys" :
						oWebElement.sendKeys(strValue);
						LogMsg = ElementName + " input  = [" + strValue + "]";
						break;
					case "clearANDsendKeys" :
						oWebElement.clear();
						oWebElement.sendKeys(strValue);
						LogMsg = ElementName + "  cleared value And input  = [" + strValue + "]";
						break;
					case "clearsendKeysRobotTAB" :
						oWebElement.clear();
						oWebElement.sendKeys(strValue);
						oRobot.keyPress(KeyEvent.VK_TAB);
						oRobot.keyRelease(KeyEvent.VK_TAB);
						oRobot.keyPress(KeyEvent.VK_TAB);
						oRobot.keyRelease(KeyEvent.VK_TAB);
						LogMsg = ElementName + "  cleared value and input  = [" + strValue + "] And pressed TAB";
						break;
					case "clearsendKeysoActionsTAB" :
						oWebElement.clear();
						oWebElement.sendKeys(strValue);
						oActions.sendKeys(Keys.TAB).build().perform();
						LogMsg = ElementName + "  cleared value and input  = [" + strValue + "] And pressed TAB";
						break;
					case "clearsendKeysoActionsENTER" :
						oActions.moveToElement(oWebElement).build().perform();
						oActions.sendKeys(Keys.BACK_SPACE).build().perform();

						oWebElement.sendKeys(strValue);
						oActions.sendKeys(Keys.ENTER).build().perform();
						LogMsg = ElementName + "  cleared value and input  = [" + strValue + "] And pressed ENTER";
						break;
					case "clearsendKeysoJavascriptExecutor" :

						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
						oWebDriverWait = new WebDriverWait(driver, 20);

						oActions.moveToElement(oWebElement).build().perform();
						oActions.doubleClick(oWebElement).build().perform();
						oJavascriptExecutor.executeScript("arguments[0].value='" + strValue + "';", oWebElement);
						oActions.sendKeys(Keys.ENTER).build().perform();

						LogMsg = ElementName + "  cleared value and input  = [" + strValue + "] And pressed ENTER";
						break;
					case "selectByIndex" :
						new Select(oWebElement).selectByIndex(Integer.parseInt(strValue));
						LogMsg = ElementName + "  Selected = " + strValue;
						break;
					case "selectByVisibleText" :
						new Select(oWebElement).selectByVisibleText(strValue);
						LogMsg = ElementName + "  Selected = " + strValue;
						break;
					case "selectByVisibleTextAndwait" :
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
						oWebDriverWait = new WebDriverWait(driver, 20);

						new Select(oWebElement).selectByVisibleText(strValue);

						LogMsg = ElementName + "  Selected = " + strValue;
						break;
					case "selectByValue" :
						new Select(oWebElement).selectByValue(strValue);
						LogMsg = ElementName + "  Selected = " + strValue;
						break;
					default :
						throw new IOException("No support for command : " + command);
				}

				oExtentTest.log(Status.INFO, LogMsg);

				if (!command.isEmpty()) {
					String LogMsg = "Element : " + ElementName.toString() + " command : [" + command.toString() + "] Value : [" + strValue.toString() + "]";
					System.out.println(LogMsg);
				}

			}

		} catch (Exception e) {
			LogMsg = ElementName + " =  [" + strValue + "]";
			oExtentTest.log(Status.FAIL, LogMsg);
			e.printStackTrace();
			throw e;
		}

	}

	public static void GuidewireAutomate(String ElementName, By Locator, String command, String strValue) throws Throwable {

		oWebElement = null;
		LogMsg      = null;
		Actions oActions = new Actions(driver);
		oAction = null;
		oRobot  = new Robot();

		try {

			oWebElement = getElement(Locator);

			if (!strValue.isBlank()) {

				switch (command) {
					case "keyDownF12" :
						oAction = oActions.keyDown(oWebElement, Keys.F12).build();
						oAction.perform();
						break;
					case "keyUpF12" :
						oAction = oActions.keyUp(oWebElement, Keys.F12).build();
						oAction.perform();
						break;
					case "ALTSHIFTP" :
						oAction = oActions.keyUp(oWebElement, Keys.F12).build();
						oAction.perform();
						break;
					case "ALTSHIFTF" :
						oAction = oActions.keyUp(oWebElement, Keys.F12).build();
						oAction.perform();
						break;
					case "RobotTAB" :
						oRobot.keyPress(KeyEvent.VK_TAB);
						oRobot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						break;
					case "doubleClick" :
						oAction = oActions.doubleClick(oWebElement).build();
						oAction.perform();
						LogMsg = command + "ed Field" + ElementName;
						break;
					case "mouseClick" :
						oActions.click(oWebElement);
						LogMsg = command + " ed Field" + ElementName;
						break;
					case "moveToElement" :
						oAction = oActions.moveToElement(oWebElement).build();
						oAction.perform();
						LogMsg = command + " = " + ElementName;
						break;
					case "clear" :
						oWebElement.clear();
						LogMsg = command + " value in  = " + ElementName;
						break;
					case "click" :
						oWebDriverWait.until(ExpectedConditions.elementToBeClickable(oWebElement));
						oWebElement.click();
						LogMsg = command + "ed Field = " + ElementName;
						break;
					case "clickAndwait" :
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
						oWebDriverWait = new WebDriverWait(driver, 20);

						oWebDriverWait.until(ExpectedConditions.elementToBeClickable(oWebElement));
						oWebElement.click();

						driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
						driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
						oWebDriverWait = new WebDriverWait(driver, 7);

						LogMsg = "Clicked = " + ElementName;
						break;
					case "sendKeys" :
						oWebElement.sendKeys(strValue);
						LogMsg = ElementName + " input  = [" + strValue + "]";
						break;
					case "clearANDsendKeys" :
						oWebElement.clear();
						oWebElement.sendKeys(strValue);
						LogMsg = ElementName + "  cleared value And input  = [" + strValue + "]";
						break;
					case "clearsendKeysTABTAB" :
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
						oWebDriverWait = new WebDriverWait(driver, 20);

						oWebElement.clear();
						oWebElement.sendKeys(strValue);
						oActions.moveToElement(oWebElement).build().perform();
						oRobot.keyPress(KeyEvent.VK_TAB);
						oRobot.keyRelease(KeyEvent.VK_TAB);
						oRobot.keyPress(KeyEvent.VK_TAB);
						oRobot.keyRelease(KeyEvent.VK_TAB);
						LogMsg = ElementName + "  cleared value and input  = [" + strValue + "] And pressed TAB";
						break;
					case "clearsendKeysoActionsTAB" :
						oWebElement.clear();
						oWebElement.sendKeys(strValue);
						oActions.sendKeys(Keys.TAB).build().perform();
						LogMsg = ElementName + "  cleared value and input  = [" + strValue + "] And pressed TAB";
						break;
					case "clearsendKeysoActionsENTER" :
						oActions.moveToElement(oWebElement).build().perform();
						oActions.sendKeys(Keys.BACK_SPACE).build().perform();

						oWebElement.sendKeys(strValue);
						oActions.sendKeys(Keys.ENTER).build().perform();
						LogMsg = ElementName + "  cleared value and input  = [" + strValue + "] And pressed ENTER";
						break;
					case "clearsendKeysoJavascriptExecutor" :
						oActions.moveToElement(oWebElement).build().perform();
						oWebElement.sendKeys(Keys.BACK_SPACE);
						oWebElement.sendKeys(strValue);
						oJavascriptExecutor.executeScript("arguments[0].value='" + strValue + "';", oWebElement);
						oWebElement.sendKeys(Keys.ENTER);
						LogMsg = ElementName + "  cleared value and input  = [" + strValue + "] And pressed ENTER";
						break;
					case "selectByIndex" :
						new Select(oWebElement).selectByIndex(Integer.parseInt(strValue));
						LogMsg = ElementName + "  Selected = " + strValue;
						break;
					case "selectByVisibleText" :
						new Select(oWebElement).selectByVisibleText(strValue);
						LogMsg = ElementName + "  Selected = " + strValue;
						break;
					case "selectByVisibleTextAndwait" :
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
						oWebDriverWait = new WebDriverWait(driver, 20);

						new Select(oWebElement).selectByVisibleText(strValue);

						LogMsg = ElementName + "  Selected = " + strValue;
						break;
					case "selectByValue" :
						new Select(oWebElement).selectByValue(strValue);
						LogMsg = ElementName + "  Selected = " + strValue;
						break;
					default :
						throw new IOException("No support for command : " + command);
				}

				oExtentTest.log(Status.INFO, LogMsg);

				if (!command.isEmpty()) {
					String LogMsg = "Element : " + ElementName.toString() + " command : [" + command.toString() + "] Value : [" + strValue.toString() + "]";
					System.out.println(LogMsg);
				}

			}

		} catch (Exception e) {
			LogMsg = ElementName + " =  [" + strValue + "]";
			oExtentTest.log(Status.FAIL, LogMsg);
			e.printStackTrace();
			throw e;
		}

	}

	public void GuidewireAutomate_Table(String ElementName, By Locator, String command, String strValue) throws Throwable {

		oWebElement = null;
		LogMsg      = null;
		Actions oActions = new Actions(driver);
		Action  oAction;
		try {

			// Get the Element.
			oList_WebElement = getElements(Locator);

			switch (command) {

				case "sendKeys" :
					oWebElement.sendKeys(strValue);
					break;
				case "selectByIndex" :
					new Select(oWebElement).selectByIndex(Integer.parseInt(strValue));
					break;
				case "selectByVisibleText" :
					new Select(oWebElement).selectByVisibleText(strValue);
					break;
				case "selectByValue" :
					new Select(oWebElement).selectByValue(strValue);
					break;
				case "moveToElement" :
					oAction = oActions.moveToElement(oWebElement).build();
					oAction.perform();
					break;
				case "clear" :
					oWebElement.clear();
					break;
				case "click" :
					// oWebDriverWait.until(ExpectedConditions.elementToBeClickable(oWebElement));
					oWebElement.click();
					break;
				default :
					throw new IOException("No support for command : " + command);

			}

			String strTemp = "Element : " + Locator.toString() + " command : [" + command.toString() + "] Value : [" + strValue.toString() + "]";
			System.out.println(strTemp);
			if (command.equals("click")) {
				LogMsg = "Clicked : " + ElementName;

			} else {
				LogMsg = ElementName + " =  [" + strValue.toString() + "]";
			}
			oExtentTest.log(Status.INFO, LogMsg);

		} catch (Exception e) {
			LogMsg = ElementName + " =  [" + strValue.toString() + "]";
			oExtentTest.log(Status.FAIL, LogMsg);
			e.printStackTrace();
			throw e;
		}

	}

	public static void GuidewireAutomate_Handle(String Handle, String HandleName) {
		oWebElement = null;
		LogMsg      = null;

		try {

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			oWebDriverWait = new WebDriverWait(driver, 20);

			switch (Handle) {
				case "alertaccept" :
					LogMsg = Handle + " = " + driver.switchTo().alert().getText();
					driver.switchTo().alert().accept();
					break;
				case "alertdismiss" :
					LogMsg = Handle + " = " + driver.switchTo().alert().getText();
					driver.switchTo().alert().dismiss();
					break;
				case "childwindow" :
					driver.switchTo().window(HandleName);
					LogMsg = HandleName + " =  [" + HandleName.toString() + "]";
					break;
				case "parentwindow" :
					driver.switchTo().window(HandleName);
					LogMsg = HandleName + " =  [" + HandleName.toString() + "]";
					break;
				case "defaultContent" :
					driver.switchTo().defaultContent();
					LogMsg = HandleName + " =  [" + HandleName.toString() + "]";
					break;
				case "parentFrame" :
					driver.switchTo().parentFrame();
					LogMsg = HandleName + " =  [" + HandleName.toString() + "]";
					break;
				default :
					throw new IOException("No support for : " + Handle);

			}

			oExtentTest.log(Status.INFO, LogMsg);

		} catch (Exception e) {
			LogMsg = Handle + " =  [" + HandleName.toString() + "]";
			oExtentTest.log(Status.FAIL, LogMsg);
			e.printStackTrace();
		}
	}

	public static void GuidewireAutomate_waitForElement(By Locator, String strExpectedConditions, String strExpectedValue) throws Throwable {

		boolean bExpectedConditions = false;

		switch (strExpectedConditions) {

			case "alertIsPresent" :
				oWebDriverWait.until(ExpectedConditions.alertIsPresent());
				break;

			case "frameToBeAvailableAndSwitchToIt" :
				oWebDriverWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Locator));
				break;

			case "elementToBeSelected" :
				oWebDriverWait.until(ExpectedConditions.elementToBeSelected(Locator));
				break;

			case "elementToBeClickable" :
				oWebDriverWait.until(ExpectedConditions.elementToBeClickable(getElement(Locator)));
				break;

			case "visibilityOfElementLocated" :
				oWebDriverWait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
				break;

			case "visibilityOfAllElementsLocatedBy" :
				oWebDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Locator));
				break;

			case "visibilityOf" :
				oWebDriverWait.until(ExpectedConditions.visibilityOf(getElement(Locator)));
				break;

			case "invisibilityOfElementLocated" :
				oWebDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(Locator));
				break;

			case "titleContains" :
				// oWebDriverWait.until(ExpectedConditions.titleContains(strExpectedValue));
				break;

			default :
				throw new IOException("No support for ExpectedConditions : " + strExpectedConditions);
		}
	}

	public static void GuidewireAutomate_Validation(String ElementName, By Locator, String strValidation, String strExpected) throws Throwable {

		boolean bValidation = false;
		strActual   = null;
		oWebElement = null;

		try {

			if (!strExpected.isEmpty()) {

				if (strExpected.equals("Empty")) {
					strExpected = "";
				}

				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				oWebDriverWait = new WebDriverWait(driver, 20);
				oWebDriverWait.until(ExpectedConditions.visibilityOfElementLocated(Locator));

				switch (strValidation) {

					case "equals" :
						strActual = getText_Element(Locator);
						bValidation = strActual.equalsIgnoreCase(strExpected);
						break;
					case "equalsAssert" :
						strActual = getText_Element(Locator);
						bValidation = strActual.equalsIgnoreCase(strExpected);
						Assert.assertEquals(strActual, strExpected);
						break;
					case "fetch" :
						strActual = getText_Element(Locator);
						bValidation = true;
						strFetchValue = strActual;
						break;
					case "fetchValue" :
						strActual = getAttribute_Element(Locator, "value");
						bValidation = true;
						strFetchValue = strActual;
						break;
					case "contains" :
						strActual = getText_Element(Locator);
						bValidation = strActual.contains(strExpected);
						break;
					case "FirstSelectedOptionEquals" :
						strActual = getFirstSelectedOption_Element(Locator);
						bValidation = strActual.equalsIgnoreCase(strExpected);
						break;
					case "valueEquals" :
						strActual = getAttribute_Element(Locator, "value");
						bValidation = strActual.equalsIgnoreCase(strExpected);
						break;
					case "valueEqualsAssert" :
						strActual = getAttribute_Element(Locator, "value");
						bValidation = strActual.equalsIgnoreCase(strExpected);
						Assert.assertEquals(strActual, strExpected);
						break;
					case "valuecontains" :
						strActual = getAttribute_Element(Locator, "value");
						bValidation = strActual.contains(strExpected);
						break;
					case "isEmpty" :
						strActual = Boolean.toString(ElementName.isEmpty());
						bValidation = strActual.equalsIgnoreCase("isEmpty");
						strExpected = "isEmpty";
						break;
					case "isEnabled" :
						strExpected = "isEnabled";
						bValidation = getElement(Locator).isEnabled();
						if (bValidation) {
							strActual = "isEnabled";
						} else {
							strActual = "isNotEnabled";
						}
						bValidation = strActual.equalsIgnoreCase(strExpected);
						break;
					case "isSelected" :// Checkbox
						strExpected = "isSelected";
						bValidation = getElement(Locator).isSelected();
						if (bValidation) {
							strActual = "isSelected";
						} else {
							strActual = "isNotSelected";
						}
						bValidation = strActual.equalsIgnoreCase(strExpected);
						break;
					case "isDisabled" :
						strExpected = "isDisabled";
						bValidation = getElement(Locator).isEnabled();
						if (!bValidation) {
							strActual = "isDisabled";
						} else {
							strActual = "isNotDisabled";
						}
						bValidation = strActual.equalsIgnoreCase(strExpected);
						break;
					case "isDisplayed" :
						strExpected = "isDisplayed";
						bValidation = oWebDriverWait.until(ExpectedConditions.visibilityOf(getElement(Locator))) != null;
						if (bValidation) {
							strActual = "isDisplayed";
						} else {
							strActual = "isNotDisplayed";
						}
						break;
					case "numberOfWindowsToBe" :
						bValidation = oWebDriverWait.until(ExpectedConditions.numberOfWindowsToBe(Integer.parseInt(strValidation))).booleanValue();
						break;

					case "invisibilityOfElementLocated" :
						bValidation = oWebDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(Locator));
						break;

					case "titleContains" :
						// bValidation =
						// oWebDriverWait.until(ExpectedConditions.titleContains(strExpectedValue));
						break;

					default :
						throw new IOException("No support for GuidewireAutomate_Validation : " + strValidation);
				}

				driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
				oWebDriverWait = new WebDriverWait(driver, 7);

				if (strValidation.contains("fetch")) {
					LogMsg = ElementName + " => Fetched value = [" + strActual + "]";

				} else {
					LogMsg = ElementName + " => Actual = [" + strActual + "] " + strValidation + " Expected = [" + strExpected + "]";
				}

				System.out.println(LogMsg);

				if (strValidation.contains("fetch")) {
					oExtentTest.log(Status.INFO, LogMsg);
				} else if (bValidation) {
					oExtentTest.log(Status.PASS, LogMsg);
				} else {
					oExtentTest.log(Status.FAIL, LogMsg);
				}
			}

		} catch (Exception e) {
			LogMsg = ElementName + " =  [" + ElementName.toString() + "]";
			oExtentTest.log(Status.FAIL, LogMsg);
			e.printStackTrace();
			throw e;
		}

	}

	public String getElement_Property(By Locator, String Keyword, String PropertyName) throws Throwable {

		strValue = null;

		switch (Keyword) {

			case "getAttribute" :
				return getElement(Locator).getAttribute(PropertyName);
			case "getCssValue" :
				return getElement(Locator).getCssValue(PropertyName);
			case "getTagName" :
				return getElement(Locator).getTagName();
			case "getText" :
				return getElement(Locator).getText();
			case "getOptions" :
				return ((Select) getElement(Locator)).getOptions().toString();
			case "getFirstSelectedOption" :
				return new Select(getElement(Locator)).getFirstSelectedOption().getText().toString();
			case "getSize" :
				return getElement(Locator).getSize().toString();
			default :
				throw new IOException("No support for Keyword : " + Keyword);
		}

	}

	public static void robotkey() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ESCAPE);
	}

	/*
	 * Browwser
	 */
	public void switchAllWindow() {

		// It will return the parent window name as a Strings
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.getTitle());

				// driver.close();
			}

		}
		// switch to the parent window
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());

	}

	public void switchChildBrowser() {

		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println("switchChildBrowser getTitle =  " + driver.getTitle());
			}
		}

		driver.switchTo().defaultContent();
	}

	public int switchChildBrowserIndex() {

		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println("switchChildBrowser getTitle =  " + driver.getTitle());
			}
		}

		driver.switchTo().defaultContent();
		return 1;
	}

	public void openBrowserCount() {

		Set<String>       allWindowHandles = driver.getWindowHandles();
		ArrayList<String> tabs             = new ArrayList<String>(allWindowHandles);

		// ArrayList<String> tabs = new ArrayList<String>
		// (robot.getWebDriver().getWindowHandles());

		System.out.println("No. of tabs: " + tabs.size());

	}

	/*
	 * Not Required
	 */
	public static String getText_Element(By Locator) throws Throwable {
		return getElement(Locator).getText();
	}

	public static String getText_Element(WebElement oWebElement) throws Throwable {
		return getElement(oWebElement).getText();
	}

	public static String getFirstSelectedOption_Element(By Locator) throws Throwable {
		return new Select(getElement(Locator)).getFirstSelectedOption().getText().toString();
	}

	public static String getFirstSelectedOption_Element(WebElement oWebElement) throws Throwable {
		return new Select(getElement(oWebElement)).getFirstSelectedOption().getText().toString();
	}

	public static String getOptions_Element(By Locator) throws Throwable {
		return new Select(getElement(Locator)).getOptions().toString();
	}

	public static String getAttribute_Element(By Locator, String Attribute) throws Throwable {
		oWebElement = null;
		try {
			oWebElement = getElement(Locator);
		} catch (StaleElementReferenceException e) {
			oWebElement = getElement(Locator);
		}
		return oWebElement.getAttribute(Attribute);
	}

	public static String getValue_Element(By Locator) throws Throwable {
		return getElement(Locator).getAttribute("value");
	}

	public static String getValue_Element(WebElement oWebElement) throws Throwable {
		return getElement(Locator).getAttribute("value");
	}

	public static String getText_ElementWait(By Locator) throws Throwable {
		WebElement we = getElement(Locator);
		oWebDriverWait.until(ExpectedConditions.visibilityOf(we));
		oJavascriptExecutor.executeScript("arguments[0].scrollIntoView();", we);

		String stetemp = we.getText();
		System.out.println(stetemp);
		oExtentTest.log(Status.INFO, stetemp);
		return stetemp;
	}

	public static void scrollUpToElement(WebElement element) {

		oJavascriptExecutor.executeScript("window.scrollBy(0,0)");
		oJavascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void gwAssertEquals(By Locator, String strExpected) throws Throwable {
		String strActual = getText_Element(Locator);
		LogMsg = "Actual Value = [" + strActual + "] 	Expected Value = [" + strActual + "]";
		System.out.println(LogMsg);
		Assert.assertEquals(strActual, strExpected);

		if (strActual.equalsIgnoreCase(strExpected)) {
			oExtentTest.log(Status.PASS, LogMsg);
		} else {
			oExtentTest.log(Status.FAIL, LogMsg);
			throw new Exception(LogMsg);
		}
	}

	public static void gwVerifyEquals(By Locator, String strExpected) throws Throwable {
		String strActual = getText_Element(Locator);
		LogMsg = "Actual Value = [" + strActual + "] 	Expected Value = [" + strActual + "]";
		System.out.println(LogMsg);
		Verify.verify(true, strActual, 0);

		if (strActual.equalsIgnoreCase(strExpected)) {
			oExtentTest.log(Status.PASS, LogMsg);
		} else {
			oExtentTest.log(Status.FAIL, LogMsg);
			throw new Exception(LogMsg);
		}
	}

	public static void waitForElementPresent(WebElement Element) {
		try {
			oWebDriverWait.until(ExpectedConditions.visibilityOf(Element));
		} catch (Exception e) {
			System.out.println("Exception in waitForElementPresent");
			e.printStackTrace();
		}
	}

	public static void GWHandleTable() throws Throwable {

		int intColumnNumber;
		int intRowNumber;

		By     Locator_Table_ColumnHeaderCell = null;
		By     Locator_Table_RowCell          = null;
		String strTable_ColumnHeaderValue     = null;
		String strTable_RowCellValue          = null;

		intColumnNumber = getTable_ColumnNumber(Locator_Table_ColumnHeaderCell, strTable_ColumnHeaderValue);
		intRowNumber    = getTable_RowNumber(Locator_Table_RowCell, intColumnNumber, strTable_RowCellValue);

	}

	public static int getTable_ColumnNumber(By Locator_Table_ColumnHeaderCell, String strTable_ColumnHeaderValue) throws Throwable {

		int intColumnNumber;
		oWebElement      = null;
		oList_WebElement = null;
		boolean bFound = false;

		try {

			intColumnNumber = 0;

			oList_WebElement = getElements(Locator_Table_ColumnHeaderCell);
			for (WebElement oWebElement : oList_WebElement) {
				if (oWebElement.getText().equalsIgnoreCase(strTable_ColumnHeaderValue)) {
					bFound = true;
					break;
				} else {
					intColumnNumber++;
				}
			}

		} catch (Exception e) {
			throw e;
		}

		if (!bFound) {
			LogMsg = "HeaderColumnName = " + strTable_ColumnHeaderValue;
			oExtentTest.log(Status.FAIL, LogMsg);
			throw new Exception(LogMsg);

		}

		return intColumnNumber;
	}

	public static int getTable_RowNumber(By Locator_Table_RowCell, int intColumnNumber, String strTable_RowCellValue) throws Throwable {

		int intRowNumber;
		oWebElement = null;
		boolean bFound = false;

		try {
			intRowNumber = 0;

			oList_WebElement = getElements(Locator_Table_RowCell);
			for (WebElement oWebElement : oList_WebElement) {
				if (oWebElement.getText().equalsIgnoreCase(strTable_RowCellValue)) {
					bFound = true;
					break;
				} else {
					intRowNumber++;
				}
			}

		} catch (Exception e) {
			throw e;
		}
		if (!bFound) {
			LogMsg = "Value  = " + strTable_RowCellValue;
			oExtentTest.log(Status.FAIL, LogMsg);
			throw new Exception(LogMsg);

		}
		return intRowNumber;

	}

}
