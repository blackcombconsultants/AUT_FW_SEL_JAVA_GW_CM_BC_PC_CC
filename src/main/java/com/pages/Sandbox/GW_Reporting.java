package com.pages.Sandbox;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GW_Reporting extends GW_Base {
	public String ehrDate;
	public static String pUserdir = System.getProperty("user.dir");

	public ExtentReports getReport() {

		SimpleDateFormat ddMMMMyyyy = new SimpleDateFormat("ddMMMMyyyy");
		ehrDate = ddMMMMyyyy.format(new Date());

		String pesrName = pUserdir + "\\reports\\ExtentReport_" + ehrDate + ".html";
		oExtentSparkReporter = new ExtentSparkReporter(pesrName);
		oExtentSparkReporter.config().setReportName("Billing Center");
		oExtentSparkReporter.config().setDocumentTitle("Automation Report");
		//oExtentSparkReporter.config().setTheme(Theme.DARK);

		//oExtentReports = new ExtentReports(pesrName,true);
		oExtentReports = new ExtentReports();

		oExtentReports.attachReporter(oExtentSparkReporter);
		oExtentReports.setSystemInfo("Executed on OS: ", System.getProperty("os.name"));
		oExtentReports.setSystemInfo("Executed by User: ", System.getProperty("user.name"));
		oExtentReports.setSystemInfo("Hostname: ", System.getProperty("hostname"));

		return oExtentReports;

	}
}
