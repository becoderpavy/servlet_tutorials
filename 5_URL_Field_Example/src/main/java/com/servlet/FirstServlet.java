package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");

		String id = req.getParameter("id");

		System.out.println("Name=" + name);

		PrintWriter out = resp.getWriter();
		out.print("<h1>Welcome to First Servlet Page</h1>");
		out.print("<h1>Name=" + name + "</h1>");
		out.print("<h1>Id=" + id + "</h1>");
		out.print("<a href='secondServlet?nm=" + name + "&&id=" + id + "'>Second Page</a><br>");

	}

}
