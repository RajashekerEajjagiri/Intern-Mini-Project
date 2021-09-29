<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
  <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
 <script type="text/javascript">
  $(function(){
   var dtToday = new Date();
  
   var month = dtToday.getMonth() + 1;
   var day = dtToday.getDate();
   var year = dtToday.getFullYear();
   if(month < 10)
       month = '0' + month.toString();
   if(day < 10)
       day = '0' + day.toString();
   
   var maxDate = year + '-' + month + '-' + day;
   $('#txtDate').attr('min', maxDate);
});
  
</script>


</head>
<body>


<form action="insertTicket" method="post">
<a href="userhome">Home</a>
<br><br>
 <h1 align="center" style=color:red><b>Book Ticket</b></h1>

<div class="container" align="center">
 <div class="row">
 	
 <div class="card-body">
 	<div class="form-group">

<!--  --Ticket Id: <input type="number" name="tid"><br><br>-->
From:<select name="ffrom">
<c:forEach items="${list}" var="t">
<option value="${t.getFlightFrom()}">${t.getFlightFrom()}</option>
</c:forEach>

</select><br><br>
To:<select name="fto">
 <c:forEach items="${list}" var="t">
<option value="${t.getFlightTo()}">${t.getFlightTo()}</option>
</c:forEach>

</select><br><br>
Flight Number:<select name="fnum">
<c:forEach items="${list}" var="t">
<option value="${t.getFlightNum()}">${t.getFlightNum()}</option>
</c:forEach>

</select><br><br>
Flight Name:<select name="fnam">
<c:forEach items="${list}" var="t">
<option value="${t.getFlightName()}">${t.getFlightName()}</option>
</c:forEach>

</select><br><br>
Date Of Journey:<input type="date" name="jdate"><br><br>
Depature Time: <input type="time" name="deptime"><br><br>
Ticket type:<select  name="ttype">
<option value="economic">Economic</option>
<option value="business">Business</option>

</select> <br><br>
Number Of Tickets : <input type="number" name="not"><br><br>
<input type="submit" value="Book" style=background-color:blue>

</div>
</div>
</div>
</div>
</form>
</body>
</html>