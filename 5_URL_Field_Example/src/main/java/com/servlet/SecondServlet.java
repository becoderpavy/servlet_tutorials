package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nm = req.getParameter("nm");
		String id = req.getParameter("id");

		PrintWriter out = resp.getWriter();
		out.print("<h1>Welcome to Second Servlet Page</h1>");
		out.print("<h1>Name=" + nm + "</h1>");
		out.print("<h1>ID=" + id + "</h1>");

	}

}
