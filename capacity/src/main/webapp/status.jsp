		<%@page import="com.resc.PeopleCounter"%>
<%@page import="com.resc.StatusCounter"%>
<h1>Status On the Grounds</h1>
	<div id="italicFont">Current Capacity from Gov. Murphy: <%=StatusCounter.getMaxCapacity() %></div>
  	<table id="customers"> 
  	<tr><th>Category</th><th>Came In</th><th>Left</th><th>On Grounds</th><th>Left</th><tr>
  	<% if(StatusCounter.isTakeSignUps()){ %>
  	<tr><th>Signed Up Online (<%=StatusCounter.getSignUpsForMyShift() %>)</th><td><%=PeopleCounter.getSignedUpEntered() %></td><td><%=PeopleCounter.getSignedUpLeft() %></td><td><%=PeopleCounter.getSignedUpOnGrounds() %></td><td><%=PeopleCounter.howManySignedUpRemaining() %></td>
  	<% } %>
  	<tr><th>Walk Up </th><td><%=PeopleCounter.getWalkInEntered() %></td><td><%=PeopleCounter.getWalkInLeft()%></td><td><%=PeopleCounter.getWalkInOnGrounds() %></td><td><%=PeopleCounter.howManyWalkInsRemaining()%></td> </tr>
  	<tr><th>Total</th><td><%=PeopleCounter.getSignedUpEntered()+PeopleCounter.getWalkInEntered() %></td><td><%=PeopleCounter.getWalkInLeft()+PeopleCounter.getSignedUpLeft()%></td><td><%=PeopleCounter.getWalkInOnGrounds()+PeopleCounter.getSignedUpOnGrounds() %></td><td><%=PeopleCounter.howManyWalkInsRemaining()+PeopleCounter.howManySignedUpRemaining() %></td></tr>
  	</table>
	<br>
	<% if(StatusCounter.isTakeSignUps()){ %>
	<table id="smallTable">
		<tr>
			<th>Morning Session:</th><td><%=StatusCounter.getShiftOne() %></td><td><%=StatusCounter.getShiftOneSignUps() %> Signed up </td></tr>
			<th>Afternoon Session:</th><td><%=StatusCounter.getShiftTwo() %></td><td><%=StatusCounter.getShiftTwoSignUps() %> Signed up </td></tr>
	</table>
	<% } %>