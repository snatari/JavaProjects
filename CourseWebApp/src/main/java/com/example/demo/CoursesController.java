package com.example.demo;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

public class CoursesController {
	    @RequestMapping("courses")
		public String courses() {
	    	//HttpSession session = req.getSession();
	    	//String cname = req.getParameter("cname");
			System.out.println("Welcome to edureka!");
			return "courses.jsp";
	    //	session.setAttribute("cname", cname);
			//return "course";
		}
	}


