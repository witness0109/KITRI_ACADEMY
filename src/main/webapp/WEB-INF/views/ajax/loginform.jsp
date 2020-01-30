<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/mvc/resources/jquery-3.2.1.min.js"></script>
<script>
	$(document).ready(function() {
	$("#loginajaxbtn").on('click',function(){
		$.ajax({
			url : '/mvc/ajax/login',
			data : {'id': $("#id").val(), 'pw' : $("#pw").val() },
			type : 'post',
			dataType : 'json',
			success : function(data){ // 성공적인 응답결과 받기
				//{result:xxx, logintime:..... }
				$("#loginresultdiv").html(data.result + ":" + data.logintime); // html(data.result, data.logintime)
				if(data.result=='ok'){
					//현재 body 태그 끝에 추가
					$('body').append('<input type = button id="boardajaxbtn" value="게시물소환">');
					$('body').append('<div id="boardresultdiv"></div>');
				}
			},
			error : function(err){ 
				alert(err);
			}// 에러 뜰시
		}); // ajax end
	});
		
	$('body').on('click',"#boardajaxbtn",function(){
		$.ajax({
			//url = /mvc/ajax/boardlist 요청
			url : '/mvc/ajax/boardlist',
			// 컨트롤러 메소드 요청 결과로 BoradVO 객체 5개 생성 - ArrayList 저장 - 리턴
			type : 'get',
			dataType : 'json',
			
			success : function(data){ // 성공적인 응답결과 받기
				// 리턴받아서 boardresultdiv id 태그 내부 출력
				var list= '';
				for(var i = 0 ; i<data.length; i++){
				list += "<a href='' id='"+data[i].seq+"'>"+ data[i].title +"</a>"+ ":" + data[i].contents+ "<br>"; 
				
			}
			$("#boardresultdiv").html(list);
			$('body').append('<div id="oneboarddiv"> </div>');
			}

			});
		});// 
	
		
		$('body').on('click',"a",function(e){
			//이벤트.preventDefault(); a submit
			//a 태그 기본 동작 해제
			e.preventDefault();
			$.ajax({
							
				url : '/mvc/ajax/oneboard',
				// /mvc/ajax/oneboard : ajax요청
				data :{'jaeyoung': e.currentTarget.id},
				// data: {'seq' : $("a").(this).attr("id")},
				
				dataType : 'json',
				success : function(one){
					
				// 제목 클릭시 게시물번호 파라미터로 전송
				// one.seq + ":" + one.title + ":" + one.contents + ":" + one.writer;
				// 컨트롤러 메소드 : 파라미터 번호 같은 게시물 1개 리턴
				// 출력
					$("#boardresultdiv").html(one.seq+":"+one.title+":"+one.contents);
				}
				});// ajax end
			});
	});
</script>
</head>
<body>
	<form action="/mvc/ajax/login" method=post>
		아이디<input type=text name="id" id="id"><br> 비밀번호<input
			type=password name="pw" id="pw"><br> <input
			type="submit" value="로그인"> <input id="loginajaxbtn"
			type="button" value="ajax로 로그인">
	</form>

	<div id="loginresultdiv"></div>
</body>
</html>