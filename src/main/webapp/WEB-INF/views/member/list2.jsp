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
$(document).ready(function(){

	
});
</script>
</head>
<body>
<h1> 모든 회원 정보 출력</h1>
<c:forEach items="${listmodel }" var="member">
${member.id}회원님 ${member.name}<br>
${member} <!-- toString() -->
</c:forEach>
${listmodel}

</body>
</html>