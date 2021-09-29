<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<a href="mainhome">Home</a><br><br>
<h4 align="center" style="color:red">${msg}</h4>
<form action="checkuser"><br><br>
<h1 align="center" style=color:green> Login Page</h1>

<div class="container" align="center">
 <div class="row">
 	
 <div class="card-body">
 	<div class="form-group">
	User Name: <input type="email" name="email" placeholder="Enter your Email"><br>
  <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>   
 <div class="form-group">
 	PassWord:  <input type="password" name="mobile" placeholder="Enter your Mobile Number"><br><br>
</div>
	<div class="form-group">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label><br><br>
 
  <input style=background-color:green type="submit" value="Login">
</div>
</div>
</div>
</div>

</form>

</body>
</html>