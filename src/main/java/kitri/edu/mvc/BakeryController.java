package kitri.edu.mvc;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BakeryController {
	@Autowired
	BakeryDAO dao;

	@RequestMapping(value = "/store.bakery", method = RequestMethod.GET)
	public String storeForm() {
		// 베이커리이름, 가격, 수량, 이미지파일 업로드 폼
		System.out.println();
		return "storeform";
	}

	@RequestMapping(value = "/store.bakery", method = RequestMethod.POST)
	public ModelAndView storeResult(BakeryVO vo) throws IllegalStateException, IOException, InterruptedException {
		ModelAndView mav = new ModelAndView();
		// vo 변수명 = 요청 파라미터명 동일
		// 베이커리이름, 가격, 수량, 이미지파일
		// BakeryDAO 객체 시킬 것 bakery insert
		dao.insertBackery(vo);

		String uploadpath = "C:/web_workspace/spring1/src/main/webapp/resources/";
		// <img src="/mvc/resources/*.gif">
		// C:\web_workspace\spring1\src\main\webapp\resources

		String imgname = vo.getImg().getOriginalFilename();

		File real_file = new File(uploadpath + imgname);

		MultipartFile img = vo.getImg();
		// 파일 복사 : IOException
		img.transferTo(real_file);
		
		//3초 일시정지 - 파일 업로드할 시간 준다.
		Thread.sleep(3000);
		
		// 모델값 : 상품 등록 완료되었습니다.
		mav.addObject("model", "상품 등록완료되었습니다.");
		mav.setViewName("storeresult");
		return mav;

	}

}
