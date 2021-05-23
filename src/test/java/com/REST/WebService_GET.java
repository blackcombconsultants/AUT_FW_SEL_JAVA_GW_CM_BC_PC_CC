package com.REST;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class WebService_GET {
	Response oResponse;
	String strURl;
	String json_mockserver_url;

	@BeforeMethod
	public void rest_url() {
		System.out.println("---------------------@@BeforeMethod----------------------");
		baseURI = "http://localhost:3000/";
		//basePath = "asdsa";
		strURl = "https://reqres.in/api/users?page=2";
		json_mockserver_url = "http://localhost:3000/Department";
		
		oResponse = get(strURl);
	}

	@Test(enabled=false)
	public void rest_get_json_Test01() {
		Assert.assertEquals(oResponse.getHeader("content-type"), "application/json; charset=utf-8");
		System.out.println(oResponse.getBody().asString());
		Assert.assertEquals(oResponse.getStatusCode(), 200);
		Assert.assertEquals(oResponse.getStatusLine(), "HTTP/1.1 200 OK");
		System.out.println(oResponse.getTime());
	}

	@Test(enabled=false)
	public void rest_get_json_cucumber_Test01() {
		given().
			get(strURl).
		then()
			.statusCode(200)
		.log().all();
	}
	
	@Test(enabled=false)
	public void rest_get_json_cucumber_Test02() {
		given().
			get(strURl).
		then()
			.statusCode(200)
			.body("data.id[0]", equalTo(7))
			.body("data.email[1]", equalTo("lindsay.ferguson@reqres.in"))
			.body("data.first_name", hasItems("Michael", "Tobias","Byron"))
			.body("data.last_name", hasItems("Edwards", "Howell"));
	}
	
	@Test(enabled=false)
	public void rest_get_json_mockserver_cucumber_Test01() {
		given().
			get("/Department").
		then()
			.statusCode(200)
		.log().all();
	}
	
	
	@Test(enabled=true)
	public void rest_get_json_mockserver_cucumber_Test02() {
		given()
			.param("name", "Accounts")
			.get("/Department")
		.then()
			.statusCode(200)
			.log().all();		
	}
	
	
	
	
}
