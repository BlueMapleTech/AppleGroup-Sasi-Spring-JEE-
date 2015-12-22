<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
<h1>ADD MOVIE</h1>

<form action="addmovi" name = "user" method = "GET">
<input type = "hidden" name = "movieId" value = "${id}"/><br> 
MOVIENAME:<input type = "text" name = "movieName"/><br>
RELEASEDATE:<input type = "date" name = "releaseDate" placeholder = "yyyy-MM-dd"/><br>
NO OF SHOWS:<input type = "text" name = "noOfShows"/><br>
<h1>TIMINGS</h1>
  <input type="checkbox" name="timngsId" value="1"> 9AM-12AM<br>
  <input type="checkbox" name="timngsId" value="2" > 1PM-4PM<br>
  <input type="checkbox" name="timngsId" value="3" > 5PM-8PM<br>
  <input type="checkbox" name="timngsId" value="4" > 9PM-12PM<br>
  <h1>TICKET RATE</h1>
  FIRST CLASS:<input type = "text" name = "ticketRate"/><br>
  SECOND CLASS:<input type = "text" name = "ticketRate1"><br>
  <br>
<input type = "submit" value = "ADDMOVIE">
</form>
</body>
</html>