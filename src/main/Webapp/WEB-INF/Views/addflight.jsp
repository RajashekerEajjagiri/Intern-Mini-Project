<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertflight" method="post">

<a href="admin">Home</a>
<br><br>
<h1 align="center" style=color:red><b>Add Flight Details<b></b></h1>

<div class="container" align="center">
 <div class="row">
 	
 <div class="card-body">
 	<div class="form-group">


Flight Number:<input type="text" name="fnum"><br><br>
Flight Name:<input type="text" name="fname"><br><br>
From: <select name="from">
<option value="Hyderabad">Hyderabad</option>
<option value="Delhi">Delhi</option>
<option value="Bangalore">Banglore</option>
<option value="Mysore">Mysore</option>
<option value="Mumbai">Mumbai</option>
<option value="Chennai">Chennai</option>
<option value="Goa">Goa</option>
</select><br><br>
To: <select name="to">
<option value="Hyderabad">Hyderabad</option>
<option value="Delhi">Delhi</option>
<option value="Bangalore">Banglore</option>
<option value="Mysore">Mysore</option>
<option value="Mumbai">Mumbai</option>
<option value="Chennai">Chennai</option>
<option value="Goa">Goa</option>
</select><br><br>
Date:<input type="date" name="ld"><br><br>
Time:<input type="time" name="lt"><br><br>
<input type="submit" value="Insert Flight" style=background-color:blue><br><br>

</div>
</div>
</div>
</div>

</form>

</body>
</html>