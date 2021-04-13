package com.Utils.Selenium;

import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Selenium_Utils_DataBase extends Selenium_Utils_File {
	Connection oConnection = null;
	final static String JdbcOdbcDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
	final static String MicrosoftExcelDriver = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};DBQ=%s;DriverID=22;READONLY=false";

	public Connection getConnection(String strConnectionType, String pFilePath) throws Throwable {

		switch (strConnectionType) {
		case "Fillo":
			Fillo oFillo = new Fillo();
			oConnection = oFillo.getConnection(pFilePath);
			break;

		case "JdbcOdbcDriver":

			break;

		case "Oracle":

			break;

		case "MySQL":

			break;

		case "mongoDB":

			break;

		default:
			break;
		}

		return oConnection;

	}

	public LinkedHashMap<String, String> executeQuery(Connection oConnection, String strQuery) throws Throwable {

		LinkedHashMap<String, String> lhmQueryResult = new LinkedHashMap<String, String>();

		System.out.println(" executeQuery   strQuery = " + strQuery);
		Recordset orecordset = oConnection.executeQuery(strQuery);

		List<String> oList_Header = orecordset.getFieldNames();

		// Only first row
		orecordset.moveFirst();
		for (String strHeaderName : oList_Header) {
			lhmQueryResult.put(strHeaderName, orecordset.getField(strHeaderName));
		}
		orecordset.close();
		oConnection.close();

		return lhmQueryResult;

	}

	public LinkedHashMap<String, String> getData_MSExcel_WorkSheet_Fillo(String strTable, String strPrimaryKeyValue)
			throws Throwable {

		String strQuery = "Select * from " + strTable + " where PrimaryKey='" + strPrimaryKeyValue + "'";
		
		oConnection = getConnection("Fillo", pTestDataFilePath);
		return executeQuery(oConnection, strQuery);

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
}
