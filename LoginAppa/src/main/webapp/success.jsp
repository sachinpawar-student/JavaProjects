<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "org.sachin.loginapp.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>

<h1>Login Successful. </h1>


<jsp:useBean id="user" class= "org.sachin.loginapp.dto.User" scope="request" >
<jsp:setProperty  property="userName"  name="user" value="NewUser" />
</jsp:useBean>


Hello <jsp:getProperty  property="userName" name="user" />

</body>
</html>