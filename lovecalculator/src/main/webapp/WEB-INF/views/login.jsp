<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CALCULATOR: LOGIN PAGE</title>
<script type="text/javascript">
	function onSubmitEffect() {
		var username = document.getElementById("id").value;
		if (username.length < 3) {
			alert('username should not be less then 3')
			return false;
		} else {
			return true;
		}
	}
</script>
</head>
<body>
	<h1 align="center">WELCOME TO THE CALCULATOR!</h1>
	<div align="center">
		<a href="registration">REGISTRATER HERE</a>
	</div>
	<hr />

	<div align="center">
		<form:form action="home" method="post" modelAttribute="loginDTO"
			onsubmit="return onSubmitEffect()">
			<label for="id"> USERID: </label>
			<form:input path="userid" id="id" />
			<form:errors path="userid" />
			<br />
			<br />

			<label for="password"> PASSWORD: </label>
			<form:input path="password" id="password" />
			<form:errors path="password" />
			<br />
			<br />

			<form:checkbox path="terms" id="terms" />
			<label for="password"> I AGREE TO THE TERMS </label>
			<form:errors path="terms" />
			<br />
			<br />

			<input type="submit" value="LOGIN">
		</form:form>
	</div>
</body>
</html>