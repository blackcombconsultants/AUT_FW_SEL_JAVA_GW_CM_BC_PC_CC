package com.Utils.Selenium;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Selenium_Utils_File extends Selenium_Reporting_Utils {

	String strValue;

	final static String JdbcOdbcDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
	final static String MicrosoftExcelDriver = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};DBQ=%s;DriverID=22;READONLY=false";

	public LinkedHashMap<String, String> getDataFromSheet_Fillo(String strSheetName, String strPrimaryKeyValue)
			throws FilloException {

		LinkedHashMap<String, String> lhmTestDataSheet = new LinkedHashMap<String, String>();

		Fillo oFillo = new Fillo();
		Connection oConnection = oFillo.getConnection(pTestDataFilePath);

		String strQuery = "Select * from " + strSheetName + " where PrimaryKey='" + strPrimaryKeyValue + "'";
		System.out.println("strQuery = " + strQuery);

		Recordset recordset = oConnection.executeQuery(strQuery);
		List<String> oList_Header = recordset.getFieldNames();

		// Only first row
		recordset.moveFirst();
		for (String strHeaderName : oList_Header) {
			lhmTestDataSheet.put(strHeaderName, recordset.getField(strHeaderName));
		}
		recordset.close();
		oConnection.close();

		return lhmTestDataSheet;

	}

	public String getValue_PropertiesFile(String pPropertiesFilePath, String strItem) throws Throwable {
		strValue = null;
		oFile = null;
		oFileInputStream = null;
		oProperties = null;

		try {
			oFile = new File(pPropertiesFilePath);
			oFileInputStream = new FileInputStream(oFile);
			oProperties = new Properties();
			oProperties.load(oFileInputStream);
			strValue = oProperties.getProperty(strItem);
			if (strValue != null) {
				System.out.println("File Path = " + pPropertiesFilePath);
				System.out.println(strItem + " = " + strValue);
			} else {
				throw new RuntimeException(strItem + " not specified in " + pPropertiesFilePath);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return strValue;

	}

	public void updateCSV(String filePath, String match, String columnName, String valueToBeUpdated) throws Exception {

		int row = 1;
		int col = 1;
		File inputFile = new File(filePath);

		// Read existing file
		CSVReader reader = new CSVReader(new FileReader(inputFile));
		List<String[]> csvBody = reader.readAll();
		int colsPresent = csvBody.get(row).length;
		if (colsPresent != col) {
			for (int i = colsPresent; i <= col - 1; i++) {
				csvBody.get(row)[col] = "";
			}
		}

		// get CSV row column and replace with by using row and column
		csvBody.get(row)[col] = valueToBeUpdated;
		reader.close();

		// Write to CSV file which is open
		CSVWriter writer = new CSVWriter(new FileWriter(inputFile));
		writer.writeAll(csvBody);
		writer.flush();
		writer.close();
	}

	public static void writeDataToExcel() throws Throwable {

		oFile = null;
		oFileOutputStream = null;
		oXSSFWorkbook = new XSSFWorkbook();
		Fillo oFillo = new Fillo();

		Document oDocument = Jsoup.parse(new File(pExtentReport_indexFile), "utf-8");
		new File(pFile_TestBreakTracker).mkdirs();
		oFileOutputStream = new FileOutputStream(pFile_TestBreakTracker);
		oXSSFWorkbook.write(oFileOutputStream);
		oFileOutputStream.close();
		oXSSFWorkbook.close();

		Connection oConnection = oFillo.getConnection(pFile_TestBreakTracker);
		try {
			oConnection.deleteTable("Report");
		} catch (Throwable t) {
			t.getCause();
		}
		oConnection.createTable("Report", new String[] { "ExecutionDate", "State", "Env", "Team", "TestCaseName",
				"Status", "ExecutionReportPath" });
		Elements allulTags = oDocument.getElementsByTag("ul").select("ul#test-collection");
		Elements allLLTags = allulTags.select("li");
		String env = oDocument.getElementsByTag("tr").select("tr>td:contains(Environment)").get(0).siblingElements()
				.text();
		String[] envArr = env.split("_");

		/*
		 * String userName =
		 * doc.getElementsByTag("tr").select("tr>td:contains(User Name)").get(0).
		 * siblingElements() .text(); String hostName =
		 * doc.getElementsByTag("tr").select("tr>td:contains(Host Name)").get(0).
		 * siblingElements() .text(); String javaVersion =
		 * doc.getElementsByTag("tr").select("tr>td:contains(Java Version)").get(0).
		 * siblingElements() .text(); String os =
		 * doc.getElementsByTag("tr").select("tr>td:contains(OS)").get(0).
		 * siblingElements().text();
		 */

		ArrayList<String> tcStatus = new ArrayList<String>();
		for (int i = 0; i < allLLTags.size(); i++) {
			Elements el = allLLTags.get(i).select("li>div>span.test-name");
			Elements sts = allLLTags.get(i).select("li>div>span.test-status");
			String val = el.text();
			String stsVal = sts.text();
			StringBuffer sb = new StringBuffer(val + "::" + stsVal);
			tcStatus.add(sb.toString());
		}

		for (int i = 0; i < tcStatus.size(); i++) {
			String[] tcData = tcStatus.get(i).split("::");
			String tcName = tcData[0];
			String tcSttus = tcData[1];
			String sql = "INSERT INTO Report(ExecutionDate,State,Env,Team,TestCaseName,Status,ExecutionReportPath) VALUES('"
					+ strCurrentDate_ddMMMMyyyy + "','" + envArr[2] + "','" + envArr[0] + "','" + "QFund_StoreFront"
					+ "','" + tcName + "','" + tcSttus + "','" + pExtentReport_indexFile + "')";
			oConnection.executeUpdate(sql);
		}

		oConnection.close();

	}

	public void getValue_JdbcOdbcDriver(String pFilePath) throws Exception {
		File file = new File(pFilePath);
		Class.forName(JdbcOdbcDriver);
		java.sql.Connection connection = DriverManager
				.getConnection(String.format(MicrosoftExcelDriver, file.getAbsolutePath()));

		Statement stmt = connection.createStatement();
		ResultSet recordset = stmt.executeQuery("SELECT * FROM [Config$] where CONFIG_NAME='QA1_CSR'");

		ArrayList<String> aField = ((Recordset) recordset).getFieldNames();
		recordset.beforeFirst();
		for (int i = 0; i < aField.size() - 1; i++) {
			System.out.print(((Recordset) recordset).getField(aField.get(i)) + "\t");
		}

	}

	public static void getValue_notepad() {
		try {
			// create a new process
			System.out.println("Creating Process...");
			Process p = Runtime.getRuntime().exec("notepad.exe");

			// get the input stream of the process and print it
			InputStream in = p.getInputStream();
			for (int i = 0; i < in.available(); i++) {
				System.out.println("" + in.read());
			}

			System.out.println("reading completed...");

			// get the output stream
			OutputStream out = p.getOutputStream();
			out.write(7);
			// close the output stream
			System.out.println("Closing the output stream...");

			out.close();

			// wait for 10 seconds and then destroy the process
			Thread.sleep(10000);
			p.destroy();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public String getRandomAlphabetic(int count) {
		return RandomStringUtils.randomAlphabetic(count);
	}

	public static String getRandomNumeric(int count) {
		return RandomStringUtils.randomNumeric(count);
	}

	public String getrandomTestMailId(int length) {
		boolean useLetters = true;
		boolean useNumbers = false;
		return RandomStringUtils.random(length, useLetters, useNumbers).toLowerCase() + "@testmail.com";
	}

	public String StringReverese(String strToReverse) {
		return new StringBuffer(strToReverse).reverse().toString();
	}

	public String getTempFolderPath() throws IOException {
		File temp = File.createTempFile("temp-file-name", ".tmp");
		String absolutePath = temp.getAbsolutePath();
		String tempFilePath = absolutePath.substring(0, absolutePath.lastIndexOf(File.separator));
		return tempFilePath;
	}

	public static String getRandomValue(String value) {
		Random r = new Random();
		String[] values = {};
		try {
			values = URLDecoder.decode(value, "UTF-8").split("\\|");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return values[r.nextInt(values.length)];
	}
	
	
	public static void ClipBoard()  {
		String strFilepath = "asd";
		StringSelection selection = new StringSelection(strFilepath);
		java.awt.datatransfer.Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);

	}

	
}
