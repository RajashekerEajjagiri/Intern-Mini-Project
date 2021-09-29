<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="bookticket" Style=background-color:blue>Back</a>
<div class="container" align="center">
 <div class="row">
 	
 <div class="card-body">
 	<div class="form-group">

<h1> Available Tickets are : ${seats}</h1>
<h1>Yours selected Tickets are : ${result}</h1>
<h1 style=color:red>Your are exceeding  the Tickets Limit</h1>
</div>
</div>
</div>
</div>
</body>
</html>