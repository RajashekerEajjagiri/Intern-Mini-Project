<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
<a href="userhome">Home</a>
<br><br>
 <h1 align="center" style=color:green>Update User Details</h1>

<div class="container" align="center">
 <div class="row">
 	
 <div class="card-body">
 	<div class="form-group">

<input type="hidden" name="uemail" value="${user.getEmail()}"><br><br>
Name :<input type="text" name="uname" value="${user.getName()}"><br><br>
<label>
Gender:
</label>
<input type="radio"  name="ugen" value="${user.getGen()}"/> Male    
<input type="radio"  name="ugen" value="${user.getGen()}"/> Female    
<input type="radio"  name="ugen" value="${user.getGen()}"/> Other    
<br><br>
	
Mobile :<input type="number" name="umobile" value="${user.getMobile()}"><br><br>
<label>
Address: </label>
<input type="text" name="uaddr" value="${user.getAddr()}">  
<br><br>
Date Of Birth :<input type="date" name="udob" value="${user.getDob()}"><br><br>
<input type="hidden" name="urole" value="${user.getRole()}"><br><br>
<input style=background-color:green type="submit" value="update user details">
</div>
</div>
</div>
</div>
</form>

</body>
</html>