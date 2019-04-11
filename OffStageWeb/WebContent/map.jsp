<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DA Map</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="css/main.css">
<script>
        function fadeInLeft() {
            setTimeout(() => {
                //document.getElementById('form').setAttribute('class', 'fadeInLeft');
            }, 100);
        }
    </script>

</head>
<body onload="fadeInLeft()" class="horiscroll">
<jsp:include page="nav.jsp" />
<img alt="Map Of DAIICT" src="images/damap.jpg" width="55%">

</body>
</html>