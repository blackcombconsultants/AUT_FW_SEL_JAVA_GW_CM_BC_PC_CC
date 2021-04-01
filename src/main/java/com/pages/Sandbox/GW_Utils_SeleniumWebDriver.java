package com.pages.Sandbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class GW_Utils_SeleniumWebDriver extends GW_Utils_File_ReadData {

	WebDriver driver;
	WebElement oWebElement;
	ExtentTest oExtentTest;

	public GW_Utils_SeleniumWebDriver(WebDriver driver, ExtentTest oExtentTest) {
		this.driver = driver;
		this.oExtentTest = oExtentTest;
	}

	public void gwAutomate(By Locator, String Action, String strValue) {

		oWebElement = null;

		try {

			// Get the Element.
			oWebElement = getElement(Locator);

			switch (Action) {
			case "sendkeys":
				oWebElement.sendKeys(strValue);
				break;
			case "clear":
				oWebElement.clear();
				break;
			case "select":
				new Select(oWebElement).selectByVisibleText(strValue);
				break;
			case "selectByVisibleText":
				new Select(oWebElement).selectByVisibleText(strValue);

				break;
			case "click":
				oWebElement.click();
				break;

			default:
				break;
			}

			String LogMsg;
			String strTemp = "Element : " + Locator.toString() + " Action : [" + Action.toString() + "] Value : ["
					+ strValue.toString() + "]";
			System.out.println(strTemp);
			if (Action.equals("click")) {
				LogMsg = "Clicked Element : " + Locator.toString();

			} else {
				LogMsg = "Element : " + Locator.toString() + " =  [" + strValue.toString() + "]";
			}
			oExtentTest.log(Status.INFO, LogMsg);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public WebElement getElement(By Locator) {

		oWebElement = null;

		try {

			oWebElement = driver.findElement(Locator);
			oWebDriverWait.until(ExpectedConditions.visibilityOf(oWebElement));

			// Highlight the Element.

			oJavascriptExecutor = (JavascriptExecutor) driver;

			oJavascriptExecutor.executeScript(
					"arguments[0].setAttribute('style','background: palegreen; border: 8px solid red:')", oWebElement);

			Thread.sleep(500);

			oJavascriptExecutor.executeScript("arguments[0].setAttribute('style','border: solid 2px white')",
					oWebElement);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return oWebElement;
	}

	public int getSize_ElementsList(By Locator) {
		List<WebElement> Temp = driver.findElements(Locator);
		return Temp.size() - 1;
	}

	public String getText_Element(By Locator) {
		return getElement(Locator).getText();
	}

	public String getText_ElementWait(By Locator) {
		WebElement we = getElement(Locator);
		oWebDriverWait.until(ExpectedConditions.visibilityOf(we));
		return we.getText();
	}

	public void click_Element(By Locator) {
		getElement(Locator).click();
	}

	public void sendkeys_Element(By Locator, String strValue) {
		getElement(Locator).sendKeys(strValue);
	}

	public void select_Element(By Locator, String strValue) {
		new Select(getElement(Locator)).selectByVisibleText(strValue);

	}

	public void scrollUpToElement(WebElement element) {

		oJavascriptExecutor = (JavascriptExecutor) driver;
		oJavascriptExecutor.executeScript("window.scrollBy(0,0)");
		oJavascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);

	}

	public String getValue_PropertiesFile(String pPropertiesFilePath, String strItem) {
		String strValue = null;

		strItem = "sample";

		try {
			oFile = new File(pUserdir + pConfigproperties);
			Properties oProperties = new Properties();
			try {
				oFileInputStream = new FileInputStream(oFile);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}

			try {
				oProperties.load(oFileInputStream);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			strValue = oProperties.getProperty(strItem);
			if (strValue == null)
				throw new RuntimeException(strItem + " not specified in " + pPropertiesFilePath);

		} catch (Exception e) {
			System.out.println("Exception is ==" + e.getMessage());
		}

		System.out.println("File Path = " + pPropertiesFilePath);
		System.out.println(strItem + " = " + strValue);

		return strValue;
	}

	public void gwAssert(By Locator, String strExpected) {
		String strActual = getText_Element(Locator);
		Assert.assertEquals(strActual, strExpected);
		System.out.println("Actual Value = [" + strActual + "] Expected Value = [" + strActual + "]");

	}
}
