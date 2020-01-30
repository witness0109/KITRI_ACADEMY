package kitri.edu.mvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

@Controller
public class LoginController {

	// @RequestMapping("/loginform")
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginform() {
		ModelAndView mav = new ModelAndView();
		// mav.addAllObjects(m); 화면만 보여주기에 모델전달할 필요없음
		mav.setViewName("loginform"); // loginform.jsp
		return mav;
	}

	/*
	 * //@RequestMapping("/loginresult")
	 * 
	 * @RequestMapping(value = "/login", method=RequestMethod.POST) public
	 * ModelAndView loginresult(
	 * 
	 * @RequestParam(value="id1", required = false, defaultValue = "kitri") String
	 * id, String pw) { // <input name = " id " / // 요청 파라미터 이름 = input 태그 name 속성값과
	 * 같은 이름 매개변수 선언 -> 자동으로 저장 //
	 * 
	 * 
	 * 
	 * 
	 * // ( HttpServletRequest request 매개변수 타입) / response는 필요없다. 화면 구성이 아니기에 test1
	 * : id, pw 입력 값 읽어와서 구현 String id = request.getParameter("id"); String pw =
	 * request.getParameter("pw");
	 * 
	 * 
	 * //test2 : String 타입 요청파라미터명 동일 이름 매개변수 System.out.println(id+":"+pw);
	 * ModelAndView mav = new ModelAndView(); mav.addObject("loginid", id); if
	 * (id.equals("hr")||id.equals("kitri")) { if (pw.equals("hr")) { // 정상로그인
	 * mav.addObject("result", "정상 로그인 사용자입니다."); } else { // 암호 다른경우
	 * mav.addObject("result", "암호를 확인해 주세요."); } } else { // 아이디 없는 경우
	 * mav.addObject("result", "없는 아이디 입니다."); }
	 * 
	 * mav.setViewName("loginresult"); // forward / request 그냥 넘아감 return mav; }
	 */

	// @RequestMapping("/loginresult")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginresult
	// test4
	(@ModelAttribute("model") LoginVO vo) {
		//요청파라미터변수들이름 = 멤버변수들 이름, 모델 저장
		ModelAndView mav = new ModelAndView();
		
		//3문장과 동일한 효과 
		//vo.setId(request.getParameter("id"));
		//vo.setPw(request.getParameter("pw"));
		//mav.addObject("model", vo); model.GETID()

		if (vo.getId().equals("hr") || vo.getId().equals("kitri")) {
			if (vo.getPw().equals("hr")) {
				// 정상로그인
				mav.addObject("result", "정상 로그인 사용자입니다.");
			} else {
				// 암호 다른경우
				mav.addObject("result", "암호를 확인해 주세요.");
			}
		} else {
			// 아이디 없는 경우
			mav.addObject("result", "없는 아이디 입니다.");
		}

		mav.setViewName("loginresult"); // forward / request 그냥 넘아감
		return mav;
	}
}
