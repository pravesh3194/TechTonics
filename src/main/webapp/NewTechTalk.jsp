<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add techTalk</title>
<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
 <div id="col-sm12">
		  	</br></br></br>
		  	<form action="NewTechTalk" method="post">
				    <div class="form-group">
				      <label for="date">Date:</label>
				      <input type="date"  class="form-control" id="date" placeholder="Enter Date" name="date">
				    </div>
				    <div class="form-group">
				      <label for="topic">Topic:</label>
				      <input type="text" class="form-control" id="topic" placeholder="Enter Topic" name="topic">
				    </div>
				     <div class="form-group">
				      <label for="presenter">Presenter Name:</label>
				      <input type="text" class="form-control" id="presenter" placeholder="Enter Name" name="presenter">
				    </div>
				</br></br>
		  	<button type="submit" class="btn btn-info">Add Event</button>
				
				    
			</form>
			
</body>
</html>