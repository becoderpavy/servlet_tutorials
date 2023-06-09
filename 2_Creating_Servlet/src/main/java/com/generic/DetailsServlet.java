package com.generic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/details")
public class DetailsServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("username");

		System.out.println(req.getContextPath().toString());

		System.out.println(name);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>User Name=" + name + "</h1>");

	}

}
