<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>회원등록</title>
</head>
<body>

<h1>회원가입</h1>


<form action = "reguser">

ID : <br>
<input type = "text" name = "id" required="required"><br>
PASSWORD : <br>
<input type = "password" name = "password" required="required"><br>
EMAIL : <br>
<input type = "text" name = "email1" required="required">@<input type = "text" name = "email2" required="required"><br>
<input type = "submit" value = "회원가입"><br>

</form>

</body>
</html>
