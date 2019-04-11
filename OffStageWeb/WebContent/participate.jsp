<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Participate</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="css/main2.css">

<script>
        function fadeInLeft() {
            setTimeout(() => {
                document.getElementById('form').setAttribute('class', 'fadeInLeft');
            }, 100);

        }
    </script>
</head>
<body onload="fadeInLeft()" class="horiscroll">
	<jsp:include page="/displayEvents" />
	<jsp:include page="nav.jsp" />
	<div class="form" id="form">
		<h2 class="registerHeader">Participation Form</h2>

		<div class="event-field">
			<span>Select Event You Want To Participate</span>
			<div class="input-field">
				<select name="event" id="event">
					<c:forEach items="${eventList}" var="bean">
						<option value="${bean.id }">${bean.eventName}</option>
					</c:forEach>
				</select>
			</div>
		</div>

		<div class="event-field">
			<span>Select Category In Which You Want To Participate</span>
			<div class="input-field">
				<ul>
					<c:forEach items="${category}" var="bean">

						<radio id="category" name value="${bean.id }"> ${bean.eventName}
					</c:forEach>
				</ul>
			</div>
		</div>
		<div class="btns">
			<button type="submit" class="submit">Submit</button>
		</div>
	</div>
</body>
</html>