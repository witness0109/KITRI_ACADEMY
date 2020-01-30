package mybatis.spring;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpMybatisController {
	@Autowired
	EmpService service;

	@RequestMapping("/mybatis/emplist")
	// employees 모든 레코드 조회 - mybatis/emplist.jsp
	public ModelAndView getEmpList() {
		ModelAndView mav = new ModelAndView();

		List<EmpVO> list = service.getAllEmp();
		mav.addObject("emplist", list);

		mav.setViewName("mybatis/emplist");
		return mav;
	}

	@RequestMapping(value = "/mybatis/insertemp", method = RequestMethod.GET)
	public ModelAndView insertEmp() {
		ModelAndView mav = new ModelAndView();
		// 1. jobs 테이블 모든 job_id 조회 List<String>형태
		// ==> select job_id from jobs
		List<String> job_list = service.getJobId();
		// 2. "model", 1번결과
		mav.addObject("joblist", job_list);
		// 3. 뷰이름: mybatis/insertempform.jsp
		mav.setViewName("mybatis/insertemp");
		// 4. 리턴
		return mav;
		// 5. mybatis/insertempform.jsp
		// 사번, 성, 이름, 이메일, 직종코드 입력
		// 직종코드 <select> <option> 태그 미리 출력하여 선택

	}

	@RequestMapping(value = "/mybatis/insertemp", method = RequestMethod.POST)
	public String insertEmpProcess(EmpVO vo) {

		// 사번(not null, unique), 성, 이름, 이메일(unique), 직종코드(jobs 테이블 ) 입력
		// insert into employees(사번, 성, 이름, 이메일, 직종코드)
		service.insertEmp(vo);
		// values(////)

		// 뷰 : /mybatis/insertempsuccess.jsp

		return "/mybatis/insertsuccess";

	}

}
