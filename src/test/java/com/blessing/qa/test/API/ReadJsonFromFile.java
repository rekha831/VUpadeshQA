package com.blessing.qa.test.API;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;
public class ReadJsonFromFile {
public static void main(String args[]) throws IOException {
	RestAssured.baseURI ="https://restful-booker.herokuapp.com/";
	byte[] input =Files.readAllBytes(Paths.get("test1.json"));
	String inputval =new String(input);
	//Post API
	
		String postres = 
				given().
				header("Content-Type","application/json")
				.body(inputval)
				.when().post("/booking")
				.then().
				log().all().
				assertThat().
				statusCode(200).
				extract().response().asString();
}
}
