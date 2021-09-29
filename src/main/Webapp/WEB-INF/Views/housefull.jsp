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

<div class="container" align="center" >
 <div class="row">
 	
 <div class="card-body">
 	<div class="form-group">
 	

  <h1>Yours selected Tickets are :${result}</h1>
  
 	<h1> Total Amount is :${tcost}</h1>

<h1 style=color:orange >The Flight Number is ${fnum} Of ${fnam} Airlines , From ${ffrom}  To ${fto} on ${jdate}  Tickets are Full </h1>
<br><br>
<h1 style=color:red>Proceed for payment:  <a   href="payment">Click Here</a></h1>

</div>
</div>
</div>
</div>
</body>
</html>