<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
   <style>
body {
  background-image: url('admin.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;  
  background-size: 30% 90%;
  background-align:right;
}

</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="mainhome">Home</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="viewflights">Flights Schedule</a></li>
      
      <li class="active"><a href="addflight">Add Flights</a></li>
      <li class="active"><a href="updateflight">Update Flights</a></li>
     </ul>
	<ul class="nav navbar-nav navbar-right">
      <li><a href="logout"><span class="glyphicon glyphicon-user"></span>Log Out</a></li>
     </ul>
  </div>
</nav>
<div class="container">
<h1 style="color:Red" align="center"><b>ADMIN HOME</b></h1><br><br><br>

<h1 style="color:black" align="center">Welcomes You Admin ${name}</h1>
  </div>


</body>
</html>