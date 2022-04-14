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

	public static LinkedHashMap<String, String> getData_MSExcel_WorkSheet_Fillo(String strTable, String strPrimaryKeyValue) throws Throwable {

		String strSelectQuery = "Select * from " + strTable + " WHERE PrimaryKey='" + strPrimaryKeyValue + "'";
		oConnection = getConnection("Fillo", pTestDataFilePath);

		System.out.println(pTestDataFilePath);
		return executeQuery(oConnection, strSelectQuery);

	}

	public static LinkedHashMap<String, String> getData_MSExcel_WorkBook_WorkSheet_Fillo(String pWorkBook, String WorkSheet, String PrimaryKey) throws Throwable {

		String strSelectQuery = "Select * from " + WorkSheet + " WHERE PrimaryKey='" + PrimaryKey + "'";
		oConnection = getConnection("Fillo", pWorkBook);
		return executeQuery(oConnection, strSelectQuery);

	}

	public static LinkedHashMap<String, String> getData_MSExcel_WorkBook_WorkSheet_DataSet_Fillo(String pFilePath, String WorkSheet, String PrimaryKey, String DataSet) throws Throwable {
		String strSelectQuery = "Select * from " + WorkSheet + " WHERE PrimaryKey='" + PrimaryKey + "' AND DataSet='" + DataSet + "'";
		oConnection = getConnection("Fillo", pFilePath);
		return executeQuery(oConnection, strSelectQuery);

	}

	public static LinkedHashMap<String, String> getData_Row_MSExcel_Fillo(String WorkSheet, String strPrimaryKey) throws Throwable {
		String strSelectQuery = "Select * from " + WorkSheet + " WHERE PrimaryKey='" + strPrimaryKey + "'";
		oConnection = getConnection("Fillo", pTestDataFilePath);
		return executeQuery(oConnection, strSelectQuery);

	}

	public static void UpdateData_MSExcel_WorkSheet_Fillo(String strTable, String strcolumn, String strValue) throws Throwable {

		String strUpdateQuery = "UPDATE " + strTable + " SET " + strcolumn + "='" + strValue + "' WHERE PrimaryKey='" + strTestCaseName + "'";
		System.out.println(strUpdateQuery);
		oConnection = getConnection("Fillo", pTestDataFilePath);
		oConnection.executeUpdate(strUpdateQuery);
		oConnection.close();

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

	public static LinkedHashMap<String, String> getData_ClaimsCenter(String strTable) throws Throwable {

		String strSelectQuery = "Select * from " + strTable + " WHERE PrimaryKey='" + strTestCaseName + "'";
		oConnection = getConnection("Fillo", pTestDataFile_ClaimsCenter);
		return executeQuery(oConnection, strSelectQuery);

	}

	public static void UpdateData_ClaimsCenter(String strTable, String strcolumn, String strValue) throws Throwable {

		String strUpdateQuery = "UPDATE " + strTable + " SET " + strcolumn + "='" + strValue + "' WHERE PrimaryKey='" + strTestCaseName + "'";
		System.out.println(strUpdateQuery);
		oConnection = getConnection("Fillo", pTestDataFile_ClaimsCenter);
		oConnection.executeUpdate(strUpdateQuery);
		oConnection.close();

	}


	public static LinkedHashMap<String, String> getData_BillingCenter(String strTable) throws Throwable {

		String strSelectQuery = "Select * from " + strTable + " WHERE PrimaryKey='" + strTestCaseName + "'";
		oConnection = getConnection("Fillo", pTestDataFile_BillingCenter);
		System.out.println(pTestDataFile_BillingCenter);
		return executeQuery(oConnection, strSelectQuery);

	}

	public static void UpdateData_BillingCenter(String strTable, String strcolumn, String strValue) throws Throwable {

		String strUpdateQuery = "UPDATE " + strTable + " SET " + strcolumn + "='" + strValue + "' WHERE PrimaryKey='" + strTestCaseName + "'";
		System.out.println(strUpdateQuery);
		oConnection = getConnection("Fillo", pTestDataFile_BillingCenter);
		oConnection.executeUpdate(strUpdateQuery);
		oConnection.close();
		
	}


	public static LinkedHashMap<String, String> getData_PersonalAuto(String strTable) throws Throwable {

		String strSelectQuery = "Select * from " + strTable + " WHERE PrimaryKey='" + strTestCaseName + "'";
		oConnection = getConnection("Fillo", pTestDataFile_PersonalAuto);
		return executeQuery(oConnection, strSelectQuery);

	}

	public static LinkedHashMap<String, String> getData_CommercialAuto(String strTable) throws Throwable {

		String strSelectQuery = "Select * from " + strTable + " WHERE PrimaryKey='" + strTestCaseName + "'";
		oConnection = getConnection("Fillo", pTestDataFile_CommercialAuto);
		return executeQuery(oConnection, strSelectQuery);

	}

	public static void UpdateData_PersonalAuto(String strTable, String strcolumn, String strValue) throws Throwable {

		String strUpdateQuery = "UPDATE " + strTable + " SET " + strcolumn + "='" + strValue + "' WHERE PrimaryKey='" + strTestCaseName + "'";
		System.out.println(strUpdateQuery);
		oConnection = getConnection("Fillo", pTestDataFile_PersonalAuto);
		oConnection.executeUpdate(strUpdateQuery);
		oConnection.close();
		
	}


}
