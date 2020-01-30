package kitri.edu.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController{

	@RequestMapping("/member.front")
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
