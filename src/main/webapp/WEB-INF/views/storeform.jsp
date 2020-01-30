<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>빵 가게</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){

	
});
</script>
</head>
<body>
// name = "이름" - 컨트롤러 - dao - vo - db테이블
// price --> name " vo(int) - db(number)"
// form action="<%=request.getContextPath() %>"
<form action="/mvc/store.bakery" method = "post" enctype="multipart/form-data">
// 베이커리이름, 가격, 수량, 이미지파일 업로드 폼<br>
빵 이름<input type=text name="bakeryname" value="빵  "><br>
가격<input type=text name="price" value="0">원<br>
수량<input type=text name="balance" value="000">개<br>
이미지파일 업로드 <input type="file" name="img">
<input type=submit value= "완료">
</form>
</body>
</html>