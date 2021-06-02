package com.Test.REST;

import org.apache.commons.collections.map.HashedMap;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class WebService_PUT {

	Response oResponse;
	String strURl;
	String json_mockserver_url;
	int statusCode;


	@BeforeMethod
	public void rest_url() {
		System.out.println("---------------------@@BeforeMethod----------------------");
		strURl = "https://reqres.in/api/users/2";
		json_mockserver_url = "http://localhost:3000/";
		baseURI = json_mockserver_url;
		statusCode = 200;
		oResponse = get(strURl);
	}



	@Test(enabled = false)
	public void rest_put_json_cucumber_Test01() {

		JSONObject oJSON2 = new JSONObject();
		oJSON2.put("name", "myName3");
		oJSON2.put("job", "myJob3put");
		System.out.println(oJSON2.toJSONString());

		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(oJSON2.toJSONString()).
		when()
			.put(strURl).
		then()
			.statusCode(statusCode)
			.log().all();
	}

	@Test(enabled = true)
	public void rest_put_json_mockserver_cucumber_Test01() {
		
		JSONObject oJSON =new JSONObject();
		
		oJSON.put("Departmentid", 8);
		oJSON.put("ProjectId", 1);
		oJSON.put("name", "QAAPIAutomation");
		oJSON.put("Head", "QAAPIAutomationHead");
		oJSON.put("Email", "QAAPIAutomationHead@blackcombcom");
		System.out.println(oJSON.toJSONString());
		
		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(oJSON.toJSONString()).
		when()
			.put("/Department/8").
		then()
		.statusCode(statusCode)
		.log().all();
		
	}
	
	
	
}
