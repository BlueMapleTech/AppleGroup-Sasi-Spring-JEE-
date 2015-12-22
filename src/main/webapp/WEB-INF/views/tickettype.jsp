<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addticket" method = GET>
<input type = "hidden" name = "ticketId" value = "${idtic}">
TICKET TYPE:<input type = "text" name = "ticketType"/><br>
TICKET COUNT:<input type = "text" name = "ticketCount"><br>
<input type = "submit" value = "ADD TICKET TYPE"/>

</form>
</body>
</html>