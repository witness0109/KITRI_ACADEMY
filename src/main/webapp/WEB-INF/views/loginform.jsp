<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
      <%String path = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>L O G I N</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){

	
});
</script>
</head>
<body>
<h1> 로그인 해주세요 </h1>
<form action="/mvc/login" method="post">
아이디입력:<input type=text name="id">
암호입력:<input type=password name="pw">
<input type=submit value="로그인">
</form>

</body>
</html>