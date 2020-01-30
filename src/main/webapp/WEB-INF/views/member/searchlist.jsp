<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>S E A R C H</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
	$(document).ready(function() {

	});
</script>
</head>
<body>
	<h1>${item}검색 조건을 만족하는 ${word}회원 리스트를 출력합니다.</h1>
	<c:if test="${item == 'id'}">
		<c:forEach items="${listmodel}" var="member">
		<c:if test="${member.id.contains(word) }">
	${member}<br>
	</c:if>
		</c:forEach>
	</c:if>

	<c:if test="${item == '이름'}">
		<c:forEach items="${listmodel}" var="member">
		<c:if test="${member.name.contains(word) }">
	${member}<br>
	</c:if>
		</c:forEach>
	</c:if>
</body>
</html>