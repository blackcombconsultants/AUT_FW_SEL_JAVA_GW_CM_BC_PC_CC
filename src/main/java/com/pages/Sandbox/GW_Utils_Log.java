package com.pages.Sandbox;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GW_Utils_Log extends GW_Base {

	public static String getScreenShoFt(WebDriver driver) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		String strPath = pUserdir + "/Screenshots/" + sdf_ddMMMMyyyyHHmmss.format(new Date()) + ".jpeg";
		File pSource = ts.getScreenshotAs(OutputType.FILE);
		File pDestination = new File(strPath);

		try {
			FileUtils.copyFile(pSource, pDestination);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			oExtentTest.addScreenCaptureFromPath(strPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strPath;
	}
}
