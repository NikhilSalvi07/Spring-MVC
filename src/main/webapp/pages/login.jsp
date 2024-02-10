<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Login</title>
</head>
<body>
	
<form action="loginform">	
	<input type="text" name="uname" placeholder="Enter Username"/>
	<input type="password" name="upass" placeholder="Enter Password"/>
	<input type="submit" value="  Login  "/>

</form>	
	${message}
	
</body>
</html>