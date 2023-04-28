package com.blessing.qa.test.API;

import static io.restassured.RestAssured.given;

//import org.testng.annotations.Test;

import com.blessing.qa.RequestPojo.BookingDates;
import com.blessing.qa.RequestPojo.CreateBooking;
import io.restassured.RestAssured;

public class PojoBasedTesting {
	
	
	
	public static void main(String args[]) {
		
		RestAssured.baseURI ="https://restful-booker.herokuapp.com";	
		
		
		CreateBooking cb =new CreateBooking();
		cb.setFirstname("Sehra");
		cb.setLastname("palash");
		cb.setAdditionalneeds("cvbh");
		cb.setDepositpaid(true);
		BookingDates b =new BookingDates();
		b.setCheckin("2023-04-27");
		b.setCheckout("2023-04-28");
		cb.setBookingdates(b);
		//Post API
		given().
		header("Content-Type","application/json").
		body(cb).
		log().
		all().
             when().
				post("/booking")
				.then().
				log().
				all().extract();
		
}
}