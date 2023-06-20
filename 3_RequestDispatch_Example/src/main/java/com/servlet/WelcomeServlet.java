package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		String userEmail = (String) req.getAttribute("userEmail");

		Cookie ck[] = req.getCookies();
		String email=ck[0].getValue();
		

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		// req.setAttribute("ems", userEmail);

		out.print("<h1>Home Page = email=" + email + "</h1>");
		out.print("<a href='profile'>View Profile</a><br>");
		out.print("<a href='about'>About</a>");

//		RequestDispatcher rd = req.getRequestDispatcher("/profile");
//		
//		rd.forward(req, resp);

	}

}
