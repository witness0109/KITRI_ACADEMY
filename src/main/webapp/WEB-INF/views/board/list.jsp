<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>B O A R D     L I S T</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){

	
});
</script>
</head>
<body>
<h1> BoardList </h1>

	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>시간</th>
			<th>조회수</th>
		</tr>
		<c:forEach items="${list}" var="vo">
			<tr>
				<td>${vo.seq}</td>
				<td><a href = "/mvc/detail.board?seq=${vo.seq}">${vo.title}</a></td>
				<td>${vo.writer}</td>
				<td>${vo.time}</td>
				<td>${vo.viewcount }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>