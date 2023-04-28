package com.blessing.qa.generic;

	import io.restassured.path.json.JsonPath;

	public class ReusableMethodsForAPI {
	public static JsonPath rawtoJson(String response) {
		JsonPath js1 =new JsonPath(response);
		return js1;
	}
	}

