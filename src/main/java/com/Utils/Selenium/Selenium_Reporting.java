package com.Utils.Selenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Selenium_Reporting extends GW_Base {

	public static ExtentReports getExtentReports() {

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

		oExtentReports.attachReporter(oExtentSparkReporter);
		oExtentReports.setSystemInfo("Executed on OS: ", gstrOSname);
		oExtentReports.setSystemInfo("Executed by User: ", gstrUsername);
		oExtentReports.setSystemInfo("Hostname: ", gstrHostname);

		return oExtentReports;

	}


}
