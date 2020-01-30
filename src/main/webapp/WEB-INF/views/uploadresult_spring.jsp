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
<h1> 업로드 완료되었습니다. </h1>
<h3>${uploadVO.file1.originalFilename} 파일을 업로드 완료하였습니다.</h3>
<h3>${uploadVO.file2.originalFilename} 파일을 업로드 완료하였습니다.</h3>
</body>
</html>