<%@page import="com.resc.PeopleCounter"%>
<%@page import="com.resc.StatusCounter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

  <link rel="stylesheet" href="/capacity/style/style.css">

<meta charset="ISO-8859-1">
<title>RESC Capacity</title>
</head>
<body>
<script>
  function ChangePage(xElem){
   form.submit()
  }
</script>


<form action="<%= request.getContextPath() %>/CounterServlet" method="post">
	<table><tr><td><a href="main.jsp">Main</a></td><td><a href="statusPage.jsp">Main Summary</a></td><td><a href="config.jsp">Config</a></td></table>
	<h1>Get People In/Out</h1>
 	<table id="customers">
 		<tr><td  colspan="4"> Shift? </td> </tr>
 		<tr><td> Shift 1:  <%=StatusCounter.getShiftOne() %><input type="radio" name="shift" id="shift1" value="shift1" <%=StatusCounter.isShiftOne()?"checked":"" %> ></td><td>Shift 2:   <%=StatusCounter.getShiftTwo() %><input type="radio"  name="shift" value="shift2" <%=!StatusCounter.isShiftOne()?"checked":"" %>></td><td><input type="submit" name="action" value="Change Shift"></td></tr>
  		<tr><th>Signed Up User</th><td><input type="submit" name="action" value="Signed Up Entered" class="greenButton"></td><td><input type="submit" name="action" value="Signed Up Exited"  class="redButton"></td></tr>
 		<tr><th>Walked In User</th><td><input type="submit" name="action" value="Walk In Entered"  class="greenButton"></td><td><input type="submit" name="action" value="Walk In Exited" class="redButton"></td></tr>
 		</tr>
 		
 		</table>
 		
 		
 		<br><br>

  <%@include file="status.jsp" %>
	
	<br><br>
	<input type="submit" name="action" value="Reset Counter?"  class="darkButton">
	 </form>
</body>
</html>