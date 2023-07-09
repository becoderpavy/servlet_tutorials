<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String email = request.getParameter("email");
	String password = request.getParameter("password");

	String defaultEmail = "demo@gmail.com";

	String defaultPassword = "1234";

	if (defaultEmail.equals(email) && defaultPassword.equals(password)) {
		
		request.setAttribute("username", email);
		
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);

	} else {
		// System.out.println("Enter Details wrong");

		out.print("<p class='text-center'>Invalid Email and password</p>");

		RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
		rd.include(request, response);

	}
	%>
</body>
</html>