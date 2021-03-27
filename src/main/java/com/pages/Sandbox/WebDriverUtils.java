package com.pages.Sandbox;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

	WebDriver driver;
	WebDriverWait oWebDriverWait;

	private static Properties oProperties;
	private static FileInputStream oFIS;

	public WebDriverUtils(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void gwAutomate(By Locator, String Action, String strValue) {
		try {
			WebElement we = getElement(Locator);
			// Highlight the Element using Java Script.

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style','background: palegreen; border: 8px solid red:')", we);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			js.executeScript("arguments[0].setAttribute('style','border: solid 2px white')", we);

			switch (Action) {
			case "sendkeys":
				we.sendKeys(strValue);
				break;
			case "clear":
				we.clear();
				break;
			case "select":
				new Select(we).selectByVisibleText(strValue);
				break;
			case "selectByVisibleText":
				new Select(we).selectByVisibleText(strValue);

				break;
			case "click":
				we.click();
				break;

			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public WebElement getElement(By Locator) {
		WebElement we = driver.findElement(Locator);
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(we));
		return we;
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
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(we));
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

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,0)");
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public String getValue_PropertiesFile(String pPropertiesFilePath, String strItem) {
		String strValue = null;

		strItem = "sample";

		try {
			File oFile = new File(pPropertiesFilePath);
			oFIS = new FileInputStream(oFile);
			oProperties = new Properties();
			oProperties.load(oFIS);
			strValue = oProperties.getProperty(strItem);
			if (strValue != null)
				return strValue;
			else
				throw new RuntimeException(strItem + " not specified in " + pPropertiesFilePath);

		} catch (Exception e) {
			System.out.println("Exception is ==" + e.getMessage());
		}

		System.out.println("File Path = " + pPropertiesFilePath);
		System.out.println(strItem + " = " + strValue);

		return strValue;
	}

}
