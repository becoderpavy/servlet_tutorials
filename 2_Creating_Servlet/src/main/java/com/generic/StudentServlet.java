package com.generic;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/student2")
public class StudentServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		res.getWriter().print("<h1>Hello Harsh Generic Servlet Example</h1>");
		int sum = 3 + 2;
		res.getWriter().print("<h1>Sum  of 3+2</h1>" + sum);
	
		
	
	}

	
	
	
}
