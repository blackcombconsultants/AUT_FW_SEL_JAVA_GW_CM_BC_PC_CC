package com.pages.Sandbox;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class GW_Utils_File_ReadData extends GW_Base {

	String pFilePath = System.getProperty("user.dir") + "\\testdata\\BillingCenter.xlsx";

	public LinkedHashMap<String, String> getDataFromSheet_Fillo(String strSheetName, String strPrimaryKeyValue)
			throws FilloException {

		LinkedHashMap<String, String> lhmTestDataSheet = new LinkedHashMap<String, String>();

		Fillo oFillo = new Fillo();
		Connection oConnection = oFillo.getConnection(pFilePath);

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
}
