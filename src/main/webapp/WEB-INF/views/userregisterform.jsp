<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="register" method="post">

USERNAME:<input type = "text" name = "userName"/><br>
PASSWORD:<input type = "password" name = "passWord"/><br>
FIRSTNAME:<input type = "text" name = "firstName"/><br>
LASTNAME:<input type = "text" name = "lastName"/><br>
E-MAIL:<input type = "email" name = "eMail"/><br>
ADDRESS<input type = "text" name = "address"/><br>
<!-- <input type = "hidden" name = "roleId" value = 1 /><br> -->
<input type = "submit" value = "Register"/>

</body>
</html>