<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accommodation</title>
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
	<div class="form" id="form">
		<h2 class="registerHeader">Accommodation Request</h2>
		<div class="input-field">
			<input type="number" id="days" name="days" required /> <label
				for="days">Number of Days</label>
		</div>

		<div class="input-field">
			<select name="payment">
				<option value="cash">cash</option>
				<option value="paytm" onselect="show()">paytm</option>
				<option value="google pay">google pay</option>
			</select>
		</div>

		<div class="input-field" id="transact">
			<input type="text" id="trans" name="trans" required /> <label
				for="trans">Transaction Number</label>
		</div>

		<br> <br>
		<div class="btns">
			<button type="submit" class="submit">Submit</button>
		</div>
	</div>
</body>
</html>