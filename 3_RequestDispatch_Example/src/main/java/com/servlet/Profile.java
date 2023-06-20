package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class Profile extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		//String ems = (String) req.getAttribute("ems");
		
		
		Cookie ck[]=req.getCookies();

		String ems=ck[0].getValue();
		
		
		out.print("<h1> Profile Page email=" + ems + "</h1>");
		// out.print("<a href='profile'>View Profile</a>");
	}

}
