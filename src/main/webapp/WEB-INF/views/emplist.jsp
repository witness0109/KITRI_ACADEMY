<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src='<%=request.getContextPath() + "/resources/jquery-3.2.1.min.js"%>'></script>
<script>
	$(document).ready(function() {

	});
</script>
</head>
<body>
<img src="/mvc/resources/images/pengha.jpg"><br>
	<h1>회원내용</h1>
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>급여</th>
			<th>입사일</th>
		</tr>
		<c:forEach items="${list}" var="vo">
			<tr>
				<td>${vo.id}</td>
				<td>${vo.name}</td>
				<td>${vo.salary}</td>
				<td>${vo.hiredate}</td>
			</tr>
		</c:forEach>
	</table>


	<%-- <pre><h2>${list}</h2></pre> --%>


</body>
</html>