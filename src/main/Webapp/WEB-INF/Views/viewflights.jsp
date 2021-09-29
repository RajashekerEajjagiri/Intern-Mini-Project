<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<a href="admin">Home</a>

 <div class="container">
  	<div class="row">
  	<h1>Flight Details</h1>
  	</div>
<table class="table table-striped  table-bordered">
<thead class="table-dark">
	<tr>
	<th>Flight Number</th>
	<th>Flight Name</th>
	<th>From</th>
	<th> To </th>
	<th>Date</th>
   <th>Time</th>

	</tr>
</thead>

	<tr>
	
	<c:forEach items="${list}" var="f">
	<td>${f.getFlightNum()}</td>
	<td>${f.getFlightName()}</td>
	<td>${f.getFlightFrom()}</td>
	<td>${f.getFlightTo() }</td>
	<td>${f.getLd()}</td>
	<td>${f.getLt()}</td>
	</tr>
	</c:forEach>
	



</table>

</div>

</body>
</html>