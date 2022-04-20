package com.Utils.Selenium;

import java.io.File;
import java.io.IOException;
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
	static Connection   oConnection          = null;
	final static String JdbcOdbcDriver       = "sun.jdbc.odbc.JdbcOdbcDriver";
	final static String MicrosoftExcelDriver = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};DBQ=%s;DriverID=22;READONLY=false";

	public static Connection getConnection(String strConnectionType, String pFilePath) throws Throwable {

		switch (strConnectionType) {
			case "Fillo" :
				Fillo oFillo = new Fillo();
				oConnection = oFillo.getConnection(pFilePath);
				break;

			case "JdbcOdbcDriver" :

				break;

			case "Oracle" :

				break;

			case "MySQL" :

				break;

			case "mongoDB" :

				break;

			default :
				throw new IOException("No Support for Connection " + strConnectionType);
		}

		return oConnection;

	}

	public static void Query(Connection oConnection, String SQL, String strQuery) throws Throwable {

		switch (SQL) {
			case "SELECT" :

				break;

			case "CREATE" :

				break;

			case "ALTER" :

				break;

			case "INSERT" :

				break;

			case "UPDATE" :

				break;
			case "DELETE" :

				break;

			default :
				throw new IOException("No Support for SQL " + SQL);
		}

	}

	public void getValue_JdbcOdbcDriver(String pFilePath) throws Exception {
		File file = new File(pFilePath);
		Class.forName(JdbcOdbcDriver);
		java.sql.Connection connection = DriverManager.getConnection(String.format(MicrosoftExcelDriver, file.getAbsolutePath()));

		Statement stmt      = connection.createStatement();
		ResultSet recordset = stmt.executeQuery("SELECT * FROM [Config$]");

		ArrayList<String> aField = ((Recordset) recordset).getFieldNames();
		recordset.beforeFirst();
		for (int i = 0; i < aField.size() - 1; i++) {
			System.out.print(((Recordset) recordset).getField(aField.get(i)) + "\t");
		}
	}

	public static LinkedHashMap<String, String> executeQuery(Connection oConnection, String strQuery) throws Throwable {

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

	/*
	 * WorkBook_WorkSheet_DataSet
	 */
	public static LinkedHashMap<String, String> getData_MSExcel_WorkBook_WorkSheet_DataSet_Fillo(String pWorkBook, String WorkSheet, String PrimaryKey, int SecondKey) throws Throwable {
		String strSelectQuery = "Select * from " + WorkSheet + " WHERE PrimaryKey='" + PrimaryKey + "' AND DataSet='" + SecondKey + "'";
		oConnection = getConnection("Fillo", pWorkBook);
		return executeQuery(oConnection, strSelectQuery);
	}

	public static void UpdateData_MSExcel_WorkSheet_Column_DataSet_Fillo(String pWorkBook, String strTable, String strColumn, String strValue, String SecondKey) throws Throwable {
		String strUpdateQuery = "UPDATE " + strTable + " SET " + strColumn + "='" + strValue + "' WHERE PrimaryKey='" + strTestCaseName + "' AND DataSet='" + SecondKey + "'";
		System.out.println(strUpdateQuery);
		oConnection = getConnection("Fillo", pWorkBook);
		oConnection.executeUpdate(strUpdateQuery);
		oConnection.close();
	}

	/*
	 * WorkBook_WorkSheet
	 */
	public static LinkedHashMap<String, String> getData_MSExcel_WorkBook_WorkSheet_Fillo(String pWorkBook, String WorkSheet, String PrimaryKey) throws Throwable {
		String strSelectQuery = "Select * from " + WorkSheet + " WHERE PrimaryKey='" + PrimaryKey + "'";
		oConnection = getConnection("Fillo", pWorkBook);
		return executeQuery(oConnection, strSelectQuery);
	}

	public static void UpdateData_MSExcel_WorkSheet_Column_Fillo(String pWorkBook, String strTable, String strColumn, String strValue) throws Throwable {
		String strUpdateQuery = "UPDATE " + strTable + " SET " + strColumn + "='" + strValue + "' WHERE PrimaryKey='" + strTestCaseName + "'";
		System.out.println(strUpdateQuery);
		oConnection = getConnection("Fillo", pWorkBook);
		oConnection.executeUpdate(strUpdateQuery);
		oConnection.close();
	}

	/*
	 * WorkSheet
	 */
	public static LinkedHashMap<String, String> getData_MSExcelWorkSheet_Fillo(String strTable, String strPrimaryKeyValue) throws Throwable {
		String strSelectQuery = "Select * from " + strTable + " WHERE PrimaryKey='" + strPrimaryKeyValue + "'";
		oConnection = getConnection("Fillo", pTestDataFilePath);
		return executeQuery(oConnection, strSelectQuery);
	}

	public static void UpdateData_MSExcelWorkSheet_Column_Fillo(String strTable, String strColumn, String strValue) throws Throwable {
		String strUpdateQuery = "UPDATE " + strTable + " SET " + strColumn + "='" + strValue + "' WHERE PrimaryKey='" + strTestCaseName + "'";
		System.out.println(strUpdateQuery);
		oConnection = getConnection("Fillo", pTestDataFilePath);
		oConnection.executeUpdate(strUpdateQuery);
		oConnection.close();
	}

}
