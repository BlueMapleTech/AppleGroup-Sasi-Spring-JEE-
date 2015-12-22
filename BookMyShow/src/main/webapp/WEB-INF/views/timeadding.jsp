<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${moviTimeId}
<form action="timeaddin" method = GET>
<input type = "hidden" name = "timngsId" value = "${moviTimeId}">
ADD TIME:<input type = "text" name = "time"/><br>
<input type = "submit" value = "ADD TIME">
</form>

</body>
</html>