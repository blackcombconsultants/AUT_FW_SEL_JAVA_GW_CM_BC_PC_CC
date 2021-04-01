package com.pages.Sandbox;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GW_Selenium_Reporting extends GW_Base {

	public static ExtentReports getReport() {

		oExtentSparkReporter = new ExtentSparkReporter(pExtentReport_indexFile);
		oExtentSparkReporter.config().setDocumentTitle("Automation Report");
		oExtentSparkReporter.config().setReportName("Billing Center");
		// oExtentSparkReporter.config().setTheme(Theme.DARK);

		oExtentHtmlReporter = new ExtentHtmlReporter(pExtentReport_indexFile);
		oExtentHtmlReporter.config().setDocumentTitle("Automation Report");
		oExtentHtmlReporter.config().setReportName("Billing Center");
		// oExtentSparkReporter.config().setTheme(Theme.DARK);

		// oExtentReports = new ExtentReports(pesrName,true);
		oExtentReports = new ExtentReports();

		oExtentReports.attachReporter(oExtentHtmlReporter);
		oExtentReports.setSystemInfo("Executed on OS: ", gstrOSname);
		oExtentReports.setSystemInfo("Executed by User: ", gstrUsername);
		oExtentReports.setSystemInfo("Hostname: ", gstrHostname);

		return oExtentReports;

	}


}
