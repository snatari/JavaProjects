package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	private int cID;
	private String coursename;
	private String cname;
	@Autowired
	private Technologies tech;
	public Technologies getTech() {
		return tech;
	}
	public void setTech(Technologies tech) {
		this.tech = tech;
	}
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public void display() {
		System.out.println("Object is created by dependencyInjection!!!");
		tech.techMethod();
	}
}
