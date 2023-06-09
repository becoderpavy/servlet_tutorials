package com.servletinterface;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/student")
public class Student implements Servlet {

	private ServletConfig myconfig;

	// initlize all the configuration
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet init");
		this.myconfig = config;
//		System.out.println(config.getServletName());
//		System.out.println(config.getServletContext());
//		System.out.println(config.getInitParameterNames());

	}

	public ServletConfig getServletConfig() {
		System.out.println("servlet config");
		return myconfig;
	}

	public String getServletInfo() {
		System.out.println("Servlet info");
		return myconfig.getServletName();
	}

	// process logic
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		/*
		 * System.out.println("Servlet service"); ServletConfig cf=getServletConfig();
		 * System.out.println(cf); String sn=getServletInfo(); System.out.println(sn);
		 */

		res.setContentType("text/html");
		res.getWriter().print("<h1>Hello Harsh</h1>");
		int sum = 3 + 2;
		res.getWriter().print("<h1>Sum  of 3+2</h1>" + sum);

	}

	// destroy logic
	public void destroy() {
		System.out.println("Servlet Destroy");

	}

}
