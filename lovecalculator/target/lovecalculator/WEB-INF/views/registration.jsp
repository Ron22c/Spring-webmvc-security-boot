<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CALCULATOR: REGISTRATION</title>
</head>
<body>
	<h1 align="center">WELCOME TO THE CALCULATOR!</h1>
	<div align="center">
		<a href="/lovecalculator">LOGIN HERE</a>
	</div>
	<hr />

	<div align="center">
		<form action="login" method="post">
			<label for="name">NAME</label> 
			<input type="text" name="name" id="name" /><br />

			<label for="username">USERID</label> 
			<input type="text" name="username" id="username" /><br /> 
				
			<label for="password">PASSWORD</label> 
			<input type="text" name="password" id="password" /><br />
			
			<label for="country">COUNTRY</label> 
			<select name="country" id="country">
				<option value="india">INDIA</option>
				<option value="us">US</option>
				<option value="uk">UK</option>
			</select><br />
			
			HOBBY:
			<label for="cricket">CRICKET</label>
			<input type="checkbox" name="hobby" value="cricket" id="cricket"/>
			<label for="travel">TRAVEL</label>
			<input type="checkbox" name="hobby" value="travel" id="travel"/>
			<label for="programming">PROGRAMMING</label>
			<input type="checkbox" name="hobby" value="programming" id="programming"/><br />
			
			GENDER:
			<label for="male">MALE</label>
			<input type="radio" name="gender" value="male" id="male"/>
			<label for="female">FEMALE</label>
			<input type="radio" name="gender" value="female" id="female"/>
			<label for="other">OTHER</label>
			<input type="radio" name="gender" value="other" id="other"/><br/>
			
			<input type="submit" value="REGISTER">
		</form>
	</div>

</body>
</html>