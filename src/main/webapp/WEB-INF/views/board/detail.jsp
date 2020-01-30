<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>D E T A I L</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
	$(document).ready(function() {

	});
</script>
</head>
<body>
	<h1>상세 게시물 조회</h1>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>시간</th>
			<th>암호</th>
			<th>조회수</th>
		</tr>


		<tr>
			<td>${list.seq}</td>
			<td>${list.title}</td>
			<td>${list.contents}</td>
			<td>${list.writer}</td>
			<td>${list.time}</td>
			<td>${list.password}</td>
			<td>${list.viewcount}</td>
		</tr>

	</table>


</body>
</html>