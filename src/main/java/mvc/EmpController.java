package mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class EmpController implements Controller {

	/*
	 * String[] a = list.split(",");
	 * 
	 * String id = a[13];
	 */
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		EmpDAO dao = new EmpDAO();
		ArrayList<EmpVO> list = dao.getEmpList();
	//	StringBuffer result = new StringBuffer(); // 
		/*
		 * for(int i=0; i<list.size(); i++) { result.append(list.get(i) + "\n");
		 * 
		 * }
		 */
		
		mav.addObject("list", list); //모델
		//request.setAttribute("name", "글쓰기화면");
		mav.setViewName("emplist"); // 이름
		return mav;
	}

}
