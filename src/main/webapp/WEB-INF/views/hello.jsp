<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h1>hello.jsp파일입니다.</h1>
<h2><%= request.getAttribute("model") %></h2>
<h2>${requestScope.model}</h2>
</body>
</html>