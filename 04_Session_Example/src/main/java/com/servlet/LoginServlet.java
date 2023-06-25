package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.entity.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		RequestDispatcher rd = null;

		// 1- get session
		HttpSession session = req.getSession();

		if ("harsh@gmail.com".equals(email) && "1234".equals(password)) {

			User us = new User();
			us.setName("Harsh");
			us.setEmail("harsh@gmail.com");
			us.setPassword("1234");

			// 2- set session value
			session.setAttribute("user", us);

			rd = req.getRequestDispatcher("/home");
			rd.forward(req, resp);
			
		} else {

			PrintWriter out = resp.getWriter();
			out.print("<p>Invalid details</p>");
			rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}

	}

}
