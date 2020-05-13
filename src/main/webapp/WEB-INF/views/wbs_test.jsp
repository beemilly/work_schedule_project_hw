<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>근무시간표</title>
</head>
<body>
<h1>2020년 5월 근무시간표</h1>

<table border="1">
<tr style="background-color: lightblue">
<th>社員名</th><th>社員番号</th>
</tr>
<c:forEach items="${list2}" var = "v">
<tr>
<td>${v.name}</td><td>${v.u_no}</td>
</tr>
</c:forEach>
</table>
<table border="1">
<tr style="background-color: lightblue">
<th>最低勤務時間</th><th>最大勤務時間</th>
</tr>
<c:forEach items="${list3}" var = "v">
<tr>
<td>${v.min_time}</td><td>${v.max_time}</td>
</tr>
</c:forEach>
</table>
<br>


<table border="1">
<tr style="background-color: lightblue">
<th>日付</th><th>開始</th><th>終了</th><th>昼休み</th><th>集計</th><th>休日区分</th><th>メモ</th>
</tr>
<c:forEach items="${list}" var = "v">
<tr>
<td>${v.date}</td><td>${v.start_time}</td><td>${v.end_time}</td><td>${v.rest_time}</td><td>${v.end_time-v.start_time-v.rest_time}H</td><td>${v.vocation_type}</td><td>${v.memo}</td>
</tr>
</c:forEach>
</table>
<br>

<a href = "/manage">메인화면으로</a>
</body>
</html>