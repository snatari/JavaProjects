package com.as.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome1
 */
@WebServlet("/Welcome1")
public class Welcome1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("fname");
    	String middleName = request.getParameter("mname");
    	String lastName = request.getParameter("lname");
    	System.out.println("First name : "+firstName);
    	System.out.println("First name : "+lastName);
    	PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<html>");
		out.println("<title> Hello World</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<font color=blue size =20>First Name:</font>"+firstName);
		out.println("<font color=blue size =20>Middle Name:</font>"+middleName);
		out.println("<font color=blue size =20>Last Name:</font>"+lastName);
		out.println("</body>");
		out.println("</html>");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
