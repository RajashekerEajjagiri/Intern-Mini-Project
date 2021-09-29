<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertPayment" method="post">

<!--  --Ticket Id:<select name="tid">
<c:forEach items="${list}" var="t">
<option value="${t.getfNum()}">${t.getfNum()}</option>
</c:forEach>

</select><br><br>-->

<a href="bookticket">Back</a>
<br><br>
 <h1 align="center" style=color:red>Payment</h1>

<div class="container" align="center">
 <div class="row">
 	
 <div class="card-body">
 	<div class="form-group">


Bank Name:<select  name="bname">
<option value="sbi">State Bank Of India</option>
<option value="icici">ICICI Bank</option>
<option value="bob">Bank Of Baroda</option>
<option value="hdfc">HDFC Bank</option>
<option value="other">Others Bank</option>

</select> <br><br>
Card Number:<input type="text" name="cnum"><br><br>
Expiry Date:<input type="text" name="edate"><br><br>
CVV:<input type="password" name="cv"><br><br>
Amount:<input type="number" name="amt"><br><br>
<input type="submit" value="Payment" style=background-color:green>
</div>
</div>
</div>
</div>
</form>
</body>
</html>