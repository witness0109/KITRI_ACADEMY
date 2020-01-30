<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Store Result</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){

	
});
</script>
</head>
<body>
<h1> 등록 완료 </h1>
<h3>${model}</h3>
<h3> ${bakeryVO.img.originalFilename}</h3>

<img src="/mvc/resources/${bakeryVO.img.originalFilename}"/>
</body>
</html>