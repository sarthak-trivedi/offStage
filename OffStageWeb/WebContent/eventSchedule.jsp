<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Event Schedule</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="css/main.css">
<jsp:include page="/displayEvents"></jsp:include>
<script>
        function fadeInLeft() {
            setTimeout(() => {
                document.getElementById('form').setAttribute('class', 'fadeInLeft');
            }, 100);

            setTimeout(() => {
                document.getElementById('form').setAttribute('class', 'fadeInLeft');
            }, 100);

        }
    </script>
</head>
<body onload="fadeInLeft()" class="horiscroll">
	<jsp:include page="nav.jsp" />
	<div class="form" id="form">
		<h2 id="form" class="registerHeader">Event Schedule</h2>

		<table class="schedule">
			<tr class="scheduletr">
				<th>Event Name</th>
				<th>Date</th>
				<th>Start Time</th>
				<th>End Time</th>
				<th>Place</th>
			</tr>
			<c:forEach items="${eventList}" var="bean">
				<tr>
					<td><c:out value="${bean.eventName }"></c:out></td>
					<td><c:out value="${bean.date }"></c:out></td>
					<td><c:out value="${bean.startTime}"></c:out></td>
					<td><c:out value="${bean.endTime}"></c:out></td>
					<td><c:out value="${bean.venue}"></c:out></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>