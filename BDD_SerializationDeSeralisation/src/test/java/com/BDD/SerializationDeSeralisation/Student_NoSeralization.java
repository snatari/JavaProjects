package com.BDD.SerializationDeSeralisation;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Student_NoSeralization {
	//Tutorial 9
	//Post & Get request without Serialization & DeSerialization.
	//Post Request
	public HashMap map = new HashMap();
	@Test(priority=1)
	public void addNewStudent() {
		map.put("id", "101");
		map.put("firstName", "Honey");
		map.put("lastName", "Nanchari");
		map.put("email", "Honey@ww.edu");
		map.put("programme", "Manager");
		
		ArrayList<String> coursesList = new ArrayList<String>();
		coursesList.add("java");
		coursesList.add("Selenium");
		map.put("Courses", coursesList);
		
		given()
			.contentType(ContentType.JSON)
			.body(map)
		.when()
			.post("http://localhost:8085/student")
		.then()
			.statusCode(201)
			.assertThat()
			.body("msg",equalTo("student added"));
		
	}
	//Get request to retrieve data.
	@Test(priority=2)
	public void getStudentID() {
		given()
			.contentType(ContentType.JSON)
		.when()
			.get("http://localhost:8085/student/101")
		.then()
			.statusCode(200)
			.assertThat()
			.body("id",equalTo("101"));
			
	}

}
