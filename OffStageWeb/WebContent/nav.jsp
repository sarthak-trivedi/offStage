<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.shared.userBean"%>
<nav>
	<ul class="menubar">
		<li class="logo"><a href="index.jsp"> <img
				src="images/OffStageLogo2.PNG" alt="" height="30px" width="35px">
		</a></li>

		<li class="item menuitem"><a href="eventSchedule.jsp"> Event
				Schedule
				<div class="line"></div>
		</a></li>

		<c:if test="${uname}!= null">
			<li class="item menuitem"><a href="participate.jsp">
					Participation Form <br />
					<div class="line"></div>
			</a></li>
			<li class="item menuitem"><a href="accommodation.jsp">
					Accommodation Request
					<div class="line"></div>
			</a></li>
		</c:if>
		<li class="item menuitem"><a href="map.jsp"> DA Map
				<div class="line"></div>
		</a></li>
		<%-- 		<c:if test="${uname}== null"> --%>
		<li id="item4" class="item menuitem"><a href="login.jsp">
				Login <br />
				<div class="line"></div>
		</a></li>

		<li id="item5" class="item menuitem"><a href="register.jsp">
				Register <br />
				<div class="line"></div>
		</a></li>
		<%-- 		</c:if> --%>
		<c:if test="$!= null">
			<li id="item4" class="item menuitem"><a href="login.jsp">
					Logout <br />
					<div class="line"></div>
			</a></li>
		</c:if>
	</ul>
</nav>