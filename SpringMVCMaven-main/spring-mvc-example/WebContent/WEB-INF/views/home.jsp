<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>

<body bgcolor="blue" text="white">
	<h1>Hello!!!</h1>
	<h2>${msg}</h2>

	 <form action="/spring-mvc-example/home1/submit1" method="get">
		User name: <input type="text" name="username"><br><br>
		Pass  word: <input type="text" name="password"><br><br>
		Email   Id: <input type="text" name="emailid"><br><br>
		<input type="submit" value="Login">
	</form>

</body>
</html>