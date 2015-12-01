<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADD MOVIE</h1>
<form action="addmovi" name = "user" method = "GET">
<input type = "hidden" name = "movieId" value = "${id}"/><br> 
MOVIENAME:<input type = "text" name = "movieName"/><br>
RELEASEDATE:<input type = "text" name = "releaseDate"/><br>
NO OF SHOWS:<input type = "text" name = "noOfShows"/><br>
<input type = "submit" value = "ADDMOVIE">
</form>
</body>
</html>