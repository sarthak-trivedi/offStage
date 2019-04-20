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
<jsp:include page="/displayStudents"></jsp:include>
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
		<h2 id="form" class="registerHeader">Student Details</h2>

		<table class="schedule">
			<tr class="scheduletr">
				<th>Student Id</th>
				<th>Name</th>
				<th>Gender</th>
				<th>Email Id</th>
				<th>Contact</th>
				<th>Role</th>
			</tr>
			<c:forEach items="${studentList}" var="bean">
				<c:set var="i" value="${i+1}"></c:set>
				<tr>
					<td id="sid"><c:out value="${bean.id }"></c:out></td>
					<td><c:out value="${bean.name }"></c:out></td>
					<td><c:out value="${bean.gender}"></c:out></td>
					<td><c:out value="${bean.email}"></c:out></td>
					<td><c:out value="${bean.contact}"></c:out></td>
					<td>
					<select name="role" id="role" >
							<option value="-1">Select Position</option>
							<option value="${bean.id }">Core Member</option>
							<option value="${bean.id }">Coordinator</option>
					</select>
				</tr>
			</c:forEach>
		</table>
	</div>
	<script type="text/javascript" src="js/jquery.js"></script>
</body>
<script>
$('select').on('change',function (){
	var sel=this.value;
	var sid=$(this).find(":selected").text();
	console.log(sel);
	console.log(sid);
	$.get( "<%=request.getContextPath()%>/insertUser", { id: ""+sel+"",role:""+sid+"" } )
 .done();
});
</script>
</html>