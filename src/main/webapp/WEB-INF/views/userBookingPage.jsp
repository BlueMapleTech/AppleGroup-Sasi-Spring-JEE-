<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Haiiiiiiiiiiiii sasi ${list1.movieId} 
	
	
	<%-- <table border="1">
		<th>MOVIE ID</th>
		<th>MOVIE NAME</th>
		<th>RELEASE DATE</th>
		<th>NO OF SHOWS</th>
		<th>EDIT</th>
		
			
				 <c:forEach var = "list1" items = "${mapData.moviesListData }">
					<tr>
						<td><c:out value = "${list1.movieId}"/></td>
						<td><c:out value = "${list1.movieName}"/></td>
						<td><c:out value = "${list1.releaseDate}"/></td>
						<td><c:out value = "${list1.noOfShows}"/></td>
						<td><a href="edit?movieId=${list1.movieId}">Edit</a></td>
					</tr>
				</c:forEach> 
			
		
	</table> --%>
	
	<div class="col-lg-12">
		<div class="col-lg-6" >
			<table border="1">
				<th>MOVIE ID</th>
				<th>MOVIE NAME</th>
				<th>RELEASE DATE</th>
				<th>NO OF SHOWS</th>
				<th>EDIT</th>
				 
				 <c:forEach var = "list1" items = "${moviesList }">
					<tr>
						<td><c:out value = "${list1.movieId}"/></td>
						<td><c:out value = "${list1.movieName}"/></td>
						<td><c:out value = "${list1.releaseDate}"/></td>
						<td><c:out value = "${list1.noOfShows}"/></td>
						<td><a href="edit?movieId=${list1.movieId}">Edit</a></td>
					</tr>
				</c:forEach> 
				
			</table>
		</div>
		
		
		 
	</div>
</body>
</html>