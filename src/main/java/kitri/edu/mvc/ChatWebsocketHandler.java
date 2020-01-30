package kitri.edu.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

@Component("chatwebsockethandler")
//각 클라이언트 접속 - 모든  웹소켓 핸들러 객체들 list 1개로 공유해야함 
public class ChatWebsocketHandler implements WebSocketHandler {

	public static List<WebSocketSession> list = new ArrayList<>(); // static 하나로 고정

	@Override
	// 최초 클라이언트 연결시
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		list.add(session);
		System.out.println("사용자추가 = " + list.size());
	}

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		// session : 웹소켓클라이언트(ip,...)
		// message : 클라이언트가 서버로 보낸 메세지 ( nick:message)
		// 1개 클라이언트가 문자 보내면 받음
		String msg = (String) message.getPayload();
		// 나머지 모든 클라이언트에게 보냄 (server.data = nick:message)
		for(WebSocketSession ss : list) {
			WebSocketMessage<String> sendmsg =  new TextMessage(msg);
			ss.sendMessage(sendmsg); // 
		}
		System.out.println("사용자 송수신 = " + list.size());
	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	// 클라이언트 연결 해제
	public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
		list.remove(session);
		System.out.println("사용자삭제 = " + list.size());
	}

	@Override
	public boolean supportsPartialMessages() {
		// TODO Auto-generated method stub
		return false;
	}

}
