package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
	private int techID;
	private String techname;
	
	public int getTechID() {
		return techID;
	}
	public void setTechID(int techID) {
		this.techID = techID;
	}
	public String getTechname() {
		return techname;
	}
	public void setTechname(String techname) {
		this.techname = techname;
	}
	public void techMethod() {
		System.out.println("This is Technologie Method");
	}

}
