<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.shared.userBean"%>
<nav>
	<ul class="menubar">
		<li class="logo"><a href="index.jsp"> <img
				src="images/os logo.png" alt="" height="30px" width="35px">
		</a></li>

		<c:if test="${sessionScope.type != 'management'}">
			<li class="item menuitem"><a href="eventSchedule.jsp"> Event
					Schedule
					<div class="line"></div>
			</a></li>

			<li class="item menuitem"><a href="map.jsp"> DA Map
					<div class="line"></div>
			</a></li>
		</c:if>

		<c:if test="${sessionScope.type == 'management'}">
			<li class="item menuitem"><a href="addMembers.jsp"> Add Members
					<div class="line"></div>
			</a></li>
			
			<li class="item menuitem"><a href="reports.jsp"> Report
					<div class="line"></div>
			</a></li>
		</c:if>

		<c:if
			test="${sessionScope.userbean != null && sessionScope.type == 'participant'}">
			<li class="item menuitem"><a href="participate.jsp">
					Participation Form <br />
					<div class="line"></div>
			</a></li>
		</c:if>

			<c:if test="${sessionScope.userbean != null}">
			<li id="item4" class="item menuitem"><a href="logout">Logout
					<br />
					<div class="line"></div>
			</a></li>
		</c:if>
			<c:if test="${sessionScope.userbean == null}">
			<li id="item4" class="menuitemL1" style=""><a
				href="managementLogin.jsp"> Management Login <br />
					<div class="line"></div>
			</a></li>

			<li id="item6" class="menuitemL2"><a href="login.jsp">
					Participant Login <br />
					<div class="line"></div>
			</a></li>

			<li id="item5" class="menuitemL3"><a href="register.jsp">
					Register <br />
					<div class="line"></div>
			</a></li>
		</c:if>
		
	</ul>
</nav>