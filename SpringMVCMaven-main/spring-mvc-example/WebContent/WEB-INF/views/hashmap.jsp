<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="/spring-mvc-example/hi/submit2" method="get">
Userid:
<input type="text" name="userid">
<br><br>
Username:
<input type="text" name="name">
<br><br>
Password:
<input type="text" name="password">
<br><br>
Email:
<input type="text" name="email">
<br><br>
<input type="submit" value="login">
</form>
</body>
</html>