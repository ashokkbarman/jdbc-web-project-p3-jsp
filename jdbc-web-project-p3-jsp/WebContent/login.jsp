<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<hr />
	<h1 align="center">Login Page</h1>
	
	<%
	if (request.getAttribute("msg") != null){
		out.print(request.getAttribute("msg").toString());
	}
	
	%>

	<form action="login" method="post">
		Email :<br> <input type="text" name="email"> <br>
		Password :<br> <input type="password" name="password" /> <br>
		<input type="submit" value="Submit">
	</form>



	<%@ include file="footer.jsp"%>
</body>
</html>