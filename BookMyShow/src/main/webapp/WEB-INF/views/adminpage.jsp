<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "yellow">

<h3><a href="movieadd">EDIT LIST OF MOVIES</a></h3>
<h3><a href="addtime">SHOW TIMINGS</a></h3>
<h3><a href="addregstates">REGISTRATION STATUS</a></h3>
<h3><a href="addtickettype">TICKET TYPE AND COUNT</a></h3>
	<%-- <h1>${mssg1}</h1> --%>
	<div class="col-lg-12">
		<div class="col-lg-6" >
			<table border="1">
				<th>MOVIE ID</th>
				<th>MOVIE NAME</th>
				<th>RELEASE DATE</th>
				<th>NO OF SHOWS</th>
				<th>EDIT</th>
				 <c:forEach var="list" items="${mapobj.lmap}" varStatus="status">
				 <c:forEach var = "list1" items = "${list.moviesListData }">
					<tr>
						<td><c:out value = "${list1.movieId}"/></td>
						<td><c:out value = "${list1.movieName}"/></td>
						<td><c:out value = "${list1.releaseDate}"/></td>
						<td><c:out value = "${list1.noOfShows}"/></td>
						<td><a href="edit?movieId=${list1.movieId}">Edit</a></td>
					</tr>
				</c:forEach> 
				</c:forEach>
			</table>
		</div>
		
		
		 <div class="col-lg-6">
			<table border="1">
				<th>ID</th>
				<th>TIMINGS</th>
				<th>EDIT</th>
				<c:forEach var="list2" items="${mapobj.lmap}" varStatus="status">
				 <c:forEach var = "list3" items = "${list2.movieTimeListData }">
					<tr>
						<td><c:out value = "${list3.timngsId}"/></td>
						<td><c:out value = "${list3.time}"/></td>
						<td><a href="updatetime?Id=${list3.timngsId}"/>Edit</a></td>
					</tr>
				</c:forEach>
				</c:forEach>
			</table>
		</div>   
	</div>
	
	<div class="col-lg-12">
	<div class="col-lg-6">
	<table border="1">
	             <th>TICKET ID</th>
				<th>TICKET TYPE</th>
				<th>TICKET COUNT</th>
				<th>EDIT</th>
				<c:forEach var="list4" items="${mapobj.lmap}" varStatus="status">
				 <c:forEach var = "list5" items = "${list4.ticketTypeListData }">
					<tr>
						<td><c:out value = "${list5.ticketId}"/></td>
						<td><c:out value = "${list5.ticketType}"/></td>
						<td><c:out value = "${list5.ticketCount}"/></td>
						<td><a href="ticketupdate?ticId=${list5.ticketId}"/>Edit</a></td>
	              </tr>
	              </c:forEach>
	              </c:forEach>
	</div>
	<div class="col-lg-6">
	haii
	</div>
	</div>

</body>
</html>