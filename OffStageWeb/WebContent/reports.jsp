<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!-- PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Report</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="css/main.css">
	<link rel="stylesheet" type="text/css" media="screen"
	href="css/bootstrap.min.css">
<jsp:include page="/reportData" />
</head>
<body >
	<jsp:include page="nav.jsp" />
	<div class="content-wrapper">
		<div class="container-fluid">
		<ol class="breadcrumb">
				<li class="breadcrumb-item"><b>Report</b></li>

			</ol>
	<table class="schedule table table-bordered" id="example">
	<thead>
		<tr class="scheduletr">
			<th>Event Name</th>
			<th>Participant Name</th>
			<th>Contact No</th>
			<th>Email id</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${participantList}" var="bean">
			<tr>
				<td><c:out value="${bean.eventName }"></c:out></td>
				<td><c:out value="${bean.name }"></c:out></td>
				<td><c:out value="${bean.contact}"></c:out></td>
				<td><c:out value="${bean.email}"></c:out></td>
			</tr>
		</c:forEach>
		</tbody>
		<tfoot>
		<tr></tr>
		</tfoot>
	</table>
</div>

	<%@include file="js.html"%>
</div>
</body>
<script type="text/javascript">
$(document).ready(function() {
	$('#example').DataTable({
	dom:'Bfrtip',
	buttons:[
	         'pdf'
	         ]
	});
	
});
</script>
</html>