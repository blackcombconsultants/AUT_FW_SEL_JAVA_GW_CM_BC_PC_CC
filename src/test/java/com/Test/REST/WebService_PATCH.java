package com.Test.REST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.annotations.BeforeMethod;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterMethod;

public class WebService_PATCH {

	Response oResponse;
	String strURl;
	String json_mockserver_url;
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("---------------------@@BeforeMethod----------------------");
		strURl = "https://reqres.in/api/users/2";

		json_mockserver_url = "http://localhost:3000/";
		baseURI = json_mockserver_url;
	}

	@AfterMethod
	public void afterMethod() {

		oResponse = null;
		String strURl = null;
		String json_mockserver_url = null;
	}
	
	@Test(enabled = false)
	public void rest_patch_json_cucumber_Test01() {

		JSONObject oJSON = new JSONObject();
		oJSON.put("name", "myName3");
		oJSON.put("job", "myJob3patch");
		System.out.println(oJSON.toJSONString());

		given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(oJSON.toJSONString()).
		when()
			.patch(strURl).
		then()
			.statusCode(200)
			.log().all();

	}


	@Test(enabled = true)
	public void rest_patch_json_mockserver_cucumber_Test01() {
		
		JSONObject oJSON = new JSONObject();
		oJSON.put("Departmentid", 6);
		
		given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(oJSON.toJSONString()).
		when()
			.patch("/Department/6")
		.then()
			.statusCode(200)
			.log().all();
	}
}
