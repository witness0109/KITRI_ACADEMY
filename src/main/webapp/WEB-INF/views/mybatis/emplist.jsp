<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
	$(document).ready(function() {

	});
</script>
</head>
<body>
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
		</tr>

		<c:forEach items="${emplist}" var="vo">
			<tr>
				<td>${vo.employee_id}</td>
				<td>${vo.last_name}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>