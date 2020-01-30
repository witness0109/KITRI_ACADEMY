package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView();
		mav.addObject("model", "hello 메세지");
		mav.setViewName("hello");
		
		
		return mav;
	}

/*	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		//모델(뷰 출력 데이터) a모델 알려줌 ( "hello message" 문자열 )
		request.setAttribute("model", "hello message"); // ( 이름 , 전달할 데이터)
		
		//view 알려줌
		String jspname = "hello.jsp";
		return jspname;
	}*/

}
