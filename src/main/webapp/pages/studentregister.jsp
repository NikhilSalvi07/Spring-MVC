<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>

<h2>Register Here</h2>
<!-- This is Spring HTML Code -->
<c:form modelAttribute="stud" action="studform" method="post">
	Student Id <c:input path="stud_id"/>
	Student Name <c:input path="stud_name"/>
	<input type="submit" value=" Register Student ">
	
</c:form>
	

</body>
</html>