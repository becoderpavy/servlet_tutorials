package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userEmail = (String) req.getAttribute("userEmail");
		System.out.println(userEmail);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print("<h1>Welcome to Our Page email=" + userEmail + "</h1>");
	}

}
