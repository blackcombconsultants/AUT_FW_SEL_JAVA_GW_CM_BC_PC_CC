package com.pages.Sandbox;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GW_Selenium_Reporting extends GW_Base {
	String pExtentReportFile;

	public ExtentReports getReport() {

		pExtentReportFile = pUserdir + "\\test-output\\extentreports\\index.html";

		oExtentSparkReporter = new ExtentSparkReporter(pExtentReportFile);
		oExtentSparkReporter.config().setDocumentTitle("Automation Report");
		oExtentSparkReporter.config().setReportName("Billing Center");
		// oExtentSparkReporter.config().setTheme(Theme.DARK);

		oExtentHtmlReporter = new ExtentHtmlReporter(pExtentReportFile);
		oExtentHtmlReporter.config().setDocumentTitle("Automation Report");
		oExtentHtmlReporter.config().setReportName("Billing Center");
		// oExtentSparkReporter.config().setTheme(Theme.DARK);

		// oExtentReports = new ExtentReports(pesrName,true);
		oExtentReports = new ExtentReports();

		oExtentReports.attachReporter(oExtentHtmlReporter);
		oExtentReports.setSystemInfo("Executed on OS: ", System.getProperty("os.name"));
		oExtentReports.setSystemInfo("Executed by User: ", System.getProperty("user.name"));
		oExtentReports.setSystemInfo("Hostname: ", System.getProperty("hostname"));

		return oExtentReports;

	}
}
