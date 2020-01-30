package kitri.edu.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //<annotation-driven/>
public class EmpController {

	/*
	 * String[] a = list.split(",");
	 * 
	 * String id = a[13];
	 */
	@Autowired
	EmpDAO dao;
	// <beans:bean 태그 생성 또는 @Component
	// <context:component-scan base-package="kitri.edu.mvc"/>
	@RequestMapping("/emp")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();

		ArrayList<EmpVO> list = dao.getEmpList();
		// StringBuffer result = new StringBuffer(); //
		/*
		 * for(int i=0; i<list.size(); i++) { result.append(list.get(i) + "\n");
		 * 
		 * }
		 */

		mav.addObject("list", list); // 모델
		// request.setAttribute("name", "글쓰기화면");
		mav.setViewName("emplist"); // 이름
		return mav;
	}

}
