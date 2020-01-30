package aoptest2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("board")
public class Board {
	public List getList() {
		System.out.println("운동 목록 가져옴");
		ArrayList<String> list = new ArrayList();
		list.add("바벨 뽑아~");
		list.add("드아운~~");
		list.add("으업");
		return list;
	}

	public void insert(int seq) {
		System.out.println(seq + "번째 운동 게시물");
	}

}
