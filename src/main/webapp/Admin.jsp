<%@page import="dbutils.Dao"%>
<%@page import="pojo.Event"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="dbutils.DBConnection" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="javax.servlet.http.HttpSession" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<SCRIPT type="text/javascript">
    window.history.forward();
    function noBack() { window.history.forward(); }
</SCRIPT>
<body>
<%
		if(session.getAttribute("email")==null)
		{
			response.sendRedirect("Login.jsp");
		}
		Dao dao = new Dao();
		ArrayList<Event> listOfEvents= new ArrayList<Event>();
		listOfEvents=dao.fetchEvent();
		pageContext.setAttribute("list",listOfEvents);
	
	%>
	
	<div class="container">
			<div id="col-sm-12">
			</br>
		  <h1>Scheduled Events :</h1></br></br>
		             
		  <table class="table table-bordered">
		    <thead>
		      <tr>
		        <th>Date</th>
		        <th>Topic</th>
		        <th>Presenter</th>
		        <th>Want to register?</th>
		      </tr>
		    </thead>
		    <tbody>
		    <%for(Event event:listOfEvents){ %>
		      <tr>
		        <td><%=event.getDate() %></td>
		        <td><%=event.getTopic() %></td>
		        <td><%=event.getPresenter() %></td>
		        <td><button type="button" class="btn btn-success" >Update</button>
		        <button type="button" class="btn btn-danger" id=<%=event.getTopic() %>>Delete</button></td>
		      </tr>
		      <%} %>
		      </tbody>
		  </table>
		  
		  <a href="Logout"><button type="button" class="btn btn-danger">Logout</button></a>
		  <a href="NewTechTalk.jsp"><button type="button" class="btn btn-danger">Request for techtalk</button></a>
		  </div>
		  
  
		 
		  
</div>


</body>
</html>