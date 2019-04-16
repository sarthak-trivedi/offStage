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
<script src="https://code.jquery.com/jquery-3.3.1.min.js"
	integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
	crossorigin="anonymous"></script>
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">

<script type="text/javascript" src="js/KBmapmarkers.js"></script>
<script type="text/javascript" src="js/KBmapmarkersCords.js"></script>

<link rel="stylesheet" type="text/css" media="screen"
	href="css/main.css">
<script>
function x() {
    setTimeout(() => {
        document.getElementById('KBtestmap').setAttribute('class', 'fadeInUp');
    }, 700);
}
    </script>
<style>
body {
	background-color: #002428;
	overflow: auto;
}
</style>
</head>
<body onload="x()" class="horiscroll">
	<jsp:include page="nav.jsp" />

    <section class="KBmap" id="KBtestmap">

    </section>
</body>
<script>

    var json =
    {
        "mapMarker1": {
            "cordX": "55",
            "cordY": "50",
            "icon": "images/pin.png",
            "modal": {
                "title": "CEP Building",
                "content": "<p></p>"
            }
        },
        "mapMarker2": {
            "cordX": "31",
            "cordY": "59",
            "icon": "images/pin.png",
            "modal": {
                "title": "Lab Building",
                "content": "<p></p>"
            }
        },
        "mapMarker3": {
            "cordX": "24",
            "cordY": "76",
            "icon": "images/pin.png",
            "modal": {
                "title": "Lecture Theatre (LT)",
                "content": "<p></p>"
            }
        },
        "mapMarker4": {
            "cordX": "58.8",
            "cordY": "71.5",
            "icon": "images/pin.png",
            "modal": {
                "title": "Lotus Point",
                "content": "<p></p>"
            }
        },
        "mapMarker5": {
            "cordX": "53.13",
            "cordY": "28",
            "icon": "images/pin.png",
            "modal": {
                "title": "Canteen",
                "content": "<p></p>"
            }
        },
        "mapMarker6": {
            "cordX": "61",
            "cordY": "27",
            "icon": "images/pin.png",
            "modal": {
                "title": "Open Air Theatre (OAT)",
                "content": "<p></p>"
            }
        },
        "mapMarker7": {
            "cordX": "69",
            "cordY": "23",
            "icon": "images/pin.png",
            "modal": {
                "title": "SAC Building",
                "content": "<p></p>"
            }
        }
    };

    (function ($) {

        $(document).ready(function () {

            createKBmap('KBtestmap', 'images/damap.jpg');

            KBtestmap.importJSON(json);

            KBtestmap.showAllMapMarkers();

        });

    })(jQuery);

</script>

</html>