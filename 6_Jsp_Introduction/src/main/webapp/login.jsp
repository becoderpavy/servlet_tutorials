<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body style="background-color: black; color:white;">
	
	<div class=" col-md-6 offset-md-3 border p-5 mt-5">
	<h1 class="text-center">Login Page</h1>
		<form action="LoginServlet.jsp" method="post">
			<label>Enter Email Id</label> 
			<input type="text" name="email" class="form-control"> 
			
			<br>
				
				 <label>Enter Password</label>
				<input type="text" name="password" class="form-control"> <br>
				
				<button class="btn btn-primary">Login</button>
		</form>

	</div>
</body>
</html>