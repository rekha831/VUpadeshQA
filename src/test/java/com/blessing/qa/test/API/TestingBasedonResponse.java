package com.blessing.qa.test.API;
import static io.restassured.RestAssured.*;

import com.blessing.qa.ResponsePojo.GetResponsePojo;
import com.blessing.qa.test.API.PayloadFromPostman;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class TestingBasedonResponse {
	public static void main(String args[]) {
RestAssured.baseURI ="https://restful-booker.herokuapp.com/";
String response = given().
header("Content-Type","application/json").
body(PayloadFromPostman.createBooking())
				.when()
				.post("/booking").
				then().
				log().
				all().
				assertThat().
				statusCode(200).
				extract().
				response().
				asString();
	JsonPath js = new JsonPath(response);
	String bookingId = js.getString("bookingid");
	
	//DeSerilization
	GetResponsePojo ge = 
			given().
			when().get("/booking/" +bookingId+ "").
			as(GetResponsePojo.class);
	
	String lastname =ge.getLastname();
	String add =ge.getAdditionalneeds();
	
	System.out.println("lastname " +lastname);
	System.out.println("additionalneed " +add);		
	}

}
