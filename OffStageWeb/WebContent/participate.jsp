<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--   -->
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Participate</title>
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
	<jsp:include page="/eventParticipationFees" />
	<jsp:include page="nav.jsp" />
	<form action="<%=request.getContextPath()%>/participation"
		method="post">
		<div class="form" id="form">
			<h2 class="registerHeader">Participation Form</h2>
			
			<div class="input-field">
				<label>Select Event You Want To Participate</label> <select
					name="event" id="event" class="payModeOption">
					<option value="-1">Please Select Event</option>
					<c:forEach var="entry" items="${eventMap}">
						<option value="${entry.key}">${entry.value}</option>
					</c:forEach>
				</select>
			</div>

			<div class="input-field">
				<label>Select Category In Which You Want To Participate</label> 
				<select name="category" id="category" class="payModeOption">
					<option value="-1">Please Select Category</option>
					<c:forEach items="${categoryMap}" var="entry">
						<option value="${entry.value}">${entry.value}</option>
					</c:forEach>
				</select>
			</div>

			<div class="input-field">
				<label id="fees">Your Participation Fee</label>
			</div>

			<div class="input-field">
			<label>Select A Payment Mode</label>
				<select name="payment" id="payment" class="payModeOption">
					<option value="-1">Select a Payment Method</option>
					<option value="cash">cash</option>
					<option value="paytm">paytm</option>
					<option value="google pay">google pay</option>
				</select>
			</div>

			<div class="input-field" style="visibility: hidden;" id="noOfMembers">
				<input type="text" id="member" name="member" /> <label for="member">No
					of Group Members Other Than You</label>
			</div>
		</div>
		<div class="btns">
			<button type="submit" class="submit">Submit</button>
		</div>
	</form>
	<script type="text/javascript" src="js/jquery.js"></script>
</body>
<script type="text/javascript">
$('#event').on('change', function (e) {
    var optionSelected = $("option:selected", this);
    var valueSelected = this.value;
	$('#panel1').remove();
    $.get( "<%=request.getContextPath()%>/eventParticipationFees", { id: ""+valueSelected+""} )
    .done(function( data ) {
    	var obj = $.parseJSON(data);
    	$('#category').children('option:not(:first)').remove();
    	$('#fees').text("Your Participation Fee");
		for (var key in obj) {
			$('#category')
	         .append($("<option></option>")
	         .attr("value",key)
	         .text(obj[key]));
		}
    });
});

$('#category').on('change', function (e) {
    var optionSelected = $("option:selected", this);
    var valueSelected = this.value;
	var eid=$('#event').children('option:selected').val();
	$('#panel1').remove();
    $.get( "<%=request.getContextPath()%>/eventParticipationFees",{id:""+eid+"",cname:""+valueSelected+""} )
    .done(function( data ) {
    	$('#fees').text("Your Participation Fee");
    	$('#fees').append(":  " + data);
		
    });
    
    var cid=$('#category').children('option:selected').text();
    console.log(cid);
    if(cid=="group"){
    	document.getElementById("noOfMembers").style.visibility="visible";
    };
	if(cid=="duet"){
		document.getElementById("noOfMembers").style.visibility="hidden";
		$('#form').append("<panel id='panel1'></panel>");
		$('#panel1').append("<div class='input-field'> <input type='text' id='teamName' name='teamName' required/>" + 
		"<label for='teamName'>Duo Name</label> </div>");
		$('#panel1').append("<div class='input-field'> <input type='text' id='memberName' name='memberName' required />" + 
				"<label for='memberName'>Partner Name</label> </div>"+ 
				"<div class='input-field'> <input type='email' id='memberEmail' name='memberEmail' required/> "
				+"<label for='memberEmail'>Partner Email</label> </div>"+
				"<div class='input-field'> <input type='tel' id='memberContact' name='memberContact' required />" + 
				"<label for='memberContact'>Partner Contact</label> </div>"+
				"<div class='event-field'> <span>Partner Gender</span> <div class='gender'> <span class='radio'>"+
				"<input type='radio' name='memberGender' id='memberGender' value='Male' checked>Male </span> "+
				"<span class='radio'> <input type='radio' name='memberGender' id='memberGender' value='Female'>"+
				"Female </span> <span class='radio'><input type='radio' name='memberGender' id='memberGender'" +
				"value='Other'> Other </span> </div> </div>");
	}
});
$('#member').on('keyup', function (e) {
	var noOfMembers=$('#member').val();
	$('#panel1').remove();
	$('#form').append("<panel id='panel1'></panel>");
	$('#panel1').append("<div class='input-field'> <input type='text' id='teamName' name='teamName' required/>" + 
			"<label for='teamName'>Team Name</label> </div>");
	for (var i = 1; i <= noOfMembers; i++) {
		$('#panel1').append("<div class='input-field'> <input type='text' id='memberName"+i+"' name='memberName"+i+"' required/>" + 
		"<label for='memberName"+i+"'>Member"+i+" Name</label> </div>"+
		"<div class='input-field'> <input type='email' id='memberEmail"+i+"' name='memberEmail"+i+"' required/> "
		+"<label for='memberEmail"+i+"'>Member"+i+" Email</label> </div>"+
		"<div class='input-field'> <input type='tel' id='memberContact"+i+"' name='memberContact"+i+"' required/>" + 
		"<label for='memberContact"+i+"'>Member"+i+" Contact</label> </div>"+
		"<div class='event-field'> <span>Gender</span> <div class='gender'> <span class='radio'>"+
		"<input type='radio' name='memberGender"+i+"' id='memberGender"+i+"' value='Male' checked>Male </span> "+
		"<span class='radio'> <input type='radio' name='memberGender"+i+"' id='memberGender"+i+"' value='Female'>"+
		"Female </span> <span class='radio'><input type='radio' name='memberGender"+i+"' id='memberGender"+i+"'" +
		"value='Other'> Other </span> </div> </div>");
	}
	});
</script>
</html>