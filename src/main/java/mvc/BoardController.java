package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class BoardController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "글쓰기 화면"); //모델
		//request.setAttribute("name", "글쓰기화면");
		mav.setViewName("boardwrite"); // 이름
		//return "boardwrite.jsp"
		return mav;
	} 

	/*
	 * @Override public String handleRequest(HttpServletRequest request,
	 * HttpServletResponse response) { request.setAttribute("name", "글쓰기화면"); // (
	 * 이름 , 전달할 데이터)
	 * 
	 * // view 알려줌
	 * 
	 * return "boardwrite.jsp"; }
	 */

}
