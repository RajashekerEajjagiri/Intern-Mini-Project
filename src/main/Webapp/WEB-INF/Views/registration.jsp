<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="insertuser" method="post"  enctype="multipart/form-data">
 
 <a href="mainhome">Home</a><br><br>
 <h1 align="center" style=color:green> Registration Form</h1><br>

<div class="container" align="center">
 <div class="row">
 	
 <div class="card-body">
 	<div class="form-group">
Name: <input type="text" name="name"><br><br>
Email: <input type="email" name="email"><br><br>
<label>
Gender:
</label>
<input type="radio"  name="gen" value="male"/> Male    
<input type="radio"  name="gen" value="female"/> Female    
<input type="radio"  name="gen" value="other"/> Other    
<br><br>
Mobile: <input type="number" name="mob"><br><br>
<label>
Address: </label>
<input type="text" name="addr">  
<br><br>
Date Of Birth:<input type="date" name="dob"><br><br>
Photo: <input type="file" name="img" id="img" accept="image/png,image/jpeg"><br><br><br>


<input style=background-color:green type="submit" value="Register">
</div>
</div>
</div>
</div>
</form>

</body>
</html>