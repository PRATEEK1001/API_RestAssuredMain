package com.api.tests;

import org.testng.annotations.Test;

import com.api.logic.APIClass;
import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

public class APITest {
  @Test
  public void Get() throws Exception {	  
	 Response apiResponse = APIClass.apiGetMethod("http://restapi.demoqa.com/utilities/weather/city/pune");	 
	 String value = JsonPath.read(apiResponse.asString(), "$.City");	
	 System.out.println(value);
  }
  
  @Test
  public void Post() throws Exception {	 
	  
	 System.out.println("---------------------------------------------------");	  
	 String requestBody = "{\"FirstName\" : \"tesdffd34\",\"LastName\" : \"aasdf345\",\"UserName\" : \"tessdfgf\",\"Password\" : \"teasff745\",\"Email\" : \"tessdf3@gmail.com\"}";	  
	 Response apiResponse = APIClass.apiPOSTMethod("http://restapi.demoqa.com/customer/register","application/json",requestBody);	 
	 String value = JsonPath.read(apiResponse.asString(), "$.SuccessCode");	
	 System.out.println(value);
  }
  
}
