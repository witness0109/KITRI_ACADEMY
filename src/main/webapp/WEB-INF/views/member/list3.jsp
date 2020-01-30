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

<!--  id검색/이름검색 선택 : va 입력 : 검색요청 버튼 클릭하면
controller 메소드 정의 추가 : public ? searchlist(?){
 id에 va 를 포함하고 있는 회원 리스트만 출력 뷰
 name 김 포함 회원 리스트만 출력 뷰
}




http://ip:port/mvc/member/searchlist?searchitem=ID검색&searchword=java
-->
	<form action="/mvc/member/searchlist">
		<select name="searchitem">
			<c:forEach items="${searchmodel }" var="searchcondition">
				<option>${searchcondition }</option>
			</c:forEach>
		</select> 
		<input type=text name="searchword"> 
		<input type=submit value="검색요청">

	</form>

	<h1>검색 가능한 회원 정보를 출력합니다.</h1>
	<c:forEach items="${listmodel}" var="list">
			${list}
		</c:forEach>



</body>
</html>