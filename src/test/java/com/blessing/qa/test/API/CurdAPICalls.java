package com.blessing.qa.test.API;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.blessing.qa.generic.ReusableMethodsForAPI;

public class CurdAPICalls {
		public static void main(String args[]) {
	
	RestAssured.baseURI ="https://restful-booker.herokuapp.com/";
	
	//Post API
	String postres = given().header("Content-Type","application/json").
			body(PayloadFromPostman.createBooking())
			.when().
			post("/booking")
			.then().
			log().
			all().
			assertThat().
			statusCode(200).
			extract().
			asString();
	
      JsonPath js= new JsonPath(postres); String bookingid =
	  js.getString("bookingid"); System.out.println("bookingId is " +bookingid);
	  
	// Get API 
	  String getres =given(). when().get("/booking/" +bookingid+ "" ).
	  then().log().all().assertThat().statusCode(200).extract().asString();
	  
	  //auth API
	  String authres =
	  given().header("Content-Type","application/json"). body(PayloadFromPostman.authgenerate
	 ()). when().post("/auth")
	 .then().log().all().assertThat().statusCode(200).extract().asString();
	  
	  //read token utilizing common method
JsonPath js1 =ReusableMethodsForAPI.rawtoJson(authres);
String	  tokenvalue =js.getString("token");
String tokenvalue1 = "token="+tokenvalue;


//Post API
	String postauthres = given().header("Content-Type","application/json").
			header("Cookie",tokenvalue1).
			body(PayloadFromPostman.createBooking())
			.when().
			post("/booking")
			.then().
			log().
			all().
			assertThat().
			statusCode(200).
			extract().
			asString();
	
}
}