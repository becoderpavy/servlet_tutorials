<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP Page</h1>
	<%-- <%
	/* out.print(2 + 3); */
	out.print(LocalDate.now());
	%> --%>

	<%--	// there are 3 tags used for write java code in our jsp page.
	// declartion tag
	// expression tag
	// script let tag
	
	
	// int sum; - declartion -  <%!  %> 
	
	// sum=2+3; - process - script let tag - <%  %>
	
	// s.o.p(sum) -  expression tag - <%= %>
	
	 --%> 
 
<%--	<%!int a = 2, b = 3, sum = 0, sub = 0;%>

	<%
	int sum = a + b;
	sub = sum - 1;
	%>

	<%= "sum="+sum%>
	<%="sub="+sub%>
	
	 --%>


<%-- even number -green  , odd number - red --%>
<%-- 
<%  
for(int i=0;i<=20;i++)
{
	
	if(i%2==0)
	{
		out.print("<h1 style='color:green'>"+i+"</h1>");
	}else{
		out.print("<h1 style='color:red'>"+i+"</h1>");
	}
}
%>

--%>
<%
for(int i=0;i<=20;i++)
{
	
	if(i%2==0)
	{%>
		<h1 style='color:green'><%=i %></h1>
	<%}
	else{
	%>
		<h1 style='color:red'><%=i %></h1>
	<%}
}
%>




</body>
</html>