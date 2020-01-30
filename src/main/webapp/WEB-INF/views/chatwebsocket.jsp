<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chat WebSocket</title>
</head>
<style>
#me{
	text-align: right;
	display: block;
}
</style>
<body>
	<p id="me">안녕</p>
	아이디 :
	<input type=text id="nickname" value="${param.id}">
	<input type=button id="enterbtn" value="채팅방입장">
	<input type=button id="exitbtn" value="채팅방퇴장">

	<h1>채팅방</h1>
	<div id="chatarea">
		<div id="chatmessagearea"></div>
	</div>

	전솔할 메세지 :
	<input type="text" id="message">
	
	<!-- nickname : message -->
	<input type=button id="sendbtn" value="메세지전송">
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script>
		var websocket;

		$(document).ready(function() {
			//enter 누를시
			$("#message").keyup(function(e){
				if(e.keyCode == 13){
					var nick = $("#nickname").val();
					var msg = $("#message").val();
					websocket.send(nick + ":" + msg);
				}
			});
			
			
			$("#enterbtn").on('click', function() {
				websocket = new WebSocket("ws://localhost:8081/mvc/chatws");
				//websocket = new WebSocket("ws://192.168.15.200:8082/mvc/chatws");
				//http://192.168.15.200:8082/mvc				
				//서버가 응답겨로가 전송받앗을 때 자동 처리 내용 구현
				websocket.onmessage = function(server) {

					
					var who = server.data.split(":")[0];
					var me = $("#nickname").val();
					if(me == who){
						$('#chatmessagearea')
						.append($("<div id='me'>"+server.data+"</div>").css("background-color","yellow")
								.css("text-align","right")
								.css("line-height","200%")
								);
						
					}else{
						$("#chatmessagearea").append(server.data+ "<br>");
					}  
					
					
					/* 			var myid = (server.data).split(':',1);
								
						 		if(myid == '${param.id}'){
									$('#chatmessagearea').append("<a id='me'>"+server.data+"</a><br>");
								}else{
									$("#chatmessagearea").append(server.data+ "<br>");
								}  */
				}

				//서버와 연결되었을 때 자동 처리 내용
				websocket.onopen = function() {
					console.log("웹소켓연결성공");
				}

				//서버와 연결 해제되었을 때 처리 내용
				websocket.onclose = function() {
					console.log("웹소켓연결해제");
				}
			});

			$("#exitbtn").on('click', function() {
				websocket.close();

			});

			//현재 클라이언트가 서버로 문자 보냄 (nickname : message)
			$("#sendbtn").on('click', function() {
				var nick = $("#nickname").val();
				var msg = $("#message").val();
				websocket.send(nick + ":" + msg);
			});
		});
	</script>
</body>
</html>