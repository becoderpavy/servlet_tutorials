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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

//		System.out.println("Email=" + email);
//		System.out.println("Password=" + password);

		String defaultEmail = "demo@gmail.com";

		String defaultPassword = "1234";

		if (defaultEmail.equals(email) && defaultPassword.equals(password)) {
			// System.out.println("User Details correct.");
			//req.setAttribute("userEmail", email);
			
			Cookie ck=new Cookie("userEmail", defaultEmail);
			ck.setPath("/");
			resp.addCookie(ck);
			
			
			RequestDispatcher rd = req.getRequestDispatcher("/welcome");
			rd.forward(req, resp);

		} else {
			// System.out.println("Enter Details wrong");

			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();

			out.print("<p class='text-center'>Invalid Email and password</p>");

			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req, resp);

		}

	}

}
