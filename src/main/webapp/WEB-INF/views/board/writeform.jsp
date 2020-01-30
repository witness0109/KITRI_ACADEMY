<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>W R I T E</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){

	
});
</script>
</head>
<body>
<h1> Write </h1>
<form action="/mvc/write.board" method="post">
<input type="text" value="제목" name="title"/><br>
<input type="text" value="내용" name="contents"/><br>
<input type="text" value="작성자" name="writer"/><br>
<input type="password" value="12" name="password"/><br>
<input type="submit" value="작성완료">

</form>

</body>
</html>