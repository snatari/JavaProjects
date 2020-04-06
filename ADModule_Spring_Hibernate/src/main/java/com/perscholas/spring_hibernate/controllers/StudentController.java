package com.perscholas.spring_hibernate.controllers;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.perscholas.spring_hibernate.models.Student;

@Controller
//@RequestMapping("/Students")
public class StudentController {
	@Autowired
	@Qualifier("mariaDbHibernateUtil")
	private Session session;
	
	@GetMapping("/studentForm")
	public String displayStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "StudentForm";
	}

}
