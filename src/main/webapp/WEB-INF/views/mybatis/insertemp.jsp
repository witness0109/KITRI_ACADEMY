<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Emp</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
	$(document).ready(function() {

	});
</script>
</head>
<body>
	<form action="/mvc/mybatis/insertemp" method="post">
		사번<input type="text" name="employee_id" required="required"><br>

		 성<input type="text" name="last_name">
		 		 이름<input type="text" name="first_name"><br>
		  이메일<input type="text" name="email"> <br>
		직종코드<select name=job_id size="1">
			<c:forEach items="${joblist}" var="jd" >
				<option>${jd}</option>
			</c:forEach>
		</select> <br>
		<input type="submit" value="가입">
	</form>
</body>
</html>