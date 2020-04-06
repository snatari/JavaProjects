package com.BDD.SerializationDeSeralisation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
public class Student_Seralization {
 //Post & Get Request using serialization & De-serialization.
	
	@Test(priority=1)
	public void createStudentSeraliztion() {
		//for seralization i used java object student.
		
		Student student = new Student();
		//information look at book tutorial-9.
		student .setId(102);
		student .setFirstName("Mango");
		student .setLastName("Rasalu");
		student .setEmail("Mango@123.edu");
		student .setProgramme("King");
		//Courses have two courses.wer using ArrayList To hold different courses.
		ArrayList<String> courseList = new ArrayList<String>();
		courseList.add("java");
		courseList.add("Selenium");
		student.setCourses(courseList);
		given()
			.contentType(ContentType.JSON)
			.body(student)
		.when()
			.post("http://localhost:8085/student")
		.then()
			.statusCode(201)
			.assertThat()
			.body("msg",equalTo("student added"));
		
		
	}
	//Get request to retrieve data.
		@Test(priority=2)
		public void getStudentIDSerialization() {
			given()
				.contentType(ContentType.JSON)
			.when()
				.get("http://localhost:8085/student/102")
			.then()
				.statusCode(200)
				.assertThat()
				.body("id",equalTo("102"));
				
		}
		//Get request to retrieve data deserialization.
				@Test(priority=2)
				public void getStudentIdDeSerialization() {
				Student student = get("http://localhost:8085/student/102").as(Student.class);
				System.out.println(student.studentRecord());
				Assert.assertEquals(student.getId(),102);
}
}