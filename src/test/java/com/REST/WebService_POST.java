package com.REST;

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

public class WebService_POST {
	Response oResponse;
	String strURl;
	String json_mockserver_url;
	int statusCode;

	@BeforeMethod
	public void rest_url() {
		System.out.println("---------------------@@BeforeMethod----------------------");
		strURl = "https://reqres.in/api/users";
		json_mockserver_url = "http://localhost:3000/";
		baseURI = json_mockserver_url;
		statusCode = 201;
		oResponse = get(strURl);
	}

	@Test(enabled = false)
	public void rest_post_json_cucumber_Test01() {

		Map<String, Object> oMap = new HashMap<String, Object>();
		oMap.put("name", "myName1");
		oMap.put("job", "myJob1");
		JSONObject oJSON = new JSONObject(oMap);
		System.out.println(oJSON.toJSONString());
		given()
			.body(oJSON.toJSONString()).
		when()
			.post(strURl).
		then()
			.statusCode(statusCode);

	}

	@Test(enabled = false)
	public void rest_post_json_cucumber_Test02() {

		JSONObject oJSON2 = new JSONObject();
		oJSON2.put("name", "myName2");
		oJSON2.put("job", "myJob2");
		System.out.println(oJSON2.toJSONString());

		given()
			.body(oJSON2.toJSONString()).
		when()
			.post(strURl).
		then()
			.statusCode(statusCode)
			.log().all();

	}

	@Test(enabled = false)
	public void rest_post_json_cucumber_Test03() {

		JSONObject oJSON = new JSONObject();
		oJSON.put("name", "myName3");
		oJSON.put("job", "myJob3");
		System.out.println(oJSON.toJSONString());

		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(oJSON.toJSONString()).
		when()
			.post("/Users").
		then()
			.statusCode(statusCode)
			.log().all();		
	}
	
	
	@Test(enabled = true)
	public void rest_post_json_mockserver_cucumber_Test01() {
		
		JSONObject oJSON =new JSONObject();
		
		oJSON.put("Departmentid", 10);
		oJSON.put("name", "QASecurity");
		oJSON.put("Head", "QASecurityHead");
		oJSON.put("ProjectId", 1);
		oJSON.put("Email", "QASecurityHead@blackcombcom");
		System.out.println(oJSON.toJSONString());

		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(oJSON.toJSONString()).
		when()
			.post("/Department").
		then()
			.statusCode(statusCode)
			.log().all();			
	}
	
	
}
