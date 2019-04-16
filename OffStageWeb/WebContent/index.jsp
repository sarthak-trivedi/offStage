<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>OffStage</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="css/main.css">
<script>
        function x() {
            setTimeout(() => {document.getElementById('FadeDiv').setAttribute('class', 'fadeInUp');}, 700);
        }
    </script>
</head>
<body onload="x()" class="noscroll">
<jsp:include page="nav.jsp"/>
	<div id="FadeDiv" class="panel">
        <div class="HeadHome">OffStage</div>
        <h2>To Make Your On Stage Performance Better</h2>
    </div>
</body>
</html>