package com.api.tests;

import org.testng.annotations.Test;

import com.api.logic.APIClass;
import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

public class APITest {
	/*
	 * @Test public void Get() throws Exception { Response apiResponse =
	 * APIClass.apiGetMethod("https://reqres.in/api/users?page=2"); int value =
	 * JsonPath.read(apiResponse.asString(), "$.page"); System.out.println(value); }
	 */
	
	/*
	 * @Test public void Post() throws Exception {
	 * 
	 * System.out.println("---------------------------------------------------");
	 * String requestBody ="{\"name\":\"morpheus\",\"job\":\"leader\"}"; Response
	 * apiResponse =
	 * APIClass.apiPOSTMethod("https://reqres.in/api/users","application/json",
	 * requestBody); String value = JsonPath.read(apiResponse.asString(), "$.name");
	 * System.out.println(value); }
	 */
	  
	 
/*	@Test 
			 * public void Patch() throws Exception {
			 * 
			 * System.out.println("---------------------------------------------------");
			 * String requestBody ="{\"name\":\"morpheus\",\"job\":\"zion resident\"}";
			 * Response apiResponse =
			 * APIClass.apiPATCHMethod("https://reqres.in/api/users/2","application/json",
			 * requestBody); String value = JsonPath.read(apiResponse.asString(), "$.job");
			 * System.out.println(value); }
			 
  */
	  
	  @Test public void Put() throws Exception {
		  
	  System.out.println("---------------------------------------------------");
	  String requestBody ="{\"name\":\"morpheus\",\"job\":\"zion resident\"}"; 
	  Response apiResponse = APIClass.apiPUTMethod("https://reqres.in/api/users/2","application/json",requestBody); 
	  String value = JsonPath.read(apiResponse.asString(), "$.job");
	  System.out.println(value); }
}
