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

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();

		User user = (User) session.getAttribute("user");

		if (user == null) {
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.forward(req, resp);
		} else {

			PrintWriter out = resp.getWriter();
			out.print("<h1>Welcome to Home Page</h1>");

			out.print("<h3>User Name=" + user.getName() + "</h3>");
			out.print("<h3>User Email=" + user.getEmail() + "</h3>");
			out.print("<h3>User Password=" + user.getPassword() + "</h3>");

			out.print("<a href='profile'>Profile</h3><br>");
			out.print("<a href='setting'>Setting</h3><br>");
			out.print("<a href='logout'>Logout</h3><br>");

		}
	}

}
