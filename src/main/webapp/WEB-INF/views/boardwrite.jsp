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
<h1>Board.jsp파일입니다.</h1>
<h2><%= request.getAttribute("name") %></h2>
<h2>많이 표현되는 EL 표현 -> ${name}</h2>
</body>
</html>