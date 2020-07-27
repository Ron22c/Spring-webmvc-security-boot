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
		<form:form action="success" method="post" modelAttribute="registrationDTO">
			<label for="name">NAME</label> 
			<form:input path="name" type="text" name="name" id="name" /><br />

			<label for="username">USERID</label> 
			<form:input path="username" type="text" name="username" id="username" /><br /> 
				
			<label for="password">PASSWORD</label> 
			<form:input path="password" type="text" name="password" id="password" /><br />
			
			<label for="age">AGE</label> 
			<form:input path="age" type="text" name="age" id="age" /><br />
			<form:errors path="age"/>
			
			<label for="country">COUNTRY</label> 
			<form:select path="country" name="country" id="country">
				<form:option value="india">INDIA</form:option>
				<form:option value="us">US</form:option>
				<form:option value="uk">UK</form:option>
			</form:select><br />
			
			
			HOBBY:
			<label for="cricket">CRICKET</label>
			<form:checkbox path="hobby"  name="hobby" value="cricket" id="cricket"/>
			<label for="travel">TRAVEL</label>
			<form:checkbox path="hobby"  name="hobby" value="travel" id="travel"/>
			<label for="programming">PROGRAMMING</label>
			<form:checkbox path="hobby"  name="hobby" value="programming" id="programming"/><br />
			
			GENDER:
			<label for="male">MALE</label>
			<form:radiobutton path="gender"  name="gender" value="male" id="male"/>
			<label for="female">FEMALE</label>
			<form:radiobutton path="gender"  name="gender" value="female" id="female"/>
			<label for="other">OTHER</label>
			<form:radiobutton path="gender"  name="gender" value="other" id="other"/><br/>
			
			<h1>COMMUNICATION</h1>
			<label for="email">EMAIL: </label>
			<form:input path="communicationDTO.email" id="email"/><br/>
			
			<label for="phone">PHONE: </label>
			<form:input path="communicationDTO.phone" id="phone"/><br/>
			<form:errors path="communicationDTO.phone"/>
			
			<input type="submit" value="REGISTER">
		</form:form>
		
		<h3 align="center"><a href="premium">GO PREMIUM</a></h3>
	</div>

</body>
</html>