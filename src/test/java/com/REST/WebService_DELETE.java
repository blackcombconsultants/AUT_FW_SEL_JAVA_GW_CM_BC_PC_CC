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

public class WebService_DELETE {
	Response oResponse;
	String url;

	@BeforeMethod
	public void rest_url() {
		System.out.println("---------------------@@BeforeMethod----------------------");
		url = "https://reqres.in/api/users/2";
		oResponse = get(url);
	}

	@Test(enabled = true)
	public void rest_delete_json_cucumber_Test01() {

		when().delete(url).then().statusCode(204).log().all();

	}

}
