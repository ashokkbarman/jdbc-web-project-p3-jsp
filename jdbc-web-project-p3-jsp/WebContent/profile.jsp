<%@ page import="com.java.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Page</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<hr />
	<h1 align="center">Profile Page</h1>
	<%
		String message = (String) request.getAttribute("msg");
		out.print(message);
	%>
	<!-- request.getAttribute ->requestScope -->
	<%-- <br> ${requestScope.msg} --%>

	<% if((User)request.getAttribute("user") != null) {
		%>
	<br><b>Hello ${requestScope.user.email}</b> 

	<%} %>



	<%@ include file="footer.jsp"%>
</body>
</html>