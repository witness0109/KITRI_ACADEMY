package kitri.edu.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

	@RequestMapping("/hello.annotation") // @override 지움 / servlet-context에서 확인
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView();
		mav.addObject("model", "hello 메세지 / 어노테이션 설정중");
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
