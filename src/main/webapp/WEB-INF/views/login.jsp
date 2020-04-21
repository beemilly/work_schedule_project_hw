<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>로그인페이지</title>
</head>
<body>

<h1>JAP + Spring 연동</h1>


<form action = "logincheck">

ID : <br>
<input type = "text" name = "id"><br>
PASSWORD : <br>
<input type = "password" name = "password"><br>
<input type = "submit" value = "로그인"><br>

</form>

<a href = "movereguser">회원가입</a><br>
<a href = "movefindpassword">패스워드 찾기</a><br>


</body>
</html>
