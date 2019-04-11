<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Student Register</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="css/main.css">

<script>
        function fadeInLeft() {
            setTimeout(() => {
                document.getElementById('form').setAttribute('class', 'fadeInLeft');
            }, 100);
        }
    </script>
</head>
<body onload="fadeInLeft()" class="horiscroll">
	<jsp:include page="nav.jsp" />
	<form action="<%=request.getContextPath()%>/student" method="post">
	<div class="form" id="form">
		<h2 class="registerHeader">Student Registration</h2>

		<div class="input-field">
			<input type="text" id="sid" name="sid" required /> <label for="sid">Student
				ID</label>
		</div>
		
		<div class="input-field">
			<input type="text" id="name" name="name" required /> <label for="name">Your
				Name</label>
		</div>
		
		<div class="input-field">
			<input type="email" id="email" name="email" required /> <label for="email">Email
				ID</label>
		</div>

		<div class="input-field">
			<input type="tel" id="number" name="number" required /> <label for="number">Contact
				Number</label>
		</div>

		<div class="input-field">
			<input type="tel" id="emNumber" name="emNumber" required /> <label for="emNumber">Alternative
				Number</label>
		</div>
		
		<div class="input-field">
			<select name="course" id="course" required>
				<option>Select Course</option>
				<option>BTech(CS)</option>
				<option>BTech(ICT)</option>
				<option>MTech(ICT)</option>
				<option>MSc(IT)</option>
				<option>MDes</option>
				<option>Phd</option>
			</select>
		</div>
		
		<div class="input-field">
			<input type="year" id="year" name="year" required /> <label for="year">Batch Year
				</label>
		</div>
		
		<div class="event-field">
			<span>Gender</span>
			<ul class="EventList">
				<li class="event"><input type="radio" name="gender" id="gender"
					value="Male" checked> <label class="eventlabel" for="r1">Male</label>
				</li>
				<li class="event"><input type="radio" name="gender" id="gener"
					value="Female"> <label for="r1">Female</label></li>
				<li class="event"><input type="radio" name="gender" id="gender"
					value="Other"> <label for="r1">Other</label></li>
			</ul>
		</div>

		<div class="btns">
			<button type="submit" class="submit">Submit</button>
		</div>

	</div>
</form>
</body>
</html>