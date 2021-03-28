package com.pages.Sandbox;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadDataFromFile {

	String pFilePath = "\\testdata\\BillingCenter.xlsx";

	public String getValue_Fillo(String pFilePath, String strSheetName, String strPrimaryKey, String strItem) throws FilloException {
		String strValue = null;

		System.out.println("File Path = " + pFilePath);

		Fillo oFillo = new Fillo();
		Connection oConnection = oFillo.getConnection(pFilePath);

		String strQuery = "Select * from " + strSheetName + " where PrimaryKey=" + strPrimaryKey + " and name='John'";
		System.out.println("strQuery = " + strQuery);

		Recordset recordset = oConnection.executeQuery(strQuery);

		while (recordset.next()) {
			System.out.println(recordset.getField("TD_UserName"));
			System.out.println(recordset.getField("TD_Passwprd"));
		}
		

		recordset.close();
		oConnection.close();

		System.out.println(strItem + " = " + strValue);

		return strValue;

	}
}
