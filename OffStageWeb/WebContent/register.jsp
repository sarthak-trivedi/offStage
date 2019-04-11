<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Register</title>
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
	<form action="<%=request.getContextPath()%>/register" method="post">
		<div class="form" id="form">
			<h2 class="registerHeader">Register</h2>

			<div class="input-field">
				<input type="text" id="name" name="name" required /> <label
					for="name">Your Name</label>
			</div>

			<div class="input-field">
				<input type="email" id="email" name="email" required /> <label
					for="email">Email ID</label>
			</div>

			<div class="input-field">
				<input type="tel" id="number" name="number" required /> <label
					for="number">Contact Number</label>
			</div>

			<div class="input-field">
				<input type="tel" id="number" name="altNumber" required /> <label
					for="altNumber">Alternate Contact</label>
			</div>

			<div class="input-field">
				<input type="password" id="pass" name="pass" required /> <label
					for="pass">Password</label>
			</div>

			<div class="input-field">
				<input type="text" id="college" name="college" required /> <label
					for="college">College Name</label>
			</div>

			<div class="input-field">
				<input type="address" id="address" name="address" required /> <label
					for="address">Address</label>
			</div>

			<div class="event-field">
				<span>Gender</span>
				<div class="gender">
					<span class="radio"> <input type="radio" name="gender" id="gender"
						value="Male" checked>Male
					</span> 
					<span class="radio"><input type="radio" name="gender" id="gener" value="Female">Female</span>
					<span class="radio"><input type="radio" name="gender" id="gender" value="Other">Other</span>
				</div>
			</div>

			<div class="btns">
				<button type="submit" class="submit">Submit</button>
			</div>

		</div>
	</form>
</body>
</html>