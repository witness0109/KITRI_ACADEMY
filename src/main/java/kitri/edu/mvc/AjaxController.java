package kitri.edu.mvc;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class AjaxController {
	@Autowired
	BoardDAO dao;
	
	@RequestMapping(value = "/ajax/login", method = RequestMethod.GET)
	public String loginform() {
		return "ajax/loginform";
	}

	/*
	 * nonAjax시 사용
	 * 
	 * @RequestMapping(value="/ajax/login", method=RequestMethod.POST) public String
	 * loginResult(String id, String pw) { //id, pw : hr 입력 ModelAndView mav = new
	 * ModelAndView(); if(id.equalsIgnoreCase("hr") && pw.equalsIgnoreCase("hr")){
	 * mav.addObject("result", "정상 사용자입니다."); mav.addObject("logintime", new
	 * Date().toLocaleString()); } mav.setViewName("ajax/loginresult"); return
	 * "ajax/loginresult"; }
	 */

	// Ajax
	@RequestMapping(value = "/ajax/login", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	@ResponseBody
	public String loginResult(String id, String pw) {
		// 현재요청뷰 바디 포함 데이터
		if (id.equalsIgnoreCase("hr") && pw.equalsIgnoreCase("hr")) {
			String time = new Date().toLocaleString();
			return "{\"result\":\"ok\", \"logintime\": \""+ time +"\"}";
			// json은 모든 문자에 ""를 붙인다.
		}else {
			return "{\"result\":\"error\", \"logintime\": \"00-00-00\"}";
		}
	}
	
	
	// 정상 로그인일 경우
	// 아래쪽에 게시물 주세요라는 버튼 만들기
	@RequestMapping(value = "/ajax/boardlist", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@ResponseBody
	public ArrayList<BoardVO> getBoardlist() {
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		//list.add(new BoardVO(1, 값들 추가함);
		
		list = dao.getBoardList();
		
		return list;

	}
	
	@RequestMapping("/ajax/oneboard")
	@ResponseBody
	public BoardVO getOneBoard(int jaeyoung){
		BoardVO vo = new BoardVO();
		
		vo = dao.getBoardDetail(jaeyoung);
		
		//for(BoardVO vo : list) {
		// if(vo.getSeq() == seq ) {
		// return vo; }
		return vo;
	}

}
