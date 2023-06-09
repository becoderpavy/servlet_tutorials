package com.generic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emp2")
public class EmpServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get method call");
		String name = req.getParameter("fullName");

		System.out.println("Full Name=" + name);

		resp.getWriter().print("Full Name=" + name);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post method call");

		String name = req.getParameter("fullName");

		System.out.println("Full Name=" + name);
		resp.getWriter().print("Full Name=" + name);
	}

	/*
	 * @Override public void service(ServletRequest req, ServletResponse res) throws
	 * ServletException, IOException {
	 * 
	 * res.setContentType("text/html");
	 * res.getWriter().print("<h1>Hello Harsh Http Servlet Example</h1>"); int sum =
	 * 3 + 2; res.getWriter().print("<h1>Sum  of 3+2</h1>" + sum);
	 * 
	 * 
	 * }
	 */

}
