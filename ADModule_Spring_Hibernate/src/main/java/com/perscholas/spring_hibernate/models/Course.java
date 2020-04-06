package com.perscholas.spring_hibernate.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="course_id")
	private Integer courseId;
	private String code;
	private String name;
	@Column(name="max_size")
	private Integer maxSize;
	@ManyToMany(mappedBy = "studentCourses")
	private List<Student> studentRoster;
	// Constructors
	// Constructors have been omitted for brevity
	public Course() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMaxSize() {
		return maxSize;
	}
	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
	}
	public List<Student> getStudentRoster() {
		return studentRoster;
	}
	public void setStudentRoster(List<Student> studentRoster) {
		this.studentRoster = studentRoster;
	}
	public Course(Integer courseId, String code, String name, Integer maxSize, List<Student> studentRoster) {
		super();
		this.courseId = courseId;
		this.code = code;
		this.name = name;
		this.maxSize = maxSize;
		this.studentRoster = studentRoster;
	}
	
	
	
	
	

	// Getters and Setters
	// Getters and setters have been omitted for brevity
}
