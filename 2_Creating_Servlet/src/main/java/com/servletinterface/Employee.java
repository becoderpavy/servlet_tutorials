package com.servletinterface;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

/*import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;*/

@WebServlet("/emp")
public class Employee implements Servlet{

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method");
		
	}

	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig()");
		return null;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Register successfully");
	}

	public String getServletInfo() { 
		System.out.println("getServletInfo");
		return null;
	}

	public void destroy() {
		System.out.println("destroy");
		// TODO Auto-generated method stub
		
	}

}
