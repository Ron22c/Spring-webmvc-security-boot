<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REGISTRATION PAGE: PREMIUM</title>
</head>
<body>
	<h1 align="center">WELCOME TO PREMIUM MEMBERSHIP PORTAL</h1>
	<hr />
	<div align="center">
		<form:form action="premiumregister" method="post"
			modelAttribute="premiumRegistrationDTO">
			<label for="id">USERNAME</label>
			<form:input path="username" id="id" />
			<br />
			<br />
			<label for="card">CRADIT CARD NUMBER</label>
			<form:input path="cardNumber" id="card" />
			<br />
			<br />
			<input type="submit" value="REGISTER">
		</form:form>
	</div>
</body>
</html>