package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MemberController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView();
		//addObject 여러개 가능
		mav.addObject("inform", "회원 가입 후에 로그인 가능s");
		mav.addObject("id", "member");
		//setViewName 하나만 가능
		mav.setViewName("member");
		
		
		return mav;
	}

}
