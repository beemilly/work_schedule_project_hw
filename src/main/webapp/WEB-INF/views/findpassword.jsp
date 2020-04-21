<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FindPassword</title>
</head>
<body>

<h1>패스워드 찾기</h1>

<form action = "findpassword">
ID : <input type = "text" name = "id" placeholder = "아이디를 입력하세요."><br>
Email : <input type = "text" name = "email1" placeholder = "Email을 ">@<input type = "text" name = "email2" placeholder = "입력하세요."><br>
<input type = "submit" value = "찾기 실행"><br>
<a href = "/manage">뒤로가기</a>
</form>

</body>
</html>