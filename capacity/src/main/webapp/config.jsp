<%@page import="com.resc.StatusCounter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="/capacity/style/style.css">
<script>
function changeSignUp(){
	
	if(!document.getElementById("takeSignups").value ){
		alert("in true");
		document.getElementById("shiftOneSignUps").value="jim";
	}
	if(document.getElementById("takeSignups").value)
		document.getElementById("shiftOneSignUps").value="james";
			alert("in false");
	}
	
}
</script>
<title>Configuration</title>
</head>
<body>
<% 
if(request.getParameter("saved")!=null){
	System.out.println("In the JSP I am saved");
}else{
	System.out.println("In the JSP I am NOT saved");
}
%>
<table><tr><td><a href="main.jsp">Main</a></td><td><a href="statusPage.jsp">Main Summary</a></td><td><a href="config.jsp">Config</a></td></table>
	
<h1> RESC Capacity Configuration</h1>
<% if(request.getParameter("saved")!=null){ %><strong style="color: red;">Saved</strong><% } %>
 <form action="<%= request.getContextPath() %>/ConfigServlet" method="post">
 	<table id="customers">
 		<tr><td  colspan="2"> Capacity and Shift Set-up </td> </tr>
 		<tr><th>Capacity</th><td><input type="text" name="maxCapacity" value="<%=StatusCounter.getMaxCapacity() %>"> </td></tr>
 		<tr><th>Shift One:</th><td> <input type="text" name="shiftOne" value="<%=StatusCounter.getShiftOne() %>"></td></tr>
 		<tr><th>Shift Two:</th><td> <input type="text" name="shiftTwo" value="<%=StatusCounter.getShiftTwo() %>"></td></tr>
 	<tr><td  colspan="2"> Current Sign-Ups </td> </tr>
 	<tr><th> Take Sign-ups?</th><td><select name="takeSignups" id="takeSignups" onchange="changeSignUp()">
  <option value="true" <%=StatusCounter.isTakeSignUps()?"selected":"" %>>Yes</option>
  <option value="false"<%=!StatusCounter.isTakeSignUps()?"selected":"" %>>No</option></select></td></tr>
 	
 	
 	<tr><th>Shift One:</th><td><input type="text" name="shiftOneSignUps" id="shiftOneSignUps" value="<%=StatusCounter.getShiftOneSignUps() %>"></td></tr>
 	<tr><th>Shift Two:</th><td><input type="text" name="shiftTwoSignUps" value="<%=StatusCounter.getShiftTwoSignUps() %>"></td></tr>
 
 	<tr><td><input type="submit" value="Save"></td><td><a href="config.jsp">never mind</a></td></tr>	
 	</table>
  
  
 </form>
</body>
</html>