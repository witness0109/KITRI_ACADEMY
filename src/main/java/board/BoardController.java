package board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import annotation.springdi.EmpDAO;
import kitri.edu.mvc.EmpVO;

@Controller
public class BoardController {
	@Autowired
	BoardDAO dao;

	@RequestMapping(value = "/write.board", method = RequestMethod.GET)
	public ModelAndView writeBoard() {
		ModelAndView mav = new ModelAndView();
		// 구현하시오
		//
		// 1. model 없다
		// 2. board/writeform.jsp
		// (title, contents, writer, password 
		//입력 폼 : post - action= "/write.board")
		
		mav.setViewName("/board/writeform"); // 이름
		return mav;

	}

	@RequestMapping(value = "/write.board", method = RequestMethod.POST)
	public void writeBoard(BoardVO vo, HttpServletResponse response) throws IOException {
		
		// 구현하시오
		// 1. BoardVO : seq, title, contents, writer, time, password, viewcount
		// 2. BoardDAO : writeBoardSQL
		int result = dao.writeBoard(vo);
		if(result == 1) {
			
			
			
		} 
		// writeBoard(BoardVO vo) : board 테이블 insert
		response.sendRedirect("./list.board");
		// 3. model 없다
		// 4. board/list.jsp
		 // 이
		

	}

	@RequestMapping("/list.board")
	public ModelAndView getBoardList() {
		ModelAndView mav = new ModelAndView();
		// 구현하시오
		// 1. BoardVO :
		// 2. BoardDAO :
		// ArrayList<BoardVO> getBoardList() : board 테이블 모든 게시물 select
		// 3. model : BoardDAO-getBoardList() 리턴결과
		// 4. board/list.jsp
		// 번호 <a href = "/mvc/detail.board?seq=1" > 제목 </a> 작성자

		ArrayList<BoardVO> list = dao.getBoardList();
		mav.addObject("list", list); // 모델
		mav.setViewName("/board/list"); // 이름
		return mav;
	}

	@RequestMapping("/detail.board")
	public ModelAndView getBoardDetail(int seq) {
		ModelAndView mav = new ModelAndView();
		// 구현하시오
		BoardVO list = dao.getBoardDetail(seq);
		mav.addObject("list", list);
		mav.setViewName("/board/detail");
		// ArrayList<BoardVO> getBoardDetail(int seq) : seq 번호 board 게시물 1개 select
		// 3. model : BoardDAO-getBoardList() 리턴결과
		// 4. board/detail.jsp
		// 번호: 제목: 작성자: 작성시간: 조회수: 내용:
		return mav;
	}
}
