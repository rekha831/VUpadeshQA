package com.blessing.qa.test.API;

public class PayloadFromPostman {
public static String createBooking() {
	return "{\r\n"
			+ "	    \"firstname\" : \"Adarsh\",\r\n"
			+ "	    \"lastname\" : \"Gupta\",\r\n"
			+ "	    \"totalprice\" : 2000,\r\n"
			+ "	    \"depositpaid\" : true,\r\n"
			+ "	    \"bookingdates\" : {\r\n"
			+ "	        \"checkin\" : \"2023-07-29\",\r\n"
			+ "	        \"checkout\" : \"2023-07-30\"\r\n"
			+ "	    },\r\n"
			+ "	    \"additionalneeds\" : \"dinner\"\r\n"
			+ "	}";
}


  public static String authgenerate() { 
	  return "{\r\n" +
  "    \"username\": \"admin\",\r\n" + "    \"password\":\"password123\"\r\n" +"}";}
 



public static String updateBooking() {
return "{\r\n"
		+ "    \"firstname\" : \"Adarsh\",\r\n"
		+ "    \"lastname\" : \"Vatsa\",\r\n"
		+ "    \"totalprice\" : 10000,\r\n"
		+ "    \"depositpaid\" : true,\r\n"
		+ "    \"bookingdates\" : {\r\n"
		+ "        \"checkin\" : \"2021-07-29\",\r\n"
		+ "        \"checkout\" : \"2021-07-30\"\r\n"
		+ "    },\r\n"
		+ "    \"additionalneeds\" : \"room\"\r\n"
		+ "}";	
}
}
